package pilas;

import tadPila.Pila;
import tadPila.PilaVacia;

public class sumaElemPares {
	public  int sumaElemPares (Pila D) throws PilaVacia {
		int elem, sumapares;
		if(!D.pilaVacia()){
			elem=D.desapilar();
                        if(elem%2==0)
                            sumapares = elem + sumaElemPares(D);
                        else sumapares = sumaElemPares(D);
			D.apilar(elem);
		}
                else sumapares = 0;
                return sumapares;
	 }

}
