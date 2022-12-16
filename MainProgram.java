import java.util.*;

public class MainProgram {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Anita Nofianti");
        customer.setAddress("Telaga Harapan, CikBar");

        Order order = new Order();
        order.setDate(new Date());
        order.setStatus("Processed");

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setQuantity(1);
        orderDetail.setTaxStatus("Taxable");

        Item item = new Item();
        item.setShippingWeight(2);
        item.setDescription("Widget");

        Cash cash = new Cash();
        cash.setAmount(100);
        cash.setCashTendered(100);

        Check check = new Check();
        check.setName("Anita Nofianti");
        check.setBankID("330");

        Credit credit = new Credit();
        credit.setNumber("21027999");
        credit.setType("Visa");
        credit.setExpDate(new Date());

        System.out.println("Nama : " + customer.getName());
        System.out.println("Alamat : " + customer.getAddress());
        System.out.println("Tanggal : " + order.getDate());
        System.out.println("Status : " + order.getStatus());
        System.out.println("Jumlah : " + orderDetail.getQuantity());
        System.out.println("Status Pajak : " + orderDetail.getTaxStatus());
        System.out.println("Berat Kirim : " + item.getShippingWeight());
        System.out.println("Deskripsi : " + item.getDescription());
        System.out.println("Jumlah : " + cash.getAmount());
        System.out.println("Uang Tunai : " + cash.getCashTendered());
        System.out.println("Nama : " + check.getName());
        System.out.println("ID Bank : " + check.getBankID());
        System.out.println("Nomor : " + credit.getNumber());
        System.out.println("Jenis : " + credit.getType());
        System.out.println("Tanggal Kadaluarsa : " + credit.getExpDate());
    }
}