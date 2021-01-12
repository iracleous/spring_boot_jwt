package gr.codehub.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    // in header key -> Value
    //          [{"key":"Authorization","value":"Bearer xxx","description":""}]


    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }

}