package com.example.javaprohw8.services;

import com.example.javaprohw8.dao.DeviceDAO;
import com.example.javaprohw8.models.Device;
import org.springframework.stereotype.Component;


import java.sql.SQLException;
import java.util.List;

@Component
public class DeviceService {
    private final DeviceDAO deviceDAO;

    public DeviceService(DeviceDAO deviceDAO) {
        this.deviceDAO = deviceDAO;
    }

    public void addDevice(Device device) throws SQLException{
        deviceDAO.addDevice(device);
    }

    public List<Device> getAllDevices() throws SQLException{
        return deviceDAO.getAllDevices();
    }

    public Device getDeviceById(long deviceId) throws SQLException{
        return deviceDAO.getDeviceById(deviceId);
    }

    public void updateDeviceById(long id, Device device) throws SQLException{
        deviceDAO.updateDeviceById(id, device);
    }

    public  void deleteDeviceById(long id) throws SQLException{
        deviceDAO.deleteDeviceById(id);
    }
}
