package first.springframework;

import first.springframework.controllers.MyController;
import first.springframework.examplebeans.FakeDataSource;
import first.springframework.examplebeans.FakeJmsBroker;

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

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) context.getBean(FakeJmsBroker.class);

        System.out.println(fakeJmsBroker.getPassword());
    }

}
