/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhopoo2;

/**
 *
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // testando o Strategy
        Personagem1 p1 = new Personagem1();
        Personagem2 p2 = new Personagem2();
        Personagem3 p3 = new Personagem3();
        
        p1.atacar();
        p2.pular();
        p3.correr();
        
        p1.pular();
        p2.correr();
        p3.atacar();
        
        // testando o State
        System.out.println();
        p1.sofrerAtaque(50); // vai pra perigo
        p1.recolherRecompensa(100); // vai pra forte
        p1.sofrerAtaque(40); // vai pra normal
        p1.sofrerAtaque(80); // vai pra morto
    }
    
}
