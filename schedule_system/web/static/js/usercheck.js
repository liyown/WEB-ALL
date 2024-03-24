
function submitCheck() {
    var flag = userNameCheck()
    var flag1 = passWordCheck()

    if (flag & flag1) {
        return true
    }
    return false
}

function userNameCheck() {
    var userNameReges = /^[a-zA-Z]{5,10}$/
    var userNameTag = document.getElementById("uerNameInput")
    var userName = userNameTag.value
    var faultMessage = document.getElementById("userFaultMessage")
    // 当输入内容为空时候，清空提示信息
    if (userName === "") {
        faultMessage.innerText = ""
        return false
    }
    if (!userNameReges.test(userName)) {
        faultMessage.style.color = "red"
        faultMessage.innerText = "用户名不符合规则"
        return false
    }

    isUserExit()
    return true
}

function passWordCheck() {
    var passWordReges = /^[0-9]{6}$/
    var passWordTag = document.getElementById("passWordInput")
    var passWord = passWordTag.value
    var faultMessage = document.getElementById("passWordFaultMessage")
    // 当输入内容为空时候，清空提示信息
    if (passWord === "") {
        faultMessage.innerText = ""
        return false
    }

    if (!passWordReges.test(passWord)) {
        faultMessage.style.color = "red"
        faultMessage.innerText = "密码不符合规则"
        return false
    }
    faultMessage.innerText = "密码符合规则"
    faultMessage.style.color = "green"
    return true
}

function resetMessage() {
    var faultMessage = document.getElementById("userFaultMessage")
    faultMessage.innerText = ""
    faultMessage = document.getElementById("passWordFaultMessage")
    faultMessage.innerText = ""
}

function isUserExit() {
    var userNameElem = document.getElementById("uerNameInput");
    var userName = userNameElem.value;
    var ajax = new XMLHttpRequest()
    var uri = '/user/isUserExist?username=' + userName
    //设置回调哈数
    ajax.onreadystatechange = function () {
        if (ajax.readyState === 4 && ajax.status === 200) {
            var result = JSON.parse(ajax.responseText)
            console.log(ajax.responseText)
            if (result.code === 200) {
                var faultMessage = document.getElementById("userFaultMessage")
                faultMessage.style.color = "green"
                faultMessage.innerText = "用户名可用"
            } else {
                var faultMessage = document.getElementById("userFaultMessage")
                faultMessage.style.color = "red"
                faultMessage.innerText = "用户名已存在"
            }
        }
    }
    //发送一部请求
    ajax.open('GET', uri, true)
    ajax.send()
}