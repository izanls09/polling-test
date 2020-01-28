package com.meep.pollingtest.service;

import com.meep.pollingtest.bean.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.meep.pollingtest.resources.Constants.LISBOA_FILTERED;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Override
    public ResponseEntity<Resource[]> updateAvailableVehicles() {

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForEntity(LISBOA_FILTERED, Resource[].class);
    }
}
