import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Start {
    public static void main(String[] data) {
        ApplicationContext context;
        context = new FileSystemXmlApplicationContext("active.xml");
        Team t = context.getBean("main", Team.class);
        String[] beans = context.getBeanDefinitionNames();
        for (int i = 0; i < beans.length; i++) {
            System.out.println(beans[i]);
        }
    }
}

class Team {
}