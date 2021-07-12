import com.company.HisCar;
import com.company.MyCar;

public class Main {

    public static void main(String[] args) {
        MyCar myCar = new MyCar("lada", "red", 50);
        myCar.gas(10);
        myCar.brake(5);
        myCar.description();

        HisCar hisCar = new HisCar("3.5");
        hisCar.gas(100);
        hisCar.brake(-25);
        hisCar.description();

    }

}
