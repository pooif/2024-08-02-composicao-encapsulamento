package model;

import java.util.UUID;

public class Certificado {

  private final UUID id;
  private final String titulo;
  private final int horas;
  
  /* default: package private */ 
  Certificado(String titulo, int horas) {
    this.id = UUID.randomUUID();
    this.titulo = titulo;
    this.horas = horas;
  }

  public UUID getId() {
      return id;
  }

  public String getTitulo() {
    return titulo;
  }

  public int getHoras() {
    return horas;
  }

  @Override
  public String toString() {
    return "Certificado [id=" + id + ", titulo=" + titulo + ", horas=" + horas + "]";
  }


    
}
