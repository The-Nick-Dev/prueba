/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Diurno
 */
public class SerieFibonacciCajaBlancaTest {

    public SerieFibonacciCajaBlancaTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class SerieFibonacciCajaBlanca.
     *
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String entrada = "no";
        System.setIn(new ByteArrayInputStream(entrada.getBytes()));
        String[] args = null;
        SerieFibonacciCajaBlanca.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Fibonacci method, of class SerieFibonacciCajaBlanca.
     */
    @Test
    public void testFibonacci() {
        System.out.println("Fibonacci");
        SerieFibonacciCajaBlanca instance = new SerieFibonacciCajaBlanca();
        instance.Fibonacci();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
