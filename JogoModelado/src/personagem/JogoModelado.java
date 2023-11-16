/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personagem;

import armas.*;


/**
 *
 * @author alunolab08
 */
public class JogoModelado {

   
    
    
    
    public static void main(String[] args) {
        
        General g = new General();
        Revolver r = new Revolver();
        Fuzil f = new Fuzil();
        Desarmado d = new Desarmado();
        g.setArma(d);
        g.arma();
        g.desenhar();
        
        
    }
    
}
