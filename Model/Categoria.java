package Model;

public class Categoria {
    public String id;
    public String higiene;
    public String alimento;
    public String frios;


    @Override
    public String toString() {
        String impressao2 =
                "\n ID: "+ this.id +
                        "\n HIGIENE: "+ this.higiene +
                        "\n ALIMENTO: "+ this.alimento +
                        "\n FRIOS: "+ this.frios;
        return impressao2;
    }
}
