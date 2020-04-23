package com.linkset.controller;

import com.linkset.model.Linkset;
import com.linkset.service.LinksetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class LinksetController {

    @Autowired
    private LinksetService linksetService;

    @GetMapping("/linkset/{id}")
    public String getLinkset(@PathVariable("id") Long id, Model model) {
        Optional<Linkset> optLinkset = linksetService.getLinksetById(id);

        if(optLinkset.isPresent()) {
            model.addAttribute("linkset", optLinkset.get());
            model.addAttribute("links", linksetService.getLinks(id));
            return "linkset";
        } else {
            return "linkset-error";
        }
    }

    @GetMapping("/linkset/new")
    public String newLinkset() {
        return "linkset-new";
    }

}
