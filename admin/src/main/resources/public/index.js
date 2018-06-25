$.ajaxSetup({
    beforeSend: function(xhr) {
        var token = localStorage.getItem("token");
        if (token) {
            xhr.setRequestHeader('Authorize', 'Bearer ' + token);
        }
    }
});
function doCall(type, url, data, doneFn) {
    var params = {
        url: url,
        type: type,
        contentType: "application/json",
        success: function (d) {
            console.log("DATA:", d);
        },
        error: function (error) {
            console.log(error);
        }
    };
    params = $.extend(params, data);
    var q = $.ajax(params);
    if (doneFn) {
        q.done(doneFn);
    }
    return q;
}
function doGet(url, data, doneFn) {
    return doCall("GET", url, data, doneFn);
}
function doPost(url, data, doneFn) {
    return doCall("POST", url,data, doneFn);
}
$("form input[type='submit']").click(function(){
    var user = {
        login:$("#email").val(),
        password:$("#password").val()
    };
    user = JSON.stringify(user);
    doPost("login", {data: user},
        function(token){
            localStorage.setItem('token', token);
            $('head').load('/static/head/head/index.html head *');
            $('header').load('/static/head/head/index.html header *');
            $('footer').load('/static/head/head/index.html footer *');
    });
});



