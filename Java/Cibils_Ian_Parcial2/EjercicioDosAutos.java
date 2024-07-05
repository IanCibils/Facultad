public class EjercicioDosAutos {
    private String marca;
    private String modelo;
    private String matricula;
    private String tipo;
    private int anhofabricacion;
    private int anhoactual;

        //Constructor Vacio
        public EjercicioDosAutos () {

        }
    
        //Constructor con todos los campos
        public EjercicioDosAutos(String tipo, String marca, String modelo, 
                                    int anhofabricacion, String matricula) {;
            this.marca = marca;
            this.modelo = modelo;
            this.matricula = matricula;
            this.tipo = tipo;
            this.anhofabricacion = anhofabricacion;
        }
    
    
        //Metodos GET
    
    
        public int getanhofabricacion() {
            return anhofabricacion;
        }
    

        public String getmarca(){
            return marca;
        }
    
        public String getmodelo(){
            return modelo;
        }
    
    
        public String gettipo() {
            return tipo;
        }
    
        public String getmatricula(){
            return matricula;
        }

        public int getanhoactual() {
            return anhoactual;
        }


    
        //Metodos SET
        public void setmarca (String marca) {
            this.marca = marca;
        }
    
        public void setmodelo (String modelo) {
            this.modelo = modelo;
        }
    
        public void setmatricula (String matricula) {
            this.matricula = matricula;
        }
    
        public void settipo (String tipo) {
            this.tipo = tipo;
        }

        public void setanhoactual (int anhoactual) {
            this.anhoactual = anhoactual;
        }

    
    
        public void setanhofabricacion (int anhofabricacion) {
            this.anhofabricacion = anhofabricacion;
        }


    
    
        public int calcularantiguedad (){
            return this.getanhoactual() - this.getanhofabricacion();
        }

    
    
    }
