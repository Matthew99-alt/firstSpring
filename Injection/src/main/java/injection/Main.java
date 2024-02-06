package injection;

import injection.service.FirstFunc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);

        FirstFunc firstFunc = context.getBean(FirstFunc.class);
        firstFunc.books("Lady Macbeth Of Mtsensk District", "Nikolai Leskov");
    }
}
