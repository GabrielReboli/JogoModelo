/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personagem;

import armas.Arma_IF;

/**
 *
 * @author alunolab08
 */
public abstract class Personagem {
    private Arma_IF arma;
     
    public abstract void desenhar();
        
    public void falar(){
        System.out.println("Falando...");
    }
    
    public void arma(){
        arma.usarArma();
    }
    
    public void setArma(Arma_IF arma){
     this.arma = arma;
    }
  

    public Arma_IF getArma() {
        return arma;
    }
    
    
    
    
}
