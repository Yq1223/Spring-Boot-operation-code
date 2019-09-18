import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "这是我的第一次代码！值得庆祝";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}