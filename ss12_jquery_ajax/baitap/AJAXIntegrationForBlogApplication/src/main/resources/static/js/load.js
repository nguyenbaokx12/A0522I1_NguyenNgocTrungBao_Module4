var page = 1;
function load() {
    $.ajax({
        url: "api/blogs/page/" + page,
        type: 'get',
        dataType: 'json',
        success: function (response) {
            var result = "";
            for(let i=0; i<response.length; i++){
                result += `
                    <div>
                    <h3>Thể loại: <span>${response[i].category.nameCategory}</span></h3>
                    <p>Tiêu đề: <span>${response[i].header}</span></p>
                    <p>Nội dung: <span>${response[i].content}</span></p>
                    <p>Ngày tạo: <span>${response[i].date}</span></p>
                    <hr>
                    </div>`;
            }
            $("#blogs-list").append(result);
        }
    })
    page++;
}