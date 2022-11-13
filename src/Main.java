public class Main { public static void main(String[] args) {

//  1 задание

    int yearNow = 2020;
    int total = sum(yearNow);

//  2 задание

    int clientDeviceYear = 2019;
    int clientOS = 0;

    checkClient(clientOS, clientDeviceYear);

//  3 задание

    int distance = 200;
    int never = fur(distance);

//  4 задание

    char[] word = {'w','3','s','c','h','o','o','l','s'};
    int lolec = fear(word);

}


    public static int sum(int numbers) {
        int sum = numbers;


        if (sum % 4 == 0 || sum % 400 == 0 && sum % 100 != 0) {
            System.out.println(sum +" - високосный год");
        } else {
            System.out.println(sum + " - не високосный год");
        }

        return sum;
    }

    public static void checkClient (int os,int year) {
        if (year < 2016) {
            if (os>0) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Ios по ссылке");
            }
        } else {
            if (os > 0) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Ios по ссылке");

            }
        }



    }

    public static int fur(int deliveryDistance) {
        int fur = deliveryDistance;
        if (deliveryDistance >= 60) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance >= 20) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 0) {
            System.out.println("Потребуется дней: 1");
        }

        return fur;
    }

    public static int fear(char[] argu) {
        char[] fear = argu;
        String str = "w3schools";
        int cnt = 0;
        char[] inp = str.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (inp[i] == inp[j]) {
                    System.out.println(inp[j]);
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}
