import com.itbaizhan.Container;
import com.itbaizhan.service.StudentService;

public class Test {
    public static void main(String[] args) {
        StudentService studentService = (StudentService) Container.getBean("studentService");
        System.out.println(studentService.findStudentById(1));
        System.out.println(studentService.findStudentById(1));
    }
}
