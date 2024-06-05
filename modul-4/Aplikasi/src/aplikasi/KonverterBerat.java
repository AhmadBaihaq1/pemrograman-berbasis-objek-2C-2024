/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;

class KonverterBerat extends KonverterSatuan {
        @Override
        double konversi(double nilai, String satuanDari, String satuanKe) {
            if (satuanDari.equals("kg")) {
                if (satuanKe.equals("g")) {
                    return nilai * 1000;
                } else if (satuanKe.equals("ton")) {
                    return nilai / 1000;
                }
            } else if (satuanDari.equals("g")) {
                if (satuanKe.equals("kg")) {
                    return nilai / 1000;
                } else if (satuanKe.equals("ton")) {
                    return nilai / 1000000;
                }
            } else if (satuanDari.equals("ton")) {
                if (satuanKe.equals("kg")) {
                    return nilai * 1000;
                } else if (satuanKe.equals("g")) {
                    return nilai * 1000000;
                }
            }
            return 0; // default return jika input tidak valid
        }
    }
