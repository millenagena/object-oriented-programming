/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 * @author lucas
 */
public class Personagem {
    private Ataque at;
    private Pulo pu;
    private Corre co;
    
    public void setAtaque(Ataque at){
        this.at = at;
    }
    
    public void setPulo(Pulo pu){
        this.pu = pu;
    }
    
    public void setCorre(Corre co){
        this.co = co;
    }
    
    public void atacar(){
        at.atacar();
    }
    
    public void pular(){
        pu.pular();
    }
    
    public void correr(){
        co.correr();
    }
}
