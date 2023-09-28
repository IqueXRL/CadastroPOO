import Model.*;

import java.io.FileNotFoundException;

public class TestePersistência {
    public static void main(String[] args) {
        int contadorIds = 1;

        PessoaFisica caique = new PessoaFisica(contadorIds, "Caique",  "222", 24);
        contadorIds++;
        PessoaFisica aline = new PessoaFisica(contadorIds, "Aline",  "111", 33);
        contadorIds++;


        PessoaFisicaRepo repo1 = new PessoaFisicaRepo();
        repo1.inserir(caique);
        repo1.inserir(aline);


        try {
            repo1.persistir("pessoas.fisica.bin");
        } catch (FileNotFoundException e ) {
            System.out.println(e);
        }


        PessoaFisicaRepo repo2 = new PessoaFisicaRepo();

        try {
            repo2.recuperar(".fisica.bin");
            repo2.obterTodos().forEach(pessoaFisica -> {
                System.out.println("Id: " + pessoaFisica.getId());
                System.out.println("Nome: " + pessoaFisica.getNome());
                System.out.println("CPF: " + pessoaFisica.getCpf());
                System.out.println("Idade: " + pessoaFisica.getIdade());
            });
        } catch (FileNotFoundException e) {
            System.out.println(e);}

        PessoaJuridica Baratie = new PessoaJuridica(contadorIds, "Baratie", "333");
        contadorIds++;
        PessoaJuridica Bait = new PessoaJuridica(contadorIds, "Bait", "444");

        PessoaJuridicaRepo repo3 = new PessoaJuridicaRepo();
        repo3.inserir(Baratie);
        repo3.inserir(Bait);

        try {
            repo3.persistir(".juridica.bin");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        PessoaJuridicaRepo repo4 = new PessoaJuridicaRepo();

        try {
            repo4.recuperar("empresas.juridica.bin");
            repo4.obterTodos().forEach(pessoaFisica -> {
                System.out.println("Id: " + pessoaFisica.getId());
                System.out.println("Nome: " + pessoaFisica.getNome());
                System.out.println("CNPJ: " + pessoaFisica.getCnpj());
            });
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}