## Contents

This is a maven archetype that allows you to spawn services with the same agreed structure
 - service-app
 - service-data
 - service-domain
 - service-rest

It will contain also commons stuff like packages, common classes, configs, yml files. Some of them must be renamed but todos should be in place.

## How to use it

1. Make sure you are in the right directory(where the archetype parent pom is)
```
 mvn clean install
```
 This will install the archetype in the local catalog
 
2. Navigate to your work/projects folder (or any folder) and type
```
 mvn archetype:generate -DarchetypeCatalog=local
```
3. This will provide you an interactive console

```
  [INFO] Generating project in Interactive mode
  [INFO] No archetype defined. Using maven-archetype-quickstart (org.apache.maven.archetypes:maven-archetype-quickstart:1.0)
  Choose archetype:
  1: local -> com.soltean.service:maven-archetype (Archetype for spawning services)
  Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): :
```
4. Enter 1 and hit enter. You will need to fill the following properties
 
```
   Define value for property 'groupId': com.soltean.service 
   Define value for property 'artifactId': test
   Define value for property 'version' 1.0-SNAPSHOT: :
   Define value for property 'package' com.soltean.service: 
   [INFO] Using property: rootArtifactId = com.soltean.service
   Confirm properties configuration:
   groupId: com.soltean.service
   artifactId: test
   version: 1.0-SNAPSHOT
   package: com.soltean.service
   rootArtifactId: com.soltean.service
    Y: :
```
5. Confirm this values by writing Y and hit enter
```
  Y: : Y
```
   
#6. If everything went according to plan you should see
 
```
[INFO] Parent element not overwritten in /Users/sergiuoltean/work/test/test-domain/pom.xml
[INFO] Parent element not overwritten in /Users/sergiuoltean/work/test/test-data/pom.xml
[INFO] Parent element not overwritten in /Users/sergiuoltean/work/test/test-app/pom.xml
[INFO] Parent element not overwritten in /Users/sergiuoltean/work/test/test-rest/pom.xml
[INFO] Project created from Archetype in dir: /Users/sergiuoltean/work/test
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------

```
 
#####7. Check the directory structure
```
 Sergius-MacBook-Pro:test sergiuoltean$ ls -l
 total 8
 drwxr-xr-x  4 sergiuoltean  staff   128 Jan 22 11:36 test-app
 drwxr-xr-x  4 sergiuoltean  staff   128 Jan 22 11:36 test-data
 drwxr-xr-x  4 sergiuoltean  staff   128 Jan 22 11:36 test-domain
 drwxr-xr-x  4 sergiuoltean  staff   128 Jan 22 11:36 test-rest
 -rw-r--r--  1 sergiuoltean  staff  1675 Jan 22 11:36 pom.xml
```
 
 That's all folks.
