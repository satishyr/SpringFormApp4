package in.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.nit.beans.PersonalProfile;

public class TestWithBeanFactory {

	public static void main(String[] args) {

		
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		PersonalProfile pp=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/nit/cfgs/applicationContext.xml");
		//get  bean
		pp=factory.getBean("pp",PersonalProfile.class);
		System.out.println(pp);
		
		
	}

}
