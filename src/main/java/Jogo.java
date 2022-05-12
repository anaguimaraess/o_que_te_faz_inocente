
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Jogo {
    //Menu do jogo com 5 opções para o jogador.//
    public static void main(String[] args) throws InterruptedException{
        Scanner input = new Scanner(System.in);
        int iniciar;
        do {
            System.out.println("<----------------->\n"
                    + ">>Inicio de Jogo!<<\n"
                    + "<<==============>>");
            System.out.println(" >>Menu do jogo<< \n<<==============>>"
                    + "\n\n <<= 1-Iniciar | 2-Informações | 3-Personagens | 4-Créditos | 5-Fechar jogo =>>");
            iniciar = input.nextInt();

//Usei o switch case para criar um menu de opções onde o jogador pode decidir se ele prefere ir direto ao jogo, informações sobre personagens e etc.//

            switch (iniciar) {
                case 1:
                    System.out.println("Começo da História");

                    /*
                             Primeira parte história 3 ate o primeiro desafio.
                    boolean condicaoResposta = false; int tentativas = 0, erroJogadas=0,acertos=0;
                    System.out.println("Enquanto Kevin se prepara para jogar, Tyler que perdeu no “perguntados”, diz que vai para a cozinha, \n" +
                    "nisso Kevin pega o controle e esperar subir vídeo para jogar. \n" +
                    "Enquanto Tyler vai para a cozinha, no meio do caminho ele houve um barulho estranho" +
                    " vindo do quarto da sua irmã e vai ver o que está acontecendo \n");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("TYLER: Oooooow, que barulho é esse, vai quebrar a casa é? \n");
                    //System.out.println("apter enter pra contiar ver a historia...");
                    //String String = sc.nextLine();
                    TimeUnit.SECONDS.sleep(4);
                    System.out.println("JADE: Fica na sua, e não se mete !!!\n\n");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println ("Tyler observa o quarto vtodo bagunçado, e vê no chão o celular de jade meio escondido no meio de alguns papeis, \n" +
                            "então sem jade perceber ele pega o celular dela e vê que tem várias \n" +
                            "chamadas e mensagens de Kevin e acha estranho ");
                    System.out.println("________DESAFIO________\n\n" + //primeiro desafio da história 3
                            "Tyler movido pela sua curiosidade pega o celular de sua irmã\n" +
                            "para acessa-lo preisar descobrir a senha. \n" +
                            "A senha foi criada  com base nos algarismos romanos\n" +
                            "e na seguinte senquencia \n" +
                            "Maria\n" +
                            "jaDe\n" +
                            "tayLer\n" +
                            "keVIn\n");
                    while (!condicaoResposta){
                        System.out.println("Qual é senha para acessar o celular da Jade:");
                        int resposta=sc.nextInt();
                        if (resposta==1556){
                            System.out.println("celular desbloqueado\n");
                            condicaoResposta=true;
                            acertos=acertos+1;
                        }else {
                            System.out.println("Senha incorreta\n");
                            if (tentativas==2){
                                System.out.println("dica");
                            }
                            tentativas+=tentativas;
                            erroJogadas+=erroJogadas;
                        }
                    }
                    System.out.println("Tyler vê no celular que pela foto de perfil que não é Kevin mandando as mensagens,\n" +
                            " mas alguém com que Jade já tinha se envolvido no passado e que contribuiu para que ela se envolvesse com coisas erradas");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("TYLER: Você voltou a se envolver com esse cara ? Você enlouqueceu!!?");
                    TimeUnit.SECONDS.sleep(4);
                    System.out.println("JADE : Não é da sua conta o que eu faço da minha vida! ");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(" TYLER: É quando causa problemas para dentro de casa, igual da última vez ");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("....");
                    System.out.println ("Enquanto Tyler e Jade discutem, Kevin que estava tentando jogar videogame vê que está demorando demais para o jogo iniciar e decide ir atras de Tyler \n " +
                            "para avisar que o jogo pode estar com problemas e nisso ele acaba ouvindo a discussão de Tyler e Jade  ");
                    */
                    break;

                case 2:System.out.println("\n  <<Aqui vai algumas informações básicas sobre o jogo.>>\n"
                        + "\n<======================================================================================================================================================>\n"
                        + "  Opa, tudo bem, nós somos o grupo 10 e esse é o nosso projeto, "
                        + "ele é um jogo de suspense onde você acompanha a história de 3 personagens, "
                        + "\ncada um deles com sua personalidade própria, caso aja curiosidades, "
                        + "é so ir no menu e escolher a opção 2,\nlá tem um breve resumo sobre cada um deles."
                        + "O nosso jogo é um suspense onde as decisões do usuário definem o rumo que a história vai seguir,\n"
                        + "com isso na história há elementos que o usuário precisara lembrar para responder a momentos decisivos ou desafios que surgem durante o decorrer do jogo."
                        + "\n<======================================================================================================================================================>\n\n");
                    break;
                case 3:
                    System.out.println("<<Opa, aqui você encontrar algumas informações sobre os personagens do nosso jogo e também algumas curiosidades!>>"
                            + "\nPersonagens:\n"
                            + "\n<================================================================================================================================================>\n"
                            + "Jade: \n   É uma garota de 18 anos, arrogante, egoista e que em algum momento de sua vida se envolveu com uma galera barra pesada,\n" +
                            "e com isso arrumou muitos problemas e dito isso são esses problemas que vão direcionar a história do jogo. "
                            + "\n<================================================================================================================================================>\n "
                            + "Kevin: \n   É um garoto de 17 anos, é um bom rapaz, que sempre busca ajudar as pessoas que ele gosta da forma como pode, "
                            + "\ntem Tyler como seu melhor amigo e companheiro em jogos multiplayer."
                            + "\n<================================================================================================================================================>\n"
                            + "Tyler: \n   É um garoto de 17 anos, viciado em jogos e animes, apaixonado por tecnologia,\n"
                            + " é o melhor amigo de Kevin e o irmão mais novo da Jade é aquele cara que só quer jogar seu jogo em paz, mas acaba sendo arrastado para toda a trama do jogo."
                            + "\n<================================================================================================================================================>\n");
                    break;

                case 4:
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
                            + "\n<<Nosso jogo foi criado com muito entusiamos, carinho e dedicação, esperamos que você se divirta jogando igual a nós programando! (>.<).>>\n");
                    break;

                case 5:
                    System.out.println("|===============|\n Jogo encerrado!\n|===============|\n  Até a próxima!\n      ^-^\n|===============|");
                    break;
                default:



            }

        }while (iniciar != 5 && iniciar !=1);
    }}