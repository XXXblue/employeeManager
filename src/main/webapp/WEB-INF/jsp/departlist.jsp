<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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

<div id="win" class="easyui-window" title="修改部门" closed="true" style="width:600px;height:400px;padding:5px;">
    <center>
        <form id="ff" method="post">
            <label><h1>修改部门</h1></label>
            <p>
                <label>部门编号：</label><input class="easyui-numberbox" type="text" name="dNo"
                                           style="width: 280px;display:none;" data-options="required:true">
            <p>
                <label>部门名称：</label><input class="easyui-textbox" type="text" name="dName" data-options="required:true"
                                           style="width: 280px;">
            <p>
                <label>部门备注：</label><input class="easyui-textbox" name="dNote"
                                           data-options="multiline:true,validType:'length[0,150]'"
                                           style="height:60px;width: 280px;">
            <p>
                <a id="btn_edit" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'"
                   style="width: 280px;margin-left: 60px" >修改</a>
            <p>
            <script type="text/javascript" charset="utf-8">

                $("#btn_edit").click(function () {
                    $.messager.confirm("确认框", "你确认要修改?", function (value) {
                        if (value) {

                            $('#ff').form('submit', {
                                url: "/editdepartment/",
                                onSubmit: function () {
                                    // do some check
                                    // return false to prevent submit;
                                },
                                success: function (data) {
                                    if (data == "ok") {
                                        $.messager.alert("警告框", "修改成功", "warning", function () {
                                            $('#ff').form('clear');
                                            $('#win').window('close')
                                        });
                                    } else {
                                        $.messager.alert("警告框", data, "warning", function () {
                                        });
                                    }
                                }
                            });
                        } else {
                            $('#win').window('close');
                        }
                    });
                });
            </script>
            <script>
                $(function () {
                    $("#dNo").attr('readonly', true);
                })
            </script>
        </form>
    </center>
</div>
<div id="win2" class="easyui-window" title="修改部门" closed="true" style="width:600px;height:400px;padding:5px;">
    <center>
        <form id="adddepart" method="post">
            <label><h1>新增部门</h1></label>
            <label>部门名称：</label><input id="ddName" class="easyui-textbox"  name="dName" data-options="required:true"
                                       style="width: 280px;">
            <p>
                <%--<label>部门编号：</label><input id="dNo" class="easyui-textbox"  name="dNo" data-options="required:true"--%>
                                           <%--style="width: 280px;">--%>
                <label>部门编号：</label><input id="ddNo" class="easyui-numberbox"  name="dNo" style="width: 280px;height: 20px"
                                           data-options="required:true" >
            <p>
                <label>部门备注：</label><input id="ddNote" class="easyui-textbox" name="dNote"
                                           data-options="multiline:true,validType:'length[0,150]'"
                                           style="height:60px;width: 280px;" >
            <p>

                <a id="btn_add"
                        href="#"
                        class="easyui-linkbutton"
                        data - options="iconCls:'icon-add'"
                        style="width: 280px; margin-left: 60px">提交</a>
            <p>
        </form>
    </center>
    <script
            type="text/javascript"
            charset="utf-8">
        $("#btn_add").click(function () {
            $.messager.confirm("确认框", "你确认要提交?", function (r) {
                if (r) {
                    $('#adddepart').form('submit', {
                        url: "/adddepartment",
                        onSubmit: function () {
                            var dName=$("#ddName").val();
                            var dNo=$("#ddNo").numberbox("getValue");
                            var dNote=$("#ddNote").val();
                            if(dName==""||dName==undefined||dNo==""||dNo==undefined||dNote==""||dNote==undefined){
                                $.messager.alert("警告框", "提交出错", "warning")
                                return false;
                            }
                            // do some check
                            // return false to prevent submit;
                        },
                        success: function (data) {
                            if (data == "ok") {
                                $.messager.alert("警告框", "提交成功", "warning", function () {
                                    $('#adddepart').form('clear');
                                    $('#win2').window('close')
                                });
                            } else {
                                $.messager.alert("警告框", data, "warning", function () {
                                });
                            }
                        }
                    });
                }
            });
        });
    </script>
</div>

<script>
    //初始化选择框
    function getSelectionsIds() {
        var itemList = $("#adepartList");
        var sels = itemList.datagrid("getSelections");
        var dNos = [];
        for (var i in sels) {
            dNos.push(sels[i].dNo);
        }
        return dNos;
    }

    //初始化编辑栏

    var toolbar = [{
        text: '新增',
        iconCls: 'icon-add',
        handler: function () {
            $('#win2').window('open')
        }
    }, {
        text: '编辑',
        iconCls: 'icon-edit',
        handler: function () {
            var dNos = getSelectionsIds();
            if (dNos.length == 0) {
                $.messager.alert('提示', '必须选择一个部门才能编辑!');
                return;
            }
            if (dNos.length > 1) {
                $.messager.alert('提示', '只能选择一个部门!');
                return;
            }
            $('#win').window('open');
            var result = $("#adepartList").datagrid("getSelections")[0];
            $('#ff').form('load', {
                dName: result.dName,
                dNo: result.dNo,
                dNote: result.dNote
            });
        }
    }];
</script>