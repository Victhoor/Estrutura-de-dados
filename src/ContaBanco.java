
public class ContaBanco {
	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	// Métodos
	public void abrirConta(String tipo) {
		setTipo(tipo);
		setStatus(true);
		
		if(tipo == "CC" || tipo == "cc") {
			setSaldo(50);
		}else if(tipo == "CP" || tipo == "cp"){
			setSaldo(150); 
		}
	}
	
	public void fecharConta() {
		if(getSaldo() > 0) {
			System.out.println("Conta com dinheiro!");
		}else if(getSaldo() < 0){
			System.out.println("Conta em débito!"); 
		}else {
			setStatus(false);
		}
	}
	
	public void depositar(float valor) {
		if(getStatus()) {
			setSaldo(getSaldo() + valor);
		}else {
			System.out.println("Impossível depositar");
		}
	}
	
	public void sacar(float valor) {
		if(getStatus()) {
			
			if(getSaldo() >= valor) {
				setSaldo(getSaldo() - valor);
			}else {
				System.out.println("Saldo insuficiente!");  
			}
			
		}else {
			System.out.println("Impossível sacar!");
		}
	}
	
	public void pagarMensal() {
		float taxa = 0;
		
		if(getTipo() == "CC" || getTipo() == "cc") {
			taxa = 12;
		}else if(getTipo() == "CP" || getTipo() == "cp") {
			taxa = 20;
		}
		
		if(getStatus()) {
			
			if(getSaldo() >= taxa) {
				setSaldo(getSaldo() - taxa);
			}else {
				System.out.println("Saldo insuficiente");
			}
			
		}else {
			System.out.println("Conta inativa!");
		}
	}
	
	
	// Métodos Especiais
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getNumConta() {
		return this.numConta;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public String getDono() {
		return this.dono;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getSaldo() {
		return this.saldo;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean getStatus() {
		return this.status;
	}
	
}
