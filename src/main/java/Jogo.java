
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Jogo {
    //Menu do jogo com 5 opções para o jogador.//
    public static void main(String[] args) throws InterruptedException {
        //utilizamos o TimeUnit como forma de deixar o aparecimento dos prints mais lento, assim usuario pode acompanhar melhor

        Scanner sc = new Scanner(System.in);
        int iniciar = 0;
        int decisaoEntrar = 0;
        Desafios desafio = new Desafios();
        do {
            try {

                System.out.println("<----------------->\n"
                        + ">>Inicio de Jogo!<<\n"
                        + "<<==============>>");
                System.out.println(" >>Menu do jogo<< \n<<==============>>"
                        + "\n\n <<= 1-Iniciar | 2-Informações | 3-Personagens | 4-Créditos | 5-Fechar jogo =>>");
                iniciar = sc.nextInt();

                //Usei o switch case para criar um menu de opções onde o jogador pode decidir se ele prefere ir direto ao jogo, informações sobre personagens e etc.//
                switch (iniciar) {
                    case 1:
                        int kevin = 0, tyler = 0, comparar ;
                        System.out.println("LEMBRETE: Você irá passar por desafios durante o jogo... Inicialmente, você tem direito" +
                                "\na duas dicas. Esse número aumenta se você acertar desafios de primeira, e diminui se você utilizar dicas." +
                                "\n\nBoa sorte e bom jogo! =)");
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println("\n\n...\n");
                        TimeUnit.SECONDS.sleep(4);
                        System.out.println("\nDurante uma tarde de verão, enquanto Kevin jogava Perguntados online com seu amigo Tyler," +
                                "\nsua mãe pede para que ele pause o jogo online para que ela possa limpar a mesa, ele acaba se irritando" +
                                "\ncom isso e seu amigo Tyler ouve e o convida para ir até sua casa, ele aceita e vai," +
                                "\nao chegar lá, Kevin diz: ");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("\nKevin: A sua irmã está por aí?\n\n");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Tyler: Você não veio aqui para jogar? O que você quer com ela?\n\n");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Kevin: Calma cara, é só um pergunta!\n\n");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Tyler: Então vamos lá para cima jogar, só que só tem um controle, vamos ter que jogar Perguntados. \n\n"
                                + "Ai a gente decide quem joga primeiro no Jokenpô. \n");
                        TimeUnit.SECONDS.sleep(1);

                        System.out.println("____JOKENPÔ____\n"); //usuario digita opcao e random escolhe outra, e assim vemos quem ganhou para ver qual rumo a historia terá
                        System.out.println("1 - Pedra");
                        System.out.println("2 - Papel");
                        System.out.println("3 - Tesoura");

                        do {
                            try {
                                System.out.println("\nKevin digite a sua opção:\n ");
                                kevin = sc.nextInt();
                                tyler = (int) (Math.random() * 3 + 1); //random eh utilizado para sorteio de opcao
                                if (kevin >= 1 && kevin <= 3){
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
                                    switch (kevin) {
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
                                    if (kevin == tyler) {
                                        System.out.println("Empate! Ninguém ganhou.");
                                    }
                                }else{
                                    System.out.println("Digite apenas as opções de 1 a 3");
                                    kevin = tyler;
                                }
                            }catch (InputMismatchException exception){
                                System.out.println("Caracteres não permitido, insira apenas números.");
                                sc.nextLine();
                            }
                        } while (kevin == tyler);
                        if ((kevin == 1 && tyler == 3) || (kevin == 2 && tyler == 1) || (kevin == 3 && tyler == 2)) {
                            System.out.println("\nKevin ganhou!");
                            comparar = 2;
                        } else {
                            comparar = 1;
                            System.out.println("\nTyler ganhou!");
                        }

                        switch (comparar) {
                            case 1:
                                //historia 1, apenas prints
                                System.out.println("\n\nKevin depois de perder, sair do quarto e no corredor se encontra com Jade que o chama e pede um favor,\n" +
                                        "Jade pede para que ele vá até o seu quarto para pegar uma caixa em cima do guarda-roupas, " +
                                        "\nporque ela não alcança.\n" +
                                        "Ao pegar a caixa, Kevin percebe que caiu algumas folhas e no meio delas, ele percebe uma anotação com instruções em enigma. \n");
                                TimeUnit.SECONDS.sleep(3);
                                System.out.println("ENIGMA: “É preto quando você o compra, vermelho quando você o usa e cinza quando você o joga fora.”\n");
                                System.out.println("Ele pega a caixa e entrega para Jade perguntando:\n");
                                TimeUnit.SECONDS.sleep(3);
                                System.out.println("Kevin: Você parece meio tensa, aconteceu algo?\n\n");
                                TimeUnit.SECONDS.sleep(3);
                                System.out.println("Jade nota que Kevin pode ser útil já que a mesma não sabe dirigir\n\n");
                                TimeUnit.SECONDS.sleep(3);
                                System.out.println("Jade: Sim, tenho um compromisso e você vai dirigir para mim, mas sem perguntas!\n\n");
                                TimeUnit.SECONDS.sleep(1);
                                System.out.println("Kevin: Ok \n\n");
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("Durante o caminho, Kevin não resiste e acaba perguntando para Jade o que está acontecendo.\n");
                                TimeUnit.SECONDS.sleep(3);
                                System.out.println("Jade: A verdade é que eu estou devendo para um agiota, mas ninguém pode saber disso, então não se mete!\n\n");
                                TimeUnit.SECONDS.sleep(3);
                                System.out.println( "“Kevin fica em silêncio”\n");
                                TimeUnit.SECONDS.sleep(3);
                                System.out.println("Ao chegar lá, enquanto Kevin espera por ela, percebe que antes de entrar Jade diz algo para o segurança que está guardando a porta e entra.\n" +
                                        "\nApós algum tempo ele decide ir atras dela, mesmo com medo, vai até o segurança,\n" +
                                        "ao chegar lá o segurança encara Kevin e pergunta o que ele quer, Kevin pede para entrar e o segurança solicita a senha de entrada.\n");
                                TimeUnit.SECONDS.sleep(4);

                                //desafio para seguir a historia
                                desafio.desafioSeguranca();

                                //continuacao da historia
                                System.out.println("\nKevin entra e procura por Jade, vê ela conversando com um homem suspeito e com uma expressão de medo, \n" +
                                        "com isso ele deduz que aquele seja a pessoa para a qual ela está devendo.\n\n" +
                                        "Kevin quer chegar em Jade de alguma forma, e decide procurar uma forma de chamar a atenção.\n");
                                TimeUnit.SECONDS.sleep(3);

                                //decisao que ocorre na boate
                                int escolhaNaBoate = 0;
                                while (escolhaNaBoate == 0) {
                                    try {
                                        System.out.println("Digite o número do que Kevin deve fazer: ");
                                        System.out.println("\n1 - Tentar avançar para enfrentar o Agiota." +
                                                "\n2 - Chegar de forma discreta para negociar com o agiota e pagar a dívida de Jade.");
                                        escolhaNaBoate = sc.nextInt();
                                        if (escolhaNaBoate == 1) {
                                            escolhaNaBoate = 1;
                                            System.out.println("\nKevin tenta avançar para enfrentar o Agiota, e acaba sendo baleado." +
                                                    "\n\nFIM DO JOGO.");
                                        } else if (escolhaNaBoate == 2) {
                                            escolhaNaBoate = 2;
                                            TimeUnit.SECONDS.sleep(3);
                                            System.out.println(" Kevin vai em direção ao agiota negocia e transferência o valor que Jade devia!\n");
                                            System.out.println("O Agiota, após receber a transferência, decide liberar os dois, eles saem e vão para o carro em silêncio," +
                                                    "\nquando chegam no carro, Jade pergunta o porquê de ele ter feito isso\n");
                                            TimeUnit.SECONDS.sleep(4);
                                            System.out.println("Kevin: Eu vi que você precisava de ajuda, e eu não consigo ver alguém que eu gosto nesse tipo de situação\n\n");
                                            TimeUnit.SECONDS.sleep(3);
                                            System.out.println("\t\t“Jade se emociona e beija Kevin”\n\n");
                                            TimeUnit.SECONDS.sleep(3);
                                            System.out.println("FIM DE JOGO.");
                                        } else {
                                            escolhaNaBoate = 0;
                                        }
                                    }catch (InputMismatchException exception){
                                        System.out.println("Caracteres não permitido, insira apenas números.");
                                        sc.nextLine();
                                }

                            }
                                break;

                                //continuacao da historia
                            case 2:
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("\nKevin começa a jogar, e distraído, começa a pensar na Jade");
                                TimeUnit.SECONDS.sleep(3);
                                System.out.println("\nPensamento do Kevin: “Acho que a Jade está no quarto...Estou sentindo o cheiro do perfume" +
                                        "\ndela daqui! Que por sinal é muito bom, acho que vou arrumar uma desculpa para ir até lá”.");
                                TimeUnit.SECONDS.sleep(3);
                                System.out.println("\nKevin precisa finalizar o jogo para poder ir procurar a Jade.");
                                TimeUnit.SECONDS.sleep(3);

                                System.out.println("Responda as próximas perguntas do jogo para poder finalizar.");

                                //desafio perguntados
                                desafio.desafioPerguntados();

                                System.out.println("\nPensamento do Kevin: “Ufa, consegui terminar o jogo, agora vou falar que vou ao banheiro”.");
                                TimeUnit.SECONDS.sleep(3);
                                System.out.println("\nKevin fala que vai ir ao banheiro e diz para Tyler ir jogando. Mas na verdade Kevin vai procurar Jade e para sua sorte," +
                                        "\nouve um barulho de caixa caindo e a voz dela dizendo “aaaii, essa merda de caixa pesada!”. E então ele segue o som e vai ao quarto dela.");
                                TimeUnit.SECONDS.sleep(3);
                                int entrar = 0;
                                do {
                                    try {
                                        //decisao se entra ou nao no quarto
                                        System.out.println("\nEscolha qual decisão você quer: " +
                                                "\n1 - Entrar no quarto" +
                                                "\n2 - Esperar na porta");
                                        entrar = sc.nextInt();
                                    } catch (InputMismatchException exception) {
                                        System.out.println("Caracteres não permitido, insira apenas números\n");
                                        sc.nextLine();
                                    }

                                } while (decisaoEntrar == entrar);
                                if (entrar == 1) {
                                    System.out.println("Kevin entra e vê Jade tirando a caixa de cima dela e ao tentar ajudar a pegar ");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("os papéis que caíram, Jade diz: “Não preciso de ajuda, não toca nesses papéis!”");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("pega os papéis, guarda de volta na caixa e sai, dizendo “Espere aqui, não se mexe!”");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("\nKevin estranha o surto que ela teve e na mesma hora o notebook dela faz um barulho de notificação bem alto.");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Curioso, Kevin tenta desbloquear o notebook para ler a mensagem. ");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Para acessar o notebook... Converta 1001000101000111011010000 binário para decimal.");
                                    TimeUnit.SECONDS.sleep(3);

                                    //desafio senha do notebook
                                    desafio.desafioSenhaNotebook();

                                    System.out.println("Mensagem do notebook:'Me encontre no -23.5799640010158, -46.616640581488824’.");
                                    System.out.println("Kevin fica confuso com a mensagem, mas fecha tudo rapidamente para Jade não notar que ele viu. ");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Jade volta para o quarto e vai ler a mensagem que tinha chegado, mas percebe já estava marcada como “lida”. ");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Jade se enfurece, mas usa isso ao seu favor, já que ela não sabe dirigir, e diz para Kevin:\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("\nJade: Vamos, agora que sei que você leu a mensagem que chegou para mim," +
                                            "\nvocê vai ter que me ajudar, me leva nesse endereço!”\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Kevin aceita por estar apaixonado por Jade. No carro ele precisa colocar da localização, mas o GPS só aceita CEP.\n");
                                    TimeUnit.SECONDS.sleep(3);

                                    //desafio cep
                                    desafio.desafioCep();

                                    System.out.println("Durante o caminho, Kevin não resiste e acaba perguntando para Jade o que está acontecendo”.\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Jade: A verdade é que eu estou devendo para um agiota, mas ninguém pode saber disso, então não se mete!”.\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Kevin: Desculpa...\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Ao chegar lá, ela sai do carro, e se encaminha até uma porta vermelha em um beco, ");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("após algum tempo ele decide ir atras dela, mesmo com medo, ele desce do carro, e se encaminha até o segurança,");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("ao chegar lá o segurança encara Kevin e pergunta o que ele quer, Kevin pede para entrar e o segurança solicita a senha de entrada.\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("\nKevin: Eu não sei, Jade é minha..., irmã e eu vim atrás dela.\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Segurança: Então me fala a data de nascimento dela.\n\n");
                                    TimeUnit.SECONDS.sleep(3);

                                    //desafio aniversario
                                    desafio.desafioSenhaAniversario();

                                    System.out.println("Kevin entra com a data de nascimento correta, ao entrar ele procura por Jade,");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("e vê ela conversando com um homem suspeito em uma área privada na parte de cima da boate,");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("lá ele a vê com uma expressão de medo e com isso ele deduz que aquele seja a pessoa para");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("a qual ela está devendo, Kevin quer chegar em Jade de alguma forma, e decide procurar uma forma de chamar a atenção.");
                                    TimeUnit.SECONDS.sleep(3);

                                    //decisao do usuario
                                    int decisaoParaAgir = 0;
                                    while (decisaoParaAgir == 0) {
                                        try {
                                            System.out.println("O que Kevin deve fazer? ");
                                            System.out.println("1) Tentar avançar para enfrentar o Agiota.\n" +
                                                    "2) Chegar de forma discreta para negociar com o agiota e pagar a dívida de Jade.\n");
                                            int decisaoDigitada = sc.nextInt();
                                            if (decisaoDigitada == 1) {
                                                decisaoParaAgir = 1;
                                                System.out.println("Kevin tenta avançar no agiota mas o mesmo rapidamente se defende, atirando em Kevin.");
                                                TimeUnit.SECONDS.sleep(1);
                                                System.out.println("POW! ");
                                                TimeUnit.SECONDS.sleep(2);
                                                System.out.println("\n\nFIM DE JOGO!\n"); //fim

                                            } else if (decisaoDigitada == 2) {
                                                decisaoParaAgir = 2;
                                                System.out.println("O Agiota, após receber a transferência, decide liberar os dois, eles saem e vão para o carro em silencio, quando chegam no carro, Jade pergunta o porquê de ele ter feito isso e Kevin diz:\n\n");
                                                TimeUnit.SECONDS.sleep(3);
                                                System.out.println("Kevin: Eu vi que você precisava de ajuda, e eu não consigo ver alguém que eu gosto nesse tipo de situação.\n\n");
                                                TimeUnit.SECONDS.sleep(3);
                                                System.out.println("Jade: Você é uma pessoa muito especial e eu agradeço o que você fez, mas infelizmente você sabe demais.\n\n");
                                                TimeUnit.SECONDS.sleep(3);
                                                System.out.println("\nPOW! POW! ");
                                                TimeUnit.SECONDS.sleep(3);
                                                System.out.println("\n\nFIM DE JOGO!\n");
                                                TimeUnit.SECONDS.sleep(3);

                                            } else {
                                                decisaoParaAgir = 0;
                                                System.out.println("Digite uma opção válida.");
                                                TimeUnit.SECONDS.sleep(2);

                                            }
                                        } catch (InputMismatchException exception) {
                                            System.out.println("Caracteres não permitidos, insira apenas números\n");
                                            sc.nextLine();
                                        }
                                    }
                                    break;
                                } else {
                                    //historia
                                    System.out.println("\nKevin ouve Tyler saindo do quarto e assustado, se esconde.");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Enquanto Kevin se prepara para jogar, Tyler que perdeu no “perguntados”, diz que vai para a cozinha, \n" +
                                            "nisso Kevin pega o controle e esperar subir vídeo para jogar. \n" +
                                            "Enquanto Tyler vai para a cozinha, no meio do caminho ele houve um barulho estranho" +
                                            "vindo do quarto da sua irmã e vai ver o que está acontecendo \n\n");
                                    TimeUnit.SECONDS.sleep(2);
                                    System.out.println("Tyler: Oooooow, que barulho é esse, vai quebrar a casa é? \n\n");
                                    TimeUnit.SECONDS.sleep(1);
                                    System.out.println("Jade: Fica na sua, e não se mete !!!\n\n");
                                    TimeUnit.SECONDS.sleep(1);
                                    System.out.println("Tyler: Eu sou mais velho que você! Então me respeita!!!\n\n");
                                    TimeUnit.SECONDS.sleep(1);
                                    System.out.println("Jade: Uau que idoso... Você é de 1999 e eu de 2000. Se liga!\n\n");
                                    TimeUnit.SECONDS.sleep(1);
                                    System.out.println("Tyler observa o quarto todos bagunçado, e vê no chão o celular de jade meio escondido no meio de alguns papeis, \n " +
                                            "então sem jade perceber ele pega o celular dela e vê que tem várias \n " +
                                            "chamadas e mensagens de Kevin e acha estranho.\n\n" +
                                            "Tyler movido pela sua curiosidade pega o celular de sua irmã");
                                    TimeUnit.SECONDS.sleep(3);

                                    //desafio senha do celular
                                    desafio.desafioSenhaCelular();

                                    System.out.println("Tyler vê no celular que pela foto de perfil que não é Kevin mandando as mensagens,\n" +
                                            "mas alguém com que Jade já tinha se envolvido no passado e que contribuiu para que ela se envolvesse com coisas erradas\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Tyler: Você voltou a se envolver com esse cara ? Você enlouqueceu!!?\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Jade: Não é da sua conta o que eu faço da minha vida!\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Tyler: É quando causa problemas para dentro de casa, igual da última vez...\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Enquanto Tyler e Jade discutem, Kevin  depois de ter voltado do banheiro e ido pro quarto, estava tentando jogar videogame vê que está demorando demais para o jogo iniciar e decide ir atras de Tyler \n " +
                                            "para avisar que o jogo pode estar com problemas e nisso ele acaba ouvindo a discussão de Tyler e Jade  ");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Tyler: Por que você voltou a se envolver com ele?\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Jade: Lembra quando a vó estava doente e precisa de remédios?\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Tyler: Não me diga que o dinheiro para os remédios que você disse que tinha guardado você pegou com ele?\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Jade: Sim e agora estou devendo e com juros, e ele está me ameaçando...\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Ouvindo toda a conversa Kevin decide se envolver para ver se pode ajudar ambos.\n\n" +
                                            "Para que Kevin entre no quarto resolva o desafio.\n");
                                    TimeUnit.SECONDS.sleep(3);

                                    //desafio senha quarto
                                    desafio.desafioSenhaQuarto();

                                    System.out.println("Kevin: Gente é impossível não ouvir a briga de vocês... me deixa ajudar, eu tenho dinheiro.\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Jade pensou rapidamente em usar Kevin tanto para dar o valor da dívida quanto para ir levar o dinheiro, assim ela sairia ilesa da situação. \n" +
                                            "\n" +
                                            "Kevin por estar apaixonado por Jade, aceita a proposta de ajuda e ouve ela explicar onde seria o local que o agita estaria. \n");

                                    //desafio coordenadas
                                    desafio.desafioCoordenadas();

                                    System.out.println("Jade passa as coordenadas do local do agiota para Kevin, ele dirige,\n" +
                                            "saca o dinheiro ao chegar lá ele vi em direção a entrada pergunta pro segurança sobre uma ser certa pessoa e diz que veio em nome da Jade,\n" +
                                            "o segurança ao ouvir o nome de Jade libera e diz o caminho para Kevin. \n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Segurança: É só seguir o corredor, no fim a direita tem uma porta.\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Kevin segue o corredor e vai até a porta que possui criptografia.\n");

                                    //desafio de descriptografar
                                    desafio.desafioCriptografia();

                                    System.out.println("Kevin entra no quarto diz que veio em nome da Jade e está com o dinheiro,\n" +
                                            "o agiota aceita o dinheiro dá um sinal para os dois seguranças pegam Kevin\n" +
                                            "e o arrastam para trás e começa a espancar ele.\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Agiota: Isso é para que Jade aprenda que não pode ficar me enrolando sem ter consequências\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Após espancarem Kevin, os seguranças o levam pra fora e o jogam em um monte de lixo que fica perto da entrada,\n" +
                                            "enquanto isso Jade e Tyler vão até ele e ficam com medo do mesmo estar morto.\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Tyler: Kevin, fala comigo, Kevin! \n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Jade: eu acho que ele morreu... \n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Tyler: Nãooooo!!! e agora!?? \n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Jade: Eu sinto muito, mas não tem o que fazer, vamos sair daqui antes que alguém nos veja aqui com ele! \n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Tyler chorando, fica indeciso se abandona o amigo ou não, enquanto jade o chama para ir logo embora...\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("Então, mesmo com medo, Tyler decide ir com Jade e os dois fogem o mais rápido o possível, abandonado Kevin no local.\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    break;
                                }
                            default:
                                break;
                        }
                        break;

                    case 2: //instrucoes
                        System.out.println("\n  <<Aqui vai algumas informações básicas sobre o jogo.>>\n"
                                + "\n<======================================================================================================================================================>\n"
                                + "  Opa, tudo bem, nós somos o grupo 10 e esse é o nosso projeto, "
                                + "ele é um jogo de suspense onde você acompanha a história de 3 personagens, "
                                + "\ncada um deles com sua personalidade própria, caso aja curiosidades, "
                                + "é so ir no menu e escolher a opção 2,\nlá tem um breve resumo sobre cada um deles."
                                + "O nosso jogo é um suspense onde as decisões do usuário definem o rumo que a história vai seguir,\n"
                                + "com isso na história há elementos que o usuário precisara lembrar para responder a momentos decisivos ou desafios que surgem durante o decorrer do jogo."
                                + "\n<======================================================================================================================================================>\n\n");
                        TimeUnit.SECONDS.sleep(4);
                        break;
                    case 3:// info dos personagens
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
                        TimeUnit.SECONDS.sleep(4);
                        break;

                    case 4: //creditos
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
                        TimeUnit.SECONDS.sleep(4);
                        break;

                    case 5: //encerrar sessao
                        System.out.println("|===============|\n Jogo encerrado!\n|===============|\n  Até a próxima!\n      ^-^\n|===============|");
                        TimeUnit.SECONDS.sleep(1);
                        break;
                    default:
                        System.out.println("Opção inválida");
                        TimeUnit.SECONDS.sleep(3);
                        break;
                }
            } catch (InputMismatchException exception) { //tratamento de menu
                System.out.println("\nCaracteres não permitidos, insira apenas números.\n");
                TimeUnit.SECONDS.sleep(2);
                sc.nextLine();
            }

        } while (iniciar != 5 && iniciar != 1);
    }
}