package first.springframework;

import first.springframework.controllers.ConstructorInjectedController;
import first.springframework.controllers.GetterInjectedController;
import first.springframework.controllers.MyController;
import first.springframework.controllers.PropertyInjectedController;
import first.springframework.examplebeans.FakeDataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);
        
        System.out.println(fakeDataSource.getUser());
    }

}
