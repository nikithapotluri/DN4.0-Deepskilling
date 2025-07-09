package com.cognizant.countryselector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountrySelectorApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountrySelectorApplication.class);

    public static void main(String[] args) {
        LOGGER.debug("START");
        displayCountry();
        LOGGER.debug("END");
    }

    public static void displayCountry() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        LOGGER.debug("Country : {}", country.toString());
        context.close(); 
    }


}
