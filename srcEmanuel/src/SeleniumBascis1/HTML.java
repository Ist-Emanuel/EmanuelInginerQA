package SeleniumBascis1;

public class HTML {
}
/*
HTML - este un limbaj de programare interpretat de browsere, prin HTML se defineste o structura paginii web;
Format din:
   -Tag-ul de <html> </html>
   -Tag-ul de <head> </head> (contine metadate, importuri de JavaScript, titlul pagini, browser-ul reandeaza(daneaza)
    pagina web in functie de aceste date)
   -Tag-ul de <body> </body> (contine toate elementele paginii web sub diferite tag-uri: div, link, header, footer, etc.;
    acceste elemente contine anumite atribute/proprietati, apar imediat dupa tagul elementului

 HTML - este ce contine pagina web
 CSS - cum arata pagina web
 JS - ce poate sa faca pagina web
 Deci, pe scurt HTML este un limbaj care defineste structura pagini web
 <html> </html> - este tagul care se deschide si se inchide
 <head> </head> - ganditiva la el ca la un aptend intr-un document acolo se trec care sterilizeaza paginile web, adica le da anumite aspecte
 <body> </body> - este corpul principal
 footer - este acel parte de jos in care treceti alte chesti: semnatura, pagina;
*/


/*
Ce contine o pagina HTML?
-Contine un link, <head>(se pronunta hedar). mai are un body cu o imagine
 */

/*
Daca vrei sa faci o pagina web folositi "Visual Studio" este gratuit;
 */
/*
lorem - genereaza texte random pentru testare
 */

//SELECTORI
/*
Selectori - au rol de a gasi un element de pe pagina ewb in mod programatic;

Exemple de selectori:
->ID - este un atribut al unui element
->Xpath;
->CSS;
->name  -
->Tag Name
->Link Text;
->Partial Link Text;
*/
//Acestea sunt niste metode prin care voi puteti sa comstruiti niste selectori

/*
Targetam dupa ID:
</div ID = "app" - este un container in care puteti sa inghesuiti mai multe elemente
</a - este o ancora, este un link
ID dupa pagina web le cautati intodeanua cu # in fata
Id-urile sunt unice
Poate sa se schimbe unele ID-ur, dar daca stim ca nu se schimba putem sa le folosim
 */

/*
Targetam dupa nume name:
-De exemplu daca tagul nostru se numeste a(ancora),il cautam dupa a;
-Daca este "img" scriem pur si simplu img;\\
-header - scriem header si avem doar unul singur si asa este normal
-footer - scriem foter
Deci de retinut este ca daca il luam dupa numele elementului il gasiti dupa numele elementului
*/

/*
Targetam dupa clasa(css):
-daca cautam asa ".home-banner", adica punem un punct in fata si numele clasei
-daca vrei sa specificam putem sa punem in fata puntului "div" asta inseamna ca specificam
-de retinut ca spatiile libere se inlocuesc cu punct, astfel nu putem sa targetam atunci cand cautam
 */

/*
Targetam dupa Xpath:
--->aici o sa fie putin cam pretentios in formarea codului pentru a targheta si codul arata cam asa:
                          ---> //div[@class='card mt-4 tot-card'][3]
--->deci ca sa targetam dupa "xpath", trebuie puse doua slesuri, "div" in fata, "@", "clasa" si numle clasei apoi inchidem parantezele
    patrate si facem ca la Array, in care ii dam dimensiune. Tinand cont ca aici nu se mai icepe de la 0.
--->deci cu selectorul acesta "Xpath" cam putem sa ajungem oriunde in pagina
 */

//Cand nu mai punem un "@"? Atunci cand nu mai targhetam nici un atribut, targetam textul
//div[@class='card mt-4 tot-card'][3] - targetam un atribut
//span[text()='Practice Form'] - targetam un text

/*
"/d*" - este digi(este introdus ca selector la numarul de telfon)
 */