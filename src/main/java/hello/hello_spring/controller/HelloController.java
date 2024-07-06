package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!"); // attributeName이 'data'이므로 resources/templates/hello.html의 ${data}에 "hello!!"가 들어간다.
        return "hello"; // 반환 값이 "hello"이므로 resources/templates의 'hello.html'을 찾아서 model을 넘겨준다. // 리턴값이 문자면 뷰 리졸버가 화면을 찾아서 처리
    }

    @GetMapping("hello-mvc") // 아래의 RequestParam인 'name'을 전달하기 위해서는 '/hello-mvc?name=전달할 값' 이런 식으로 쓰면 된다.
    public String helloMvc(@RequestParam("name") String name, Model model){ // required의 default 값은 true. @RequestParam(name = "name", required = false) 이렇게 쓰면 false로 설정 가능
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody // http의 body에 해당 데이터를 직접 넣어주겠다눈 뜻 // 뷰가 따로 없다
    public String helloString(@RequestParam("name") String name){
        return "hello " + name;
    }
    // 위의 것을 쓸 일은 거의 없다.

    @GetMapping("hello-api")
    @ResponseBody // 이게 있으면 ViewResolver 대신 HttpMessageConverter가 작동한다. 반환값이 문자열이면 StringConverter가 문자열로, 객체면 JsonConverter가 json 형태로 반환!
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}
