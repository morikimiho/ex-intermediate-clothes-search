package com.example.exintermediatesearchclothes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.exintermediatesearchclothes.form.ColorForm;
import com.example.exintermediatesearchclothes.form.GenderForm;
import com.example.exintermediatesearchclothes.model.Clothes;
import com.example.exintermediatesearchclothes.repository.SearchClothesRepository;

@Service
@Transactional
public class SearchClothesService {
    @Autowired
    private SearchClothesRepository searchClothesRepository;

    public List<Clothes> searchClothes(GenderForm genderForm, ColorForm colorForm) {
        List<Clothes> filteredClothes = searchClothesRepository.searchClothes(genderForm.getGender(), colorForm.getColor());
        return filteredClothes;
    }
}
