import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciando novos Produtos
		Produtos produto1 = new Produtos("Feijão", 2.5, 04, 10, 2020);
		Produtos produto2 = new Produtos("Café", 1, 01, 02, 2022);
		Produtos produto3 = new Produtos("Beterraba", 0.9, 12 , 11, 2017);
		
		//adicionando para o Portugues do Brasil
		Locale l = new Locale("pt", "BR");
		
		//Imprimindo os Resultados
		System.out.println(String.format(l, "%d) %12s %09.2f %s", 1, produto1.getNome(), produto1.getPeso(), produto1.getFormattedDataValidate()));
		System.out.println(String.format(l, "%d) %12s %09.2f %s", 2, produto2.getNome(), produto2.getPeso(), produto2.getFormattedDataValidate()));
		System.out.println(String.format(l, "%d) %12s %09.2f %s", 3, produto3.getNome(), produto3.getPeso(), produto3.getFormattedDataValidate()));
		
	}

}
