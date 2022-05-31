import java.io.Serializable;
class Shape implements Serializable{
	int L ;
	int W; 
	int H;
	Shape(int L, int W, int H){
		this.L = L;
		this.H = H;
		this.W = W;
	}
}