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
<link href="https://fonts.googleapis.com/earlyaccess/hannari.css"
	rel="stylesheet">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>削除確認画面</title>

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

h1 {
	color: red;
	font-size: 50px;
	font-family: "Hannari", cursive;
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
</style>
<script type="text/javascript">
	function submitAction(url) {
		$('form').attr('action', url);
		$('form').submit();
	}
</script>

</head>
<body>
	<div id="header">
		<div id="pr"></div>
	</div>
	<div id="main">
		<div id="top">
			<p>ItemListDeleteConfirm</p>
		</div>
		<div>

			<s:form>
				<h1>
					すべての商品情報を削除します。<br>本当によろしいですか？
				</h1>
				<tr>
					<td><input type="button" value="一覧画面に戻る"
						onclick="submitAction('ItemListAction')" /></td>


					<td><input type="button" name="deleteFlg" value="全件削除"
						onclick="submitAction('ItemListDeleteCompleteAction')" /></td>

				</tr>


			</s:form>

		</div>
	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>
</body>
</html>