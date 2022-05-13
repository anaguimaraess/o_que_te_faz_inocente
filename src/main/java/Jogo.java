
import java.util.InputMismatchException;
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
                     //Historia3, a ser ligada a decisão na Histora 2
                    boolean condicaoResposta = false; int tentativas = 0, erroJogadas=0,acertos=0;
                    System.out.println("Enquanto Kevin se prepara para jogar, Tyler que perdeu no “perguntados”, diz que vai para a cozinha, \n" +
                            "nisso Kevin pega o controle e esperar subir vídeo para jogar. \n" +
                            "Enquanto Tyler vai para a cozinha, no meio do caminho ele houve um barulho estranho" +
                            "vindo do quarto da sua irmã e vai ver o que está acontecendo \n");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("Tyler: Oooooow, que barulho é esse, vai quebrar a casa é? \n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Jade: Fica na sua, e não se mete !!!\n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Tyler: Eu sou mais velho que você! Então me respeita!!!\n");
                    System.out.println("Jade: Uau que idoso... Você é de 1999 e eu de 2000. Se liga!\n\n");
                    System.out.println ("Tyler observa o quarto todos bagunçado, e vê no chão o celular de jade meio escondido no meio de alguns papeis, \n " +
                            "então sem jade perceber ele pega o celular dela e vê que tem várias \n " +
                            "chamadas e mensagens de Kevin e acha estranho.\n\n" +
                            "Tyler movido pela sua curiosidade pega o celular de sua irmã");
                    System.out.println("----------------------------------------------------------------");
                    System.out.printf("%46s", "DESAFIO SENHA DO CELULAR!!!\n");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Para acessar voce terá que descobrir a senha,\n" +
                            "composta por algarismos romanos\n" +
                            "e na seguinte senquencia\n" +
                            "  Maria\n" +
                            "  jaDe\n" +
                            "  tayLer\n" +
                            "  keVIn");
                    System.out.println("----------------------------------------------------------------");
                    while (!condicaoResposta){
                        try {
                            System.out.println("Qual é senha para acessar o celular da Jade:");
                            int resposta = input.nextInt();
                            if (resposta == 1556) {
                                System.out.println("celular desbloqueado\n");
                                condicaoResposta = true;
                                acertos = acertos + 1;
                            } else {
                                System.out.println("Senha incorreta\n");
                                if (tentativas == 2) {
                                    System.out.println("*DICA: observe os padroes das palavras*");
                                }if(tentativas==3){
                                    System.out.println("*DICA: aquelas em maisucula*");
                                }

                                tentativas += tentativas;
                                erroJogadas += erroJogadas;
                            }
                        } catch (InputMismatchException exception) {
                            System.out.println("Caracteres não permitidos, insira apenas números");
                            input.nextLine();
                        }
                    }
                    System.out.println("Tyler vê no celular que pela foto de perfil que não é Kevin mandando as mensagens,\n" +
                            "mas alguém com que Jade já tinha se envolvido no passado e que contribuiu para que ela se envolvesse com coisas erradas\n\n");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("Tyler: Você voltou a se envolver com esse cara ? Você enlouqueceu!!?\n\n");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("Jade: Não é da sua conta o que eu faço da minha vida!\n\n");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("Tyler: É quando causa problemas para dentro de casa, igual da última vez...\n\n");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println ("Enquanto Tyler e Jade discutem, Kevin  depois de ter voltado do banheiro e ido pro quarto, estava tentando jogar videogame vê que está demorando demais para o jogo iniciar e decide ir atras de Tyler \n " +
                            "para avisar que o jogo pode estar com problemas e nisso ele acaba ouvindo a discussão de Tyler e Jade  ");
                    System.out.println("Tyler: Por que você voltou a se envolver com ele?\n\n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Jade: Lembra quando a vó estava doente e precisa de remédios?\n\n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Tyler: Não me diga que o dinheiro para os remédios que você disse que tinha guardado você pegou com ele?\n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Jade: Sim e agora estou devendo e com juros, e ele está me ameaçando...\n\n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Ouvindo toda a conversa Kevin decide se envolver para ver se pode ajudar ambos.\n\n" +
                            "Para que Kevin entre no quarto resolva o desafio.\n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.printf("%36s","DESAFIO ACESSE O QUARTO!!!\n");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("sabendo que a senha foi mostrada em alguma parte da historia.");
                    System.out.println("-------------------------------------------------------------------");
                    while (condicaoResposta) {
                        try {
                            System.out.println("Qual é senha para entar no quarto:");
                            int resposta = input.nextInt();
                            if (resposta == 2000) {
                                System.out.println("acesso liberado\n");
                                System.out.println("aperte enter para entrar no qaurto!...");
                                String String = input.nextLine();
                                condicaoResposta = false;
                                acertos = acertos + 1;
                            } else {
                                System.out.println("Senha incorreta\n");
                                if (tentativas == 2) {
                                    System.out.println("Lembre-se do nascimento");
                                }
                                tentativas += tentativas;
                                erroJogadas += erroJogadas;
                            }
                        } catch (InputMismatchException exception) {
                            System.out.println("\nCaracteres não permitidos, insira apenas números.\n");
                            input.nextLine();
                        }

                    }
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Kevin: Gente é impossível não ouvir a briga de vocês... me deixa ajudar, eu tenho dinheiro.");
                    System.out.println("Jade pensou rapidamente em usar Kevin tanto para dar o valor da dívida quanto para ir levar o dinheiro, assim ela sairia ilesa da situação. \n" +
                            "\n" +
                            "Kevin por estar apaixonado por Jade, aceita a proposta de ajuda e ouve ela explicar onde seria o local que o agita estaria. \n");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.printf("%36s", "DESAFIO  LIBERE AS CORDENADAS !!!\n");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Para receber a coordenada lembre-se da palavra usada no enigma:"); // mudar esse enigma pois não é apresentado na histaria corrente
                    System.out.println("-------------------------------------------------------------------");
                    while (!condicaoResposta) {
                        try {
                            System.out.println("Qual é senha para entar no quarto:");
                            int resposta = input.nextInt();
                            if (resposta == 2000) { // resposta sera alterada
                                System.out.println("Coordenadas liberadas = 50°48’49.00″N, 2°28’28.99″W\n");
                                condicaoResposta = true;
                                acertos = acertos + 1;
                            } else {
                                System.out.println("Senha incorreta\n");
                                if (tentativas == 2) {
                                    System.out.println("Lembre-se do nascimento");
                                }
                                tentativas += tentativas;
                                erroJogadas += erroJogadas;
                            }
                        } catch (InputMismatchException exception) {
                            System.out.println("\nCaracteres não permitidos, insira apenas números.\n");
                            input.nextLine();
                        }

                    }
                    System.out.println("Jade passa as coordenadas do local do agiota para Kevin, ele dirige,\n" +
                            "saca o dinheiro ao chegar lá ele vi em direção a entrada pergunta pro segurança sobre uma ser certa pessoa e diz que veio em nome da Jade,\n" +
                            "o segurança ao ouvir o nome de Jade libera e diz o caminho para Kevin. \n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Segurança: É só seguir o corredor, no fim a direita tem uma porta. \n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Kevin segue o corredor e vai até a porta que possui criptografia.\n");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.printf("%36s", "DESAFIO  DESCRIPTOGRAFAR A SENHA!!!\n");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Dada a senha em criptografada em base64: Ym9hdGUtbWFycm9t ");
                    System.out.println("-------------------------------------------------------------------");
                    while (condicaoResposta) {
                        try {
                            System.out.println("Qual é senha para entar no quarto:");
                            String resposta = input.next();
                            if (resposta.equals("boate-marrom")) {
                                System.out.println("acesso liberado\n");
                                System.out.println("aperte enter para entrar...");
                                String string = input.nextLine();
                                condicaoResposta = false;
                                acertos = acertos + 1;
                            } else {
                                System.out.println("Senha incorreta, tente novamente\n");
                                if (tentativas == 2) {
                                    System.out.println("Lembre-se do nascimento");
                                }
                                tentativas += tentativas;
                                erroJogadas += erroJogadas;
                            }
                        } catch (InputMismatchException exception) {
                            System.out.println("\nCaracteres não permitidos, insira apenas números.\n");
                            input.nextLine();
                        }
                    }
                    System.out.println("Kevin entra no quarto diz que veio em nome da Jade e está com o dinheiro,\n" +
                            "o agiota aceita o dinheiro dá um sinal para os dois seguranças pegam Kevin\n" +
                            "e o arrastam para trás e começa a espancar ele.\n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Agiota: Isso é para que Jade aprenda que não pode ficar me enrolando sem ter consequências\n");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("Após espancarem Kevin, os seguranças o levam pra fora e o jogam em um monte de lixo que fica perto da entrada,\n" +
                            "enquanto isso Jade e Tyler vão até ele e ficam com medo do mesmo estar morto.\n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Tyler: Kevin, fala comigo, Kevin! \n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Jade: eu acho que ele morreu... \n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Tyler: Nãooooo!!! e agora!?? \n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Jade: Eu sinto muito, mas não tem o que fazer, vamos sair daqui antes que alguém nos veja aqui com ele! \n\n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Tyler chorando, fica indeciso se abandona o amigo ou não, enquanto jade o chama para ir logo embora...\n\n");
                    System.out.println("Então, mesmo com medo, Tyler decide ir com Jade e os dois fogem o mais rápido o possível, abandonado Kevin no local.\n\n");
                    //( deixar o final um pouco mais emocinante)
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