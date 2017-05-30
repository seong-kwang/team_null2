$(function(){
    //전역변수선언
    var editor_object = [];
    var ctx = getContextPath(); 
    
    nhn.husky.EZCreator.createInIFrame({
        oAppRef: editor_object,
        elPlaceHolder: "smarteditor",
        sSkinURI: ctx+"/smarteditor/SmartEditor2Skin.html",
        htParams : {
            // 툴바 사용 여부 (true:사용/ false:사용하지 않음)
            bUseToolbar : true,            
            // 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
            bUseVerticalResizer : true,    
            // 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
            bUseModeChanger : true,
        }
    });
     
    //전송버튼 클릭이벤트
    $("#savebutton").click(function(){
    	//id가 smarteditor인 textarea에 에디터에서 대입
        editor_object.getById["smarteditor"].exec("UPDATE_CONTENTS_FIELD", []);
        
        //유효성 체크
        check();
        
        //폼 submit
        $("#frm").submit();
    });
});

function check(){
	if($.trim($("#title").val()) == ""){
		alert("제목을 입력하세요!");
		return false;
	}
	
	if($.trim($("#smarteditor").val()) == ""){
		alert("컴퓨터가 이상하다....");
		return false;
	}
	
	return;
}

function getContextPath() {
	return window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));
}
