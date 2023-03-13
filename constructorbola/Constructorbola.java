/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructorbola;

public class Constructorbola {
    public double phi;
    public int radius;
    public double volume;
    
    public Constructorbola(double phi, int radius) {
        this.phi = phi;
        this.radius = radius;
    }
    
    public void ComputeAndsetVolume() {
        double calculate_vol = 1.333 * this.phi * this.radius * this.radius * this.radius;
        this.volume = calculate_vol;
    }
    
    public double getVolume() {
        return this.volume;
    }
}