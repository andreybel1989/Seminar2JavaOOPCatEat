// Чтобы можно было хранить еду, создадим класс Тарелка с полем food (еда измеряется в целых
// числах и не важно, что это за единицы измерения). При создании тарелки мы можем указать
// начальное значение food. В процессе работы с помощью метода info() можно вывести в консоль
// информацию о тарелке.

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int value) {
        
            food -= value;
        
    }
    public void addFood(int food) {
        this.food += food;
        System.out.println("В тарелку добавили еды в количестве " + food );
    }

}