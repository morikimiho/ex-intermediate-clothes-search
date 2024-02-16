package com.example.exintermediatesearchclothes.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.exintermediatesearchclothes.model.Clothes;

@Repository
public class SearchClothesRepository {
    private static final String SEARCH_CLOTHES = """
            SELECT
                id,
                category,
                genre,
                gender,
                color,
                price,
                size
            FROM
                clothes
            WHERE
                gender = :gender
            AND
                color = :color;
        """;

    private static final RowMapper<Clothes> RESULT_ROW_MAPPER = new BeanPropertyRowMapper<>(Clothes.class);

    @Autowired
    private NamedParameterJdbcTemplate template;

    public List<Clothes> searchClothes(Integer gender, String color) {
        SqlParameterSource params = new MapSqlParameterSource().addValue("gender", gender).addValue("color", color);
        List<Clothes> filteredClothes = template.query(SEARCH_CLOTHES, params, RESULT_ROW_MAPPER);

        return filteredClothes;
    }

}
