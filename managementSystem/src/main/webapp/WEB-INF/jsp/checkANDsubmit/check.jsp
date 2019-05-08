<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta charset="utf-8" />
<title></title>
<script>
	//当全选按钮，选中时，所有复选框被选中，当全选按钮不被选中时，所有的也不被选中
	function funSelAll() {
		var selects = document.getElementsByName("One");
		if (document.getElementsByName("All")[0].checked == true) {
			for (var i = 0; i < selects.length; i++) {
				selects[i].checked = true;
			}
		} else {
			for (var i = 0; i < selects.length; i++) {
				selects[i].checked = false;
			}
		}
	}
	//当所有的复选框被选中时，全选按钮被选中，当其中任意一个或者多个没被选中时，全选按钮不被选中
	function funSelOne() {
		var one = document.getElementsByName("One");
		var all = document.getElementsByName("All")[0]
		var selCount = 0;
		var unSelCount = 0;
		for (var i = 0; i < one.length; i++) {
			if (one[i].checked == true) {
				selCount++;
			}
			if (one[i].checked == false) {
				unSelCount++;
			}
			if (selCount == one.length) {
				all.checked = true;
			}
			if (unSelCount > 0) {
				all.checked = false;
			}
		}
	}
</script>
<link rel="stylesheet" href="../resources/css/check/check.css"
	type="text/css" />
