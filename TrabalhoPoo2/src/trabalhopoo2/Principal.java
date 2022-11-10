/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhopoo2;

/**
 *
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // testando o Strategy
        Personagem1 p1 = new Personagem1();
        Personagem2 p2 = new Personagem2();
        Personagem3 p3 = new Personagem3();
        
        System.out.println("\n=== REALIZANDO ACOES (atacar, pular e correr) === \n");
        
        p1.atacar();
        p2.pular();
        p3.correr();
        
        p1.pular();
        p2.correr();
        p3.atacar();
        
        // testando o State
        
        System.out.println("\n=== ALTERANDO A LIFE (ganhando recompensa, sofrendo ataques) === \n");
        
        p1.sofrerAtaque(50); // vai pra perigo
        p1.recolherRecompensa(100); // vai pra forte
        p1.sofrerAtaque(40); // vai pra normal
        p1.sofrerAtaque(80); // vai pra morto
        
        // testando o chain of responsability
        
        System.out.println("\n=== UTILIZANDO OS ESCUDOS === \n");
        
        Personagem1 p4 = new Personagem1();
        
        p4.coletarEscudo("ouro", 1); // 10 de protecao
        p4.coletarEscudo("prata", 1); // 5 de protecao
        p4.coletarEscudo("bronze", 2); // 4 de protecao
        
        // instanciando os objetos da cadeia
        Escudo escudoOuro = new EscudoOuro();
        Escudo escudoPrata = new EscudoPrata();
        Escudo escudoBronze = new EscudoBronze();
        
        //  encadeando os objetos da cadeia
        escudoOuro.setSucessor(escudoPrata);
        escudoPrata.setSucessor(escudoBronze);
        escudoBronze.setSucessor(null);
        
        // processando os escudos
        escudoOuro.processaAtaque(p4, 60); // vai pra life perigo 29%
        escudoOuro.processaAtaque(p4, 100); // morreu
        
        System.out.println("\n======= TESTE DECORATOR ======\n");
        
        Ataque ataqueTeste = new AtaqueForte();
        ataqueTeste = new CruciatusCurse(ataqueTeste);
        ataqueTeste = new AvadaKedavraCurse(ataqueTeste);
        Personagem1 p7 = new Personagem1();
        p7.setAtaque(ataqueTeste);
        p7.atacar();


    }
    
}
