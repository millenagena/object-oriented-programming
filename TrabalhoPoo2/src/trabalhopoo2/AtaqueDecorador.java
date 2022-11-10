/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 * @author mille
 */
public abstract class AtaqueDecorador extends Ataque{
    
    private Ataque ataqueDecorado;
    
    public AtaqueDecorador(Ataque ataqueDecorado){
        this.ataqueDecorado = ataqueDecorado;
    }

    @Override
    public int getValorDano() {
        return ataqueDecorado.getValorDano() + super.getValorDano();
    }
    
    @Override
    public String getDescricao() {
        return ataqueDecorado.getDescricao() + super.getDescricao();
    }
    
    @Override
    public void atacar(){
        System.out.println(getDescricao());
        System.out.println("valor dano: " + getValorDano());
//        super.atacar();
//        return ("Atacando Usando poder, valor: "+ getValorDano()+"\n");
    }
    
    
}
