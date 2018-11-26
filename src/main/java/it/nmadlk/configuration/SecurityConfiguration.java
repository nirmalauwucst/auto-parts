/**
 * 
 */
package it.nmadlk.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Navo
 *
 */

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		/**
		 * In Spring Security 4, it was possible to store passwords in plain text using in-memory authentication.
		 * In Spring Security 5 has introduced more secure default mechanism for encoding and decoding passwords.
		 * If your Spring application stores passwords in plain text, upgrading to Spring Security 5 may cause problems.
		 * If we use the same configuration(without a password encoder) under Spring Security 5, we’d get the following error:
		 * java.lang.IllegalArgumentException: There is no PasswordEncoder mapped for the id "null"
		 * 
		 * We can fix this the error by defining a DelegatingPasswordEncoder with the "PasswordEncoderFactories class".
		 * We use this encoder to configure our user with the AuthenticationManagerBuilder:
		 * 
		 * Now, with this configuration we’re storing our in-memory password using BCrypt in the following format:
		 * {bcrypt}$2a$10$MF7hYnWLeLT66gNccBgxaONZHbrSMjlUofkp50sSpBw2PJjUqU.zS
		 * Although we can define our own set of password encoders, 
		 * it’s recommended to stick with the default encoders provided in PasswordEncoderFactories.
		 */
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		
		auth.inMemoryAuthentication()
				.withUser("nmadlk").password(encoder.encode("123")).roles("USER").and()
				.withUser("nirmalauwucst").password(encoder.encode("abc")).roles("ADMIN");
		
	}
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity
			.authorizeRequests()
			.anyRequest()
			.fullyAuthenticated()
			.and().httpBasic();
		httpSecurity
			.csrf().disable();
		
	}

}
