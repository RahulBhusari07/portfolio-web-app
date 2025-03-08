
<%
                                  
                               String data=(String)session.getAttribute("msg");
                                  if(data!=null){
                                  %>
<h1 style="text-align: centre"><%=data%></h1>

<% 
    session.removeAttribute("msg");
                                  
                                  }
    
    
    
    %>