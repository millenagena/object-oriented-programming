/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 * @author mille
 */
public class CruciatusCurse extends AtaqueDecorador{
    public CruciatusCurse(Ataque ataqueDecorador) {
        super(ataqueDecorador);
        setValorDano(20);
        setDescricao("\nPoder usado: Cruciatus");
    }
    
}
