/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 * @author mille
 */
public class AvadaKedavraCurse extends AtaqueDecorador{
    public AvadaKedavraCurse(Ataque ataqueDecorador) {
        super(ataqueDecorador);
        setValorDano(30);
    }
}
