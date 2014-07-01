<%@include file="common/include.jsp"%>


<div class="body">
	<h2>My Control</h2>

<p><c:out value="${mytest}"></c:out></p>

	<form:form action="${controlresult_url}" commandName="cacheBean" method ="post" >

		<form:select path="item1_content" >
			<form:option value="NONE" label="--- Select ---" />
			<form:options items="${item1}" />
		</form:select>

		<br>
		<br>
		<br>


		<form:select path="item2_content" >
			<form:option value="NONE" label="--- Select ---" />
			<form:options items="${item2}"  />
		</form:select>

		<br>
		<br>
		<br>


		<form:select path="item3_content">
			<form:option value="NONE" label="--- Select ---" />
			<form:options items="${item3}" />
		</form:select>

		<br>
		<br>
		<br>


		<form:select path="item4_content">
			<form:option value="NONE" label="--- Select ---" />
			<form:options items="${item4}"  />
		</form:select>

		<br>

		<input type="submit" value="submit" />

	</form:form>


</div>

