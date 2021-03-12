package com.demo.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.project.entity.Hardware;
import com.demo.project.repository.HardwareRepository;

@Service
public class HardwareImpl implements HardwareService{

	@Autowired
    HardwareRepository hardwareRepository;

    public List<Hardware> findAll() {
        return hardwareRepository.findAll();
    }

    public Hardware findById(Long id) {
        return hardwareRepository.getOne(id);
    }

    public Hardware update(Long id, Hardware hardware) {
        hardware.getId();
        return hardwareRepository.save(hardware);
    }

    public Hardware create(Hardware hardware) {
        return hardwareRepository.save(hardware);
    }
    
    public void delete(Long id) {
        hardwareRepository.deleteById(id);
    }
}
