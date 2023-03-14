package ejercicio9;

import java.text.DecimalFormat;

public class Movil extends Terminal {

  private String tarifa;
  private double totalTarificado;

  public Movil(String num, String tarifa) {
    super(num);
    this.tarifa = tarifa;
    this.totalTarificado = 0;
  }

  @Override
  public void llama(Terminal t, int tiempoLlamada) {
    super.llama(t, tiempoLlamada);
    double min = (double) tiempoLlamada / 60;

    switch (this.tarifa) {
      case "rata":
        this.totalTarificado += min * 0.06;
        break;
      case "mono":
        this.totalTarificado += min * 0.12;
        break;
      case "bisonte":
        this.totalTarificado += min * 0.30;
        break;
      default:
    }
  }

  @Override
  public String toString() {
    DecimalFormat formatoEuros = new DecimalFormat("0.00");
    return "Numero:" + this.getnum()
            + " - " + this.settiempoHablando()
            + "de tiempo de llamada y de tarifa: "
            + formatoEuros.format(this.totalTarificado) + " euros";
  }

}