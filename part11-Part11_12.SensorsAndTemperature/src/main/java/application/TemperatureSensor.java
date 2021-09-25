/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author prima
 */
public class TemperatureSensor implements Sensor {

    private boolean isOn;
    private int temperature;

    public TemperatureSensor() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        isOn = true;
    }

    @Override
    public void setOff() {
        isOn = false;
    }

    @Override
    public int read() {
        if (!this.isOn()) {
            throw new IllegalStateException("Sensor is off");
        }

        return temperature = new Random().ints(-30, 31).findFirst().getAsInt();
    }
}
