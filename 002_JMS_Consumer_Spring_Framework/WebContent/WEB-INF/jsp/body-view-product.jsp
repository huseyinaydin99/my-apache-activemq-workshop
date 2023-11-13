<%@include file="/WEB-INF/jsp/taglibs.jsp"%>

<a>${product.name}</a>

</br>
</br>
</br>

<img width="200" height="200" src="${pageContext.request.contextPath}/img/${product.image}"/>

</br>
</br>

<a class="btn btn-primary" 
href="${pageContext.request.contextPath}/Products/Buy?productId=${product.id}" 
title="Buy">Satın Al</a>