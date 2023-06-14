function dataSend(){
    var data={
        content : $('#input-data').val(),
        completed : false
    }

    $.ajax({
        type:'POST',
        url:'/todo/api',
        dataType:'json',
        contentType:'application/json; charset=utf-8',
        data: JSON.stringify(data)
    }).done(function (){
        window.location.href='/';
    })
        .fail(function (error){
            alert(JSON.stringify(errer));
        });
}

function deleteData(id){
    $.ajax({
        type:'DELETE',
        url:'/todo/api/' + id,
        contentType:'application/json; charset=utf-8',
    }).done(function (){
        window.location.href='/';
    })
        .fail(function (error){
            alert(JSON.stringify(error));
        });
}