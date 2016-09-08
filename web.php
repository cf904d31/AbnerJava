<?php
	if (!isset($_REQUEST['cname'])) die("SERVER DOWN");
	$cname = $_REQUEST['cname'];
	$tel = $_REQUEST['tel'];
	$birthday = $_REQUEST['birthday'];
	
	$sql = "INSERT INTO cust (cname,tel,birthday) VALUES ('{$cname}','{$tel}','{$birthday}')";
	echo $sql;
	$link = mysqli_connect('localhost','root','root','brad');
	mysqli_query($link,$sql);
?>