

function submitCheck() {
    var flag = userNameLostCheck()
    var flag1 = passWordLostCheck()

    if(flag&flag1) {
        return true
    }
    return false
}

function userNameLostCheck() {
    var userNameReges = /^[a-zA-Z]{5,10}$/
    var userNameTag = document.getElementById("uerNameInput")
    var userName = userNameTag.value
    var faultMessage = document.getElementById("userFaultMessage")
    if(!userNameReges.test(userName)) {
        faultMessage.style.color = "red"
        faultMessage.innerText = "用户名不符合规则"
        return false
    }
    faultMessage.innerText = "用户名符合规则"
    faultMessage.style.color = "green"
    return true
    
    
}

function passWordLostCheck() {
    var passWordReges = /^[0-9]{6}$/
    var passWordTag = document.getElementById("passWordInput")
    var passWord = passWordTag.value
    var faultMessage = document.getElementById("passWordFaultMessage")
    if(!passWordReges.test(passWord)) {
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
    var faultMessage = document.getElementById("passWordFaultMessage")
    faultMessage.innerText = ""
    console.log(1);

}