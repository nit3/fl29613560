package com.example.demo.controllers;

import com.example.demo.models.GenericResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    private final String message = "hi there!";

    @GetMapping("home")
    public String homePage(Model model) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "{\"name\" : \"Jone\"}";
        GenericResponse response = objectMapper.readValue(json, GenericResponse.class);
        model.addAttribute("response", response);
        return "index";
    }
}
