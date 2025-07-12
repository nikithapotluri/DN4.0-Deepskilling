package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Override
    public Country getCountry(String code) {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        @SuppressWarnings("unchecked")
		List<Country> countries = (List<Country>) context.getBean("countryList");

        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}
