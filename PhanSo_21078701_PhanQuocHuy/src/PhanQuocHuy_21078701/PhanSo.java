package PhanQuocHuy_21078701;

public class PhanSo {
	private int tuSo;
	private int mauSo;
	
	public int getTuSo() {
		return tuSo;
	}
	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}
	public int getMauSo() {
		return mauSo;
	}
	public void setMauso(int mauso) throws Exception {
		if(mauSo != 0) {
			this.mauSo = mauso;
		}else {
			throw new Exception ("Loi");
		}
	}
	
	public PhanSo() {}
	
	public PhanSo(int tuSo, int mauSo) throws Exception{
		if(mauSo == 0) {
			throw new Exception("Mau so khong the bang 0");
		}
		this.tuSo = tuSo;
		this.mauSo = mauSo;
		toiGian();
	}
    private int timUSCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private void toiGian() {
        int uscln = timUSCLN(tuSo, mauSo);
        this.tuSo /= uscln;
        this.mauSo /= uscln;
    }

    public PhanSo cong(PhanSo ps) throws Exception {
        int tu = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau);
    }

    public PhanSo tru(PhanSo ps) throws Exception {
        int tu = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau);
    }

    public PhanSo nhan(PhanSo ps) throws Exception {
        int tu = this.tuSo * ps.tuSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau);
    }

    public PhanSo chia(PhanSo ps) throws Exception {
        if (ps.tuSo == 0) {
            throw new Exception("Không thể chia cho phân số có tử số bằng 0");
        }
        int tu = this.tuSo * ps.mauSo;
        int mau = this.mauSo * ps.tuSo;
        return new PhanSo(tu, mau);
    }
	
	@Override
	public String toString() {
		String s = "";
		s = s + String.format("%d/%d",getTuSo(),getMauSo());
		return s;
	}



}
