<%@include file="include.jsp"%>

<div class="menu">


	Menu
	<ul>
		<li><a href='${en_locale}'><spring:message code="english" />
		</a>| <a href='${fr_locale}'><spring:message code="french" /> </a></li>


		<li><a href='${home_url}'><spring:message code="title.home" /></a></li>

		<li><a href='${control_url}'><spring:message code="title.control" /></a></li>

	</ul>
</div>

