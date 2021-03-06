<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.address-resources"/>
<html>
<head>
<title>View <fmt:message key="address.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="address.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexAddress"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="address.id.title"/>:
						</td>
						<td>
							${address.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="address.name.title"/>:
						</td>
						<td>
							${address.name}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="product.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newAddressProducts?address_id=${address.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="product.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="product.id.title"/></th>
						<th class="thead"><fmt:message key="product.batch.title"/></th>
						<th class="thead"><fmt:message key="product.number.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${address.products}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectAddressProducts?address_id=${address.id}&products_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editAddressProducts?address_id=${address.id}&products_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteAddressProducts?address_id=${address.id}&related_products_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							${current.batch}
						&nbsp;
						</td>
						<td>
							${current.number}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>