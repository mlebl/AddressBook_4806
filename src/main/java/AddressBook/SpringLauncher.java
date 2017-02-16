package AddressBook; /**
 * Created by mattleblanc on 1/26/2017.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLauncher {
    public static void main(String[] args) {
        String[] contextPaths = new String[]{"spring-config.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }
}
