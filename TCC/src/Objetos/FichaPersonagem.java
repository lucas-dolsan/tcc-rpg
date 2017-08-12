package Objetos;

public class FichaPersonagem {

    private int pk_personagem;
    private int fk_sala;
    private String outrosAtributos_fic;
    private String lore_fic;
    private String raca_fic;
    private String classe_fic;
    private String nomePersonagem_fic;
    private String nomeJogador_fic;
    private String divindade_fic;
    private int nivel_fic;
    private int idade_fic;
    private int pontosVida_fic;
    private int pontosMana_fic;
    private int pontosForca_fic;
    private int pontosConstituicao_fic;
    private int pontosDestreza_fic;
    private int pontosInteligencia_fic;
    private int pontosSabedoria_fic;
    private int pontosCarisma_fic;
    private int pontosDefesa_fic;

    @Override
    public String toString() {
        return "Personagem{" + "pk_personagem=" + pk_personagem + ", fk_sala=" + fk_sala + ", outrosAtributos_fic=" + outrosAtributos_fic + ", lore_fic=" + lore_fic + ", raca_fic=" + raca_fic + ", classe_fic=" + classe_fic + ", nomePersonagem_fic=" + nomePersonagem_fic + ", nomeJogador_fic=" + nomeJogador_fic + ", divindade_fic=" + divindade_fic + ", nivel_fic=" + nivel_fic + ", idade_fic=" + idade_fic + ", pontosVida_fic=" + pontosVida_fic + ", pontosMana_fic=" + pontosMana_fic + ", pontosForca_fic=" + pontosForca_fic + ", pontosConstituicao_fic=" + pontosConstituicao_fic + ", pontosDestreza_fic=" + pontosDestreza_fic + ", pontosInteligencia_fic=" + pontosInteligencia_fic + ", pontosSabedoria_fic=" + pontosSabedoria_fic + ", pontosCarisma_fic=" + pontosCarisma_fic + ", pontosDefesa_fic=" + pontosDefesa_fic + '}';
    }

    public int getPk_personagem() {
        return pk_personagem;
    }

    public void setPk_personagem(int pk_personagem) {
        this.pk_personagem = pk_personagem;
    }

    public int getFk_sala() {
        return fk_sala;
    }

    public void setFk_sala(int fk_sala) {
        this.fk_sala = fk_sala;
    }

    public String getOutrosAtributos_fic() {
        return outrosAtributos_fic;
    }

    public void setOutrosAtributos_fic(String outrosAtributos_fic) {
        this.outrosAtributos_fic = outrosAtributos_fic;
    }

    public String getLore_fic() {
        return lore_fic;
    }

    public void setLore_fic(String lore_fic) {
        this.lore_fic = lore_fic;
    }

    public String getRaca_fic() {
        return raca_fic;
    }

    public void setRaca_fic(String raca_fic) {
        this.raca_fic = raca_fic;
    }

    public String getClasse_fic() {
        return classe_fic;
    }

    public void setClasse_fic(String classe_fic) {
        this.classe_fic = classe_fic;
    }

    public String getNomePersonagem_fic() {
        return nomePersonagem_fic;
    }

    public void setNomePersonagem_fic(String nomePersonagem_fic) {
        this.nomePersonagem_fic = nomePersonagem_fic;
    }

    public String getNomeJogador_fic() {
        return nomeJogador_fic;
    }

    public void setNomeJogador_fic(String nomeJogador_fic) {
        this.nomeJogador_fic = nomeJogador_fic;
    }

    public String getDivindade_fic() {
        return divindade_fic;
    }

    public void setDivindade_fic(String divindade_fic) {
        this.divindade_fic = divindade_fic;
    }

    public int getNivel_fic() {
        return nivel_fic;
    }

    public void setNivel_fic(int nivel_fic) {
        this.nivel_fic = nivel_fic;
    }

    public int getIdade_fic() {
        return idade_fic;
    }

    public void setIdade_fic(int idade_fic) {
        this.idade_fic = idade_fic;
    }

    public int getPontosVida_fic() {
        return pontosVida_fic;
    }

    public void setPontosVida_fic(int pontosVida_fic) {
        this.pontosVida_fic = pontosVida_fic;
    }

    public int getPontosMana_fic() {
        return pontosMana_fic;
    }

    public void setPontosMana_fic(int pontosMana_fic) {
        this.pontosMana_fic = pontosMana_fic;
    }

    public int getPontosForca_fic() {
        return pontosForca_fic;
    }

    public void setPontosForca_fic(int pontosForca_fic) {
        this.pontosForca_fic = pontosForca_fic;
    }

    public int getPontosConstituicao_fic() {
        return pontosConstituicao_fic;
    }

    public void setPontosConstituicao_fic(int pontosConstituicao_fic) {
        this.pontosConstituicao_fic = pontosConstituicao_fic;
    }

    public int getPontosDestreza_fic() {
        return pontosDestreza_fic;
    }

    public void setPontosDestreza_fic(int pontosDestreza_fic) {
        this.pontosDestreza_fic = pontosDestreza_fic;
    }

    public int getPontosInteligencia_fic() {
        return pontosInteligencia_fic;
    }

    public void setPontosInteligencia_fic(int pontosInteligencia_fic) {
        this.pontosInteligencia_fic = pontosInteligencia_fic;
    }

    public int getPontosSabedoria_fic() {
        return pontosSabedoria_fic;
    }

    public void setPontosSabedoria_fic(int pontosSabedoria_fic) {
        this.pontosSabedoria_fic = pontosSabedoria_fic;
    }

    public int getPontosCarisma_fic() {
        return pontosCarisma_fic;
    }

    public void setPontosCarisma_fic(int pontosCarisma_fic) {
        this.pontosCarisma_fic = pontosCarisma_fic;
    }

    public int getPontosDefesa_fic() {
        return pontosDefesa_fic;
    }

    public void setPontosDefesa_fic(int pontosDefesa_fic) {
        this.pontosDefesa_fic = pontosDefesa_fic;
    }

    public FichaPersonagem() {
    }

    public FichaPersonagem(int fk_sala, String outrosAtributos_fic, String lore_fic, String raca_fic, String classe_fic, String nomePersonagem_fic, String nomeJogador_fic, String divindade_fic, int nivel_fic, int idade_fic, int pontosVida_fic, int pontosMana_fic, int pontosForca_fic, int pontosConstituicao_fic, int pontosDestreza_fic, int pontosInteligencia_fic, int pontosSabedoria_fic, int pontosCarisma_fic, int pontosDefesa_fic) {
        this.fk_sala = fk_sala;
        this.outrosAtributos_fic = outrosAtributos_fic;
        this.lore_fic = lore_fic;
        this.raca_fic = raca_fic;
        this.classe_fic = classe_fic;
        this.nomePersonagem_fic = nomePersonagem_fic;
        this.nomeJogador_fic = nomeJogador_fic;
        this.divindade_fic = divindade_fic;
        this.nivel_fic = nivel_fic;
        this.idade_fic = idade_fic;
        this.pontosVida_fic = pontosVida_fic;
        this.pontosMana_fic = pontosMana_fic;
        this.pontosForca_fic = pontosForca_fic;
        this.pontosConstituicao_fic = pontosConstituicao_fic;
        this.pontosDestreza_fic = pontosDestreza_fic;
        this.pontosInteligencia_fic = pontosInteligencia_fic;
        this.pontosSabedoria_fic = pontosSabedoria_fic;
        this.pontosCarisma_fic = pontosCarisma_fic;
        this.pontosDefesa_fic = pontosDefesa_fic;
    }
}
