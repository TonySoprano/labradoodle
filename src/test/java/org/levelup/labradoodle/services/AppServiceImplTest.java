package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.entities.Dishes;
import org.levelup.labradoodle.models.entities.TypeDishes;
import org.levelup.labradoodle.models.web.DishesDto;
import org.levelup.labradoodle.repositories.DishRepository;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.LoggingAssert;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.testng.Assert.*;

/**
 * Created by Alexandr Barkovskiy on 01.09.2015.
 */
public class AppServiceImplTest {

    private Assertion assertion = new LoggingAssert();

    @Mock
    private DishRepository dishRepository;

    @InjectMocks
    private AppServiceImpl appService;

    @BeforeMethod
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetFirst20Dishes() throws Exception {
        when(dishRepository.getFirst20()).thenReturn(createListDishesDto());
        List<DishesDto> response = appService.getFirst20Dishes();
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),20);
    }

    //This method creates a List with 20 Dishes for testing method "testGetFirst20Dishes"
    private List<Dishes> createListDishesDto(){
        List<Dishes> dishesList = new ArrayList<>();
        for (int i=0; i<20; i++){
            dishesList.add(new Dishes()
                        .setId(i)
                        .setName("SomeDish")
                        .setPrice_new(20)
                        .setTypeDishes(TypeDishes.BURGERS)
                        .setDescription("BLALALA"));
        }
        return dishesList;
    }
}