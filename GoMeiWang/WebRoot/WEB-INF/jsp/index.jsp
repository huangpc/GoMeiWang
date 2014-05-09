<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>go美网 - 美丽自己</title>
	<link rel="stylesheet" type="text/css" href="<%= basePath %>resources/css/general.css"/>
	<link rel="stylesheet" type="text/css" href="<%= basePath %>resources/css/index.css"/>
	<script type="text/javascript" src="<%= basePath %>resources/js/jquery.js"></script>
	<!-- <script type="text/javascript" src="./scripts/javascripts/jquery1.42.min.js"></script> --><!-- SuperSlide -->
	<script type="text/javascript" src="<%= basePath %>resources/js/jquery.SuperSlide.2.1.1.js"></script><!-- SuperSlide -->
    
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    
<div id="container">
	<!-- Toppest NavContainer -->
	<div id="header">
		<a href="./index.html" id="header_logo"></a>
	</div>
	<div id="navcontainer">
		<ul id="nav">
			<li><a href="javascript:void(0)">首页</a></li>
			<li><a href="javascript:void(0)">团购</a></li>
			<li><a href="javascript:void(0)">社区</a></li>
			<li class="new"><a href="javascript:void(0)">会员特惠</a><span class="new"></span></li>
			<li><a href="javascript:void(0)">最新潮流</a></li>
			<li><a href="javascript:void(0)">术后保养</a></li>
			<li><a href="javascript:void(0)">找医院</a></li>
			<li><a href="javascript:void(0)">找医生</a></li>
			<li><a href="javascript:void(0)">关于我们</a></li>
		</ul>
	</div>
	<div id="mainbody">
		<div id="main_fa">
			<ul id="main_fa_l">
				<li class="first">
					<div class="mfl_l"><img src="<%= basePath %>resources/images/mainbody/main_fa_l_1.png" /></div>
					<div class="mfl_r">
						<span>眼部</span>
						<a href="#">双眼皮</a><a href="#">开眼角</a><a href="#">去眼袋</a><a href="#">无创提眉</a>
						<a href="#">内眦赘皮</a>
					</div>
				</li>
				<li>
					<div class="mfl_l"><img src="<%= basePath %>resources/images/mainbody/main_fa_l_2.png" /></div>
					<div class="mfl_r">
						<span>鼻部</span>
						<a href="#">隆鼻术</a><a href="#">鼻头整形</a><a href="#">驼峰鼻</a><a href="#">歪鼻矫正</a>
					</div>
				</li>
				<li>
					<div class="mfl_l"><img src="<%= basePath %>resources/images/mainbody/main_fa_l_3.png" /></div>
					<div class="mfl_r">
						<span>脸部</span>
						<a href="#">额头</a><a href="#">颧骨</a><a href="#">下巴</a><a href="#">唇部</a>
						<a href="#">下颌</a><a href="#">改脸型</a>
					</div>
				</li>
				<li>
					<div class="mfl_l"><img src="<%= basePath %>resources/images/mainbody/main_fa_l_4.png" /></div>
					<div class="mfl_r">
						<span>胸部</span>
						<a href="#">韩式隆胸</a><a href="#">缩胸</a><a href="#">矫正乳房下垂</a><a href="#">乳晕整形</a>
					</div>
				</li>
				<li>
					<div class="mfl_l"><img src="<%= basePath %>resources/images/mainbody/main_fa_l_5.png" /></div>
					<div class="mfl_r">
						<span>皮肤</span>
						<a href="#">除皱</a><a href="#">脱毛</a><a href="#">祛斑</a><a href="#">洗纹身</a>
						<a href="#">疤痕修复</a>
					</div>
				</li>
				<li>
					<div class="mfl_l"><img src="<%= basePath %>resources/images/mainbody/main_fa_l_6.png" /></div>
					<div class="mfl_r">
						<span>口腔</span>
						<a href="#">种植牙</a><a href="#">美容冠</a><a href="#">牙齿正畸</a><a href="#">牙齿美白</a>
					</div>
				</li>
				<li>
					<div class="mfl_l"><img src="<%= basePath %>resources/images/mainbody/main_fa_l_7.png" /></div>
					<div class="mfl_r">
						<span>减肥塑形</span>
						<a href="#">吸脂</a><a href="#">丰臀提臀</a><a href="#">腰腹整形</a>
					</div>
				</li>
				<li>
					<div class="mfl_l"><img src="<%= basePath %>resources/images/mainbody/main_fa_l_8.png" /></div>
					<div class="mfl_r">
						<span>生殖</span>
						<a href="#">处女膜</a><a href="#">阴道</a><a href="#">包皮</a><a href="#">阴茎</a>
					</div>
				</li>
			</ul>
			<div id="main_fa_r"><!-- 展示图 -->
				<div id="main_fa_r_1">
					<div class="hd">
						<ul>
							<li><div><span class="title">${ad1[0].title}</span><span class="intro">${ad1[0].intro}</span></div></li>
							<li><div><span class="title">${ad1[1].title}</span><span class="intro">${ad1[1].intro}</span></div></li>
							<li><div><span class="title">${ad1[2].title}</span><span class="intro">${ad1[2].intro}</span></div></li>
							<li><div><span class="title">${ad1[3].title}</span><span class="intro">${ad1[3].intro}</span></div></li>
							<li><div><span class="title">${ad1[4].title}</span><span class="intro">${ad1[4].intro}</span></div></li>
						</ul>
					</div>
					<div class="bd">
						<ul>
							<li>
								<div class="pic"><a href="#"><img src="<%= basePath %>${ad1[0].image}" /></a></div>
							</li>
							<li>
								<div class="pic"><a href="#"><img src="<%= basePath %>${ad1[1].image}" /></a></div>
							</li>
							<li>
								<div class="pic"><a href="#"><img src="<%= basePath %>${ad1[2].image}" /></a></div>
							</li>
							<li>
								<div class="pic"><a href="#"><img src="<%= basePath %>${ad1[3].image}" /></a></div>
							</li>
							<li>
								<div class="pic"><a href="#"><img src="<%= basePath %>${ad1[4].image}" /></a></div>
							</li>
						</ul>
					</div>
				</div>
				<div id="main_fa_r_2">
					<div id="main_fa_r_2_l">
						<div class="content">
							<span>${hotTopic.title }</span>
							<p>${hotTopic.intro}</p>
							<ul>
								<li><a href="<%= basePath %>article/${articles1[0].id}">${articles1[0].title}</a></li>
								<li><a href="<%= basePath %>article/${articles1[1].id}">${articles1[1].title}</a></li>
								<li><a href="<%= basePath %>article/${articles1[2].id}">${articles1[2].title}</a></li>
								<li><a href="<%= basePath %>article/${articles1[3].id}">${articles1[3].title}</a></li>
							</ul>
						</div>
						<div class="content">
							<span>${tecTopic.title }</span>
							<p>${tecTopic.intro }</p>
							<ul>
								<li><a href="<%= basePath %>article/${articles2[0].id}">${articles2[0].title}</a></li>
								<li><a href="<%= basePath %>article/${articles2[1].id}">${articles2[1].title}</a></li>
								<li><a href="<%= basePath %>article/${articles2[2].id}">${articles2[2].title}</a></li>
								<li><a href="<%= basePath %>article/${articles2[3].id}">${articles2[3].title}</a></li>
							</ul>
						</div>
					</div>
					<div id="main_fa_r_2_hospital">
						<div class="hd">
							<ul><li>1</li><li>2</li><li>3</li><li>4</li></ul>
						</div>
						<div class="bd">
							<ul>
								<li><a href="#"><img src="<%= basePath %>${ad2[0].image}" /></a></li>
								<li><a href="#"><img src="<%= basePath %>${ad2[1].image}" /></a></li>
								<li><a href="#"><img src="<%= basePath %>${ad2[2].image}" /></a></li>
								<li><a href="#"><img src="<%= basePath %>${ad2[3].image}" /></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<div class="clear"></div>
		</div>
		<div id="main_tou">
			<div id="main_tou_l"><!-- 签约明星&热门精选 -->
				<div id="main_tou_l_1">
					<div class="title1">最 美 达 人</div>
					<div id="main_tou_l_1_content">
						<div class="bd">
							<ul class="picList">
								<li><div class="pic"><a href="#"><img src="<%= basePath %>${stars1[0].image}" /></a></div></li>
								<li><div class="pic"><a href="#"><img src="<%= basePath %>${stars1[1].image}" /></a></div></li>
								<li><div class="pic"><a href="#"><img src="<%= basePath %>${stars1[2].image}" /></a></div></li>
								<li><div class="pic"><a href="#"><img src="<%= basePath %>${stars1[3].image}" /></a></div></li>
								<li><div class="pic"><a href="#"><img src="<%= basePath %>${stars1[4].image}" /></a></div></li>
								<li><div class="pic"><a href="#"><img src="<%= basePath %>${stars1[0].image}" /></a></div></li>
								<li><div class="pic"><a href="#"><img src="<%= basePath %>${stars1[1].image}" /></a></div></li>
								<li><div class="pic"><a href="#"><img src="<%= basePath %>${stars1[2].image}" /></a></div></li>
								<li><div class="pic"><a href="#"><img src="<%= basePath %>${stars1[3].image}" /></a></div></li>
								<li><div class="pic"><a href="#"><img src="<%= basePath %>${stars1[4].image}" /></a></div></li>
								<li><div class="pic"><a href="#"><img src="<%= basePath %>${stars1[0].image}" /></a></div></li>
								<li><div class="pic"><a href="#"><img src="<%= basePath %>${stars1[1].image}" /></a></div></li>
								<li><div class="pic"><a href="#"><img src="<%= basePath %>${stars1[2].image}" /></a></div></li>
								<li><div class="pic"><a href="#"><img src="<%= basePath %>${stars1[3].image}" /></a></div></li>
								<li><div class="pic"><a href="#"><img src="<%= basePath %>${stars1[4].image}" /></a></div></li>
							</ul>
						</div>
						<div class="hd">
							<ul></ul>
						</div>
					</div>
				</div>
				<div id="main_tou_l_2">
					<div class="title1">热 门 精 选</div>
					<div id="main_tou_l_2_content">
						<div id="main_tou_l_2_l">
							<div class="im_title">
								<a href="#"><img src="<%= basePath %>resources/images/mainbody/main_tou_l_2_content_avatar01.png" /></a>
								<div class="intro"><a href="#">
									<span>韩式隆鼻</span>
									韩式隆鼻是通过微创的方式，先进的技术将鼻子垫高...
								</a></div>
								<div class="user"><a href="#">
									<img src="<%= basePath %>resources/images/mainbody/main_tou_l_2_content_avatar01_s.png" />
									<span>RoVi薇薇</span>
								</a></div>
							</div>
							<ul>
								<li><a href="#" class="class">隆胸</a><a href="#" class="title">一招搞定飞机场 sexy&amp;cute</a><span class="time">1分钟前</span></li>
								<li><a href="#" class="class">除皱</a><a href="#" class="title">注射除皱焕青春</a><span class="time">49分钟前</span></li>
								<li><a href="#" class="class">双眼皮</a><a href="#" class="title">开启心灵的窗口让你更有味道</a><span class="time">1小时前</span></li>
							</ul>
						</div>
						<div id="main_tou_l_2_m">
							<div class="im_title">
								<a href="#"><img src="<%= basePath %>resources/images/mainbody/main_tou_l_2_content_avatar02.png" /></a>
								<div class="intro"><a href="#">
									<span>下巴整形</span>
									下巴整形是一种非常常见的面部整形手术，是指通过削骨的方法...
								</a></div>
								<div class="user"><a href="#">
									<img src="<%= basePath %>resources/images/mainbody/main_tou_l_2_content_avatar02_s.png" />
									<span>千金妞子</span>
								</a></div>
							</div>
							<ul>
								<li><a href="#" class="class">护肤</a><a href="#" class="title">种草专场：2014最值得买的单品</a><span class="time">8分钟前</span></li>
								<li><a href="#" class="class">减肥</a><a href="#" class="title">胖妞！不减肥也要美</a><span class="time">12小时前</span></li>
								<li><a href="#" class="class">八卦</a><a href="#" class="title">娱乐圈年龄不是事</a><span class="time">14小时前</span></li>
							</ul>
						</div>
						<ul id="main_tou_l_2_r">
							<li class="t on">
								<span class="num">1</span>
								<div>
									<div class="pubpic"><a href="#"><img src="<%= basePath %>resources/images/mainbody/avatar07.png"></a></div>
									<div class="pubtitle"><a href="#">我们都是韩妆控</a><span class="people">19554人</span></div>
								</div>
							</li>
							<li class="t">
								<span class="num">2</span>
								<div>
									<div class="pubpic"><a href="#"><img src="<%= basePath %>resources/images/mainbody/avatar07.png"></a></div>
									<div class="pubtitle"><a href="#">❤胖妞！不减肥也要美</a><span class="people">47507人</span></div>
								</div>
							</li>
							<li class="t">
								<span class="num">3</span>
								<div>
									<div class="pubpic"><a href="#"><img src="<%= basePath %>resources/images/mainbody/avatar07.png"></a></div>
									<div class="pubtitle"><a href="#">我们都是韩妆控</a><span class="people">19554人</span></div>
								</div>
							</li>
							<li>
								<span class="num">4</span>
								<div>
									<div class="pubpic"><a href="#"><img src="<%= basePath %>resources/images/mainbody/avatar07.png"></a></div>
									<div class="pubtitle"><a href="#">我们都是韩妆控</a><span class="people">19554人</span></div>
								</div>
							</li>
							<li>
								<span class="num">5</span>
								<div>
									<div class="pubpic"><a href="#"><img src="<%= basePath %>resources/images/mainbody/avatar07.png"></a></div>
									<div class="pubtitle"><a href="#">我们都是韩妆控</a><span class="people">19554人</span></div>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div id="main_tou_r">
				<div class="title">广告位</div>
				<a href="#" class="ad"><img src="<%= basePath %>${ad3[0].image}"></a>
				<a href="#" class="ad"><img src="<%= basePath %>${ad3[1].image}"></a>
				<a href="#" class="ad"><img src="<%= basePath %>${ad3[2].image}"></a>
				<a href="#" class="ad"><img src="<%= basePath %>${ad3[3].image}"></a>
				
			</div>
			<div class="clear"></div>
		</div>
		<div id="main_jing">
			<div class="title">最流行的项目</div>
			<div class="col">
				<a href="#"><img src="<%= basePath %>resources/images/mainbody/image011.jpg" /><span>韩式隆鼻</span><p>韩式隆鼻是通过微创的方式，先进的技术将鼻子垫高，而是借助医学美学原理将隆鼻达到调整脸部宽窄、长短、景深，脸部面容欢悦、和善、平静。</p></a>
				<a href="#"><img src="<%= basePath %>resources/images/mainbody/image012.jpg" /><span>鼻尖整形</span><p>鼻尖整形术主要是通过手术的方式纠正先天和后天的鼻尖不正或者鼻尖肥大。</p></a>
				<a href="#"><img src="<%= basePath %>resources/images/mainbody/image013.jpg" /><span>韩式双眼皮</span><p>“韩式双眼皮手术”只在上睑两端各开一个小孔式切口。抽取脂肪、拉紧皮肤后，能形成自然双眼皮，术后不留痕迹。</p></a>
			</div>
			<div class="col">
				<a href="#"><img src="<%= basePath %>resources/images/mainbody/image014.jpg" /><span>眼袋去除</span><p>眼袋去除是在离下眼睑睫毛缘2-3毫米的地方切口，去除多余的眶膈脂肪、眼轮匝肌和松弛的下眼睑皮肤。</p></a>
				<a href="#"><img src="<%= basePath %>resources/images/mainbody/image015.jpg" /><span>下巴整形</span><p>下巴整形是一种非常常见的面部整形手术，是指通过削骨的方法或是填充的方法改变下巴的形状，达到理想中的下巴形状，是现代人比较能接受的一种整形美容手术，下巴整形主要适用于下巴较短、下巴后缩和下巴过于发达的情况，通过修饰下巴曲线使其符合美学标准。</p></a>
			</div>
			<div class="col">
				<a href="#"><img src="<%= basePath %>resources/images/mainbody/image016.jpg" /><span>下巴整形</span><p>下巴整形是一种非常常见的面部整形手术，是指通过削骨的方法或是填充的方法改变下巴的形状，达到理想中的下巴形状，是现代人比较能接受的一种整形美容手术，下巴整形主要适用于下巴较短、下巴后缩和下巴过于发达的情况，通过修饰下巴曲线使其符合美学标准。</p></a>
				<a href="#"><img src="<%= basePath %>resources/images/mainbody/image017.jpg" /><span>额头填充</span><p>额头填充是采用填充材料在局部上加额头、高眉弓。</p></a>
				<a href="#"><img src="<%= basePath %>resources/images/mainbody/image018.jpg" /><span>面部提紧术</span><p>面部提紧术是将面部松弛的皮肤向后向上提紧，切除多余的皮肤，同时将面部深部筋膜层也拉紧，切口多选在发际内，耳旁或耳后隐蔽处，术后效果通常十分显著。</p></a>
			</div>
			<div class="col">
				<a href="#"><img src="<%= basePath %>resources/images/mainbody/image019.jpg" /><span>韩式隆胸</span><p>韩式隆胸是在传统丰胸方法上加以改进，是目前丰胸术中较为先进、有效的一种。在材料的选择上，选用的是安全、无副作用的隆胸材料，有效避免了术后一些不必要的烦恼。手术切口也更为科学，基本不留疤痕。</p></a>
				<a href="#"><img src="<%= basePath %>resources/images/mainbody/image020.jpg" /><span>腹部吸脂</span><p>腹部吸脂是将皮下深层脂肪吸出，而留下紧贴表层皮肤约1厘米厚的浅层脂肪，大量的肥大的脂肪细胞被吸出，使局部的脂肪层变得很薄，使腰围变细。</p></a>
			</div>
			<div class="col">
				<a href="#"><img src="<%= basePath %>resources/images/mainbody/image021.jpg" /><span>提臀手术</span><p>提臀手术的重点在于减小臀围，将松弛下垂的部分修饰上提，缩小臀围的宽度，适当调整臀部后翘的高度，减少臀上部的脂肪，使从腰到臀部的曲线圆滑流畅，减少大腿根部脂肪，使大腿显得优美而修长。</p></a>
				<a href="#"><img src="<%= basePath %>resources/images/mainbody/image022.jpg" /><span>注射除皱</span><p>注射除皱是通过在面部注射填充修复皱纹，从而达到除皱的效果，现在注射除皱的材料有很多种，目前常用的注射除皱材料有伊维兰、玻尿酸、胶原蛋白、自体脂肪、botox等，都具有立竿见影的效果，这个也是近来很多人选择注射除皱的原因。</p></a>
			</div>
			<div class="clear"></div>
		</div>
		<div id="main_xiong">
			<div class="title">最受欢迎的医生</div>
			<ul>
				<li><a href="#"><img src="<%= basePath %>resources/images/mainbody/doc1.jpg" /></a><a href="#" class="name">王医生</a>
				<a href="#" class="hospital">中国医学科学院整形外科医院</a></li>
				<li><a href="#"><img src="<%= basePath %>resources/images/mainbody/doc2.jpg" /></a><a href="#" class="name">李医生</a>
				<a href="#" class="hospital">首都医科大学附属北京同仁医院整形美容</a></li>
				<li><a href="#"><img src="<%= basePath %>resources/images/mainbody/doc3.jpg" /></a><a href="#" class="name">白医生</a>
				<a href="#" class="hospital">中国医学科学院北京协和医院整形外科(西安)</a></li>
				<li><a href="#"><img src="<%= basePath %>resources/images/mainbody/doc4.jpg" /></a><a href="#" class="name">赵医生</a>
				<a href="#" class="hospital">首都医科大学附属北京同仁医院整形美容医院</a></li>
				<li><a href="#"><img src="<%= basePath %>resources/images/mainbody/doc1.jpg" /></a><a href="#" class="name">钱医生</a>
				<a href="#" class="hospital">北京东方和谐医疗美容诊所</a></li>
				<li><a href="#"><img src="<%= basePath %>resources/images/mainbody/doc2.jpg" /></a><a href="#" class="name">陈医生</a>
				<a href="#" class="hospital">上海交通大学医学院附属第九人民医院整</a></li>
				<li><a href="#"><img src="<%= basePath %>resources/images/mainbody/doc3.jpg" /></a><a href="#" class="name">孙医生</a>
				<a href="#" class="hospital">中国医学科学院北京协和医院整形外科(西安)</a></li>
				<li><a href="#"><img src="<%= basePath %>resources/images/mainbody/doc4.jpg" /></a><a href="#" class="name">周医生</a>
				<a href="#" class="hospital">首都医科大学附属北京同仁医院整形美容医院</a></li>
				<li><a href="#"><img src="<%= basePath %>resources/images/mainbody/doc1.jpg" /></a><a href="#" class="name">吴医生</a>
				<a href="#" class="hospital">中国医学科学院整形外科医院</a></li>
				<div class="clear"></div>
			</ul>
		</div>
		<div id="main_fu">
			<div class="title">医院分类</div>
			<table cellspacing="1">
				<tr>
					<th>眼部</th>
					<th>鼻部</th>
					<th>胸部</th>
					<th>面部轮廓</th>
					<th>除皱</th>
				</tr>
				<tr>
					<td><ul>
						<li><a href="#">解放军海军总医院</a></li>
						<li><a href="#">北京美莱</a></li>
						<li><a href="#">重庆西南医院</a></li>
						<li><a href="#">上海百达丽</a></li>
						<li><a href="#">北京协和医院</a></li>
					</ul></td>
					<td><ul>
						<li><a href="#">上海九院</a></li>
						<li><a href="#">西安西京医院</a></li>
						<li><a href="#">北京美莱</a></li>
						<li><a href="#">解放军二炮总医院</a></li>
						<li><a href="#">上海百达丽</a></li>
					</ul></td>
					<td><ul>
						<li><a href="#">八大处医院</a></li>
						<li><a href="#">上海长征医院</a></li>
						<li><a href="#">重庆西南医院</a></li>
						<li><a href="#">北京华韩</a></li>
						<li><a href="#">北京东方和谐</a></li>
					</ul></td>
					<td><ul>
						<li><a href="#">解放军海军总医院</a></li>
						<li><a href="#">北京美莱</a></li>
						<li><a href="#">重庆西南医院</a></li>
						<li><a href="#">上海百达丽</a></li>
						<li><a href="#">北京协和医院</a></li>
					</ul></td>
					<td><ul>
						<li><a href="#">解放军海军总医院</a></li>
						<li><a href="#">北京美莱</a></li>
						<li><a href="#">重庆西南医院</a></li>
						<li><a href="#">上海百达丽</a></li>
						<li><a href="#">北京协和医院</a></li>
					</ul></td>
				</tr>
				<tr>
					<th>吸脂/自体脂肪</th>
					<th>玻尿酸/肉毒素</th>
					<th>激光美容</th>
					<th>皮肤美容</th>
					<th>毛发移植</th>
				</tr>
				<tr>
					<td><ul>
						<li><a href="#">解放军海军总医院</a></li>
						<li><a href="#">北京美莱</a></li>
						<li><a href="#">重庆西南医院</a></li>
						<li><a href="#">上海百达丽</a></li>
						<li><a href="#">北京协和医院</a></li>
					</ul></td>
					<td><ul>
						<li><a href="#">上海九院</a></li>
						<li><a href="#">西安西京医院</a></li>
						<li><a href="#">北京美莱</a></li>
						<li><a href="#">解放军二炮总医院</a></li>
						<li><a href="#">上海百达丽</a></li>
					</ul></td>
					<td><ul>
						<li><a href="#">八大处医院</a></li>
						<li><a href="#">上海长征医院</a></li>
						<li><a href="#">重庆西南医院</a></li>
						<li><a href="#">北京华韩</a></li>
						<li><a href="#">北京东方和谐</a></li>
					</ul></td>
					<td><ul>
						<li><a href="#">解放军海军总医院</a></li>
						<li><a href="#">北京美莱</a></li>
						<li><a href="#">重庆西南医院</a></li>
						<li><a href="#">上海百达丽</a></li>
						<li><a href="#">北京协和医院</a></li>
					</ul></td>
					<td><ul>
						<li><a href="#">解放军海军总医院</a></li>
						<li><a href="#">北京美莱</a></li>
						<li><a href="#">重庆西南医院</a></li>
						<li><a href="#">上海百达丽</a></li>
						<li><a href="#">北京协和医院</a></li>
					</ul></td>
				</tr>
			</table>
		</div>
		<div id="main_wei">
			<div class="hd">
				医院优惠信息
				<a class="next"></a>
				<a class="prev"></a>
			</div>
			<div class="bd">
				<ul class="infoList">
					<li><a href="#">杭州华天整形美容医院9月优惠活动</a><span>[11-11]</span></li>
					<li><a href="#">新星靓店庆送豪礼</a><span>[11-11]</span></li>
					<li><a href="#">献给妈妈特别的爱--2013长沙协雅母亲节整形...</a><span>[04-07]</span></li>
					<li><a href="#">10年老店--长沙协雅整形医院浓情五月•感恩...</a><span>[11-11]</span></li>
					<li><a href="#">洛阳华美“水晶鞋”圆梦大行动将盛大开启</a><span>[11-11]</span></li>
					<li><a href="#">儿女整形爱心低价 感恩妈妈免费美容</a><span>[11-11]</span></li>
				</ul>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="footer_fa"></div>
		<ul id="footer_tou">
			<li><a href="#">新浪微博</a></li>
			<li><a href="#">腾讯微博</a></li>
			<li><a href="#">微信</a></li>
		</ul>
		<div id="footer_jing">本站声明：任何信息都不能替代执业医师面对面的诊断和治疗，网站内容仅供读者参考，本站不承担由此引起的法律责任。医院和医生信息正在不断添加中。</div>
		<div id="footer_xiong">浙ICP证    号  浙ICP备      号  浙公网安备   号  (浙) -经营性-2013-0058  经营性网站备案信息  浙卫网审[2013]第0096号</div>
		<div id="footer_fu">Copyright &copy; imeiwang.cn. All Rights Reserved.</div>
		<div id="footer_wei"></div>
	</div>
</div>





<script type="text/javascript">
jQuery("#main_fa_r_1").slide({mainCell:".bd ul",effect:"top",autoPlay:true,triggerTime:0});
jQuery("#main_fa_r_2_hospital").slide({mainCell:".bd ul",effect:"fold",autoPlay:true});
jQuery("#main_tou_l_1_content").slide({titCell:".hd ul",mainCell:".bd ul",autoPage:true,effect:"left",autoPlay:true,scroll:5,vis:5});
jQuery("#main_tou_l_2_r li").hover(function() {$(this).addClass("on").siblings().removeClass("on")},function(){});

jQuery("#main_wei").slide({mainCell:".bd ul",autoPlay:true,effect:"leftMarquee",vis:5,interTime:20});
</script>
  </body>
</html>
