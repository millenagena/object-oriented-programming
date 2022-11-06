/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 */
public class Personagem {
    private Ataque at;
    private Pulo pu;
    private Corre co;
    private int life;
    private LifeState estado;
    
    public Personagem(){
        this.estado = new NormalLife(this);
        this.life = 70;
    }
    
    public void setAtaque(Ataque at){
        this.at = at;
    }
    
    public void setPulo(Pulo pu){
        this.pu = pu;
    }
    
    public void setCorre(Corre co){
        this.co = co;
    }
    
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public LifeState getEstado() {
        return estado;
    }

    public void setEstado(LifeState estado) {
        this.estado = estado;
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

    public void sofrerAtaque(int lifePerdida){
        System.out.println("Life anterior: " + this.life);
        estado.sofrerAtaque(lifePerdida);
        System.out.println("Life atual: " + this.life);

    }
    
    public void recolherRecompensa(int lifeGanha){
        System.out.println("Life anterior: " + this.life);
        estado.recolherRecompensa(lifeGanha);
        System.out.println("Life atual: " + this.life);
    }
    
    
}
