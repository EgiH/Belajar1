public class HitungLuasLingkaran {  

	public double  luas;
	public static void main(String[] args) {
	
		System.out.print("Masukkan jari : ");

	        String jari=System.console().readLine();
		System.out.println("Luasnya adalah " +
	        Math.pow(Double.parseDouble(jari), 2)) * 3.14);

	 

	}

	}