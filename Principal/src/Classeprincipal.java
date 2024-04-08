
public class Classeprincipal {

	public static void main(String[] args) {
		
		ClasseConta objeto_conta_um;
		objeto_conta_um = new ClasseConta();
		
		ClasseConta objeto_conta_dois =new ClasseConta(); // Criou a varável e Instanciou o onjeto(inline).
		
		System.out.println(objeto_conta_um.atributoNumeroConta);
		System.out.println(objeto_conta_um.aributoSaldoConta);
		System.out.println(objeto_conta_um.atributoTipoConta);
		System.out.println(objeto_conta_um.atributoNomeCliente);
		System.out.println(objeto_conta_um.atributoDocumentoCliente);
		
		System.out.println(objeto_conta_dois.atributoNumeroConta);
		System.out.println(objeto_conta_dois.aributoSaldoConta);
		System.out.println(objeto_conta_dois.atributoTipoConta);
		System.out.println(objeto_conta_dois.atributoNomeCliente);
		System.out.println(objeto_conta_dois.atributoDocumentoCliente);
		
		objeto_conta_um.atributoNumeroConta = 123;
		objeto_conta_um.aributoSaldoConta = 2_600.00F;
		objeto_conta_um.atributoTipoConta = "Conta Pequena";
		
		objeto_conta_um.atributoNumeroConta = 789;
		objeto_conta_um.aributoSaldoConta = 4_000.00F;
		objeto_conta_um.atributoTipoConta = "Conta Corerente";
		
	}

}
