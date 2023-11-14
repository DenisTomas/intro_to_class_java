public class Aluno {
    private String nome;
    private String enderecoResidencial;
    private String telefoneContato;
    private String enderecoEmail;
    private String matricula;

    public Aluno(String nome, String enderecoResidencial, String telefoneContato, String enderecoEmail,
            String matricula) {
        this.nome = nome;
        this.enderecoResidencial = enderecoResidencial;
        this.telefoneContato = telefoneContato;
        this.enderecoEmail = enderecoEmail;
        this.matricula = matricula;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public String getMatricula() {
        return matricula;
    }
}
