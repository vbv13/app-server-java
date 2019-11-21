package pl.jaszczomb.appserverside.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import pl.jaszczomb.appserverside.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService userService;

    @Override
    protected UserDetailsService userDetailsService() {
        List<UserSecurity> userSecurities = userService.getUsers().stream()
                .map(UserSecurity::new)
                .collect(Collectors.toList());
        List<UserDetails> userDetailsList = new ArrayList<>();
        for (UserSecurity us : userSecurities) {
            UserDetails userDetails = User.withDefaultPasswordEncoder()
                .username(us.getUserMail())
                .password(us.getPassword())
                .roles(us.getRole())
                .build();
            userDetailsList.add(userDetails);
        }
        return new InMemoryUserDetailsManager(userDetailsList);
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
