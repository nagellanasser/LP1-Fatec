package caracracha;

/**
 *
 * @author Nagella Nasser
 */
public class Automovel {
    
    //Atributos
    private String marca;
    private String modelo;
    private String cor; // Pode haver customização, mudança. 
    private char tamanho;
    private String tipoCombustivel; // Pode mudar - ex: gasolina para gás.
    private int ano;
    private boolean conversivel;
    
    //Métodos de acesso
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

    //Método construtor
    public Automovel(String marca, String modelo, char tamanho, int ano, 
                     boolean conversivel) {

        this.marca = marca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.ano = ano;
        this.conversivel = conversivel;

    }

    //Métodos da classe 
    public void ligar() {
        System.out.println("Ignição dada!");
    }

    public void acelerar() {
        System.out.println("Vrum! Vrum!! Vrum!!!" );
    }

    public void freiar() {
        System.out.println("Frenagem ativada!" );
    }
    
    public void desligar() {
        System.out.println("Ignição desativada." );
    }

    public static void main(String[] args) {
      
        Automovel auto_1 = new Automovel("GM", "Sedan", 'M', 2018, false);
        System.out.println("Automóvel: " + auto_1.marca);
        auto_1.ligar();
                        
        Automovel auto_2 = new Automovel("Porche","Cabriolet", 'M', 2010,true);
        System.out.println("Automóvel: " + auto_2.marca);
        auto_2.ligar();
        auto_2.acelerar();
       
        Automovel auto_3 = new Automovel("Fiat","Micro",'P', 2020, false);
        System.out.println("Automóvel: " + auto_3.marca);
        auto_3.acelerar();
        auto_3.freiar();
        
        Automovel auto_4 = new Automovel("Ford","Campervan",'G', 1978, false);
        System.out.println("Automóvel: " + auto_4.marca);
        auto_4.ligar();
        auto_4.acelerar();
        auto_4.freiar();
        auto_4.desligar();
        
    }

}
