package peaksoft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greeting")

public class FirstController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/bye")
    public String bye() {
        return "bye";
    }
    @GetMapping("pluto")
    public String pluto(){
        return "pluto";
    }
    @GetMapping("jupiter")
    public String jupiter(){
        return "jupiter";
    }



}

