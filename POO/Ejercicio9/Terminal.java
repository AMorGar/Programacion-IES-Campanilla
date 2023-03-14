package ejercicio9;

class Terminal {

    private String num;
    private int tiempoHablando;
    
    Terminal(String num) {
      this.num = num;
      this.tiempoHablando = 0;
    }
  
    public String getnum() {
      return num;
    }
  
    public void setnum(String num) {
      this.num = num;
    }
  
    public int settiempoHablando() {
      return tiempoHablando;
    }
  
    public void settiempoHablando(int tiempoHablando) {
      this.tiempoHablando = tiempoHablando;
    }
  
    @Override
    public String toString() {
      return "Nº " + num + " - " + this.tiempoHablando + "de tiempo de llamada";
    }
  
    public void llama(Terminal t, int tiempoLlamada) {
      this.tiempoHablando += tiempoLlamada;
      t.tiempoHablando += tiempoLlamada;
    }
  
  }