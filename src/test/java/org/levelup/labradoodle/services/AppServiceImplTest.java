package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.entities.Dish;
import org.levelup.labradoodle.models.entities.TypesOfDishes;
import org.levelup.labradoodle.models.web.DishDto;
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

import static org.mockito.Mockito.*;

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

//    @Test
//    public void testGetHotDishes1() {
//        when(dishRepository.getHotDishes()).thenReturn(createListDishesDto());
//        List<DishDto> response = appService.getHotDishes();
//        assertion.assertNotNull(response);
//        assertion.assertEquals(response.size(), 20);
//    }

//    @Test
//    public void testGetHotDishes2() {
//        doThrow(new RuntimeException()).when(dishRepository).getHotDishes();
//        appService.getHotDishes();
//        verify(dishRepository, times(1)).getHotDishes();
//    }


    //This method creates a List with 20 Dishes for testing method "testGetHotDishes1"
    private List<Dish> createListDishesDto(){
        List<Dish> dishesList = new ArrayList<>();
        for (int i=0; i<20; i++){
            dishesList.add(new Dish()
                    .setDishId(i)
                    .setName("SomeDish")
                    .setPriceNew(20)
                    .setTypesOfDishes(TypesOfDishes.BURGERS)
                    .setDescription("BLALALA"));
        }
        return dishesList;
    }
}