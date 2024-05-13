/**
 * @author matheus.william
  */


public class Carro {
    private String marca;

    private String modelo;

    private int ano;

    private String cor;

    private boolean ligado;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("O carro está ligado");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("O carro está desligado");
    }

}
