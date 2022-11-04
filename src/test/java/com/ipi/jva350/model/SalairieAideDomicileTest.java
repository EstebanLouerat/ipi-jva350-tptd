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
    void aLegalementDroitADesCongesPayesTrue() {
        // Given
        SalarieAideADomicile aide =  new SalarieAideADomicile("Jeanne", 
        LocalDate.now(), LocalDate.now(), 0, 
        0, 0, 0, 0);
        // When
        boolean res = aide.aLegalementDroitADesCongesPayes();
        // Then
        Assertions.assertEquals(false, res);

    }
}
