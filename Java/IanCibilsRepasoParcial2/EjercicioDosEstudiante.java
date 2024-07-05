

public class EjercicioDosEstudiante {

    private String sexo;
    private String nombre;
    private String apellido;
    private int cedula;
    private String carrera;
    private boolean postgrado;
    private int anhonacimiento;
 


    //Constructor Vacio
    public EjercicioDosEstudiante () {

    }

    //Constructor con algunos campos
    public EjercicioDosEstudiante(String nombre, String apellido, String carrera, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.cedula = cedula;
    }

    //Constructor con todos los campos
    public EjercicioDosEstudiante(String sexo, String nombre, String apellido, int cedula, 
                                int anhonacimiento, String carrera, boolean postgrado, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anhonacimiento = anhonacimiento;
        this.sexo = sexo;
        this.carrera = carrera;
        this.postgrado = postgrado;
    }


    //Metodos GET


    public int getAnhonacimiento() {
        return anhonacimiento;
    }

    public boolean getPostgrado() {
        return postgrado;
    }
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getCedula(){
        return cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCarrera(){
        return carrera;
    }

    //Metodos SET
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void setApellido (String apellido) {
        this.apellido = apellido;
    }

    public void setCarrera (String carrera) {
        this.carrera = carrera;
    }

    public void setSexo (String sexo) {
        this.sexo = sexo;
    }

    public void setPostgrado (boolean postgrado) {
        this.postgrado = postgrado;
    }

    public void setAnhonacimiento (int anhonacimiento) {
        this.anhonacimiento = anhonacimiento;
    }

    public void setCedula (int cedula) {
        this.cedula = cedula;
    }

    public int calcularedad (){
        return 2024 - this.getAnhonacimiento();
    }


}