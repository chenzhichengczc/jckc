$(function () {

    checkName();
    checkPhone();
    checkEmail();

    $(".mu-send-msg-btn").on("click",function () {
        checkVal();
        checkMessage();
    });
});

var check = true;

var checkName = function () {
    var flag = false;
    var pattern = /^[\u4e00-\u9fa5A-Za-z]+(·[\u4e00-\u9fa5A-Za-z]+)*$/;
    var element = $("#name");
    $("#name").on("blur",function () {
        if(element.val() != ''){
            if(!pattern.test(element.val())){
                $("#nameError").html("用户名格式错误");
                $("#nameError").css({color:"#ff0011"});
                flag = false;
            }
        }else{
            $("#nameError").html("");
        }
    })
    $("#name").on("focus",function () {
        if(!flag){
            $("#nameError").text() == '' ? true : $("#nameError").html("");
            flag = true;
        }
    })
}

var checkEmail = function () {
    var flag = false;
    var pattern = /^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
    var element = $("#email");
    $("#email").on("blur",function () {
        if(element.val() != ''){
            if(!pattern.test(element.val())){
                $("#emailError").html("邮箱格式错误");
                $("#emailError").css({color:"#ff0011"});
                flag = false;
            }
        }else{
            //element.css({"border":"block","border-bottom":"#cccccc 1px solid"});
            $("#emailError").html("");
        }
    })
    $("#email").on("focus",function () {
        if(!flag){
            $("#emailError").text() == '' ? true : $("#emailError").html("");
            flag = true;
        }
    })
}
var checkPhone = function () {
    var flag = false;
    var pattern = /^(\(\d{3,4}\)|\d{3,4}-|\s)?\d{7,8}$|^1[3|4|5|7|8][0-9]{9}$/;
    var element = $("#phone");
    $("#phone").on("blur",function () {
        if(element.val() != ''){
            if(!pattern.test(element.val())){
                $("#phoneError").html("手机号码格式错误");
                $("#phoneError").css({color:"#ff0011"});
                flag = false;
            }
        }else{
            //element.css({"border":"block","border-bottom":"#cccccc 1px solid"});
            $("#phoneError").html("");
        }
    })
    $("#phone").on("focus",function () {
        if(!flag){
            $("#phoneError").text() == '' ? true : $("#phoneError").html("");
            flag = true;
        }
    })
}

var checkMessage = function () {
    var element = $("#message").val();
    console.log("e: " + element);
    if(element.length > 255){
        alert("输入信息长度过长");
    }
    if(check){
        commit();
    }
}


/**
 * 提交按钮点击事件
 */
var commit = function () {
    console.log("hello");
    var url = "../user/insertUserInformation";
    var data = {name:$("#name").val(),phone:$("#phone").val(),email:$("#email").val(),job:$("#job").val(),message:$("#message").val(),contactTime:new Date()};
    console.log(data)
    $.ajax({
        url: url,
        data: data,
        type: "POST",
        dataType: "json",
        success: function (json) {
            if(json.code == 0){
                alert("我们会尽快联系您!")
                $(".form-control").val("");
                $(".form-control").css({"border-bottom":"#cccccc 1px solid"});
            }
        }
    })
}

/**
 * 字段非空判断
 */
var  checkVal = function (){

    check = true;
    var name = $("#name").val();
    var phone = $("#phone").val();
    var email = $("#email").val();
    if (name == null || name == undefined || name == "") {
        check = false;
        alert("名字不能为空");
        return;
    }
    if (phone == null || phone == undefined || phone == "") {
        check = false;
        alert("号码不能为空");
        return;
    }
    if (email == null || email == undefined || email == "") {
        check = false;
        alert("邮箱不能为空");
        return;
    }
}
