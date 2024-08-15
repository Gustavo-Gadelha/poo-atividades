package atividade3.model;

public class Perfil {

    public final String fotoDeUsuario;
    public final String username;
    public final String nomeCompleto;
    public final String bio;
    public final String[] redesSociais;
    public static final int QUANTIDADE_LISTA = 4;

    public Perfil(String fotoDeUsuario, String username, String nomeCompleto, String bio) {
        this.username = username;
        this.fotoDeUsuario = fotoDeUsuario;
        this.nomeCompleto = nomeCompleto;
        this.bio = bio;
        this.redesSociais = new String[QUANTIDADE_LISTA];
    }

    public void adicionarRedeSocial(String rede) {
        for (int i = 0; i < QUANTIDADE_LISTA; i++) {
            if (this.redesSociais[i] == null) {
                this.redesSociais[i] = rede;
                break;
            }
        }
    }

    public void removerRedeSocial(int posicao) {
        if (posicao < 0 || posicao > QUANTIDADE_LISTA - 1) {
            System.out.println("Valor inválido");
        } else {
            this.redesSociais[posicao] = null;
        }
    }

}
