class SumaImpares {
    public static int calcularSumaImpares(int a, int b) {
        int sumaImpares = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sumaImpares += i;
            }
        }
        return sumaImpares;
    }
}