## Contents

#####This is a maven archetype that allows you to spawn services with the same agreed structure
 - service-app
 - service-data
 - service-domain
 - service-rest

It will contain also commons stuff like packages, common classes, configs, yml files. Some of them must be renamed but todos should be in place.

## How to use it

#####1. Make sure you are in the right directory(hub-archetype)
```
 mvn clean install
```
 This will install the archetype in the local catalog
 
#####2. Navigate to your work/projects folder (or any folder) and type
```
 mvn archetype:generate -DarchetypeCatalog=local
```
#####3. This will provide you an interactive console

```
  [INFO] Generating project in Interactive mode
  [INFO] No archetype defined. Using maven-archetype-quickstart (org.apache.maven.archetypes:maven-archetype-quickstart:1.0)
  Choose archetype:
  1: local -> com.winnowsolutions.hub:hub-archetype (Archetype for spawning hub services)
  Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): :
```
#####4. Enter 1 and hit enter. You will need to fill the following properties
 
```
   Define value for property 'groupId': com.winnowsolutions.hub 
   Define value for property 'artifactId': hub-user-management
   Define value for property 'version' 1.0-SNAPSHOT: :
   Define value for property 'package' com.winnowsolutions.hub: : com.winnowsolutions.hub.usermanagement
   Define value for property 'docker-image-name': hub-usermanagement
   [INFO] Using property: rootArtifactId = com.winnowsolutions.hub
   Confirm properties configuration:
   groupId: com.winnowsolutions.hub
   artifactId: hub-user-management
   version: 1.0-SNAPSHOT
   package: com.winnowsolutions.hub.usermanagement
   docker-image-name: hub-usermanagement
   rootArtifactId: com.winnowsolutions.hub
    Y: :
```
#####5. Confirm this values by writing Y and hit enter
```
  Y: : Y
```
   
#####6. If everything went according to plan you should see
 
```
[INFO] Parent element not overwritten in /Users/sergiuoltean/work/hub-user-management/hub-user-management-domain/pom.xml
[INFO] Parent element not overwritten in /Users/sergiuoltean/work/hub-user-management/hub-user-management-data/pom.xml
[INFO] Parent element not overwritten in /Users/sergiuoltean/work/hub-user-management/hub-user-management-app/pom.xml
[INFO] Parent element not overwritten in /Users/sergiuoltean/work/hub-user-management/hub-user-management-rest/pom.xml
[INFO] Project created from Archetype in dir: /Users/sergiuoltean/work/hub-user-management
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------

```
 
#####7. Check the directory structure
```
 Sergius-MacBook-Pro:hub-user-management sergiuoltean$ ls -l
 total 8
 drwxr-xr-x  4 sergiuoltean  staff   128 Jan 22 11:36 hub-user-management-app
 drwxr-xr-x  4 sergiuoltean  staff   128 Jan 22 11:36 hub-user-management-data
 drwxr-xr-x  4 sergiuoltean  staff   128 Jan 22 11:36 hub-user-management-domain
 drwxr-xr-x  4 sergiuoltean  staff   128 Jan 22 11:36 hub-user-management-rest
 -rw-r--r--  1 sergiuoltean  staff  1675 Jan 22 11:36 pom.xml
```
 
 That's all folks.