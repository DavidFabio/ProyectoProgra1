package dominio;
import interfaz.movilidad;

public abstract class vehiculo implements movilidad{
    private String modelo;
    private int numeroderuedas;
    private String motor;
    private String color;
    public String marca;

    public vehiculo(String modelo, int numeroderuedas, String motor, String color, String marca) {
        this.modelo = modelo;
        this.numeroderuedas=numeroderuedas;
        this.motor=motor;
        this.color=color;
        this.marca=marca;
    }

    public String getModelo() {
        return modelo;
    }
    public int getNumeroderuedas() {
        return numeroderuedas;
    }
    public String getMotor() {
        return motor;
    }
    public String getColor() {
        return color;
    }
    public String getMarca() {
        return marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setNumeroderuedas(int numeroderuedas) {
        this.numeroderuedas = numeroderuedas;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void queVehiculoSoy(){
        System.out.println("Soy un vehículo");
    }
    @Override
    public void mover(){
        System.out.println("Moviendo");
    }
    @Override
    public void detener(){
        System.out.println("Deteniendo");
    }
    @Override
    public void acelerar(int numero){
        System.out.println("Acelerando " + numero + " km/h");
    }
    @Override
    public void obtenerVelocidad(){
        System.out.println("La velocidad de este vehiculo es de " + (Math.random() * 200) + " km/h" );
    }
}
