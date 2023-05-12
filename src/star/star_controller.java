package star;

public class star_controller {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		star_view view = new star_view();
		star_model model = new star_model();
		
		view.selectStar();
		int starstep = model.setScanner();
		String star = model.makeStar(starstep);
		view.displayStar(String.format("%s",star));
	}

}
