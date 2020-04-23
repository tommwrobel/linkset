package com.linkset.service;

import com.linkset.model.Link;
import com.linkset.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LinkService {

    @Autowired
    private LinkRepository linkRepository;

    public List<Link> getLinks(Long linksetId) {
        return linkRepository.findByLinksetId(linksetId);
    }

    public void addLink(Link link) {
        linkRepository.save(link);
    }
}
