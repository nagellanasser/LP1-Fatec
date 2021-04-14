package tarefa02;

/**
 *
 * @author Nagella Nasser
 */
public class Automovel {

    //Atributos
 
    private String placa;
    private String marca;
    private String modelo;
    private String cor; 
    private String tipoCombustivel;
    private int ano;
    
    //Métodos de acesso
        
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    //Método construtor
    public Automovel(String placa, String marca, String modelo, String cor, 
                     String tipoCombustivel,int ano) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.ano = ano;


    }
}
