$("#btn_add").click(function () {
    $.messager.confirm("确认框", "你确认要提交?", function (r) {
        if (r) {
            $('#adddepart').form('submit', {
                url: "/adddepartment",
                onSubmit: function () {
                    var dName = $("#ddName").val();
                    var dNo = $("#ddNo").numberbox("getValue");
                    var dNote = $("#ddNote").val();
                    if (dName == "" || dName == undefined || dNo == "" || dNo == undefined || dNote == "" || dNote == undefined) {
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