import javax.swing.JFrame;
import java.awt.*;

public class Background extends JFrame{
	Color orange = new Color(230, 126, 34); 

	public Background(){
		init();
	}
	
	public void init() {
		setSize(500, 500);
		setBackground(Color.BLACK);
		repaint();
	}
	
//	public int shuffle(int[] nums) {
//		int k = 0;
//		int[] retval = new int[nums.length];
//		int L = myRandom(k, nums.length);
//		retval[k] = nums[L];
//		nums[L] = nums[k];
//		k++;
//	}
	
	public void paint(Graphics gr){
		//fence
		gr.setColor(Color.orange);
			//12x12 fixed fence
			int width = 30;
			int height = 30;
			for (int i = 0; i < 12; i++){
				//row
				gr.drawRect(50+i*30, 50, width, height);
				gr.drawRect(50+i*30, 11*30+50, width, height);
				//column
				gr.drawRect(50, 50+i*30, width, height);
				gr.drawRect(11*30+50, 50+i*30, width, height);
			}
			
			//create 20 random fence on the interior
			int ranx[] = new int[20];
			int rany[] = new int[20];
			for (int i = 0; i < 20; i++){
				ranx[i] = (int)(Math.random()*11) + 1;
				rany[i] = (int)(Math.random()*11) + 1;
			}
			//check to see if two fence has same location, and change it
//			int start;
//			ArrayList<Integer> storex = new ArrayList<Integer>();
//			for (int i = 0; i < 20; i++){
//				start = ranx[i];
//				for (int k = 0; k < 12; k++){
//					if (start == ranx[k]){
//						storex.add(k);
//					}
//				}
//			}
			//draw 20 random fence on the interior
			for (int i = 0; i < 20; i++){
				gr.drawRect(50+ranx[i]*30, 50+rany[i]*30, width, height);
			}
			//create 12 random mhos 
			int mhox[] = new int[12];
			int mhoy[] = new int[12];
			for (int i = 0; i < 12; i++){
				for(int j:ranx) {
					if((int)(Math.random()*10) + 1 != j) {
						mhox[i] = (int)(Math.random()*10) + 1;
					}
					mhoy[i] = (int)(Math.random()*10) + 1;
				}
			}
			//draw mho
			for (int i = 0; i < 12; i++){
				gr.fillOval(50+mhox[i]*30, 50+mhoy[i]*30, width, height);
			}

	}
}

