package exercicios;

public class teste {

    public static int getBattery(int[] eventos) {
            int bateria = 50;

            for (int i = 0; i < eventos.length; i++) {
                int evento = eventos[i];

                if (evento > 0) {
                    bateria = bateria + evento;
                } else {
                    bateria = bateria + (2 * evento);
                }

                if (bateria > 100) {
                    bateria = 100;
                }
                if (bateria < 0) {
                    bateria = 0;
                }
            }

            return bateria;
        }

}
