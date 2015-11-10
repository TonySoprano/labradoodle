package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.entities.kladr.Region;
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
        List<?> cladrInfo = new ArrayList<>();
        switch (cladr.length()){
            case 1: cladrInfo = getRegions();
                    break;
            case 3: cladrInfo = getCities(cladr);
                    break;
            case 6: cladrInfo = getStreets(cladr);
        }
        return null;
    }

    private List<RegionDto> getRegions() {
        List<RegionDto> regionDtoList = new ArrayList<>();
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


    private List<CityDto> getCities(String cladr) {
        return null;
    }


    private List<StreetDto> getStreets(String cladr) {
        return null;
    }
}
