package mybatis;

import org.springframework.stereotype.Component;

//@Component
public class EmpVO {
	//employees 테이블에있는 컬럼들을 변수로 지정해서 = 1개의 레코드를 나타내도록
	int employee_id;
	String first_name, last_name, email, phone_number, hire_date, job_id;
	double salary, commision_pct;
	int manager_id, department_id;
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommision_pct() {
		return commision_pct;
	}
	public void setCommision_pct(double commision_pct) {
		this.commision_pct = commision_pct;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	
	 /* EMPLOYEE_ID                               NOT NULL NUMBER(6)
	 FIRST_NAME                                         VARCHAR2(20)
	 LAST_NAME                                 NOT NULL VARCHAR2(25)
	 EMAIL                                     NOT NULL VARCHAR2(25)
	 PHONE_NUMBER                                       VARCHAR2(20)
	 HIRE_DATE                                 NOT NULL DATE
	 JOB_ID                                    NOT NULL VARCHAR2(10)
	 SALARY                                             NUMBER(8,2)
	 COMMISSION_PCT                                     NUMBER(2,2)
	 MANAGER_ID                                         NUMBER(6)
	 DEPARTMENT_ID                                      NUMBER(4) */

	
}
