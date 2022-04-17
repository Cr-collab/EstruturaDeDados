
public class AlunoReforco {
  //Gradaremos o nome do aluno que que receberomos no construtor da classe 
   private String nome;
   // criando a variavel que armazenara o nome do nosso aluno
   public AlunoReforco(String nome) {
	   // criando o nosso contructor para receber o valor do nome na instancia do aluno
	   this.nome = nome;
   }
   
   //Criar getter para pegar o nosso nome e não dar acesso ao usuario 
   public String getNome() {
	return nome;
   }
   
   @Override
	public boolean equals(Object obj) {
		// O "equals" é o metodo que serve para comparar dois objetos, no caso alunos
	   
	    Aluno outro = (Aluno) obj;
	    // faremos o casting obj para aluno
		return outro.getNome().equals(this.nome);
	}
   
   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome;
	}
}
