

public class Formula {
	
	public static double calculaHombre (Usuario usuario)
	{
		double TBMHombre = 0;
			
			TBMHombre = (10 * usuario.getPeso() + (6.25 * usuario.getAltura()) - (5 * usuario.getEdad())+ 5);
		
		return TBMHombre;
	}
	public static double calculaMujer (Usuario usuario)
	{
		double TBMMujer = 0;
			
			TBMMujer = (10 * usuario.getPeso() + (6.25 * usuario.getAltura()) - (5 * usuario.getEdad()) - 161);
		
		return TBMMujer;
	}
}
