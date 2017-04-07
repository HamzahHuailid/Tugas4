public class Mobil {
    int Ban;
    String merk;
    
    //konstruktor
    public Mobil(){
        this.Ban=0;
        this.merk="Merk Mobil";
    }
    public Mobil(int p, String m){
        this.Ban = p;
        this.merk = m;
    }    
    public void setBan(int p){
        this.Ban = p;
    }
    public void setMerk(String m){
        this.merk = m;        
    }
    public int getBan(){
        return this.Ban;
    }
    public String getMerk(){
        return this.merk;
    }    
    public void melaju(){
        System.out.println("Mobil Melaju");        
    }
    public void berhenti(){
        System.out.println("Mobil Berhenti");        
    }
    public void bersuara(){
        System.out.println("Mobil Bersuara");        
    }
	public void tampilkan(){
	System.out.println("ini tampilan dari Kelas Mobil");
	}
}