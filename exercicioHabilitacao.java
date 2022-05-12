import java.util.Scanner;
//importando a biblioteca scanner.

 class Habilitacao
 
 {
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        //criando o scanner.
        
        int p,l,d;
        //criando as variaveis.
        
        System.out.print("Digite o numero 1 se voce foi aprovado no exame piscotecnico ou 2 se foi reprovado: "); 
        //mensagem que ira aparecer para o usuario.
        p = ler.nextInt();
        //recebendo o numero digitado.
        System.out.print("Digite o numero 1 se voce foi aprovado no exame legislacao ou 2 se foi reprovado: ");
        //nova mensagem que ira aparecer para o usuario.
        l = ler.nextInt();
        //recebendo novo numero digitado.
        System.out.print("digite o numero 1 se voce foi aprovado no exame de direcao ou 2 se foi reprovado: ");
        //nova mensagem que ira aparecer para o usuario.
        d = ler.nextInt();
        //recebendo novo numero digitado.
        
        if (p==1 && l==1 && d==1)
        //criando uma condicao que compara os numeros digitados.
        { 
            System.out.printf("voce ja pode solicitar a sua habilitacao.");
            //se a resposta for verdadeira a tela exibe essa mensagem.
        }
        
        else       
        
            System.out.printf("voce ainda nao pode solicitar sua habilitacao.");
            //se a resposta for falsa a tela exibe essa mensagem.
     }   
}


