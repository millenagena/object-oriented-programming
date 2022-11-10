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
    private String descricao;

    public int getValorDano() {
        return this.valorDano;
    }

    public void setValorDano(int valorDano) {
        this.valorDano = valorDano;
    }
    
    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void atacar(){
        System.out.println(getDescricao());
        System.out.println(getValorDano());
    }
}
