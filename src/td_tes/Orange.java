package td_tes;

public class Orange {
	private double prix;
	private String origine;
	
	public Orange(double prix, String origine) throws Exception{
		if(prix<0) {
			throw new Exception("Le prix est négatif!");
		}
		this.prix = prix;
		this.origine = origine;
	}

	public double getPrix() {
		return prix;
	}

	public String getOrigine() {
		return origine;
	}

	@Override
	public String toString() {
		return "Orange [prix=" + prix + ", origine=" + origine + "]";
	}	
	
	public boolean equals (Orange o) {
		if(o.getOrigine()!=this.getOrigine()) {
			return false;
		}
		if(o.getPrix()!=this.getPrix()) {
			return false;
		}
		return true;
	}
	
}
