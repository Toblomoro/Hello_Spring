package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")//sets the path all other mapping with be at hello/
public class HelloController {
    //handles request at /localhost8080/hello
//now lives at hello/goodbye
    @GetMapping("goodbye")

    public String goodbye(){
        return "Goodbye, Spring!";
    }

    //create a handler that handles requests of the form /hello?name=LaunchCode
@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}) //How to ensure that it accepts get and post requests

    public  String helloWithQuery(@RequestParam String name){
        return "Hello, " + name +"!";
    }
//handler that handles requests of the form /hello/launchcode
@GetMapping("{name}")

    public String helloWithPathParam(@PathVariable String name){
return "Hello, "+ name +"!";
}
@GetMapping("form")

    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action= 'hello' method = 'post'>" +//submit a request to /hello
                "<input type = 'text' name='name'>" +
                "<input type = 'submit' value = 'Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
