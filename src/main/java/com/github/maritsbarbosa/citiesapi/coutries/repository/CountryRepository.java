package com.github.maritsbarbosa.citiesapi.coutries.repository;

import com.github.maritsbarbosa.citiesapi.coutries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
