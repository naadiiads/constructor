/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructortabung;

public class main {
    public static void main(String[] args) {
        Constructortabung tabung = new Constructortabung (3.14, 10, 5);
        tabung.ComputeAndSetVolume();
        System.out.println("Volume tabung dengan jari-jari : "+tabung.radius+" dan tinggi : "+tabung.tinggi+" adalah "+tabung.getVolume());
    }
    }
