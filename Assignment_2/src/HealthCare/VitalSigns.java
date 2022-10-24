package HealthCare;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pavan
 */
public class VitalSigns {
    private int PulseRate;
    private double BloodPressure;
    private double Temperature;
    private float Height;
    private float Weight;
    private int BreathingRate;
    
    public VitalSigns(int PulseRate, double BloodPressure, double Temperature, float Height, float Weight, int BreathingRate) {
        this.PulseRate= PulseRate;
        this.BloodPressure= BloodPressure;
        this.Height= Height;
        this.Temperature= Temperature;
        this.Weight= Weight;
        this.BreathingRate= BreathingRate;
        }
    

    public int getPulseRate() {
        return PulseRate;
    }

    public void setPulseRate(int PulseRate) {
        this.PulseRate = PulseRate;
    }

    public double getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(double BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public double getTemperature() {
        return Temperature;
    }

    public void setTemperature(double Temperature) {
        this.Temperature = Temperature;
    }

    public float getHeight() {
        return Height;
    }

    public void setHeight(float Height) {
        this.Height = Height;
    }

    public float getWeight() {
        return Weight;
    }

    public void setWeight(float Weight) {
        this.Weight = Weight;
    }

    public int getBreathingRate() {
        return BreathingRate;
    }

    public void setBreathingRate(int BreathingRate) {
        this.BreathingRate = BreathingRate;
    }
    
}
