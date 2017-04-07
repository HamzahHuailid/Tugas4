public class Sedan extends Mobil{
	String nama;
	public void tampilkan(){
	System.out.println("ini tampilan dari Kelas Sedan");
	}
	
	public void Sedan(){
		super.tampilkan();
		System.out.println("===========================");
		super.melaju();
		super.berhenti();
		super.bersuara();
		System.out.println("===========================");
	}
	public static void main (String[] args){
		Sedan pgl = new Sedan();
		pgl.Sedan();
		
		Mobil mobil1 = new Mobil();
        mobil1.setBan(4);
        mobil1.setMerk("JAZZ");        
        System.out.println("Jumlah Ban  = "+mobil1.getBan());
        System.out.println("Merk Mobil  = "+mobil1.getMerk());
	}
}