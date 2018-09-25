/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveis_processos_exercisi25.pkg09.pkg18;

/**
 *
 * @author llucn
 */
import java.io.IOException;
import java.util.Arrays;
public class Serveis_processos_exercisi250918 {

    /**
     * @param args the command line arguments
     * @throws serveis_processos_exercisi25.pkg09.pkg18.IOExeption
     */
    public static void main(String[] args) throws  IOException {
        if(args.length <=0){// si no hi ha cap programa s'executa tota l'estona aquesta exepció
            System.err.println("Se necessita un programa a executar");
            System.exit(-1);
            
        }
        
        ProcessBuilder pb = new ProcessBuilder(args);
        
        try{
                Process process = pb.start();
                int retorno= process.waitFor(); //aquest metode retorna inmediatament si el subprocess esta acabat,si el subprocess no ha acabat bloquetja el fil fins que aquest acabi
                        System.out.println("La execucio de "+ Arrays.toString(args)+" retorna "+retorno);// mostra tots els seus atributs 
                }catch(IOExeption ex){
                    System.err.println("Excepció de E/S!");
                    System.exit(-1);
                            
                    
                }catch(InterruptedExeption ex){
                    System.err.println("el proces fill ha finalitzat de forma incorrecta");
                    System.exit(-1);
                }

    }
    
}
