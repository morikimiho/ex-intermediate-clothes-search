package com.example.exintermediatesearchclothes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.exintermediatesearchclothes.form.ColorForm;
import com.example.exintermediatesearchclothes.form.GenderForm;
import com.example.exintermediatesearchclothes.model.Clothes;
import com.example.exintermediatesearchclothes.service.SearchClothesService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping({"", "/"})
public class SearchClothesController {
    @Autowired SearchClothesService searchClothesService;

    @Autowired HttpSession session;

    @GetMapping("/")
    public String index() {
        return "search/clothes";
    }

    @PostMapping("/submit-clothes")
    public String submitClothes(GenderForm genderForm, ColorForm colorForm) {
        List<Clothes> filteredClothes = searchClothesService.searchClothes(genderForm.getGender(), colorForm.getColor());

        System.out.println(filteredClothes);
        session.setAttribute("filteredClothes", filteredClothes);

        return "redirect:/";
    }
}
