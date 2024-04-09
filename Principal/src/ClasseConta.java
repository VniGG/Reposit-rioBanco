
public class ClasseConta {
	
	short atributoNumeroConta; //0
	float atributoSaldoConta; //0.0
	String atributoTipoConta; // null

	ClassePessoa atributoPessoa;
	
	void metodoDepositar(float parametroValorEnviado){
		
		this.atributoSaldoConta = this.atributoSaldoConta + parametroValorEnviado;
		//this.atributoSaldoConta += parametroValorEnviao;
		
	}
	
	void metodoSacar(float parametroValorSaque){
	
		if(this.atributoSaldoConta < parametroValorSaque){
			System.out.println("Limite insuficiente");
			
		}
		else{
			this.atributoSaldoConta = this.atributoSaldoConta - atributoSaldoConta;
		}
		
		
	}
	void metodoTrasnferir(float parametroValorTransferido, ClasseConta origem, ClasseConta destino){
		origem.atributoSaldoConta -= atributoSaldoConta;
		destino.atributoSaldoConta += parametroValorTransferido;
		
		
	}
}
