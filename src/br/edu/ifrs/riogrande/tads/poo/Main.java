import model.*;

class Main {
  public static void main(String[] args) {
    // existe independente de um aluno (agregação)
    
    Aluno joaoPedro = 
      new Aluno(2024112233, "77722233344", "João Pedro");
    
    Aluno rodrigo = 
      new Aluno(2024445566, "66633344411", "Rodrigo");
    
    // Certificado c1 = new Certificado("AWS BeanStalk", 80);
    
    joaoPedro.submeterCertificado("AWS BeanStalk", 80);
    System.out.println(joaoPedro.getCertificados());
    
    rodrigo.submeterCertificado("AWS BeanStalk", 80);
    System.out.println(rodrigo.getCertificados());
    
    joaoPedro.submeterCertificado("REGEX", 100);
    System.out.println(joaoPedro.getCertificados());

    Certificado regex = joaoPedro.getCertificados().getLast();
    System.out.println(regex);
    rodrigo.getCertificados().add(regex);
    System.out.println(rodrigo.getCertificados());
    

    /*
     * try {
     * joaoPedro.submeterCertificado(c1);
     * System.out.println(joaoPedro.getCertificados());
     * } catch (CertificadoException e) {
     * System.err.println(e);
     * }
     * 
     * Certificado c2 = new Certificado("REGEX", 10);
     * 
     * try {
     * joaoPedro.submeterCertificado(c2);
     * System.out.println(joaoPedro.getCertificados());
     * } catch (CertificadoException e) {
     * System.err.println(e);
     * }
     */
      
  }
}