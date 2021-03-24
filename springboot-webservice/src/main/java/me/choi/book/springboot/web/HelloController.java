package me.choi.book.springboot.web;

import me.choi.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project : springboot-webservice
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:02 오후
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {

        return new HelloResponseDto(name, amount);
    }
}
