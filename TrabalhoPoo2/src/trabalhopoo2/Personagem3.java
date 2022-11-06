/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 */
public class Personagem3 extends Personagem {
    public Personagem3(){
        setPulo(new PuloBaixo());
        setCorre(new CorridaRapida());
        setAtaque(new AtaqueForte());
    }
}
