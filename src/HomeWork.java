public class HomeWork {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
        //task10();


    }

    public static void task1() {
        int a = 114151515;
        byte b = 12;
        short c = 11415;
        long d = 1151511516;
        float f = 1.11f;
        double g = 1.141151515f;
        System.out.println(a);
    }

    public static void task2() {
        double dog = 8;
        float cat = 3.6f;
        int paper = 763789;
        System.out.println(dog + "  " + cat + "  " + paper);
        System.out.printf("===============");
        System.out.println();
        dog = dog + 2;
        System.out.println(dog);
        cat = cat + 2;
        System.out.println(cat);
        paper = paper + 2;
        System.out.println(paper);
        System.out.println();
        System.out.printf("===============");
        dog = dog - 3.5;
        cat = cat - 1.6f;
        paper = paper - 7639;
        System.out.println();
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task3() {
        System.out.printf("Cледующее задание");
        System.out.println();
        var boxingFighter = 78.2;
        var boxingFighter2 = 82.7;
        var totalWeight = boxingFighter + boxingFighter2;
        System.out.println(totalWeight);
        System.out.printf("================");
        var difference = boxingFighter - boxingFighter2;
        System.out.println();
        System.out.println(difference);
        System.out.printf("Cледующее задание");
        System.out.println();
        var difference2 = boxingFighter2 - boxingFighter;
        System.out.println(difference2);
        var difference3 = boxingFighter2 % boxingFighter;
        System.out.println(difference3);
    }

    public static void task4() {
        var totalHour = 640;
        var hourOneWorker = 8;
        var totalWokers = totalHour / hourOneWorker;
        System.out.printf("Всего работников в компании - " + totalWokers + " человек");
        var bigCompany = totalWokers + 94;
        var hourInBigCompany = totalHour / bigCompany;
        System.out.println();
        System.out.printf("=========");
        System.out.println();
        System.out.printf("Если в компании работает " + bigCompany + " человека, то всего " + hourInBigCompany + " часа работы может быть поделено между сотрудниками");
    }

}

