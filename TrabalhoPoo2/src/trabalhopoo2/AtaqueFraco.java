/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 */
public class AtaqueFraco extends Ataque {
    
    public AtaqueFraco(){
        setValorDano(5);
    }
    
    @Override
    public void atacar(){
        System.out.println("ATACANDO FRACO: " + getValorDano());
    }
}
