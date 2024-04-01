package classes;

import java.util.List;
import java.util.ArrayList;

public class Copel {
    private List<Pessoa> clientes;
    private double conta = 0;
    

    public void setCliente(Pessoa cliente) {
        this.clientes.add(cliente);
    }

    public Pessoa getCliente(int i) {
        return clientes.get(i);
    }

    // 1 (Residência) 0,60
    // 2 (Comércio) 0,48
    // 3 (Indústria) 1,29
    public Copel() {
        this.clientes = new ArrayList<>();
    }

    public String getConta(int tipo, int kw) {
        switch (tipo) {
            case 1:
                conta = kw * 0.6;
                return String.format("Tipo Residência, Base de calculo 0,60 Sua Fatura ficou : R$ %.2f ",conta);
                
            case 2:
                conta = kw * 0.48;
                 return String.format("Tipo Comércio, Base de calculo 0,48 Sua Fatura ficou : R$ %.2f ",conta);
            case 3:
                conta = kw * 1.29;
                 return String.format("Tipo Indústria, Base de calculo 1,29 Sua Fatura ficou : R$ %.2f ",conta);
            default:
               
                return  "tipo invalido";
        }
    }
}
