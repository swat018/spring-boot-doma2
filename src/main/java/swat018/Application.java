package swat018;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


// @Configuration, @EnableAutoConfiguration, @ComponentScan을 지정한 것과 동일
@SpringBootApplication(scanBasePackageClasses = {ComponentScanBasePackage.class})
//@EnableAutoConfiguration
@RestController // 원래 컨트롤러에 작성할 애너테이션
public class Application {
    @RequestMapping("/") // 원래 컨트롤러에 작성할 메소드
    public String hello() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
