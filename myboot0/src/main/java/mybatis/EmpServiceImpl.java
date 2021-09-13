package mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service") //
public class EmpServiceImpl implements EmpService { 
		@Autowired //dao를 자동으로 주입해줘
		EmpDAO dao ;

		
	@Override
	public List<EmpVO> getEmpList() {
	 // dao 1개 메소드 : 몇명이나 잇는지 확인하고 싶다 : select count(*) from employees sql 실행 몇몇 사원 
		return dao.emplist(); //List<EmpVO> list =  dao.getEmpList();
	}
	
	@Override
	public EmpVO getEmpOne(int id) {
		return dao.empone(id); //여기서받은값을 dao한테 준다
	}

	@Override
	public void insertEmp(EmpVO vo) {
		//EmpVO RESULT= dao.insertemp(vo); //해당아이디를 가진 데이터 존재하는가 
		//if(RESULT ==null) {	dao.insertemp(vo); }
		dao.insertemp(vo);
	}

	@Override
	public void updateEmp(EmpVO vo) {
		dao.updateemp(vo);
		
	}

	@Override
	public void deleteEmp(String name) {
		name = "%" + name + "%" ;
		dao.deleteemp(name);
		
	}

	@Override
	public int countEmp() {
		return dao.cnt(); //main으로 리턴
	}

	@Override
	public List<EmpVO> empDeptList(int[] dept_list) {
		return dao.empdeptlist(dept_list);
	} 
	
	
	
	
	
} //기능을 정의하는 dao
