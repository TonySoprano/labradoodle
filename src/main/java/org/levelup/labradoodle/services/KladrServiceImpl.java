package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.entities.kladr.City;
import org.levelup.labradoodle.models.entities.kladr.Region;
import org.levelup.labradoodle.models.entities.kladr.Street;
import org.levelup.labradoodle.models.web.kladr.CityDto;
import org.levelup.labradoodle.models.web.kladr.KladrObjectDto;
import org.levelup.labradoodle.models.web.kladr.RegionDto;
import org.levelup.labradoodle.models.web.kladr.StreetDto;
import org.levelup.labradoodle.repositories.KladrRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.services.KladrServiceImpl}

 * @author Alexandr Barkovskiy
 * @version 1.0
 * @since 09.11.15
 */
@Service
public class KladrServiceImpl implements KladrService {

    private static final Logger LOGGER = LoggerFactory.getLogger(KladrServiceImpl.class);

    @Autowired
    private KladrRepository kladrRepository;

    /**
     * This method returns list of DTO objects depending on transmitted filter (kladr)
     * @param kladr
     * @return List of kladr objects (Region, City, Street)
     */
    @Override
    public List<KladrObjectDto> getKladrInfo(String kladr) {
        List<KladrObjectDto> kladrInfo;
        switch (kladr.length()){
            case 3: kladrInfo = getCities(kladr);
                    break;
            case 6: kladrInfo = getStreets(kladr);
                    break;
            default: kladrInfo = getRegions();
        }
        return kladrInfo;
    }

    @Override
    public List<KladrObjectDto> getRegions() {
        List<KladrObjectDto> regionDtoList = new ArrayList<>();
        try {
            for (Region region: kladrRepository.getRegions()){
                regionDtoList.add(new RegionDto()
                        .setId(region.getId())
                        .setRegion(region.getRegion()));
            }
        }catch (Exception e){
            LOGGER.error("{}",e.toString(),e);
            return regionDtoList;
        }
        return regionDtoList;
    }

    @Override
    public List<KladrObjectDto> getCities(String kladr) {
        List<KladrObjectDto> cityDtoList = new ArrayList<>();
        try {
            for (City city: kladrRepository.getCities(kladr)){
                cityDtoList.add(new CityDto()
                    .setCityId(city.getCityId())
                    .setCity(city.getCity())
                    .setRegion(city.getRegion()));
            }
        }catch (Exception e){
            LOGGER.error("{}",e.toString(),e);
            return cityDtoList;
        }
        return cityDtoList;
    }

    @Override
    public List<KladrObjectDto> getStreets(String kladr) {
        List<KladrObjectDto> streetDtoList = new ArrayList<>();
        try {
            String  cityKladr = kladr.substring(3,6);
            for (Street street : kladrRepository.getStreets(cityKladr)) {
                streetDtoList.add(new StreetDto()
                    .setStreetId(street.getStreetId())
                    .setStreet(street.getStreet())
                    .setCity(street.getCity()));
            }
        }catch (Exception e){
            LOGGER.error("{}",e.toString(),e);
            return streetDtoList;
        }
        return streetDtoList;
    }

}

