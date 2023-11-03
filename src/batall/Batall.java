/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package batall;

/**
 *
 * @author APRENDIZ
 */
public class Batall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dl1=0,dl2=0;    
   
    Luchador l1 = new Luchador("Alejandro",200,100,90,60);
    Luchador l2 = new Luchador("Pepe",200,100,90,60);
   
   while(l1.getHp()>0 && l2.getHp()>0)
    {
      dl1 = (int) (Math.random() * (6 - 1+1)) + 1;//dado luchador 1  
      dl2 = (int) (Math.random() * (6 - 1+1)) + 1;//dadoluchador 2      
     
      System.out.println("Tiro de dados para turno.....");
      System.out.println("Dado luchador 1: "+dl1);
      System.out.println("Dado luchador 2: "+dl2);
      System.out.println(" ");
         
      if(dl1>dl2){
         System.out.println("Gano luchador 1 pega:");
         System.out.println("Ataca:"+l1.getNombre());
         l1.atacarLuchador(l2);
        }
      else if(dl2>dl1){
         System.out.println("Gano luchador 2 pega:");
         System.out.println("Ataca:"+l2.getNombre());
         l2.atacarLuchador(l1);
        }
    }
   //Se imprimen en pantalla los valores finales:
    System.out.println(" ");
    System.out.println("Alejandro: "+l1.getHp());
    System.out.println("Pepe: "+l2.getHp());
   
    }
    
}
