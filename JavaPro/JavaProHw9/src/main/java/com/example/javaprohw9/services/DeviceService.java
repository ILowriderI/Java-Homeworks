package com.example.javaprohw9.services;

import com.example.javaprohw9.models.Device;
import com.example.javaprohw9.models.User;
import com.example.javaprohw9.repositories.DeviceRepository;
import com.example.javaprohw9.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class DeviceService {
    private final DeviceRepository deviceRepository;
    private  final UserRepository userRepository;

    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    public Optional<Device> getDeviceById(Long id) {
        return deviceRepository.findById(id);
    }

    public void addDevice(Device device,Long userId) {
        User user= userRepository.findById(userId).orElse(null);
        user.addDeviceToUser(device);
        deviceRepository.save(device);
    }

    public void deleteDeviceById(Long id) {
        deviceRepository.deleteById(id);
    }

    public List<Device> searchDeviceByName(String name){
        return deviceRepository.findByNameContaining(name);
    }
}
