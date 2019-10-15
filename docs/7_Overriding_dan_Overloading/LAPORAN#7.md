# Laporan Praktikum #7 - Overloading dan Overriding

## Kompetensi

Setelah menempuh pokok bahasan ini, mahasiswa mampu :
1. Memahami konsep overloading dan overriding,
2. Memahami perbedaan overloading dan overriding,
3. Ketepatan dalam mengidentifikasi method overriding dan overloading
4. Ketepatan dalam mempraktekkan instruksi pada jobsheet
5. Mengimplementasikan method overloading dan overriding.

## Ringkasan Materi

## Percobaan 1
    Untuk kasus contoh berikut ini, terdapat tiga kelas, yaitu Karyawan, Manager, dan Staff. Class Karyawan merupakan superclass dari Manager dan Staff dimana subclass Manager dan Staff memiliki method untuk menghitung gaji yang berbeda.


![classdiagramp1](img/classdiagramp1.PNG)

link kode program : [Karyawan1941723005.java](../../src/7_Overriding_dan_Overloading/Karyawan1941723005.java)

![kp1](img/kp1.PNG)
![kp12](img/kp12.PNG)
![kp13](img/kp13.PNG)

link kode program : [Manager1941723005.java](../../src/7_Overriding_dan_Overloading/Manager1941723005.java)

![mp1](img/mp1.PNG)
![mp12](img/mp12.PNG)
![mp13](img/mp13.PNG)

link kode program : [Staff1941723005.java](../../src/7_Overriding_dan_Overloading/Staff1941723005.java)

![sp1](img/sp1.PNG)
![sp12](img/sp12.PNG)

link kode program : [Utama1941723005.java](../../src/7_Overriding_dan_Overloading/Utama1941723005.java)

![up1](img/up1.PNG)
![up12](img/up12.PNG)
![up13](img/up13.PNG)
![up14](img/up14.PNG)
![up15](img/up15.PNG)

## Latihan

link kode program : [PerkalianKu1941723005.java](../../src/7_Overriding_dan_Overloading/PerkalianKu1941723005.java)

![l1](img/l1.PNG)
![l12](img/l12.PNG)

1. Dari source coding diatas terletak dimanakah overloading?
2. Jika terdapat overloading ada berapa jumlah parameter yang berbeda?

link kode program : [PerkalianKu21941723005.java](../../src/7_Overriding_dan_Overloading/PerkalianKu1941723005.java)

![l2](img/l2.PNG)
![l21](img/l21.PNG)

3. Dari source coding diatas terletak dimanakah overloading?
4. Jika terdapat overloading ada berapa tipe parameter yang berbeda?

link kode program : [Ikan1941723005.java](../../src/7_Overriding_dan_Overloading/PerkalianKu1941723005.java)

![l3](img/l3.PNG)

link kode program : [Piranha1941723005.java](../../src/7_Overriding_dan_Overloading/PerkalianKu1941723005.java)

![l32](img/l32.PNG)

link kode program : [Fish1941723005.java](../../src/7_Overriding_dan_Overloading/PerkalianKu1941723005.java)

![l33](img/l33.PNG)

5. Dari source coding diatas terletak dimanakah overriding?
6. Jabarkanlah apabila sourcoding diatas jika terdapat overriding?

## Jawaban

1. Overload terletak pada:
```java
void perkalianFikrul(int a, int b) {
    System.out.println(a * b);
}
//oveloading perbedaan jumlah parameter
void perkalianFikrul(int a, int b, int c) {
    System.out.println(a * b * c);
}
```

2. Ada 1 (satu) jumlah parameter yang berbeda, yaitu:
```java
int c
```

3. Overload terdapat pada:
```java
void perkalianFikrul(int a, int b) {
    System.out.println(a * b);
    }
//overloading perbedaan tipe data parameter 
void perkalianFikrul(double a, double b) {
    System.out.println(a * b);
}
```

4. Ada 2 (dua) yaitu:
```java
double a, double b
```

5. Override terletak pada:
```java
//overriding method parent class
@Override
public void swimFikrul() {
    System.out.println("Piranha bisa makan daging");
}
```

6. Subclass tidak dapat mengimplementasikan method swimFikrul() yang merupakan polimorfisme dari swimFikrul() yang ada pada superclass sehingga akan error jika tidak override.

## Tugas

### 1. Overloading

link kode program : [Segitiga1941723005.java](../../src/7_Overriding_dan_Overloading/PerkalianKu1941723005.java)

![t1](img/t1.PNG)
![t12](img/t12.PNG)

link kode program : [SegitigaMain1941723005.java](../../src/7_Overriding_dan_Overloading/PerkalianKu1941723005.java)

![t13](img/t13.PNG)
![t14](img/t14.PNG)

## 2. Overriding

link kode program : [Manusia1941723005.java](../../src/7_Overriding_dan_Overloading/PerkalianKu1941723005.java)

![t2](img/t2.PNG)

link kode program : [Dosen1941723005.java](../../src/7_Overriding_dan_Overloading/PerkalianKu1941723005.java)

![t22](img/t22.PNG)

link kode program : [Mahasiswa1941723005.java](../../src/7_Overriding_dan_Overloading/PerkalianKu1941723005.java)

![t23](img/t23.PNG)

link kode program : [ManusiaMain1941723005.java](../../src/7_Overriding_dan_Overloading/PerkalianKu1941723005.java)

![t24](img/t24.PNG)
![t25](img/t25.PNG)