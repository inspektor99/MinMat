// Filename: router.js
define([
    'jquery',
    'underscore',
    'backbone',
    'app'
    //'views/games',
    //'views/users'
    ], function($, _, Backbone, App){
        var AppRouter = Backbone.Router.extend({
            routes: {

            }
        });

        var initialize = function(){
            
            console.log('router not yet configured');
            return;
        };
        return {
            initialize: initialize
        };
    });