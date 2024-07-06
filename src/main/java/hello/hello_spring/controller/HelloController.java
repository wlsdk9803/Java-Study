package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!"); // attributeName이 'data'이므로 resources/templates/hello.html의 ${data}에 "hello!!"가 들어간다.
        return "hello"; // 반환 값이 "hello"이므로 resources/templates의 'hello.html'을 찾아서 model을 넘겨준다. // 리턴값이 문자면 뷰 리졸버가 화면을 찾아서 처리
    }
}
