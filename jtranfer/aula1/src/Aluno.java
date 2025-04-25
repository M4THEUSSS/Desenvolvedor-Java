// encapsulamento
// public
// private
// protected
// package

public class Aluno {

    // Variáveis = Atributos 
    // Características
    private String nome;
    private int idade;
    private boolean temFaculdade;

    public Aluno (){

    }
    public Aluno(String nome,int idade,boolean temFaculdade){
        this.nome = nome;                     // atributo do tipo Texto
        this.idade = idade;                   // atributo do tipo Número
        this.temFaculdade = temFaculdade;     // atributo do tipo booleano (0 e 1)
    } 

    public String getNome(){                  // método para pegar o nome 
        return nome;
    }
    public int getIdade(){                    // método para pegar a idade
        return idade;
    }
    public boolean getTemFaculdade(){         // método para pegar o temFaculdade
        return temFaculdade;
    }









                         // Classes Wrappers
    /*
     *
     *   Considerando a explicação do professor:
     * tipo primitivo x classes Wrappers
     * 
     * Você tem que descobrir quantos alunos 
     * tem faculdade (sim ou Não)
     * temFaculdade
     * sim/não  - 0 ou 1 
     * 
     *  
     *  
    
     * 
    */
    
}
