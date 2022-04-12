package springcoreq1;


//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("Springcoreq1.xml");
        
		
	
		Customer customer = (Customer) context.getBean("customer");
		customer.showDetails();
	
		
	}

}
