import java.util.Stack;

public class TesteDaPilha {
   public static void main(String args[]) {
	    Pilha pilha = new Pilha();
	    
	    pilha.insere("Thais");
	    
	    System.out.println(pilha);
	    
	    pilha.insere("Cristiano");
	    
	    
	    System.out.println(pilha);
	    
	    
	    String r1 =  pilha.remove();
	    System.out.println(r1);
	    
	    
	    String R2 = pilha.remove();
	    System.out.println(R2);
	    
	    
	    System.out.println(pilha.vazia());
	    
	    
	    Stack<String> stack = new Stack<String>();
	    
	    stack.push("Alexandre");
	    stack.push("Douglas");
	    
	    System.out.println(stack);
	    
	    System.out.println(stack.pop());
	    System.out.println(stack);
	    String nome = stack.peek();
	    
	    System.out.println(nome);
	    
   }
}
