import com.jiang.set.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        // 获取 Spring 上下文对象。
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        // 获取 xml 中 bean 执行的对象。会先调用无参数够着，然后利用 set 注入
        HelloWorld helloWorld = (HelloWorld) context.getBean("hello");
        System.out.println(helloWorld.toString());
    }
}
