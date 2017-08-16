package ConexaoBanco;

import Objetos.*;
import Telas.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class DAO {

    public static String nomeFichaTexto = "";
    public static String nomePersonagem = "";
    public static Jogador player = null;
    public static Sala salaAtual = null;
    public static String nickName = "";
    public static ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    public static ArrayList<Sala> salas = new ArrayList<Sala>();
    public static ArrayList<Jogador> jogadoresAtuais = new ArrayList<Jogador>();
    public static Connection c = ConexaoMySql.getConnection();

    public String SaltedPassword(String unecryptedPassword) {
        String salt = "(NioU&y%%OguyF=d%6S)(L.~mnHXR6#@3jn0*FX7HD(iSHuvTdkfsC5$¨865709giVFTcf76)VB9";

        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update((unecryptedPassword + salt).getBytes());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        String encryptedPassword = (new BigInteger(messageDigest.digest())).toString(16);
        return encryptedPassword;
    }

    public void listarArmas() {
        final String sql = ("SELECT * FROM itemWeapon WHERE fk_personagem = (?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pegarPk_personagem(nomePersonagem));
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TelaEquipamentos.tabela.getModel();
            while (rs.next()) {
                String nomeIcon = rs.getString("icone_itWea");
                ImageIcon icon = (new ImageIcon(getClass().getResource("/WeaponIcons/" + nomeIcon)));
                String nome = rs.getString("nome_itWea");
                int dano = rs.getInt("danoBase_itWea");
                String atibutos = rs.getString("atributos_itWea");
                String descricao = rs.getString("descricao_itWea");
                Object[] arma = {icon, nome, dano, atibutos, descricao};
                model.addRow(arma);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mensagemSairDaSala() {
        final String sql = ("update sala SET chat_sala=concat(chat_sala,(?)) where nome_sala = (?)");
        String mensagem = "[" + pegarTempoServer() + "] [" + DAO.nickName + " Saiu da Sala]\n";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, mensagem);
            stmt.setString(2, TelaConfigurarSala.nomeSala);
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mensagemEntrarNaSala() {
        final String sql = ("update sala SET chat_sala=concat(chat_sala,(?)) where nome_sala = (?)");
        String mensagem = "[" + pegarTempoServer() + "] [" + DAO.nickName + " Entrou na Sala]\n";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, mensagem);
            stmt.setString(2, TelaConfigurarSala.nomeSala);
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean fichaExiste(String nomeFichaE) {
        String sql = "SELECT nome_ficT FROM fichaTexto WHERE nome_ficT = ?";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeFichaE);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean personagemExiste(String nomePersonagem) {
        String sql = "SELECT nomePersonagem_fic FROM personagem WHERE nomePersonagem_fic = ?";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomePersonagem);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void criarFichaTexto(FichaTexto ft) {
        final String sql = ("INSERT INTO fichaTexto(fk_sala, nome_ficT, texto_fict) VALUES(?,?,?);");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, ft.getFk_sala());
            stmt.setString(2, ft.getNome_fict());
            stmt.setString(3, ft.getTexto_fict());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void criarPersonagem(FichaPersonagem p) {
        final String sql = ("insert into personagem(fk_sala,outrosAtributos_fic,lore_fic,raca_fic,classe_fic,nomePersonagem_fic,nomeJogador_fic,divindade_fic,nivel_fic,idade_fic,pontosVida_fic,pontosMana_fic,pontosForca_fic,pontosConstituicao_fic,pontosDestreza_fic,pontosInteligencia_fic,pontosSabedoria_fic,pontosCarisma_fic,pontosDefesa_fic) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, p.getFk_sala());
            stmt.setString(2, p.getOutrosAtributos_fic());
            stmt.setString(3, p.getLore_fic());
            stmt.setString(4, p.getRaca_fic());
            stmt.setString(5, p.getClasse_fic());
            stmt.setString(6, p.getNomePersonagem_fic());
            stmt.setString(7, p.getNomeJogador_fic());
            stmt.setString(8, p.getDivindade_fic());
            stmt.setInt(9, p.getNivel_fic());
            stmt.setInt(10, p.getIdade_fic());
            stmt.setInt(11, p.getPontosVida_fic());
            stmt.setInt(12, p.getPontosMana_fic());
            stmt.setInt(13, p.getPontosForca_fic());
            stmt.setInt(14, p.getPontosConstituicao_fic());
            stmt.setInt(15, p.getPontosDestreza_fic());
            stmt.setInt(16, p.getPontosInteligencia_fic());
            stmt.setInt(17, p.getPontosSabedoria_fic());
            stmt.setInt(18, p.getPontosCarisma_fic());
            stmt.setInt(19, p.getPontosDefesa_fic());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void salvarEdicaoFichaTexto(FichaTexto ft) {
        final String sql = ("UPDATE fichaTexto SET nome_ficT = ? texto_ficT = ? WHERE nome_ficT = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, ft.getNome_fict());
            stmt.setString(2, ft.getTexto_fict());
            stmt.setString(3, DAO.nomeFichaTexto);
            stmt.execute();
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void salvarEdicaoPersonagem(FichaPersonagem p) {
        final String sql = ("UPDATE personagem SET outrosAtributos_fic=?,lore_fic=?,raca_fic=?,classe_fic=?,nomePersonagem_fic=?,nomeJogador_fic=?,divindade_fic=?,nivel_fic=?,idade_fic=?,pontosVida_fic=?,pontosMana_fic=?,pontosForca_fic=?,pontosConstituicao_fic=?,pontosDestreza_fic=?,pontosInteligencia_fic=?,pontosSabedoria_fic=?,pontosCarisma_fic=?,pontosDefesa_fic=? WHERE nomePersonagem_fic = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, p.getOutrosAtributos_fic());
            stmt.setString(2, p.getLore_fic());
            stmt.setString(3, p.getRaca_fic());
            stmt.setString(4, p.getClasse_fic());
            stmt.setString(5, p.getNomePersonagem_fic());
            stmt.setString(6, p.getNomeJogador_fic());
            stmt.setString(7, p.getDivindade_fic());
            stmt.setInt(8, p.getNivel_fic());
            stmt.setInt(9, p.getIdade_fic());
            stmt.setInt(10, p.getPontosVida_fic());
            stmt.setInt(11, p.getPontosMana_fic());
            stmt.setInt(12, p.getPontosForca_fic());
            stmt.setInt(13, p.getPontosConstituicao_fic());
            stmt.setInt(14, p.getPontosDestreza_fic());
            stmt.setInt(15, p.getPontosInteligencia_fic());
            stmt.setInt(16, p.getPontosSabedoria_fic());
            stmt.setInt(17, p.getPontosCarisma_fic());
            stmt.setInt(18, p.getPontosDefesa_fic());
            stmt.setString(19, DAO.nomePersonagem);
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pegarDadosFichaTexto(String nomeFichaTexto) {
        DAO.nomeFichaTexto = nomeFichaTexto;
        final String sql = ("SELECT * FROM fichaTexto WHERE nome_fict = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeFichaTexto);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                TelaFichaDeTexto telaFichaTexto = new TelaFichaDeTexto(null, true);
                telaFichaTexto.telaTextoFicha.setText(rs.getString("texto_ficT"));
                telaFichaTexto.nomeFichaTexto.setText(rs.getString("nome_ficT"));
                if (verificarDono()) {
                    telaFichaTexto.botaoExcluirFichaTexto.setEnabled(true);
                    telaFichaTexto.botaoSalvar.setEnabled(true);
                    telaFichaTexto.setVisible(true);
                } else {
                    telaFichaTexto.nomeFichaTexto.setEditable(false);
                    telaFichaTexto.telaTextoFicha.setEditable(false);
                    telaFichaTexto.setVisible(true);
                }
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void pegarDadosPersonagem(String nomePersonagem) {
        DAO.nomePersonagem = nomePersonagem;
        final String sql = ("SELECT * FROM personagem WHERE nomePersonagem_fic = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomePersonagem);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                TelaPersonagem telaPersonagem = new TelaPersonagem(null, true);
                telaPersonagem.campoOutrosAtributos.setText(rs.getString("outrosAtributos_fic"));
                telaPersonagem.campoLore.setText(rs.getString("lore_fic"));
                telaPersonagem.campoRaca.setText(rs.getString("raca_fic"));
                telaPersonagem.campoClasse.setText(rs.getString("classe_fic"));
                telaPersonagem.campoNomePersonagem.setText(rs.getString("nomePersonagem_fic"));
                telaPersonagem.campoNomeJogador.setText(rs.getString("nomeJogador_fic"));
                telaPersonagem.campoDivindade.setText(rs.getString("divindade_fic"));
                telaPersonagem.campoNivel.setText(rs.getInt("nivel_fic") + "");
                telaPersonagem.campoIdade.setText(rs.getInt("idade_fic") + "");
                telaPersonagem.campoVida.setText(rs.getInt("pontosVida_fic") + "");
                telaPersonagem.campoMana.setText(rs.getInt("pontosMana_fic") + "");
                telaPersonagem.campoForca.setText(rs.getInt("pontosForca_fic") + "");
                telaPersonagem.campoConstituicao.setText(rs.getInt("pontosConstituicao_fic") + "");
                telaPersonagem.campoDestreza.setText(rs.getInt("pontosDestreza_fic") + "");
                telaPersonagem.campoInteligencia.setText(rs.getInt("pontosInteligencia_fic") + "");
                telaPersonagem.campoSabedoria.setText(rs.getInt("pontosSabedoria_fic") + "");
                telaPersonagem.campoCarisma.setText(rs.getInt("pontosCarisma_fic") + "");
                telaPersonagem.campoDefesa.setText(rs.getInt("pontosDefesa_fic") + "");
                if (verificarDono()) {
                    telaPersonagem.botaoExcluirPersonagem.setEnabled(true);
                    telaPersonagem.botaoEquipamentos.setEnabled(true);
                    telaPersonagem.botaoMagias.setEnabled(true);
                    telaPersonagem.botaoSalvarPersonagem.setVisible(false);
                    telaPersonagem.salvarEdicao.setEnabled(true);
                    telaPersonagem.setVisible(true);

                } else {
                    telaPersonagem.botaoEquipamentos.setEnabled(true);
                    telaPersonagem.botaoMagias.setEnabled(true);
                    telaPersonagem.campoCarisma.setEditable(false);
                    telaPersonagem.campoClasse.setEditable(false);
                    telaPersonagem.campoConstituicao.setEditable(false);
                    telaPersonagem.campoDefesa.setEditable(false);
                    telaPersonagem.campoDestreza.setEditable(false);
                    telaPersonagem.campoDivindade.setEditable(false);
                    telaPersonagem.campoForca.setEditable(false);
                    telaPersonagem.campoIdade.setEditable(false);
                    telaPersonagem.campoInteligencia.setEditable(false);
                    telaPersonagem.campoLore.setEditable(false);
                    telaPersonagem.campoMana.setEditable(false);
                    telaPersonagem.campoNivel.setEditable(false);
                    telaPersonagem.campoNomeJogador.setEditable(false);
                    telaPersonagem.campoNomePersonagem.setEditable(false);
                    telaPersonagem.campoOutrosAtributos.setEditable(false);
                    telaPersonagem.campoRaca.setEditable(false);
                    telaPersonagem.campoSabedoria.setEditable(false);
                    telaPersonagem.campoVida.setEditable(false);
                    telaPersonagem.setVisible(true);
                }

            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirFichaTexto() {
        final String sql = ("DELETE FROM fichaTexto WHERE nome_ficT = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, DAO.nomeFichaTexto);
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirPersonagem() {
        final String sql = ("DELETE FROM personagem WHERE nomePersonagem_fic = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, DAO.nomePersonagem);
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarFichasTexto() {
        final String sql = ("SELECT * FROM fichaTexto fic join sala sala on fic.fk_sala = sala.pk_sala WHERE sala.nome_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaJogo.caixaFichasTexto.addItem(rs.getString("nome_ficT"));
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int pegarPk_personagem(String nome) {
        final String sql = ("SELECT * FROM personagem WHERE nomePersonagem_fic = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("pk_personagem");
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void criarItemArma(ItemArma ia) {
        final String sql = ("INSERT INTO itemWeapon(fk_personagem,nome_itWea,icone_itWea,danoBase_itWea, atributos_itWea,descricao_itWea) VALUES (?,?,?,?,?,?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, ia.getFk_personagem());
            stmt.setString(2, ia.getNome_itWea());
            stmt.setString(3, ia.getIcone_itWea());
            stmt.setInt(4, ia.getDanoBase_itWea());
            stmt.setString(5, ia.getAtributos_itWea());
            stmt.setString(6, ia.getDescricao_itWea());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void criarItemArmadura(ItemArmadura ia) {
        final String sql = ("INSERT INTO itemArmor(fk_personagem,nome_iArmo,icone_iArmo,defesaBase_iArmo,atributos_iArmo,descricao_iArmo) VALUES(?,?,?,?,?,?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, ia.getFk_personagem());
            stmt.setString(2, ia.getNome_iArmo());
            stmt.setString(3, ia.getIcone_iArmo());
            stmt.setInt(4, ia.getDefesaBase_iArmo());
            stmt.setString(5, ia.getAtributos_iArmo());
            stmt.setString(6, ia.getDescricao_iArmo());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void criarMagia(Magia ma) {
        final String sql = ("INSERT INTO magia(fk_personagem,nome_mag,icone_mag,efeito_mag,tipo_mag,descricao_mag,atributos_mag) VALUES (?,?,?,?,?,?,?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, ma.getFk_personagem());
            stmt.setString(2, ma.getNome_mag());
            stmt.setString(3, ma.getIcone_mag());
            stmt.setString(4, ma.getEfeito_mag());
            stmt.setString(5, ma.getTipo_mag());
            stmt.setString(6, ma.getDescricao_mag());
            stmt.setString(7, ma.getAtributos_mag());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void criarItem(Item it) {
        final String sql = ("INSERT INTO item(fk_personagem,nome_ite,icone_ite,atributos_ite,descricao_ite)VALUES (?,?,?,?,?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, it.getFk_personagem());
            stmt.setString(2, it.getNome_ite());
            stmt.setString(3, it.getIcone_ite());
            stmt.setString(4, it.getAtributos_ite());
            stmt.setString(5, it.getDescricao_ite());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarPersonagensMagias() {
        final String sql = ("select * from personagem per join sala sala on per.fk_sala = sala.pk_sala where sala.nome_sala = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaCriarMagia.caixaPersonagem.addItem(rs.getString("nomePersonagem_fic"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarPersonagensItens() {
        final String sql = ("select * from personagem per join sala sala on per.fk_sala = sala.pk_sala where sala.nome_sala = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaCriarItem.caixaPersonagem.addItem(rs.getString("nomePersonagem_fic"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarPersonagensArmaduras() {
        final String sql = ("select * from personagem per join sala sala on per.fk_sala = sala.pk_sala where sala.nome_sala = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaCriarArmadura.caixaPersonagem.addItem(rs.getString("nomePersonagem_fic"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarPersonagensArmas() {
        final String sql = ("select * from personagem per join sala sala on per.fk_sala = sala.pk_sala where sala.nome_sala = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaCriarArma.caixaPersonagem.addItem(rs.getString("nomePersonagem_fic"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarPersonagens() {
        final String sql = ("select * from personagem per join sala sala on per.fk_sala = sala.pk_sala where sala.nome_sala = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaJogo.caixaFichaPersonagem.addItem(rs.getString("nomePersonagem_fic"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarSalas() {
        pegarSalasDoBanco();
        pegarJogadoresDoBanco();
        final String sql = ("select * from sala");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaEntrarEmSala.caixaDeSalas.addItem(rs.getString("nome_sala"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void banir(int pk_jogador, String motivo_ban) {
        final String sql = ("INSERT INTO banlist(fk_jogador, fk_sala, dt_ban, motivo_ban) VALUES(?,?,?,?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pk_jogador);
            stmt.setInt(2, salaAtual.getPk_sala());
            stmt.setString(4, motivo_ban);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void banir(int pk_jogador) {
        final String sql = ("INSERT INTO banlist(fk_jogador, fk_sala, dt_ban) VALUES(?,?,?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pk_jogador);
            stmt.setInt(2, salaAtual.getPk_sala());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void criarJogador(Jogador jogador, TelaRegistrar tela) {
        pegarSalasDoBanco();
        pegarJogadoresDoBanco();
        final String sql = "insert into jogador(nome_jog, email_jog, senha_jog, dt_registro, dt_ultimoLogin) values(?,?,sha1(md5(?)),now(),now())";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, jogador.getNome_jog());
            stmt.setString(2, jogador.getEmail_jog());
            stmt.setString(3, SaltedPassword(jogador.getSenha_jog()));
            stmt.execute();
            tela.labelRegistrado.setVisible(true);
            tela.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void limparChat() {
        final String sql = ("UPDATE sala SET chat_sala = '' WHERE pk_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, salaAtual.getPk_sala());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarJogadores(Jogador jogador) {
        pegarJogadoresDoBanco();
        final String sql = ("select * from jogador;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("pk_jogador"));
                System.out.println("Nome: " + rs.getString("nome_jog"));
                System.out.println("Email: " + rs.getString("email_jog"));
                System.out.println("Senha: " + rs.getString("senha_jog"));
                stmt.execute();
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public boolean salaExiste(String nomeSala) {
        pegarSalasDoBanco();
        String sql = "SELECT nome_sala FROM sala WHERE nome_sala = ?";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeSala);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean verificarDono() {
        pegarSalasDoBanco();
        pegarJogadoresDoBanco();
        String sql = ("SELECT * FROM sala WHERE fk_jogador =? AND nome_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, player.getPk_jogador());
            stmt.setString(2, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void alterarIP(String nome_sala) {
        String ip = TelaInicial.ipAddress;
        final String sql = ("UPDATE sala SET ip_dono = ? WHERE nome_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, ip);
            stmt.setString(2, nome_sala);
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int pegarPorta(String nome_sala) {
        final String sql = ("SELECT * FROM sala WHERE nome_sala =(?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nome_sala);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int porta = rs.getInt(9);
                return porta;
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void alterarPorta(int porta_sala, String nome_sala) {
        final String sql = ("UPDATE sala SET porta_sala = ? WHERE nome_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, porta_sala);
            stmt.setString(2, nome_sala);
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String pegarIPDono(String nome_sala) {
        pegarSalasDoBanco();
        final String sql = ("SELECT ip_dono FROM sala WHERE nome_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nome_sala);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean isVOIPAtivado(String nomeSala) {
        pegarSalasDoBanco();
        final String sql = ("SELECT voip_sala FROM sala WHERE nome_sala = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeSala);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int voip_sala = rs.getInt(1);
                if (voip_sala == 1) {
                    stmt.close();
                    rs.close();
                    return true;
                } else {
                    stmt.close();
                    rs.close();
                    return false;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void alterarVOIP(int estado) {
        pegarSalasDoBanco();
        final String sql = ("UPDATE sala SET voip_sala = ? WHERE nome_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, estado);
            stmt.setString(2, salaAtual.getNome_sala());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void criarSala(TelaConfigurarSala tela, String nomeSala, String senhaSala) {
        pegarSalasDoBanco();
        pegarJogadoresDoBanco();
        String sql = "insert into sala(fk_jogador, nome_sala, senha_sala, chat_sala, ip_dono, limpar_chat_daily, voip_sala, porta_sala) values(?,?,?,?,?,?,?,?)";
        for (Sala sala : salas) {
            if (sala.getNome_sala().equalsIgnoreCase(nomeSala)) {
                salaAtual = sala;
            }
        }
        int pk_dono = player.getPk_jogador();
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pk_dono);
            stmt.setString(2, nomeSala);
            stmt.setString(3, senhaSala);
            stmt.setString(4, "");
            stmt.setString(5, TelaInicial.ipAddress);
            stmt.setInt(6, 0);
            stmt.setBoolean(7, false);
            stmt.setInt(8, 0);
            stmt.execute();
            tela.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String pegarTempoServer() {
        final String sql = ("SELECT CURTIME();");

        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String comando(String texto) {
        switch (texto) {
            case "/help": {
                String help = "\n     /ping: retorna o tempo de resposta do servidor \n     /time: retorna o tempo do servidor \n     /owner: retorna o nome do dono da sala \n     /clear: limpa a sua janela de chat \n";
                return "[" + pegarTempoServer() + "] [" + DAO.nickName + "]: " + help + "\n";
            }
            case "/ping": {
                return "[" + pegarTempoServer() + "] [" + DAO.nickName + "]: " + ping() + "\n";
            }
            case "/time": {
                return "[" + pegarTempoServer() + "] [" + DAO.nickName + "]: Server time:" + pegarTempoServer() + "\n \n";
            }
            case "/owner": {
                String aux = dono();
                if (aux.isEmpty()) {
                    break;
                } else {
                    return "[" + pegarTempoServer() + "] [" + DAO.nickName + "]: " + aux + "\n";
                }
            }
            default: {
                return "[" + pegarTempoServer() + "] [" + DAO.nickName + "]: " + texto + "\n";
            }
        }
        return "";
    }

    public String dono() {
        final String sql = ("SELECT * FROM jogador jog JOIN sala sala ON jog.pk_jogador = sala.fk_jogador WHERE nome_sala =?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                return "Owner: " + rs.getString("nome_jog") + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public String ping() {
        final String sql = ("/* ping */ SELECT 1");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return "PING: " + rs.getString(1) + "ms \n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void enviarDadoBanco(int dado, int numeroModificado, int numero, int modificadorMais, int modificadorMenos, int tipo) {
        final String sql = ("update sala SET chat_sala=concat(chat_sala,(?)) where nome_sala = (?)");
        String mensagem = "";
        switch (tipo) {
            case 1: {
                mensagem = ("[" + pegarTempoServer() + "] [" + DAO.nickName + " rolou um dado D" + dado + "] = " + numeroModificado + " {[" + numero + "+" + modificadorMais + "]}\n");
                break;
            }
            case 2: {
                mensagem = ("[" + pegarTempoServer() + "] [" + DAO.nickName + " rolou um dado D" + dado + "] = " + numeroModificado + " {[" + numero + "-" + modificadorMenos + "]}\n");
                break;
            }
            case 3: {
                mensagem = ("[" + pegarTempoServer() + "] [" + DAO.nickName + " rolou um dado D" + dado + "] = " + numero + "\n");
                break;
            }
        }
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, mensagem);
            stmt.setString(2, TelaConfigurarSala.nomeSala);
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enviarChatBanco(String texto) {
        final String sql = ("update sala SET chat_sala=concat(chat_sala,(?)) where nome_sala = (?)");
        String mensagem = comando(texto);
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, mensagem);
            stmt.setString(2, TelaConfigurarSala.nomeSala);
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fecharSala(Telas.TelaJogo telaJogo, String nomeSala) {
        String sql = ("delete from sala where nome_sala = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeSala);
            stmt.execute();
            telaJogo.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void lerChat() {
        final String sql = ("select chat_sala from sala where nome_sala=?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, TelaConfigurarSala.nomeSala);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaJogo.areaDeChat.setText(rs.getString("chat_sala"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean entrarEmSala(String nomeSala, String senhaSala) {
        pegarSalasDoBanco();
        pegarJogadoresDoBanco();
        final String sql = ("select * from sala where nome_sala =? and senha_sala =?;");
        for (Sala sala : salas) {
            if (sala.getNome_sala().equalsIgnoreCase(nomeSala)) {
                salaAtual = sala;
            }
        }
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeSala);
            stmt.setString(2, senhaSala);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                TelaConfigurarSala.nomeSala = nomeSala;
                return true;
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void pegarSalasDoBanco() {
        if (!salas.isEmpty()) {
            salas.clear();
        }
        final String sql = ("select * from sala");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Sala sala = new Sala();
                sala.setPk_sala(rs.getInt("pk_sala"));
                sala.setFk_jogador(rs.getInt("fk_jogador"));
                sala.setNome_sala(rs.getString("nome_sala"));
                sala.setSenha_sala(rs.getString("senha_sala"));
                salas.add(sala);
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pegarJogadoresDoBanco() {
        if (!jogadores.isEmpty()) {
            jogadores.clear();
        }
        final String sql = ("select * from jogador");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Jogador jogador = new Jogador();
                jogador.setPk_jogador(rs.getInt("pk_jogador"));
                jogador.setNome_jog(rs.getString("nome_jog"));
                jogador.setEmail_jog(rs.getString("email_jog"));
                jogador.setSenha_jog(rs.getString("senha_jog"));
                jogador.setDt_registro(rs.getDate("dt_registro"));
                jogador.setDt_ultimoLogin(rs.getDate("dt_ultimoLogin"));
                jogadores.add(jogador);
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pegarJogadoresDaSala() {
        final String sql = ("SELECT * FROM jogador jog JOIN sala sala ON jog.pk_jogador = sala.fk_jogador WHERE sala.pk_sala =?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, salaAtual.getPk_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Jogador jogador = new Jogador();
                jogador.setPk_jogador(rs.getInt("pk_jogador"));
                jogador.setNome_jog(rs.getString("nome_jog"));
                jogador.setEmail_jog(rs.getString("email_jog"));
                jogador.setSenha_jog(rs.getString("senha_jog"));
                jogador.setDt_registro(rs.getDate("dt_registro"));
                jogador.setDt_ultimoLogin(rs.getDate("dt_ultimoLogin"));
                jogadoresAtuais.add(jogador);
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void logar(String email, String senha, TelaLogin tela) {
        pegarJogadoresDoBanco();
        final String sql = ("select * from jogador where email_jog =? and senha_jog = sha1(md5(?));");
        try {
            pegarJogadoresDoBanco();
            Thread pegarVariaveisLocais = new Thread() {
                public void run() {
                    pegarSalasDoBanco();
                }
            };
            pegarVariaveisLocais.start();
            for (Jogador jog : jogadores) {
                if (jog.getEmail_jog().equals(email)) {
                    player = jog;
                    break;
                }
            }
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, SaltedPassword(senha));
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                nickName = rs.getString("nome_jog");
                Telas.TelaInicial.Start();
                tela.setVisible(false);
            } else {
                System.out.println("Falha ao efetuar login: Credenciais incorretas");
                tela.erroLogin.setVisible(true);
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public boolean verificarEmail(String email) {
        pegarJogadoresDoBanco();
        final String sql = ("select * from jogador");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String emailAux = rs.getString("email_jog");
                if (email.equals(emailAux)) {
                    return true;
                }
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean verificarNomeDeUsuario(String nick) {
        pegarJogadoresDoBanco();
        final String sql = "select * from jogador";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String nomeBanco = rs.getString("nome_jog");
                if (nick.equals(nomeBanco)) {
                    stmt.close();
                    return true;
                }
            }
            stmt.close();

        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return false;
    }

    public void modificarUltimoLogin(String login) {
        pegarJogadoresDoBanco();
        final String sql = "UPDATE jogador SET dt_ultimoLogin = now() WHERE email_jog = ?";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.execute();
            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void modificarChatDaily(String nomeSala, int estado) {
        final String sql = "UPDATE sala SET limpar_chat_daily = ? WHERE nome_sala = ?";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, estado);
            stmt.setString(2, nomeSala);
            stmt.execute();
            stmt.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    public boolean verificarChatDaily(String nomeSala) {
        final String sql = "SELECT limpar_chat_daily FROM sala WHERE nome_sala = ?";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeSala);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                if (rs.getInt(1) == 1) {
                    return true;
                } else {
                    return false;
                }
            }
            stmt.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
