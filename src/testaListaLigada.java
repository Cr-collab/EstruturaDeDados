
public class testaListaLigada {
     public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
	    lista.adicionaNoComeco("mauricio");
		
        System.out.println(lista);
        lista.adicionaNoComeco("paulo");
        
        System.out.println(lista);
        
        lista.adicionaNoComeco("guilherme"); 
        System.out.println(lista);
        
        lista.adiciona("marcelo");
        System.out.println(lista);
        
        lista.adiciona(2, "gabriel");
        System.out.println(lista);
        
        
       System.out.println( lista.contem("jo�o"));
       
       lista.removeDoComeco();
       System.out.println(lista);
       
       lista.remove(2);
       System.out.println(lista);
		
		
	}
}
