package misClases;

import java.util.*;

public class ArraySeleccion {
	
		private long[] a;    // crea el Array  a[]
		private int nElementos;  // numero de elementos
		
		public ArraySeleccion(int max)  // constructor
		{
		a = new long[max];   // creacion del array
		nElementos = 0;    // variable inicial
		}
		
		public void inserccion(long valor) // agregar  elementos dento array
		{
		a[nElementos] = valor; // inserta elementos 
		nElementos++; // incrementa el tamaño del Array
		}
		
		public void mostrar() // muestra los elementos del Array
		{
		for(int j=0; j<nElementos; j++)   // (for each) bucle para desplazar por el Array ,
		    System.out.print(a[j] + " "); // mostrar el Array
		System.out.println(" ");
		}
		
		public void seleccionSort()
		{
		int salida, entrada, minimo;
		
		for(salida=0; salida<nElementos-1; salida++) // Fuera del bucle
		{
		minimo = salida; // minimo
		for(entrada=salida+1; entrada<nElementos; entrada++) //dentro del bucle
		   if(a[entrada] < a[minimo] )   // if minimo es mayor,
	        	minimo = entrada;
		 
		intercambio(salida, minimo);      // intercambio
		} // fin For
		} // fin del metodo seleccionSort()
		
		private void intercambio(int uno, int dos)
		{
		long aux = a[uno];
		a[uno] = a[dos];
		a[dos] = aux;
		}//fin metodo intercambio
	
		} // fin clase ArraySeleccion
