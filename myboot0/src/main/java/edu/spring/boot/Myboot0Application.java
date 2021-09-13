package edu.spring.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import mybatis.EmpDAO;
import mybatis.EmpMybatisController;
import upload.UploadController;
import upload.UploadDAO;

@SpringBootApplication
@ComponentScan(basePackageClasses = EmpMybatisController.class)
@ComponentScan(basePackageClasses = UploadController.class) //uploadcontroller가 어딧는지 찾아주는 scan해서 찾아라, upload패키지의 컨트롤러만 인식한다
@ComponentScan //()이 없으면 edu.spring.boot 패키지(현재 패키지)의 컨트롤러 인식
@MapperScan(basePackageClasses = EmpDAO.class) //empdao클래스에서 메퍼 스캔해와 
@MapperScan(basePackageClasses = UploadDAO.class)
public class Myboot0Application {

	public static void main(String[] args) {
		SpringApplication.run(Myboot0Application.class, args); //나자신을 실행해
		System.out.println("부트 실행중");
	}

}
