import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloWorld1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHelloWorld1.getMessage());

        HelloWorld beanHelloWorld2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHelloWorld2.getMessage());

        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat1.getName());

        Cat beanCat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat2.getName());

        System.out.println(beanHelloWorld1 == beanHelloWorld2);
        System.out.println(beanCat1 == beanCat2);
    }
}