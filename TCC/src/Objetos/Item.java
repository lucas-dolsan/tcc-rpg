package Objetos;

public class Item {

    private int pk_item;
    private int fk_personagem;
    private String nome_ite;
    private String icone_ite;
    private String atributos_ite;
    private String descricao_ite;
    private int quantidade_ite;

    public int getQuantidade_ite() {
        return quantidade_ite;
    }

    public void setQuantidade_ite(int quantidade_ite) {
        this.quantidade_ite = quantidade_ite;
    }

    public Item(int fk_personagem, String nome_ite, String icone_ite, String atributos_ite, String descricao_ite, int quantidade_ite) {
        this.fk_personagem = fk_personagem;
        this.nome_ite = nome_ite;
        this.icone_ite = icone_ite;
        this.atributos_ite = atributos_ite;
        this.descricao_ite = descricao_ite;
        this.quantidade_ite = quantidade_ite;
    }

    public Item() {
    }

    public int getPk_item() {
        return pk_item;
    }

    public void setPk_item(int pk_item) {
        this.pk_item = pk_item;
    }

    public int getFk_personagem() {
        return fk_personagem;
    }

    public void setFk_personagem(int fk_personagem) {
        this.fk_personagem = fk_personagem;
    }

    public String getNome_ite() {
        return nome_ite;
    }

    public void setNome_ite(String nome_ite) {
        this.nome_ite = nome_ite;
    }

    public String getIcone_ite() {
        return icone_ite;
    }

    public void setIcone_ite(String icone_ite) {
        this.icone_ite = icone_ite;
    }

    public String getAtributos_ite() {
        return atributos_ite;
    }

    public void setAtributos_ite(String atributos_ite) {
        this.atributos_ite = atributos_ite;
    }

    public String getDescricao_ite() {
        return descricao_ite;
    }

    public void setDescricao_ite(String descricao_ite) {
        this.descricao_ite = descricao_ite;
    }

}
