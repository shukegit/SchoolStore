$(function() {

	$('#submit1').click(function() {
		alert(1);
		var nickname = $('.nickname').attr();
		var password = $('.password').attr();
		if(nickname == null || password == null) {
			alert("用户名或密码不能为空");
			return;
		}
		var formData = new FormData();
		formData.append("nickname", nickname);
		formData.append("password", password);
		console.log("nickname:" + nicename);
		console.log("password:" + password);
		$.ajax({
			url : '/schoolStore/loginpage/getlogininfo',
			type : 'POST',
			data :  formData,
			contentType : false,
			processData : false,
			cache : false,
			success : function(data) {
				if(data.status) {
					alert("登录成功");
					window.location.href = '/schoolStore/checkpage/checkbrandtest';
				} else {
					alert("用户名或密码不正确");
				}
			}
		});
			
	});
});