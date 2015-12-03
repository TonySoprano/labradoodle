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
 * @author Alexandr Barkovskiy
 * @version 2.0
 * @since 17.11.15
 */

/*
public class DishServiceImplTest {

    private Assertion assertion = new LoggingAssert();

    @Mock
    private DishRepository dishRepository;

    @InjectMocks
    private DishServiceImpl appService;

    @BeforeMethod
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetHotDishes1() {
        when(dishRepository.getHotDishes(anyString())).thenReturn(createListDishesDto());
        List<DishDto> response = appService.getHotDishes("DNLDNKLNN");
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(), 20);
        verify(dishRepository,times(1)).getHotDishes(anyString());
    }

    @Test
    public void testGetHotDishes2() {
        doThrow(new RuntimeException()).when(dishRepository).getHotDishes(anyString());
        List<DishDto> response = appService.getHotDishes(anyString());
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),0);
        verify(dishRepository, times(1)).getHotDishes(anyString());
    }

   @Test
   public void testGetDishesByType1(){
       doThrow(new RuntimeException()).when(dishRepository.getByType(any(TypesOfDishes.class), anyString()));
       List<DishDto> response = appService.getDishesByType(any(TypesOfDishes.class), anyString());
       assertion.assertNotNull(response);
       assertion.assertEquals(response.size(),0);
       verify(dishRepository, times(1)).getByType(any(TypesOfDishes.class), anyString());
   }

    @Test
    public void testGetDishesByType2(){
        when(dishRepository.getByType(any(TypesOfDishes.class),anyString())).thenReturn(createListDishesDto());
        List<DishDto> response = appService.getDishesByType(any(TypesOfDishes.class), anyString());
        assertion.assertNotNull(response);
        verify(dishRepository,times(1)).getByType(any(TypesOfDishes.class), anyString());
    }

    /**
     * This method creates a List with 20 Dishes for tests
     * @return List<Dish>
     */
/*
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
*/