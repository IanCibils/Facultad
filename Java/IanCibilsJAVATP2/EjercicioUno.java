

public class EjercicioUno { 
    private char sexo;
    private String profesion;
    private int cedula;
    private String nombre;
    private String apellido; 
    private int edad;
    

    //Constructor para la creacion de objetos con diferentes parametros
    public EjercicioUno(String nombre, String apellido, int edad, char sexo, int cedula, String profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.cedula = cedula;
        this.profesion = profesion;
    }

    public EjercicioUno(String nombre, String apellido, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
    }

    public EjercicioUno(String nombre, String apellido, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public EjercicioUno(char sexo, String profesion) {
        this.profesion = profesion;
        this.sexo = sexo;
    }

    //Constructor vacio
    public EjercicioUno(){

    }

    //METODOS GET

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getCedula(){
        return cedula;
    }

    public int getEdad(){
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public String getProfesion(){
        return profesion;
    }

    //Metodos SET

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setCedula(int cedula){
        this.cedula = cedula;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void SetSexo(char sexo) {
        this.sexo = sexo;
    }
    public void SetProfesion(String profesion) {
        this.profesion = profesion;
    }

}