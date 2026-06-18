public class MainRun {
    static void main(String[] args) {
        ColdBox cold = new ColdBox();
        cold.id = 1244;
        cold.capacity = 150.45;
        System.out.println("id: " + cold.id);
        System.out.println("capacity: " + cold.capacity);
        System.out.println("initial temp: "+ cold.temp);
        cold.adjustTemp(5);
    }
}
