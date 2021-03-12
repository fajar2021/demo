package com.demo.project.service;

import java.util.List;

import com.demo.project.entity.Hardware;

public interface HardwareService {

	List<Hardware> findAll();

    public Hardware findById(Long id);

    public Hardware update(Long id, Hardware hardware);

    public Hardware create(Hardware hardware);
    
    public void delete(Long id);
}
