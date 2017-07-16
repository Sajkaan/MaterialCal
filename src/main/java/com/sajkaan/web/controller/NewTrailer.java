package com.sajkaan.web.controller;

import com.google.gson.JsonObject;
import com.sajkaan.model.Part;
import com.sajkaan.service.PartService;
import com.sajkaan.service.TrailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NewTrailer {

    @Autowired
    private TrailerService trailerService;

    @Autowired
    private PartService partService;


    @RequestMapping("/")
    public String home(Model model) {
        return "index";
    }

    @RequestMapping("/newTrailer")
    public String newTrailerAdding(Model model){

        if(!model.containsAttribute("part")) {
            model.addAttribute("part", new Part());
        }
        return "new";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String update() {

        return "index";
    }


}
