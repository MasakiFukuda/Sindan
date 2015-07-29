<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8" %>
<link rel="stylesheet" href="hoge.css">
<html>
	<head>
		<title>test</title>
	</head>
	<body>
		<div id="result">
			<h1>${bean.title}</h1>
			<p>${bean.text}</p>
			${bean.imagePath}
			<FORM action="/shindan/d.html?">
				<INPUT type="submit" value="もう一度診断する">
			</FORM>
		</div>
	</body>
</html>

<!--
	**************************************************************
	****************** Created by MasakiFukuda *******************
	**************************************************************
	
-->