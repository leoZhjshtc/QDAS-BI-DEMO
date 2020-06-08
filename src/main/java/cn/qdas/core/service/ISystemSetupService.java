/**
 * 
 */
package cn.qdas.core.service;

import java.util.List;
import java.util.Map;

import cn.qdas.core.bean.SystemSetupBean;
import cn.qdas.core.db.DataSource;

/**
 * @author leo.Zhou 周钧
 * 2019年7月25日
 */
public interface ISystemSetupService {
	@DataSource("sqliteDataSource")
	List getProdectLineByFactory(SystemSetupBean ssb);
	@DataSource("sqliteDataSource")
	Map addNewProductLine(SystemSetupBean ssb);
	@DataSource("sqliteDataSource")
	void delProductLine(SystemSetupBean ssb);
	@DataSource("sqliteDataSource")
	void addNewFactory(String factoryName, String factoryDrawing);
	@DataSource("sqliteDataSource")
	List getFactoryData();
	@DataSource("sqliteDataSource")
	List getMenuData(String path);
	@DataSource("sqliteDataSource")
	Map delFactory(SystemSetupBean ssb, String path);
	
	List getProductLineCombobox();
	@DataSource("sqliteDataSource")
	void addNewWorkShop(SystemSetupBean ssb, String filename);
	@DataSource("sqliteDataSource")
	List getWorkShop(); 
	@DataSource("sqliteDataSource")
	void delWorkShop(SystemSetupBean ssb, String path)throws Exception;
	@DataSource("sqliteDataSource")
	List getFactoryAndWorShop();

	List getAllCheckTypeService();
}
