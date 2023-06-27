package spring_A12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
//		Resource res=new ClassPathResource("newmobile.xml");
//		BeanFactory bf=new XmlBeanFactory(res);
//		Sim s=(Sim) bf.getBean("sim1");
//		System.out.println(s);
//		
//		Mobile mb=(Mobile) bf.getBean("mobile");
//	-	System.out.println(mb);
		
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("newmobile.xml");
		Sim sim=(Sim) applicationcontext.getBean("sim1");
		System.out.println(sim);
		Mobile mb=(Mobile) applicationcontext.getBean("mobile");
		System.out.println(mb);
	}

}
