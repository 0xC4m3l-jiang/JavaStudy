import com.jiang.service.UserService;
import com.jiang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
        // 动态代理代理的是 接口。返回是 UserService 接口类。
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
