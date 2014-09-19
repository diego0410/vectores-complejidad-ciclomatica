/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vectores;
import javax.swing.*;

/**
 *
 * Programa creado po Juan Camilo Hernandez y utilizado por Diego Vanegas para la actividad
 * de complejidad ciclomatica.
 
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int dato = 0;
        int A[]= new int[10];//En este arreglo deben ir los numeros mayores a 20
        int B[]= new int[10];//En este arreglo deben ir los numeros menores a 20 
         
        llenar(A,B); // se llama el metodo llenar para ingresar los valores a los vectores A y B
        
             
         
         }
     public static void llenar(int [] A, int [] B){ //Metodo para llenar los arreglos 
             int i,j,dato;
             i=0;
             j=0;
             
                         
             
                
                   while((i<10)||(j<10)) { //se usa i y j para manejar como se van llenando los arreglos de forma independiente                   
                       
                        dato=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un dato") );
                         if(dato>20 && i<10){
                            A[i]=dato;
                            i++;
                            if(i==10){
                                JOptionPane.showMessageDialog(null,"El vector A está lleno, por favor \n a partir "
                                        + "de ahora ingrese numeros menores a 20, así quedó el vector A:");
                                imprimir(A);
                                         
                            }
                             
                         }else if(dato < 20 && j<10){
                             B[j]=dato; 
                             j++;
                             if(j==10){
                                JOptionPane.showMessageDialog(null,"El vector B está lleno, por favor \n a partir "
                                        + "de ahora ingrese numeros mayores a 20, así quedó el vector B");
                                imprimir(B);
                                         
                            }
                         }
                    } 
                     
             
      }
     
     public static void imprimir(int vecresultado[]){//metodo para imprimir arreglo
             int i;
             i=0;
             String cadena="";
                          
            for ( i = 0;i < 10;i++) {
                cadena=" "+" "+cadena+vecresultado[i]+" "+" ";
            }
            JOptionPane.showMessageDialog(null,cadena);            
       }
    
         
   }
         
    
    
