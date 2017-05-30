<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-2.2.4.js"></script>
<script type="text/javascript">
$(function(){
	var selected = $("#selected").val();
	alert("selected : " + selected);
	$("#box").find("option").each(function(index){
		//alert($("#box").find("option:eq("+index+")").val());
		var value = $("#box").find("option:eq("+index+")").val();
		
		if(value == selected){
			alert("들어옴");
			$("#box").find("option:eq("+index+")").attr("selected","selected");
			//this.attr("selected","selected");
		}
	});
	//$("#box").find("option:eq(2)").attr("selected","selected");
});
</script>
</head>
<body>
<input type="hidden" id="selected" value="d">
<select id="box">
	<option value="a">선택해라</option>
	<option value="b">a</option>
	<option value="c">b</option>
	<option value="d">c</option>	
</select>
</body>
</html>