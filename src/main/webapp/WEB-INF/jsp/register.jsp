<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="win2" class="easyui-window" title="申请" style="width:600px;height:400px;padding:5px;">
		<center>
<form id="adddepart" method="post"> 
<label><h1>申请出勤</h1></label> 
<label>申请日期：</label><input id="dd" type="text" style="width: 280px;"name="dd" data-options="required:true" /><P>
<label>时长：</label><input class="easyui-numberbox" type="text" name="wDuration" style="width: 280px;" data-options="required:true" ><p>
<span>类型:</span>
			<input id="type" name="type" class="easyui-combobox" data-options="
				valueField: 'label',
				textField: 'value',
				data: [{
					label: '2',
					value: '请假'
				},{
					label: '0',
					value: '加班'
				},{
					label: '1',
					value: '出差'
				}]" style="line-height:280px;border:1px solid #ccc"/><p>
<label>原因：</label><input class="easyui-textbox" name="wReason" 
						data-options="multiline:true,validType:'length[0,150]'" style="height:60px;width: 280px;"></input><p>
	</script>
	<a 
		id="btn_add" 
		href="#" 
		class="easyui-linkbutton" 
		data-options="iconCls:'icon-add'"
		style="width: 280px;">提交</a><p>
		<div id="win"></div>  
 </form> 
 </center>
	<script type="text/javascript" charset="utf-8" >
		$("#dd").datebox({
			onSelect : function(mydate){
				var year = mydate.getFullYear(); 
				var month = mydate.getMonth() + 1;
				var date = mydate.getDate();
				$("#dd").datebox("setValue", year+"-"+month+"-"+date); 
			}
		});
		$("#btn_add").click(function(){
			$.messager.confirm("确认框","你确认要提交?",function(r){
				if(r){
				$('#adddepart').form('submit', {    
				    url:"/addworkrecord",    
				    onSubmit: function(){    
				        // do some check    
				        // return false to prevent submit;    
				    },    
				    success:function(data){    
				        if(data=="ok"){
				        	$.messager.alert("警告框","提交成功","warning",function(){
				        		$('#adddepart').form('clear');
				        		$('#win2').window('close')
							});
				        }else{
					        $.messager.alert("警告框",data,"warning",function(){
							});
				  		}
				    }    
				});
				}
			});	  
		});
</script>
</div>