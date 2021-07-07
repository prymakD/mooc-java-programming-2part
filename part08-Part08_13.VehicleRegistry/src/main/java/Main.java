
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");
        VehicleRegistry v = new VehicleRegistry();

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("Finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg
        
        
        v.add( new LicensePlate("FI", "AAA-111"), "Arto");
        v.add( new LicensePlate("FI", "AAA-111"), "Arto");
        System.out.println(v.add( new LicensePlate("FI", "AAA-111"), "Pekka"));;
//        v.remove(li3);

        v.printOwners();
        // if the hasCode-method hasn't been overwritten, the owners won't be found
    }
}
