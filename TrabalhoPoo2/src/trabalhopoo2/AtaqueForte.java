/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 */
public class AtaqueForte extends Ataque {
    
    public AtaqueForte(){
        setValorDano(10);
    }
    
    @Override
    public void atacar(){
        System.out.println("ATACANDO FORTEEE: " + getValorDano());
    }
}
