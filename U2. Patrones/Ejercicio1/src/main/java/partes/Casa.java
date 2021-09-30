package partes;

public class Casa {
	
	private double area;
	private Tejado tejado;
	private Pared paredN;
	private Pared paredE;
	private Pared paredS;
	private Pared paredW;
	
	public Casa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Casa(double area, Tejado tejado, Pared paredN, Pared paredE, Pared paredS, Pared paredW) {
		super();
		this.area = area;
		this.tejado = tejado;
		this.paredN = paredN;
		this.paredE = paredE;
		this.paredS = paredS;
		this.paredW = paredW;
	}
	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}
	/**
	 * @return the tejado
	 */
	public Tejado getTejado() {
		return tejado;
	}
	/**
	 * @param tejado the tejado to set
	 */
	public void setTejado(Tejado tejado) {
		this.tejado = tejado;
	}
	/**
	 * @return the paredN
	 */
	public Pared getParedN() {
		return paredN;
	}
	/**
	 * @param paredN the paredN to set
	 */
	public void setParedN(Pared paredN) {
		this.paredN = paredN;
	}
	/**
	 * @return the paredE
	 */
	public Pared getParedE() {
		return paredE;
	}
	/**
	 * @param paredE the paredE to set
	 */
	public void setParedE(Pared paredE) {
		this.paredE = paredE;
	}
	/**
	 * @return the paredS
	 */
	public Pared getParedS() {
		return paredS;
	}
	/**
	 * @param paredS the paredS to set
	 */
	public void setParedS(Pared paredS) {
		this.paredS = paredS;
	}
	/**
	 * @return the paredW
	 */
	public Pared getParedW() {
		return paredW;
	}
	/**
	 * @param paredW the paredW to set
	 */
	public void setParedW(Pared paredW) {
		this.paredW = paredW;
	}

}
