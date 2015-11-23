package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.entities.kladr.City;
import org.levelup.labradoodle.models.entities.kladr.Region;
import org.levelup.labradoodle.models.entities.kladr.Street;
import org.levelup.labradoodle.models.web.kladr.CityDto;
import org.levelup.labradoodle.models.web.kladr.RegionDto;
import org.levelup.labradoodle.models.web.kladr.StreetDto;
import org.levelup.labradoodle.repositories.CladrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.services.CladrServiceImpl}

 * @author Alexandr Barkovskiy
 * @version 1.0
 * @since 09.11.15
 */
@Service
public class CladrServiceImpl implements CladrService {

    @Autowired
    private CladrRepository cladrRepository;

    /**
     * This method returns list of DTO objects depending on transmitted filter (cladr)
     * @param cladr
     * @return List of cladr objects
     */
    @Override
    public List<?> getCladrInfo(String cladr) {
        List<?> cladrInfo;
        switch (cladr.length()){
            case 3: cladrInfo = getCities(cladr);
                    break;
            case 6: cladrInfo = getStreets(cladr);
                    break;
            default: cladrInfo = getRegions();
        }
        return cladrInfo;
    }

    private List<?> getRegions() {
        List<Object> regionDtoList = new ArrayList<>();
        try {
            for (Region region: cladrRepository.getRegions()){
                regionDtoList.add(new RegionDto()
                        .setId(region.getId())
                        .setRegion(region.getRegion()));
            }
        }catch (Exception e){
            System.out.println(e); //This is a place for logger
        }
        return regionDtoList;
    }


    private List<Object> getCities(String cladr) {
        List<Object> cityDtoList = new ArrayList<>();
        try {
            for (City city: cladrRepository.getCities(cladr)){
                cityDtoList.add(new CityDto()
                    .setCityId(city.getCityId())
                    .setCity(city.getCity())
                    .setRegion(city.getRegion()));
            }
        }catch (Exception e){
            System.out.println(e); // This is a place for logger
        }
        return cityDtoList;
    }


    private List<Object> getStreets(String cladr) {
        List<Object> streetDtoList = new ArrayList<>();
        String  regionCladr = cladr.substring(0,3),
                cityCladr = cladr.substring(3,6);

        try {
            for (Street street : cladrRepository.getStreets(regionCladr,cityCladr)) {
                streetDtoList.add(new StreetDto()
                    .setStreetId(street.getStreetId())
                    .setStreet(street.getStreet())
                    .setCity(street.getCity()));
            }
        }catch (Exception e){
            System.out.println(e); // This is a place for logger
        }
        return streetDtoList;
    }

}

