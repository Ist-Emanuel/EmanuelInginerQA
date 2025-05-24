//package SeleniumBascis1;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//
//public class Test {
//
//    private static final String URL = "https://demoqa.com/";
//
//    public static void main(String[] args) throws InterruptedException {
//
///*Care sunt nivelele de testare?
//   Nivelele de testare sunt?
//   - unit testing(este facut de dev.)
//   - sistem - testing(aici intervenim noi QA/dev/business/devops)
//   - integration - testing(QA/DEV/BUSINESS/DEVOPS)
//   - apccetance - testing (aici intervine oameni care au venit cu cerinta)
// */
//
//        // 1. Go to https://demoqa.com/
//        //Ca sa pot sa ajung pe pagina am nevoie de un "WebDriveManager"
//        WebDriverManager.chromedriver().setup();
//        //Deci mai sus "WebDriverManager.chromedrive().setup()" i-am setat ca avem nevoie de un "chromedriver()" si o sa
//        //mi-l aduca pe laptopul meu adica local
//        //"setup" - este void si nu ne returneaza nimc
//        //si va trebui sa-i setam de manuta un webDrive
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();   //acest lucru maximizeaza fereastra web
//        // "WebDriver" - este o interfata si mai sus o sa scoatem din acesta interfata un obiect concret
//        //  Ii dam un nume "driver"
//        //  Si mai sus am reusit sa ne facem un "ChromeDriver, pentru ca vreau sa fac testele prin "ChromeDriver"
//        //  Si ca sa ajungem pe pagina Web "https://demoqa.com/", trebuie sa dam un "get".
//        //  De exemplu:
//        driver.get(URL);
//        //  De retinut, daca avem o variabila finala initial ar fi de preferat sa o scriem cu litere mari;
//    /*
//    Deci primul pas am reusit sa ajungem pe pagina Web cu codul pe care l-am construit mai sus;
//    Am reusit sa pornim un brwoser automat din script/Java;
//    Cei 3 pasi sunt:
//      - Setup Driver (RO: driver de configurare)
//      - Create Driver(RO: creati driver)
//      - Use Driver   (RO: utilizati driverul)
//     */
//        // div - vine de la Divijan Containes
//
//
//        //       2. A. Click "Forms" card
//        // Ca sa putem sa construim un selector ne folosim de driver
//        WebElement forms = driver.findElement(By.xpath("//div[@class = 'card mt-4 top-card'][2]"));
//        //findElement - fara "sla sfarsit ne da un element. ebElement este un tip de clasa pe care il avem in Java
//        //findelements = est cu "s" lasfarsit, acesta ne da o lista
//        //by - este o clasa si ne ajuta sa construim un selector care va fi introdus ca input
//        //By.spath - ma ajuta pe mine sa indentific acest webElement //div[@class = 'card mt-4 top-card'][2])"
//        //Tot rezultatul acetsa o salvam intr-o variabila "Forms"
//        forms.click();
//        //Am luat codul salvat in variabila "forms" si am adaugat un click;
//        //WebElement este ointerfata care vine la pachet cu niste metode in spate: click(), submit(), sendKeys(), clear(), etc.
//        //aceasta excption "NoSachElementException" aparuta in consola inseamna ca este o problema de selector
//
//        //B.Click "Practice Form"
//        WebElement PracticeForm = driver.findElement(By.xpath("//span[text()='Practice Form']"));
//        PracticeForm.click();
//
//        //C. Click "farstName"
//        WebElement firstName = driver.findElement(By.id("firstName"));
//        //Cand luam taguri dupa "Id", sa-l cautam punem "#", cand il bagam in cod scriem fara "#", By.id va stii sa puna un '#'
//        firstName.sendKeys("Emanuel");
//        //sendKeys - este pentru a tasta;
//
//        //D. Click "lastname"
//        WebElement lastName =  driver.findElement(By.id("lastName"));
//        lastName.sendKeys("Istrate");
//
//        //E. Click "useremail"
//        driver.findElement(By.id("userEmail")).sendKeys("marin.mm753@gmail.com");
//        //La puntu "D" nu am mai stocat intr-o variabila;
//
//        //F. click "Female"
//        WebElement butonFemale = driver.findElement(By.xpath("//label[text()='Female']"));
//        butonFemale.click();
//
//        //G. click "userNumber"
//        WebElement userNumber = driver.findElement(By.id("userNumber"));
//        userNumber.sendKeys("0725616424");
//
//        //H. click "dateOfBirthInput"
//        WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
//        dateOfBirthInput.click();
//           //-Luna
//        WebElement elementLuna = driver.findElement(By.cssSelector(".react-datepicker__month-select"));
//           //Trebuie aici la calendar sa ne facem un selector
//        Select select = new Select(elementLuna);
//        select.deSelectByContainsVisibleText("August");
//           //Ziua
//        WebElement ziua = driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, August 7th, 2025']"));
//        ziua.click();
////        Select select1 = new Select(ziua);
////        select1.deSelectByContainsVisibleText("7");
//
//        Thread.sleep(1000);//Acest lucru iti zice aplicatiei tale cat timp trebuie sa astepte;
//
////      3. Verify URL is https://demoqa.com/forms
//        String curentURL = driver.getCurrentUrl();
//        //"getCurrentURL()" ne returneaza un strin si asa ca putem sa-l salvam intr-o variabila de String;
//        System.out.println(curentURL);
////      4. Close browser (using driver)
////        driver.close();
//        //La pasul patru am spus ca dupa ce executa pagina Web sa o inchida;

//    }
//}
