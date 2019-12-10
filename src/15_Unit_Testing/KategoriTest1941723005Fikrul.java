/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author muham
 */
public class KategoriTest1941723005Fikrul extends TestCase {
    
    Kategori1941723005Fikrul instance;

    public KategoriTest1941723005Fikrul() {
    }

    @BeforeClass
    public static void setUpClass() {
        
    }

    @AfterClass
    public static void tearDownClass() {

    }

    @Before
    public void setUp() {
        instance = new Kategori1941723005Fikrul("Comics", "Comic is combination words and pictures");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    @Test
    public void testSave() {
        System.out.println("save test");
        this.instance.saveFikrul();
        ArrayList<Kategori1941723005Fikrul> expResult = instance.getByNamaAndKeteranganFikrul(instance.getNamaFikrul(), instance.getKeteranganFikrul());
        assertTrue(expResult.size()>0);
    }

    @Test
    public void testSearch() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1941723005Fikrul> result = instance.searchFikrul(keyword);
        ArrayList<Kategori1941723005Fikrul> expResult = instance.getByNamaAndKeteranganFikrul(keyword, "");
        assertEquals(expResult.size(), result.size());
    }
}
