//Filename: users.js

define([
    // These are path alias that we configured in our bootstrap
    'jquery',     // libs/jquery/jquery
    'underscore', // libs/underscore
    'backbone'    // libs/backbone
    ], function($, _, Backbone){
        var init = function() {
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
        }
        return {init: init};
    // What we return here will be used by other modules
    });

