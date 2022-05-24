import com.sun.tools.javac.Main;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Slf4j
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Component
    public class MyRunner implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {
            log.info("Enter word!");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            log.info(line);
        }
    }

}
