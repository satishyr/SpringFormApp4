package in.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nit.beans.PersonalProfile;

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext ctx=null;
		PersonalProfile pp=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("in/nit/cfgs/applicationContext.xml");
		//get  bean
		pp=ctx.getBean("pp",PersonalProfile.class);
		System.out.println(pp);
		
		//close container
		((AbstractApplicationContext) ctx).close();

    
    }
}
