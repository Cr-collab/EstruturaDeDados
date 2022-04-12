
public class Aluno {
	/*
	 *  A primeira estrutura de dados que eu vou mostrar para você é o que nós chamamos de armazenamento sequencial.
	 *  Qual é a ideia? A ideia é guardar um aluno atrás do outro, então eu vou ter um conjunto
	 *   de espaços e eu vou colocar o primeiro aluno 
	 *  no primeiro espaço, o segundo aluno no segundo espaço e assim por diante.
	 * */
	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null) return false;
		Aluno outro = (Aluno) obj;
		return outro.getNome().equals(this.nome);	
    }

}
