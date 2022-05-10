import java.util.Scanner;

public class Menu {
    //Menu do jogo com 3 opções para o jogador.//
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iniciar;
        do {
            System.out.println("<----------------->\n"
                    + ">>Inicio de Jogo!<<\n"
                    + "<<==============>>");
            System.out.println(" >>Menu do jogo<< \n<<==============>>"
                    + "\n\n <<= 1-Iniciar | 2-Personagens | 3-Créditos | 4-Fechar jogo =>>");
            iniciar = input.nextInt();

//Usei o switch case para criar um menu de opções onde o jogador pode decidir se ele prefere ir direto ao jogo, informações sobre personagens ou créditos.//

            switch (iniciar) {
                case 1:
                    System.out.println("História 1");
                    Scanner sc = new Scanner(System.in);

                    int kevin, tyler, comparar = 0;

                    System.out.println("____Introdução___");
                    System.out.println("Durante uma tarde de verão, enquanto Kevin jogava batatinha online com seu amigo Tyler, " +
                            "\n sua mãe pede para que ele pause o jogo online para que ela possa limpar a mesa e ele se irrita, " +
                            "\ne seu amigo Tyler ouve e o convida para ir até sua casa, ele aceita e vai até a casa dele, " +
                            "\nao chegar lá, Kevin diz:");
                    System.out.println("\nKevin: A sua irmã está por aí?");
                    System.out.println("Tyler: Você não veio aqui para jogar? o que você quer com ela?");
                    System.out.println("Kevin: Calma cara, é só um pergunta!");
                    System.out.println("Tyler: Então vamos lá para cima jogar, só que só tem um controle, vamos ter que jogar Perguntados. \n"
                            + "Ai a gente decide quem joga primeiro no Jokenpô. \n");

                    System.out.println("____JOKENPÔ____\n");
                    System.out.println("1 - Pedra");
                    System.out.println("2 - Papel");
                    System.out.println("3 - Tesoura");
                    do {

                        System.out.println("Kevin digite a sua opção: ");
                        kevin = sc.nextInt();

                        tyler = (int) (Math.random() * 3 + 1);
                        System.out.println("\n");
                        switch (tyler) {
                            case 1:
                                System.out.println("Tyler escolheu Pedra");
                                break;
                            case 2:
                                System.out.println("Tyler escolheu Papel");
                                break;
                            case 3:
                                System.out.println("Tyler escolheu Tesoura");
                                break;
                        }
                        switch (tyler) {
                            case 1:
                                System.out.println("Kevin escolheu Pedra");
                                break;
                            case 2:
                                System.out.println("Kevin escolheu Papel");
                                break;
                            case 3:
                                System.out.println("Kevin escolheu Tesoura");
                                break;
                        }

                    } while (kevin == tyler);
                    if(kevin == tyler && tyler == kevin) {
                        System.out.println("Empate! Ninguém ganhou.");
                    }else
                    if((kevin == 1 && tyler == 3) || (kevin == 2 && tyler == 1) || (kevin == 3 && tyler == 2)) {
                        System.out.println("Kevin ganhou!");

                    } else {
                        System.out.println("Tyler ganhou!");
                    }
                    switch (comparar) {
                        case 1:
                            System.out.println("\n\nKevin depois de perder, sai do quarto e se encontra com Jade no corredor,"
                                    + "\nque o chama e pede um favor, que ele vá até seu quarto para pegar uma caixa em cima de "
                                    + "\nseu guarda-roupas, porque ela não alcança."
                                    + "\nAo pegar a caixa, Kevin percebe que caiu algumas folhas, e entre elas percebe uma anotação"
                                    + "\ncom intruções em enigma. E pela data, ele associa que aconteceria hoje, então ele a entrega "
                                    + "\na caixa e finge que não notou nada.");

                            System.out.println("\nENIGMA: É PRETO QUANDO VOCÊ O COMPRA, VERMELHO QUANDO VOCÊ O USA E CINZA QUANDO VOCÊ"
                                    + "\nO JOGA FORA.");

                            System.out.println("\nKevin: Toma aqui pô, eai, tranquila?");
                            System.out.println("Jade: Estou indo...");
                            System.out.println("Kevin: Se precisar, só dar um grito");
                            System.out.println("Jade: Fechou, valeu");

                            System.out.println("\nKevin vai ao banheiro e lá começa a refletir sobre o que viu, e acaba ficando intrigado "
                                    + "\ncom a anotação, e tenta entender o que estava escrito."
                                    + "\nEle decide ajuda-la em segredo. Tendo em vista que o enigma é a senha de entrada para tal lugar, após"
                                    + "\ndescobrir isso, Kevin guarda essas informações para si, e volta para o quarto."
                                    + "\nEnquanto jogam, Kevin nota que Jade tenta sair de forma suspeita, como se estivesse algo a esconder, Kevin "
                                    + "\ndecidido em ajuda-la, ele finge que sua mãe está ligando e diz que vai ao andar de baixo atende-la, e lá se"
                                    + "\nencontra com Jade, que age de maneira estranha.");

                            System.out.println("\nKevin: Você parece meio tensa, aconteceu algo?");
                            System.out.println("Jade: Não, eu tenho um compromisso urgente agora.");
                            System.out.println("Kevin: Precisa de ajuda, ou algo do tipo? \n");
                            System.out.println("Jade se irrita com Kevin perguntando mais do que deve \n");
                            System.out.println("Jade: Não precisa, eu me viro sozinha! \n");
                            System.out.println("Kevin fica desconfiado \n");
                            System.out.println("Kevin: Ok então.\n");

                            System.out.println("Jade sai pela porta e Kevin fica indeciso se vai atrás ou não. Até que decide ir, mas antes, corre para "
                                    + "\navisar Tyler que precisa sair ugentemente, mas não se explica."
                                    + "\nJade vê que Kevin está atrás dela e como ela não sabe dirigir, acaba pedindo a ajuda dele, já que ele está tão determinado"
                                    + "\na ajuda-la. Ela pede para ele leva-la em um certo local, e ele claro, ele aceita, mas Jade pede que quando chegar, que ele fique no carro"
                                    + "\naté que ela volte. Ele concorda.");
                            System.out.println("Durante o caminho, Kevin não resiste e acaba perguntando o que está acontecendo.");
                            System.out.println("\nJade: A verdade é que estou devendo para um agiota, mas ninguém pode saber, então não se mete!");

                            System.out.println("\nKevin fica em silêncio");

                            System.out.println("\nAo chegar no local, ela sai do carro, e se encaminha até a porta vermelha em um beco, enquanto Kevin espera por ela, ele percebe"
                                    + "\nque antes de entrar ela diz algo ao segurança, que está guardando a porta, após isso, ele permite sua entrada."
                                    + "\nApós algum tempo ele decide ir até ela, mesmo com medo, ele desce do carro, e nervoso vai até a porta, chegando lá o segurança o encara e"
                                    + "\npergunta o que ele quer, Kevin pede para entrar e o segurança solicita a senha de entrada: ");

                            String senha;
                            do {
                                System.out.println("Digite a senha: ");
                                senha = sc.next();
                                if (senha.equals("Carvão")) {
                                    System.out.println("Acesso liberado \n");
                                    break;
                                } else {
                                    System.out.println("Senha inválida");
                                    System.out.println("DICA: PAPEL QUE ESTAVA EM CIMA DO ARMÁRIO.");
                                }
                            } while (senha.equals(senha));


                            System.out.println("\nKevin entra com a senha");
                    }

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
                            + "Nosso jogo foi criado com muito entusiamos, carinho e dedicação, esperamos que você se divirta jogando igual a nós programando! (>.<).\n");
                    break;
                case 4:
                    System.out.println("|===============|\n Jogo encerrado!\n|===============|\n  Até a próxima!\n      ^-^\n|===============|");
                    break;
                default:



            }

        }while (iniciar != 4 && iniciar != 1);
    }}
