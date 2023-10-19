package domain;

import exceptions.IdadeInvalidaException;

public class Pessoa {

    private static final short ZERO = 0;
    private static final short CENTO_CINQUENTA = 150;
    private static final String IDADE_NAO_PERMITIDA = "Idade Não Permitida";
    
    private String nome;
    private short idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade){
        this.idade = idade;
    }

    public void verificaIdade() throws IdadeInvalidaException{
         if(this.idade < ZERO || this.idade > CENTO_CINQUENTA){
            throw new IdadeInvalidaException(IDADE_NAO_PERMITIDA);
        }
    }
    
}
