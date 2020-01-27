package com.meep.pollingtest.service;

import com.meep.pollingtest.bean.Resource;
import com.meep.pollingtest.bean.ResourceCollection;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Override
    public ResponseEntity<ResourceCollection> updateAvailableVehicles() {
        Collection<Resource> resource = null;

        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl
                = "https://apidev.meep.me/tripplan/api/v1/routers/lisboa/resources? lowerLeftLatLon=38.711046,-9.160096&upperRightLatLon=38.739429,9.137115&companyZoneIds=545,467,473";

        ResponseEntity<ResourceCollection> response = restTemplate.getForEntity(resourceUrl, ResourceCollection.class);

        return response;
    }


}