</head>
<body>
	<div class="bo">
		<div class="header"></div>

		<div class="middle"></div>

		<div class="main">
			<div class="font">品牌信息审核</div>

			<div class="content">
				<div class="div1">按品牌首字母:</div>
				<div class="word">
					<label class="l1"><input type="radio" name="words"
						value="0" checked="checked" />不限</label> <label class="l1"><input
						type="radio" name="words" value="A" />A</label> <label class="l1"><input
						type="radio" name="words" value="B" />B</label> <label class="l1"><input
						type="radio" name="words" value="C" />C</label> <label class="l1"><input
						type="radio" name="words" value="D" />D</label> <label class="l1"><input
						type="radio" name="words" value="E" />E</label> <label class="l1"><input
						type="radio" name="words" value="F" />F</label> <label class="l1"><input
						type="radio" name="words" value="G" />G</label> <label class="l1"><input
						type="radio" name="words" value="H" />H</label> <label class="l1"><input
						type="radio" name="words" value="I" />I</label> <label class="l1"><input
						type="radio" name="words" value="J" />J</label> <label class="l1"><input
						type="radio" name="words" value="K" />K</label> <label class="l1"><input
						type="radio" name="words" value="L" />L</label> <label class="l1"><input
						type="radio" name="words" value="M" />M</label> <label class="l1"><input
						type="radio" name="words" value="N" />N</label> <label class="l1"><input
						type="radio" name="words" value="O" />O</label> <label class="l1"><input
						type="radio" name="words" value="P" />P</label> <label class="l1"><input
						type="radio" name="words" value="Q" />Q</label> <label class="l1"><input
						type="radio" name="words" value="R" />R</label> <label class="l1"><input
						type="radio" name="words" value="S" />S</label> <label class="l1"><input
						type="radio" name="words" value="T" />T</label> <label class="l1"><input
						type="radio" name="words" value="U" />U</label> <label class="l1"><input
						type="radio" name="words" value="V" />V</label> <label class="l1"><input
						type="radio" name="words" value="W" />W</label> <label class="l1"><input
						type="radio" name="words" value="X" />X</label> <label class="l1"><input
						type="radio" name="words" value="Y" />Y</label> <label class="l1"><input
						type="radio" name="words" value="Z" />Z</label>
				</div>

				<div class="div2">一级业态:</div>
				<select name="first" class="first" id="first-trade">
					<option value="all">全部</option>
				</select>
				<div class="div3">二级业态:</div>
				<select name="second" class="second" id="second-trade">
					<option value="all">全部</option>
				</select>
				<div class="div4">三级业态:</div>
				<select name="third" class="third" id="third-trade">
					<option value="all">全部</option>
				</select>

				<div class="div5">品牌等级:</div>
				<select name="forth" class="forth" id="grade">
					<option value="全部">全部</option>
					<option value="一级">一级</option>
					<option value="二级">二级</option>
					<option value="三级">三级</option>
				</select>
				<div class="div6">提交审核时间:</div>
				<div class="time">
					<label class="l2"><input type="radio" name="times"
						value="0" checked="checked" />不限</label> <label class="l2"><input
						type="radio" name="times" value="7" />7天</label> <label class="l2"><input
						type="radio" name="times" value="30" />一个月</label> <label class="l2"><input
						type="radio" name="times" value="365" />1年</label>
				</div>

				<div class="div7">品牌信息类型:</div>
				<select name="message" class="message">
					<option value="0">全部</option>
					<option value="1">编辑</option>
					<option value="2">添加</option>
					<option value="3">添加代理公司</option>
					<option value="4">添加品牌公司</option>
					<option value="5">添加直营公司</option>
				</select>
				<div class="div8">品牌维护类型:</div>
				<select name="wh" class="wh">
					<option value="0">全部</option>
					<option value="品牌公司">品牌公司</option>
					<option value="代理公司">代理公司</option>
					<option value="直盈公司">直营公司</option>
				</select>
				<div class="div9">审核状态:</div>
				<select name="state" class="state">
					<option value="">全部</option>
					<option value="-2">未审核</option>
					<option value="-1">审核中</option>
					<option value="1">审核通过</option>
					<option value="-10">审核未通过</option>
				</select>

				<div class="div10">品牌名:</div>
				<input type="text" class="name" placeholder="品牌名" />
				<div class="div11">维护人员:</div>
				<input type="text" class="people" placeholder="姓名/工号" />
				<div class="require">
					<input type="submit" value="查询" id="submit" />
				</div>
				<div class="reset">重置</div>
				<div
					style="position: absolute; height: 2px; background-color: #034D98; width: 1340px; margin-top: 436px;"></div>
				<div class="on">审核通过</div>
				<div class="off">审核拒绝</div>
				<div class="page">每页显示：</div>
				<select name="pages" class="pages" id="pageSize">
					<option value="ten">10</option>
					<option value="nine">9</option>
					<option value="eight">8</option>
					<option value="seven">7</option>
					<option value="six">6</option>
					<option value="five">5</option>
					<option value="four">4</option>
					<option value="three">3</option>
					<option value="two">2</option>
					<option value="one">1</option>

				</select>

				<table class="table" border="1" cellspacing="0" cellpadding="5"
					frame="hsides">
					<tr bgcolor="#034D98" align="center">
						<th style="width: 80px;"><input type="checkbox" name="All"
							id="All" value="全选" onClick="funSelAll(this)" /><span class="sp">全选</span></th>
						<th><span class="sp">一级业态</span></th>
						<th><span class="sp">二级业态</span></th>
						<th><span class="sp">品牌等级</span></th>
						<th><span class="sp">品牌</span></th>
						<th><span class="sp">维护人员</span></th>
						<th><span class="sp">审核内容类型</span></th>
						<th><span class="sp">提交时间</span></th>
						<th><span class="sp">审核状态</span></th>
						<th><span class="sp">操作</span></th>

					</tr>
					<!-- <tr align="center">
						<td><input type="checkbox" name="One" id="One" /><span
							class="sp2">1</span></td>
						<td><span class="2">餐饮</span></td>
						<td><span class="sp2">特色餐饮</span></td>
						<td><span class="sp2">二线</span></td>
						<td><span class="sp2">鼎顶鲜养生火锅</span></td>
						<td><span class="sp2">宋蓉蓉</span></td>
						<td><span class="sp2">添加品牌代理公司</span></td>
						<td><span class="sp2">2019/3/30 14:50</span></td>
						<td><span class="sp2">审核通过</span></td>
						<td><span class="sp2"><a style="color: #034D98;">查看</a>
								<a style="color: #034D98;"> 通过</a><a style="color: #034D98;">
									拒绝</a></span></td>

					</tr>
					<tr align="center">
						<td><input type="checkbox" name="One" id="One" /><span
							class="sp2">2</span></td>
						<td><span class="2">餐饮</span></td>
						<td><span class="sp2">食品零售</span></td>
						<td><span class="sp2">二线</span></td>
						<td><span class="sp2">百草味</span></td>
						<td><span class="sp2">宋蓉蓉</span></td>
						<td><span class="sp2">添加品牌代理公司</span></td>
						<td><span class="sp2">2019/3/30 14:50</span></td>
						<td><span class="sp2">审核通过</span></td>
						<td><span class="sp2"><a style="color: #034D98;">查看</a>
								<a style="color: #034D98;"> 通过</a><a style="color: #034D98;">
									拒绝</a></span></td>

					</tr>
					<tr align="center">
						<td><input type="checkbox" name="One" id="One" /><span
							class="sp2">3</span></td>
						<td><span class="2">餐饮</span></td>
						<td><span class="sp2">食品零售</span></td>
						<td><span class="sp2">二线</span></td>
						<td><span class="sp2">百草味</span></td>
						<td><span class="sp2">宋蓉蓉</span></td>
						<td><span class="sp2">添加品牌代理公司</span></td>
						<td><span class="sp2">2019/3/30 14:50</span></td>
						<td><span class="sp2">审核通过</span></td>
						<td><span class="sp2"><a style="color: #034D98;">查看</a>
								<a style="color: #034D98;"> 通过</a><a style="color: #034D98;">
									拒绝</a></span></td>

					</tr>
					<tr align="center">
						<td><input type="checkbox" name="One" id="One" /><span
							class="sp2">4</span></td>
						<td><span class="2">餐饮</span></td>
						<td><span class="sp2">食品零售</span></td>
						<td><span class="sp2">二线</span></td>
						<td><span class="sp2">百草味</span></td>
						<td><span class="sp2">宋蓉蓉</span></td>
						<td><span class="sp2">添加品牌代理公司</span></td>
						<td><span class="sp2">2019/3/30 14:50</span></td>
						<td><span class="sp2">审核通过</span></td>
						<td><span class="sp2"><a style="color: #034D98;">查看</a>
								<a style="color: #034D98;"> 通过</a><a style="color: #034D98;">
									拒绝</a></span></td>

					</tr>
					<tr align="center">
						<td><input type="checkbox" name="One" id="One" /><span
							class="sp2">5</span></td>
						<td><span class="2">餐饮</span></td>
						<td><span class="sp2">食品零售</span></td>
						<td><span class="sp2">二线</span></td>
						<td><span class="sp2">百草味</span></td>
						<td><span class="sp2">宋蓉蓉</span></td>
						<td><span class="sp2">添加品牌代理公司</span></td>
						<td><span class="sp2">2019/3/30 14:50</span></td>
						<td><span class="sp2">审核通过</span></td>
						<td><span class="sp2"><a style="color: #034D98;">查看</a>
								<a style="color: #034D98;"> 通过</a><a style="color: #034D98;">
									拒绝</a></span></td>

					</tr> -->
					

				</table>
				<div class="buttom">
					<div class="b1">首页</div>
					<div class="b1">上一页</div>
					<div class="b1">1</div>
					<div class="b1">2</div>
					<div class="b1">3</div>
					<div class="b1">4</div>
					<div class="b1">5</div>
					<div class="b1">下一页></div>
					<div class="b1">尾页</div>
					<div class="b2">共？页，到第</div>
					<div class="b2">
						<input type="text" name="text" id="text"
							style="width: 40px; height: 15px; margin-left: -7px;" />
					</div>
					<div class="b2" style="margin-left: -5px;">页</div>
					<div class="b1" style="margin-left: 15px;">确定</div>
				</div>
				<div class="up">^</div>
				<hr style="background-color: blue; height: 3px;" />
				<div class="end">利林置业商业地产综合业务管理平台·商家品牌库 COPYRIGHT @ 2016 ALL
					RIGHT RESSRVED</div>
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="<%=basePath%>resources/Jquery/jquery-3.2.1.min.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>resources/Jquery/jquery-3.2.1.js"></script>
	<script type="text/javascript" src="../resources/js/check/check.js"
		charset="utf-8"></script>
</body>
</html>
