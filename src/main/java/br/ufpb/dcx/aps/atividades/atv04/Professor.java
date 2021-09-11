package br.ufpb.dcx.aps.atividades.atv04;

public class Professor {

    private String nome;
    private String siape;

    public Professor(String siape, String nome) {
        this.nome = nome;
        this.siape = siape;
    }

    public Professor(String siape) {
        if (siape == null) {
            throw new IllegalArgumentException("siape invalido:" + siape);
        }
        if (siape == "") {
            throw new IllegalArgumentException("siape invalido:");
        }
        this.siape = siape;
        this.nome = "";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSiape() {
        return this.siape;
    }

    @Override
    public boolean equals(Object professor) {
        if (this.siape == ((Professor) professor).getSiape()) {
            return true;
        }

        return false;
    }

}
