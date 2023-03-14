package Ejercicio11;

import java.text.DecimalFormat;

public class TarjetaRegalo {
  String num;
  double cartera;

  public TarjetaRegalo(double cartera) {
    this.cartera = cartera;
    this.num = "";
    for (int i = 0; i < 5; i++) {
      this.num += (int)(Math.random() * 10);
    }
  }

  @Override
  public String toString() {
    DecimalFormat dosDecimales = new DecimalFormat("0.00");
    return "Nºtarjeta: " + num + ", Saldo en la Wallet:  " + dosDecimales.format(cartera) + " euros";
  }

  void gasta(double gasto) {
    if (gasto > cartera) {
      System.out.printf("Saldo insuficiente", gasto);
    } else {
      cartera -= gasto;
    }
  }

  TarjetaRegalo fusionaCon(TarjetaRegalo t) {
    double nuevoSaldo = this.getcartera() + t.getcartera();
    this.setcartera(0);
    t.setcartera(0);
    return new TarjetaRegalo(nuevoSaldo);
  }

  public void setcartera(double cartera) {
    this.cartera = cartera;
  }

  public double getcartera() {
    return cartera;
  }  
}