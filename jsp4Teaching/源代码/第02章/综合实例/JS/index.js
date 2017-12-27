//组合许愿字条的方法
function outScrip(id,face,color,wishMan,wellWisher,content,date,hits){
	var leftDistance=parseInt(Math.random()*(920-5+1)+5);	//左边的距离
	var topDistance=parseInt(Math.random()*(376-184+1)+184);	//上边的距离			
	var scrip ="<div id='scrip"+id+"' class='Style"+color+"' style='left:"+leftDistance+"px;top:"+topDistance+"px; z-index:"+id+"' onmousedown='Move(this,event)' ondblclick=\"Show("+id+",'shadeDiv')\">"; 
	scrip += "<p class='Num'>字条编号："+id+"&nbsp;&nbsp;人气：<span id='hitsValue"+id+"'>"+hits+"</span><img src='images/close.gif' alt='关闭' onClick='myClose("+id+")'></p>";
	scrip += "<br />";
	scrip += "<p class='Detail'>";
	scrip += "<img src='images/face/face_"+face+".gif'>";
	scrip += "<span class='wishMan'>"+wishMan+"</span>";
	scrip += "<br />";
	scrip += content+"</p>";
	scrip += "<p class='wellWisher'>"+wellWisher+"</p>";
	scrip += "<p class='comment'><a href='#'>[支持]</a></p>";
	scrip += "<p class='Date'>"+date+"</p>";
	scrip +="</div>";
	return scrip;
}
//双击字条时，突出显示
function Show(n,divName){
	var e='scrip'+n;
	document.getElementById(divName).style.display = "block";	//将遮照层设置为显示
	document.getElementById(divName).style.zIndex = iLayerMaxNum;	//设置遮照层的层叠次序为最顶层
	document.getElementById(divName).style.width = document.body.clientWidth;	//设置遮照层的宽度
	document.getElementById(divName).style.height = document.body.clientHeight;		//设置遮照层的高度
	document.getElementById(e).style.zIndex =iLayerMaxNum+1;		//将选中字条置顶
}	
//隐藏遮照层
function Hide(){
	document.getElementById("shadeDiv").style.display = "none";	//将遮照层设置为不显示
	iLayerMaxNum=iLayerMaxNum+2;	//改变最大图层数，以保证iLayerMaxNum的值始终是最大图层数
}
/* ******************实现拖动字条*************************************** */
var Layer='';		//定义全局变量
document.onmouseup=moveEnd;		//当鼠标抬起时调用moveEnd()函数
if(document.all){		//如果是IE浏览器
	document.onmousemove=function(){
		moveStart(event);	//当鼠标移动时调用moveStart()函数
	}
}else{
	document.onmousemove=moveStart;		//当鼠标移动时调用moveStart()函数
}
var b;		//当前鼠标的x坐标，加上滚动条滚过的距离
var c;	//当前鼠标的y坐标，加上滚动条滚过的距离
function Move(Object,event){
	Layer=Object.id;		//将字条的ID赋值给全局变量Layer
	if(document.all){		//针对IE浏览器
		document.getElementById(Layer).setCapture();		//捕获鼠标
		b=event.x-document.getElementById(Layer).style.pixelLeft;		//获取左边距，单位为像素，但不带单位，
		c=event.y-document.getElementById(Layer).style.pixelTop;		//获取顶边距，单位为像素，但不带单位
	}else if(window.captureEvents){	//非IE浏览器
		window.captureEvents(Event.MOUSEMOVE|Event.MOUSEUP);	//捕获鼠标
		b=event.layerX;
		c=event.layerY;
	}
	/*********将选中字条置顶*********/
		document.getElementById(Layer).style.zIndex=iLayerMaxNum;
		iLayerMaxNum=iLayerMaxNum+1;
	/********************************/
}
function moveStart(event){
	if(Layer!=''){
		if(document.all){		//判断是否为IE浏览器
			document.getElementById(Layer).style.left=event.x-b+"px";	//设置左边距
			document.getElementById(Layer).style.top=event.y-c+"px";		//设置顶边距
		}else if(window.captureEvents!=null){	//判断是否为非IE浏览器
			document.getElementById(Layer).style.left=(event.clientX-b)+"px";	//设置左边距
			document.getElementById(Layer).style.top=(event.clientY-c)+"px";	//设置顶边

		}
	}
}
function moveEnd(){
	if(Layer!=''){
		if(document.all){		//判断是否为IE浏览器
			document.getElementById(Layer).releaseCapture();	//释放鼠标捕获
			Layer='';		//清空全局变量
		}else if(window.captureEvents){	//判断是否为非IE浏览器
			window.releaseEvents(Event.MOUSEMOVE|Event.MOUSEUP);	//释放鼠标捕获
			Layer='';		//清空全局变量
		}
	}
}
/* ************************************************************************************** */
//关闭字条
function myClose(n){
	var $e='#scrip'+n;		//将组合后的要关闭的字条ID转换为jQuery的变量									
	$($e).fadeOut(300);		//采用淡出效果隐藏要关闭的字条
}
//搜索字条
function searchScrip(n){
	value=n.value;
	if(value!=""){
		if(document.getElementById("scrip"+value)){
			Show(value,'shadeDiv');		//突出显示搜索到的字条
		}else{
			alert("您输入的字条不存在!");n.focus();	//弹出提示信息并让输入框获得焦点
		}
	}else{
		alert("请输入字条编号！");n.focus();	//弹出提示信息并让输入框获得焦点
	}
}
