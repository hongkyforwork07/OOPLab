public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int quantities = 0;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (quantities == 20) System.out.println("The cart is full.");
        else {
            itemOrdered[quantities++] = disc;
            System.out.println("The disc has been added.");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < quantities; ++i) {
            if (itemOrdered[i] == disc) {
                for (int j = i; j < quantities - 1; ++j) {
                    itemOrdered[j] = itemOrdered[j + 1];
                }
                itemOrdered[quantities - 1] = null;
                quantities--;
                System.out.println("The disc has been removed.");
                return;
            }
        }
        System.out.println("The disc is not in the cart.");
    }
    public double totalCost() {
        double res = 0;
        for (int i = 0; i < quantities; ++i) {
            res += itemOrdered[i].getCost();
        }
        return res;
    }
}
