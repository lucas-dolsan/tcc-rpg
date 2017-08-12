package Objetos;

public class FichaTexto {

    private int pk_fichaLimpa;
    private int fk_sala;
    private String nome_fict;
    private String texto_fict;

    public FichaTexto(int fk_sala, String nome_fict, String texto_fict) {
        this.fk_sala = fk_sala;
        this.nome_fict = nome_fict;
        this.texto_fict = texto_fict;
    }

    public FichaTexto() {
    }

    @Override
    public String toString() {
        return "FichaTexto{" + "pk_fichaLimpa=" + pk_fichaLimpa + ", fk_sala=" + fk_sala + ", nome_fict=" + nome_fict + ", texto_fict=" + texto_fict + '}';
    }

    public int getPk_fichaLimpa() {
        return pk_fichaLimpa;
    }

    public void setPk_fichaLimpa(int pk_fichaLimpa) {
        this.pk_fichaLimpa = pk_fichaLimpa;
    }

    public int getFk_sala() {
        return fk_sala;
    }

    public void setFk_sala(int fk_sala) {
        this.fk_sala = fk_sala;
    }

    public String getNome_fict() {
        return nome_fict;
    }

    public void setNome_fict(String nome_fict) {
        this.nome_fict = nome_fict;
    }

    public String getTexto_fict() {
        return texto_fict;
    }

    public void setTexto_fict(String texto_fict) {
        this.texto_fict = texto_fict;
    }

}
