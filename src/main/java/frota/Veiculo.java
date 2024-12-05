package frota;

abstract class Veiculo {
	private String placa;
	private int ano;
	
	public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
		
	}
	
	public String getPlaca(){
		return placa;
	}
	public int getAno() {
		return ano;
	}
	
	
	public abstract double calcularvalorSeguro();
	
	
	public void exibirDetalhes() {
		System.out.println("Placa"+" " + placa);
		System.out.println("Ano" + " "+ ano);
	}

}
