<html>
<head>
<title>hello world</title>
    <script type="text/javascript" language="javascript" src="../static/js/jquery-2.1.1.js"></script>
</head>
<body>
<h1>HELLO 框架好歹是科技公司</h1>
<button onclick="show();">获取数据</button>
<div id="data"></div>
</body>
</html>

<script>
//function show() {
//    $.ajax({
//        url: webCfg.servePath + "/test/index",
//        type: "GET"
//    }).done(function(data) {
//        $("#data").test(data);
//    }).fail(function(jqXHR, error){
//        alert("连接超时，请重新登录！");
//    });
//}
function show() {
    $.ajax({
        url:"/demo/test/index",
        success: function(data){
            $("#data").append(data.title);
        }
    });
}
</script>