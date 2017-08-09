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