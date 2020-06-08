package cn.qdas.core.bean;

public class BaseBean {
public static String ROWS = "rows";
	
	private int page = 1;
	private int rows = 20;
	private long totalRows = 0;
	private int all = 0;// 1:全部显示,0:分页
	private String sort;
	private String order;
	private String orderByClause;
	public int getAll() {
		return all;
	}

	public void setAll(int all) {
		this.all = all;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		if (this.getAll() > 0) {
			return 0;
		}
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public long getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(long totalRows) {
		this.totalRows = totalRows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}
	
}
