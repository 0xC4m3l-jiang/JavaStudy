import com.jiang.construct.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        // 当我们 利用 ClassPathXmlApplicationContext 找到对应的上下文文件后 因为 bean 就会创建对应的类
        // 测试发现我们 new ClassPathXmlApplicationContext 后 user 和 usert 的构造方法都被调用了
        ApplicationContext context = new ClassPathXmlApplicationContext("User.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
    }
}
