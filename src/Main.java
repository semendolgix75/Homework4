public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
//         С помощью условного оператора напишите программу, которая выводит в консоль:
//           сообщение о том, что человеку 18 или больше лет;
//    сообщение, что возраст совершеннолетия еще не наступил, нужно немного подождать.
        byte age = 5;
        byte agePerfection = 18;

        if (age >= agePerfection) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний \n");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать\n ");
        }

        System.out.println("Задача 2 ");
//    Человек одевается в зависимости от температуры воздуха. Напишите программу, которая выводит сообщение:
//    «На улице холодно, нужно надеть шапку» — если температура ниже 5 градусов.
//    «Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.
        byte tempToday = 4;
        byte tempCritical = 5;
        if (tempToday < tempCritical)
            System.out.println("На улице " + tempToday + " градусов, нужно надеть шапку.\n");
        if (tempToday > tempCritical)
            System.out.println("На улице " + tempToday + " градусов можно идти без шапки.\n");
        if (tempToday == tempCritical)
            System.out.println("На улице " + tempToday + " градусов, условием задачи не определено в чем идти.\n");


        System.out.println("Задача 3 ");
//     За превышение скорости водителю могут выписать штраф. Напишите программу, которая сообщает водителю о том, что
//     скорость превышена, если она больше 60 км/ч
//      превышения скорости нет, если она меньше 60 км/ч.
        int speedCurrent = 70;
        int speedCritical = 60;
        if (speedCurrent > speedCritical)
            System.out.println("Если скорость " + speedCurrent + " км/ч, то придется заплатить штраф.\n ");
        else
            System.out.println("Если скорость " + speedCurrent + " км/ч,можно ездить спокойно.\n");


        System.out.println("Задача 4 ");

//       Напишите программу, которая помогает определить, в какое учреждение нужно отправить человека в зависимости от его возраста:
//       Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
//       Если человеку от 7 до 17 лет, то ему нужно ходить в школу.
//       Если человеку больше или равно 18 лет, но меньше или равно 24, то его место в университете.
//        java.util.Scanner in=new java.util.Scanner(System.in);
        System.out.println("Введите возраст от двух лет: ");
//        byte agePerson=in.nextByte();
        byte agePerson = 25;
        byte ageKinderGardenMin = 2;
        byte ageKinderGardenMax = 6;
        byte ageSchoolMin = 7;
        byte ageSchoolMax = 17;
        byte ageStudentMin = 18;
        byte ageStudentMax = 24;


        if (agePerson >= ageKinderGardenMin && agePerson <= ageKinderGardenMax) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад\n");
        } else {
            if (agePerson >= ageSchoolMin && agePerson <= ageSchoolMax) {
                System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу\n");
            } else {
                if (agePerson >= ageStudentMin && agePerson <= ageStudentMax) {
                    System.out.println("Если возраст человека равен " + agePerson + ", то его место в университете.\n");
                } else {
                    System.out.println("Если возраст человека равен " + agePerson + ", то ему пора ходить на работу.\n")
                    ;
                }
            }
        }


        System.out.println("Задача 5 ");
//        Как правило, на аттракционах действуют ограничения для детей по возрасту:
//        Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
//        Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.
//        Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        byte ageVisitor = 4;
        byte ageNoAttraction = 5;
        byte ageAccompaniedBy = 14;
        if (ageVisitor < ageNoAttraction) {
            System.out.println("Если возраст ребенка равен " + ageVisitor + ", то ему нельзя кататься на аттракционе\n");
        } else {
            if (ageVisitor < ageAccompaniedBy)
                System.out.println("Если возраст ребенка равен " + ageVisitor + ", то ему можно кататься на аттракционе в сопровождении\n");
            else
                System.out.println("Если возраст ребенка равен " + ageVisitor + ", то ему можно кататься без сопровождения взрослого\n");
        }

        System.out.println("Задача 6 ");
//         Вагон рассчитан на 60 сидячих мест, все остальные — стоячие.
        int passenger = 100;              //Запрос количества пассажиров
        int capacityCarTrain = 102;       //Вместимость одного вагона поезда — 102 человека.
        int seatsInCarTrain = 60;         //Вагон рассчитан на 60 сидячих мест, все остальные — стоячие.
        int seatsFree = (seatsInCarTrain - passenger);      //Количество сидячих мест
        int placeFree = (capacityCarTrain - passenger);     //Количество оставшихся мест
        if (passenger < seatsInCarTrain) {
            System.out.println("Есть место в вагоне еще на " + placeFree + " чел., из них сидячих - " + seatsFree + " мест\n");
        } else if (passenger < capacityCarTrain) {
            System.out.println(("Есть место в вагоне еще на " + placeFree + ", из них сидячих мест нет\n"));
        } else {
            System.out.println("Вагон уже полностью забит\n");
        }


        System.out.println("Задача 7 ");
//        С помощью условного оператора и конструкции else напишите программу, которая вычисляет,
//        какое из трех чисел бо́льшее, и выводит результат в консоль.
        int one = 11;
        int two = 5;
        int three = 8;
        int max = 0;
        if (one > two && one > three) {
            max = one;
        } else {
            if (two > one && two > three) {
                max = two;
            } else {
                max = three;
            }
        }
        System.out.println("Из трех чисел бо́льшее = " + max);
    }
}
