package com.personal.pswmanage.auth.config;

import com.personal.pswmanage.constants.MediaTypes;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	public void configureContentTypes(ContentNegotiationConfigurer configure) {
		MediaTypes mediaType = new MediaTypes();
		configure
			.ignoreAcceptHeader(false)
			.defaultContentType(MediaType.TEXT_HTML)
			.mediaTypes(mediaType.getMediaTypes());
	}
	
	public void addDefaultViews(ViewControllerRegistry reg) {
		reg.addViewController("/").setViewName("login");
		reg.addViewController("/login").setViewName("login");
		reg.addViewController("/home").setViewName("home");
	}
}
