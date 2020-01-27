package com.meep.pollingtest.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
public class ResourceCollection {
    public Collection<Resource> resourceCollection;
}
