package edu.spring.boot;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration 
public class MyWebMVCConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//현재 부트프로젝트 경로 src/main/resources/static 폴더 이미지들 원래 가능 
		
		registry.addResourceHandler("/upload/**").addResourceLocations("file:///c:/kdigital2/upload/"); 
		// c:/kdigital2/upload/폴더 안의 파일들을 가져다가 url upload로 작동시키겟다 (외부 경로를 브라우저에서 보여주기위해 사용하는 api)
	}
		
}
