import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Desafios {
    Scanner sc = new Scanner(System.in);
    int pontos = 2;

    public void desafioSeguranca() throws InterruptedException {
        String senha = "";
        int maximoDeDicas = 0;
        while (!senha.equalsIgnoreCase("carvão") && !senha.equalsIgnoreCase("carvao")) {
            System.out.println("\nA senha é uma palavra...Digite-a : ");
            String senhaDoUsuario = sc.next();
            senha = senhaDoUsuario;
            if (!senha.equalsIgnoreCase("carvão") && !senha.equalsIgnoreCase("carvao") && pontos > 0 && maximoDeDicas < 1) {
                System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                String decisaoSimOuNao = sc.next();
                if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                    System.out.println("Responda apenas sim ou não\n");
                } else {
                    if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                        pontos -= 1;
                        System.out.println("Agora seu número atual de dicas é:  " + pontos + "\n");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Dica: Lembre-se do enigma que apareceu anteriormente, a resposta é apenas um substantivo.");
                        maximoDeDicas += 1;
                    } else if (decisaoSimOuNao.equalsIgnoreCase("nao") || decisaoSimOuNao.equalsIgnoreCase("não")) {
                        System.out.println("Ok...");
                    }
                }

            } else {
                System.out.println("Certa resposta!");
                pontos += 1;
            }
        }
    }

    public void desafioPerguntados() throws InterruptedException {
        String pergunta1;
        int maximoDeDicas2 = 0;
        int acertouDePrimeira = 0;
        do {
            System.out.println("\nDigite o nome de quem disse a famosa frase “Penso, logo existo”?");
            pergunta1 = sc.next();
            if (!pergunta1.equalsIgnoreCase("Descartes") && pontos > 0 && maximoDeDicas2 < 1) {
                System.out.println("Você errou!\n");
                acertouDePrimeira += 1;
                System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                String decisaoSimOuNao = sc.next();
                if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                    System.out.println("Responda apenas sim ou não");
                }else{
                    if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                        pontos -= 1;
                        System.out.println("\nAgora seu número atual de dicas é:  " + pontos);
                        System.out.println("\nDica: Nome de um filósofo, físico e matemático francês, nome latino: Renatus Cartesius.");
                        maximoDeDicas2 += 1;
                    } else if (decisaoSimOuNao.equalsIgnoreCase("nao")&& decisaoSimOuNao.equalsIgnoreCase("não")){
                        System.out.println("Ok...");
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
            System.out.println("Quantas casas decimais tem o número pi?" +
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
                    System.out.println("Responda apenas sim ou não");

                }else{
                    if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                        pontos -= 1;
                        System.out.println("\nAgora seu número atual de dicas é:  " + pontos);
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("\nDica: Pi é uma dízima periódica.");
                        TimeUnit.SECONDS.sleep(1);
                        maximoDeDicas3 += 1;
                    } else if (decisaoSimOuNao.equalsIgnoreCase("nao") || decisaoSimOuNao.equalsIgnoreCase("não")){
                        System.out.println("Ok...");
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
                System.out.println("Qual a montanha mais alta do Brasil?" +
                        "\n1) Pico da neblina" +
                        "\n2) Pico da bandeira" +
                        "\n3) Pedra da mina");
                System.out.println("Digite o número da alternativa correspondente: ");
                pergunta3 = sc.nextInt();
                if (pergunta3 != 1 && pontos > 0 && maximoDeDicas4 < 1) {
                    acertouDePrimeira3 += 1;
                    System.out.println("Você errou!");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                    TimeUnit.SECONDS.sleep(1);
                    String decisaoSimOuNao = sc.next();
                    if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                        System.out.println("Responda apenas sim ou não");

                    }else{
                        if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                            pontos -= 1;
                            System.out.println("Agora seu número atual de dicas é:  " + pontos);
                            System.out.println("Dica: Localizado no norte do Amazonas.");
                            TimeUnit.SECONDS.sleep(1);
                            maximoDeDicas4 += 1;
                        } else if (decisaoSimOuNao.equalsIgnoreCase("nao")|| decisaoSimOuNao.equalsIgnoreCase("não")){
                            System.out.println("Ok...");
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
                System.out.println("Caracteres não permitido, insira apenas números\n");
                TimeUnit.SECONDS.sleep(2);
                sc.nextLine();
            }
        } while (pergunta3 != 1);
    }

    public void desafioSenhaNotebook() throws InterruptedException {
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
                    System.out.println("Você errou!");
                    System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                    TimeUnit.SECONDS.sleep(1);
                    String decisaoSimOuNao = sc.next();
                    if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                        System.out.println("Responda apenas sim ou não");
                    }else{
                        if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                            pontos -= 1;
                            System.out.println("Agora seu número atual de dicas é:  " + pontos);
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Dica: Esse número convertido é a data de aniversário da Jade.");
                            TimeUnit.SECONDS.sleep(1);
                            maximoDeDicas5 += 1;
                        } else if (decisaoSimOuNao.equalsIgnoreCase("nao")|| decisaoSimOuNao.equalsIgnoreCase("não")){
                            System.out.println("Ok...");
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
                System.out.println("Caracteres não permitido, insira apenas números\n");
                sc.nextLine();
            }
        }
    }


    public void desafioCep() throws InterruptedException {
        String cep = "";
        int maximoDeDicas6 = 0;
        int acertouDePrimeira5 = 0;
        while (!cep.equals("01545-001") && !cep.equals("01545001")) {

            System.out.println("Digite o número do CEP do endereço visto na mensagem anteriormente: ");
            String cepEndereco = sc.next();
            cep = cepEndereco;
            if (!cep.equals("01545-001") && !cep.equals("01545001") && pontos > 0 && maximoDeDicas6 < 1) {
                acertouDePrimeira5 += 1;
                System.out.println("Você errou!");
                System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                String decisaoSimOuNao = sc.next();
                if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                    System.out.println("Responda apenas sim ou não");

                }else{
                    if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                        pontos -= 1;
                        System.out.println("Agora seu número atual de dicas é:  " + pontos);
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Dica: Coloque as coordenadas no maps e pegue o cep.");
                        TimeUnit.SECONDS.sleep(1);
                        maximoDeDicas6 += 1;
                    } else if (decisaoSimOuNao.equalsIgnoreCase("nao") || decisaoSimOuNao.equalsIgnoreCase("não")){
                        System.out.println("Ok...");
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


    public void desafioSenhaAniversario() throws InterruptedException {
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
                    System.out.println("Você errou!");
                    System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                    String decisaoSimOuNao = sc.next();
                    if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                        System.out.println("Responda apenas sim ou não");

                    }else{
                        if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                            pontos -= 1;
                            System.out.println("Agora seu número atual de dicas é:  " + pontos);
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Dica: Mês da páscoa.");
                            TimeUnit.SECONDS.sleep(1);
                            maximoDeDicas7 += 1;
                        } else if (decisaoSimOuNao.equalsIgnoreCase("nao")|| decisaoSimOuNao.equalsIgnoreCase("não")){
                            System.out.println("Ok...");
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
                System.out.println("Caracteres não permitidos, insira apenas números\n");
                sc.nextLine();
            }
        }

    }

    public void desafioSenhaCelular() throws InterruptedException {
        System.out.println("Para acessar voce terá que descobrir a senha,\n" +
                "composta por algarismos romanos\n" +
                "e na seguinte senquencia\n" +
                "  Maria\n" +
                "  jaDe\n" +
                "  tayLer\n" +
                "  keVIn");
        int senhaCelular = 0;
        int maximoDeDicas8 = 0;
        int acertouDePrimeira7 = 0;
        while (senhaCelular != 1556) {
            try {
                System.out.println("Qual é senha para acessar o celular da Jade? Digite a senha numérica: ");
                senhaCelular = sc.nextInt();
                if (senhaCelular != 1556 && pontos > 0 && maximoDeDicas8 < 1) {
                    acertouDePrimeira7 += 1;
                    System.out.println("Você errou!");
                    System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                    String decisaoSimOuNao = sc.next();
                    if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                        System.out.println("Responda apenas sim ou não");

                    }else{
                        if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                            pontos -= 1;
                            System.out.println("Agora seu número atual de dicas é:  " + pontos);
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Dica: Padrão de letras maiúsculas");
                            maximoDeDicas8 += 1;
                        } else if (decisaoSimOuNao.equalsIgnoreCase("nao")|| decisaoSimOuNao.equalsIgnoreCase("não")){
                            System.out.println("Ok...");
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
                System.out.println("Caracteres não permitidos, insira apenas números");
                sc.nextLine();
            }
        }
    }

    public void desafioSenhaQuarto() throws InterruptedException {
        int resposta = 0;
        int maximoDeDicas9 = 0;
        int acertouDePrimeira8 = 0;
        while (resposta != 2000) {
            try {
                System.out.println("Qual é senha para entar no quarto? Digite a senha numérica: ");
                resposta = sc.nextInt();
                if (resposta != 2000 && pontos > 0 && maximoDeDicas9 < 1) {
                    acertouDePrimeira8 += 1;
                    System.out.println("Você errou!");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                    String decisaoSimOuNao = sc.next();
                    if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                        System.out.println("Responda apenas sim ou não");
                    }else{
                        if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                            pontos -= 1;
                            System.out.println("Agora seu número atual de dicas é:  " + pontos);
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Dica: ano de Jade.");
                            TimeUnit.SECONDS.sleep(1);
                            maximoDeDicas9 += 1;
                        } else if (decisaoSimOuNao.equalsIgnoreCase("nao")|| decisaoSimOuNao.equalsIgnoreCase("não")){
                            System.out.println("Ok...");
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

    public void desafioCoordenadas() throws InterruptedException {
        System.out.println("Para receber a coordenada : converta a resposta do desafio anterior em \n " +
                "binário e deixa apenas os valores verdadeiros\n");

        int senhaQuarto = 0;
        int maximoDeDicas10 = 0;
        int acertouDePrimeira9 = 0;
        while (senhaQuarto != 111111 ) {
            try {
                System.out.println("Qual é senha para entar no quarto? Digite a senha numérica: ");
                TimeUnit.SECONDS.sleep(2);
                senhaQuarto = sc.nextInt();
                if (senhaQuarto != 111111 && pontos > 0 && maximoDeDicas10 < 1) {
                    acertouDePrimeira9 += 1;
                    System.out.println("Você errou!");
                    System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                    String decisaoSimOuNao = sc.next();
                    if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                        System.out.println("Responda apenas sim ou não");

                    }else{
                        if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                            pontos -= 1;
                            System.out.println("Agora seu número atual de dicas é:  " + pontos);
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("\nDica: Remova os números nulos.\n");
                            TimeUnit.SECONDS.sleep(1);
                            maximoDeDicas10 += 1;
                        } else if (decisaoSimOuNao.equalsIgnoreCase("nao")|| decisaoSimOuNao.equalsIgnoreCase("não")){
                            System.out.println("Ok...");
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


    public void desafioCriptografia() throws InterruptedException {
        System.out.println("Dada a senha em criptografada em base64: Ym9hdGUtbWFycm9t ");

        String senhaPorta = "";
        int maximoDeDicas11 = 0;
        int acertouDePrimeira10 = 0;
        while (!senhaPorta.equalsIgnoreCase("boate-marrom")) {
            try {
                System.out.println("Qual é senha para entar no quarto? Digite a senha em formato de texto:");
                senhaPorta = sc.next();
                if (!senhaPorta.equalsIgnoreCase("boate-marrom") && pontos > 0 && maximoDeDicas11 < 1) {
                    acertouDePrimeira10 += 1;
                    System.out.println("Você errou!");
                    System.out.println("Número de dicas atual:  " + pontos + "\nQuer usar dica? Digite 'sim' ou 'não'");
                    String decisaoSimOuNao = sc.next();
                    if (!decisaoSimOuNao.equalsIgnoreCase("sim") && !decisaoSimOuNao.equalsIgnoreCase("nao") && !decisaoSimOuNao.equalsIgnoreCase("não")) {
                        System.out.println("Responda apenas sim ou não");

                    }else{
                        if (decisaoSimOuNao.equalsIgnoreCase("sim")) {
                            pontos -= 1;
                            System.out.println("Agora seu número atual de dicas é:  " + pontos);
                            System.out.println("Dica: Use o google e pesquise 'decodificador base64'. ");
                            TimeUnit.SECONDS.sleep(1);
                            maximoDeDicas11 += 1;
                        } else if (decisaoSimOuNao.equalsIgnoreCase("nao")|| decisaoSimOuNao.equalsIgnoreCase("não")){
                            System.out.println("Ok...");
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
