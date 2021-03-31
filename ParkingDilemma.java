
import java.util.Collections;
import java.util.List;

// ParkingDilemma
// There are many cars parked in the parking lot. The parking is a straight very long line and a parking slot for every single meter.
//        There are cars parked currently and you want to cover them from the rain by building a roof.
//        The requirement is that at least k cars are covered by the roof.What's the minium length of the roof that would cover k cars?
//        The function has the following parameters:
//
//        cars: integer array of length denoting the parking slots where cars are parked
//        k: integer denoting the number of cars that have to be covered by the roof

public class ParkingDilemma{

    public static long ParkingDilemma(List<Long> cars, int k) {
        Collections.sort(cars);
        int len = cars.size();
        long min = (cars.get(k - 1) - cars.get(0));
        for (int i = 1; i <= len - k; i++) {
            if (min > cars.get(k - 1 + i) - cars.get(i)) {
                min = cars.get(k - 1 + i) - cars.get(i);
            }
        }
        return min + 1;
    }
}
