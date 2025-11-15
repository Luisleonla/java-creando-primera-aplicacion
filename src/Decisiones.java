public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double note = 8.2;
        String tipoPlan = "plus";


        if (incluidoEnElPlan || tipoPlan.equals("plus")){
            System.out.println("Disfrute de su película");
        }else {
            System.out.println("Película no disponible para su plan que elegiste");
        }
    }
}
