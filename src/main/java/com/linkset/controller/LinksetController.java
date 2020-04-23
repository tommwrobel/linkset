package com.linkset.controller;

import com.linkset.model.Link;
import com.linkset.model.Linkset;
import com.linkset.service.LinkService;
import com.linkset.service.LinksetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class LinksetController {

    @Autowired
    private LinksetService linksetService;
    @Autowired
    private LinkService linkService;

    @GetMapping("/linkset/{id}")
    public String getLinkset(@PathVariable("id") Long id, Model model) {
        Optional<Linkset> optLinkset = linksetService.getLinksetById(id);

        if (optLinkset.isPresent()) {
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

    @PostMapping("/linkset/new")
    public String submitNewLinkset(@RequestParam("linksetName") String linksetName,
                                   @RequestParam("linkName") List<String> linkNames,
                                   @RequestParam("linkHref") List<String> linkHrefs,
                                   @RequestParam("linkDescription") List<String> linkDescriptions,
                                   Model model) {

        Linkset newLinkset = new Linkset(linksetName);
        linksetService.addLinkset(newLinkset);

        for(int i = 0; i < linkNames.size(); i++)
        {
            Link newLink = new Link(newLinkset.getId(), linkNames.get(i), linkHrefs.get(i), linkDescriptions.get(i));
            linkService.addLink(newLink);
        }

        model.addAttribute("linksetId", newLinkset.getId());

        return "linkset-new-success";
    }

}
