package service.impl;

import javax.servlet.http.HttpSession;

import po.EUDataGridResult;
import po.Result;
/**
 *@Author: Xblue
 *@Description: 记录管理接口层
 *@Date: 0:30 2017/8/1
 */
public interface WorkRecordService {

	/**
	 * @Author: xiaojianyu
	 * @Method:  findWorkRecordList
	 * @Description: 管理员精准查找用户出勤记录
	 * @Date: 0:19 2017/8/1
	 * @Return: EUDataGridResult
	 * @Param:
	 */
	public EUDataGridResult findWorkRecordList(int page, int rows,String itemid,String bd,String ed,String type,String approve);
	/**
	 * @Author: xiaojianyu
	 * @Method: WorkRecordModify
	 * @Description: 管理员审批出勤
	 * @Date: 0:19 2017/8/1
	 * @Return: void
	 * @Param:
	 */
	public void WorkRecordModify(String sels,String isApprove);
	/**
	 * @Author: xiaojianyu
	 * @Method: WorkRecordCalculate
	 * @Description: 管理员统计用户出勤
	 * @Date: 0:18 2017/8/1
	 * @Return: Result
	 * @Param:
	 */
	public Result WorkRecordCalculate(String employid,String bdd,String edd);
	/**
	 * @Author: xiaojianyu
	 * @Method: findWorkRecordList
	 * @Description: 用户查询记录
	 * @Date: 0:17 2017/8/1
	 * @Return: EUDataGridResul
	 * @Param:
	 */
	public EUDataGridResult findWorkRecordList(int page,int rows,String username);
	/**
	 * @Author: xiaojianyu
	 * @Method: addwordrecord
	 * @Description: 用户申请
	 * @Date: 0:17 2017/8/1
	 * @Return: void
	 * @Param:
	 */
	public void addwordrecord(Long wno,String wDuration,String type,String dd,String wReason);
}
