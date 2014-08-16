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
        int dato = 0;
        int A[]= new int[10];
        int B[]= new int[10];
         
        llenar(A,B, dato);
             
         
         }
     public static void llenar(int [] A, int [] B, int dato){
             int i,j;
             i=0;
             j=0;
             while((i<10) || (j <10)){
                dato=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un dato") );
                if(dato>20){
                   for ( i = 0;i < 10;i++) {
                       A[i]=dato;

                   }
                }else{
                    for ( j = 0; j < 10; j++) {
                        B[j]=dato;
                    }
                }          

                }
             
     }  
         
    } 
         
    
    
