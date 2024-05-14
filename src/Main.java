public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age = 27;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    ", он не достиг совершеннолетия, нужно немного подождать.");
        }

        //Задание 2
        int temperature = 16;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        //Задание 3
        int speedLimit = 60;
        int speed = 90;
        if (speed >= speedLimit) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

        //Задание 4
        int someAge = 27;
        if (someAge >= 2 && someAge <= 6) {
            System.out.println("Если возраст человека равен " + someAge + ", то ему нужно ходить в детский сад.");
        } else if (someAge >= 7 && someAge <= 17) {
            System.out.println("Если возраст человека равен " + someAge + ", то ему нужно ходить в школу.");
        } else if (someAge >= 18 && someAge <= 24) {
            System.out.println("Если возраст человека равен " + someAge + ", то ему нужно учиться в университете.");
        } else if (someAge > 24) {
            System.out.println("Если возраст человека равен " + someAge + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Возраст слишком мал");
        }

        //Задание 5
        int ageOfKid = 16;
        if (ageOfKid < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfKid +
                    ", то ему запрещено кататься на аттракционе");
        } else if (ageOfKid >= 5 && ageOfKid <= 13) {
            System.out.println("Если возраст ребенка равен " + ageOfKid +
                    ", то он может кататься на аттракицоне в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + ageOfKid +
                    ", то он может кататься на аттракицоне самостоятельно.");
        }

        //Задание 6
        int wagonCapacity = 102;
        int sitting = 60;
        int passengersAmount = 90;

        if (passengersAmount < sitting) {
            System.out.println("В вагоне есть свободное сидячее место");
        }
        else if (passengersAmount >= sitting && passengersAmount < wagonCapacity) {
            System.out.println("В вагоне есть свободное стоячее место, сидячие заняты");
        }
        else {
            System.out.println("Вагон забит, мест нет");
        }

        //Задание 7
        int one;
        int two;
        int three;
        int biggest1;
        int biggest2;
        one = -54;
        two = 5452;
        three = 1204;

        //Реализация 1
        if (one >= two) {
            biggest1 = one;
            if (three > biggest1)
            {
                biggest1 = three;
            }
        }
        else if (two >= one) {
            biggest1 = two;
            if (three > biggest1){
                biggest1 = three;
            }
        }
        else {
            biggest1 = three;
        }

        //Реализация 2
        if (one >= two && one >= three){
            biggest2 = one;
        }
        else if (two >= one && two >= three) {
            biggest2 = two;
        }
        else {
            biggest2 = three;
        }

        System.out.print("Наибольшее из чисел (реализация 1) ");
        System.out.println(one + ", " + two + ", " + three + ": " + biggest1);
        System.out.print("Наибольшее из чисел (реализация 2) ");
        System.out.println(one + ", " + two + ", " + three + ": " + biggest2);

    }
}