/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

// State
public abstract class LifeState {
    
    private Personagem personagem;
    private int lifeMinima;
    private int lifeMaxima;
    
    public LifeState(Personagem personagem){
        this.personagem = personagem;
        setLimites();
    }
    
    protected abstract void setLimites();
    protected abstract void verificarAlteracaoEstado();
    
    public void sofrerAtaque(int lifePerdida) {
        if(this.getPersonagem().getLife() - lifePerdida < 0){
            this.getPersonagem().setLife(0);
        }else{
            this.getPersonagem().setLife(this.getPersonagem().getLife() - lifePerdida);
        }
        this.verificarAlteracaoEstado();
    }

    public void recolherRecompensa(int lifeGanha) {
        if(this.getPersonagem().getLife() + lifeGanha > 100){
            this.getPersonagem().setLife(100);
        }else{
            this.getPersonagem().setLife(this.getPersonagem().getLife() + lifeGanha); 
        }
        this.verificarAlteracaoEstado();
    }

    public int getLifeMinima() {
        return lifeMinima;
    }

    public void setLifeMinima(int lifeMinima) {
        this.lifeMinima = lifeMinima;
    }

    public int getLifeMaxima() {
        return lifeMaxima;
    }

    public void setLifeMaxima(int lifeMaxima) {
        this.lifeMaxima = lifeMaxima;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }
    
}
