import java.util.Scanner;

public class EjercicioDos { 
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    //Se crean 4 objetos del tipo persona
    //Persona 1 datos e impresion
    EjercicioUno personaUno = new EjercicioUno();
    System.out.println("Cargue los datos de la Persona 1: Nombre, Apellido, Edad, Sexo, Cedula, Profesion");
    personaUno.setNombre(scanner.next());
    personaUno.setApellido(scanner.next());
    personaUno.setEdad(scanner.nextInt());
    personaUno.SetSexo(scanner.next().charAt(0));
    personaUno.setCedula(Integer.parseInt(scanner.next()));
    personaUno.SetProfesion(scanner.next());
    System.out.println("Nombre: "+personaUno.getNombre());
    System.out.println("Apellido: "+personaUno.getApellido());
    System.out.println("Edad: "+personaUno.getEdad());
    System.out.println("Sexo: "+personaUno.getSexo());
    System.out.println("Cedula: "+personaUno.getCedula());
    System.out.println("Profesion: "+personaUno.getProfesion());
    //Persona 2 datos e impresion
    EjercicioUno personaDos = new EjercicioUno();
    System.out.println("Cargue los datos de la Persona 2: Nombre, Apellido, Sexo");
    personaDos.setNombre(scanner.next());
    personaDos.setApellido(scanner.next());
    personaDos.SetSexo(scanner.next().charAt(0));
    System.out.println("Nombre: "+personaDos.getNombre());
    System.out.println("Apellido: "+personaDos.getApellido());
    System.out.println("Sexo: "+personaDos.getSexo());
    //Persona 3 datos e impresion
    EjercicioUno personaTres = new EjercicioUno();
    System.out.println("Cargue los datos de la Persona 3: Nombre, Apellido, Cedula");
    personaTres.setNombre(scanner.next());
    personaTres.setApellido(scanner.next());
    personaTres.setCedula(Integer.parseInt(scanner.next()));
    System.out.println("Nombre: "+personaTres.getNombre());
    System.out.println("Apellido: "+personaTres.getApellido());
    System.out.println("Cedula: "+personaTres.getCedula());
    //Persona 3 datos e impresion
    EjercicioUno personaCuatro = new EjercicioUno();
    System.out.println("Cargue los datos de la Persona 4: Edad, Sexo, Profesion");
    personaCuatro.setEdad(scanner.nextInt());
    personaCuatro.SetSexo(scanner.next().charAt(0));
    personaCuatro.SetProfesion(scanner.next());
    System.out.println("Edad: "+personaCuatro.getEdad());
    System.out.println("Sexo: "+personaCuatro.getSexo());
    System.out.println("Profesion: "+personaCuatro.getProfesion());

        scanner.close();
    } 
}