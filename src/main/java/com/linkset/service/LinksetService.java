package com.linkset.service;

import com.linkset.model.Link;
import com.linkset.model.Linkset;
import com.linkset.repository.LinkRepository;
import com.linkset.repository.LinksetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class LinksetService {

    @Autowired
    private LinksetRepository linksetRepository;
    @Autowired
    private LinkRepository linkRepository;
    private List<Link> links;

    public List<Linkset> getLinksets(@PathVariable("linksetId") Long number) {
        return (List<Linkset>) linksetRepository.findAll();
    }

    public Optional<Linkset> getLinksetById(Long id) {
        return linksetRepository.findById(id);
    }

    public void addLinkset(Linkset linkset) {
        linksetRepository.save(linkset);
    }

    public void updateLinkset(Linkset linkset) {
        linksetRepository.save(linkset);
    }

    public void deleteLinkset(Long id) {
        linksetRepository.deleteById(id);
    }

    public List<Link> getLinks(Long id) {
        return linkRepository.findByLinksetId(id);
    }
}
