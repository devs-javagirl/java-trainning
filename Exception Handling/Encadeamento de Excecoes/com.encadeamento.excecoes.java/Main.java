import exception.AcessoNegadoException;

import java.nio.file.AccessDeniedException;

public class Main {

    public static void main(String[] args) {
        try {
            // Simulando uma AccessDeniedException lançando uma exceção de acesso negado
            throw new AccessDeniedException("Acesso negado: arquivo-secreto.txt");
        } catch (AccessDeniedException e) {
            try {
                // Captura a AccessDeniedException e lança a exceção personalizada
                throw new AcessoNegadoException("Ocorreu uma exceção de acesso negado: " + e.getMessage());
            } catch (AcessoNegadoException minhaExcecao) {
                System.err.println("Exceção capturada: " + minhaExcecao.getMessage());
            }
        }
    }
}
