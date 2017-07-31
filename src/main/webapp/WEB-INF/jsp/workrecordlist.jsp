<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="departList">
</table>
<div id="a" class="easyui-window" title="查询结果" closed="true" style="width:300px;height:200px;padding:5px;"></div>
<div id="tb" style="padding:5px;height:auto">
	<div style="margin-bottom:5px">
			<span>员工编号:</span>
			<input id="employid" style="line-height:26px;border:1px solid #ccc">
			<span>起始日期:</span>
			<input id="bd1" type="text"  />
			<span>结束日期:</span>
			<input id="ed1" type="text"  />
			<a href="#" class="easyui-linkbutton" plain="true" onclick="docaculate()">出勤统计</a>
	</div>
	<div style="margin-bottom:5px">
		<a href="#" class="easyui-linkbutton" plain="true" onclick="doApprove()" >批准</a>
		<a href="#" class="easyui-linkbutton" plain="true" onclick="doDisApprove()">否批准</a>
	</div>
	<div>
			<span>员工编号:</span>
			<input id="itemid" style="line-height:26px;border:1px solid #ccc">
			<span>起始日期:</span>
			<input id="bd" type="text"  />
			<span>结束日期:</span>
			<input id="ed" type="text"  />
			<span>类型:</span>
			<input id="type" class="easyui-combobox" data-options="
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
				}]" style="line-height:26px;border:1px solid #ccc"/>
				<span>审批情况:</span>
				<input id="approve" class="easyui-combobox" data-options="
				valueField: 'label',
				textField: 'value',
				data: [{
					label: '2',
					value: '不批准'
				},{
					label: '0',
					value: '未批准'
				},{
					label: '1',
					value: '已批准'
				},{
					label: null,
					value: '全部'
				}]" style="line-height:26px;border:1px solid #ccc"/>
			<a href="#" class="easyui-linkbutton" plain="true" onclick="doSearch()">查询</a>
	</div>
