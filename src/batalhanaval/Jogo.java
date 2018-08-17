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
public class Jogo {
    int numRodada = 0;
    
    Jogo() {
        System.out.println("Existem 20 posições possíveis");
        System.out.println("3 delas são ocupadas pelo navio");
        System.out.println("Seu objetivo é afundar o navio, acertando as posições que ele ocupa\n");
    }
    
    boolean rodadas(Navio navio, Jogador jogador){
        numRodada++;
        System.out.println("Rodada " + numRodada);
        jogador.darPalpite();
        int palpite = jogador.getPalpite();
        boolean verificaPalpite;
        
        if(!navio.estaDestruido()){
            System.out.println("Verificando palpite...");
            verificaPalpite = navio.verificaAcerto(palpite);
            if(verificaPalpite){
                System.out.println("Você acertou o navio: " + navio.getNomeNavio() + "\n");
            }else {
                System.out.println("Você errou.\n");
            }
        }
        if(navio.estaDestruido()) {
            System.out.println("O navio foi destruído, você venceu!");
            return true;
        }
        return false;
    }
    
}
