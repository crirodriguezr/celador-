package parqueaderocelador;
public class ParqueaderoCelador {
    
    public static void main(String[] args) {

       CeladorGrosero HombreSobrio=new CeladorGrosero();
     CeladorGrosero HombreEbrio=new CeladorGrosero();
          CeladorGrosero MujerSobria=new CeladorGrosero();
          CeladorGrosero MujerEbria=new CeladorGrosero();
        
          
         System.out.println("*Llega hombre sobrio*");
         System.out.println();
        HombreSobrio.saludar(true);
        System.out.println("*Llega Hombre ebrio*");
        System.out.println();
        HombreEbrio.saludar(true,true);
        System.out.println("*Llega Mujer Sobria*");
        System.out.println();
        MujerSobria.saludar(false);
        System.out.println("*Llega Mujer Ebria*");
        System.out.println();
        MujerEbria.saludar(true,false);
        
        
        
        
        
        
    }
    
}
