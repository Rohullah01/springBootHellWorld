package Controller;

import org.springframework.web.bind.annotation.*;

//@RestController
@ControllerAdvice
public class MainController {

    //@RequestMapping(value = "helloWorld", method= RequestMethod.GET)
//    public String helloWorld(){
//        return "hello world";
//    }

    @GetMapping("/helloSpringBoot")
    public  String helloSprigBoot(){
    System.out.print("hell world");
        return "View/helloSpringBoot";
    }
}
