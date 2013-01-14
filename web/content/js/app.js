// Filename: app.js
define([
    'jquery',
    'underscore',
    'backbone',
    'router', // Request router.js
    'views/users'
    ], function($, _, Backbone, Router, Users){
        
        var initialize = function(){
            // Pass in our Router module and call its initialize function
            Router.initialize();
            Users.init();
        }

        return {
            initialize: initialize
        };
    });