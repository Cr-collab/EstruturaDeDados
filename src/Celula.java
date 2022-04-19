

public class Celula {
   private Object elemento;
   private Celula anterior;
   private Celula proximo;
   
   public Celula(Object elemento) {
	   this.proximo = null;
	   this.elemento = elemento;
   }
   
   public Celula(Object elemento, Celula proximo) {
	    this.elemento = elemento;
	    this.proximo =  proximo;
   }
   
   
   public Object getElemento() {
	return elemento; 
   }
   
   public void setProximo(Celula proximo) {
	this.proximo = proximo;
   }
   
   public Celula getProximo() {
	return proximo;
   }
   
   public Celula getAnterior() {
	return anterior;
   }
   
   public void setAnterior(Celula anterior) {
	this.anterior = anterior;
   }
}

