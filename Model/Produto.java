package Model;

public class Produto {
    public String id;
    public String pao;
    public String bebida;
    public String carne;
    public Categoria categoria;

    public Produto(){
        categoria = new Categoria();
    }

    @Override
    public String toString() {
        String impressao1 =
                "\n ID: "+ this.id +
                        "\n PAO: "+ this.pao +
                        "\n BEBIDA: "+ this.bebida +
                        "\n CARNE: "+ this.carne;
        return impressao1;
    }
}