</div>
<script>
	//初始化选择框
    function getSelectionsIds(){
    	var itemList = $("#departList");
    	var sels = itemList.datagrid("getSelections");
    	var wNos = [];
    	for(var i in sels){
    		wNos.push(sels[i].wId);//这一块是没有问题的
    	} 
    	return wNos;
	}
    //初始化列表
    $('#departList').datagrid({ 
    	pagination:true,//分页 非常关键 
    	singleSelect:false,//单选多选
    	collapsible:true,//折叠
    	url:'/listworkrecord',
    	toolbar:'#tb',//['#tb','#tb2']
    	method:'get',
    	pageSize:1,
    	title: '系统通知及员工出勤管理',  
        loadMsg:'数据加载中,请稍后……', 
    	pageList: [1, 2, 3, 4],
    	columns:[[{field:'ck',checkbox:true},
    	          {
  					field:'wId',title:'请假编号',width:60
  		 		  },
    	          {
					field:'wType',title:'请假类型',width:60,
					 formatter:  
                         function(value, row, index){  
                         if(value==0)  
                             return "加班";  
                         if(value==1)  
                             return "出差";  
                         if(value==2)  
                             return "请假";  
                         else   
                             return "<span style=\"color:red\" >未知</span>";  
                        },
		 		  },
    	          {
    				field:'wNo',title:'员工编号',width:60
    			  },
    			  {
      				field:'wApprove',title:'请假准许',width:60,
      				 formatter:  
                         function(value, row, index){  
                         if(value==0)  
                             return "未批准";  
                         if(value==1)  
                             return "已批准";  
                         if(value==2)  
                             return "不批准";  
                         else   
                             return "<span style=\"color:red\" >未知</span>";  
                        },
      			  },
      			  {
        			field:'wDuration',title:'请假时长',width:60
        		  },
    	          {	
    	        	field:'wDate',title:'请假日期',width:120, 
            		formatter:function(value,row,index){  
                	var unixTimestamp = new Date(value);  
                	return unixTimestamp.toLocaleDateString();  
               	  	}
    			  },
    			  {
      				field:'wReason',title:'请假原因',width:200
      			  }
  
    			  ]]
    })
    $("#bd").datebox({
			onSelect : function(mydate){
				var year = mydate.getFullYear(); 
				var month = mydate.getMonth() + 1;
				var date = mydate.getDate();
				$("#bd").datebox("setValue", year+"-"+month+"-"+date); 			
			}
	});
    $("#bd1").datebox({
		onSelect : function(mydate){
			var year = mydate.getFullYear(); 
			var month = mydate.getMonth() + 1;
			var date = mydate.getDate();
			$("#bd1").datebox("setValue", year+"-"+month+"-"+date); 			
		}
	});
    $("#ed1").datebox({
		onSelect : function(mydate){
			var year = mydate.getFullYear(); 
			var month = mydate.getMonth() + 1;
			var date = mydate.getDate();
			$("#ed1").datebox("setValue", year+"-"+month+"-"+date); 
		}
	});
    $("#ed").datebox({
		onSelect : function(mydate){
			var year = mydate.getFullYear(); 
			var month = mydate.getMonth() + 1;
			var date = mydate.getDate();
			$("#ed").datebox("setValue", year+"-"+month+"-"+date); 
		}
	});
    function doSearch(){
	$('#departList').datagrid('load',{
		itemid: $('#itemid').val(),
		productid: $('#productid').val(),
		type: $('#type').combobox("getValue"),
		approve:$('#approve').combobox("getValue"),
		bd:$("#bd").datebox("getValue"),
		ed:$("#ed").datebox("getValue")
	});}
    function docaculate(){
    	$.post("/calculate",
  			  {
    				employid:$('#employid').val(),
		    		bdd:$("#bd1").datebox("getValue"),
		    		edd:$("#ed1").datebox("getValue")
  			  }, function(data,status){
  					var obj = eval('(' + data + ')'); //简直要崩溃 以后就这么用就行了
  					 if(obj.data=="employid"){
   						$.messager.alert("警告框","查无此工号或者工号不能为空","warning",function(){});	
   						return;
   				 	 }
  					if(obj.data=="bdd"){
   						$.messager.alert("警告框","不能没有起始日期","warning",function(){});	
   						return;
   				 	 }
  					if(obj.data=="edd"){
   						$.messager.alert("警告框","不能没有结束日期","warning",function(){});	
   						return;
   				 	 }
  				  	if(obj.date==null){
				        	$.messager.alert("警告框","提交成功","warning",function(){
				        		$('#a').window('open');
				        		document.getElementById("a").innerHTML = "<center>"
				        		+"工号："+obj.wno+"<br/>"
				        		+"开始日期："+ obj.bdate+"<br/>"
				        		+"结束日期："+obj.edate+"<br/>"
				        		+"加班累计："+obj.date1+"<br/>"
				        		+"出差累计："+obj.date2+"<br/>"
				        		+"请假累计："+obj.date3+"<br/>"
				        		+"<center/>"; 
							});
  				  		}
  			  });
    }
    function doApprove(){
    	$.messager.confirm("确认框","你确认要批准?",function(r){
			if(r){
			    	 $.post("/isapprove",
			    			  {
			    			    sels:getSelectionsIds()+"",
			    			    isApprove:"approve"
			    			  }, function(data,status){
			    				  if(data=="ok"){
							        	$.messager.alert("警告框","提交成功","warning",function(){
										});
					        		}
			    			  });
			}});
    }
    function doDisApprove(){
    	$.messager.confirm("确认框","你确认要否批准?",function(r){
    	if(r){
		   	 $.post("/isapprove",
		   			  {
					   		sels:getSelectionsIds()+"",
						    isApprove:"disapprove"
		   			  }, function(data,status){
				   				if(data=="ok"){
						        	$.messager.alert("警告框","提交成功","warning",function(){
									});
				        	}
		   			  });
    	}});
   }
</script>