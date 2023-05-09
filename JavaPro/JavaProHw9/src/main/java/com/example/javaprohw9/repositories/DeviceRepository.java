package com.example.javaprohw9.repositories;

import com.example.javaprohw9.models.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceRepository extends JpaRepository<Device,Long> {
    List<Device> findByNameContaining(String name);
}
