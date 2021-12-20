import java.util.*;

class Main {
  public static void main(String[] args) {
    Pila pila=new Pila();
		Scanner entra=new Scanner(System.in);
    /* Algoritmo de Quitar nros repetidos dentro de una pila.
    *Files: Main.java Admin.java Pila.java
    * Author Nordevelop
    */
    
		int n;
		Admin admin=new Admin();
		System.out.println("Ingrese un numero. Cero para terminar");
		n=entra.nextInt();
		while(n!=0){
			pila.poner(n);
			System.out.println("Ingrese un numero. Cero para terminar");
			n=entra.nextInt();
		}
		
		entra.close();
		
		admin.sacarRepetidos(pila);
		
		System.out.println("************************");
		System.out.println("Se muestran los numeros ingresados sin repeticiones: ");
		
		while(!pila.vacia())
			System.out.print(" " + pila.sacar()+ " -");
		
		System.out.println("");
		System.out.println("************************");
	
	}
}
    
