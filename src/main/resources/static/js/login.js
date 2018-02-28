$('#loginBtn').on('click', function () {
    var userName = $('input#userName').val();
    var paswd = $('input#passWord').val();
    alert(userName + " " + paswd);
    $.ajax({
        async: false,
        type: 'POST',
        dataType: 'json',
        data:{name:userName, paswd:paswd},
        url: '/movie/user/loginAction',
        error : function(XMLHttpRequest, textStatus, errorThrown) {
            console.log(XMLHttpRequest);
            console.log(textStatus);
            console.log(errorThrown);
        },
        success: function(response){
            if(0 == response.code){
                // document.getElementById("moviePage").click();
                $('#moviePage').click();
            }else {
                $('#userName').select().focus();
            }
        }
    });
});