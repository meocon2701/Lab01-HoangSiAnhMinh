import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số thực
        System.out.print("Nhap so thu nhat: ");
        double so1 = scanner.nextDouble();
        
        System.out.print("Nhap so thu hai: ");
        double so2 = scanner.nextDouble();
        
        // Tính tổng, hiệu, tích và thương
        double tong = so1 + so2;
        double hieu = so1 - so2;
        double tich = so1 * so2;
        double thuong = so2 != 0 ? so1 / so2 : Double.NaN; // Xử lý chia cho 0

        // Hiển thị kết quả
        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        
        if (so2 != 0) {
            System.out.println("Thuong: " + thuong);
        } else {
            System.out.println("Thuong: Khong xac dinh (chia cho 0)");
        }

        scanner.close();
    }
}
