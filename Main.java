import java.utils.*;

public class Main {

	public static void main(String[] args) {
		/*@Author Nordevelop
		 * Algoritmo de ordenamiento metodo de Seleccion
		 */
		int maxSize = 100;     // maximo tamaño del array 
		ArraySeleccion arr;     //variable de objetos de la clases ArraySeleccion
		arr = new ArraySeleccion(maxSize); // crea el  array
		arr.inserccion(19);
		arr.inserccion(16);
		arr.inserccion(11);
		arr.inserccion(6);
		arr.inserccion(5);  // insertar N elementos dentro del Array 
		arr.inserccion(4);
		arr.inserccion(2);
		arr.inserccion(3);
		arr.inserccion(1);
		arr.inserccion(8);                 
		System.out.println("Array Original ");
		arr.mostrar();   // muestra en pantalla el array desordenado
		System.out.println("Array Ordenado por Metodo de Seleccion");
		arr.seleccionSort();  // ordenar con metodo seleccionSort de la clase ArraySeleccion
		arr.mostrar();        //// muestra en pantalla el array ordenado con el algoritmo de seleccion.
		 
		

	}

}    // Fin de la clase Main
