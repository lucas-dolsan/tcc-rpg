package Objetos;

public class Magia {

    private int pk_magia;
    private int fk_personagem;
    private String nome_mag;
    private String icone_mag;
    private String efeito_mag;
    private String tipo_mag;
    private String descricao_mag;
    private String atributos_mag;

    public Magia(int fk_personagem, String nome_mag, String icone_mag, String efeito_mag, String tipo_mag, String descricao_mag, String atributos_mag) {
        this.fk_personagem = fk_personagem;
        this.nome_mag = nome_mag;
        this.icone_mag = icone_mag;
        this.efeito_mag = efeito_mag;
        this.tipo_mag = tipo_mag;
        this.descricao_mag = descricao_mag;
        this.atributos_mag = atributos_mag;
    }

    public Magia() {
    }

    @Override
    public String toString() {
        return "Magia{" + "pk_magia=" + pk_magia + ", fk_personagem=" + fk_personagem + ", nome_mag=" + nome_mag + ", icone_mag=" + icone_mag + ", efeito_mag=" + efeito_mag + ", tipo_mag=" + tipo_mag + ", descricao_mag=" + descricao_mag + ", atributos_mag=" + atributos_mag + '}';
    }

    public int getPk_magia() {
        return pk_magia;
    }

    public void setPk_magia(int pk_magia) {
        this.pk_magia = pk_magia;
    }

    public int getFk_personagem() {
        return fk_personagem;
    }

    public void setFk_personagem(int fk_personagem) {
        this.fk_personagem = fk_personagem;
    }

    public String getNome_mag() {
        return nome_mag;
    }

    public void setNome_mag(String nome_mag) {
        this.nome_mag = nome_mag;
    }

    public String getIcone_mag() {
        return icone_mag;
    }

    public void setIcone_mag(String icone_mag) {
        this.icone_mag = icone_mag;
    }

    public String getEfeito_mag() {
        return efeito_mag;
    }

    public void setEfeito_mag(String efeito_mag) {
        this.efeito_mag = efeito_mag;
    }

    public String getTipo_mag() {
        return tipo_mag;
    }

    public void setTipo_mag(String tipo_mag) {
        this.tipo_mag = tipo_mag;
    }

    public String getDescricao_mag() {
        return descricao_mag;
    }

    public void setDescricao_mag(String descricao_mag) {
        this.descricao_mag = descricao_mag;
    }

    public String getAtributos_mag() {
        return atributos_mag;
    }

    public void setAtributos_mag(String atributos_mag) {
        this.atributos_mag = atributos_mag;
    }

}
