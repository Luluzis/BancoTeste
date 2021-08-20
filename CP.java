public class CP extends Conta {
    public void imprimirextrato(){
        System.out.println("=== Extrato cp ===");
        System.out.println (String.format("Agencia: %d", super.agencia));
        System.out.println (String.format("Numero: %d", super.numero));
        System.out.println (String.format("Saldo: %.2f", super.saldo));
    }
}
