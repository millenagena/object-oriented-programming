/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 * @author mille
 */
public class NormalLife extends LifeState{
    
    public NormalLife(Personagem personagem){
        super(personagem);
    }
    
    @Override
    protected void setLimites(){
        this.setLifeMinima(30);
        this.setLifeMaxima(70);
    }
    
    @Override
    protected void verificarAlteracaoEstado() {
        if(this.getPersonagem().getLife() < this.getLifeMinima()){
            this.getPersonagem().setEstado(new PerigoLife(this.getPersonagem()));
            this.getPersonagem().getEstado().verificarAlteracaoEstado();
            
        }else if(this.getPersonagem().getLife() > this.getLifeMaxima()){
            this.getPersonagem().setEstado(new ForteLife(this.getPersonagem()));

        }
    }
    
}
