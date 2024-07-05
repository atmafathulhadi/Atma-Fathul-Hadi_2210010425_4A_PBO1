# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa brand dan model skateboard, dan memberikan output berupa informasi detail dari model tersebut seperti tahun produksi, tipe, ukuran, dan nomor serial.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Skateboard`, `SkateboardDetail`, dan `SkateboardBeraksi` adalah contoh dari class.

```bash
public class Skateboard {
    ...
}

public class SkateboardDetail extends Skateboard {
    ...
}

public class SkateboardBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `skateboards[i] = new SkateboardDetail(brand, model);` adalah contoh pembuatan object.

```bash
skateboards[i] = new SkateboardDetail(brand, model);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, brand dan model adalah contoh atribut.

```bash
String brand;
String model;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Skateboard` dan `SkateboardDetail`.

```bash
public Skateboard(String brand, String model) {
    this.brand = brand;
    this.model = model;
}

public SkateboardDetail(String brand, String model) {
    super(brand, model);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setBrand` dan `setModel` adalah contoh method mutator.

```bash
public void setBrand(String brand) {
    this.brand = brand;
}

public void setModel(String model) {
    this.model = model;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getBrand`, `getModel`, `getYear`, `getType`, `getSize`, dan `getSerialNumber` adalah contoh method accessor.

```bash
public String getBrand() {
    return brand;
}

public String getModel() {
    return model;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `brand` dan `model` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String brand;
private String model;
```

8. **Inheritance** Inheritance adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `SkateboardDetail` mewarisi `Skateboard` dengan sintaks `extends`.

```bash
public class SkateboardDetail extends Skateboard {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Skateboard` merupakan overloading method `displayInfo` dan `displayInfo` di `SkateboardDetail` merupakan override dari method `displayInfo` di `Skateboard`.

```bash
public String displayInfo(String additionalInfo) {
    return displayInfo() + "\nAdditional Info: " + additionalInfo;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getType` dan seleksi `switch` dalam method `getSize`.

```bash
public String getType() {
    String typeCode = getModel().substring(2, 3);
    if (typeCode.equals("1")) {
        return "Freestyle";
    } else if (typeCode.equals("2")) {
        return "Street";
    } else if (typeCode.equals("3")) {
        return "Vert";
    } else {
        return "Tipe Tidak diketahui";
    }
}

public String getSize() {
    String sizeCode = getModel().substring(3, 4);
    switch (sizeCode) {
        case "1":
            return "Kecil";
        case "2":
            return "Sedang";
        case "3":
            return "Besar";
        default:
            return "Ukuran tidak ada";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < skateboards.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan brand skateboard " + (i + 1) + ": ");
String brand = scanner.nextLine();

System.out.println("\nData Skateboard:");
System.out.println(skateboard.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `SkateboardDetail[] skateboards = new SkateboardDetail[2];` adalah contoh penggunaan array.

```bash
SkateboardDetail[] skateboards = new SkateboardDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Atma Fathul Hadi
NPM: 2210010425
