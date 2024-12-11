import com.itbaizhan.dao.StudentDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestContainer {
    @Test
    public void t1(){
        // 创建容器
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext ac = new FileSystemXmlApplicationContext("E:\\spring\\springdemo\\spring_ioc2\\src\\main\\resources\\bean.xml");
        // 从容器中获取对象
        StudentDao studentDao1 = (StudentDao) ac.getBean("studentDao");
        StudentDao studentDao2 = (StudentDao) ac.getBean("studentDao");
        System.out.println(studentDao1.hashCode());
        System.out.println(studentDao2.hashCode());
        System.out.println(studentDao1.findById(1));
    }

    @Test
    public void t2(){
        // 创建容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean1.xml");
        // 从容器中获取对象
        StudentDao studentDao1 = (StudentDao) ac.getBean("studentDao");
        StudentDao studentDao2 = (StudentDao) ac.getBean("studentDao");
        System.out.println(studentDao1.hashCode());
        System.out.println(studentDao2.hashCode());
    }

    @Test
    public void t3(){
        // 创建容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean1.xml");
        // 从容器中获取对象
        StudentDao studentDao1 = (StudentDao) ac.getBean("studentDao");
        // 销毁容器
        ac.close();
    }

    @Test
    public void t4(){
        // 创建容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean2.xml");
        // 通过id/name属性获取对象
//        StudentDao studentDao1 = (StudentDao) ac.getBean("studentDao");
        // 通过类型获取对象
//        StudentDao studentDao1 = ac.getBean(StudentDao.class);
        // 通过类型+id/name获取对象
        StudentDao studentDao1 = ac.getBean("studentDao",StudentDao.class);
        System.out.println(studentDao1);
    }
}
