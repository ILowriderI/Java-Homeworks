package com.example.javaprohw8.controllers;

import com.example.javaprohw8.models.Device;
import com.example.javaprohw8.services.DeviceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;

@RestController

public class DeviceController {
    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @PostMapping("/device/add")
    public ResponseEntity<Boolean> addUser(@RequestBody Device device) throws SQLException {
        deviceService.addDevice(device);
        return ResponseEntity.ok().body(true);

    }

    @GetMapping("/devices")
    public ArrayList<Device> getAllDevices() throws SQLException {
        return (ArrayList<Device>) deviceService.getAllDevices();
    }

    @GetMapping("/device/{id}")
    public Device getDeviceById(@PathVariable long id) throws SQLException {
        return deviceService.getDeviceById(id);
    }

    @PostMapping("device/update/{id}")
    public  ResponseEntity<Boolean> updateDeviceById(@RequestBody Device device,
                                                     @PathVariable long id) throws SQLException {
        deviceService.updateDeviceById(id, device);
        return ResponseEntity.ok().body(true);
    }

    @PostMapping("/device/delete/{id}")
    public  ResponseEntity<Boolean> deleteDeviceById(@PathVariable long id) throws SQLException {

        deviceService.deleteDeviceById(id);

        return ResponseEntity.ok().body(true);
    }
}
