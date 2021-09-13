package edu.spring.boot;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	//http://localhost:9001/helloboot
	@RequestMapping("/helloboot")
	public ModelAndView hello() {
		System.out.println("컨트롤러 hello() 실행중");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("insa", "hello boot"); //모델1
		//helloboot에 insa(hello boot) 를 담아 hello.jsp 에서 출력
		ArrayList<String> list =new ArrayList<String> ();
		list.add("자바 프로그램 ");
		list.add("sql 프로그램 ");
		list.add("web server 프로그램 ");
		list.add("web client 프로그램 ");
		list.add("spring 프로그램 ");
		mv.addObject("list", list); //모델2
		
		return mv;
	}
	@ResponseBody
	@RequestMapping(value="/helloajax", method=RequestMethod.GET, produces = "application/json;charset=utf-8" )
	public ArrayList<String> hello2(){ //json데이터로 변환돼서 리턴
		ArrayList<String> list =new ArrayList<String> ();
		list.add("자바 프로그램 ");
		list.add("sql 프로그램 ");
		list.add("web server 프로그램 ");
		list.add("web client 프로그램 ");
		list.add("spring 프로그램 ");
		return list;
	}
	
	
}
