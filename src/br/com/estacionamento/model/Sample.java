package br.com.estacionamento.model;

public class Sample {

	
	public static void main(String[] args) {
		
		
		
		Estacionamento estacionamento = new Estacionamento(1,"EstacioneBem","4199999999","estacionebem@estacionebem.com","001454545/0001-66");
		
		
		EstacionarCarro estacionarCarro = new EstacionarCarro();
		
		estacionarCarro.setId(1);
		estacionarCarro.setVagaNumero(30);
		estacionarCarro.estacionarVeiculo();
		estacionarCarro.setCarro(new Carro(1,"Marea","ABC-1234"));
		
		
		estacionarCarro.retirarVeiculo();
		
		EstacionarCarro estacionarCarro2 = new EstacionarCarro();
		
		estacionarCarro2.setId(2);
		
		
		estacionarCarro2.setVagaNumero(15);
		estacionarCarro2.estacionarVeiculo();
		estacionarCarro2.setCarro(new Carro(2,"Gol","XYY-4321"));
		estacionarCarro2.retirarVeiculo();
		
		
			
	
		estacionamento.getEstacionarCarros().add(estacionarCarro);
		estacionamento.getEstacionarCarros().add(estacionarCarro2);
		
		System.out.print(estacionamento.toString());
		
		System.out.print("Total Carros Estacionados : " + EstacionarCarro.getNcarrosEstacionados());
		
		
		
		
		/* Date inicio = new Date();
	    
	       Date fim = new Date();
	    
	    
	       System.out.print(inicio.getHours()-15);
	    		
		*/
		
		
		
		

	}

}
