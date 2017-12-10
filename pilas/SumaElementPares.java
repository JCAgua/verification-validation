package pilas;

import tadPila.Pila;
import tadPila.PilaVacia;

public class SumaElementPares {
		public int sumaElementPares (Pila D) throws PilaVacia {
			int elem, suma;
			if(!D.pilaVacia()){
				elem = D.desapilar();
                                if(elem%2==0)
                                    suma = elem + sumaElementPares(D);
                                else suma = sumaElementPares(D);
				D.apilar(elem);
			}
                        else suma = 0;
			return suma;
			
	}
	}



