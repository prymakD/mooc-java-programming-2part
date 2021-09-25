/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prima
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        boolean isOn = true;
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                isOn = false;
            }
        }
        
        return isOn;
    }

    @Override
    public void setOn() {
        sensors.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        sensors.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Average Sensor is off, or if no sensors have been added to it");
        }
        
        double averageTemperature = sensors.stream()
                .mapToInt(s -> Integer.valueOf(s.read()))
                .average().getAsDouble();
        
        readings.add((int) averageTemperature);
        return (int) averageTemperature;
    }
    
    public List<Integer> readings() {
        return readings;
    }

}
