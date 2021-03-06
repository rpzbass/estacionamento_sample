package br.com.estacionamento.model;

public class Carro {

		private Integer id;
	    private String modelo;
		private String placa;
		
		public Carro() {
			
		}
		
	

		public Carro(Integer id,String modelo,String placa) {
			
			this.id = id;
			this.modelo = modelo;
			this.placa = placa;
		}
		
		public Carro(Carro objeto) {
			
			this.id = objeto.id;
			this.modelo = objeto.modelo;
			this.placa = objeto.placa;
		}
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		}

		@Override
		public String toString() {
			return "Carro [id=" + id + ", modelo=" + modelo + ", placa=" + placa + "]";
		}
		
}
