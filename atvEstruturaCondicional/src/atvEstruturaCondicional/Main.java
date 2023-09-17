package atvEstruturaCondicional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		 * 1) System.out.println("Digite sua nota: "); double nota = input.nextDouble();
		 * 
		 * if (nota >= 7) System.out.println("Aprovado!");
		 * 
		 * else System.out.println("Reprovado!");
		 */
		/*
		 * 2) System.out.println("Digite os lados do triângulo"); double l1 =
		 * input.nextDouble(); double l2 = input.nextDouble(); double l3 =
		 * input.nextDouble();
		 * 
		 * if (l1 == l2 && l2 == l3) System.out.println("Equilátero"); else if (l1 == l2
		 * || l1 == l3 || l2 == l3) System.out.println("Isósceles"); else
		 * System.out.println("Escaleno");
		 */
		/*
		 * 3) System.out.println("Digite 3 notas no intevalo entre [0,10]: "); double
		 * nota1 = input.nextDouble(); double nota2 = input.nextDouble(); double nota3 =
		 * input.nextDouble();
		 * 
		 * double media = (nota1 + nota2 + nota3) / 3;
		 * 
		 * if(media >= 0 && media < 3) System.out.println("REPROVADO!"); else if (media
		 * >= 3 && media < 7) System.out.println("EXAME!"); else if (media >= 7 && media
		 * <= 10) System.out.println("APROVADO!"); else
		 * System.out.println("Media fora do intervalo entre [0,10]");
		 */
		/*
		 * 4) System.out.println("Digite o peso (em kg):"); double peso =
		 * input.nextDouble();
		 * 
		 * System.out.println("Digite a altura (em metros):"); double altura =
		 * input.nextDouble();
		 * 
		 * double imc = peso / (altura * altura);
		 * 
		 * System.out.println("IMC: " + imc);
		 * 
		 * if (imc < 20) System.out.println("Situação: Abaixo do Peso"); else if (imc >=
		 * 20 && imc < 25) System.out.println("Situação: Normal"); else if (imc >= 25 &&
		 * imc < 30) System.out.println("Situação: Sobrepeso"); else if (imc >= 30 &&
		 * imc <= 40) System.out.println("Situação: Obesidade"); else
		 * System.out.println("Obesidade Mórbida");
		 */
		/*
		 * 6) System.out.println("Informe o primeiro lado em cm:"); double a =
		 * scanner.nextDouble();
		 * 
		 * System.out.println("Informe o segundo lado em cm:"); double b =
		 * scanner.nextDouble();
		 * 
		 * System.out.println("Informe o terceiro lado em cm:"); double c =
		 * scanner.nextDouble();
		 * 
		 * boolean condicao1 = Math.abs(b - c) < a && a < b + c; boolean condicao2 =
		 * Math.abs(a - c) < b && b < a + c; boolean condicao3 = Math.abs(a - b) < c &&
		 * c < a + b;
		 * 
		 * if (condicao1 && condicao2 && condicao3) System.out.println(
		 * "Resposta: Os três valores informados podem ser os comprimentos dos lados de um triângulo."
		 * ); else System.out.println(
		 * "Resposta: Os três valores informados NÃO podem ser os comprimentos dos lados de um triângulo."
		 * );
		 */
		/*
		 * 7) Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Informe o coeficiente 'a':"); double a =
		 * scanner.nextDouble();
		 * 
		 * System.out.println("Informe o coeficiente 'b':"); double b =
		 * scanner.nextDouble();
		 * 
		 * System.out.println("Informe o coeficiente 'c':"); double c =
		 * scanner.nextDouble();
		 * 
		 * double delta = b * b - 4 * a * c;
		 * 
		 * if (a == 0 && b == 0 && c == 0) {
		 * System.out.println("Igualdade confirmada: 0 = 0"); } else if (a == 0 && b ==
		 * 0) { System.out.println("Coeficientes informados incorretamente"); } else if
		 * (a == 0) { System.out.println("Esta é uma equação de primeiro grau: x = " +
		 * (-c / b)); } else {
		 * System.out.println("Esta é uma equação de segundo grau.");
		 * 
		 * if (delta < 0) { System.out.
		 * println("Esta equação não possui raízes reais (delta < 0): delta = " +
		 * delta); } else if (delta == 0) { double x = -b / (2 * a); System.out.
		 * println("Esta equação possui duas raízes reais iguais: x' = x'' = " + x); }
		 * else { double x1 = (-b + Math.sqrt(delta)) / (2 * a); double x2 = (-b -
		 * Math.sqrt(delta)) / (2 * a); System.out.
		 * println("Esta equação possui duas raízes reais diferentes: delta = " + delta
		 * + ", x' = " + x1 + ", x'' = " + x2); } }
		 * 
		 * scanner.close();
		 */
		/*
		 * 8) Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Informe o código do produto (1 a 5):"); int codigo =
		 * scanner.nextInt();
		 * 
		 * double preco = 0.0;
		 * 
		 * switch (codigo) { case 1: preco = 99.99;
		 * System.out.println("Produto: Sapato"); break; case 2: preco = 103.89;
		 * System.out.println("Produto: Bolsa"); break; case 3: preco = 49.98;
		 * System.out.println("Produto: Camisa"); break; case 4: preco = 89.72;
		 * System.out.println("Produto: Calça"); break; case 5: preco = 97.35;
		 * System.out.println("Produto: Blusa"); break; default:
		 * System.out.println("Código de produto inválido."); break; }
		 * 
		 * if (preco > 0) { System.out.println("Preço: R$ " + preco); }
		 * 
		 * scanner.close(); } }
		 */
		/*
		 * 9) Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Escolha um planeta para jogar a bola:");
		 * System.out.println("1 - Mercúrio"); System.out.println("2 - Vênus");
		 * System.out.println("3 - Terra"); System.out.println("4 - Marte");
		 * System.out.println("5 - Júpiter"); System.out.println("6 - Saturno");
		 * System.out.println("7 - Urano"); System.out.println("8 - Netuno");
		 * System.out.println("9 - Plutão"); int escolhaPlaneta = scanner.nextInt();
		 * 
		 * double gravidade = 0.0; String nomePlaneta = "";
		 * 
		 * switch (escolhaPlaneta) { case 1: gravidade = 3.7; nomePlaneta = "Mercúrio";
		 * break; case 2: gravidade = 8.8; nomePlaneta = "Vênus"; break; case 3:
		 * gravidade = 9.8; nomePlaneta = "Terra"; break; case 4: gravidade = 3.8;
		 * nomePlaneta = "Marte"; break; case 5: gravidade = 26.4; nomePlaneta =
		 * "Júpiter"; break; case 6: gravidade = 11.5; nomePlaneta = "Saturno"; break;
		 * case 7: gravidade = 9.3; nomePlaneta = "Urano"; break; case 8: gravidade =
		 * 12.2; nomePlaneta = "Netuno"; break; case 9: gravidade = 0.6; nomePlaneta =
		 * "Plutão"; break; default: System.out.println("Planeta escolhido inválido.");
		 * scanner.close(); return; }
		 * 
		 * System.out.println("Informe a velocidade inicial (v0 em m/s):"); double v0 =
		 * scanner.nextDouble();
		 * 
		 * System.out.println("Informe o instante de tempo (t em segundos):"); double t
		 * = scanner.nextDouble();
		 * 
		 * double vT = v0 - gravidade * t; double hT = v0 * t - 0.5 * gravidade * t * t;
		 * 
		 * System.out.println("Planeta escolhido: " + nomePlaneta);
		 * System.out.println("Velocidade v(" + t + "): " + vT + " m/s");
		 * System.out.println("Altura h(" + t + "): " + hT + " metros");
		 * 
		 * scanner.close();
		 */
		/*
		 * 10) Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Digite o primeiro número:"); double numero1 =
		 * scanner.nextDouble();
		 * 
		 * System.out.println("Digite o segundo número:"); double numero2 =
		 * scanner.nextDouble();
		 * 
		 * System.out.println("Escolha a operação:");
		 * System.out.println("1 - Somar os dois números");
		 * System.out.println("2 - Multiplicar os dois números");
		 * System.out.println("3 - Subtrair o número maior pelo número menor");
		 * System.out.println("4 - Dividir o primeiro número pelo segundo");
		 * 
		 * int escolha = scanner.nextInt();
		 * 
		 * double resultado = 0.0;
		 * 
		 * switch (escolha) { case 1: resultado = numero1 + numero2;
		 * System.out.println("Resultado da soma: " + resultado); break; case 2:
		 * resultado = numero1 * numero2;
		 * System.out.println("Resultado da multiplicação: " + resultado); break; case
		 * 3: if (numero1 == numero2) { resultado = 0.0; } else if (numero1 > numero2) {
		 * resultado = numero1 - numero2; } else { resultado = numero2 - numero1; }
		 * System.out.println("Resultado da subtração: " + resultado); break; case 4: if
		 * (numero2 != 0) { resultado = numero1 / numero2;
		 * System.out.println("Resultado da divisão: " + resultado); } else {
		 * System.out.println("Erro: Divisão por zero não permitida."); } break;
		 * default: System.out.println("Opção inválida."); break; }
		 * 
		 * scanner.close();
		 */
		/*
		 * 11) Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Digite o número de diárias:"); int numeroDiarias =
		 * scanner.nextInt();
		 * 
		 * double valorDiaria = 500.0; // Valor da diária base double taxaServicos =
		 * 0.0;
		 * 
		 * if (numeroDiarias < 15) { taxaServicos = 15.0 * numeroDiarias; } else if
		 * (numeroDiarias == 15) { taxaServicos = 10.0 * numeroDiarias; } else {
		 * taxaServicos = 5.0 * numeroDiarias; }
		 * 
		 * double totalAPagar = valorDiaria * numeroDiarias + taxaServicos;
		 * 
		 * System.out.println("Número de diárias: " + numeroDiarias);
		 * System.out.println("Total a ser pago: R$ " + totalAPagar);
		 * 
		 * scanner.close();
		 */
		/*
		 * 12) Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Digite a idade do cliente:"); int idade =
		 * scanner.nextInt();
		 * 
		 * System.out.
		 * println("Digite o sexo do cliente (M para masculino, F para feminino):");
		 * char sexo = scanner.next().charAt(0);
		 * 
		 * double mensalidade = 0.0;
		 * 
		 * if (sexo == 'M' || sexo == 'm') { if (idade <= 15) { mensalidade = 60.00; }
		 * else if (idade >= 16 && idade <= 18) { mensalidade = 75.00; } else if (idade
		 * >= 19 && idade <= 30) { mensalidade = 90.00; } else if (idade >= 31 && idade
		 * <= 40) { mensalidade = 85.00; } else { mensalidade = 80.00; } } else if (sexo
		 * == 'F' || sexo == 'f') { if (idade <= 18) { mensalidade = 60.00; } else if
		 * (idade >= 19 && idade <= 25) { mensalidade = 90.00; } else if (idade >= 26 &&
		 * idade <= 40) { mensalidade = 85.00; } else { mensalidade = 80.00; } } else {
		 * System.out.println("Sexo inválido."); scanner.close(); return; }
		 * 
		 * System.out.println("Idade do cliente: " + idade + " anos");
		 * System.out.println("Sexo do cliente: " + (sexo == 'M' || sexo == 'm' ?
		 * "Masculino" : "Feminino")); System.out.println("Mensalidade a ser paga: R$ "
		 * + mensalidade);
		 * 
		 * scanner.close();
		 */
		/*
		 * 13) Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.
		 * println("Digite o tipo de apartamento (S para Simples, D para Duplo):"); char
		 * tipoApartamento = scanner.next().charAt(0);
		 * 
		 * System.out.println("Digite a quantidade de dias de hospedagem:"); int
		 * numeroDiarias = scanner.nextInt();
		 * 
		 * double totalAPagar = 0.0;
		 * 
		 * if (tipoApartamento == 'S' || tipoApartamento == 's') { if (numeroDiarias <
		 * 10) { totalAPagar = 100.00; } else if (numeroDiarias >= 10 && numeroDiarias
		 * <= 15) { totalAPagar = 90.00; } else { totalAPagar = 80.00; } } else if
		 * (tipoApartamento == 'D' || tipoApartamento == 'd') { if (numeroDiarias < 10)
		 * { totalAPagar = 140.00; } else if (numeroDiarias >= 10 && numeroDiarias <=
		 * 15) { totalAPagar = 120.00; } else { totalAPagar = 100.00; } } else {
		 * System.out.println("Tipo de apartamento inválido."); scanner.close(); return;
		 * }
		 * 
		 * System.out.println("Tipo de apartamento: " + (tipoApartamento == 'S' ||
		 * tipoApartamento == 's' ? "Simples" : "Duplo"));
		 * System.out.println("Quantidade de dias de hospedagem: " + numeroDiarias);
		 * System.out.println("Total a ser pago: R$ " + totalAPagar);
		 * 
		 * scanner.close()
		 */
		/*
		 * 14) Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Digite um comando Git (git clone, git fetch, git pull):"
		 * ); String comando = scanner.nextLine();
		 * 
		 * switch (comando) { case "git clone":
		 * System.out.println("Comando 'git clone':"); System.out
		 * .println("O comando 'git clone' é usado para criar uma cópia local de um repositório Git remoto."
		 * ); System.out.
		 * println("Exemplo: git clone https://github.com/seu-usuario/seu-repositorio.git"
		 * ); break; case "git fetch": System.out.println("Comando 'git fetch':");
		 * System.out.println(
		 * "O comando 'git fetch' é usado para buscar as atualizações do repositório remoto sem fazer merge com o seu código local."
		 * ); System.out.println("Exemplo: git fetch origin"); break; case "git pull":
		 * System.out.println("Comando 'git pull':"); System.out.println(
		 * "O comando 'git pull' é usado para buscar e incorporar as atualizações do repositório remoto no seu código local."
		 * ); System.out.println("Exemplo: git pull origin master"); break; default:
		 * System.out.println("Comando Git desconhecido."); break; }
		 * 
		 * scanner.close();
		 */
	}
}
