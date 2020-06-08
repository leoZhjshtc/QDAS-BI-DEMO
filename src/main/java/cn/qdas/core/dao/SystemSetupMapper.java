/**
 * 
 */
package cn.qdas.core.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.qdas.core.bean.SystemSetupBean;

/**
 * @author leo.Zhou 周钧
 * 2019年7月25日
 */
public interface SystemSetupMapper {
	List getProdectLineByFactory(SystemSetupBean ssb);
	void addNewProductLine(SystemSetupBean ssb);
	void delProductLine(SystemSetupBean ssb);
	void addNewFactory(@Param("factoryName") String factoryName, @Param("factoryDrawing") String factoryDrawing);
	List getFactoryData();
	void delFactory(SystemSetupBean ssb);
	void delFactoryProductLine(SystemSetupBean ssb);
	
	List getProductLineCombobox();
	void addWorkShop(SystemSetupBean ssb);
	List getWorkShop();
	void delProductLineByWorkShop(SystemSetupBean ssb);
	void delWorkShop(SystemSetupBean ssb);
	Map selectWorkShopByFactory(SystemSetupBean ssb);
	List getFactoryAndWorkShop();
	List getAllCheckTypeMapper();
}
