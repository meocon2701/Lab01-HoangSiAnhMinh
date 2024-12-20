import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap he so a, b va c tu nguoi dung
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();

        // Tinh delta (binh phuong b tru 4ac)
        double delta = b * b - 4 * a * c;

        System.out.println("Delta: " + delta);

        // Kiem tra gia tri delta de xac dinh nghiem cua phuong trinh
        if (delta > 0) {
            // Hai nghiem thuc phan biet
            double nghiem1 = (-b + Math.sqrt(delta)) / (2 * a);
            double nghiem2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem thuc: " + nghiem1 + " va " + nghiem2);
        } else if (delta == 0) {
            // Mot nghiem thuc kep
            double nghiem = -b / (2 * a);
            System.out.println("Phuong trinh co mot nghiem thuc: " + nghiem);
        } else {
            // Khong co nghiem thuc
            System.out.println("Phuong trinh khong co nghiem thuc.");
        }

        scanner.close();
    }
}
