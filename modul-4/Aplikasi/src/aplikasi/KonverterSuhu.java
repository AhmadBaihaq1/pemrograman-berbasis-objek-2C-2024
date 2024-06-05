/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;
class KonverterSuhu extends KonverterSatuan {
    @Override
    double konversi(double nilai, String satuanDari, String satuanKe) {
        if (satuanDari.equals("C")) {
            if (satuanKe.equals("F")) {
                return (nilai * 9/5) + 32;
            } else if (satuanKe.equals("K")) {
                return nilai + 273.15;
            }
        } else if (satuanDari.equals("F")) {
            if (satuanKe.equals("C")) {
                return (nilai - 32) * 5/9;
            } else if (satuanKe.equals("K")) {
                return (nilai + 459.67) * 5/9;
            }
        } else if (satuanDari.equals("K")) {
            if (satuanKe.equals("C")) {
                return nilai - 273.15;
            } else if (satuanKe.equals("F")) {
                return (nilai * 9/5) - 459.67;
            }
        }
        return 0; // default return jika input tidak valid
    }

}
