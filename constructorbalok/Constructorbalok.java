/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructorbalok;

public class Constructorbalok {
    public int panjang;
    public int lebar;
    public int tinggi;
    public int volume;
    
    public Constructorbalok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume() { 
        int calculate_vol = this.panjang * this.lebar * this.tinggi;
        this.volume = calculate_vol;
    }
    
    public int getVolume() { 
        return this.volume;
    }
}
