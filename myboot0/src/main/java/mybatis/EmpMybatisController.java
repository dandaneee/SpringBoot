package mybatis;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpMybatisController {
	@Autowired
	EmpService service ; //원래 empservice를 전달받으려면 setservce(EmpService s){} 만들어야되는데 @Autowired로 불러온다
	
			//employee 전체목록 다 가져오는 sql(select*from employees) 만들어서 List<EmpVO>리턴
	
	@RequestMapping("/emplist") //"http://ip:port/multi/emplist"
	public ModelAndView emplist() {
		List<EmpVO> list = service.getEmpList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("emplist", list ); //model에 들어갈 데이터 생성
		mv.setViewName("/mybatis/emplist"); //view 생성
		return mv;
	}

	//1."/empdeptlist:get방식" checkbox 형태 10,20,30,..., 100  나열 복수개 선택 폼 보여주는 뷰 생성 메소드  -모델 없고 mybatis/empdeptform.jsp
	@RequestMapping(value="/empdeptlist" , method=RequestMethod.GET)
	public String empDeptForm() {
		return "/mybatis/empdeptform";
	}
	//2."empdeptlist:post방식" 1번 선택 요소 배열로 전달받아서 부서원의 이름, 부서코드, 급여 정보 모델= mybatis/empdeptlist.jsp
	@RequestMapping(value="/empdeptlist" , method=RequestMethod.POST)
	public ModelAndView empdeptlist(int [] dept_list ) {
		List<EmpVO> deptlist =service.empDeptList(dept_list) ;
 		ModelAndView mv = new ModelAndView();
 		mv.addObject("empdeptlist", deptlist);
 		mv.setViewName("/mybatis/empdeptlist");
 		return mv;
			
		
	}

		 	
		
	
	
	
}
