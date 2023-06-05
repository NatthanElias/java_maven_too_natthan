
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Aluno;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Emprestimo;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Exemplar;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Funcionario;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Pessoa;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author telmo
 */
public class Biblioteca {    
    /*
        Exercício 1: criar um método que retorne uma coleção de Pessoas.       
        Essa coleção deve ter 3 Alunos e 2 Funcionarios.
        No construtor da classe Biblioteca chame o método criado anteriormente e
        imprima na saída padrão todas as Pessoas, ordenadas pela
        Data de nascimento (ordem desc).
        Dica: implementar o implements Comparable<Pessoa> e sobrescrever o método
        compareTo em Pessoa. 
    */
    private Collection<Pessoa> exercicio1(){  
        
        List<Pessoa> listagem = new ArrayList();        
        //adicionar 3 alunos e 2 funcionarios.
        Aluno a1 = new Aluno("123", null, null, null, null, null, 0, null, null, null);                    
            Calendar c = Calendar.getInstance();
            c.set(Calendar.YEAR, 1999);
            a1.setDataNascimento(c);
            
        Aluno a2 = new Aluno("4123", null, null, null, null, null, 0, null, null, null);
            c = Calendar.getInstance();
            c.set(Calendar.YEAR, 1990);
            a2.setDataNascimento(c);
            
        Aluno a3 = new Aluno("789", null, null, null, null, null, 0, null, null, null);
            c = Calendar.getInstance();
            c.set(Calendar.YEAR, 1983);
            a3.setDataNascimento(c);
        
        Funcionario f1 = new Funcionario("123456", "0000");
            c = Calendar.getInstance();
            c.set(Calendar.YEAR, 2022);
            f1.setDataNascimento(c);
            
        Funcionario f2 = new Funcionario("123456", "0000");
            c = Calendar.getInstance();
            c.set(Calendar.YEAR, 2021);
            f2.setDataNascimento(c);
            
        Funcionario f3 = new Funcionario("123456", "0000");
            c = Calendar.getInstance();
            c.set(Calendar.YEAR, 2020);
            f3.setDataNascimento(c);
        
        listagem.add(a1);
        listagem.add(a2);
        listagem.add(a3);
        listagem.add(f1);
        listagem.add(f2);
        listagem.add(f3);
        
        Collections.sort(listagem);//classifica por data de nascimento (testar se vai classificar por odem asc ou desc.)
        
        return listagem;
    }
    /*
        Exercício 2: resolver o problema de sintaxe "new Pessoa()", criando
        um construtor na classe Aluno, que receba os parâmetros(String cpf, 
        String rg, String nome, String logradouro, String cep, Integer numero,
        String telefone,Calendar data_cadastro, Calendar data_nascimento e matricula)
        Os primeiros 9 parâmetros deverão ser encaminhados para o construtor
        de Pessoa, utilizando o comando super(cpf, rg, ...).
        O décimo parâmetro deverá ser atribuido para o atributo da instância.
    */    
    /*
        Exercício 3: criar um método que retorne uma coleção de Empréstimo. Esse método deverá
        receber por parâmetro uma lista de Funcionario, Aluno e Exemplar. Cada elemento recebido
        por parâmetro deverá ser vinculado a um Empréstimo.   
    */
    private Collection<Emprestimo> questao3(List<Funcionario> listFunc, List<Aluno> listAluno, List<Exemplar> listExemp){
        
        Collection<Emprestimo> listRetorno = new ArrayList();
        
          Emprestimo emp = new Emprestimo();
            //setar no emp o Exemplar
            //setar no emp o aluno
            //setar no emp o funcionario
            //setar as demais informações.
            
            
        listRetorno.add(emp);
                
        return listRetorno;
    }
    
    /*
        Exercicio 4: testar o método criado na questão 3 (chamar e imprimir o retorno).
    */
    
    /*
        Exercicio 5: criar um método que receba por pârametro um Funcionario, Aluno e Exemplar.
        Defini através de constantes as demais informações.
        Calcule o valor do emprestimo em cinco vezes e adicione na lista de parcelamento.
        Esse método deverá retornar uma instância de Emprestimo.
        
    */
    
    /*
        Exercicio 6: testar o método criado na questão 5 (chamar e imprimir o retorno).
    */
    
    
    Biblioteca(){
      
        
        
        Collection<Pessoa> ret = exercicio1();
        
        //questao 1
        
        for(Pessoa pes : ret){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            System.out.println("Pessoa: "+sdf.format(pes.getDataNascimento().getTime()));
        }
        
        //questao 2.
        /*definir/setar/guardar valores para os demais atributos do objeto p*/
        /*alternativa 1 : atraves do construtor*/
        
        Aluno p = new Aluno("abc123", "00123", 
                              "123",
                              "fulano",
                              "rua das flores",
                              "99010000",
                              123,
                              "5430130000",
                              Calendar.getInstance(),
                              Calendar.getInstance()
        );        
        System.out.println("Nome: "+p.getNome()+" CPF: "+p.getCPF());
        
        p.setDataNascimento(Calendar.getInstance());        
        //p.idade = 22;        
        System.out.println("Idade da pessoa: "+p.getIdade());
        
        
    }
    
    public static void main(String args[]){
        /* métod estático*/
        new Biblioteca();
        //https://plantuml.com/ie-diagram
    }
}
