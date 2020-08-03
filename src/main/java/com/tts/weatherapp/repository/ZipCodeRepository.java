package com.tts.weatherapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.tts.weatherapp.model.ZipCode;


public interface ZipCodeRepository extends JpaRepository<ZipCode, Long> {
        public ZipCode findByZip(String zipcode);
    
}