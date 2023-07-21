package JavaDay2;

public class Encapsulation {
	private String empName;
	private int empId;
	
	public String getEmpName()
	{return empName;}
	
	public int getEmpId()
	{return empId;}

	
	public void setEmpName(String empName)
	{empName=this.empName;}
	public void setEmpId(int empId)
	{
		empId=this.empId;
	}
	
}


class EncapMain{
	public static void main(String...ar)
	{Encapsulation en=new Encapsulation();
	en.setEmpId(1);
	en.setEmpName("robin");
	System.out.println("employee Name:"+en.getEmpName()+" employee ID:"+en.getEmpId());
	}
	
}