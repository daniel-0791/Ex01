<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>	
    <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
<!DOCTYPE html>
<html>
<head>
 <base href="<%=basePath%>"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
		h4{text-align: center;}
		.list{
			width:100%;
			position:absolute;
		}
        table{
            border-collapse:collapse;
            position:relative;
            left:180px;
        }
        td,th{
            width:100px;
            height:50px;
            border:1px solid black;
            text-align:center;
        }
</style>
</head>
<body>
     <!--<div><input type="button" value="新增" id="add"></div> -->
     <h4>商品列表</h4>
    
     <form action="cartservlet" method=post ><button type="submit" >查看购物车</button></form>
    <br>
	<div class="list">
        <table>
            <tr>
                <th>book_ID</th>
                <th>book_ISBN</th>
                <th>book_Name</th>
                <th>book_Author</th>
                <th>price</th>
                <th>operation</th>
               
            </tr>
		<c:forEach items="${allBookt}" var="bookt" varStatus="status">
            <tr>
          		 <td>${status.index + 1}</td> 
                <td>${bookt.book_ISBN }</td>
                <td>${bookt.book_Name }</td>
                <td>${bookt.book_Author }</td>
                <td>${bookt.price }</td>
                <td><input type="button" value="购买" onclick="buy(${bookt.book_ID})"></td>
                  </tr>
        </c:forEach> 
        </table>
    </div>
    
    

	<script type="text/javascript">
	
	 function buy(book_ID){
	        window.location = "${pageContext.request.contextPath}/BuyServlet?book_ID="+book_ID;
	    }
    </script>
	</body>
</html>