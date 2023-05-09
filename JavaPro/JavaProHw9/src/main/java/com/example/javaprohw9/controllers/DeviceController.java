package com.example.javaprohw9.controllers;

import com.example.javaprohw9.models.Device;
import com.example.javaprohw9.services.DeviceService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class DeviceController {

    private final DeviceService deviceService;

    @GetMapping("/devices")
    public List<Device> getAllDevices() {
        return deviceService.getAllDevices();
    }

    @GetMapping("/device/{id}")
    public Optional<Device> getUserById(@PathVariable Long id) {
        return deviceService.getDeviceById(id);
    }

    @PostMapping("device/add/{userId}")
    public Long addUser(@RequestBody Device device, @PathVariable Long userId) {
        deviceService.addDevice(device, userId);
        return device.getId();
    }

    @PostMapping("/device/delete/{id}")
    public ResponseEntity<Boolean> deleteUserById(@PathVariable Long id) {
        deviceService.deleteDeviceById(id);
        return ResponseEntity.ok(true);
    }

    @GetMapping("/search/device/{name}")
    public List<Device> searchUserByName(@PathVariable String name) {
        return deviceService.searchDeviceByName(name);
    }
}
