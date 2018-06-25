$.ajax({
    url: "http://localhost:8080/JumpFromTheBridge/get",
    type: "GET",
    contentType: "application/json",
    headers: {
        "Authorize": "Bearer " + localStorage.getItem("token")
    },
    success: function (data) {
        for (var i = 0; i < data.length; i++) {
            $("#listJumpFromTheBridge").tabIndex("<li>" + data[i].id +" " + data[i].firstName + " " + data[i].lastName + " " + data[i].surname + " " +data[i].used +
                "</li>");
        }


    },
    error: function (error) {
        console.log(error);
    }
});

$.ajax({
    url: "http://localhost:8080/Recreation/get",
    type: "GET",
    contentType: "application/json",
    headers: {
        "Authorize": "Bearer " + localStorage.getItem("token")
    },
    success: function (data) {
        for (var i = 0; i < data.length; i++) {
            $("#listRecreation").append("<li>" + data[i].id + " " + data[i].firstName + " " + data[i].lastName + " " + data[i].surname + " " + data[i].used +
                "</li>");
        }


    },
    error: function (error) {
        console.log(error);
    }
});

$.ajax({
    url: "http://localhost:8080/TrolleyCrossing/get",
    type: "GET",
    contentType: "application/json",
    headers: {
        "Authorize": "Bearer " + localStorage.getItem("token")
    },
    success: function (data) {
        for (var i = 0; i < data.length; i++) {
            $("#listTrolleyCrossing").append("<li>" + data[i].id +"    " + data[i].firstName + "   " + data[i].lastName + "   " + data[i].surname + "   " + data[i].used +
                "</li>");
        }


    },
    error: function (error) {
        console.log(error);
    }
});

// var gCurCell;
// $(document).ready(function(){
//     $('.editable_table td').click(function(){
//         gCurCell = this;
//         var lPos = $(this).position();
//         $('#editor').css({
//             'top': (lPos.top + 1) + 'px',
//             'left': (lPos.left + 1) + 'px',
//             'width': $(this).width(),
//             'height': $(this).height()
//         }).val($(this).html()).show().focus();
//     });
//     $('#editor').blur(function(){
//         $(this).hide();
//         $(gCurCell).html($(this).val());
//
//         // here joes ajax




$("table").on('click', 'td', function(){
    $(this.id).html("<input type='text' value='"+$(this).text()+"'/>");

}).on('click', 'td input', function(){
    return false;

}).on('blur', 'td input', function(){

    $(this).parent('td').text($(this).val());

});







//
// var example_table = $('#example_table').DataTable({
//     'ajax': {
//         "type"   : "POST",
//         "url"    : '/path/to/your/URL',
//         "data"   : function( d ) {
//             d.example_key1= $('#example_input1').val();
//             d.example_key2= $('#example_input2').val();
//             d.example_key3= $('#example_input3').val();
//         },
//         "dataSrc": ""
//     },
//     'columns': [
//         {"data" : "metric_name"},
//         {"data" : "metric_type"},
//         {"data" : "metric_timestamp"},
//         {"data" : "metric_duration"}
//     ]
// })
