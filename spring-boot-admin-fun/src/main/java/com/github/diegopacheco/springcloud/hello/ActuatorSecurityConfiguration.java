package com.github.diegopacheco.springcloud.hello;

//@Configuration
//@Order(99) 
public class ActuatorSecurityConfiguration /*extends WebSecurityConfigurerAdapter { */ { 
//    
//	@Value("${security.user.name}")
//    private String username;
//    
//	@Value("${security.user.password}")
//    private String password;
//    
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername(username).password(password).roles("ACTUATOR","ADMIN").build());
//        http.antMatcher("/manage/**").authorizeRequests().anyRequest().hasRole("ACTUATOR").and().httpBasic().and().userDetailsService(manager);
//    }
}
