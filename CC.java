public class CC extends Conta {
    private static int SEQUENCIAL= 1;
    public cc(){
        super.agencia = agencia11;
        super.numero = SEQUENCIAL++;
       
            public void imprimirextrato(){
                System.out.println("=== Extrato cc ===");
                System.out.println (String.format("Agencia: %d", super.agencia));
                System.out.println (String.format("Numero: %d", super.numero));
                System.out.println (String.format("Saldo: %.2f", super.saldo));
            }
        
    }
}
  