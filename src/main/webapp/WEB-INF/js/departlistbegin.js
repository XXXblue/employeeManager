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