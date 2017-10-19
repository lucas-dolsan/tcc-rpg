package Objetos;

public class ItemArmadura {

    private int pk_itemArmor;
    private int fk_personagem;
    private String nome_iArmo;
    private String icone_iArmo;
    private int defesaBase_iArmo;
    private String atributos_iArmo;
    private String descricao_iArmo;
    private int quantidade_iArmo;

    public ItemArmadura(int fk_personagem, String nome_iArmo, String icone_iArmo, int defesaBase_iArmo, String atributos_iArmo, String descricao_iArmo, int quantidade_iArmo) {
        this.fk_personagem = fk_personagem;
        this.nome_iArmo = nome_iArmo;
        this.icone_iArmo = icone_iArmo;
        this.defesaBase_iArmo = defesaBase_iArmo;
        this.atributos_iArmo = atributos_iArmo;
        this.descricao_iArmo = descricao_iArmo;
        this.quantidade_iArmo = quantidade_iArmo;
    }

    public int getQuantidade_iArmo() {
        return quantidade_iArmo;
    }

    public void setQuantidade_iArmo(int quantidade_iArmo) {
        this.quantidade_iArmo = quantidade_iArmo;
    }

    public ItemArmadura() {
    }

    @Override
    public String toString() {
        return "ItemArmadura{" + "pk_itemArmor=" + pk_itemArmor + ", fk_personagem=" + fk_personagem + ", nome_iArmo=" + nome_iArmo + ", icone_iArmo=" + icone_iArmo + ", defesaBase_iArmo=" + defesaBase_iArmo + ", atributos_iArmo=" + atributos_iArmo + ", descricao_iArmo=" + descricao_iArmo + '}';
    }

    public int getPk_itemArmor() {
        return pk_itemArmor;
    }

    public void setPk_itemArmor(int pk_itemArmor) {
        this.pk_itemArmor = pk_itemArmor;
    }

    public int getFk_personagem() {
        return fk_personagem;
    }

    public void setFk_personagem(int fk_personagem) {
        this.fk_personagem = fk_personagem;
    }

    public String getNome_iArmo() {
        return nome_iArmo;
    }

    public void setNome_iArmo(String nome_iArmo) {
        this.nome_iArmo = nome_iArmo;
    }

    public String getIcone_iArmo() {
        return icone_iArmo;
    }

    public void setIcone_iArmo(String icone_iArmo) {
        this.icone_iArmo = icone_iArmo;
    }

    public int getDefesaBase_iArmo() {
        return defesaBase_iArmo;
    }

    public void setDefesaBase_iArmo(int defesaBase_iArmo) {
        this.defesaBase_iArmo = defesaBase_iArmo;
    }

    public String getAtributos_iArmo() {
        return atributos_iArmo;
    }

    public void setAtributos_iArmo(String atributos_iArmo) {
        this.atributos_iArmo = atributos_iArmo;
    }

    public String getDescricao_iArmo() {
        return descricao_iArmo;
    }

    public void setDescricao_iArmo(String descricao_iArmo) {
        this.descricao_iArmo = descricao_iArmo;
    }

}
