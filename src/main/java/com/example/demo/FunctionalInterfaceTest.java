package com.example.demo;

import java.util.List;

@FunctionalInterface
public interface FunctionalInterfaceTest {

    List<String> getCompanies();

    //List<String> getColleges();

    default public int getRetirementAge() {
        return 65;
    }

    default public String getCountryOfResidence() {
        return "US";
    }
}
