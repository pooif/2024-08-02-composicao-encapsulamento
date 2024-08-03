package model;

public class CertificadoException extends RuntimeException {

  public CertificadoException(String msg) {
    super(msg); 
    // superclasse, quem estou estendendo: RuntimeException
  }
}
