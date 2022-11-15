package it.develhope;

public class TestProgrammers {

    public static void main(String[] args) {

        System.out.println("============= START ===============");

        Programmer mohamed, gianni;

        mohamed = new Programmer("Mohamed Larmani", 25, true);
        gianni = new Programmer("Gianni Fantoni", 31, false);

        mohamed.drinkCoffee();
        mohamed.printDetails();
        gianni.printDetails();
        gianni.wearsGlasses();

        System.out.println("============== END ================");
    }
}
