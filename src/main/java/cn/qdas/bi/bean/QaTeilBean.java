/**
 * 
 */
package cn.qdas.bi.bean;

import java.util.List;

/**
 * @author leo.Zhou 周钧
 * 2019年11月8日
 */
public class QaTeilBean {
	private String teteil;
	private String teteilnr;
	private String tebezeich;
	private String tepreinrbez;
	private String tekostst;
	private String tepreinrnr;
	private String teauftraggbbez;
	private String teauftragstr;
	private int dlCount;
	private int merkmalCount;
	private List<QaMerkmalBean> merkmalList;
	
	public String getTeauftraggbbez() {
		return teauftraggbbez;
	}
	public void setTeauftraggbbez(String teauftraggbbez) {
		this.teauftraggbbez = teauftraggbbez;
	}
	public String getTeauftragstr() {
		return teauftragstr;
	}
	public void setTeauftragstr(String teauftragstr) {
		this.teauftragstr = teauftragstr;
	}
	public String getTepreinrnr() {
		return tepreinrnr;
	}
	public void setTepreinrnr(String tepreinrnr) {
		this.tepreinrnr = tepreinrnr;
	}
	public String getTeteil() {
		return teteil;
	}
	public void setTeteil(String teteil) {
		this.teteil = teteil;
	}
	public String getTeteilnr() {
		return teteilnr;
	}
	public void setTeteilnr(String teteilnr) {
		this.teteilnr = teteilnr;
	}
	public String getTebezeich() {
		return tebezeich;
	}
	public void setTebezeich(String tebezeich) {
		this.tebezeich = tebezeich;
	}
	public String getTepreinrbez() {
		return tepreinrbez;
	}
	public void setTepreinrbez(String tepreinrbez) {
		this.tepreinrbez = tepreinrbez;
	}
	public String getTekostst() {
		return tekostst;
	}
	public void setTekostst(String tekostst) {
		this.tekostst = tekostst;
	}
	public List<QaMerkmalBean> getMerkmalList() {
		return merkmalList;
	}
	public void setMerkmalList(List<QaMerkmalBean> merkmalList) {
		this.merkmalList = merkmalList;
	}
	public int getDlCount() {
		return dlCount;
	}
	public void setDlCount(int dlCount) {
		this.dlCount = dlCount;
	}
	public int getMerkmalCount() {
		return merkmalCount;
	}
	public void setMerkmalCount(int merkmalCount) {
		this.merkmalCount = merkmalCount;
	}
	
}
