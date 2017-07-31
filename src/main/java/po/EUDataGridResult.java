package po;

import java.util.List;
//返回的是json格式  使用easyui datagrid要指定total和rows(list) 返回
public class EUDataGridResult {
	private long total;
	private List<?>rows;//问号任意类型
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total; 
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}	
}