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

