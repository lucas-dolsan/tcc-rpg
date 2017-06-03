package Objetos;

public class Sala {

    private int pk_sala;
    private String nome_sala;
    private String senha_sala;
    private String dono_sala;

    public Sala(int pk_sala, String nome_sala, String senha_sala, String dono_sala) {
        this.pk_sala = pk_sala;
        this.nome_sala = nome_sala;
        this.senha_sala = senha_sala;
        this.dono_sala = dono_sala;
    }

    public Sala() {
    }

    @Override
    public String toString() {
        return "Sala{" + "pk_sala=" + pk_sala + ", nome_sala=" + nome_sala + ", senha_sala=" + senha_sala + ", dono_sala=" + dono_sala + '}';
    }

    public int getPk_sala() {
        return pk_sala;
    }

    public void setPk_sala(int pk_sala) {
        this.pk_sala = pk_sala;
    }

    public String getNome_sala() {
        return nome_sala;
    }

    public void setNome_sala(String nome_sala) {
        this.nome_sala = nome_sala;
    }

    public String getSenha_sala() {
        return senha_sala;
    }

    public void setSenha_sala(String senha_sala) {
        this.senha_sala = senha_sala;
    }

    public String getDono_sala() {
        return dono_sala;
    }

    public void setDono_sala(String dono_sala) {
        this.dono_sala = dono_sala;
    }

}
