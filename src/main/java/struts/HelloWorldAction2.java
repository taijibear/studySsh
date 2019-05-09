package struts;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction2  extends ActionSupport  {
	
	
	   private String name;

	   public String execute() throws Exception {
		  
		   System.out.println("Inside action....");
		   
	      if ("SECRET".equals(name))
	      {
	         return SUCCESS;
	      }else{
	         return ERROR;  
	      }
	   }
	   
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
	

}
