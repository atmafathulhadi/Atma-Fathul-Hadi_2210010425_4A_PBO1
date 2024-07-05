package pbo;

import java.util.Scanner;

public class SkateboardBeraksi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            SkateboardDetail[] skateboards = new SkateboardDetail[2];

            for (int i = 0; i < skateboards.length; i++) {
                System.out.print("Masukkan brand skateboard " + (i + 1) + ": ");
                String brand = scanner.nextLine();
                String model;
                while (true) {
                    System.out.print("Masukkan model skateboard " + (i + 1) + " (5 angka): ");
                    model = scanner.nextLine();
                    if (model.length() == 5 && model.matches("\\d+")) {
                        break;
                    } else {
                        System.out.println("Model harus berupa 5 angka. Silakan coba lagi.");
                    }
                }
                skateboards[i] = new SkateboardDetail(brand, model);
            }

            boolean running = true;
            while (running) {
                System.out.println("=============");
                System.out.println("Pilihan:");
                System.out.println("1. Tampilkan semua skateboard");
                System.out.println("2. Keluar");
                System.out.print("Masukkan pilihan: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        for (SkateboardDetail skateboard : skateboards) {
                            System.out.println("=============");
                            System.out.println("Data skateboard:");
                            System.out.println(skateboard.displayInfo());
                        }
                        break;
                    case 2:
                        running = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid, coba lagi.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format model: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
        }
    }
}
