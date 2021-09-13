package mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Mapper  // 매퍼파일을 인식하려면 @MapperScan 필요하다
@Repository //
public interface EmpDAO {

	

	public List<EmpVO> emplist();
		//sql-mapping.xml 주석해제
		//메소드 이름을 session.xxx("emp.mapping 파일 id", xxx);
		//메소드 구현부 삭제
		//EmpService, EmpServiceImpl 주석해제 , dao 호출메소드 수정 
		//컨트롤러 /empdeptlist 주석 해제 후 실행 
	

	public EmpVO empone(int id) ;
	
	public void insertemp(EmpVO vo) ;
	
	public void updateemp(EmpVO vo);
	
	public void deleteemp(String name);
	
	public int cnt() ;
	
	public List<EmpVO> empdeptlist(int [] dept_list) ;
	
	
	
}//dao는 db에 직접 접근해서 session객체가 필요해서 필드변수로 sqlsession 선언, setter메소드로 받아오도록 한다.
