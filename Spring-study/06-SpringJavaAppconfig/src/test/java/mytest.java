import com.jiang.config.jiangConfig;
import com.jiang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mytest {
    @Test
    public void test1(){
        // 因为 用的是 config 没有利用 xml 文件，这里只能通过 AnnotaionConfig 上下文来获取容器
        ApplicationContext context = new AnnotationConfigApplicationContext(jiangConfig.class);
        User getuser = (User) context.getBean("User");
        System.out.println(getuser.getName());
    }
}
