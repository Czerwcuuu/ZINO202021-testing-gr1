/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.bikol.dino.arytmetyka;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bikol
 */
public class ArytmetykaTest {
    
    public ArytmetykaTest() {
    }

    @Test
    public void testPotegowanie() {
        System.out.println("potegowanie");
        String a = "1";
        String b = "1";
        Arytmetyka instance = new Arytmetyka();
        String expResult = "1";
        String result = instance.potegowanie(a, b);
        assertEquals(expResult, result);
    }
    
}
