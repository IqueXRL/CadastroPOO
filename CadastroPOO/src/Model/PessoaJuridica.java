package model;

import Model.Pessoa;

import java.io.Serializable;

public class PessoaJuridica extends Pessoa implements Serializable {
    private String cnpj;

    public PessoaJuridica(int id, String nome, String cnpj) {
        super(id, nome);
        this.cnpj = cnpj;
    }
//construtor procedimento1
    public PessoaJuridica(String s, int i, String mariaEnterprise) {
        super();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj() {
        this.cnpj = cnpj;
    }

    @Override
    public void exibir() {
        System.out.println(
                "Id: " + getId() + "\n" +
                        " Nome: " + getNome() + "\n" +
                        " CNPJ: " + getCnpj()
        );
    }
}
