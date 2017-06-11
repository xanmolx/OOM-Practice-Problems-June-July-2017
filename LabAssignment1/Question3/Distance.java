class Distance{
	public int feet;
	public int inches;

	public Distance(int f, int i){			
		feet = f;
		inches = i;
	}

	Distance func (Distance aa, Distance bb){		
		int inc, fee;
		inc = aa.inches + bb.inches;
		fee = inc / 12;
		inc = inc % 12;
		fee = fee + aa.feet + bb.feet;
		Distance cc = new Distance (fee, inc);
		return cc;
	}
}
