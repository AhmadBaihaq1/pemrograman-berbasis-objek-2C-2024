/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;

class KonverterWaktu extends KonverterSatuan {
    @Override
    double konversi(double nilai, String satuanDari, String satuanKe) {
        if (satuanDari.equals("detik")) {
            if (satuanKe.equals("menit")) {
                return nilai / 60;
            } else if (satuanKe.equals("jam")) {
                return nilai / 3600;
            }
        } else if (satuanDari.equals("menit")) {
            if (satuanKe.equals("detik")) {
                return nilai * 60;
            } else if (satuanKe.equals("jam")) {
                return nilai / 60;
            }
        } else if (satuanDari.equals("jam")) {
            if (satuanKe.equals("detik")) {
                return nilai * 3600;
            } else if (satuanKe.equals("menit")) {
                return nilai * 60;
            }
        }
        return 0; // default return jika input tidak valid
    }
}
