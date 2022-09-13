package ddr.apirest.web.configuration;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig   {
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable());
        return http.build();
    }
	
	/*@Bean
	public FilterRegistrationBean filterRegistrationBean(){
	    FilterRegistrationBean registrationBean = new FilterRegistrationBean(new CORSFilter());
	    registrationBean.setName("CORS FIlter");
	    registrationBean.addUrlPatterns("/*");
	    registrationBean.setOrder(1);
	    return registrationBean;
	}*/
	
	@Bean
	public CorsFilter corsFilter() {
	UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	CorsConfiguration config = new CorsConfiguration();
	config.setAllowCredentials(true);
	config.addAllowedOrigin("*");
	config.addAllowedHeader("*");
	config.addAllowedMethod("OPTIONS");
	config.addAllowedMethod("GET");
	config.addAllowedMethod("POST");
	config.addAllowedMethod("PUT");
	config.addAllowedMethod("DELETE");
	source.registerCorsConfiguration("/**", config);
	return new CorsFilter(source);
	}
	

}
