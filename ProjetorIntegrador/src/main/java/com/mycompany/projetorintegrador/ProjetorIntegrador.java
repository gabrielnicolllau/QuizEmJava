package com.mycompany.projetorintegrador;

import java.util.Scanner;
import java.util.Random;

public class ProjetorIntegrador {

    // Funcao vai jogar as respota para minusculo quando chamada
    public static String tudoMinusculo(String str) {
        return str.toLowerCase();
    }

    public static void exibirMenu() {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Instrucoes");
            System.out.println("2. Jogar");
            System.out.println("3. Creditos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opcao: ");

            /* 
             * Se digitar um numero inteiro, a funcao hasNextInt()
             * retornara true, e o operador ! invertera esse valor para false. 
             * Dessa forma, o loop nao sera executado:
             *
             * True vira falsa e nao executa o loop.
             * False vira true executa o loop ate que entrada seja true e vira false e sai do loop.
             */
            while (!sc.hasNextInt()) { // Laco de repeticao para validar a entrada de um valor inteiro
                System.out.println("Escolha uma opcao entre [1, 2, 3 e 4]");
                System.out.print("Escolha uma opcao: ");
                sc.next(); // nao armazena nenhum valor
            }
            // leem o numero inteiro digitado pelo usuario e armazenam na variavel opcao. 
            opcao = sc.nextInt();
            sc.nextLine(); // A proxima linha vazia e lida para evitar problemas de leitura de entrada.

            switch (opcao) {
                case 1:
                    System.out.println("=== INSTRUÇÕES ===");
                    System.out.println("Este e um jogo de quiz. Voce tera que responder perguntas corretamente para ganhar pontos.");
                    break;
                case 2:
                    System.out.println("=== JOGAR ===");

                    // Criando as perguntas e respostas
                    String[] perguntas = {
                        // Pergunta 1
                        "Podemos afirmar que o JDK e ? \n"
                        + "a) Uma biblioteca responsavel pela execucao das aplicacoes na JVM \n"
                        + "b) E um kit de ferramentas web \n"
                        + "c) E responsavel por executar instrucoes compiladas em Java. \n"
                        + "d) E o Kit de Desenvolvimento \n",
                        // Pergunta 2
                        "Qual tipo de dados e usado para criar uma variavel que deve armazenar texto? \n"
                        + "a) string \n"
                        + "b) Char \n"
                        + "c) String \n"
                        + "d) char \n",
                        // Pergunta 3
                        "E utilizada na linguagem Java uma classe responsavel pela leitura de informacoes \n"
                        + "que o usuario digita no console. O nome dessa classe e: \n"
                        + "a) Reader \n"
                        + "b) System.in \n"
                        + "c) Readable \n"
                        + "d) Scanner \n",
                        // Pergunta 4
                        "De acordo com o acronimo JDK para o desenvolvimento Java, assinale a alternativa que \n"
                        + "descreve o que significa esta abreviacao. \n"
                        + "a) Java Dev Kit \n"
                        + "b) Java Decomposer Kit \n"
                        + "c) Java Development Kit \n"
                        + "d) Java Developer Kit \n",
                        // Pergunta 5
                        "O que e um metodo em Java ? \n"
                        + "a) Uma variavel de instancia \n"
                        + "b) Um bloco de codigo que executa uma tarefa especifica \n"
                        + "c) Um operador aritmetico \n"
                        + "d) Um tipo de dado \n",
                        // Pergunta 6
                        "Qual das seguintes palavras-chave e usada para declarar uma variavel constante em Java ? \n"
                        + "a) final \n"
                        + "b) static \n"
                        + "c) const \n"
                        + "d) var \n",
                        // Pergunta 7
                        "Qual e a palavra-chave usada para passar um valor de volta para quem chamou a funcao em Java? \n"
                        + "a) send \n"
                        + "b) value \n"
                        + "c) return \n"
                        + "d) pass\n",
                        // Pergunta 8
                        "Qual dos seguintes loops em Java e executado pelo menos uma vez, mesmo se a condicao for falsa? \n"
                        + "a) for \n"
                        + "b) while \n"
                        + "c) do-while \n"
                        + "d) if \n",
                        // Pergunta 9
                        "Qual e a sintaxe correta para um loop for em Java? \n"
                        + "a) for (i = 0; i < 10; i++) \n"
                        + "b) for (int i = 0; i < 10; i++) \n"
                        + "c) for (i < 10; i++) \n"
                        + "d) for (int i = 0; i < 10) \n",
                        // Pergunta 10
                        "Qual e a palavra-chave usada para criar uma instancia de uma classe em Java? \n"
                        + "a) new \n"
                        + "b) create \n"
                        + "c) instance \n"
                        + "d) object \n"};

                    // Criando as Respostas
                    String[] respostas = {
                        "a", // Resposta da 1
                        "c", // Resposta da 2
                        "d", // Resposta da 3
                        "c", // Resposta da 4
                        "b", // Resposta da 5
                        "a", // Resposta da 6
                        "c", // Resposta da 7
                        "c", // Resposta da 8
                        "b", // Resposta da 9
                        "a" // Resposta da 10
                    };

                    /*
                     * Um objeto Random e criado para gerar numeros aleatorios
                     * Um loop for e usado para percorrer o array de perguntas e 
                     * trocar a posicao de cada pergunta e sua resposta correspondente 
                     * por outra posicao aleatoria.
                     */
                    Random embaralhar = new Random();
                    for (int i = perguntas.length - 1; i > 0;) {
                        int x = embaralhar.nextInt(i + 1); // E gerado um numero aleatorio x usando o objeto Random.

                        // Troca a posição da pergunta
                        // Inverter a posicao, exemplo: 0 vai para a posicao 10 e o 10 vai para a posicao 0
                        String PerguntaPronta = perguntas[i];
                        perguntas[i] = perguntas[x];
                        perguntas[x] = PerguntaPronta;

                        // Troca a posicao da resposta
                        // A mesma coisa acontece nas respostas
                        String RespostaPronta = respostas[i];
                        respostas[i] = respostas[x];
                        respostas[x] = RespostaPronta;
                        i--; // i e decrementada em 1 para que o proximo par de perguntas e respostas possa ser embaralhado.
                    }

                    // Armazenara se cada resposta do usuario esta correta ou nao
                    boolean[] corretas = new boolean[respostas.length]; // Esta vazio e o tenho o tamanho
                    int acertos = 0;

                    // Exibindo as perguntas e validando as respostas
                    for (int i = 0; i < perguntas.length; i++) {
                        System.out.println(perguntas[i]);
                        System.out.print("Sua resposta: ");
                        String resposta = tudoMinusculo(sc.nextLine()); // armazena a resposta

                        // Essas linhas verificam se a resposta fornecida pelo usuario e uma opcao valida (a, b, c ou d). 
                        while (!resposta.equals("a") && !resposta.equals("b") && !resposta.equals("c") && !resposta.equals("d")) {
                            System.out.print("Alternativa invalida, escolha uma entre [a, b, c ou d]: ");
                            resposta = sc.nextLine().toLowerCase();
                        }
                        // Resposta fornecida pelo usuario e igual a resposta correta para a pergunta atual.
                        if (resposta.equalsIgnoreCase(respostas[i])) {
                            System.out.println("Resposta correta! \n");
                            System.out.println("========================================================");
                            corretas[i] = true;
                            acertos++;
                        } else {
                            System.out.println("Resposta incorreta! \n");
                            System.out.println("========================================================");
                            corretas[i] = false;
                        }
                    }

                    // Exibindo a pontuação final e as respostas corretas/erradas
                    System.out.println("");
                    System.out.println("========================================================");
                    System.out.println("");
                    // System.out.println("Você acertou " + acertos + " de " + perguntas.length + " perguntas.");
                    System.out.println("Respostas corretas:");
                    for (int i = 0; i < perguntas.length; i++) {
                        if (corretas[i]) {
                            System.out.println(perguntas[i] + "Resposta correta: " + respostas[i]);
                            System.out.println("========================================================");
                        }
                    }
                    System.out.println("Respostas incorretas:");
                    for (int i = 0; i < perguntas.length; i++) {
                        if (!corretas[i]) {
                            System.out.println(perguntas[i] + "Resposta correta: " + respostas[i]);
                            System.out.println("========================================================");
                        }
                    }
                    System.out.println("Você acertou " + acertos + " de " + perguntas.length + " perguntas.");
                    System.out.println("========================================================");
                    break;
                case 3:
                    System.out.println("=== CRÉDITOS ===");
                    System.out.println("Desenvolvido por: Luiz Augusto, Gabriel Nicolau, Micael Cadete e Geovanna Novais!");
                    break;
                case 4:
                    System.out.println("=== SAIR ===");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println();
        } while (opcao != 4);
    }

    public static void main(String[] args) {

        exibirMenu();
    }
}
