import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ServiceImpl;

public class UserTest {


    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        ServiceImpl serviceImpl = applicationContext.getBean("serviceImpl", ServiceImpl.class);
        serviceImpl.user();


    }
}
