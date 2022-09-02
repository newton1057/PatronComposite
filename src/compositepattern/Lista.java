
package compositepattern;

import java.util.ArrayList;

public class Lista extends Composite{
    // Se realiza la simulacion de que se trata de un Directorio
    // Ejemplo     /Documents
    ArrayList<Composite> Objetos = new ArrayList();
    String NombreDirectorio;
    
    Lista(String NombreDirectorio){
        this.Tipo="Lista";
        this.NombreDirectorio=NombreDirectorio;
    }
    
    void Add(Composite A){
        Objetos.add(A); 
    }
    
    Lista get(int Index){
        
        return (Lista) Objetos.get(Index);
    }
    
    boolean Validar_Nodos(Lista A){
        if(A.Objetos.size()!=0){
            System.out.println("failed to remove " + A.NombreDirectorio +": Directory not empty");
            return true;
        }
        return false;
    }
}
