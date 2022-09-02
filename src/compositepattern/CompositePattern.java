
package compositepattern;

public class CompositePattern {

    public static void main(String[] args) {
        
        //Nivel 0
        Lista Disco_Duro = new Lista("C:");
        
        //Nivel 1
        Disco_Duro.Add(new Hoja("Alumnos.txt"));
        
        Hoja var = new Hoja("mysql-init.txt");
        Disco_Duro.Add(var);
        Disco_Duro.Add(new Lista("/Adobe"));
        Disco_Duro.get(2).Add(new Hoja("Alumnos.txt"));
        
                
        Disco_Duro.PrintAllDirec(Disco_Duro);
        Disco_Duro.Validar_Nodos(Disco_Duro.get(2));
        
        Disco_Duro.DeleteAll(Disco_Duro, 2);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("*************************************");
        Disco_Duro.PrintAllDirec(Disco_Duro);
        
        Disco_Duro.DeleteAll(Disco_Duro.get(2), 0);
        Disco_Duro.DeleteAll(Disco_Duro, 2);
        Disco_Duro.PrintAllDirec(Disco_Duro);
        
    }
    
}
