package io.kubesphere.devops;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Hello world!
 */
@RestController
@EnableAutoConfiguration
public class HelloWorldController {

    @GetMapping("/")
    public String sayHello() {
        return "Really appreciate your star, that's the power of our life. v1";
    }
    
    @RequestMapping("/user")
    public String getUserInfo() {
        return "userInfo:vincentzou";
    }
}
