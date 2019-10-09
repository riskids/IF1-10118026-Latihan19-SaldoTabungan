/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118026.latihan19.saldotabungan;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deskripsi Program	: Menghitung bunga saldo tabungan
 */
public class IF110118026Latihan19SaldoTabungan {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		double saldoAwal = 2500000;
		double bunga = 0.15;
		double saldoSekarang = saldoAwal + (saldoAwal * bunga);
		int lamaBulan = 6;
                    DecimalFormat Idr = (DecimalFormat) DecimalFormat.getCurrencyInstance();
                    DecimalFormatSymbols RP = new DecimalFormatSymbols();
                    RP.setCurrencySymbol("Rp. ");
                    RP.setMonetaryDecimalSeparator(',');
                    RP.setGroupingSeparator('.');
                    Idr.setDecimalFormatSymbols(RP);
                        for (int i = 1; i <= lamaBulan; i++, saldoSekarang+=(saldoSekarang * bunga)){
                            System.out.printf("Saldo di bulan ke-%d %s\n", i, Idr.format((int) saldoSekarang).replaceAll(",00", ""));

                        }
	}
	
}
