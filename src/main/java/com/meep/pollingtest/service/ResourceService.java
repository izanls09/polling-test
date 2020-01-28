package com.meep.pollingtest.service;

import com.meep.pollingtest.bean.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface ResourceService {
    ResponseEntity<Resource[]> updateAvailableVehicles();
}
