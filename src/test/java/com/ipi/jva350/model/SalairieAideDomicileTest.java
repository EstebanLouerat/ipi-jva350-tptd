package com.ipi.jva350.model;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SalairieAideDomicileTest {
    
    @Test
    void aLegalementDroitADesCongesPayes() {
        // Given
        SalarieAideADomicile aide = new SalarieAideADomicile();
        // When
        boolean res = aide.aLegalementDroitADesCongesPayes();
        // Then
        Assertions.assertEquals(false, res);
    }

    @Test
    void aLegalementDroitADesCongesPayesNettementMoinsDe10() {
        // Given
        LocalDate dummyDate = LocalDate.now();
        SalarieAideADomicile aide =  new SalarieAideADomicile("Jeanne", 
        dummyDate, LocalDate.now(), 0, 
        0, 5, 0, 0);
        // When
        boolean res = aide.aLegalementDroitADesCongesPayes();
        // Then
        Assertions.assertEquals(false, res);

    }
    @Test
    void aLegalementDroitADesCongesPayesNettementPlusDe10() {
        // Given
        LocalDate dummyDate = LocalDate.now();
        SalarieAideADomicile aide =  new SalarieAideADomicile("Jeanne", 
        dummyDate, LocalDate.now(), 0, 
        0, 15, 0, 0);
        // When
        boolean res = aide.aLegalementDroitADesCongesPayes();
        // Then
        Assertions.assertEquals(true, res);

    }
    @Test
    void aLegalementDroitADesCongesPayesLimmite10() {
        // Given
        LocalDate dummyDate = LocalDate.now();
        SalarieAideADomicile aide =  new SalarieAideADomicile("Jeanne", 
        dummyDate, LocalDate.now(), 0, 
        0, 10, 0, 0);
        // When
        boolean res = aide.aLegalementDroitADesCongesPayes();
        // Then
        Assertions.assertEquals(true, res);

    }
    @Test
    void aLegalementDroitADesCongesPayesLimmite11() {
        // Given
        LocalDate dummyDate = LocalDate.now();
        SalarieAideADomicile aide =  new SalarieAideADomicile("Jeanne", 
        dummyDate, LocalDate.now(), 0, 
        0, 11, 0, 0);
        // When
        boolean res = aide.aLegalementDroitADesCongesPayes();
        // Then
        Assertions.assertEquals(true, res);

    }
}
