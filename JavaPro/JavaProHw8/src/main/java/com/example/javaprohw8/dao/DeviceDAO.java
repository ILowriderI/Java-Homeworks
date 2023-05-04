package com.example.javaprohw8.dao;

import com.example.javaprohw8.MyConnection;
import com.example.javaprohw8.models.Device;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DeviceDAO {

    public void addDevice(Device device) throws SQLException {
        Connection connection = MyConnection.createConnection();

        PreparedStatement preparedStatement = connection
                .prepareStatement("INSERT INTO devices VALUES(DEFAULT,?,?,?)");
        preparedStatement.setString(1, device.getName());
        preparedStatement.setString(2, device.getMacAddress());
        preparedStatement.setLong(3, device.getUserId());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }

    public List<Device> getAllDevices() throws SQLException {
        Connection connection = MyConnection.createConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM devices ");
        List resultList = new ArrayList<Device>();

        while (resultSet.next()) {

            long id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String macAddress = resultSet.getString(3);
            long userID = resultSet.getLong(4);

            resultList.add(new Device(id, name, macAddress, userID));

        }
        statement.close();
        connection.close();
        return resultList;

    }

    public Device getDeviceById(long deviceId) throws SQLException {
        Connection connection = MyConnection.createConnection();
        PreparedStatement preparedStatement = connection
                .prepareStatement("SELECT * FROM devices WHERE id = ?");
        preparedStatement.setLong(1, deviceId);
        ResultSet resultSet = preparedStatement.executeQuery();
        Device result = null;
        while (resultSet.next()) {

            long id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String macAddress = resultSet.getString(3);
            long userID = resultSet.getLong(4);

            result = new Device(id, name, macAddress, userID);

        }

        connection.close();
        preparedStatement.close();
        return result;
    }

    public void updateDeviceById(long id, Device device) throws SQLException {
        Connection connection = MyConnection.createConnection();
        PreparedStatement preparedStatement = connection
                .prepareStatement("UPDATE devices SET name = ?,mac_address =?," +
                        "user_id =? WHERE  id=?");
        preparedStatement.setString(1, device.getName());
        preparedStatement.setString(2, device.getMacAddress());
        preparedStatement.setLong(3, device.getUserId());
        preparedStatement.setLong(4, id);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();

    }
    public  void deleteDeviceById(long id) throws SQLException {
        Connection connection = MyConnection.createConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(" DELETE " +
                "FROM devices WHERE id=?");
        preparedStatement.setLong(1,id);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }

}
