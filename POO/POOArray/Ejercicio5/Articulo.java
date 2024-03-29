package Ejercicio5;

public class Articulo {
//Declara los atributos privados 
    private String codigo;
    private String descripcion;
    private double precioDeCompra;
    private double precioDeVenta;
    private int stock;
    
    public Articulo() {
      this.codigo = "LIBRE";
    }
  
    public Articulo(
      String codigo, String descripcion, double precioDeCompra,
      double precioDeVenta, int stock) {
        
      this.codigo = codigo;
      this.descripcion = descripcion;
      this.precioDeCompra = precioDeCompra;
      this.precioDeVenta = precioDeVenta;
      this.stock = stock;
    }
  
    public String getCodigo() {
      return codigo;
    }
  
    public void setCodigo(String codigo) {
      this.codigo = codigo;
    }
  
    public String getDescripcion() {
      return descripcion;
    }
  
    public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
    }
  
    public double getPrecioTotal() {
      return precioDeCompra;
    }
  
    public void setPrecioTotal(double precioDeCompra) {
      this.precioDeCompra = precioDeCompra;
    }
  
    public double getPrecioDeVenta() {
      return precioDeVenta;
    }
  
    public void setPrecioDeVenta(double precioDeVenta) {
      this.precioDeVenta = precioDeVenta;
    }
  
    public int getalmacen() {
      return stock;
    }
  
    public void setalmacen(int stock) {
      this.stock = stock;
    }
  
    public String toString() {
      String cadena = "\nCódigo: " + this.codigo;
      cadena += "\nDescripción: " + this.descripcion;
      cadena += "\nPrecio de compra: " + this.precioDeCompra;
      cadena += "\nPrecio de venta: " + this.precioDeVenta;
      cadena += "\nStock: " + this.stock + " unidades";
      return cadena;
    }
  }
