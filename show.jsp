<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8" %>
<link rel="stylesheet" href="hoge.css">
<html>
	<head>
		<title>test</title>
		<meta http-content-equiv='Content-ScriptType' content='text/javascript'>
	</head>
	<body>
		<script>
			function replay(){
				var host = location.host;
				var path = location.pathname.split("/");
				
				var url = "http://"+host+"/"+path[1]+"/e.html";
				location.href = url;
			}
					
		</script>
		
		<div id="result">
			<h1>${bean.title}</h1>
			<p>${bean.text}</p>
			${bean.imagePath}<br>
			<button onClick="replay()">もう一度診断する</button>
		</div>
	</body>
</html>