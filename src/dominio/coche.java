package dominio;

public class coche extends vehiculo {
    private String ventanilla;
    private String radio;
    /**
     * Metodo Constructor
     */
    public coche(String modelo, String motor, String color, String marca, String ventanilla, String radio) {
        super(modelo,4,motor,color,marca);
        this.ventanilla = ventanilla;
        this.radio = radio;
    }
    /**
     * Getters
     */
    public String getVentanilla(){
        return ventanilla;
    }
    public String getRadio(){
        return radio;
    }
    /**
     * Setters
     */
    public void setVentanilla(String ventanilla) {
        this.ventanilla = ventanilla;
    }
    public void setRadio(String radio) {
        this.radio = radio;
    }
    @Override
    public void queVehiculoSoy() {
        System.out.println("Soy un coche");
        if(marca == "Dodge"){
            System.out.println("Soy un coche dodge");
        }
        if(marca == "Mercedes"){
            System.out.println("Soy un coche mercedes");
        }
    }
    @Override
    public void mover(){
        System.out.println("Moviendo coche");
    }
    @Override
    public void detener(){
        System.out.println("Deteniendo coche");
    }
    @Override
    public void obtenerVelocidad(long velocidad){
        System.out.println("La velocidad de este coche es de " + velocidad + " km/h" );
    }
}