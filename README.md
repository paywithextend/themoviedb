# Extend Homework 

The task is to ingest data from a 3rd party API and present that data via a REST API or analogous function. Limit yourself to two hours

You should pull the movie data from The Movie DB (https://developers.themoviedb.org/3). You can use this API key - `aa0ea741dcbdabdf6fd9953b60e629cf`. Please load the top 20 movies from the past 5 years.

In order to present the data, construct a backend REST API with two endpoints:
1. `GET /movies` This endpoint should provide for a paginated (cursor based), sortable list of movie objects. This should be a list of 'lite' movie objects - enough for a front end client to draw an infinite scrolling list in a mobile app, but not the full object. Each call should not return the entire list of movies, but a subset based on the cursor position, count, and the direction of sort.
2. `GET /movies/:id` This endpoint should show the details of the full movie object.

Optionally you may add any searching or filtering on the GET /movies endpoint.
