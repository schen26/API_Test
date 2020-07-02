# API Testing Framework for Studio Ghibli Films

<p align="center">
  <img src="https://i.imgur.com/oprn9Qn.png?1" />
</p>

## Manual

This is a guide on how to use this application.

### Background

This application uses two dependencies from Maven repository in the pom.xml file:
  - Jackson
  - Junit 

> It is not required to do these instructions in sequence.

<br />

Place the required URL into ResponseTest class to check:
  - response code (200 OK/404 Not Found)
  - API headers (numbers vary from API to API)
  
<br />

Place the required URL or JSON file path into GhibliFilmTest class to check:
  - JSON payload

> Need to create new JSON file containing the data in the resource directory if using file path method.  

