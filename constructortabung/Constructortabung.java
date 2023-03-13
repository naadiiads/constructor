/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructortabung;

public class Constructortabung {
    public double phi;
    public int radius;
    public int tinggi;
    public double volume;
    
    public Constructortabung (double phi, int radius, int tinggi) {
        this.phi = phi;
        this.radius = radius;
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume() {
        double calculate_vol = this.phi * this.radius * this.radius * this.tinggi;
        this.volume = calculate_vol;
    }
    
    public double getVolume() {
        return this.volume;
    }
}
