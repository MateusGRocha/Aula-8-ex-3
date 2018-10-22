import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;

public class Produtos {

	private static final DateFormat df = DateFormat.getDateInstance();
	private String nome;
	private double peso;
	private Date dtValidade;
	/**
	 * Construtor
	 * @param nome
	 * @param peso
	 * @param dia
	 * @param mes
	 * @param ano
	 */
	public Produtos(String nome, double peso, int dia, int mes, int ano) {
		this.nome = nome;
		this.peso = peso;
		
		Calendar c = Calendar.getInstance();
		c.set(ano, mes - 1, dia);
		
		this.dtValidade = c.getTime();
		
	}
	
	/**
	 * Metodos Getters
	 * @return
	 */
	
	public String getNome() {
		return nome;
	}
	public double getPeso() {
		return peso;
	}
	public String getFormattedDataValidate() {
		return df.format(dtValidade);
	}
	
}
