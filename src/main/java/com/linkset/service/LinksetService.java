package com.linkset.service;

import com.linkset.model.Link;
import com.linkset.model.Linkset;
import com.linkset.repository.LinksetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class LinksetService {

    @Autowired
    private LinksetRepository linksetRepository;
    private List<Link> links;

    public List<Link> getLinks(@PathVariable("linksetId") Long number)
    {
        return new ArrayList<Link>();
    }

}
