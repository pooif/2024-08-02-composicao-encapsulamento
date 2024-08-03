package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aluno {
  // constantes
  public static final int NUMERO_MAXIMO_CERTIFICADOS = 3;
  public static final int NUMERO_MINIMO_HORAS = 50;
  // atributos imutáveis
  private final int matricula;
  private final String cpf;
  // atributo mutável
  private String nome;

  // encapsulamento
  private final ArrayList<Certificado> certificados =
    new ArrayList<>();

  public List<Certificado> getCertificados() {
    // devolução cópia
    // return new ArrayList<Certificado>(certificados);
    return List.copyOf(certificados);
  }

  // agregação:
  // public void submeterCertificad(Certificado c)
  // composição:
  public void submeterCertificado(String titulo, int horas) {
    Certificado c = new Certificado(titulo, horas);
    if (certificados.contains(c)) { // guard-clause
      throw new CertificadoException("Já existe");
    }
    // número mágico: NUMERO MAXIMO CERTIFICADOS
    if (certificados.size() == NUMERO_MAXIMO_CERTIFICADOS) { 
      throw new CertificadoException("Número máximo de " + NUMERO_MAXIMO_CERTIFICADOS + " atingido");
    }
    if (c.getHoras() < NUMERO_MINIMO_HORAS) {
      throw new CertificadoException("Certificado com menos de " + NUMERO_MINIMO_HORAS + " horas");
    }

    certificados.add(c);
  }

  public Aluno(int matricula, String cpf, String nome) {
    this.matricula = matricula;
    this.cpf = cpf;
    this.nome = nome;
  }

  public int getMatricula() {
    return matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  @Override
  public String toString() {
    return "Aluno [matricula=" + matricula + ", nome=" + nome + ", cpf=" + cpf + "]";
  }


}
