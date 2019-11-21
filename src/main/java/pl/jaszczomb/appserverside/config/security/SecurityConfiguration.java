package pl.jaszczomb.appserverside.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected UserDetailsService userDetailsService() {
        UserDetails userDetails = User.withDefaultPasswordEncoder()
                .username("users")
                .password("user1")
                .roles("USERS")
                .build();

        UserDetails adminDetails = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin1")
                .roles("ADMIN")
                .build();


        return new InMemoryUserDetailsManager();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
//                .antMatchers(HttpMethod.GET, "/").permitAll()
                .antMatchers(HttpMethod.GET, "product/shop").permitAll()
                .antMatchers(HttpMethod.GET, "product/articles").permitAll()
                .antMatchers(HttpMethod.GET, "product/articles/**").permitAll()
                .antMatchers(HttpMethod.POST, "product/article").hasAnyRole("USERS", "ADMIN")
                .antMatchers(HttpMethod.POST, "product.sort").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "product.sorts").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "product.brand").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "product.brands").hasRole("ADMIN")
                .and()
                .formLogin().permitAll()
                .and()
                .logout().permitAll()
                .and()
                .csrf().disable();

    }
}
