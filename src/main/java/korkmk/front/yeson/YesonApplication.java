package korkmk.front.yeson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class YesonApplication {

    public static void main(String[] args) {
        SpringApplication.run(YesonApplication.class, args);
    }

}

