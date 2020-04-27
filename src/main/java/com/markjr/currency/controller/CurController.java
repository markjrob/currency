package com.markjr.currency.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.markjr.currency.entity.CurData;
import com.markjr.currency.entity.Rate;
import com.markjr.currency.service.CurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CurController {

    @Autowired
    private CurService curService;

    @GetMapping("/")
    public String callApi(Model model) throws JsonProcessingException {
        CurData curData = curService.getApi();
        Rate rate = curData.getRates();
        model.addAttribute(rate);
        return "index";
    }
}
