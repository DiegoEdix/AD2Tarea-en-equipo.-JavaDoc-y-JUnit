
/*
 * @Author autor del proyecto 
 * Clase soldado 
 * @Param boolean estaMuerto indica con true o false si esta vivo o muerto
 * @Param int numero de balas, indica el número de balas que va a tener 
 */

public class Soldado {

    private boolean estaMuerto;

    private int numeroBalas;

   



    //Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada
/*
 * Método que indicará si puede disparar dependiendo del número de balas
 * @param número de balas
 * Si retorna que numeroBalas > 0, podrá disparar, por lo que devuelve true 
 * Si retorna numeroBalas < 0, no podrá disparar, por lo que devuelve false
 * 
 */
   

    public boolean puedeDisparar() {

                  if(this.numeroBalas > 0) {

                                return true;

                  }                          

                  return false;

    }
/*
 * Método disparar 
 * @param numeroBalas
 * @param estaMuerto
 * Indicará si puede dispaarar o no. Si el soldado esta muerto devolverá true
 */
   

    public void disparar(Soldado sol) {

                  this.numeroBalas--;

                  sol.estaMuerto = true;

    }



public boolean isEstaMuerto() {
    return estaMuerto;
}



public void setEstaMuerto(boolean estaMuerto) {
    this.estaMuerto = estaMuerto;
}



public int getNumeroBalas() {
    return numeroBalas;
}



public void setNumeroBalas(int numeroBalas) {
    this.numeroBalas = numeroBalas;
}
}
