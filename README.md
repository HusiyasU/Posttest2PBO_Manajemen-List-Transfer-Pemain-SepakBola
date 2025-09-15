# ⚽ Post Test 2 - PBO  
## Manajemen Transfer Pemain Sepak Bola  

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)  
![CRUD](https://img.shields.io/badge/CRUD-Create%20Read%20Update%20Delete-blue?style=for-the-badge)  
![OOP](https://img.shields.io/badge/OOP-Object%20Oriented%20Programming-green?style=for-the-badge)  
![MVC](https://img.shields.io/badge/MVC-Model%20View%20Controller-orange?style=for-the-badge)  

---

## 👤 Data Diri
- **Nama** : Husaini Iyastama H.  
- **NIM** : 2409116038  
- **Kelas** : A  

---

## 📖 Deskripsi Singkat
Program ini adalah implementasi **CRUD (Create, Read, Update, Delete)** menggunakan bahasa pemrograman **Java**.  

Tema yang digunakan adalah **Manajemen Transfer Pemain Sepak Bola**, di mana pengguna dapat:
- ➕ Menambahkan data transfer pemain  
- 📋 Melihat daftar transfer  
- ✏️ Memperbarui data transfer  
- ❌ Menghapus data transfer  
- 🔎 Mencari data pemain berdasarkan nama  

### ✨ Fitur yang diterapkan
- **ArrayList** untuk menyimpan data pemain.  
- **Packages** untuk memisahkan fungsi program:  
  - `main` → entry point & menu utama.  
  - `model` → struktur data pemain/transfer.  
  - `service` → logika CRUD & fitur pencarian.  
- **Minimal 3 class** (`MainApp`, `Transfer`, `TransferService`).  
- **Constructor** pada class `Transfer`.  
- **Access modifier** (`private`, `public`).  
- **Validasi input angka** agar tidak error.  
- **Fitur search** untuk mencari pemain berdasarkan nama.  

### 🏗️ Pola MVC
- **Model (`model.Transfer`)** → Menyimpan struktur data pemain (nama, asal tim, klub tujuan, biaya transfer).  
- **Controller (`service.TransferService`)** → Menangani logika CRUD, validasi input, serta fitur pencarian.  
- **View (`main.MainApp`)** → Entry point program, menampilkan menu, menerima input, dan memanggil method dari `TransferService`.  

---

## 🛠️ Alur Program
### Saat dijalankan, program menampilkan menu utama:
<img width="471" height="162" alt="image" src="https://github.com/user-attachments/assets/cb9dc9f1-e5be-4ff8-bbec-2522722364e6" />

### Penjelasan Menu
1. **Tambah Transfer**  
   - Input nama pemain, asal tim, klub tujuan, biaya transfer.  
   - Data tersimpan dalam `ArrayList<Transfer>`.  

2. **Lihat Daftar Transfer**  
   - Menampilkan semua data transfer.  
   - Jika kosong → muncul pesan `"Belum ada data transfer..."`.  

3. **Ubah Data Transfer**  
   - Pilih nomor data → masukkan data baru.  
   - Jika daftar kosong / nomor tidak valid → muncul pesan error.  

4. **Hapus Data Transfer**  
   - Pilih nomor data yang ingin dihapus.  
   - Jika kosong / nomor tidak valid → muncul pesan error.  

5. **Cari Data Transfer**  
   - Input keyword (nama pemain).  
   - Program menampilkan data yang sesuai.  
   - Jika tidak ada → muncul pesan `"Data tidak ditemukan..."`.  

6. **Keluar**  
   - Program berhenti dengan pesan:  
     ```
     Keluar dari program...
     ```

---

## 📂 Struktur Package

<img width="305" height="187" alt="image" src="https://github.com/user-attachments/assets/45c7d30a-35bb-4431-96de-a1436ad78fa7" />


---

## 💻 Contoh Output
### Tambah Transfer
<img width="335" height="182" alt="image" src="https://github.com/user-attachments/assets/99739755-d3fd-4aed-9c91-51cec2671fed" />

### Lihat Transfer
<img width="560" height="138" alt="image" src="https://github.com/user-attachments/assets/6c18dde6-a148-4362-8e53-9c7784d3eb29" />

### Update Transfer
<img width="565" height="257" alt="image" src="https://github.com/user-attachments/assets/79543817-0e6a-4cf5-8d09-2ae57b4a39e5" />
<img width="565" height="102" alt="image" src="https://github.com/user-attachments/assets/47562e9d-fe04-4180-9b48-dc2789c04778" />

### Cari Transfer
<img width="662" height="92" alt="image" src="https://github.com/user-attachments/assets/b340fa75-a013-43ca-838c-964d94b65b96" />

### Hapus Transfer
<img width="567" height="173" alt="image" src="https://github.com/user-attachments/assets/2220bcde-05b2-44a4-bc87-f220f729322d" />
<img width="565" height="123" alt="image" src="https://github.com/user-attachments/assets/68ced232-bb2f-4755-baa7-6d45eb4a7dbf" />

---

## 🏁 Penutup
Dengan program ini, manajemen transfer pemain sepak bola dapat dilakukan dengan mudah melalui operasi CRUD berbasis **Java OOP**. 🚀  




