
public class VetorTesteReforco {
   public static void main(String[] args) {
	   Aluno a1 = new Aluno("Nayana");
	   Aluno a2 = new Aluno("Lorenzo");
	   Aluno a3 = new Aluno("Victor");
	   
	   Vetor lista = new Vetor();
	   
	   lista.adiciona(a1);
	   lista.adiciona(a2);
	   
	   System.out.println(lista);
	   System.out.println(lista.contem(a1));
	   System.out.println(lista.pega(1).getNome());
	   lista.adiciona(1, a3);
	   System.out.println(lista);
   }
}
