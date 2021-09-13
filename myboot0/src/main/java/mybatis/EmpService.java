package mybatis;

import java.util.List;

public interface EmpService {
	public List<EmpVO> getEmpList(); //전체 목록,
	public EmpVO getEmpOne(int id); //int id 매개변수 , 해당id 하나만 가져온다
	public void insertEmp(EmpVO vo);
	public void updateEmp(EmpVO vo);
	public void deleteEmp(String name);
	public int countEmp();
	public List<EmpVO> empDeptList(int [] dept_list); 
}
