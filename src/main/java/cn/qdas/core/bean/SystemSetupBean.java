/**
 * 
 */
package cn.qdas.core.bean;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author leo.Zhou 周钧
 * 2019年7月25日
 */
public class SystemSetupBean extends BaseBean{
	private String factoryName;
	private String factoryIconStr;
	private String productLineName;
	private String plTopPosition;
	private String plLeftPosition;
	private String pointTopPosition;
	private String pointLeftPosition;
	private MultipartFile factoryImg;
	private MultipartFile factoryIcon;
	private String workShopName;
	private String workShopDrawingStr;
	private MultipartFile workShopDrawing;
	public String getFactoryName() {
		return factoryName;
	}
	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}
	public String getProductLineName() {
		return productLineName;
	}
	public void setProductLineName(String productLineName) {
		this.productLineName = productLineName;
	}
	public String getPlTopPosition() {
		return plTopPosition;
	}
	public void setPlTopPosition(String plTopPosition) {
		this.plTopPosition = plTopPosition;
	}
	public String getPlLeftPosition() {
		return plLeftPosition;
	}
	public void setPlLeftPosition(String plLeftPosition) {
		this.plLeftPosition = plLeftPosition;
	}
	public String getPointTopPosition() {
		return pointTopPosition;
	}
	public void setPointTopPosition(String pointTopPosition) {
		this.pointTopPosition = pointTopPosition;
	}
	public String getPointLeftPosition() {
		return pointLeftPosition;
	}
	public void setPointLeftPosition(String pointLeftPosition) {
		this.pointLeftPosition = pointLeftPosition;
	}
	public MultipartFile getFactoryImg() {
		return factoryImg;
	}
	public void setFactoryImg(MultipartFile factoryImg) {
		this.factoryImg = factoryImg;
	}
	
	public MultipartFile getFactoryIcon() {
		return factoryIcon;
	}
	public void setFactoryIcon(MultipartFile factoryIcon) {
		this.factoryIcon = factoryIcon;
	}
	public String getFactoryIconStr() {
		return factoryIconStr;
	}
	public void setFactoryIconStr(String factoryIconStr) {
		this.factoryIconStr = factoryIconStr;
	}
	public String getWorkShopName() {
		return workShopName;
	}
	public void setWorkShopName(String workShopName) {
		this.workShopName = workShopName;
	}
	public String getWorkShopDrawingStr() {
		return workShopDrawingStr;
	}
	public void setWorkShopDrawingStr(String workShopDrawingStr) {
		this.workShopDrawingStr = workShopDrawingStr;
	}
	public MultipartFile getWorkShopDrawing() {
		return workShopDrawing;
	}
	public void setWorkShopDrawing(MultipartFile workShopDrawing) {
		this.workShopDrawing = workShopDrawing;
	}
	
	
}
