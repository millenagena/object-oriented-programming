/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 * @author mille
 */
public class ForteLife extends LifeState{
    
    public ForteLife(Personagem personagem){
        super(personagem);
        personagem.setCorre(new CorridaRapida());
        personagem.setAtaque(new AtaqueForte());
    }

    @Override
    protected void setLimites() {
        this.setLifeMinima(70);
        this.setLifeMaxima(100);
    }

    @Override
    protected void verificarAlteracaoEstado() {
        if(this.getPersonagem().getLife() < this.getLifeMinima()){
            this.getPersonagem().setEstado(new NormalLife(this.getPersonagem()));
            this.getPersonagem().getEstado().verificarAlteracaoEstado();
        }
    }
}
