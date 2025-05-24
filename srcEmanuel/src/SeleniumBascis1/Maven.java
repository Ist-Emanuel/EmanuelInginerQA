package SeleniumBascis1;

public class Maven {
    // sdk - softoar denvelop kid(adica inseamna ce java folosim)
    //READMe file - ne da niste informati despre proiect
    //gitignor - este toate fisierele care sunt ignorate si nu doresti sa apara in proiectul tau
}
//Definitie:
/*
Maven - build management tool for Java farmeworks(un tool care construeste proiectele Java). Se bazeaza pe conceptul
        de project object model (POM), astfel ca se poate ocupa de constructia proiectului (build), de raportare
        si documentare, totul dintr-un loc central de informatii.
 Avantajele:
  - Repository central pentru dependinte
  - Structura comuna a proiectului in cadrul organizatiei;
  - Flexibilitate in integrarea cu tool-uri de tip CI (continuous integration);
  - Plugin-uri pentru framework-uri de testare;
 */
/*ject object model (POM)
 */

/*
De retinut ca "Build", "Test", "Deploy", "Relase" partea acesta poate fi automatizata de catre prieteni nostri care sunt
pe DEV OPS, in care lucreaza cu tot felul de tuluri. Dar, se poate face si cu tool-ul acesta "MAVEN" cu care lucram noi, pentru ca
el poate gestiona toate aceste liftackuri.
 */
/*
Alt beneficiu a lui "MAVEN-ului" ar fi plugin-uri, adica plagin-uri este tot un fel de configuratie pe care o bagam tot intr-un
fisier  numit "POM.xml"(xmele se pronunta).
 */
/*
xml - sunt foarte comune in domeniul pec
xml - se folosec foarte mult in domeniul platilor intre banci
 */
/*
De retinut cand noi defineam o clasa in Java numele pachetului conteaza si clasa;
<project>
                         <groupId>org.example</groupId>
                         <artifactId>SelBasics</artifactId>
                         <version>1.0-SNAPSHOT</version>
                         <pakaging>jar</pakaging>
 groupId - ste pachet
 artifactId - clasa
 */

/*
<properties>
                        <project.build.sourceEcoding>UTF-8</project.build.sourceEcoding>
                        <maven.compiler.source>18</maven.compiler.source>
                        <maven.compiler.target>18</maven.compiler.target>
source - in ce Java lucram
target - in ce Java compilam
Acest cod de mai sus specifica ce Java folosim, dupa cum se vede folosim o versiune sdk(ce Java folosim) 18
 */

//De Retinut: <.....>    se numesc taguri

/*
<dependencies> (de retinut ca tagul acesta este la plural si inseamna ca ar trebuie sa-i spunem proiectului nostru
pe romaneste de ce sunt eu dependent.
Adica noi am fost dependenti de parinti asa este si MAVEN dependent de SELENIUM si de Junit(pronuntie:Jonet)
                                  <dependency>
                                  groupId org.seleniumhq.selenium groupId
                                  artifactId selenium selenium-java artifactId
                                  version 4.3.0 version
                                  </dependency>
Aici specificam ca avem nevoie de Selenium prin declararea unei "<dependency>"
                                  <dependency>
                                  groupId junit groupId
                                  artifactedId junit artifactedId
                                  scope test scope
                                  version 3.8.1 version
                                  </dependency>
Aici specificam ca avem nevoie de Junit prin declararea unei "<dependency>
 */
// Cam de asta se ocupa MAVEN;
// Astea se numesc taguri;

/*
CE STIE SA FACA MAVEN(MEIVAN) CU APLICATIA NOASTRA?
1. Clean(inseamna ca acel foldar il sterge) - este un "lifestackal"
2. Validate(inseamna ca totul este bine in proiect)
3. Compile = se pronunta compail(inseamna ca compileaza app.)
4. Test(inseamna ca ruleaza testele din app.)
5. Package(inseamna ca impacheteaza aplicatia,  adica face acel "jar")
6. Verify(inseamna ca verifica)
7. Instal(inseamna ca instaleaza si se uita de ce planigin-uri, ce dependinte am nevoie ca sa lucrez)
8. site
9. deploy(inseamna ca se duce si o instaleaza in infrastructura, in momentul cand putem sa spunem ca totul este in regula)


 */