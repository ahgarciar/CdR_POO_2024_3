package api_aleatorios;

import java.util.Random;

public class RandomCustom {
    // Parámetros usados por la clase Random de Java
    private static final long a = 25214903917L;  // multiplicador
    private static final long c = 11L;           // incremento
    private static final long m = (1L << 48);    // módulo (2^48) //<< = operador de desplazamiento con preservacion (copia) del bit de signo)

    //La "L", se utiliza porque en java, por defecto las variables son consideradas como int, entonces, con la L,
    //son considerados como long

    private long seed;  // Semilla o estado actual del generador

    public RandomCustom(long seed) {
        this.seed = (seed ^ a) & (m - 1);
    }

    public long next(int bits) { //Generador lineal congruencial (Linear congruential generator)
        seed = (seed * a + c) & (m - 1);
        return (seed >>> (48 - bits));    // Devuelve los bits más significativos, como en Random de Java
        //>>> = operador de desplazamiento sin preservacion (copia) del bit de signo). rellena con ceros
    }

    public int nextInt(int bound) {
        if (bound <= 0) {
            throw new IllegalArgumentException("El límite debe ser positivo.");
        }
        if ((bound & -bound) == bound) {  // Si es una potencia de 2
            return (int)((bound * (long)next(31)) >> 31);
        }

        int bits, val;
        do {
            bits = (int)next(31);
            val = bits % bound;
        } while (bits - val + (bound - 1) < 0);
        return val;
    }

    // Depueracion - Prueba
    public static void main(String[] args) {
        RandomCustom custom = new RandomCustom(5);
        Random rnd = new Random(5);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append(custom.nextInt(100) + " - " + rnd.nextInt(100));
            System.out.println(builder.toString());
            builder.setLength(0);
        }


    }
}
