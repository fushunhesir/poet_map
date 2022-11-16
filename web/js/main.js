$(document).ready(function() {
    $(".search").focus(function() {
        $(this).attr("placeholder", "")
    });

    $(".search").blur(function() {
        $(this).attr("placeholder", "输入诗人或诗歌名称")
    });

    $(".search_btn").click(function() {
        let value = $(".search").val();
        if(value != ''){
            get_and_show_data(value);
        }
    });
    $(".search").keyup(function() {
        if($('.search_res').length > 0) {
            $('.search_res').remove();
            $('.search').css({"border-bottom-left-radius": "30px", "border-bottom-right-radius": "30px"});
        }
        let value = $(".search").val();
        if(value != ''){
            get_and_show_data(value);
        }
    });   
    function get_and_show_data(value){
        $.ajax({
            url: "http://localhost:8080/web_war_exploded/FindPoetServlet",
            type: "get",
            datatype: "json",
            data: {
                poet: value,
                year: '',
                type: '',
            },
            success: function(res){
                let data = JSON.parse(res);
                if(data.length > 0) {
                    $('.search').css({"border-bottom-left-radius": "0px","border-bottom-right-radius": "0px"});
                    let it = "<ul class='search_res'>"
                    $.each(data, function(i, n) {
                        it += "<li class='res_item'><strong>" + n + "</strong></li>";
                    });
                    it += "</ul>";
                    $('.container').after(it);
                    $('.res_item:last-child').css({"border-bottom-left-radius": "30px","border-bottom-right-radius": "30px"});
                }
            }
        });
    }
    $('body').on('click','ul li.res_item',function(){
        $.ajax({
            url:'http://localhost:8080/web_war_exploded/FindPoemServlet',
            type:"get",
            datatype:"json",
            async: false,
            data: {
                poet: $(this).text(),
            },
            success:function(res){
                let data = JSON.parse(res);
                if(config.chapters.length != 0) config.chapters=[];
                $.each(data, function(i, n) {
                    config.chapters.push({
                        id: i,
                        alignment:'right',
                        title: n['name'],
                        image: '',
                        description: n['description'],
                        location: {
                            center: [n['longitude'], n['altitude']],
                            pitch: 0.00,
                            zoom:8.5,
                            bearing: 0.00
                        },
                        onChapterEnter: [
                            {
                                layer: 'phl-city-limits',
                                opacity: .45
                            }
                        ],
                        onChapterExit: [
                            {
                                layer: 'phl-city-limits',
                                opacity: 0
                            }
                        ]
                    });
                });
            }
        });
        sessionStorage.clear();
        sessionStorage.setItem('myconfig',JSON.stringify(config));
        window.location.replace('./main.html');
    });
});