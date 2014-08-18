/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vectores;
import javax.swing.*;

/**
 *
 * @author 12
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int dato = 0;
        int A[]= new int[10];
        int B[]= new int[10];
         
        llenar(A,B);
        
             
         
         }
     public static void llenar(int [] A, int [] B/*, int dato*/){
             int i,j,dato,dato2;
             i=0;
             j=0;
             
                         
             
                
                   while((i<10)||(j<10)) {                    
                       
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
     
     public static void imprimir(int A[]){
             int i;
             i=0;
             String cadena="";
                          
            for ( i = 0;i < 10;i++) {
                cadena=" "+" "+cadena+A[i]+" "+" ";
            }
            JOptionPane.showMessageDialog(null,cadena);            
       }
    
         
   }
         
    
    
