<!-- page implicit objects -->
<%
pageContext.setAttribute("P","page");
request.setAttribute("R","request");
session.setAttribute("S","session");
application.setAttribute("A","application");
pageContext.forward("./disp.jsp");
%>

