import com.jiang.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        People man = (People) context.getBean("man");
        man.getCat().shout();
        man.getDog().shout();

    }
}
