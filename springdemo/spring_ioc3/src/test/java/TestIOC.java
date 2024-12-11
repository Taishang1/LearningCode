import com.itbaizhan.SpringConfig;
import com.itbaizhan.dao.StudentDao;
import com.itbaizhan.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
    @Test
    public void t1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        StudentDao studentDao = ac.getBean(StudentDao.class);
        StudentDao studentDao = (StudentDao) ac.getBean("studentDao");
        System.out.println(studentDao);
    }

    @Test
    public void t2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        StudentDao studentDao = ac.getBean(StudentDao.class);
        StudentService studentService = ac.getBean(StudentService.class);
        StudentService studentService2 = ac.getBean(StudentService.class);
        System.out.println(studentDao);
        System.out.println(studentService);
        System.out.println(studentService2);
    }

    @Test
    public void t3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        StudentService studentService = ac.getBean(StudentService.class);
        System.out.println(studentService);
//        System.out.println(studentService.getStudentDao());
    }

    @Test
    public void t4(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentService studentService = ac.getBean(StudentService.class);
        System.out.println(studentService);
    }






}
