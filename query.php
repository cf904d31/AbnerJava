<?php
	$sql = "select *  from cust order by cid";
	//echo $sql;
	$link = mysqli_connect('localhost','root','root','brad');
	$rs = mysqli_query($link,$sql);
	while ($row=mysqli_fetch_array($rs,MYSQLI_ASSOC)) {
		echo $row['cid'] . ":" . $row['cname'] . ":" . $row['tel'] . "\n";
	}
?>