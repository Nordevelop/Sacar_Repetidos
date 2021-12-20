package misClases;

import java.util.*;

public class Admin {
	public void sacarRepetidos (Pila p)
	{
		Pila aux, fin;
		aux=new Pila();
		fin=new Pila();
		int n,n1;
		while (!p.vacia())
		{
			n=p.sacar();
			while(!p.vacia())
			{
				n1=p.sacar();
				if(n!=n1 )
					aux.poner(n1);
			}
			fin.poner(n);
			while(!aux.vacia())
			{
				p.poner(aux.sacar());
			}
			
		}
		while(!fin.vacia()){
			p.poner(fin.sacar());
		}
	}

}
