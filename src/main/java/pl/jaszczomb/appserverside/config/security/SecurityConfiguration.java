package pl.jaszczomb.appserverside.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import pl.jaszczomb.appserverside.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity//(debug = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Bean
    protected UserDetailsService userDetailsService() {
        return new UserDetailsServiceImpl();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailsService());
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(authenticationProvider());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "product/all").permitAll()
                .antMatchers(HttpMethod.GET, "product/shop").permitAll()
                .antMatchers(HttpMethod.GET, "product/articles").permitAll()
                .antMatchers(HttpMethod.GET, "product/articles/**").permitAll()
                .antMatchers(HttpMethod.POST, "product/article").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "product/sort").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "product/sorts").permitAll()
                .antMatchers(HttpMethod.POST, "product/brand").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "product/brands").permitAll()
                .antMatchers(HttpMethod.POST, "users/register").permitAll()
                .antMatchers(HttpMethod.POST, "users/login").permitAll()
                .antMatchers(HttpMethod.PUT, "users/uploadimage").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "users/removeimage").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "users/shoppingCart").hasRole("USER")
                .antMatchers(HttpMethod.POST, "users/addToCart/{productId}").hasRole("USER")
                .antMatchers(HttpMethod.POST, "users/removeFromCart/{productId}").hasRole("USER")
                .antMatchers(HttpMethod.POST, "users/successBuy").hasRole("USER")
//        http.authorizeRequests()
//                .anyRequest().authenticated()
                .and().httpBasic()
                .and().formLogin()
                .loginPage("/register_login").permitAll()
                .loginProcessingUrl("/perform_login")
                .defaultSuccessUrl("/user/dashboard", true)
                .failureUrl("/login.html?error=true")
                .and()
                .logout().permitAll()
                .logoutUrl("users/logout")
                .deleteCookies("JSESSIONID");;

    }

}
