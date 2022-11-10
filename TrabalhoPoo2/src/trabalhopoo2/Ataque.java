/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 */
public abstract class Ataque {
    
    private int valorDano;

    public int getValorDano() {
        return this.valorDano;
    }

    public void setValorDano(int valorDano) {
        this.valorDano = valorDano;
    }
    
    public abstract void atacar();
}
