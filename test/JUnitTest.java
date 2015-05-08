/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bankier.Bankier;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michał
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void test1() {
        Bankier b = new Bankier(6000, true, true);
        System.out.println("Dochody: " + b.getIncome() + " Ma kartę?: " + b.isHasCreditCard() + " Wniosek o kredyt?: " + b.isCreditApplication());
        System.out.println("Oferta karty: " + b.CreditCardOffer() + " Oferta kredytu: " + b.CreditOffer() + " Przyznanie kredytu: " + b.CreditApproval());
    }

    @Test
    public void test2() {
        Bankier b = new Bankier(3500, true, false);
        System.out.println("Dochody: " + b.getIncome() + " Ma kartę?: " + b.isHasCreditCard() + " Wniosek o kredyt?: " + b.isCreditApplication());
        System.out.println("Oferta karty: " + b.CreditCardOffer() + " Oferta kredytu: " + b.CreditOffer() + " Przyznanie kredytu: " + b.CreditApproval());
    }

    @Test
    public void test3() {
        Bankier b = new Bankier(5000.01, false, true);
        System.out.println("Dochody: " + b.getIncome() + " Ma kartę?: " + b.isHasCreditCard() + " Wniosek o kredyt?: " + b.isCreditApplication());
        System.out.println("Oferta karty: " + b.CreditCardOffer() + " Oferta kredytu: " + b.CreditOffer() + " Przyznanie kredytu: " + b.CreditApproval());
    }

    @Test
    public void test4() {
        Bankier b = new Bankier(6000, false, false);
        System.out.println("Dochody: " + b.getIncome() + " Ma kartę?: " + b.isHasCreditCard() + " Wniosek o kredyt?: " + b.isCreditApplication());
        System.out.println("Oferta karty: " + b.CreditCardOffer() + " Oferta kredytu: " + b.CreditOffer() + " Przyznanie kredytu: " + b.CreditApproval());
    }

    @Test
    public void test5() {
        Bankier b = new Bankier(1000, true, true);
        System.out.println("Dochody: " + b.getIncome() + " Ma kartę?: " + b.isHasCreditCard() + " Wniosek o kredyt?: " + b.isCreditApplication());
        System.out.println("Oferta karty: " + b.CreditCardOffer() + " Oferta kredytu: " + b.CreditOffer() + " Przyznanie kredytu: " + b.CreditApproval());
    }

    @Test
    public void test6() {
        Bankier b = new Bankier(0, false, false);
        System.out.println("Dochody: " + b.getIncome() + " Ma kartę?: " + b.isHasCreditCard() + " Wniosek o kredyt?: " + b.isCreditApplication());
        System.out.println("Oferta karty: " + b.CreditCardOffer() + " Oferta kredytu: " + b.CreditOffer() + " Przyznanie kredytu: " + b.CreditApproval());
    }
}
