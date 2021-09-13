package mybatis;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) throws IOException {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring/mybatis/spring-mybatis.xml"); //xml에서 지금까지 설정한거 읽어와 
		
		// <bean 만든거나 @com... 전부다 bean이다 --> service란 이름의 bean가져와(serviceimpl)
			EmpService service = factory.getBean("service", EmpService.class); 
		
		
		int cnt = service.countEmp();
		System.out.println("총 사원수 = " + cnt );
		
		
		System.out.println("===============");
		int[] dept_list = {10, 50, 80} ;
		List<EmpVO> list =service.empDeptList(dept_list);
		for(EmpVO vo : list) {
			System.out.println(vo.getFirst_name() + ":" + vo.department_id);
		}
		
	}
	
	
	
}





/*	 전체 목록
List<EmpVO> list =service.getEmpList();
for(EmpVO vo :list) {
System.out.println(vo.getEmployee_id()+ ":" + vo.getFirst_name() + ":" + vo.getHire_date() + ":" + vo.getSalary());
}
*/
/* 특정 id 조사
System.out.println("=========================================================");
EmpVO vo = service.getEmpOne(123);
System.out.println(vo.getEmployee_id()+ ":" + vo.getFirst_name() + ":" + vo.getHire_date() + ":" + vo.getSalary());
*/
	
//사번 , first_name , last_name , email , phonenumber , hire_Date(오늘) , job_id(it_prog)

/* insert unique 중복되면 안댐 (메일 중복되면 안댐)
EmpVO vo = new EmpVO();
vo.setEmployee_id(302);
vo.setFirst_name("길도");
vo.setLast_name("홍");
vo.setEmail("hong1@a.com");
vo.setPhone_number("010.123.4567");
vo.setJob_id("IT_PROG");

//vo를 전달해라
service.insertEmp(vo); //vo의 정보를 db로 insert 
*/

/*  update
EmpVO vo = new EmpVO();
vo.setEmployee_id(301);
vo.setLast_name("김");
vo.setDepartment_id(50);
service.updateEmp(vo);
System.out.println("완료");  
*/ 

/*   delete (departmentid 바뀌면 연관돼서 지울수 없다)
service.deleteEmp("홍"); // 부서 변경한 사원은 job_history 테이블 참조 관리 
System.out.println("완료");
*/








