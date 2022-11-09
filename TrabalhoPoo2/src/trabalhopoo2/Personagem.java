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
    private int qntdEscudoOuro;
    private int qntdEscudoPrata;
    private int qntdEscudoBronze;

    
    public Personagem(){
        this.estado = new NormalLife(this);
        this.life = 70;
        this.qntdEscudoOuro = 0;
        this.qntdEscudoPrata = 0;
        this.qntdEscudoBronze = 0;
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
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public LifeState getEstado() {
        return this.estado;
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

    public int getQntdEscudoOuro() {
        return qntdEscudoOuro;
    }

    public void setQntdEscudoOuro(int qntdEscudoOuro) {
        this.qntdEscudoOuro = qntdEscudoOuro;
    }

    public int getQntdEscudoPrata() {
        return qntdEscudoPrata;
    }

    public void setQntdEscudoPrata(int qntdEscudoPrata) {
        this.qntdEscudoPrata = qntdEscudoPrata;
    }

    public int getQntdEscudoBronze() {
        return qntdEscudoBronze;
    }

    public void setQntdEscudoBronze(int qntdEscudoBronze) {
        this.qntdEscudoBronze = qntdEscudoBronze;
    }

    public void sofrerAtaque(int valorAtaque){
        System.out.println("Life anterior: " + this.life);
        estado.sofrerAtaque(valorAtaque);
        System.out.println("Life atual: " + this.life);
        System.out.println("Estado de life atual: " + this.estado.getClass().getSimpleName());
        System.out.println("Tipo ataque: " + this.at.getClass().getSimpleName());
        System.out.println("Tipo Corrida: " + this.co.getClass().getSimpleName() + "\n");
    }
    
    public void recolherRecompensa(int lifeGanha){
        System.out.println("Life anterior: " + this.life);
        estado.recolherRecompensa(lifeGanha);
        System.out.println("Life atual: " + this.life);
        System.out.println("Estado de life atual: " + this.estado.getClass().getSimpleName());
        System.out.println("Tipo ataque: " + this.at.getClass().getSimpleName());
        System.out.println("Tipo Corrida: " + this.co.getClass().getSimpleName() + "\n");
    }
    
    public void coletarEscudo(String tipoEscudo, int qntdColetada){
        if(tipoEscudo.equalsIgnoreCase("ouro")){
            this.qntdEscudoOuro += qntdColetada;
        }else if(tipoEscudo.equalsIgnoreCase("prata")){
            this.qntdEscudoPrata += qntdColetada;
        }else{
            qntdEscudoBronze += qntdColetada;
        }
    }
}
