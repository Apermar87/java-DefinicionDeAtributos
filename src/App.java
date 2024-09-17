public class App {
    public static void main(String[] args) throws Exception {
        Planeta laTierra = new Planeta("Tierra", 1,5.9736E24, 1.08321E12,12742, 150000000, Planeta.tipoPlaneta.TERRESTRE, true);
        Planeta jupiter = new Planeta("Júpiter", 79, 1.899E27, 1.4313E15, 139820, 750000000, Planeta.tipoPlaneta.GASEOSO, true);

        laTierra.imprimir();
        jupiter.imprimir();

        System.out.println("Densidad del planeta Tierra = " + laTierra.calcularDensidadPlaneta());
        System.out.println();
        System.out.println("Densidad del planeta Jupiter = " + jupiter.calcularDensidadPlaneta());

        System.out.println("Es planeta exterior = " + laTierra.esExterior());
        System.out.println();
        System.out.println("Es planeta exterior = " + jupiter.esExterior());

    }
}
