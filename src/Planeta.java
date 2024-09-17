public class Planeta {
    String nombre = null;
    int cantidadSatelites = 0;
    double masaKg = 0;
    double volumenKmCubicos = 0;
    int diametroKm = 0;
    int distanciaSol = 0;
    
    //Ojo a esto de los enum
    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO}
    tipoPlaneta tipo;

    Boolean observable = false;

    public Planeta(String nombre, int cantidadSatelites, double masaKg, double volumenKmCubicos, int diametroKm,
            int distanciaSol, tipoPlaneta tipo, Boolean observable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masaKg = masaKg;
        this.volumenKmCubicos = volumenKmCubicos;
        this.diametroKm = diametroKm;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.observable = observable;
    }

    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Cantidad de satelites = " + cantidadSatelites);
        System.out.println("Masa en kilogramos = " + masaKg);
        System.out.println("Volumen en kilómetros cúbicos = " + volumenKmCubicos);
        System.out.println("Diámetro en kilómetros = " + diametroKm);
        System.out.println("Distancia media al Sol en millones de kilómetros = " + distanciaSol);
        System.out.println("Tipo de planeta de acuerdo a su tamaño " + tipo);
        System.out.println("Observable a simple vista = " + observable);
        System.out.println();
    }

    public double calcularDensidadPlaneta (){
        double densidad = masaKg/volumenKmCubicos;
        return densidad;
    }

    public boolean esExterior (){
        final double ua = 149597870; 
        final double uaMinimo = 2.1*ua;
        final double uaMaximo = 3.4*ua;

        if (distanciaSol>=uaMinimo && distanciaSol<=uaMaximo) {
            return true;
        } else {
            return false;
        }
    }

    
}
