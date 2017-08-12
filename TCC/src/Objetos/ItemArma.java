package Objetos;

public class ItemArma {

    private int pk_itemWeapon;
    private int fk_personagem;
    private String nome_itWea;
    private String icone_itWea;
    private int danoBase_itWea;
    private String atributos_itWea;
    private String descricao_itWea;

    public ItemArma(int fk_personagem, String nome_itWea, String icone_itWea, int danoBase_itWea, String atributos_itWea, String descricao_itWea) {
        this.fk_personagem = fk_personagem;
        this.nome_itWea = nome_itWea;
        this.icone_itWea = icone_itWea;
        this.danoBase_itWea = danoBase_itWea;
        this.atributos_itWea = atributos_itWea;
        this.descricao_itWea = descricao_itWea;
    }

    @Override
    public String toString() {
        return "ItemArma{" + "pk_itemWeapon=" + pk_itemWeapon + ", fk_personagem=" + fk_personagem + ", nome_itWea=" + nome_itWea + ", icone_itWea=" + icone_itWea + ", danoBase_itWea=" + danoBase_itWea + ", atributos_itWea=" + atributos_itWea + ", descricao_itWea=" + descricao_itWea + '}';
    }

    public ItemArma() {
    }

    public int getPk_itemWeapon() {
        return pk_itemWeapon;
    }

    public void setPk_itemWeapon(int pk_itemWeapon) {
        this.pk_itemWeapon = pk_itemWeapon;
    }

    public int getFk_personagem() {
        return fk_personagem;
    }

    public void setFk_personagem(int fk_personagem) {
        this.fk_personagem = fk_personagem;
    }

    public String getNome_itWea() {
        return nome_itWea;
    }

    public void setNome_itWea(String nome_itWea) {
        this.nome_itWea = nome_itWea;
    }

    public String getIcone_itWea() {
        return icone_itWea;
    }

    public void setIcone_itWea(String icone_itWea) {
        this.icone_itWea = icone_itWea;
    }

    public int getDanoBase_itWea() {
        return danoBase_itWea;
    }

    public void setDanoBase_itWea(int danoBase_itWea) {
        this.danoBase_itWea = danoBase_itWea;
    }

    public String getAtributos_itWea() {
        return atributos_itWea;
    }

    public void setAtributos_itWea(String atributos_itWea) {
        this.atributos_itWea = atributos_itWea;
    }

    public String getDescricao_itWea() {
        return descricao_itWea;
    }

    public void setDescricao_itWea(String descricao_itWea) {
        this.descricao_itWea = descricao_itWea;
    }

}
