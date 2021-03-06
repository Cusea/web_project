<%@ page pageEncoding="UTF-8"%>

<div id="my_top">
	<div class="my_top_cover" style="background-image:url(${contextpath}/img/SH/top4.jpg); background-size:cover; center center;">
		<div class="my_top_title">여행Tip</div>
	</div>
	<div class="my_top_menu_box">
		<div class="my_top_menu_bg"></div>
		<div id="my_top_menu" class="my_top_menu">
			<a id="cl" href="${contextpath}/LSH/01cl.do" class="my_menu">클립보드</a>
			<a id="pl" href="${contextpath}/LSH/02pl.do" class="my_menu">여행일정</a>
			<a id="re" href="${contextpath}/LSH/03re.do" class="my_menu">리뷰</a>
			<a id="tip" href="${contextpath}/LSH/04tip.do" class="my_menu">여행Tip</a>
			<a id="qna" href="${contextpath}/LSH/05qna.do" class="my_menu">Q&A</a>
			<a id="set" href="${contextpath}/LSH/set.do" class="set">설정</a>
			<div class="clear"></div>
			<br><br>
			<div class="container">
				<ul class="nav nav-pills">
					<li class="nav-item"><a data-toggle="pill" href="#home">완성된 여행Tip</a></li>
					<h5>　|　</h5>
					<li><a data-toggle="pill" href="#menu1">작성중인 여행Tip</a></li>
					<h5>　|　</h5>
					<li><a data-toggle="pill" href="#menu2">좋아한 여행Tip</a></li>
					<h5>　　　　　　　　　　　　　　　　　　　　　　</h5>
					<li><button class="mtop_btn" target="_blank" onclick="location.href='${contextpath}/KBJ/TipofTravel.do';">여행Tip 만들기</button></li>
				</ul>
				<div class="tab-content">
					<div id="home" class="tab-pane fade in active">
						<p>완성완성!</p>
					</div>
					<div id="menu1" class="tab-pane fade">
							<img src="${contextpath}/img/SH/홍콩.jpg" class="box_img">
						<p>답변답변</p>
					</div>
				    <div id="menu2" class="tab-pane fade">
						<p>댕댕</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- 바디끝 -->

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>