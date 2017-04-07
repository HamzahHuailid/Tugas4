public class Minibus extends Mobil{
	String nama;
	public void tampilkan(){
	System.out.println("ini tampilan dari Kelas Minibus");
	}
	
	public void Mobil(){
		tampilkan();
		super.tampilkan();
		System.out.println("===========================");
		super.melaju();
		super.berhenti();
		super.bersuara();
		System.out.println("===========================");
	}
	public static void main (String[] args){
		Minibus a = new Minibus();
		a.Mobil();
		
		Mobil mobil1 = new Mobil();
        mobil1.setBan(4);
        mobil1.setMerk("ELF");        
        System.out.println("Jumlah Ban  = "+mobil1.getBan());
        System.out.println("Merk mobil  = "+mobil1.getMerk());
	}
}