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
![Tambah Transfer](https://github.com/user-attachments/assets/3b1a0a64-41cc-4d46-aace-fa2ba1abcd83)

### Lihat Transfer
![Lihat Transfer](https://github.com/user-attachments/assets/c55ab3aa-08a5-44f3-938d-45f3a37e1bd9)

### Cari Transfer
![Cari Transfer](https://github.com/user-attachments/assets/83220a53-cb68-45ee-8e77-fae25d0efaa2)

### Hapus Transfer
![Hapus Transfer](https://github.com/user-attachments/assets/f561b49f-1974-471c-ac46-1b3ba135713b)

### Update Transfer
![Update Transfer](https://github.com/user-attachments/assets/008bdc92-25a9-4617-93a8-80197c9d7996)

---

## 🏁 Penutup
Dengan program ini, manajemen transfer pemain sepak bola dapat dilakukan dengan mudah melalui operasi CRUD berbasis **Java OOP**. 🚀  




