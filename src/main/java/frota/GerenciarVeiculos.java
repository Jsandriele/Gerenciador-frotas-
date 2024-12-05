package frota;
import java.util.ArrayList;



public class GerenciarVeiculos{
	public static void main (String[] args) {

		ArrayList<Veiculo> listaVeiculo =new ArrayList<>();

		Carro carro = new Carro("ABC-0897", 2010, 4);
		
		listaVeiculo.add(carro);
		
		Moto moto = new Moto("GRF-8976", 2020, 300);
		 
		listaVeiculo.add(moto);
		
        for (Veiculo veiculo : listaVeiculo) {
            veiculo.exibirDetalhes();
            System.out.printf("valor do seguro: R$1.500"," ", veiculo.calcularvalorSeguro());
            if(veiculo instanceof Manutencao) {
            	System.out.println(((Manutencao)veiculo).realizarManutencao());
            }
        }
	
	}
	

}
