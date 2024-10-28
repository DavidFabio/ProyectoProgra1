package dominio;


public class moto extends vehiculo {
    private String pedales;
    private String manillares;
    public moto(String modelo, String motor, String color, String marca, String pedales, String manillares){
        super(modelo,2,motor,color,marca);
        this.pedales = pedales;
        this.manillares = manillares;
    }
    public String getPedales(){
        return pedales;
    }
    public String getManillares(){
        return manillares;
    }
    public void setPedales(String pedales){
        this.pedales = pedales;
    }
    public void setManillares(String manillares){
        this.manillares = manillares;
    }
    @Override
    public void mover(){
        System.out.println("Moviendo moto");
    }
    @Override
    public void detener(){
        System.out.println("Deteniendo moto");
    }
    @Override
    public void obtenerVelocidad(){
        System.out.println("La velocidad de esta moto es de " + (Math.random() * 200) + " km/h" );
    }
}
