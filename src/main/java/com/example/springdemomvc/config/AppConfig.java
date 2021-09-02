package com.example.springdemomvc.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
// EnableWebMvc поддерживает аннотации mvc, в xml файле это было <mvc:annotation-driven>
// Он также добавляет обработку классов Controller и RequestMapping
// @EnableWebMvc — эта аннотация разрешает нашему проекту использовать MVC;
@EnableWebMvc
@ComponentScan("com.example.springdemomvc")
public class AppConfig {

    // Добавляем компонент для распознавания нашего представления(view)
    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setPrefix("WEB-INF/view/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }
}
