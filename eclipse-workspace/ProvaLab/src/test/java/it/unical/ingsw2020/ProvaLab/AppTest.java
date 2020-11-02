package it.unical.ingsw2020.ProvaLab;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static MyString myString;
    
    @BeforeClass
    public static void prepare() {
    	myString = new MyString();
    }
    
    @Test
    public void invertiStringaWorks() {
    	assertEquals("asac", myString.invertiStringa("casa"));
    }
    
    @Test
    public void isPalindromaWorks() {
    	assertTrue(myString.isPalindroma("anna"));
    	assertFalse(myString.isPalindroma("casa"));
    }
}
