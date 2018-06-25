$("#changeBackround").click(function(){



    var person = {
        firstName:$("#firstName").val(),
        lastName:$("#lastName").val(),
        surname:$("#surname").val(),
        // used:$("#used").val()

    };
    $.ajax({
        url:"http://localhost:8080/JumpFromTheBridge",
        type:"POST",
        contentType:"application/json",
        data:JSON.stringify(person),
        success:function(data){
            alert("SUCCESS");
            alert(data);                     localStorage.setItem('token', data);
        },
        error:function(error){
            console.log(error);
        }
    });
});

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
$("#changeBackround1").click(function(){
    var person = {
        firstName:$("#firstName1").val(),
        lastName:$("#lastName1").val(),
        surname:$("#surname1").val()
        // used1:$("#used1").val()
    };
    $.ajax({
        url:"http://localhost:8080/Recreation",
        type:"POST",
        contentType:"application/json",
        data:JSON.stringify(person),
        success:function(data){
            alert("SUCCESS");
            alert(data);                     localStorage.setItem('token', data);
        },
        error:function(error){
            console.log(error);
        }
    });
});
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
$("#changeBackround2").click(function(){
    var person = {
        firstName:$("#firstName2").val(),
        lastName:$("#lastName2").val(),
        surname:$("#surname2").val()
        // used2:$("#used2").val()
    };
    $.ajax({
        url:"http://localhost:8080/TrolleyCrossing",
        type:"POST",
        contentType:"application/json",
        data:JSON.stringify(person),
        success:function(data){
            alert("SUCCESS");
            alert(data);                     localStorage.setItem('token', data);
        },
        error:function(error){
            console.log(error);
        }
    });
});
