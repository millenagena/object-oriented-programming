/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 * @author lucas
 */
public class Personagem2 extends Personagem {
    public Personagem2(){
        setPulo(new PuloAlto());
        setCorre(new CorridaRapida());
        setAtaque(new AtaqueMedio());
    }
}
