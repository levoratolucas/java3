package classes;

public class Funcionario extends Pessoa {
    
        private double salario;
        private Pessoa pessoa = new Pessoa();
    
        public Funcionario(Pessoa pes) {
            this.pessoa = pes;
        }
    
        public Pessoa GetPessoa() {
            return pessoa;
        }
        public double GetSalario() {
            return salario;
        }
        public void setSalario(double s){
            this.salario=s;
        }
    
}
