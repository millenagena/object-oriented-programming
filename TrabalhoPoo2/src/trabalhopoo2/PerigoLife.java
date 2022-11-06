/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 * @author mille
 */
public class PerigoLife extends LifeState{
    
    public PerigoLife(Personagem personagem){
        super(personagem);
        personagem.setCorre(new CorridaDevagar());
        personagem.setAtaque(new AtaqueFraco());
    }

    @Override
    protected void setLimites() {
        this.setLifeMinima(0);
        this.setLifeMaxima(30);
    }

    @Override
    protected void verificarAlteracaoEstado() {
        if(this.getPersonagem().getLife() <= this.getLifeMinima()){
            this.getPersonagem().setEstado(new MortoLife(this.getPersonagem()));            
        }else if(this.getPersonagem().getLife() > this.getLifeMaxima()){
            this.getPersonagem().setEstado(new NormalLife(this.getPersonagem()));
            this.getPersonagem().getEstado().verificarAlteracaoEstado();
        }
    }
}
