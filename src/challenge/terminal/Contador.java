package challenge.terminal;

import challenge.ParametrosInvalidosException;

public class Contador {
    public void contar(int paramUm, int paramDois) throws ParametrosInvalidosException {
        if (paramUm < paramDois) {
            throw new ParametrosInvalidosException();
        }
        else {
            int contagens = paramUm - paramDois;
            for (int i = 1; i <= contagens; i++) {
                System.out.println("Imprimindo o número: " + i);
            }
        }
    }
}

/*
public class Contador {
	public static void main(String[] args) {
		Scanner challenge.terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = challenge.terminal.??;
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = challenge.terminal.??;

		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		}catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}

	}
	static void contar(int parametroUm, int parametroDois ) throws challenge.ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção

		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}

* */