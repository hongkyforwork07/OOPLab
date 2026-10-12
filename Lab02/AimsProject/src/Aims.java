public class Aims {
    public static void main(String[] args) {

        //Tạo một giỏ hàng mới
        Cart anOrder = new Cart();

        //Tạo đối tượng DVD mới và thêm chúng vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
        "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
        "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
        "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        //in biển tổng chi phí của các mặt hàng trong giỏ
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());

        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());
    }
}