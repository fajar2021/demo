package com.demo.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.project.entity.Hardware;

/**
 * @author fajar
 */
public interface HardwareRepository extends JpaRepository<Hardware, Long> {

}