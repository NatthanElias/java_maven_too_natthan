/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao2;

import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.Funcionario;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.Orcamento;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.Pessoa;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.Cliente;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.Veiculo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Natthan
 */
public class Questao_2_3_4 {
    
    private List<Pessoa> pessoas = new ArrayList<>();
    
    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
    
    public int quantidadePessoa() {
        return pessoas.size();
    }
    
    public void excluirPessoa(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }
    
    public Pessoa getPessoa(int posicao) {
        return pessoas.get(posicao);
    }

    public Questao_2_3_4() {
        inicializaListaPessoas();
    }
    
    private List<Pessoa> inicializaListaPessoas() {
        
        Funcionario func1 = new Funcionario();
        Cliente cli1 = new Cliente();
        
        func1.setCpf("11111357788");
        func1.setNome("Zé Chaves");
            Calendar c = Calendar.getInstance();
            //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            //System.out.println(sdf.format(c.getTime())); PRINTA DIA DE HOJE
            c.set(Calendar.DAY_OF_MONTH, 01);
            c.set(Calendar.MONTH, 05);
            c.set(Calendar.YEAR, 1983);
        func1.setData_nascimento(c);
        func1.setCep("99052250");
        func1.setComplento("apartamento 400");
        func1.setNumero_ctps("123");
            Calendar z = Calendar.getInstance();
            z.set(Calendar.DAY_OF_MONTH, 20);
            z.set(Calendar.MONTH, 10);
            z.set(Calendar.YEAR, 1999);
        func1.setData_admissao(z);
        
        adicionarPessoa(func1);
        
        cli1.setCpf("11111357788");
        cli1.setNome("Zé Chaves");
        cli1.setData_nascimento(c);
        cli1.setCep("99052250");
        cli1.setComplento("apartamento 400");
        cli1.setObservacoes("cliente que paga em dia");
            Veiculo carro = new Veiculo();
            carro.setPlaca("igd1903");
            carro.setModelo("vectra");
            carro.setAno(1997);
                Calendar x = Calendar.getInstance();
                x.set(Calendar.DAY_OF_MONTH, 01);
                x.set(Calendar.MONTH, 02);
                x.set(Calendar.YEAR, 2022);
            carro.setData_ultimo_servico(x);
        
        adicionarPessoa(cli1);
        
        return pessoas;
    }
    
    private List<Orcamento> inicializaListaOrcamento() {
        
    }
    
    
    private void imprimeListaPessoas(List<Pessoa> lista){
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Pessoa f = new Funcionario();
        Pessoa c = new Cliente();
        
        for(int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i) instanceOf Pessoa) {//if(f instanceOf Pessoa)???????
                f = (Funcionario)getPessoa(i);
                System.out.println("cpf = " + lista.get(i).getCpf());
                System.out.println("nome = " + lista.get(i).getNome());
                System.out.println("data_nascimento = " + lista.get(i).getData_nascimento());
                System.out.println("cep = " + lista.get(i).getCep());
                System.out.println("complemento = " + lista.get(i).getComplento());
                System.out.println("numero_ctps = " + f.getNumero_ctps(i));
                System.out.println("data_admissao = " + lista.get(i).getData_admissao());
            }
        }
        
    }
    
    private void imprimeListaOrcamentos(List<Orcamento> lista){          
    
    }
    
    public static void main(String args[]){ 
        new Questao_2_3_4();    
    }
}
