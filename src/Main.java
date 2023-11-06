public class Main {
        public static void main(String[] args) {
            task1(2024);
            task2(2010, 0);
            task3(100);
        }
        public static void task1(int leapYear) {
            if ((leapYear % 4 == 0 && 100 != 0 || leapYear % 400 == 0) && leapYear > 1584) {
                System.out.println(leapYear + " год является високосным");
            } else {
                System.out.println(leapYear + " год не является високосным");
            }
        }

        public static void task2(int clientDeviceYear, int opSystem) {
            int clientIOS = 0;
            int clientAndroid = 1;
            boolean phone = clientDeviceYear > 2015;
            if (opSystem == clientIOS && phone) {
                System.out.println("Скачайте приложение для ios");
            } else if (opSystem == clientIOS && clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            if (opSystem== clientAndroid&& phone) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (opSystem == clientAndroid && clientDeviceYear < 2015) {
                System.out.println("Операционная система не поддерживается");
            }
        }

        public static void task3(int deliveryDistance){
            if (deliveryDistance < 20) {
                System.out.println("Потребуется один день");;
            } else if (deliveryDistance < 60) {
                System.out.println("Потребуется два дня");
            } else if (deliveryDistance < 100) {
                System.out.println("Потребуется три дня");
            } else {
                System.out.println("Свыше 100 км доставки нет");
            }





















            /* //Задача № 1
        int leapYear = 2015;
        if (isLeapYear(leapYear)) {
            System.out.println(leapYear + " год является високосным");
        } else {
            System.out.println(leapYear + " год не является високосны");
        }

        //Задача № 3
        int deliveryDistance = 27;
        System.out.println("Для, расстояния " + deliveryDistance + ", км, потребуется, "
                + howDeliveryDays((deliveryDistance + " дней");

    }

    public static boolean isLeapYear(int year) {
        System.out.println("Задача №1");
        if ((year % 4 == 0 && 100 != 0 || year % 400 == 0) && year > 1583) {
            return true;
        }
        return false;
    }

    public static void opSystem(int opClient, int clientDeviceYear) {
        System.out.println("Задача №2");
        int ios = 1;
        int android = 0;
        boolean validVersion = clientDeviceYear > 2015;
        if (opClient == ios && validVersion) {
            System.out.println("Скачайте приложение для ios");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            if (opClient == android && validVersion) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Операционная система не поддерживается");
            }
        }
    }


    public static int howDeliveryDays(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance < 60) {
            return 2;
        } else if (distance < 100) {
            return 3;
        } else {
            return -1;
        }*/
    }
}

