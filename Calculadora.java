
package calculadora;

import java.io.IOException;
import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.tan;
import java.util.Scanner;

public class Calculadora {

    
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       
        int op1=0,op2;
        double num1, num2, resultado = 0;
        
        for(;;){
            
            do{
                System.out.println("Bienvenido a calculadora\n\n");
                System.out.println("1.Operaciones basicas\n2.Raices y Potencias\n3.Funciones trigonometricas\n4.IVA\n5.Salir");
                op1 = in.nextInt();
            }while(op1<0 || op1>5);
            
            
            switch(op1){
                case 1:{
                    do{
                        System.out.println("1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\n");   op2= in.nextInt();
                    }while(op2<1 || op2>4);
                    
                    
                    switch(op2){
                        case 1:{
                            System.out.println("Ingrese el primer numero: ");    num1= in.nextDouble();
                            System.out.println("Ingrese el segundo numero: ");   num2= in.nextDouble();
                            resultado= num1 +num2;
                            break;
                        }
                        case 2:{
                            System.out.println("Ingrese el primer numero: ");    num1= in.nextDouble();
                            System.out.println("Ingrese el segundo numero: ");   num2= in.nextDouble();
                            resultado= num1-num2;
                            break;
                        }
                        case 3:{
                            System.out.println("Ingrese el primer numero: ");    num1= in.nextDouble();
                            System.out.println("Ingrese el segundo numero: ");   num2= in.nextDouble();
                            resultado= num1 *num2;
                            break;
                        }
                        case 4:{
                            System.out.println("Ingrese el primer numero: ");    num1= in.nextDouble();
                            
                            do{
                                System.out.println("Ingrese el segundo numero: ");   num2= in.nextDouble();
                                if(num2==0){
                                    System.out.println("!El dividendo no puede ser 0!");
                                }
                            }while(num2==0);
                            
                            resultado= num1 /num2;
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    do{  
                    System.out.println("1.Seno\n2.Coseno\n3.Tangente\n");   op2= in.nextInt();
                    }while(op2<1 || op2>3);
                    
                    switch(op2){
                        case 1:{
                            System.out.println("Ingrese el numero: ");    num1= in.nextDouble();
                            resultado= sin(num1);
                            break;
                        }
                        case 2:{
                           System.out.println("Ingrese el numero: ");    num1= in.nextDouble();
                            resultado= cos(num1);
                            break;
                        }
                        case 3:{
                           System.out.println("Ingrese el numero: ");    num1= in.nextDouble();
                            resultado= tan(num1);
                            break;
                        }
                    }
                    break;
                }
                case 3:{
                    do{
                    System.out.println("1.Potencia\n2.Raiz\n");   op2= in.nextInt();
                    }while(op2<1 || op2>2);
                     
  
                    switch(op2){
                        case 1:{
                            System.out.println("Ingrese la base: ");    num1= in.nextDouble();
                            System.out.println("Ingrese el exponete: ");   num2= in.nextDouble();
                            resultado= pow(num1,num2);
                            break;
                        }
                        case 2:{
                            System.out.println("Ingrese la base: ");    num1= in.nextDouble();
                            System.out.println("Ingrese el valor de la raiz: ");   num2= in.nextDouble();
                            num2= (1/num2);
                            resultado= pow(num1,num2);
                            break;
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.println("Ingrese el valor: ");   num1= in.nextDouble();
                    System.out.println("Ingrese el valor del porcentaje IVA");   num2= in.nextDouble();
                    
                    resultado= num1*(num2/100);
                    
                    break;
                }
            }
            System.out.println("El resultado es: "+ resultado);
            
            System.in.read();
            
            if(op1==5){
                break;
            }
            System.out.println("¿Desea continuar?:\n1.SI\n2.No");  op1= in.nextInt();
            
            if(op1==2){
                break;
            }
            
           
        }
    }
    
}
