
package com.noman.doctorshouse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author Noman Ibrahim
 */
@Configuration
@ComponentScan(basePackages = {"com.noman"})
@EnableWebMvc
public class webjar extends WebMvcConfigurerAdapter{
    
     /**
     * It handles  the static resources. Because the spring does not allow to access static resource directly. 
     * @param registry 
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        
        registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars");
    }
  
    
}
