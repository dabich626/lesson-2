public class Main {
        public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task8();
        }

    private static void task8() {
            var workHourse = 640;
            var workersAmount = 640 / 8;
        System.out.println("всего работников в компании" + workersAmount + "человек");
        workersAmount = workersAmount + 94;
        System.out.println(workersAmount);
        var newWorkTime = workHourse / workersAmount;
        System.out.println("если в компании работет" + workersAmount + "человек, то всего" + newWorkTime + "часа может быть поделено между сотрудниками");

    }


    private static void task6() {
            var boxerWeight1 = 78.2;
            var boxerWeight2 = 82.7;
            var totalWeight = boxerWeight2 + boxerWeight1;
        System.out.println(totalWeight);
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println(weightDifference);
        var weightDifference2 = boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе боксеров составляет" + weightDifference2);
    }

    private static void task5() {
            var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    private static void task4() {
            var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }

    private static void task3() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task1 () {
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);


        }

        public static void task2 () {
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);

            dog = dog + 4;
            cat = cat + 4;
            paper = paper + 4;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);


        }
    }