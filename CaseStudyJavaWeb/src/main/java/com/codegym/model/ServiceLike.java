package com.codegym.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ServiceLike {
    Map<String,Service> serviceMap = new HashMap<>();
    public ServiceLike() {
    }
    public void addServiceLike(Service service){
        serviceMap.put(service.getNameService(),service);
    }
    public List<Service> getListServiceLike(){
        List<Service> services = new LinkedList<>();
        for (Service service :serviceMap.values()){
            services.add(service);
        }
        return services;
    }
}
