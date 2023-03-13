/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructorbola;

public class main {
    public static void main(String[] args) {
        Constructorbola bola = new Constructorbola (3.14, 10);
        bola.ComputeAndsetVolume();
        System.out.println("Volume bola dengan radius : "+bola.radius+" adalah "+bola.getVolume());
    }
    
}
