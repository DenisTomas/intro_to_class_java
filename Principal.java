public class Principal {
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Maria", "Rua X", "14-9999-9999", "maria@gmail.com", "999-8596");
    Aluno aluno2 = new Aluno("João", "Rua Y", "14-9999-8888", "jose@gmail.com", "999-8888");
  
    
    System.out.println("Informações sobre Aluno 1:");
    System.out.println("Nome: " + aluno1.getNome());
    System.out.println("Endereço Residencial: " + aluno1.getEnderecoResidencial());
    System.out.println("Telefone de Contato: " + aluno1.getTelefoneContato());
    System.out.println("Endereço de E-mail: " + aluno1.getEnderecoEmail());
    System.out.println("Matrícula: " + aluno1.getMatricula());
    System.out.println();

    System.out.println("Informações sobre Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Endereço Residencial: " + aluno2.getEnderecoResidencial());
        System.out.println("Telefone de Contato: " + aluno2.getTelefoneContato());
        System.out.println("Endereço de E-mail: " + aluno2.getEnderecoEmail());
        System.out.println("Matrícula: " + aluno2.getMatricula());

}
  
}
