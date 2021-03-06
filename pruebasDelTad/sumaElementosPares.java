
package pruebasDelTad;

import tadPila.Pila;
import tadPila.PilaVacia;
import tadPila.TadPila;

public class sumaElementosPares {

	static int sumar (Pila pila) throws PilaVacia {
		int elem, resul;
		if (! pila.pilaVacia ()) {
			elem = pila.desapilar ();
                        if(elem%2==0)
                            resul = elem + sumar(pila);
                        else resul = sumar(pila);
			pila.apilar (elem);
		}
		else resul = 0;
		return resul;
	}
	public static void main (String [ ] args) throws PilaVacia {
		Pila pila1 = new TadPila(); 
		int num;	
		System.out.println();
                pila1.apilar(10);
                pila1.apilar(21);
                pila1.apilar(54);
                pila1.apilar(100);
		num = sumar(pila1);	
		System.out.println("Numero de elementos: " + num);	
	}
}
