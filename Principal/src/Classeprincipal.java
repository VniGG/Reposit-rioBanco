
public class Classeprincipal {

	public static void main(String[] args) {
		
		ClasseConta objeto_conta_um;
		objeto_conta_um = new ClasseConta();
		
		ClasseConta objeto_conta_dois =new ClasseConta(); // Criou a varável e Instanciou o onjeto(inline).
		
		System.out.println(objeto_conta_um.atributoNumeroConta);
		System.out.println(objeto_conta_um.aributoSaldoConta);
		System.out.println(objeto_conta_um.atributoTipoConta);
	
		
		System.out.println(objeto_conta_dois.atributoNumeroConta);
		System.out.println(objeto_conta_dois.aributoSaldoConta);
		System.out.println(objeto_conta_dois.atributoTipoConta);
	
		
		//Adicionando dados das contas
		objeto_conta_um.atributoNumeroConta = 123;
		objeto_conta_um.aributoSaldoConta = 2_600.00F;
		objeto_conta_um.atributoTipoConta = "Conta Pequena";
		
		objeto_conta_um.atributoNumeroConta = 789;
		objeto_conta_um.aributoSaldoConta = 4_000.00F;
		objeto_conta_um.atributoTipoConta = "Conta Corerente";
		
		System.out.println();
		
		System.out.println(objeto_conta_um.atributoNumeroConta);
		System.out.println(objeto_conta_um.aributoSaldoConta);
		System.out.println(objeto_conta_um.atributoTipoConta);

		
		System.out.println(objeto_conta_dois.atributoNumeroConta);
		System.out.println(objeto_conta_dois.aributoSaldoConta);
		System.out.println(objeto_conta_dois.atributoTipoConta);

		objeto_conta_um.atributoPessoa = new ClassePessoa();
		
		
		
	}

}
