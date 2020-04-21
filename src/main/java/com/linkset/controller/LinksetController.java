package com.linkset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LinksetController {

    @GetMapping("/new_linkset")
    public String newLinkset() {
        return "newLinkset";
    }

}
