package com.example.exintermediatesearchclothes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.exintermediatesearchclothes.model.Clothes;
import com.example.exintermediatesearchclothes.repository.SearchClothesRepository;

@Service
@Transactional
public class SearchClothesService {
    @Autowired
    private SearchClothesRepository searchClothesRepository;

    public List<Clothes> searchClothes(Integer gender, String color) {
        List<Clothes> filteredClothes = searchClothesRepository.searchClothes(gender, color);
        return filteredClothes;
    }
}
