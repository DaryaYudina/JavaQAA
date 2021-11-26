public class Elevator {

    private int currentFloor = 1; //текущий этаж
    private int minFloor = 1; //минимальный этаж
    private int maxFloor = 0; //максимальный этаж

    public Elevator(int minFloor, int maxFloor){
         this.minFloor = minFloor;
         this.maxFloor = maxFloor;

    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = getCurrentFloor() - 1;
    }

    public void moveUp() {
        currentFloor = getCurrentFloor() + 1;
    }

    public void move(int floor) {
        /**
         * Метод move(int floor), перемещающий лифт на заданный в параметре этаж, если он задан верно.
         * Если параметр у метода задан неверно, ничего не делать и выводить в консоль сообщение об ошибке.
         * Этот метод может перемещать лифт только последовательно, по одному этажу, с помощью циклов и методов moveUp и moveDown,
         * и должен выводить в консоль текущий этаж после каждого перемещения между этажами.
         */
        if ((floor < minFloor) || (floor > maxFloor)) {
            System.out.println("Ошибка. Введите номер этажа, который есть в здании");
        } else if (floor > getCurrentFloor()){
            while(floor > getCurrentFloor()){
                moveUp();
                System.out.println(getCurrentFloor() +" этаж");
            }
        }else{
            while(floor < getCurrentFloor()){
                moveDown();
                System.out.println(getCurrentFloor() +" этаж");
            }
        }
    }
}


