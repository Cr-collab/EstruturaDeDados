
public class Aluno {
	/*
	 *  A primeira estrutura de dados que eu vou mostrar para voc� � o que n�s chamamos de armazenamento sequencial.
	 *  Qual � a ideia? A ideia � guardar um aluno atr�s do outro, ent�o eu vou ter um conjunto
	 *   de espa�os e eu vou colocar o primeiro aluno 
	 *  no primeiro espa�o, o segundo aluno no segundo espa�o e assim por diante.
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
