package Excecoes.exercicio01.exceptions;

public class BusinessException extends RuntimeException{
    public BusinessException(String msg){
        super(msg);
    }
}
