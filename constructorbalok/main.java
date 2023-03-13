/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructorbalok;

public class main {
    public static void main(String[] args) {
        Constructorbalok balok = new Constructorbalok (7,3,5);
        balok.ComputeAndSetVolume();
        System.out.println("Volume balok dengan panjang : "+balok.panjang+", lebar : "+balok.lebar+", tinggi : "+balok.tinggi+" adalah "+balok.getVolume());
    }
}
