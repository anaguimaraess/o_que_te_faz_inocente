import java.util.Scanner;

public class Jogo {
//Menu do jogo com 3 opções para o jogador.//
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int iniciar; 

        System.out.println("Inicio de Jogo");
        System.out.println("Menu do jogo \n\n << 1-Iniciar | 2-Personagens | 3-Créditos >>");
        System.out.println("História inicial");
        iniciar = input.nextInt();
     
//Usei o switch case para criar um menu de opções onde o jogador pode decidir se ele prefere ir direto ao jogo, informações sobre personagens ou créditos.//

    switch (iniciar) {
            case 1:
                System.out.println("Histórias");
                break;
            case 2:
                System.out.println("<<Opa, aqui você encontrar algumas informações sobre os personagens do nosso jogo e também algumas curiosidades!>>"
 + "\nPersonagens:\n"
 + "\n<================================================================================================================================================>\n"
 + "Jade: É uma garota de 18 anos, arrogante, egoista e que em algum momento de sua vida se envolveu com uma galera barra pesada,\n" +
 "e com isso arrumou muitos problemas e dito isso são esses problemas que vão direcionar a história do jogo. "
 + "\n<================================================================================================================================================>\n "
 + "Kevin: É um garoto de 17 anos, é um bom rapaz, que sempre busca ajudar as pessoas que ele gosta da forma como pode, "
 + "\ntem Tyler como seu melhor amigo e companheiro em jogos multiplayer."
 + "\n<================================================================================================================================================>\n"
 + "Tyler: É um garoto de 17 anos, viciado em jogos e animes, apaixonado por tecnologia,\n"
 + " é o melhor amigo de Kevin e o irmão mais novo da Jade é aquele cara que só quer jogar seu jogo em paz, mas acaba sendo arrastado para toda a trama do jogo."
 + "\n<================================================================================================================================================>\n");
                break;
            case 3:
                System.out.println("Opa, tudo bem, nós somos o grupo 10 e esse é o nosso projeto, "
 + "ele é um jogo de suspense onde você acompanha a história de 3 personagens, "
 + "\ncada um deles com sua personalidade própria, caso aja curiosidades, "
 + "é so ir no menu e escolher a opção 2,\nlá tem um breve resumo sobre cada um deles."
 + " \nO Nosso grupo é formado por 5 integrantes sendo eles: \n"
 + "<===================================>"
 + "\n->Ana Carolina Guimarães Sousa\n"
 + "<===================================>"
 + "\n->Barbara Vitoria Da Silva Santos\n"
 + "<===================================>"
 + "\n->Cleiton Ribeiro Da Silva\n"
 + "<===================================>"
 + "\n->Daniel Augusto Magalhães França\n"
 + "<===================================>"
 + "\n->Jenifer Mirela Sousa Alves\n"
 + "<===========================================>\n"
 + "Nosso jogo foi criado com muito entusiamos, carinho e dedicação, esperamos que você se divirta jogando igual a nós programando! (>.<) .");
                break;
               default:

    
    
}
}}

