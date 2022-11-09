/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 *
 */
public class EscudoOuro extends Escudo{
    
    private int valorProtecao = 10;

    @Override
    public void processaAtaque(Personagem personagem, int valorAtaque) {
        
        int qntdProtecao = personagem.getQntdEscudoOuro() * valorProtecao;
        int restoAtaque = valorAtaque - qntdProtecao;
            
        // caso o personagem nao tenha nenhum dos outros escudos acumulados
        if((personagem.getQntdEscudoPrata() == 0) && (personagem.getQntdEscudoBronze() == 0)){
            personagem.sofrerAtaque(restoAtaque);
        }
        // caso tenha outros escudos acumulados
        else{
            getSucessor().processaAtaque(personagem, restoAtaque);
        }
    }
}
