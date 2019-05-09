package struts.interceptor;

import java.util.*;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {

   public String intercept(ActionInvocation invocation)throws Exception{

      /* let us do some pre-processing */
      String output = "Pre-Processing"; 
      System.out.println(output);
      
      
      /*
       * ActionInvocation都会查询其状态，并执行下一个拦截器。
       * 当所有配置的拦截器都被调用时，invoke()将使得action本身被执行
       */
      
      /* let us call action or next interceptor */
      String result = invocation.invoke();

      /* let us do some post-processing */
      output = "Post-Processing"; 
      System.out.println(output);

      return result;
   }
}