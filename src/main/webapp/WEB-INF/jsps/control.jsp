<%@include file="common/include.jsp"%>


<div class="body">
	<h2>My Control</h2>


	<form:form action=""  commandName="cacheBean">

		<form:select path="item">
			<form:option value="NONE" label="--- Select ---" />
			<form:options items="${items}" />
		</form:select>

		<br>
		<br>
		<br>


		<form:select path="person">
			<form:option value="NONE" label="--- Select ---" />
			<form:options items="${persons}"  />
		</form:select>

	</form:form>


</div>

