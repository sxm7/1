var globalData={
	/*http://127.0.0.1:8020*/
	pre:"http://localhost:8080/product/",
	server1:"192.168.1.250:83",
	server2:"http://stuapi.ysd3g.com",
	myToken:"fa5ffe61-8c05-415c-91a2-c2f9ddc35aec",
	myTheme:"black",
	setUserInfo:function(uid,uname,roleNames){
		/*
		 页面传值
		 * */
		window.sessionStorage.setItem("uid",uid);
		window.sessionStorage.setItem("uname",uname);
		window.sessionStorage.setItem("roleNames",roleNames);
	},
	getUserID:function(){
		return window.sessionStorage.getItem("uid")
	},
	getUserName:function(){
		return window.sessionStorage.getItem("uname")
	},
	getUserRoleNames:function(){
		var rs=window.sessionStorage.getItem("roleNames");
		/*var arr=rs.split(",");
		for(var i=0;i<arr.length;i++){
			arr[i]="\'"+arr[i]+"\'"
		}*/
		return rs
	},
};



document.write('<link rel="stylesheet" href="'+globalData.pre+'/jquery-easyui-1.4.3/themes/icon.css" />')
document.write('<link rel="stylesheet" href="'+globalData.pre+'/jquery-easyui-1.4.3/themes/'+globalData.myTheme+'/easyui.css" />')
document.write('<script src="'+globalData.pre+'/jquery-easyui-1.4.3/jquery.min.js"></script>')
document.write('<script src="'+globalData.pre+'/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>')
document.write('<script src="'+globalData.pre+'/jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>')
