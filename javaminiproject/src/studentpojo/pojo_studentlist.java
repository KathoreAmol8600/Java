package studentpojo;
import java.util.*;

public class pojo_studentlist {
	int id;
	String name;
	String cname;
	int totalfees;
	int duration;
	
	public void setId(int id) 
	{
		this.id=id;
	}
	public int getId() 
	{
		return id;
	}
	
	public void setName(String name) 
	{
		this.name=name;
	}
	public String getName() 
	{
		return name;
	}
	
	public void setCname(String cname) 
	{
		this.cname=cname;
	}
	
	public String getCname() 
	{
		return cname;
	}
	public void setTotalfees(int totalfees) 
	{
		this.totalfees=totalfees;
	}
	public int getTotalfees() 
	{
		return totalfees;
	}
	public void setDuration(int duration) 
	{
		this.duration=duration;
	}
	public int getDuration() 
	{
		return duration;
	}

}
