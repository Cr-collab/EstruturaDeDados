
public class VetorTeste {
    public static void main(String[] args) {
    	 Aluno alunoJoão = new Aluno("João");
    	 Aluno alunoJose = new Aluno("Jose");
    	 
    	 Vetor lista = new Vetor();
    	 
    	 lista.adiciona(alunoJoão);
    	 System.err.println(lista.tamanho());
    	 lista.adiciona(alunoJose);
    	 System.err.println(lista.tamanho());
    	 
    	 System.out.println(lista);
    	 System.out.println(lista.contem(alunoJose));
    	 
    	 
    	 //System.out.println(lista.pega(1));
    	 
    	 Aluno alunoDanilo = new Aluno("Danilo");
    	 lista.adiciona(1, alunoDanilo);
    	 System.out.println(lista);
    	 
    	 
    	 
    }
}
