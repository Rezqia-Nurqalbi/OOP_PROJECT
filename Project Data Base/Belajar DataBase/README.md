# App.java
didalam App.java terdapat method Menu.showMenu(); yang untuk menampilkan pilihan menu 


# MyConfig.java
1. DB_URL: Variabel konstan yang menyimpan URL untuk mengakses database MySQL. Dalam kode tersebut, database diakses menggunakan URL "jdbc:mysql://localhost:3306/dt_produk". 

2. DB_USER dan DB_PASS: Variabel konstan yang menyimpan username dan password untuk mengakses database. Dalam kode tersebut, username yang digunakan adalah "root" dan password-nya kosong (tidak ada password).

3. connection, preparedStatement, resultSet, query: Variabel yang digunakan untuk menyimpan objek-objek yang terkait dengan koneksi dan eksekusi query ke database. Variabel ini dideklarasikan sebagai protected static, sehingga dapat diakses oleh kelas turunan.

4. connection(): Metode yang digunakan untuk membuat koneksi ke database. Metode ini menggunakan DriverManager.getConnection() untuk mendapatkan objek Connection yang merepresentasikan koneksi ke database. Setelah koneksi berhasil dibuat, pesan "Data Base Connected Succes" akan ditampilkan di konsol. Jika terjadi SQLException, maka pesan error akan ditampilkan di konsol.

# produk.java 
didalam file produk.java terdapat attribute id, nama,harga,dan jumlah yang memilik acces modifier private dan untuk id memiliki tipe data int, nama memiliki tipe data String, harga memiliki tipe data long, dan jumlah memiliki tipe data int.

pada dalam file ini juga terdapat constructor dan menggunakan Setter dan getter pada masing masing atribute

# Menu.java
didalam menu.java terdapat method showMenu() yang dimana terdapat 5 menu yaitu read Data, Insert, Edit, Delete,dan exit. dan terdapat juga method SelectMenu() yang dimana menggunakan scanner dan terdapat switch case untuk memilih setiap menu yang diinginkan dan terdapat juga try catch untuk menghindari error

#  Edit.java
Didalam file ini terdapat method static void showEditData dengan parameter (String nama) dan menggunakan scanner juga dan terdapat pilihan menu untuk  pilih menu update data dan menggunakan switch case dan try case. terdapat beberapa method juga yaitu showEditNama(String nama) untuk mengedit nama data dengan memasukkan nama awal dan nama baru bgitupun dengan showEditHarga(String nama) dan showEditJumlah(String nama). 

# Delete.java
didalam file ini terdapat showDeleteData() digunakan untuk menghapus data yang diinginkan dengan menggunakan scanner dan memasukkan pilih nama produk yang diingin dihapus dan terdapat pengkondisian untuk mengetahui apakah delete data berhasil atau tidak

# Insert.java
Didalam ini terdapat showInsertData() untuk menambahkan data kedalam data base yang kita punyai dengan memasukkan Nama Produk, Harga, Jumlah dan terdapat juga pengkondisian untuk mengetahui apakah insert data berhasil atau tidak

# Read.java
didalam file ini terdapat method showReadData() untuk membaca data base yang kita punyai dan terdapat juga switch case untuk memilih kembali ke menu atau exit dan terdapat juga try catch supaya menghindari error  dengan menampilkan pesan maaf inputan error jika pilih menu tidak tersedia

# DbController.java
1. getDatabase(): Metode ini digunakan untuk mengambil semua data dari tabel "tb_produk" dan menampilkannya di konsol. Metode ini menggunakan objek connection yang diwarisi dari kelas MyConfig untuk menghubungkan ke database. Hasil query dieksekusi menggunakan objek preparedStatement dan hasilnya ditampung dalam objek resultSet.

2. getProdukByNama(String nama): Metode ini digunakan untuk mencari data produk berdasarkan nama yang diberikan. Metode ini juga menggunakan objek connection dari kelas MyConfig. Query yang dieksekusi adalah "SELECT * FROM tb_produk WHERE NAMA=?", dengan parameter nama sebagai kondisi. Hasil query ditampung dalam objek resultSet, dan data dari resultSet digunakan untuk membuat objek produk yang kemudian dikembalikan.

3. insertData(String nama, long harga, int jumlah): Metode ini digunakan untuk menyisipkan (insert) data baru ke dalam tabel "tb_produk". Metode ini juga menggunakan objek connection dari kelas MyConfig. Query yang dieksekusi adalah "INSERT INTO tb_produk (NAMA, HARGA, JUMLAH) VALUES (?, ?, ?)", dengan parameter nama, harga, dan jumlah sebagai nilai-nilai yang akan dimasukkan. Data disisipkan menggunakan objek preparedStatement dan dieksekusi dengan metode executeUpdate().

4. updateNama(int id, String nama): Metode ini digunakan untuk mengubah (update) nama produk berdasarkan ID produk. Metode ini juga menggunakan objek connection dari kelas MyConfig. Query yang dieksekusi adalah "UPDATE tb_produk SET NAMA=? WHERE ID=?", dengan parameter nama dan id sebagai nilai-nilai yang akan diupdate. Data diupdate menggunakan objek preparedStatement dan dieksekusi dengan metode executeUpdate().

5. updateHarga(int id, long harga): Metode ini digunakan untuk mengubah (update) harga produk berdasarkan ID produk. Metode ini juga menggunakan objek connection dari kelas MyConfig. Query yang dieksekusi adalah "UPDATE tb_produk SET HARGA=? WHERE ID=?", dengan parameter harga dan id sebagai nilai-nilai yang akan diupdate. Data diupdate menggunakan objek preparedStatement dan dieksekusi dengan metode executeUpdate().

6. updateStok(int id, int jumlah): Metode ini digunakan untuk mengubah (update) jumlah stok produk berdasarkan ID produk. Metode ini juga menggunakan objek connection dari kelas MyConfig. Query yang dieksekusi adalah "UPDATE tb_produk SET JUMLAH=? WHERE ID=?", dengan parameter jumlah dan id sebagai nilai-nilai yang akan diupdate. Data diupdate menggunakan objek preparedStatement dan dieksekusi dengan metode executeUpdate().

7. deleteData(String nama): Metode ini digunakan untuk menghapus (delete) data produk berdasarkan nama produk. Metode ini juga menggunakan objek connection dari kelas MyConfig. Query yang dieksekusi adalah "DELETE FROM tb_produk WHERE NAMA=?", dengan parameter nama sebagai kondisi. Data dihapus menggunakan objek preparedStatement dan dieksekusi dengan metode executeUpdate(). Jika terdapat baris yang terpengaruh (affected row) oleh operasi penghapusan, metode ini akan mengembalikan nilai true, jika tidak, maka akan mengembalikan nilai false.