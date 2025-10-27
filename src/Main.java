public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double note = 8.2;

        double media = (8.2+6.8+9.0)/3;
        System.out.println(media);
        //Las tres comillas a continuación sirven para escribir un bloque de texto y que no sea limitado unicamente a una línea
        /*Otra función aprendida son los formatos de texto, que a partir de
        String.format("text %s %d %f", texto, valor, valor decimal). Reemplaza los marcadores por las variables declaradas
        y en el caso de block text, se usa de la siguiente forma:
        """text %s %d %f""".formatted(text, valor, valor decimal)
         */
        String sinopsis = """
                Matix es una paradoja
                La mejor película del fin del milenio
                Fué lanzada en: %d
                """.formatted(fechaDeLanzamiento);
        System.out.println(sinopsis);
    }
}