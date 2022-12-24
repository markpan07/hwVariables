public class Main {
    public static void main(String[] args) {
        // Комментарий для создания новой ветки
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog +4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend - 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

    }

    public static void task6 () {
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        var commonWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес составляет " + commonWeight + " кг");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе составляет " + weightDifference + " кг");

    }

    public static void task7 () {
        System.out.println("Задача 7");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        var weightDifference2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе составляет " + weightDifference2 + " кг");
        var weightDifference1 = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе составляет " + weightDifference1 + " кг");

    }

    public static void task8 () {
        System.out.println("Задача 8");
        System.out.println("Пункт 1:");
        var generalWorkTime = 640;
        var personalWorkLoad = 8;
        var quantityOfWorkers = generalWorkTime / personalWorkLoad;
        System.out.println("Всего работников в компании - " + quantityOfWorkers + " человек.");
        System.out.println();

        System.out.println("Пункт 2:");
        quantityOfWorkers = quantityOfWorkers + 94;
        generalWorkTime = quantityOfWorkers * personalWorkLoad;
        System.out.println("Если в компании работает " + quantityOfWorkers + " человек, то всего " + generalWorkTime + " часов работы может быть поделено между сотрудниками.");
    }
}