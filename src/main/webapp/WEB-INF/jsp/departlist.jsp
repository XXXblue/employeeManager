<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--初始化模块js--%>
<script src="../js/departlistbegin.js"></script>
<%--初始化模块界面--%>
<table class="easyui-datagrid" id="adepartList" title="部门列表"
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'/listdepartment',method:'get',pageSize:10,toolbar:toolbar">
    <thead>
    <tr>
        <th data-options="field:'ck',checkbox:true"></th>
        <th data-options="field:'dNo',width:60">部门编号</th>
        <th data-options="field:'dName',width:100">部门名称</th>
        <th data-options="field:'dNote',width:200">部门备注</th>
    </tr>
    </thead>
</table>

<%--增加部门模块--%>
<div id="win" class="easyui-window" title="修改部门" closed="true"
     style="width:600px;height:400px;padding:5px;position: relative">

    <form id="ff" method="post" style="position: absolute;padding-left: 120px">
        <label><h1 style="text-align:center">修改部门</h1></label>
        <p>
            <label>部门编号：</label><input class="easyui-numberbox" name="dNo"
                                       style="width: 280px;display:none;" data-options="required:true">
        <p>
            <label>部门名称：</label><input class="easyui-textbox" name="dName" data-options="required:true"
                                       style="width: 280px;">
        <p>
            <label>部门备注：</label><input class="easyui-textbox" name="dNote"
                                       data-options="multiline:true,validType:'length[0,150]'"
                                       style="height:60px;width: 280px;">
        <p>
            <a id="btn_edit" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'"
               style="width: 280px;margin-left: 60px">修改</a>
        <p>
        <%--添加模块的js文件--%>
        <script src="../js/departlistadd.js"><script/>
    </form>
</div>

<%--修改部门模块--%>
<div id="win2" class="easyui-window" title="修改部门" closed="true"
     style="width:600px;height:400px;padding:5px;position: relative">
    <form id="adddepart" method="post" style="position: absolute;padding-left: 120px">
        <label><h1 style="text-align:center">新增部门</h1></label>
        <label>部门名称：</label><input id="ddName" class="easyui-textbox" name="dName" data-options="required:true"
                                   style="width: 280px;">
        <p>
            <label>部门编号：</label><input id="ddNo" class="easyui-numberbox" name="dNo"
                                       style="width: 280px;height: 20px"
                                       data-options="required:true">
        <p>
            <label>部门备注：</label><input id="ddNote" class="easyui-textbox" name="dNote"
                                       data-options="multiline:true,validType:'length[0,150]'"
                                       style="height:60px;width: 280px;">
        <p>

            <a id="btn_add"
               href="#"
               class="easyui-linkbutton"
               data - options="iconCls:'icon-add'"
               style="width: 280px; margin-left: 60px">提交</a>
        <p>
    </form>
    <%--编辑部门的js--%>
    <script src="../js/departlistedit.js"></script>
</div>
