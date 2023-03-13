/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructorlimas;

public class Constructorlimas {
    public int sisi;
    public int tinggi;
    public double volume;
    
    public Constructorlimas(int sisi, int tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume() {
        double calculate_vol = 0.333 * this.sisi * this.sisi * this.tinggi;
        this.volume = calculate_vol;
    }
    
    public double getVolume() {
        return this.volume;
    }
}
