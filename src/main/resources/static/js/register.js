$('#register').on('click', function () {
    var password = $('input#password').val();
    var name = $('input#username').val();
    var repassword = $('input#repassword').val();
    if(!(password == repassword)){
        $('input#repassword').select().focus();
        return;
    }
    $.ajax({
        async: false,
        type: 'POST',
        dataType: 'json',
        data:{name:name, paswd:password},
        url: '/movie/user/registerAction',
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
                $('#username').select().focus();
            }
        }
    });
});