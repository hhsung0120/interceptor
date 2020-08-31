package com.heeseong.interceptor.configuration;

import com.heeseong.interceptor.interceptor.AdminInterceptor;
import com.heeseong.interceptor.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@Configuration
public class CustomWebMvcConfigurer extends WebMvcConfigurationSupport {

	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new AdminInterceptor())
				.addPathPatterns("/admin/**")
				.excludePathPatterns("/admin/myPage");

		registry.addInterceptor(new UserInterceptor())
				.addPathPatterns("/user/?")
				.addPathPatterns("/user/*")
				.addPathPatterns("/user/**");
	}
}
