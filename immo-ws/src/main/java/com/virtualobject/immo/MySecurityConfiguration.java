package com.virtualobject.immo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@ComponentScan
public class MySecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication()
                .withUser("eric").password("password").roles("USER");
    }

    public void configure(AuthenticationManagerBuilder auth) throws Exception {
    	auth.inMemoryAuthentication()
        .withUser("eric").password("password").roles("USER");
    }
    
    
    @Override
    public void configure(HttpSecurity http){
	
    	 try {

    		 http.authorizeRequests().antMatchers("/").permitAll().anyRequest().anonymous()
    		 .and()
    		 .authorizeRequests().antMatchers("/client/**").permitAll().anyRequest().authenticated()
    		 .and()
    		 .formLogin()
//decommenter et fournir une page d'authentification custom
//		     .loginPage("/login")
		     .permitAll()
		     .and()
		     .logout()                                    
		     .permitAll();

    		 
    		 http.csrf().disable();
    		 
		} catch (Exception e) {
			e.printStackTrace();
		}

    }
}
