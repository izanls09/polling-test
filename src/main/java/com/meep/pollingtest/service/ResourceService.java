package com.meep.pollingtest.service;

import com.meep.pollingtest.bean.ResourceCollection;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface ResourceService {
    ResponseEntity<ResourceCollection> updateAvailableVehicles();
}
