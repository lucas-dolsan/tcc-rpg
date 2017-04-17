package ConexaoBanco;

public class Jogador {

    private int pk_jogador;
    private String nome_jog;
    private String senha_jog;
    private String email_jog;

    public Jogador(String nome_jog, String email_jog, String senha_jog) {
        this.nome_jog = nome_jog;
        this.email_jog = email_jog;
        this.senha_jog = senha_jog;

    }

    public Jogador() {
    }

    public int getPk_jogador() {
        return pk_jogador;
    }

    public void setPk_jogador(int pk_jogador) {
        this.pk_jogador = pk_jogador;
    }

    public String getNome_jog() {
        return nome_jog;
    }

    public void setNome_jog(String nome_jog) {
        this.nome_jog = nome_jog;
    }

    public String getSenha_jog() {
        return senha_jog;
    }

    public void setSenha_jog(String senha_jog) {
        this.senha_jog = senha_jog;
    }

    public String getEmail_jog() {
        return email_jog;
    }

    public void setEmail_jog(String email_jog) {
        this.email_jog = email_jog;
    }

}
