package cafejava;

import java.util.Scanner;

public class CafeJava {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        Integer opEscolha = 0;
        var cafe = new CriarCafe();
        
        while(true){
            
            System.out.println("|================================|");
            System.out.println("|  Seja Bem-vindo ao Cafe.Java!  |");
            System.out.println("|       Escolha uma opcao:       |");
            System.out.println("|       1 - Cafe Expresso        |");
            System.out.println("|       2 - Cappuccino           |");
            System.out.println("|================================|");
            opEscolha = ler.nextInt();

            cafe.criaCafe(opEscolha);
            cafe.descricaoCafe();        
        
        }
        
    }
    
}
