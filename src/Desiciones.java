public class Desiciones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento > 2022) {
            System.out.println("Películas mas Populares");
        } else {
            System.out.println("Películas Retro que aun vale la Pena Ver");
        }
        if (incluidoEnElPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute su Película");
        }else{
            System.out.println("Película no disponible en su plan actual");
        }
}
}
