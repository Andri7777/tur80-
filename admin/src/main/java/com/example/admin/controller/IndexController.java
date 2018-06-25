package com.example.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/public")
public class IndexController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }



    @GetMapping("/{root}/{page}/index")
    public String getPageDeep(@PathVariable String root,
                              @PathVariable String page) {
        //WebMvcAutoConfiguration
        return root+"/"+page + "/index";
    }
}
