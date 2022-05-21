import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Desafios {
    Scanner sc = new Scanner(System.in);
    int pontos = 2; // os pontos são os numeros de dica que o usuario tem, que pode ser aumentado ou diminuido

    //criamos uma logica basica para verificar se usuario tem direito a usar dicas (1 por desafio) e se acertou de primeira o desafio... assim ganha +dica
    //as variaveis serao somadas mais 1 ou subtraidas, e os nomes sao padronizados: maximoDeDicas,acertouDePrimeira

    //logica desse sistema está comentado no segundo desafio, segunda função e padronizado em todas as funções

    public void desafioSeguranca() throws InterruptedException { //desafio de adivinhar a charada dada no enigma
        String senha = ""; //senha inicializada com vazio pois o usuario que ira digitar
        int maximoDeDicas = 0;
        while (!senha.equalsIgnoreCase("carvão") && !senha.equalsIgnoreCase("carvao")) { //senha = carvao
            System.out.println("\nA senha é uma palavra...Digite-a : ");
            String senhaDoUsuario = sc.next();
            senha = senhaDoUsuario;
            if (!senha.equalsIgnoreCase("carvão") && !senha.equalsIgnoreCase("carvao") && pontos > 0 && maximoDeDicas < 1) { //confirmando se o usuario pode usar dicas ou nao
                System.out.println("Você errou!\n");
                System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                String decisaoSimOuNao = sc.next();
                if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                    System.out.println("Responda apenas sim ou não\n");
                } else {
                    if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                        pontos -= 1; //se ele usar dica, o numero atual de dicas diminui
                        System.out.println("\nAgora seu número atual de dicas é:  " + pontos);
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("\nDica: Lembre-se do enigma que apareceu anteriormente, a resposta é apenas um substantivo.");
                        maximoDeDicas += 1;
                    } else if (decisaoSimOuNao.equalsIgnoreCase("nao") || decisaoSimOuNao.equalsIgnoreCase("não")) {
                        System.out.println("\nOk...\n");
                    }
                }

            }else if (senha.equalsIgnoreCase("carvão") || senha.equalsIgnoreCase("carvao")) {
                System.out.println("Certa resposta!");
                pontos += 1;
            }
        }
    }

    public void desafioPerguntados() throws InterruptedException { //desafio de 3 perguntas de conhecimentos gerais
        String pergunta1;
        int maximoDeDicas2 = 0; //sistema que criado para verificar se usuario tem direito a mais dicas
        int acertouDePrimeira = 0; //fizemos verificacao se usuario acertou de primeira, pois se sim, ele ira ganhar mais uma dica.
        do {
            System.out.println("\nDigite o nome de quem disse a famosa frase “Penso, logo existo”?");
            pergunta1 = sc.next();
            if (!pergunta1.equalsIgnoreCase("Descartes") && pontos > 0 && maximoDeDicas2 < 1) {
                System.out.println("Você errou!\n");
                acertouDePrimeira += 1; //aqui somamos 1 o valor da variavel e se ela for >1 na linha 67, n somara pontos de dicas
                System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                String decisaoSimOuNao = sc.next();
                if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                    System.out.println("Responda apenas sim ou não\n");
                }else{
                    if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                        pontos -= 1;
                        System.out.println("\nAgora seu número atual de dicas é:  " + pontos);
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("\nDica: Nome de um filósofo, físico e matemático francês, nome latino: Renatus Cartesius.");
                        maximoDeDicas2 += 1;
                    } else if (decisaoSimOuNao.equalsIgnoreCase("nao")|| decisaoSimOuNao.equalsIgnoreCase("não")){
                        System.out.println("\nOk...\n");
                    }
                }

            } else if (pergunta1.equalsIgnoreCase("Descartes")) {
                System.out.println("Certa resposta!");
                if (acertouDePrimeira == 0) {
                    pontos += 1;
                }
                break;
            }
        } while (pergunta1.equals(pergunta1));
        String pergunta2;
        int maximoDeDicas3 = 0;
        int acertouDePrimeira2 = 0;
        do {
            System.out.println("\nQuantas casas decimais tem o número pi?" +
                    "\nA) 50" +
                    "\nB) Infinitas" +
                    "\nC) 7");
            System.out.println("Digite a letra da alternativa correspondente: ");
            pergunta2 = sc.next();
            if (!pergunta2.equalsIgnoreCase("b") && pontos > 0 && maximoDeDicas3 < 1) {
                acertouDePrimeira2 += 1;
                System.out.println("Você errou!\n");
                System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                String decisaoSimOuNao = sc.next();
                if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                    System.out.println("Responda apenas sim ou não, mas antes tente mais uma vez.");

                }else{
                    if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                        pontos -= 1;
                        System.out.println("\nAgora seu número atual de dicas é:  " + pontos);
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("\nDica: Pi é uma dízima periódica.");
                        TimeUnit.SECONDS.sleep(1);
                        maximoDeDicas3 += 1;
                    } else if (decisaoSimOuNao.equalsIgnoreCase("nao") || decisaoSimOuNao.equalsIgnoreCase("não")){
                        System.out.println("\nOk...\n");
                    }
                }
            } else if (pergunta2.equalsIgnoreCase("b")) {
                System.out.println("Certa resposta!");
                if (acertouDePrimeira2 == 0) {
                    pontos += 1;
                }
                break;
            }
        } while (pergunta2.equals(pergunta2));


        int pergunta3 = 0;
        int maximoDeDicas4 = 0;
        int acertouDePrimeira3 = 0;
        do {
            try {
                System.out.println("\nQual a montanha mais alta do Brasil?" +
                        "\n1) Pico da neblina" +
                        "\n2) Pico da bandeira" +
                        "\n3) Pedra da mina");
                System.out.println("Digite o número da alternativa correspondente: ");
                pergunta3 = sc.nextInt();
                if (pergunta3 != 1 && pontos > 0 && maximoDeDicas4 < 1) {
                    acertouDePrimeira3 += 1;
                    System.out.println("Você errou!\n");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                    TimeUnit.SECONDS.sleep(1);
                    String decisaoSimOuNao = sc.next();
                    if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                        System.out.println("Responda apenas sim ou não");

                    }else{
                        if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                            pontos -= 1;
                            System.out.println("\nAgora seu número atual de dicas é:  " + pontos);
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("\nDica: Localizado no norte do Amazonas.");
                            TimeUnit.SECONDS.sleep(1);
                            maximoDeDicas4 += 1;
                        } else if (decisaoSimOuNao.equalsIgnoreCase("nao")|| decisaoSimOuNao.equalsIgnoreCase("não")){
                            System.out.println("\nOk...\n");
                        }
                    }

                } else if (pergunta3 == 1) {
                    System.out.println("Parabéns! Você acertou todas!");
                    if (acertouDePrimeira3 == 0) {
                        pontos += 1;
                    }
                    break;
                }
            } catch (InputMismatchException exception) {
                System.out.println("\nCaracteres não permitido, insira apenas números\n");
                sc.nextLine();
            }
        } while (pergunta3 != 1);
    }

    public void desafioSenhaNotebook() throws InterruptedException { //desafio que usuario ira digitar a senha que eh o aniversario da jade que estavaem binario
        int senhaDoNotebook = 0;
        int maximoDeDicas5 = 0;
        int acertouDePrimeira4 = 0;
        while (senhaDoNotebook != 19042000) {
            try {

                System.out.println("Digite o resultado numérico: ");
                int senhaUsuario = sc.nextInt();
                senhaDoNotebook = senhaUsuario;
                if (senhaDoNotebook != 19042000 && pontos > 0 && maximoDeDicas5 < 1) {
                    acertouDePrimeira4 += 1;
                    System.out.println("Você errou!\n");
                    System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                    TimeUnit.SECONDS.sleep(1);
                    String decisaoSimOuNao = sc.next();
                    if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                        System.out.println("Responda apenas sim ou não");
                    }else{
                        if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                            pontos -= 1;
                            System.out.println("\nAgora seu número atual de dicas é:  " + pontos);
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("\nDica: Esse número convertido é a data de aniversário da Jade.");
                            TimeUnit.SECONDS.sleep(1);
                            maximoDeDicas5 += 1;
                        } else if (decisaoSimOuNao.equalsIgnoreCase("nao")|| decisaoSimOuNao.equalsIgnoreCase("não")){
                            System.out.println("\nOk...\n");
                        }
                    }
                } else if (senhaDoNotebook == 19042000) {
                    System.out.println("Certa resposta!");
                    if (acertouDePrimeira4 == 0) {
                        pontos += 1;
                    }
                    break;
                }
            } catch (InputMismatchException exception) {
                System.out.println("\nCaracteres não permitido, insira apenas números\n");
                sc.nextLine();
            }
        }
    }


    public void desafioCep() throws InterruptedException { //desafio que usuario digitara cep que foi dado anteriormente atraves das coordenadas,usará o google
        String cep = "";
        int maximoDeDicas6 = 0;
        int acertouDePrimeira5 = 0;
        while (!cep.equals("01545-001") && !cep.equals("01545001")) {

            System.out.println("Digite o número do CEP do endereço visto na mensagem anteriormente: ");
            String cepEndereco = sc.next();
            cep = cepEndereco;
            if (!cep.equals("01545-001") && !cep.equals("01545001") && pontos > 0 && maximoDeDicas6 < 1) {
                acertouDePrimeira5 += 1;
                System.out.println("Você errou!\n");
                System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                String decisaoSimOuNao = sc.next();
                if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                    System.out.println("Responda apenas sim ou não");

                }else{
                    if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                        pontos -= 1;
                        System.out.println("\nAgora seu número atual de dicas é:  " + pontos);
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("\nDica: Coloque as coordenadas no maps e pegue o cep.");
                        TimeUnit.SECONDS.sleep(1);
                        maximoDeDicas6 += 1;
                    } else if (decisaoSimOuNao.equalsIgnoreCase("nao") || decisaoSimOuNao.equalsIgnoreCase("não")){
                        System.out.println("\nOk...\n");
                    }
                }
            } else if (cep.equals("01545-001") && cep.equals("01545001")) {
                System.out.println("Certa resposta!");
                TimeUnit.SECONDS.sleep(2);
                if (acertouDePrimeira5 == 0) {
                    pontos += 1;
                }
                break;
            }

        }
    }


    public void desafioSenhaAniversario() throws InterruptedException { //desafio que usuario ira escolher opcao certa
        int opcaoDesafioNascimento = 0;
        int maximoDeDicas7 = 0;
        int acertouDePrimeira6 = 0;
        while (opcaoDesafioNascimento != 2) {
            try {
                System.out.println("Qual das opções abaixo é o aniversário da Jade?");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("1) 19/03/2000");
                System.out.println("2) 19/04/2000");
                System.out.println("3) 19/03/2001");
                System.out.println("Digite o número da alternativa correspondente: ");
                int opcaoEscolhida = sc.nextInt();
                opcaoDesafioNascimento = opcaoEscolhida;
                if (opcaoDesafioNascimento != 2 && pontos > 0 && maximoDeDicas7 < 1) {
                    acertouDePrimeira6 += 1;
                    System.out.println("Você errou!\n");
                    System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                    String decisaoSimOuNao = sc.next();
                    if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                        System.out.println("Responda apenas sim ou não");

                    }else{
                        if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                            pontos -= 1;
                            System.out.println("\nAgora seu número atual de dicas é:  " + pontos);
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("\nDica: Mês da páscoa.");
                            TimeUnit.SECONDS.sleep(1);
                            maximoDeDicas7 += 1;
                        } else if (decisaoSimOuNao.equalsIgnoreCase("nao")|| decisaoSimOuNao.equalsIgnoreCase("não")){
                            System.out.println("\nOk...\n");
                        }
                    }

                } else if (opcaoDesafioNascimento == 2) {
                    System.out.println("Certa resposta!");
                    TimeUnit.SECONDS.sleep(1);
                    if (acertouDePrimeira6 == 0) {
                        pontos += 1;
                    }
                    break;
                }
            } catch (InputMismatchException exception) {
                System.out.println("\nCaracteres não permitidos, insira apenas números\n");
                sc.nextLine();
            }
        }

    }

    public void desafioSenhaCelular() throws InterruptedException { //desafio que usuario digitara o numero que esta em  nros romanos e converterá
        System.out.println("Para acessar voce terá que descobrir a senha,\n" +
                "composta por algarismos romanos\n" +
                "e na seguinte senquencia:\n" +
                "  Maria\n" +
                "  jaDe\n" +
                "  tayLer\n" +
                "  keVIn");
        int senhaCelular = 0;
        int maximoDeDicas8 = 0;
        int acertouDePrimeira7 = 0;
        while (senhaCelular != 1556) {
            try {
                System.out.println("\nQual é senha para acessar o celular da Jade? Digite a senha numérica: ");
                senhaCelular = sc.nextInt();
                if (senhaCelular != 1556 && pontos > 0 && maximoDeDicas8 < 1) {
                    acertouDePrimeira7 += 1;
                    System.out.println("Você errou!\n");
                    System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                    String decisaoSimOuNao = sc.next();
                    if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                        System.out.println("Responda apenas sim ou não");

                    }else{
                        if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                            pontos -= 1;
                            System.out.println("\nAgora seu número atual de dicas é:  " + pontos);
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("\nDica: Padrão de letras maiúsculas");
                            maximoDeDicas8 += 1;
                        } else if (decisaoSimOuNao.equalsIgnoreCase("nao")|| decisaoSimOuNao.equalsIgnoreCase("não")){
                            System.out.println("\nOk...\n");
                        }
                    }
                } else if (senhaCelular == 1556) {
                    System.out.println("Certa resposta!");
                    TimeUnit.SECONDS.sleep(1);
                    if (acertouDePrimeira7 == 0) {
                        pontos += 1;
                    }
                    break;
                }

            } catch (InputMismatchException exception) {
                System.out.println("\nCaracteres não permitidos, insira apenas números\n");
                sc.nextLine();
            }
        }
    }

    public void desafioSenhaQuarto() throws InterruptedException { //desafio que usuario digitara a senha que eh o numero do ano de nascimento de jade
        int resposta = 0;
        int maximoDeDicas9 = 0;
        int acertouDePrimeira8 = 0;
        while (resposta != 2000) {
            try {
                System.out.println("Sabendo que a senha foi mostrada em alguma parte da historia.\n");
                System.out.println("Qual é a senha para entar no quarto? Digite a senha numérica: ");
                resposta = sc.nextInt();
                if (resposta != 2000 && pontos > 0 && maximoDeDicas9 < 1) {
                    acertouDePrimeira8 += 1;
                    System.out.println("Você errou!\n");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                    String decisaoSimOuNao = sc.next();
                    if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                        System.out.println("Responda apenas sim ou não");
                    }else{
                        if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                            pontos -= 1;
                            System.out.println("\nAgora seu número atual de dicas é:  " + pontos);
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("\nDica: ano de Jade.");
                            TimeUnit.SECONDS.sleep(1);
                            maximoDeDicas9 += 1;
                        } else if (decisaoSimOuNao.equalsIgnoreCase("nao")|| decisaoSimOuNao.equalsIgnoreCase("não")){
                            System.out.println("\nOk...\n");
                        }
                    }
                } else if (resposta == 2000) {
                    System.out.println("Certa resposta!");
                    TimeUnit.SECONDS.sleep(1);
                    if (acertouDePrimeira8 == 0) {
                        pontos += 1;
                    }
                    break;
                }
            } catch (InputMismatchException exception) {
                System.out.println("\nCaracteres não permitidos, insira apenas números.\n");
                sc.nextLine();
            }

        }
    }

    public void desafioCoordenadas() throws InterruptedException { //desafio que usuario digitara a senha depois de converter pra binario e pegar só os 1
        System.out.println("Para receber a coordenada : converta a resposta do desafio anterior em \n " +
                "binário e deixa apenas os valores verdadeiros\n");

        int senhaQuarto = 0;
        int maximoDeDicas10 = 0;
        int acertouDePrimeira9 = 0;
        while (senhaQuarto != 111111 ) {
            try {
                System.out.println("Qual é a senha para liberar as cordenadas? Digite a senha numérica: ");
                TimeUnit.SECONDS.sleep(2);
                senhaQuarto = sc.nextInt();
                if (senhaQuarto != 111111 && pontos > 0 && maximoDeDicas10 < 1) {
                    acertouDePrimeira9 += 1;
                    System.out.println("Você errou!\n");
                    System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                    String decisaoSimOuNao = sc.next();
                    if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                        System.out.println("Responda apenas sim ou não\n");

                    }else{
                        if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                            pontos -= 1;
                            System.out.println("\nAgora seu número atual de dicas é:  " + pontos);
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("\nDica: Remova os números nulos.\n");
                            TimeUnit.SECONDS.sleep(1);
                            maximoDeDicas10 += 1;
                        } else if (decisaoSimOuNao.equalsIgnoreCase("nao")|| decisaoSimOuNao.equalsIgnoreCase("não")){
                            System.out.println("\nOk...\n");
                        }
                    }
                } else if (senhaQuarto == 111111) {
                    System.out.println("Certa resposta!");
                    System.out.println("Coordenadas liberadas = 50°48’49.00″N, 2°28’28.99″W\n");
                    TimeUnit.SECONDS.sleep(1);
                    if (acertouDePrimeira9 == 0) {
                        pontos += 1;
                    }
                    break;
                }
            } catch (InputMismatchException exception) {
                System.out.println("\nCaracteres não permitidos, insira apenas números.\n");
                sc.nextLine();
            }

        }
    }


    public void desafioCriptografia() throws InterruptedException { //desafio que usuario descriptografará a senha dada em base64
        System.out.println("Dada a senha em criptografada em base64: Ym9hdGUtbWFycm9t ");

        String senhaPorta = "";
        int maximoDeDicas11 = 0;
        int acertouDePrimeira10 = 0;
        while (!senhaPorta.equalsIgnoreCase("boate-marrom")) {
            try {
                System.out.println("\nQual é senha para entar no quarto? Digite a senha em formato de texto:");
                senhaPorta = sc.next();
                if (!senhaPorta.equalsIgnoreCase("boate-marrom") && pontos > 0 && maximoDeDicas11 < 1) {
                    acertouDePrimeira10 += 1;
                    System.out.println("Você errou!\n");
                    System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'\n");
                    String decisaoSimOuNao = sc.next();
                    if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                        System.out.println("Responda apenas sim ou não\n");

                    }else{
                        if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                            pontos -= 1;
                            System.out.println("\nAgora seu número atual de dicas é:  " + pontos);
                            System.out.println("\nDica: Use o google e pesquise 'decodificador base64'. ");
                            TimeUnit.SECONDS.sleep(1);
                            maximoDeDicas11 += 1;
                        } else if (decisaoSimOuNao.equalsIgnoreCase("nao")|| decisaoSimOuNao.equalsIgnoreCase("não")){
                            System.out.println("\nOk...\n");
                        }
                    }
                } else if (senhaPorta.equalsIgnoreCase("boate-marrom")) {
                    System.out.println("Certa resposta!");
                    TimeUnit.SECONDS.sleep(1);
                    if (acertouDePrimeira10 == 0) {
                        pontos += 1;
                    }
                    break;
                }
            } catch (InputMismatchException exception) {
                System.out.println("\nCaracteres não permitidos, insira apenas números.\n");
                sc.nextLine();
            }
        }
    }
}
