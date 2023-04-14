package com.StringConcatAPI.StringConcatAPI.controller;

import com.StringConcatAPI.StringConcatAPI.service.StringApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @Autowired
    StringApiService service;
    @GetMapping(value = {"/{word1}/{word2}", "{word1}"})
    public String concatParams (
            @PathVariable (required = true, value = "word1") String word1
            , @PathVariable (required = false, value = "word2") String word2)
    {
        return service.stringConcatService(word1,word2);
    }




}
