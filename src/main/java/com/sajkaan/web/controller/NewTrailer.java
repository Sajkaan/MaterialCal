package com.sajkaan.web.controller;

import com.sajkaan.model.Part;
import com.sajkaan.service.PartService;
import com.sajkaan.service.TrailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

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

        model.addAttribute("part", partService.findAll());

        if(!model.containsAttribute("part")) {
            model.addAttribute("part", new Part());
        }
        return "new";
    }

    @RequestMapping(value = "/newTrailer", method = RequestMethod.POST)
    public String addPart(@Valid Part part, BindingResult result) {

        if (result.hasErrors()) {
            return "redirect:/newTrailer";
        }

        partService.save(part);

        Part oa = partService.findOne(part.getId());

        return "redirect:/newTrailer";
    }

}
