package com.sajkaan.controller;

import com.sajkaan.service.PartService;
import com.sajkaan.service.TrailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewTrailer {

    @Autowired
    private TrailerService trailerService;

    @Autowired
    private PartService partService;

    @RequestMapping("/newTrailer")
    public String newTrailerAdding(Model model){

        return "new";
    }

}
