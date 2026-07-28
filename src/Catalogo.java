import java.util.Scanner;

public class Catalogo {

    public abstract class Caralogo_BackEnd   {
        String[] armazem = {"Harry Potter 1", "Harry Potter 2", "Harry Potter 4", "Harry Potter 6", "Five Nights at Freddys"};
        Scanner input = new Scanner(System.in);
        
        public void realizarBusca() {
            
            System.out.println("Pesquisar oq?");
            
            String pesquisa = input.next();

            for (int i = 0; i < armazem.length; i++) {
                if (armazem[i].contains(pesquisa)) {
                    System.out.println(armazem[i]);
                }
            }
        }
    }
}
