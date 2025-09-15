# ⚽ Post Test 2 - PBO  
## Manajemen Transfer Pemain Sepak Bola (CRUD dengan Multi-Class & Packages)

---

## 👤 Data Diri  
- **Nama** : Husaini Iyastama H  
- **NIM** : 2409116038  
- **Kelas** : A  

---

## 📖 Deskripsi Singkat  
Program ini adalah pengembangan dari Post Test 1 dengan menerapkan:  
- **Minimal 3 Class** (`Transfer`, `TransferService`, `MainApp`)  
- **Minimal 3 Properties** (namaPemain, asalTim, klubTujuan, biayaTransfer)  
- **Constructor** di `Transfer`  
- **Access Modifier** (`private` + getter/setter)  
- **Packages**:  
  - `model` → menyimpan class `Transfer` (struktur data)  
  - `service` → menyimpan class `TransferService` (logika CRUD + search)  
  - `main` → menyimpan class `MainApp` (menu user)  

---

## 🏛️ Struktur Packages (MVC)
- **Model (M)** → `Transfer.java` (atribut pemain, constructor, getter & setter)  
- **View (V)** → menu di `MainApp.java`  
- **Controller (C)** → `TransferService.java` (CRUD + search)  

---

## 🔄 Alur Program
1. User memilih menu dari `MainApp`.  
2. Program memanggil method CRUD di `TransferService`.  
3. Data pemain disimpan dalam `ArrayList<Transfer>`.  
4. Program berjalan terus dengan perulangan sampai user memilih keluar.  
5. Fitur tambahan: **validasi input** & **pencarian data pemain (search)**.  

---

## 🖼️ Contoh Output  

### Tambah Data
