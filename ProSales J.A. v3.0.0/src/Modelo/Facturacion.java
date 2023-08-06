package Modelo;

public interface Facturacion {
    //Constante del iva en Ecuador 2023
    double iva = 0.12;
    //Ubicacion donde se guardaran las facturas
    String ubicacion = "C:\\Users\\johng\\OneDrive\\Escritorio\\ProSalesJ.A\\Factura_";
    //Metodos que obligatoriamente seran declarados en donde se implementen
    public void crearFactura();
    public void factura();
    public void guardarFactura();
    public void pago();
}
