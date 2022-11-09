/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 * @author mille
 */
public class EscudoBronze extends Escudo{
    
    private int valorProtecao = 2;

    @Override
    public void processaAtaque(Personagem personagem, int valorAtaque) {
        int qntdProtecao = personagem.getQntdEscudoBronze() * valorProtecao;
        int restoAtaque = valorAtaque - qntdProtecao;
            
        if(getSucessor() == null){
            personagem.sofrerAtaque(restoAtaque);
        }
    }   
}
