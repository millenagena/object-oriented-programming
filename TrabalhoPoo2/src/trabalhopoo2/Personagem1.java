/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 */
public class Personagem1 extends Personagem {
    public Personagem1(){
        setPulo(new PuloMedio());
        setCorre(new CorridaMedia());
        setAtaque(new AtaqueForte());
    }
}
