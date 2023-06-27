package spring_A1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {

	public static void main(String[] args) {
		
		Resource res=new ClassPathResource("Mobile.xml");
		BeanFactory bf=new XmlBeanFactory(res);
		sim s1=(sim) bf.getBean("sim1");
		System.out.println(s1);
		Mobile mb=(Mobile) bf.getBean("mobile");
		System.out.println(mb);
		

	}

}
