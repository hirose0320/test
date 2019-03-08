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
<title>itemList画面</title>

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

#text-right {
	display: inline-block;
	text-align: right;
}
</style>
</head>
<body>
	<div id="header">
		<div id="pr"></div>
	</div>
	<div id="main">
		<div id="top">
			<p>ItemList</p>
		</div>
		<div>

			<h3>商品情報は以下になります。</h3>
			<table border="1">
				<tr>
					<th>チェック</th>
					<th>商品名</th>
					<th>販売値段</th>
					<th>在庫数</th>
					<th>登録日</th>

				</tr>
				<s:iterator value="#session.itemList">
					<tr>
						<td><input type="checkbox" name="check"></td>
						<td><s:property value="iname" /></td>
						<td><s:property value="iprice" /><span>円</span></td>
						<td><s:property value="istock" /><span>個</span></td>
						<td><s:property value="insert_date" /></td>


					</tr>
				</s:iterator>
			</table>
			<s:form action="ItemListDeleteConfirmAction">

				<s:submit value="削除" />
			</s:form>

			<s:if test="message !=null">
				<h3>
					<s:property value="message" />
				</h3>
			</s:if>
			<div id="text-right">
				<p>
					Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a>
				</p>

			</div>

		</div>
	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>
</body>
</html>