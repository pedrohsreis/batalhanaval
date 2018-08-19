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
    Tabuleiro tabuleiroj1 = new Tabuleiro();
    Tabuleiro tabuleiroj2 = new Tabuleiro();
    
    Jogo() {
        System.out.println("Existem 40 posições possíveis");
        System.out.println("Cada tabuleiro possui 5 navios diferentes, cada um ocupando 3 posições do tabuleiro");
        System.out.println("Seu objetivo é afundar os navios do seu adversário, acertando as posições que eles ocupam\n");
    }
    
    boolean rodadas(Jogador jogador){
        if(jogador.getOrdemPlayer() == 1 && tabuleiroj2.isTabuleiroLimpo())
            return false;
        if(jogador.getOrdemPlayer() == 2 && tabuleiroj1.isTabuleiroLimpo())
            return false;
        numRodada++;
        System.out.println("Rodada " + numRodada);
        jogador.darPalpite();
        int palpite = jogador.getPalpite();
        
        if(jogador.getOrdemPlayer() == 1){
            if(tabuleiroj2.acertouNavio(palpite)){
                return true;
            }
        }
        if(jogador.getOrdemPlayer() == 2){
            if(tabuleiroj1.acertouNavio(palpite)){
                return true;
            }
        }
        return true;
    }
    boolean controleRodadas(){
        if(tabuleiroj2.isTabuleiroLimpo()){
            System.out.println("O jogador 1 venceu o jogo!");
            return false;
        }
        if(tabuleiroj1.isTabuleiroLimpo()){
            System.out.println("O jogador 2 venceu o jogo!");
            return false;
        }
        return true;
    }
}
