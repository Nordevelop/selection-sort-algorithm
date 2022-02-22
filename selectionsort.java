package misClases;

import java.util.Arrays;
import java.utils.*;

public class Main{
  public static void main(String[] args) {
    /* Algoritmo de Ordenamiento por metodo Seleccion
    *  Author Nordevelop
    */
    int cont=15; 
    long aux;
    int a[]= {15,10,3,12,7,13,8,9,11,2,5,14,1,4,6}; //generacion del Array
    int temp;
    int entrada, salida, minimo;	  
    System.out.println("Array Desordenado ");
    for(int i=0;i< cont;i++) {
	System.out.print(a[i]);
	System.out.print(" ");
    } //end for (i)
    for(salida=0; salida<cont-1; salida++){ 
        minimo = salida; // minimo
        for(entrada=salida+1; entrada<cont; entrada++) { 
	    if(a[entrada] < a[minimo] )   // if minimo es mayor,
                 minimo = entrada;
	} //end for entrada
      /* Intercambiar el elemento con valor mínimo --> 
      * por la primera posición del array que todavia no está ordenado. 
      */
       temp = a[minimo]; 
       a[minimo] = a[salida]; 
       a[salida] = temp; 		 
       } // end for salida
       System.out.println(" ");
       System.out.println("Array Ordenado Con el metodo de Selección ");
       for (int j=0;j<cont;j++) {
            System.out.print(a[j] +" ");
            System.out.print(" ");
       } //end for (j)

  }
	
}	
