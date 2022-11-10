/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 * @author mille
 */
public class ImperioCurse extends AtaqueDecorador{

    public ImperioCurse(Ataque ataqueDecorador) {
        super(ataqueDecorador);
        setValorDano(10);
        setDescricao("\n Poder: Imperio");
    }
    
}
