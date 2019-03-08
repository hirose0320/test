<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>Login画面</title>

<style type="text/css">
body {
	margin: 0;
	padding: 0;
	line-height: 1.6;
	letter-spacing: 1px;
	font-family: Verdana, Helvetica, sans-serif;
	font-size: 12px;
	color: #333;
	background: #fff;
}

table {
	text-align: center;
	margin: 0 auto;
}

#top {
	width: 780ox;
	margin: 30px auto;
	border: 1px solid #333;
}

#header {
	width: 100%;
	height: 80px;
	background-color: black;
}

#main {
	width: 100%;
	height: 500px;
	text-align: center;
}

#footer {
	width: 100%;
	height: 80px;
	background-color: black;
	clear: both;
}

#text-center {
	display: inline-block;
	text-align: center;
}
</style>
</head>
<body>
	<div id="header">
		<div id="pr"></div>
	</div>
	<div id="main">
		<div id="top">
			<p>Login</p>
		</div>
		<div id="text-center">
			<h3>商品を購入する際にはログインをお願いします。</h3>
			<s:form action="LoginAction">
				<s:textfield name="loginUserId" placeholder="USER_ID" />
				<s:password name="loginPassword" placeholder="PASSWORD" />
				<s:submit value="ログイン" />
			</s:form>
			<br />


			<p>
				新規ユーザー登録は <a href='<s:url action="UserCreateAction"/>'>こちら</a>
			</p>
			<p>
				ユーザー登録情報は <a href='<s:url action="UserListAction"/>'>こちら</a>
			</p>
			<p>
				新規商品登録は <a href='<s:url action="ItemCreateAction"/>'>こちら</a>
			</p>

			<p>
				商品情報は <a href='<s:url action="ItemListAction"/>'>こちら</a>
			</p>
			<p>
				Homeへ戻る場合は <a href='<s:url action="GoHomeAction"/>'>こちら</a>
			</p>
		</div>

	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>
</body>
</html>