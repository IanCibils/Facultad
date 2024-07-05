

public class EjercicioUnoMain { 
    public static void main(String[] args) throws Exception {
    //Se crean 4 objetos del tipo persona
    //Persona 1 datos e impresion
    EjercicioUno personaUno = new EjercicioUno("Ian", "Cibils", 19, 'M', 7900431, "Ing. Informatica");
    System.out.println("Datos del Persona 1");
    System.out.println("Nombre: "+personaUno.getNombre());
    System.out.println("Apellido: "+personaUno.getApellido());
    System.out.println("Edad: "+personaUno.getEdad());
    System.out.println("Sexo: "+personaUno.getSexo());
    System.out.println("Cedula: "+personaUno.getCedula());
    System.out.println("Profesion: "+personaUno.getProfesion());
    //Persona 2 datos e impresion
    EjercicioUno personaDos = new EjercicioUno("Gabriela", "Camallo", 'F');
    System.out.println("Datos del Persona 2");
    System.out.println("Nombre: "+personaDos.getNombre());
    System.out.println("Apellido: "+personaDos.getApellido());
    System.out.println("Sexo: "+personaDos.getSexo());
    //Persona 3 datos e impresion
    EjercicioUno personaTres = new EjercicioUno("Pedro", "Pagani", 9823489);
    System.out.println("Datos del Persona 3");
    System.out.println("Nombre: "+personaTres.getNombre());
    System.out.println("Apellido: "+personaTres.getApellido());
    System.out.println("Cedula: "+personaTres.getCedula());
    //Persona 3 datos e impresion
    EjercicioUno personaCuatro = new EjercicioUno('M', "Albañil");
    System.out.println("Datos del Persona 4");
    System.out.println("Sexo: "+personaCuatro.getSexo());
    System.out.println("Profesion: "+personaCuatro.getProfesion());
    
    EjercicioUno personaCinco = new EjercicioUno();
        System.out.println("Datos del Persona 5");
        personaCinco.setNombre("Karen");
        personaCinco.setApellido("Maleducada");
        personaCinco.setCedula(83294234);
        personaCinco.setEdad(25);

        System.out.println("Nombre: "+personaCinco.getNombre());
        System.out.println("Apellido: "+personaCinco.getApellido());
        System.out.println("Cedula: "+personaCinco.getCedula());
        System.out.println("Edad: "+personaCinco.getEdad());


    } 
}