// Filename: router.js
define([
    'jquery',
    'underscore',
    'backbone'
    //'views/games',
    //'views/users'
    ], function($, _, Backbone){
        var AppRouter = Backbone.Router.extend({
            routes: {

            }
        });

        var initialize = function(){
            
            console.log('router not yet configured' + AppRouter);
            return;
        };
        return {
            initialize: initialize
        };
    });