package com.kgisl.cakeshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kgisl.cakeshop.controller.CakeController;
import com.kgisl.cakeshop.model.Cake;
import com.kgisl.cakeshop.repository.CakeRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CakeControllerTest {

        // public static void main(String args[]) {

        // Creating object using Builder pattern in java
        // Cake whiteCake = new
        // CakeBuilder().sugar(1).butter(0.5).eggs(2).vanila(2).flour(1.5).
        // bakingpowder(0.75).milk(0.5).build();
        // Cake butterCake = new CakeBuilder().sugar(2).butter(2.5).build();
        // Cake is ready to eat :)
        // System.out.println(whiteCake);
        // System.out.println(butterCake);

        
        @InjectMocks
        private CakeController cakeController;

        @Mock
        private CakeRepository cakeRepository;

        public static List<Cake> expected;

        Cake whiteCake = new CakeBuilder().sugar(1).butter(0.5).eggs(2).vanila(2).flour(1.5).bakingpowder(0.75)
                        .milk(0.5).build();
        Cake blackCake = new CakeBuilder().sugar(1).butter(0.5).eggs(2).vanila(2).flour(1.5).bakingpowder(0.75)
                        .milk(0.5).build();

        @Test
        public void Getcake() {
                expected = Arrays.asList(whiteCake, blackCake);
                when(cakeRepository.findAll()).thenReturn(expected);
                List<Cake> actual = cakeController.read();
                // assertNotNull(actual);
                assertEquals(expected, actual);
        }

        @Test
        public void addPortfolioTest() {

                List<Cake> port = new ArrayList<Cake>();
                port.add(whiteCake);
                when(cakeRepository.saveAndFlush(whiteCake)).thenReturn(whiteCake);

                Cake AR = cakeController.create(whiteCake);

                assertNotNull(AR);
        }

        @Test
        public void updateCakeTest() {

                List<Cake> port = new ArrayList<Cake>();
                port.add(whiteCake);
                when(cakeRepository.saveAndFlush(whiteCake)).thenReturn(whiteCake);
                when(cakeRepository.getOne(1)).thenReturn(whiteCake);
                Cake AR = cakeController.update(1, whiteCake);

                assertNotNull(AR);
        }
        @Test
        public void deletePortfolioTest() {
            int id = 1;
            cakeController.delete(id);
        //     cakeRepository.deleteById(id);
            verify(cakeRepository).deleteById(id);
    
        }
}
