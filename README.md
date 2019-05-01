# Foursquare-Java-API
Java class containing functions to interact with the [Foursquare Places API](https://developer.foursquare.com/docs/api).
# Features:

- Query nearby venues by name
- Search nearby venues by category ID
- Add new venues.
- Get details on venue using venue ID.


## Usage:
#### Requirements:
You first need to create a [Foursquare](https://foursquare.com/developers) dev account, then create an App to get your credentials, which go here:
```java
    private static final String CLIENTID = "YOUR_CLIENT_ID";
	private static final String CLIENTSECRET = "YOUR_CLIENT_SECRET";
	private static final String OAUTH = "YOUR_OAUTH_TOKEN";
```
Now you are ready to implement the class in your project, to use the class methods, you need to create a `Request` object:
```java
    Request request = new Request();
```
then use this object to call for methodes as fellows:
```java
   ArrayList<place> Place places = request.getNearbyPlaces("query","McDonalds","10000","40.7128,74.0060");
```
#### Functionalities:
##### query nearby venues:
we use the following method to query nearby places:
```java
   public ArrayList<Place> getNearbyPlaces(String option, String queryOrCategoryID, String radius, String location) throws IOException, JSONException
```
It takes 4 arguments:
- **`option`** : this can either be set to `"category"` or `"query"`, based on wether we want our search to be based on venues category ID or venue's name, for more details on category IDs check the following [link](https://developer.foursquare.com/docs/resources/categories).
- **`queryOrCategoryID`** : this variable contains the ID of the category you're looking for or a vanue name.
- **`radius`** : this variable represents the search radiud from location defined in next vatiable.
- **`location`** : this variable has *longitude* and *latitude* of center of search circle.

The following query returns all **McDonald's** restaurants with an accuracy of 10 Kms from the center of **New York City**, then stocks the venues in an `ArrayList<Place>` defined as `restaurants`:
```java
   ArrayList<place> Place restaurants = request.getNearbyPlaces("query","McDonalds","10000","40.7128,74.0060");
```
We could also do a search for all **fast food restaurants** in the same area using Fast Food Category ID which is `4bf58dd8d48988d16e941735`:
```java
   ArrayList<place> Place restaurants = request.getNearbyPlaces("category","4bf58dd8d48988d16e941735","10000","40.7128,74.0060");
```
##### query venue by ID:
In the event that a venue's ID is provided and you require extra details about a venue, this method is useful for such case:
```java
public Place getPlaceDetails(String id) throws IOException, JSONException
```
this function takes one argument **`id`** and returns a `Place` object.
##### Create a new Venue:
If a venue doesn't exist in the Foursquare venues database, it is possible to create a new Venue using the following method:
```java
public Place createNewPlace(String name, String location, String categoryID) throws IOException, JSONException
```
It takes 3 arguments:
- **`name`** : this variable contains the name of the new Venue.
- **`CategoryID`** : this variable contains the ID of the category you're creating, for more details on category IDs check the following [link](https://developer.foursquare.com/docs/resources/categories).
- **`location`** : this variable has *longitude* and *latitude* of the Venue.

For information about the style guide for adding places, check this [link](https://support.foursquare.com/hc/en-us/articles/201064960-What-is-the-style-guide-for-adding-and-editing-places-) for community guidelines.

you can call out to this method as follows:
```java
Place new_McDonalds = request.createNewPlace("McDonalds - Test","1.23456,9.87654","4bf58dd8d48988d16e941735");
```
In case the `"McDonalds - Test" is a duplicate venue, nothing will be inserted and the function will return the existing Venue instead.`
