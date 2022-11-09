/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 * @author mille
 */
public class EscudoPrata extends Escudo{

    private int valorProtecao = 5;

    @Override
    public void processaAtaque(Personagem personagem, int valorAtaque) {
        int qntdProtecao = personagem.getQntdEscudoPrata() * valorProtecao;
        int restoAtaque = valorAtaque - qntdProtecao;
            
        // caso o personagem nao tenha nenhum dos outros escudos acumulados
        if(personagem.getQntdEscudoBronze() == 0){
            personagem.sofrerAtaque(restoAtaque);
        }
        // caso tenha outros escudos acumulados
        else{
            getSucessor().processaAtaque(personagem, restoAtaque);
        }
    }    
}
