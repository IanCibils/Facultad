import java.util.Scanner;

public class EjercicioDosMain {
    public static void main() throws Exception {
        Scanner scanner = new Scanner(System.in);
        //3 objetos del tipo persona
        //Persona 1
        EjercicioDosEstudiante EstudianteUno = new EjercicioDosEstudiante();
        System.out.println("Datos del primer estudiante: ");
        System.out.println("Nombre: ");
        String nombre = scanner.next();
        EstudianteUno.setNombre(nombre);
        System.out.println("Apellido: ");
        String apellido = scanner.next();
        EstudianteUno.setApellido(apellido);
        System.out.println("Carrera: ");
        String carrera = scanner.next();
        EstudianteUno.setCarrera(carrera);
        System.out.println("Cedula: ");
        int cedula = scanner.nextInt();
        EstudianteUno.setCedula(cedula);

        //Persona 2
        EjercicioDosEstudiante EstudianteDos = new EjercicioDosEstudiante();
        System.out.println("Datos del segundo estudiante: ");
        System.out.println("Cedula: ");
        cedula = scanner.nextInt();
        EstudianteDos.setCedula(cedula);
        System.out.println("Nombre: ");
        nombre = scanner.next();
        EstudianteDos.setNombre(nombre);
        System.out.println("Apellido: ");
        apellido = scanner.next();
        EstudianteDos.setApellido(apellido);

        int anhonacimiento = 0;
        do {
            System.out.println("Año de nacimiento (Solo poner el año): ");
            anhonacimiento = scanner.nextInt();
            EstudianteDos.setAnhonacimiento(anhonacimiento);
        } while (anhonacimiento < 0);

        System.out.println("Sexo: ");
        String sexo = scanner.next();
        EstudianteDos.setSexo(sexo);
        System.out.println("Carrera: ");
        carrera = scanner.next();
        EstudianteDos.setCarrera(carrera);
        System.out.println("Postgrado (True/False): ");
        boolean postgrado = scanner.nextBoolean();
        EstudianteDos.setPostgrado(postgrado);


        //impresion Estudiante 1
        System.out.println("Estudiante 1: ");
        System.out.println("Nombres Y Apellidos:" + EstudianteUno.getNombre() + " " + EstudianteUno.getApellido());
        System.out.println("Carrera: " + EstudianteUno.getCarrera());
        System.out.println("Cedula: " + EstudianteUno.getCedula());

        //impresion Estudiante 2
        System.out.println("Estudiante 2: ");
        System.out.println("Cedula: " + EstudianteDos.getCedula());
        System.out.println("Nombres Y Apellidos:" + EstudianteDos.getNombre() + " " + EstudianteDos.getApellido());
        System.out.println("Edad: " + EstudianteDos.calcularedad());
        System.out.println("Sexo: " + EstudianteDos.getSexo());
        System.out.println("Carrera: " + EstudianteDos.getCarrera());
        System.out.println("Postgrado: "+ EstudianteDos.getPostgrado());



        scanner.close();
    }
}