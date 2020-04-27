package com.markjr.currency.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.markjr.currency.entity.CurData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurService {

    public CurData getApi() throws JsonProcessingException {

        final String url = "http://data.fixer.io/api/latest?access_key=f569f69eba1f52cd12aead752531a0a1&symbols=USD,GBP,THB,JPY,HKD,MYR,SGD,BND,PHP,IDR,INR,CHF,AUD,NZD,CAD,SEK,DKK,NOK,CNY&format=1";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        CurData curData = objectMapper.readValue(result, CurData.class);
        return curData;
    }
}
