
public class TestaFila {
  public static void main(String args[]) {
	  Fila alunos = new Fila();
	  
	  alunos.adiciona("J�ao");
	  alunos.adiciona("Jesus");
	  
	  alunos.remove();
	  
	  System.out.println(alunos);
  }
}
