/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructorlimas;

public class main {
    public static void main(String[] args) {
        Constructorlimas limas = new Constructorlimas (5,7);
        limas.ComputeAndSetVolume();
        System.out.println("Volume limas dengan luas alas : "+limas.sisi+" dan tinggi : "+limas.tinggi+" adalah "+limas.getVolume());
    }
}
