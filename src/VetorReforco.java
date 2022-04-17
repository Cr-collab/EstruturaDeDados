
public class VetorReforco {
   private Aluno[] alunos = new Aluno[100];
   // craindo um array que recebera os alunos e tera 100 posi��es inicialmente
   private int totalDeAlunos = 0;
   
   
   private void garanteEspa�o() {
	   if(totalDeAlunos == alunos.length) {
		   Aluno[] novoArray =  new Aluno[alunos.length * 2];
		   
		   for(int i = 0; i < alunos.length; i++) {
			   novoArray[i] = alunos[i];
		   }
		   
		   this.alunos =  novoArray;
	   }
   }
   
   public void adicona(Aluno aluno) {
	  
	   /**
	    * for(int i = 0; i < this.alunos.length; i++) {
		   if(this.alunos[i] == null) {
			   this.alunos[i] = aluno;
		   }
	      }
	    * */
	   if(totalDeAlunos == this.alunos.length) {
		  garanteEspa�o();
	   }
	   this.alunos[totalDeAlunos] = aluno;
	   totalDeAlunos++;
   }
   
   public void adicona(int posicao ,Aluno aluno) {
	   if(totalDeAlunos == this.alunos.length) {
			  garanteEspa�o();
		}
	   
	   if(!posicoesValida(posicao)) {
		   throw new IllegalArgumentException("posic�o invalida");
	   }
	   
	   for(int i = totalDeAlunos; i >= posicao; i -= 1) {
		   alunos[i+1] = alunos[i];
	   }
	   
	   this.alunos[totalDeAlunos] = aluno;
	   totalDeAlunos++;
   }
   
   private boolean posicoesValida(int posicao) {
	   return (posicao >= 0 && posicao <= this.totalDeAlunos);
   }
   
   private boolean posicoesOcupada(int posicao) {
	   return (posicao >= 0 && posicao < this.totalDeAlunos);
   }
   
   public Aluno pega(int posicao) {
       //recebe uma posi��o e devolve o aluno
	   if(!posicoesOcupada(posicao)) {
		   throw new IllegalArgumentException("posic�o invalida");
	   }
	   
       return this.alunos[posicao];
   }
   
   public int tamanho() {
       return totalDeAlunos;
   }

   public void remove(int posicao) {
       //remove pela posi��o
   }

   public boolean contem(Aluno aluno) {
       for(int i =0; i < totalDeAlunos; i++) {
    	    if(aluno.equals(this.alunos[i])) {
    	    	return true;
    	    }
       }
       return false;
   }
   
}
