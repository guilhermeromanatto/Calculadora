package calculadora;
import java.util.Scanner;

/**
 *
 * @author guilherme.romanatto
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Desclaração das variaveis
        int opcao;
        int matriz1 [][] = new int [99][99];
        int matriz2 [][] = new int [99][99];
        int matriz3 [][] = new int [99][99];
        
        //Opções ao usuário
        System.out.println("Bem vindo à calculadora de Matrizes de Numeros Romanos!");
        System.out.println("Para começar escolha uma das seguintes operações: ");
        System.out.println("Digite 1 para Soma");
        System.out.println("Digite 2 para Subtração");
        System.out.println("Digite 3 para Multiplicação");
        System.out.println("Digite 4 para Multiplicação por Escalar");
        opcao = scan.nextInt();
        
        //Escolhas
        if (opcao == 1){
            System.out.println("-----------------------------");
            System.out.println("            SOMA");
            System.out.println("-----------------------------");
            System.out.println("Antes de começarmos lembre-se que para realizar a operação de SOMA as duas matrizes precisam ter a mesma quantidade de linhas e colunas");
            System.out.println("Insira a quantidade de linhas e após a quantidade de colunas das matrizes: ");
            
            //Declaração das variaveis da matriz
            System.out.println("Linhas");
            int linha = scan.nextInt();
            System.out.println("Colunas");
            int coluna = scan.nextInt();
            
            //Inserção das matrizes
            //Matriz 1
            System.out.println("-----------------------------");
            System.out.println("Digite a 1ª Matriz, colocando um enter para pular as linhas: ");
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    matriz1 [i][j] = scan.nextInt();
                }
            }
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    System.out.print("[" + matriz1[i][j] + "]");
                }
                System.out.println("");
            }

            // Matriz 2
            System.out.println("-----------------------------");
            System.out.println("Digite a 2ª Matriz, colocando um enter para pular as linhas: ");
            for (int k = 0; k < linha; k++) {
                for (int l = 0; l < coluna; l++) {
                    matriz2 [k][l] = scan.nextInt();
                }
            }
            for (int k = 0; k < linha; k++) {
                for (int l = 0; l < coluna; l++) {
                    System.out.print("[" + matriz2[k][l] + "]");
                }
                System.out.println("");
            }
            
            //OPERAÇÃO E RESULTADO DE SOMA DAS MATRIZES
            for (int m = 0; m < linha; m++) {
                for (int n = 0; n < coluna; n++) {
                    matriz3[m][n] = matriz1[m][n] + matriz2[m][n];
                }
            }
            System.out.println("-----------------------------");
            System.out.println("Resultado da SOMA: ");
            
            for (int k = 0; k < linha; k++) {
                for (int l = 0; l < coluna; l++) {
                    System.out.print("[" + matriz3[k][l] + "]");
                }
                System.out.println("");
            }
            System.out.println("-----------------------------");
        } else {
            if (opcao == 2){
                System.out.println("-----------------------------");
                System.out.println("          SUBTRAÇÃO");
                System.out.println("-----------------------------");
                System.out.println("Antes de começarmos lembre-se que para realizar a operação de SUBTRAÇÃO as duas matrizes precisam ter a mesma quantidade de linhas e colunas");
                System.out.println("Insira a quantidade de linhas e após a quantidade de colunas das matrizes: ");

                //Declaração das variaveis da matriz
                System.out.println("Linhas");
                int linha = scan.nextInt();
                System.out.println("Colunas");
                int coluna = scan.nextInt();

                //Inserção das matrizes
                // Matriz 1
                System.out.println("-----------------------------");
                System.out.println("Digite a primeira Matriz, colocando um enter para pular as linhas: ");
                for (int i = 0; i < linha; i++) {
                    for (int j = 0; j < coluna; j++) {
                        matriz1 [i][j] = scan.nextInt();
                    }
                }
                for (int i = 0; i < linha; i++) {
                    for (int j = 0; j < coluna; j++) {
                        System.out.print("[" + matriz1[i][j] + "]");
                    }
                    System.out.println("");
                }

                // Matriz 2
                System.out.println("-----------------------------");
                System.out.println("Digite a segunda Matriz, colocando um enter para pular as linhas: ");
                for (int k = 0; k < linha; k++) {
                    for (int l = 0; l < coluna; l++) {
                        matriz2 [k][l] = scan.nextInt();
                    }
                }
                for (int k = 0; k < linha; k++) {
                    for (int l = 0; l < coluna; l++) {
                        System.out.print("[" + matriz2[k][l] + "]");
                    }
                    System.out.println("");
                }

                //OPERAÇÃO E RESULTADO DE SUBSTRAÇÃO DAS MATRIZES
                for (int m = 0; m < linha; m++) {
                    for (int n = 0; n < coluna; n++) {
                        matriz3[m][n] = matriz1[m][n] - matriz2[m][n];
                    }
                }
                System.out.println("-----------------------------");
                System.out.println("Resultado da SUBTRAÇÃO: ");

                for (int k = 0; k < linha; k++) {
                    for (int l = 0; l < coluna; l++) {
                        System.out.print("[" + matriz3[k][l] + "]");
                    }
                    System.out.println("");
                }
                System.out.println("-----------------------------");
            } else {
                if (opcao == 3){
                    System.out.println("-----------------------------");
                    System.out.println("        MULTIPLICAÇÃO");
                    System.out.println("-----------------------------");
                    System.out.println("Antes de começarmos lembre-se que para realizar a operação de MULTIPLICAÇÃO o número de colunas da 1ª matriz deve ser igual ao número de linhas da 2ª matriz ");
                    System.out.println("Insira a quantidade de linhas e após a quantidade de colunas da 1ª matriz: ");
                    
                    //Declaração das variáveis das matrizes
                    System.out.println("Linhas: ");
                    int linha1 = scan.nextInt();
                    System.out.println("Colunas: ");
                    int coluna1 = scan.nextInt();
                    System.out.println("Agora insira a quantidade de linhas e colunas da 2ª matriz: ");
                    System.out.println("Linhas: ");
                    int linha2 = scan.nextInt();
                    System.out.println("Colunas: ");
                    int coluna2 = scan.nextInt();
                    
                    //Verificação da possibilidade de fazer a operação
                    if (coluna1 == linha2){
                        System.out.println("-----------------------------");
                        System.out.println("Agora iremos inserir as matrizes para realizar a operação.");
                        System.out.println("Digite a 1ª Matriz, colocando um enter para pular as linhas (Lembre-se de quantidade de colunas e linhas que inseriu anteriormente): ");
                        for (int i = 0; i < linha1; i++) {
                            for (int j = 0; j < coluna1; j++) {
                                matriz1 [i][j] = scan.nextInt();
                            }
                        }
                        for (int i = 0; i < linha1; i++) {
                            for (int j = 0; j < coluna1; j++) {
                                System.out.print("[" + matriz1[i][j] + "]");
                            }
                            System.out.println("");
                        }
                        
                        System.out.println("-----------------------------");
                        System.out.println("Digite a 2ª Matriz, colocando um enter para pular as linhas (Lembre-se de quantidade de colunas e linhas que inseriu anteriormente): ");
                        for (int i = 0; i < linha2; i++) {
                            for (int j = 0; j < coluna2; j++) {
                                matriz2 [i][j] = scan.nextInt();
                            }
                        }
                        for (int i = 0; i < linha2; i++) {
                            for (int j = 0; j < coluna2; j++) {
                                System.out.print("[" + matriz1[i][j] + "]");
                            }
                            System.out.println("");
                        }
                        
                        //OPERAÇÃO E RESULTADO DE MULTIPLICAÇÃO DAS MATRIZES
                        for (int k = 0; k < linha1; k++) {
                            for (int l = 0; l < coluna2; l++) {
                                int soma = 0;
                                for (int i = 0; i < coluna1; i++) {
                                    soma = soma + (matriz1[k][i] * matriz2[i][l]);
                                }
                                matriz3[k][l] = soma;
                            }
                        }
                        
                        System.out.println("-----------------------------");
                        System.out.println("Resultado da MULTIPLICAÇÃO: ");

                        for (int k = 0; k < linha1; k++) {
                            for (int l = 0; l < coluna2; l++) {
                                System.out.print("[" + matriz3[k][l] + "]");
                            }
                            System.out.println("");
                        }
                        System.out.println("-----------------------------");
                        
                    } else {
                        System.out.println("Não é possivel realizar a operação pois o numero de colunas da 1ª matriz é diferente do numero de linhas da 2ª matriz.");
                    }
                    
                } else {
                    if (opcao == 4) {
                        System.out.println("-----------------------------");
                        System.out.println(" MULTIPLICAÇÃO POR ESCALAR");
                        System.out.println("-----------------------------");
                        
                        //Inserção do escalar para realizar a multiplicação
                        System.out.println("Na operação de multiplicação por escalar você multiplica os valores da matriz por um numero inteiro, insira abaixo o numero inteiro para realizar a operação: ");
                        int escalar = scan.nextInt();
                        
                        System.out.println("Após isso vamos inserir a matriz para realizar a operação");
                        System.out.println("Insira a quantidade de linhas e após a quantidade de colunas da matriz: ");

                        //Inserção das variaveis
                        System.out.println("Linhas");
                        int linha = scan.nextInt();
                        System.out.println("Colunas");
                        int coluna = scan.nextInt();
                        
                        //Inserção das matrizes
                        //Matriz
                        System.out.println("-----------------------------");
                        System.out.println("Digite a Matriz, colocando um enter para pular as linhas: ");
                        for (int i = 0; i < linha; i++) {
                            for (int j = 0; j < coluna; j++) {
                                matriz1 [i][j] = scan.nextInt();
                            }
                        }
                        for (int i = 0; i < linha; i++) {
                            for (int j = 0; j < coluna; j++) {
                                System.out.print("[" + matriz1[i][j] + "]");
                            }
                            System.out.println("");
                        }
                        
                        //OPERAÇÃO E RESULTADO DE MULTIPLICAÇÃO PELO ESCALAR
                        for (int m = 0; m < linha; m++) {
                            for (int n = 0; n < coluna; n++) {
                        matriz3[m][n] = matriz1[m][n] * escalar;
                            }
                        }
                        System.out.println("-----------------------------");
                        System.out.println("Resultado da MULTIPLICAÇÃO POR ESCALAR: ");

                        for (int k = 0; k < linha; k++) {
                            for (int l = 0; l < coluna; l++) {
                                System.out.print("[" + matriz3[k][l] + "]");
                            }
                            System.out.println("");
                        }
                        System.out.println("-----------------------------");
                    } else {
                        System.out.println("Opção Invalida");
                    }
                }
            }
        }
    }
    
}