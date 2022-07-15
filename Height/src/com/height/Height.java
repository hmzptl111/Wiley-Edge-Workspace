package com.height;

public class Height {
	int ft, in;
	
	public Height() {
		// not necessary as these values are initialized as 0 anyway, but for the sake of it...
		this.ft = 0;
		this.in = 0;
	}

	public Height(int ft, int in) {
		this.ft = ft;
		this.in = in;
	}

	public int getFt() {
		return ft;
	}

//	public void setFt(int ft) {
//		this.ft = ft;
//	}

	public int getIn() {
		return in;
	}

//	public void setIn(int in) {
//		this.in = in;
//	}
	
	public Height addHeights(Height h2) {
//		Height h3 = new Height();
//		h3.ft = this.ft + h2.ft;
//		h3.in = this.in + h2.in;
		
		Height h3 = new Height(this.ft + h2.ft, this.in + h2.in);
		return h3;
	}
}
