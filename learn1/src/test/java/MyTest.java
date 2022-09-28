import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.pdai.spring.entity.User;
import tech.pdai.spring.service.UserServiceImpl;

import java.util.List;

public class MyTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        UserServiceImpl bean = applicationContext.getBean(UserServiceImpl.class);
        List<User> list = bean.list();
        System.out.println(list);
    }
}
