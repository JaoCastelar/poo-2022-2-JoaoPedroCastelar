public class Ex5ContaBancaria {
    

    private double saldo;
    private double limite;

    public Ex5ContaBancaria(double valorSaldo, double valorLimite){}
    
    

    public double getSaldo() {
        return saldo;
    }



    protected double getLimite() {
        return limite;
    }



    public double getSaldoComLimite(){
        double saldo = this.saldo;
        double limite = this.limite;

        double sum = saldo + limite;

        return sum;
    }


    public boolean sacar(double valor) throws Ex5ContaException {
        boolean sac = false;
        try{
        if(valor > 500) {
            throw new Ex5ContaException("Valor além do permitido");
        }else if((this.limite + this. saldo) < 0) {
            throw new Ex5ContaException("Saldo e/ou limite insuficiente");
        }else{
            if (this.saldo <= 0) {
                this.limite -= valor;
            }else{
                this.saldo -= valor;
            }
            System.out.println("Saque efetuado com sucesso");
            sac = true;
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return sac;
    }

    public void depositar(double valor) throws Ex5ContaException {
        try {
            if (valor > 999) {
                throw new Ex5ContaException("Valor além do permitido");
            } else {
                this.saldo += valor;
                System.out.println("Deposito efetuado com sucesso");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
