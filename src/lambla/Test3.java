package lambla;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;
public class Test3 {

    public static ArrayList<Car> create(Supplier<Car> carSuupler){
        ArrayList<Car>a1 = new ArrayList<>();
        for (int i =0 ; i <3;i++){
            a1.add(carSuupler.get());
        }
        return a1;
    }
    public static void chang(Car car,Consumer<Car>carConsumer){
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCar = create(()-> new Car("nissan","red",1.6));
        System.out.println("our cars:"+ourCar);
        System.out.println("------------------------");
        chang(ourCar.get(0),
                car -> {car.color = "green";
                car.enjine = 2.3;
        System.out.println("upgreid"+car);});
    }

}
class Car{
    String model;
    String color;
    double enjine;

    public Car(String model, String color, double enjine) {
        this.model = model;
        this.color = color;
        this.enjine = enjine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", enjine=" + enjine +
                '}';
    }


}
