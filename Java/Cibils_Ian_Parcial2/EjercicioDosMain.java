import java.util.Scanner;

public class EjercicioDosMain {
    public static void main() throws Exception {
        Scanner scanner = new Scanner(System.in);
        //5 objetos del tipo auto
        //Auto 1
        EjercicioDosAutos AutoUno = new EjercicioDosAutos();
        System.out.println("Datos del primer Vehiculo: ");
        System.out.println("Marca: ");
        String marca = scanner.next();
        AutoUno.setmarca(marca);
        System.out.println("Modelo: ");
        String modelo = scanner.next();
        AutoUno.setmodelo(modelo);
        System.out.println("Tipo: ");
        String tipo = scanner.next();
        AutoUno.settipo(tipo);


        //Auto 2
        EjercicioDosAutos AutoDos = new EjercicioDosAutos();
        System.out.println("Datos del segundo Auto: ");
        System.out.println("Marca: ");
        marca = scanner.next();
        AutoDos.setmarca(marca);
        System.out.println("Modelo: ");
        modelo = scanner.next();
        AutoDos.setmodelo(modelo);
        System.out.println("Matricula:");
        String matricula = scanner.next();
        AutoDos.setmatricula(matricula);
        System.out.println("Tipo: ");
        tipo = scanner.next();
        AutoDos.settipo(tipo);
        System.out.println("Año Actual: ");
        int anhoactual = scanner.nextInt();
        AutoDos.setanhoactual(anhoactual);
        int anhofabricacion = 0;
        do {
            System.out.println("Año de fabricacion (Solo poner el año): ");
            anhofabricacion = scanner.nextInt();
            AutoDos.setanhofabricacion(anhofabricacion);
        } while (anhofabricacion < 0);


        //Auto 3
        EjercicioDosAutos AutoTres = new EjercicioDosAutos();
        System.out.println("Datos del tercer Vehiculo: ");
        System.out.println("Marca: ");
        marca = scanner.next();
        AutoTres.setmarca(marca);
        System.out.println("Modelo: ");
        modelo = scanner.next();
        AutoTres.setmodelo(modelo);
        System.out.println("Año Actual: ");
        anhoactual = scanner.nextInt();
        AutoTres.setanhoactual(anhoactual);
        do {
            System.out.println("Año de fabricacion (Solo poner el año): ");
            anhofabricacion = scanner.nextInt();
            AutoTres.setanhofabricacion(anhofabricacion);
        } while (anhofabricacion < 0);


        //Auto 4
        EjercicioDosAutos AutoCuatro = new EjercicioDosAutos();
        System.out.println("Datos del Cuarto Vehiculo: ");
        System.out.println("Matricula: ");
        matricula = scanner.next();
        AutoCuatro.setmatricula(matricula);
        System.out.println("Tipo: ");
        tipo = scanner.next();
        AutoCuatro.settipo(tipo);
        System.out.println("Año Actual: ");
        anhoactual = scanner.nextInt();
        AutoCuatro.setanhoactual(anhoactual);
        do {
            System.out.println("Año de fabricacion (Solo poner el año): ");
            anhofabricacion = scanner.nextInt();
            AutoCuatro.setanhofabricacion(anhofabricacion);
        } while (anhofabricacion < 0);


        //Auto 5
        EjercicioDosAutos AutoCinco = new EjercicioDosAutos();
        System.out.println("Datos del Quinto Vehiculo: ");
        System.out.println("Marca: ");
        marca = scanner.next();
        AutoCinco.setmarca(marca);
        System.out.println("Matricula: ");
        matricula = scanner.next();
        AutoCinco.setmatricula(matricula);
        System.out.println("Año Actual: ");
        anhoactual = scanner.nextInt();
        AutoCinco.setanhoactual(anhoactual);
        do {
            System.out.println("Año de fabricacion (Solo poner el año): ");
            anhofabricacion = scanner.nextInt();
            AutoCinco.setanhofabricacion(anhofabricacion);
        } while (anhofabricacion < 0);


        //impresion Auto 1
        System.out.println("Vehiculo 1: ");
        System.out.println("Marca:" + AutoUno.getmarca());
        System.out.println("Modelo: " + AutoUno.getmodelo());
        System.out.println("Tipo: " + AutoUno.gettipo());

        //impresion Auto 2
        System.out.println("Vehiculo 2: ");
        System.out.println("Marca: " + AutoDos.getmarca());
        System.out.println("Modelo:" + AutoDos.getmodelo());
        System.out.println("Matricula: " + AutoDos.getmatricula());
        System.out.println("Tipo: " + AutoDos.gettipo());
        System.out.println("Antigüedad: " + AutoDos.calcularantiguedad());

        //impresion Auto 3
        System.out.println("Vehiculo 3: ");
        System.out.println("Marca: " + AutoTres.getmarca());
        System.out.println("Modelo: " + AutoTres.getmodelo());
        System.out.println("Antigüedad: " + AutoTres.calcularantiguedad());

        //impresion Auto 4
        System.out.println("Vehiculo 4: ");
        System.out.println("Matricula: " + AutoCuatro.getmatricula());
        System.out.println("Tipo: " + AutoCuatro.gettipo());
        System.out.println("Antigüedad: " + AutoCuatro.calcularantiguedad());

        //impresion Auto 5
        System.out.println("Vehiculo 5: ");
        System.out.println("Marca: " + AutoCinco.getmarca());
        System.out.println("Matricula: " + AutoCinco.getmatricula());
        System.out.println("Tipo: " + AutoCinco.gettipo());
        System.out.println("Antigüedad: " + AutoCinco.calcularantiguedad());



// Calculo de autos mayor o menores a 30 años
int mas30 = 0;
int menos30 = 0;

if (AutoDos.calcularantiguedad() > 30) {
    mas30++;
} else {
    menos30++;
}


if (AutoTres.calcularantiguedad() > 30) {
    mas30++;
} else {
    menos30++;
}


if (AutoCuatro.calcularantiguedad() > 30) {
    mas30++;
} else {
    menos30++;
}


if (AutoCinco.calcularantiguedad() > 30) {
    mas30++;
} else {
    menos30++;
}


System.out.println("La cantidad de vehículos que tienen más de 30 años de antigüedad es: " + mas30);


System.out.println("La cantidad de vehículos que tienen menos de 30 años de antigüedad es: " + menos30);



scanner.close();

    }
}