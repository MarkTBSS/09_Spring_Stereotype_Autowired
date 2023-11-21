import org.springframework.context.support.GenericApplicationContext;

public class Start {
    public static void main(String[] data) {
        GenericApplicationContext context;
        context = new GenericApplicationContext();
        context.registerBean("a", Cashier.class);
        context.registerBean("b", Cashier.class);
        context.registerBean("c", User.class);
        context.refresh();

        Cashier x = context.getBean("b", Cashier.class);
        x.name = "Jeff B";
        x.location = "Front Desk";
        System.out.println(x); // Cashier@12340000

        String[] beans = context.getBeanDefinitionNames();
        for (int i = 0; i < beans.length; i++) {
            System.out.println(beans[i]);
        }
        Cashier w = context.getBean("b", Cashier.class);
        System.out.println(w); // Cashier@12340000
        System.out.println(w.name); // Jeff B
        context.close();
    }
}

class Cashier {
    String name;
    String location;
}

class Player {
}

class User {
}