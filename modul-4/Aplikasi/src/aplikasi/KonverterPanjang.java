/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;

class KonverterPanjang extends KonverterSatuan {
    @Override
    double konversi(double nilai, String satuanDari, String satuanKe) {
        if (satuanDari.equals("m")) {
            if (satuanKe.equals("cm")) {
                return nilai * 100;
            } else if (satuanKe.equals("km")) {
                return nilai / 1000;
            }
        } else if (satuanDari.equals("cm")) {
            if (satuanKe.equals("m")) {
                return nilai / 100;
            } else if (satuanKe.equals("km")) {
                return nilai / 100000;
            }
        } else if (satuanDari.equals("km")) {
            if (satuanKe.equals("m")) {
                return nilai * 1000;
            } else if (satuanKe.equals("cm")) {
                return nilai * 100000;
            }
        }
        return 0; // default return jika input tidak valid
    }

}
