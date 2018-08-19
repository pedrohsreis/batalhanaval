/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

/**
 *
 * @author ice
 */
public class BatalhaNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pedro", 19, 1);
        Jogador jogador2 = new Jogador("João", 19, 2);
        Jogo jogo = new Jogo();
        int cont = 1;
        
        while(jogo.controleRodadas()){
            if(cont % 2 == 0){
                jogo.rodadas(jogador2);
            }
            if(cont % 2 != 0){
                jogo.rodadas(jogador1);
            }
            cont++;
        }
    }
    
}
