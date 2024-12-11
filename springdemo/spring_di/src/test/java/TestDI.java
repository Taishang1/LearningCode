import com.itbaizhan.service.StudentService;
import com.itbaizhan.service.StudentService2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
    @Test
    public void testDI1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean1.xml");
        StudentService studentService = ac.getBean(StudentService.class);
        System.out.println(studentService.findStudentById(1));
    }

    @Test
    public void testDI2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean2.xml");
        StudentService2 studentService2 = ac.getBean(StudentService2.class);
        System.out.println(studentService2);
    }
}
