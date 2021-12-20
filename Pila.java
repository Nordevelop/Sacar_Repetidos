package misClases;
	import java.util.*;
	public class Pila {
		
		private Stack<Integer> p=null;
		
		public Pila(){
			p=new Stack<Integer>();
		}
		
		public void poner(Integer x){
			p.add(x);
		}
		public Integer sacar(){
			
			return this.p.pop();
		}
		public Integer ver(){
			return this.p.peek();
		}
	public boolean vacia(){
		return(this.p.size()==0);
	}
	}
