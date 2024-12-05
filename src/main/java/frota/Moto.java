package frota;

public  class Moto extends Veiculo implements Manutencao{
	private int cilindrada;

	public Moto(String placa, int ano, int cilindrada) {
		super(placa,ano);
		this.cilindrada = cilindrada;
	}

	@Override
	public String realizarManutencao() {
		
		return " Manutenção da moto realizada: ajuste da corrente e revisão do motor. ";
	}

	@Override
	public double calcularvalorSeguro() {
		
		 return 300 + (cilindrada * 0.1);
	}

}
