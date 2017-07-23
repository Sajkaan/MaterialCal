package com.sajkaan.web.controller;

import com.sajkaan.message.Response;
import com.sajkaan.model.Part;
import com.sajkaan.model.Trailer;
import com.sajkaan.service.PartService;
import com.sajkaan.service.TrailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestWebController {

    @Autowired
    private PartService parts;

    @Autowired
    private TrailerService trailers;

    @RequestMapping(value = "/getAllParts", method = RequestMethod.GET)
    public Response getResource() {
        Response response = new Response("Done", parts);

        return response;
    }

    @RequestMapping(value = "newTrailer/postParts", method = RequestMethod.POST)
    public Response postPart(@RequestBody Part part) {

        parts.save(part);
        Response response = new Response("Done", part);

        return response;
    }

    @RequestMapping(value = "newTrailer/postTrailer", method = RequestMethod.POST)
    public Response postTrailer(@RequestBody Trailer trailer) {

        trailers.save(trailer);
        Response response = new Response("Done", trailer);

        return response;
    }

}
