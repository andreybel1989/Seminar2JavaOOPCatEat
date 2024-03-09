// Допустим, в программе есть класс Кот. У кота есть кличка и аппетит (сколько единиц еды он потребляет за приём
// пищи). Эти поля мы заполняем с помощью конструктора. Также есть метод eat(), который заставляет
// кота покушать, но пока что он пустой, так как неизвестно, откуда кот должен брать еду:

public class Cat {
    private String name;
    private int appetite;
    private boolean full = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.getFood() < appetite) {
            System.out.println("В тарелке не достаточно еды для кота " + name);
            plate.addFood(appetite);
            plate.decreaseFood(appetite);
            System.out.println(name + " поел из тарелки");
            full = true;

        } else {
            plate.decreaseFood(appetite);
            System.out.println(name + " поел из тарелки");
            full = true;

        }

    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void info() {
        String state = full ? "Сыт" : "Голоден";
        System.out.printf("[Кличка : %s, Аппетит: %d, Состояние: %s]\n", name, appetite, state);
    }

}