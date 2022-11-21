/*
Alejandro Moreno Garrido
* Cuestionario tipo test
 */
public class Cuestionario {

  public static void main(String[] args) {
    
    int puntos = 0;
    String respuesta;
    
    System.out.println("Cuestionario sobre Pokemon");
    
    System.out.println("1. ¿A que es debil el tipo agua de pokemon?");
    System.out.println("a) Veneno"); 
    System.out.println("b) Planta");
    System.out.println("c) Fuego ");
    
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }

    System.out.println("2. ¿De que tipo es pikachu");
    System.out.println("a) Electrico"); 
    System.out.println("b) Acero");
    System.out.println("c) Purpurina ");

    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }

    System.out.println("3. Que es eficaz contra un poquemon tipo tierra volador?");
    System.out.println("a) Hielo"); 
    System.out.println("b) Acero");
    System.out.println("c) Electrico");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }
    
    System.out.println("4. ¿Que es super efectivo contra Bespiqen?");
    System.out.println("a) Agua"); 
    System.out.println("b) Bicho");
    System.out.println("c) Roca");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }
    
    System.out.println("5. ¿Como se llama el pokemon futbolista?");
    System.out.println("a) Manolo"); 
    System.out.println("b) Cinderace");
    System.out.println("c) Toguepi");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }
    
    System.out.println("6. ¿Como se llama el pokemon Aceituna?");
    System.out.println("a) Manolo"); 
    System.out.println("b) Giratina");
    System.out.println("c) Smoliv");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }
    
    System.out.println("7. ¿Como se llama el profesor de la primera generacion?");
    System.out.println("a) Oak"); 
    System.out.println("b) Juan");
    System.out.println("c) Clavel");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }
    
    System.out.println("8. ¿De que tipo no es Charizard?");
    System.out.println("a) Dragon"); 
    System.out.println("b) Volador");
    System.out.println("c) Fuego");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }
    
    System.out.println("9. ¿Cual de estos es un inicial?");
    System.out.println("a) Miraidon"); 
    System.out.println("b) Infernape");
    System.out.println("c) Kyogre");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }
    
    System.out.println("10. ¿Quien de estos es de tipo fuego?");
    System.out.println("a) Monferno"); 
    System.out.println("b) Torterra");
    System.out.println("c) Toguepi");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }
    
    
    

    System.out.println("\nHa obtenido " + puntos + " puntos.");
  }
}
