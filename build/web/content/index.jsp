<%-- 
    Document   : index
    Created on : Jan 12, 2013, 3:00:09 PM
    Author     : Inspektor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="libs/jquery/jquery.js"></script>

        <script type="text/javascript">
            $(function() {
                $.ajax({
                    url: '/MinuteMath/resources/entities.users', 
                    contentType: 'application/json',
                    dataType: 'json',
                    success: function(users){
                        if (users) {
                            for (var i = 0; i < users.length; i++) {
                                $('#users').append($('<div><a href="#" class="login">' + users[i].lastName + ', ' + users[i].firstName + ': ' + users[i].role.roleName + '</a></div>'));
                            } 
                        }
                    }
                });
                
                $('#users').on('click', '.login', function(e) {
                    alert(window.prompt('what is your password', '')); 
                    
                    return false;
                });
                
            });
        </script>
    </head>
    <body>
        <%
            // This is a scriptlet.  Notice that the "date"
            // variable we declare here is available in the
            // embedded expression later on.
            System.out.println("Evaluating date now");
            java.util.Date date = new java.util.Date();
        %>
        <div><%= date%></div> 
        <h1>Users</h1>
        <div id="users"></div>

    </body>
</html>
