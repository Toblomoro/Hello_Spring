package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Chris Bay
 */
@Controller
@ResponseBody
@RequestMapping("hello") //Should begin with /hello
public class HelloController {

//        // Handle request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
//lives at hello/goodbye
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
//lives at /hello/hello
    public String helloWithQueryParam(@RequestParam  String name, @RequestParam  String lg) {
        if (lg == "French") {
            return "Bon Jour " + name + "!";
        } else if (lg == "English") {
            return "Hello, " + name + "!";
        } else if (lg == "Greek") {
            return "Χαίρετε, " + name + "!";
        } else if (lg == "Spanish") {
            return "Hola, " + name + "!";
        } else if (lg == "Cowboy") {
            return "Howdy, " + name + "!";
        } else if (lg == "Klingon") {
            return "nuqneH, " + name + "!";
        } else if (lg == "Elvish") {
            return "S Suilad, " + name + "!";
        } else {
            return "You didnt choose a language.";
        }

    }


    // Handles requests of the form /hello/LaunchCode
//    @GetMapping("{name}")
//
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }
//    public static String createMessage(String n, String lg) {
//        String greeting = "";
//
//        if (lg.equals("english")) {
//            greeting = "Hello";
//        }
//        else if (lg.equals("french")) {
//            greeting = "Bonjour";
//        }
//        else if (lg.equals("italian")) {
//            greeting = "Bonjourno";
//        }
//        else if (lg.equals("spanish")) {
//            greeting = "Hola";
//        }
//        else if (lg.equals("german")) {
//            greeting = "Hallo";
//        }
//
//        return greeting + " " + n;
//    }

    @GetMapping("form")
//lives at /hello/form
    public  String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action = 'hello' method = 'post'>" + // submit request to hello
                "<input type = 'text' name = 'name'>" +
                "<label for = 'lg'> Language </label>" +
                "<select name = 'lg' id = 'lg'"+
                "<option value = 'blank'> </option>" +
                "<optgroup label=\"Real Languages\">" +
                "<option value = 'lg'> French </option>" +
                "<option value = 'lg'> English </option>" +
                "<option value = 'Grk'> Greek </option>" +
                "<option value = 'Sp'> Spanish </option>" +
                "</optgroup>" +
                "<optgroup label=\"Obscure Languages\">" +
                "<option value = 'Cwby'> Cowboy </option>" +
                "<option value = 'Klng'> Klingon </option>" +
                "<option value = 'Elf'> Elvish </option>" +
                "</select>" +
                "<input type = 'submit' value = 'Greet me!'>" +
                "<form>" +
                "<body>" +
                "<html>";



    }



}
