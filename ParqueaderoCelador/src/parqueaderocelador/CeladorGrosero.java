package parqueaderocelador;
public class CeladorGrosero {
    
    boolean sobriedad;
    boolean genero;
    boolean gafas;
    
void saludar(){
  System.out.println("Buenos dias Doctor");
}



void saludar(boolean genero){     
  if(genero==true){
      System.out.println("Buen dia doctor");
      }else{
       System.out.println("Que ricooo");
      }
   
  }

void saludar(boolean ebriedad,boolean genero){
    if(genero==true){
    if(sobriedad==true){
        System.out.println("Buen dia doctor");
        
    }else{
         System.out.println("¡¡Larguese de aqui!!");
    }
    
      }else{
       System.out.println("Que ricooo");
         if(sobriedad==false){
          System.out.println("¡¡Larguese de aqui!!");
         }
      }
    
}

}



