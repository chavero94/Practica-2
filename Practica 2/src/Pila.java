import java.util.Scanner;
import java.util.Random;

public class Pila 
{
    private int tope,MAX;
    private String Pila[];
    public Pila(int M)
    
    {
        M=27;
        MAX=M;
        Pila=new String[MAX];
        tope=0;
    }

    private void Agregar(String d)
    {
        if(tope<MAX)
        
        {
         String[]abecedario={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y"," z"}; 
         int Aleatorio=(int)Math.round(Math.random()*27);
         String ABCAleatorio=(abecedario[Aleatorio]);
         Pila[tope]=ABCAleatorio;
         tope++;
         System.out.println("Dato añadido en la pila");
        }
        else
        {
            System.out.println("Esta llena");
        }
    }
    
    
    private void Eliminar()
    {
      if(tope>0)
      {
          tope--;
          System.out.println("Eliminado");
      }
      else
      {
          System.out.println("La pila esta vacia");
      }
    }
  private void Desplegar()
  {
     if(!Vacia())
     {
         for(int i=(tope-1);i>=0;i--)
         {
             System.out.println(Pila[i]);
         }
     }
     else
         System.out.println("Vacia");
  }
    
    private boolean Vacia()
    
    {
        if(Pila==null)
            return true;
        else return false;
    }
    
    private void LLenar(String a)
    {
        if(tope<MAX)
        {
                  String[]abc={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y"," z"};
           int AleatorioLetra=(int)Math.round(Math.random()*27);
           String Letras=(abc[AleatorioLetra]);
           Pila[tope]=Letras;
           tope++;
           System.out.println("Has agregado un dato");
        }
    }
    
    public static void main(String[] args) 
    {
     int b,opcion;
     String dato;
     System.out.println("\n Practica 1:Pila");
     Scanner teclado=new Scanner(System.in);
     System.out.println("De que tamaño es tu pila");
     b=teclado.nextInt();
     Pila Pila=new Pila(b);
     do
     {
         System.out.println("\n 1.-Llenar datos");
         System.out.println("\n 2.-Mostrar dato");
         System.out.println("\n 3.-Eliminar dato");
         System.out.println("\n 4.-Agregar datos");
         System.out.println("\n 5.-Salir de la pila");
         System.out.println("\n Escoge una opcion");
         opcion=teclado.nextInt();
         switch(opcion)
         {
             case 1:
             {
              
                 Scanner leer=new Scanner(System.in);
                    System.out.println("INGRESE EL NUMERO DE DATOS: ");
                    int x=leer.nextInt();
                    char[]datos=new char[x];
                    if(x>b)
                    {
                        System.out.println("\n Verifique sus datos");
                    }
                    else
                    {
                    for(int i=0;i<x;i++)
                    {
                       String[]abc={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y"," z"};
                    
                    int AleatoriaLetra=(int)Math.round(Math.random()*27);
                    Pila.Agregar(abc[AleatoriaLetra]);
                     
                    }
                    }
             break;    
             }
             
             case 2:
             {
                 Pila.Desplegar();
                 break;
             }
             case 3:
             {
             
                 Pila.Eliminar();
                 break;
             }
             
             
             
             case 4:
             {
               System.out.println("SE AGREGA EL DATO");
                 String[]abc={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y"," z"};
                 int AleatoriaLetra=(int)Math.round(Math.random()*27);
                 
                 Pila.LLenar(abc[AleatoriaLetra]);
                 break;
             }
             
             
             
             
             
         }
     }
     while(opcion!=5);
    }   
    
}
