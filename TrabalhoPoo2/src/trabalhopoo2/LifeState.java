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
        this.getPersonagem().setLife(this.getPersonagem().getLife() - lifePerdida);
    }

    public void recolherRecompensa(int lifeGanha) {
        this.getPersonagem().setLife(this.getPersonagem().getLife() + lifeGanha);
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
