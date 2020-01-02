package guru.springframework.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(){

        System.out.println("Some message to sau... 1234dsc ");
        return "index";

    }
}
