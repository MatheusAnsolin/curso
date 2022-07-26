package database_app.tabelas;

public class Resposta {
    private String resposta;
    private int id, prova_id;

    public Resposta(String resposta, int id, int prova_id) {
        this.resposta = resposta;
        this.id = id;
        this.prova_id = prova_id;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProva_id() {
        return prova_id;
    }

    public void setProva_id(int prova_id) {
        this.prova_id = prova_id;
    }
}
