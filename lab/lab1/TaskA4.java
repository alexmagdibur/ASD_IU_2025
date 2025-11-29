public class TaskA4 {
    public static void main(String[] args) {
        int n = 20; // Найти первые 20 простых чисел
        int limit = 100; // Верхняя граница

        boolean[] isPrime = new boolean[limit + 1];
        int[] primes = new int[n];
        int count = 0;

        // Инициализация решета
        for (int i = 2; i <= limit; i++) isPrime[i] = true;

        // Решето Эратосфена
        for (int i = 2; i <= limit && count < n; i++) {
            if (isPrime[i]) {
                primes[count++] = i;
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Вывод результата
        System.out.println("Первые " + n + " простых чисел:");
        for (int i = 0; i < count; i++) {
            System.out.print(primes[i] + " ");
        }
    }
}
