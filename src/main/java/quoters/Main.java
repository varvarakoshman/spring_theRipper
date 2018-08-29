package quoters;

import lombok.SneakyThrows;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    @SneakyThrows
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        while(true){
            Thread.sleep(100);
            context.getBean(Quoter.class).sayQuote();
        }
    }
}
