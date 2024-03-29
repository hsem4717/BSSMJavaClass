function save() {
    var data = {
        title : $('#title').val(),
        author : $('#author').val(),
        content : $('#content').val()
    };

    $.ajax({
        type: 'POST',
        url: '/api/v1/posts',
        dataType: 'json',
        contentType: 'application/json; charset=utf-8',
        data: JSON.stringify(data)
    }).done(function() {
        alert("글이 등록되었습니다.")
        window.location.href='/';
    }).fail(function(error) {
        alert(JSON.stringify(error));
    });
}

function update(){
    var data = {
        title : $('#title').val(),
        content : $('#content').val()
    };
    var id = $('#id').val()
    $.ajax({
        type: 'PUT',
        url: '/api/v1/posts/'+ id,
        dataType: 'json',
        contentType: 'application/json; charset=utf-8',
        data: JSON.stringify(data)
    }).done(function() {
        alert("글이 수정되었습니다.")
        window.location.href='/';
    }).fail(function(error) {
        alert(JSON.stringify(error));
    });
}

function update(){
    var data = {
        title : $('#title').val(),
        content : $('#content').val()
    };
    var id = $('#id').val()
    $.ajax({
        type: 'PUT',
        url: '/api/v1/posts/'+ id,
        dataType: 'json',
        contentType: 'application/json; charset=utf-8',
        data: JSON.stringify(data)
    }).done(function() {
        alert("글이 수정되었습니다.")
        window.location.href='/';
    }).fail(function(error) {
        alert(JSON.stringify(error));
    });
}

function update(){
    var data = {
        id : $('#id').val()
    };
    $.ajax({
        type: 'DELETE',
        url: '/api/v1/posts/'+ id,
        dataType: 'json',
        contentType: 'application/json; charset=utf-8',
        data: JSON.stringify(data)
    }).done(function() {
        alert("글이 삭제되었습니다.")
        window.location.href='/';
    }).fail(function(error) {
        alert(JSON.stringify(error));
    });
}