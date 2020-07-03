# API Testing Framework for Studio Ghibli Films

<p align="center">
  <img src="https://i.imgur.com/oprn9Qn.png?1" />
</p>

## Background

This application uses two dependencies from Maven repository in the pom.xml file:

  - Jackson
  - Junit 
  
 > Please update it to the latest version if needed
 
 <br />
 
 Classes within the project structure:
 
  - GhibliFilmPOJO
  - GhibliFilmTest
  - ResponseReader
  - ResponseTest
  - FileURLReader
  
## Manual
  
This is a guide on how to use this application.

> It is not required to do these instructions in sequence.

<br />

Place the required URL into ResponseTest class to check:

  - response code (200 OK/404 Not Found)
  - API headers (15 for this API)
  
<br />

Place the required URL or JSON file path into GhibliFilmTest class to check:

  - JSON payload (13 for this API)

> Need to create new JSON file containing the data in the resource directory if using file path method.  

