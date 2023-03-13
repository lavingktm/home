import com.ioc.config.AppConfig;
import com.ioc.controller.UseController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
//    @org.junit.jupiter.api.Test
//    public  void test01(){
//        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
//        UseController us=  applicationContext.getBean(UseController.class);
//        System.out.println( us.cal(8,2));
//
//    }
    @org.junit.jupiter.api.Test
    public void  test01(){
       ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring-config.xml");
       UseController useController= applicationContext.getBean(UseController.class);
        System.out.println( useController.cal(8,2));
    }
}
