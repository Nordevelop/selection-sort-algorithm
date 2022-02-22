package misClases;

import java.util.Arrays;
import java.utils.*;

public class Main{
  public static void main(String[] args) {
    /* Algoritmo de Ordenamiento por metodo Seleccion
    *  Author Nordevelop
    */
    int cont= 15;
    long aux;
    int a[]={15,10,3,12,7,13,8,9,11,2,5,14,1,4,6};
    int entrada, salida, minimo, temp;
    System.out.println("Array Desordenado");
       for(int i=0;i<cont;i++){
         System.out.print(a[i]);
				 System.out.print(" ");
       }//end For
    for(salida=0;salida < cont;salida++){
       if (a[entrada]< a[minimo])
          minimo =entrada;
       for(entrada=salida+1;entrada <cont; entrada++){
           if(a[entrada] < a[minimo] )   
				   	 minimo = entrada;
       }//end for entrada
      //intercambio
       temp = a[minimo]; 
		   a[minimo] = a[salida]; 
		   a[salida] = temp;
    }//end for (salida)
    System.out.println(" ");
		System.out.println("Array Ordenado Con el metodo de Seleccion ");
		for (int j=0;j<cont;j++) {
			System.out.print(a[j] +"");
			System.out.print(" ");
    }
     
  
  }
}
