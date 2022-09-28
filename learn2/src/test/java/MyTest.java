import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.pdai.spring.config.Config;
import tech.pdai.spring.entity.User;
import tech.pdai.spring.service.UserServiceImpl;

import java.util.List;

public class MyTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        List<User> list = userService.list();
        System.out.println(list);
    }
}
