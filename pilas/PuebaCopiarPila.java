package pilas;

import tadPila.Pila;
import tadPila.PilaVacia;
import tadPila.TadPila;

public class PuebaCopiarPila {
	
  public static void main (String[] args) throws PilaVacia {
	  Pila O = new TadPila ();
	  Pila D = new TadPila ();
	  int i,j,x=0;
	  O.apilar (1);
		O.apilar (2);
		O.apilar (3);
		O.apilar (11);
		O.apilar (15);
	  copiarPila(O, D);
		O.imprimirPila();
		D.imprimirPila();
  }
  
  public static void copiarPila(Pila O, Pila D) throws PilaVacia {
	  int j;
	  if(!O.pilaVacia()){
		 j = O.desapilar();
	     copiarPila(O, D);
		 O.apilar();
		 D.apilar();
	  }
  }

public static int sumaElementos(Pila D) throws PilaVacia {
	int elem,suma=0;
	if(!D.pilaVacia()){
		elem=D.desapilar();
		suma = elem + sumaElementos(D);
		D.apilar(elem);
	}
	return suma;
 }

public static int sumaElemPares(Pila D) throws PilaVacia {
int elem,sumapares=0,i=0;
if(!D.pilaVacia()){
	while(i<10){
	elem=D.desapilar();
	sumapares = elem + sumaElemPares(D);
	D.apilar(elem);
	i=i+2;
         }
     }
return sumapares;

    }
	
}
	   
