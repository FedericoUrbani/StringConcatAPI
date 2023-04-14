package com.StringConcatAPI.StringConcatAPI.service;

import org.springframework.stereotype.Service;

@Service
public class StringApiService {

    public String stringConcatService(String word1, String word2){
        return word2 == null ?  word1 : word1.concat(word2);
    }

}
