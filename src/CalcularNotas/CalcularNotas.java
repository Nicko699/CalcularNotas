
package actividad2;

import java.util.Scanner;


public class Actividad2 {

    public static void main(String[] args) {
        //declarar variables
        double notas [][]= new double[6][6];
        double sumarnota=0.0;
        //ingresar datos
        Scanner teclado= new Scanner(System.in);
        for(int f=1;f<5;f++){
            for(int c=1;c<5;c++){
                System.out.println("Ingrese la nota del estudiante N°" + f);
                notas[f][c]=teclado.nextDouble();
                
               sumarnota+=notas[f][c];
                
        //correr código                
            }
           notas[f][5]= sumarnota/4;
           //siempre si hay varios estudiantes para calcular notas, 0.0 para volver a reiniciar.
           sumarnota=0.0;
        }
       
       for(int f=1;f<5;f++){
           System.out.println("las notas del estudiante N°" + f + " son: " );
       
            for(int c=1;c<5;c++){
                System.out.println("Nota N° " + c + " "+ notas[f][c]);
                
                    
                }
 
    
        System.out.println("El promedio para el estudiante N°" + f +" es " + notas[f][5]);
        //aprobado o reprobado
        if(notas[f][5]<30){
            System.out.println("Reprobado");}
            else{
                    if(notas[f][5]>=30){
                        System.out.println("Aprobado");
                    }
        }
                System.out.println("--------------------------");    

       }
    }
}
        //utilizé 4 variables; 2 tipo int y 2 tipo double.
//un Scanner para que el usuario pueda escribir las notas a su voluntad.
//un bucle for para cuando termine de calcular el primer  promedio del primer estudiante siga al segundo.
//utilizé arrays para guardar los datos que ingresaron y despues devolverlos, en este caso matríz.
//un if-else para complir una condición, aprobaban o reprobaban?
//Nicko