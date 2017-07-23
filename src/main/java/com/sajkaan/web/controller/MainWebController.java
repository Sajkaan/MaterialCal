package com.sajkaan.web.controller;


import com.sajkaan.model.Part;
import com.sajkaan.service.PartService;
import com.sajkaan.service.TrailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainWebController {

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
        return "new";
    }

    @RequestMapping("/findTrailer")
    public String findTrailer(Model model) {

        return "find";
    }

    @RequestMapping("/editTrailer")
    public String editTrailer(Model model) {
        return "edit";
    }

    @RequestMapping("/deleteTrailer")
    public String deleteTrailer(Model model) {
        return "delete";
    }



}
