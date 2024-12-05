package frota;

public class Carro extends Veiculo implements Manutencao{
	private int numeroPortas;
	
	public Carro(String placa, int ano, int numeroPortas) {
		super(placa,ano);
		this.numeroPortas = numeroPortas;
	}
	
	

	

	@Override
	public String realizarManutencao() {
		return " Manutenção de carro realizada: revisão geral e troca de óleo " + getPlaca();
		
	}

	@Override
	public double calcularvalorSeguro() {
		
		return 500 + (numeroPortas *50);
	}

}
