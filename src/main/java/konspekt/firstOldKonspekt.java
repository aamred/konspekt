package konspekt;

/**
 * @author Anton Muzhytskyi
 */

public class firstOldKonspekt {


====================


collection framework
spring core
spring boot   // jdbc api
spring data jpa
validation api
spring security
spring mvc         kniga spring in action
sun live
ava Stream API, Java Time API
rest jwt
restapi


chernie i krasnie derevya
hash tablici, spiski, derevya , grafi
algoritmi  abhod derevyev
DI , IoC
mvc

WEB osi tsp/ip    rest api, web socket

microservise
linux

==========================

                 CV


Java Developer. (Java Core, Spring, Tomcat, Maven, JDBC, Hibernate, SQL , Mongo, GIT, HTML, CSS, JavaScript)


https://github.com/aamred

tomcat -server(konteyner servletov)
H2 -server
Maven -sborshik
JDBC - standart vzaimodeystviya java s bazami dannih(ne vazhno s kakimi?)
     jpa - bolee noviy standart jdbc
hibernate - orm ,  konektor java s releacionnimi bazami dannih(orm -obyekno -releac. mapping)
          ispolzuet jpa
          hibernate mozhno cherez xml file ili cherez @Annotaciyu
          xml - config proekta
CRUD -createread update delete
docker - programma konteynerizacii, pozvolyaet bistro upakovivat irazvorachivat proekti
jsp - java v html
pom.xml  - fail  sborki maven 


===========================================================
                           OOP
===========================================================
bazovie principi OOP
  inkapsulyaciya
  nasledovanie
  polimorfizm
  abstrakciya


==========================================================
                  SOLID
==========================================================
s  single responsobility  - odin class - odnu funkciyu(funkcionalnost)
o  open-closed    -  programnie moduli otkriti dlya rashiren, zakriti dlya modifik  (ne menyaem stariy 
   kod, a dopisivaem noviy) 
l  princip barbari liskov : - u dochernego classa ne dolzhno bit menshey funkcionalnosti chem u 
   roditelya
i  interfeys razdelenie   - mnogo interfeysov malenkih otdelnih  luchshe chem odin obshiy bolshoy
   class ne dolzhen soderzhat moduley kotorih on ne ispolzuet

d  dependency inversion  -   moduli visokogo urovnya ne dolzhni zavisit ot moduley nizkogo urovnya,
   mezhdu nimi vsegda dolzhna bit abstrakciya 


==================================================
              SHABLONI PROEKTIROVANIYA
==================================================

-POROZHDAYUSHIE:

  fabrika: -sozdaem interfeys(u nego mnogo classov), 
	sozdaem interfeys fabriki(kazhdaya fabrika sozdaet svoy klass)
	sozdanie interfeysa , kotoriy sozdaet obyect(vibor obyect kakogo klassa sozdaetsya ostaetsya za
	klassom kotorie implement this interface)    

        sozdanie ekzaemplyarov klassa drugim classom



  abstract fabrika: sozdanie interfeysa dlya mnozhestva vzaimosvyazanih obyectov, bez privyazki k klassam

  singleton(odinochka): sozdanie edinstvennogo ekzemplyara classa

  builder: director - abstractniy class builder+ builderi konkretniepod klas extends 
	abstrakniy - class s polyami i seterami(obshiy)

	sozdanie raqzlichnih obyektov iz odnogo nabora dannih

  prototype: sozdanie copii zadanogo obyecta

-STRUKTURNIE
  adapter: obespechivaet sovmestimost raboti klassov interfaci kotorih ne sovpadayut
	(extends implements)

  bridge:poluchenie priimushestv nasledovaniya bez poteri gibkosti (bank exchenge cpp java)
  
  compozite: sobiranie melkih komponentov v bolee krupnie(class: Team of developers)

  decorator: dinamicheskoe dobavlenie novih funkciy obyectu(alternativa porozhdeniyu podklasov (sozdanie klasadekorator)

  fasade : pri slozhnoy sisteme sozdaem class v kotoriy zapihivaem drugie classi uprashaya rabotu klientu

  flyweight: sozdanie i upravlenie mnogimi obyectami (hash map swich  client-list array)  prisposoblenec

  proxy:  obespechenie kontrolya dostupa k obyektu

-POVEDENCHESKIE
  Chain of responsobility: skrivaet ot poluchatelya , otpravitelya zaprosa

  Command: inkapsuliruet zapros v obyect (dlya sozdaniya ocheredi)

  Interpriter:  opredelenie predstavleniya gramatiki obyekta

  Iterator: posledovatelniy dostup ko vsem elementam sostavnogo obyekta skrivaya ego realizaciyu(class v classe, 2 interface)

  Mediatr(posrednik): incapsulyatsiya sposobi vzaimodeystvita mnozhestva obyectov (chat). 

  Memento(hranitel):  sohranenie vnutrenego sostoyaniya obyekta za ego predelami
  
  Observer (nablyudatel):  zavisimost odin ko mnogim (vacancies)
  
  State (sostoyanie): upravleniem obyekta v zavisimosti ot sostoyaniya

  Strategy(strategiya): vzaimozamenyaemost semeystva klasov(pochti tozhe chto i State)

  Template method(shablonniy metod): sozdanie OSNOVI(shablona) classa, chtob ego podclassi mogli pereopredelyat egochasti,
                                    osobo ne menyaya oshovu

  Visitor(posetitel):  pozvolyaet sozdat novuyu operaciyu bez izmineniya klassa etogo obyekta



  
============================================================================
                                 STRUKTURI DANNIH
============================================================================

Stack     (posledniy zashol - perviy vishel)
Queue   - ochered (perviy zashel - perviy vishel)
Linked list  -svyazniy spisok (element hranit v sebe sam element i ssilku na sleduyushiy element)
Massive
set
Map (klyuch,znachenie)

dvoichnoe derevo
n-arnoe derevo
grafi


==============================================================================
                                  ALGORITMI
==============================================================================
poisk
sortirovka
rekursivnie
obhod grafov
obhod derevyev   rekursivniy ,ochered
keshirovanie


==============================================================================
                                   GIT
==============================================================================
cd
mkdir
~/
config
pwd. Де я
echo "some text" > text.txt
ls
cat text.txt
rm text.txt
cd ..
git init
ls -la or. ls-Force
git branch 
git add - to staging
git add. -Vse fayli
git commit
git commit -m <message>
git status 
git checkout <hash> -пеоеход на <branch> версию ....перемещение head
git log -istoriya izmeneniy
git branch /name /-d / vetki
git checkout /-b perehod po vetkam

==============================================================================
                            COLLECTIONS
==============================================================================
Set             List           Queu             Map

hashSet        ArrayList     PriorityQueue      HashMap                     
likedHashSet   LinkedList                       LinkedHashMap
treeSet                                         TreeMap(sorted)

Sorted
Navigated

SET  - ne pozvol hranit odinakovie elementi
Map key:value  (dictionary)
list  ():  add, remove, contains,
map(): contains key, konteyns value


============================================================================
                               SPRING
============================================================================
IoC- inversion of control = snachala abstrakciya a potom realizaciya
AOP - razdelenie osnovnogo i dopolnitelnogo funkcionala


mvc - shabloni , controlleri, modeli
start spring io    - create project
MVC - model view controller: dependencies: controllers/MainController: resourses/templates/home.html  run
bootstrap in html : bootsrapCDN link : Controllers   : templates : blocks
depengencies -mysql -jpa(starter spring io) : 
application properties(spring.io): mamp or open server: mamp /port/root/root  : phpMyAdmin
models: @Entity(tabl)

@Id 
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    polya tablici
    get set
repo/ interface = ModelRepository extends CrudRepository<Model, Long>

controller
@Autowired
    private PostRepository postRepository;
    @GetMapping("/blog")
    public String blogMain(Model model){
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "blog-main";
    }
}
run look db
add post: blogcontroller return> template html


scope : singletone(ili prototype)  - zona vidimosti 
pom dependency spring core,spring-bean, spring context, javax servlet(index.jsp shob ne glyuchilo)
applicationContext.xml   bean property, value 
@Component
@Autowired
@Qualifier(" /*beanName */")
@Scope("prottype")

@PostConstruct    --init-method
@PreDestroy        -destroy-method




 kniga spring in action

chernie i krasnie derevya
hash tablici, spiski, derevya , grafi
algoritmi  abhod derevyev
DI , IoC
mvc

WEB osi tsp/ip    rest api, web socket

microservise
linux
===================================================================

                      SQL PostgreSQL
sql  -  structure query language: sostoit iz DDL(data defenition lenguage(create and drop)) i DML(data manipulation language(select,insert,update,delete))

shell :enter->enter-> password
\?    - biblioteka comand
\l    - all db

CREATE DATABASE avecoder;
\c avecoder     - connect to db avecoder
\d      - list of tables
\d nameoftable     - vse polya of table
\conninfo     - info about db
DROPE DATABASE avecoder;   -delete db
DROPETABLE employee    -delete table

CREATE TABLE emploee (
  id BIGSERIAL  NOT NULL PRIMARY KEY,
  first_name VARCHAR (50) NOT NULL,
  last_name VARCHAR (50) NOT NULL,
  gender VARCHAR (6) NOT NULL,
  country_of_birth VARCHAR(20),
  email VARCHAAR (150),
  date_of_birth DATE NOT NULL,
 // bicicle_id BIGINT REFERENCES bicecle (id) UNIQUE(bicicle_id)
);


CREATE TABLE bicicle (
  id BIGSERIAL NOT NULL PRIMARY KEY,
  make VARCHAR(100) NOT NULL,
  type VARCHAR(100) NOT NULL,
  price NUMERIC (19,0) NOT NULL,
);

INSERT INTO employee ( first_name, last_name, gender, country_of_birth, email, date_of_birth)
              VALUES ('John',  'Doe', 'MALE', 'USA', 'Jd@mail.com', '2000-01-01');

mockaroo.com  -generate table
SELECT * FROM employee;   -pokazat vsyu table
SELECT  FROM employee;     - pokazat kolichestvo zapisey
SELECT first_name  FROM employee;    -spisok imen
SELECT first_name , last_name FROM employee;
SELECT * FROM employee  ORDER BY country_of_birth ;   -pokazat vseh otsortirovat po country of birth
SELECT * FROM employee  ORDER BY country_of_birth DESC;     -  -//- v obratnom poryadke(if null idut posl)
SELECT * FROM DISTINCT country_of_birth FROM employee ORDER BY country_of_birth;    -spisok stran - ne povtoryayutsya
SELECT * FROM employee WHERE gender = 'Female';
SELECT * FROM employee WHERE gender = 'Female' AND country_of_birth = 'Argentina';
SELECT * FROM employee WHERE gender = 'Female' AND (country_of_birth = 'USA' OR country_of_birth = 'Slovakia' OR country_of_birth = 'Ukraine');

SELECT * FROM employee LIMIT 20;  -pokazat pervie 20
SELECT * FROM employee OFFSET 19 LIMIT 5;    -pokazat 5 posiciy   nachinaya s 19 pozicii
SELECT * FROM employee OFFSET 10 FETCH FIRST 7 ROW ONLY;    -kak i predidushee pokazat 7 nachinaya s 10 pozicii
SELECT * FROM employee WHERE country_of_birth IN ('China', 'Argentina, 'Israel');
SELECT * FROM employee WHERE date_of_birth BETWEEN '2019-01-01' AND '2020-01-01';
SELECT * FROM employee WHERE email LIKE '%.com';           %-kakoy-to text
SELECT * FROM employee WHERE email LIKE '%@gmail.com';
SELECT * FROM employee WHERE email LIKE '%@gmail.%';
SELECT * FROM employee WHERE country_of_birth LIKE 'S%';   - pokazat vse pozicii gde coountry of birth nachinaetsya s zaglavnoy s
SELECT * FROM employee WHERE country_of_birth iLIKE 's%';  -//- pokazat vse pozicii gde coountry of birth nachinaetsya s zaglavnoy s

SELECT country_of_birth ,COUNT(*) FROM employee GROUP BY country_of_birth;  -rahuem skilku lyudey v kozhniy kraini z table employee
SELECT country_of_birth ,COUNT(*) FROM employee GROUP BY country_of_birth HAVING COUNT(*) >10;  -//-te strani gde bolshe 10 rabotnikov
SELECT country_of_birth ,COUNT(*) FROM employee GROUP BY country_of_birth HAVING COUNT(*) >10 ORDER BY country_of_birth DESC;   -//- sortirovka by country v obratnom poryadke

SELECT id, first_name  AS name, last_name AS surname, gender AS sex, email, date_of_birth, country_of_birth FROM employee;   -gender as sex
SELECT COALESCE(email, 'not applicable') FROM employee;  -vivesti vsi emaili ,yakih nema - pisati not applicable


            NEW TABLE holiday: colonki: distination_country, distination_city, price
								price NUMERIC(19.2) NOT NULL,
SELECT MAX(price) FROM holiday;
SELECT ROUND(AVG(price)) FROM holiday;
SELECT distination_country, distination_city, MAX(price)FROM holiday GROUP BY destination_country, destination_city;  -samaya dorogaya putevka v kazhdiy iz gorodov
SELECT distination_country,  MAX(price)FROM holiday GROUP BY destination_country  - samaya dorogaya putevka v kazhdoy strane;
SELECT SUM(price) FROM holiday;  - summa vseh putevok
SELECT distination_country ,SUM(price) FROM holiday GROUP BY destination_country;   -summa putevok v kazhduyu stranu
SELECT 100+2;

SELECT NOW();     - data i vremya seychas
SELECT NOW()::DATE;  -only data   ::TIME;  -only time
SELECT NOW() - INTERVAL '1 YEAR';   - vivodit datu na god pozzhe
SELECT NOW() + INTERVAL '10 DAYS';   - vivodit na 10 dney +
SELECT EXTRACT (MONTH FROM NOW());    -  dostat segodnyashniy mesyac  (01  = yanvar)
SELECT first_name, last_name, gender, country_of_birth, email, date_of_birth , AGE(NOW(), date_of_birth) AS age FROM employee;  -vozrast rabotnikov v kolonke age

ALTER TABLE employee DROP CONSTRAINT employee_pkey;  - izmenit tablicu udalit ogranichitel primary key
ALTER TABLE employee ADD PRIMARY KEY(id);      - dobavit primary key tablice employee v id

SELECT email,count(*) FROM employee GROUP BY email HAVING COUNT(*)>1;  -   skolko emailov povtoryayutsya bolshe odnogo raza
ALTER TABLE employee ADD CONSTRAINT unique_email_address UNIQUE (email);  - dobavit ogranichenie -email ne povtoryaetsya
DELETE FROM employee WHERE id ='1001';

SELECT DISTINCT gender FROM employee;   -  kakie genderi dostupni v tablice (+panda)
ALTER TABLE employee ADD CONSTRAINT gender_constraint CHECK (gender = 'Female' OR gender ='Male');   -ogranichit table only male i female
UPDATE employee SET email = 'curry@mail.com';     - zamenit email vsem
UPDATE employee SET email = 'curry@mail.com' WHERE id = 3;     - zamenit dlya id=3
UPDATE employee SET first_name = 'John', last_name='Doe' WHERE id = 3;

                                  ---obhod ogranicheniy----
INSERT INTO employee (id,first_name, last_name, gender, country_of_birth, email, date_of_birth)
               VALUES(3, 'John', 'Doe',        ' Male', 'Ukraine', 'jd@gmail.com', '2019-12-10')
               ON CONFLICT (id) DO NOTHING;

INSERT INTO employee (id,first_name, last_name, gender, country_of_birth, email, date_of_birth)
               VALUES(3, 'John', 'Doe',        ' Male', 'Ukraine', 'jd@gmail.com', '2019-12-10')
               ON CONFLICT (id) DO UPDATE;


INSERT INTO employee (id,first_name, last_name, gender, country_of_birth, email, date_of_birth)
               VALUES(3, 'John', 'Doe',        ' Male', 'Ukraine', 'jd@gmail.com', '2019-12-10')
               ON CONFLICT (id) DO UPDATE SET email = EXCLUDED.email;     - obnovid tolko email

                                 ---vneshnie klyuchi---
ALTER TABLE employee ADD bicecle_id  BIGINT REFERENCES bicecle(id);   - dobavlyaem kolonku v tablicu s foreign key
ALTER TABLE employee ADD UNIQUE (bicicle_id);       -dobavlyaem uniq ogranichitel
 
INSERT INTO bicecle (make, type , price) VALUES ('Indi atb', 'mountain bike', '100.00');
-//-
-//-

UPDATE employee SET bicicle_id = 2 WHERE id = 4;   - zadaem employee id=4 vneshniy klyuch na bicicle id=2
                        
                                  ---joins---
                                  --inner--
SELECT *FROM employee JOIN bicicle ON employee.bicicle_id;   -obyedenyaem employee i bicicle po bicicle id iz employee v odnu tablicu
SELECT employe.first_name, bicicle.name, bicicle.type, bicicle.price FROM employee JOIN bicicle ON employee.bicicle_id = bicicle.id;   -pokazat imya iz empl i polya iz bicicle, po vneshnemu klyuchu bicicle_id                                   --left--
SELECT * FROM employee LEFT JOIN bicicle ON bicicle.id = employee.bicicle_id;   -vivesti vseh rabotnikov i tolko te velosipedi kotorie u nih est
SELECT * FROM employee LEFT JOIN bicicle ON bicicle.id = employee.bicicle_id WHERE bicicle_id IS NOT NULL;   -vivesti tolko teh rabotnikov u kotorih est velosiped
                                     --right--
SELECT * FROM employee RIGHT JOIN bicicle ON bicicle.id = employee.bicicle_id;     -spisok vseh velosipedov i teh lyudey u kotorih est velosipedi iz spiska velosipedov
                                     --full outer--
SELECT * FROM employee FULL OUTER JOIN bicicle ON bicicle.id = employee.bicicle_id;   -pokazat vse iz dvuh tablic
              
                                 --export v fail csv--
\copy( sql zapros) TO '/Users/Anton/Desctop/bicecles' DELIMITER ',' CSV HEADER;
                                  
                                  --UUID--
SELECT * FROM pg_available_extensions;    -kakie bivayut rasshireniya u postgres
CREATE EXTENSION IF NOT EXIST "uuid-ossp";   -ustanovka rasshireniya uuid
\df   -kakie est funkcii u rasshireniya

CREATE TABLE passport (
  passport_serial UUID NOT NULL PRIMARY KEY,
  issue_date DATE NOT NULL,
  expire_date DATE NOT NULL,
  country_issue VARCHAR(150) NOT NULL,
);
INSERT INTO passport PRIMARY KEY (passport_serial, issue_date, expire_date, country_issue)
                      VALUES (uuid_generate_v4(), '2020_03_19', '2029_03_19', 'Ukraine');

                              --zapros v zaprose--
CREATE TABLE Products
(
    Id SERIAL PRIMARY KEY,
    ProductName VARCHAR(30) NOT NULL,
    Company VARCHAR(20) NOT NULL,
    ProductCount INTEGER DEFAULT 0,
    Price NUMERIC NOT NULL
);
CREATE TABLE Customers
(
    Id SERIAL PRIMARY KEY,
    FirstName VARCHAR(30) NOT NULL
);
CREATE TABLE Orders
(
    Id SERIAL PRIMARY KEY,
    ProductId INTEGER NOT NULL REFERENCES Products(Id) ON DELETE CASCADE,
    CustomerId INTEGER NOT NULL REFERENCES Customers(Id) ON DELETE CASCADE,
    CreatedAt DATE NOT NULL,
    ProductCount INTEGER DEFAULT 1,
    Price NUMERIC NOT NULL
);

INSERT INTO Products(ProductName, Company, ProductCount, Price) 
VALUES ('iPhone X', 'Apple', 2, 66000),
('iPhone 8', 'Apple', 2, 51000),
('iPhone 7', 'Apple', 5, 42000),
('Galaxy S9', 'Samsung', 2, 56000),
('Galaxy S8 Plus', 'Samsung', 1, 46000),
('Nokia 9', 'HDM Global', 2, 26000),
('Desire 12', 'HTC', 6, 38000);
  
INSERT INTO Customers(FirstName) 
VALUES ('Tom'), ('Bob'),('Sam');
                                    //sam zapros v zaprose
INSERT INTO Orders(ProductId, CustomerId, CreatedAt, ProductCount, Price) 
VALUES
( 
    (SELECT Id FROM Products WHERE ProductName='Galaxy S9'), 
    (SELECT Id FROM Customers WHERE FirstName='Tom'),
    '2017-07-11',  
    2, 
    (SELECT Price FROM Products WHERE ProductName='Galaxy S9')
),
( 
    (SELECT Id FROM Products WHERE ProductName='iPhone 8'), 
    (SELECT Id FROM Customers WHERE FirstName='Tom'),
    '2017-07-13',  
    1, 
    (SELECT Price FROM Products WHERE ProductName='iPhone 8')
),
( 
    (SELECT Id FROM Products WHERE ProductName='iPhone 8'), 
    (SELECT Id FROM Customers WHERE FirstName='Bob'),
    '2017-07-11',  
    1, 
    (SELECT Price FROM Products WHERE ProductName='iPhone 8')
);

^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                                 udemy sql
create table person(
id int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
name varchar NOT NULL,
age int check(age>0),
email varchar UNIQUE
)

insert into person(name, age, email) values('tom', 32, 'tom@pidor.as')

===============================================================================
================================NEMCHA  WEB====================================
===============================================================================

  HTTP - hyper text   ...  protocol(http request, response    GET  POST)
servlet - class na servere kotoriy obrabativaet http zaprosi
jsp-java server pages- html s vstroennoy javoy
ajax - kogda na steanice menyaesh, stranica menyaetsya, no ne perezagruzhaetsya
jar - java arhive(zip)      only zip  war - web archive ready for server 
 deploy- ustanovka war na server
scriplet = kod v jsp
trehtirovoe prilozhenie: 1 interface     dlya polzovatelya
                         2 bizneslogika
                         3 dannie
WEB      
new runtime=server

JDBC  -java data base connectivity (interface dlya connecshna s db, chast javi(yadra)) - prostoe obrasenie k db(na pryamuyu),seychas uzhe ne ispolzuetsya
drivers k db pishetsam proizvotitel db (jar fail, nuzhno polozhit v nuzhnoe mesto proekta)
ORM  -object relational mapping framework(Hybernate class) idet po specifikacii JPA (java persistance application) ot Oracle

    _______________________________________________
   | ______________                                |
   || ______       |     _________                 |
   ||| java | jdbs | <->/driver db|  orm(hybernate)|
   |||______|      |   /__________|                |
   ||______________|                               |
   |_______________________________________________|

VCS -versionControl System   GIT

                                            SETTING
C:
  PosttgreSQL               //password 1234    port5432   local:Ukraine driver:DataBase Drivers-> pgJDBC kladem v C/java/postgres_
      postgres       - ustanovka samogo postgresa                                                                                 |
      data           - ukazivaem sohranyat syuda dannie v moment ustanovki  
  repository (git)                                                      |
  //workspace                                                                                                                     |
  java:                                                                                                                           |
      jre                                                                                                                         |
      jdk                                                                                                                         |
      eclipse   //somtimes jre means jdk -choise jdk  package: ua.com.muzhytskyi                                                  |
      tomcat                                                                                                                      |
      postgres   (driver pgJDBC)  <-----------------------------------------------------------------------------------------------^
      workspace
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                                          TEST
1make new folder, new paccage(ua.com.muzhitskyi the same as a class),right clc , build path, Use as a source, new JUNIT test case, name as a class+Test, show class under test
add library junit test,  run as a test

Debag -> run step by step

HTTP request doGet, doPost -> servlets -> HTTP responcse
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                                      tomcat
jsp= html+ <% java %>
3h tirovoe prilozhenie: interface<-> buisnes logic<-> Data(dannie)

   !    tomcat just copy in java folder on /C:
   !    new proj -> Dynamic Web Project (target runtime IS server(tomcat)), dynamic web modul version= 3.1
   !    index.jsp IN Web content (webapp)
   !    run as -> on server
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                                       postgres
postgres
pgAdmin ->password-> postgres -> Schemas(create schema) ->Tables(create table)
eclipse perspective -> database development
        database connection-> new->postgresql->name-> driver->JARlist->delete old-> add svoy iz c/java-> tablichka
        tablichka:  database: postgres
                    URL: jdbc:postgr...5432/postgres
                    username:postgres
                    password: 1234
                                           test connection
open scrapbook -> sql -> create sql zapros-> execute(prav klavisha)

   !   new proj -> Dynamic Web Project (target runtime IS server(tomcat)), dynamic web modul version= 3.1
   !               Java Build Path  /Libraries /Add External JARs -> put k driveru postgres v c/java/postgres->apply->check in project in references libraries
   !   Servers/ double click on tomcat server-> Open launch configurator/ Classpath/ Add external JARs -> Add postgres JDBC driver jar iz c/java/postgres
   !   java classi v Java Resources/src/(package)ua.com.muzhitskyi

^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                                    GIT
Checkout - vitygivanie(zagruzka) k sebe na komp kakuyuto versiyu iz repositoriya
Update    - vityagivanie(zagruzka) obnovleniy proecta ,kotorie sdelali drugie programisti k sebe na komp iz repositoriya
Commit  - zanesenie(vigruzka izmeneniy sdelanih mnoy v repositoriy  //delaetsya s kommentariem, chto izmeneno
Branch -vetki
Merges- soedinenie vetok izmeneniya v odnoy vetkevstraivayutsya v kod drugoy 
   
                                   GitLab 
git@gitlab.com:amnrcirque/carmanager.git
Passfraze   :    madisonparker
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAAAgQChZwOMMFM/6Y0nXZwECgWRQIaxtVeBfrqSgxXEvT4X7OKNTqIoKoxhqGsM94y1OlG/+1rRT32t5MUxNYCrYlK4vKJI/dGFa9vmSM0hKCFGSvaopzeGv32ePhPoVRPp5Tk96i9FuZMrhlBW7GKSPKzAbLnREJWDm0yTjqI74QoJMw== RSA-1024
RSA-1024
klyuch v C:\Users\Anton\.ssh

                                     Git setting
project -> team-> share project(create???)->c:\repository->repository-c:\repository\.git,c:\repository
    //windows>perspective>open prespective> other>(git> Git Reepositories,Git Staging, Team>history) 
    //buttons>windows>perspective>costomize persp>git, Action Set Availability> choose git's buttons
project->team->Commit(gitignore)>staging +commit(local)
   <+gitlab website++>create project-> Clone SSH -----------------------------------------------------------------------------------------------------------------------------------|
   <+eclipse++>window> preferences -> Search : net -> SSH -> Key Management-> Generate RSA Key -> passphrase : madisonparker-> Save Private Key(put po umolchaniyu) COPY--|         |
   <+gitlab website++>right corner->settings->SSH keys(PASTE from eclipse)>Add Key  <-------------------------------------------------------------------------------------|         | 
<eclipse                                                                                                                 |----------------------------------------------------------|                                              
Git Repositories Window->Remotes->right click>Create remote->remote name:origin, config:push> URI -copi from gitlab <----|   >Advanced>?password:madison parker>Source ref: ukazivaem vetku(main/master???)> add Spec,\/Save specif..in orig>finish>save
Commit Push Check  (first commit  //initial commit)

GitRepositories ->Branches-> Local>right click->switch to -> new branch
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                                     maven     (+   tomcat)
convert  :   project-> configure-> convert to maven proj: POM : groupID=package; artefactID=project name;...
  window-> preferences-> maven-> \/ Download repository index updates on startup
  POM file dependencies s pomoshyu eclipse vkladka snizu= cherez pom.xml   OR skopirovat s:  mvnrepository.com
        junit version = 4
  project-> right click -> runas -> maven build-> Goals: clean install ->Run -> (build+warnik ili jarnik v Targete)

create  :  new->  maven project-> create simple proj PUSTAYA!!!->filter: webapp->org.apache.maven.archetypes-> 
   -> groupID:ua.com.muzhytskyi;   ArtefactID:Project1;  package:  ua.com.muzhytskyi.project1  (vsyo malenkimi)->
  -> oshibka(ne vidit tomcat)->project->rightclick->build path->configure build path-> libaries-> add Library ->
  ->server runtime-> apache tomcat->finish
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                 linux  
shell:  touch -izmenyaet vremya poslednego redaktirovaniya fayla, ili sozdaet fayl esli ego net
	ls - list spisok iz zdanoy direktorii
	mv - move
	rm - remove
	cp
	ln - link - sozdaet ssilku na fayl v drugoy directorii (mount -pohozhee)
	pwd
	cd  - disk-  smena direktorii
	mkdir -make dir
	rmdir - remove dir
	find  - find
	du

	vi -   redactirovanie fayla e-komanda shob redaktirovat,  esc:q!-viyti iz vi

mc -midnight comander : - norton comander dlya linux ,mozhet ne bit
/usr  - dlya progr
/var  - vremennie faili , logi

FTP -file transport protocol
SSH - PROTOCOL BEZOPASNOSTY(PuTTY)
SHP - ftp cherez ssh
WinSCP , PSCP -tipa norton comandera
     putty, winscp -programmi dlya raboti na linux servere 



EST -pattern proektirovaniya web prilozheniy, opisivaet pravila vzaimodeystviya s serverom po protokolu HTTP dlya CRUD dannih
     -opisivaet URLs i http metodi kotorie nado ispolzovat

CRUD - create  read  update  delete

    REST        url               CRUD

    GET         /users            READ
    GET         /users/:id        READ
    POST        /users            CREATE
    PATCH       /users/:id        UPDATE
    DELETE      /users/:id        DELETE

DAO  - data access object    - otdelniy klass(dao) vinositsya iz modeli, dlya vzaimodeystviya s db,
                               chtob ne bilo pryamoy svyazi model->db  dao- sql code






==================================================================
============udemy    SQL    (postgres)============================
==================================================================

 create table producer(
 	producer_id int generated by default as identity primary key,
 	name varchar(100) not null unique,
 	age int check (age>10)
 )
 
 create table movie(
 movie_id int generated by default as identity primary key,
 producer_id int not null references producer(producer_id),
 name varchar(200) not null,
 year_of_production int check(year_of_production>1900)
 )
 
 drop table movie
 
 
 insert into producer(name, age) values ('Quentin Tarantino', 57);
 insert into producer(name, age) values ('Martin Sorcese', 58);
 insert into producer(name, age) values ('Guy Ritchie', 53);
 insert into producer(name, age) values ('Woody Allen', 85);
 insert into producer(name, age) values ('David Linch', 74);
 insert into producer(name, age) values ('Christofer Nolan', 50);
 
 insert into movie(producer_id, name, year_of_production) values(1,'Reservior Dogs', 1992);
 insert into movie(producer_id, name, year_of_production) values(1,'Pulp Fiction', 1994);
 insert into movie(producer_id, name, year_of_production) values(1,'The Hateful Eight', 2015);
 insert into movie(producer_id, name, year_of_production) values(1,'Once Upon a Time in Hollywood', 2019);
 insert into movie(producer_id, name, year_of_production) values(2,'Taxi Driver', 1976);
 insert into movie(producer_id, name, year_of_production) values(2,'Goodfelas', 1990);
 insert into movie(producer_id, name, year_of_production) values(2,'The Wolf os Wall Street', 2013);
 insert into movie(producer_id, name, year_of_production) values(3,'Lock,Stock and Two Smoking Barrels', 1998);
 insert into movie(producer_id, name, year_of_production) values(3,'Snatch', 2000);
 insert into movie(producer_id, name, year_of_production) values(4,'Midnight in Paris', 2011);
 insert into movie(producer_id, name, year_of_production) values(6,'Inception', 2010);
 
 select * from producer join movie on producer.producer_id = movie.producer_id;
 select producer.name, movie.name from producer join movie on producer.producer_id = movie.producer_id;
 select producer.name, movie.name from producer left join movie on producer.producer_id = movie.producer_id;
 
 create table citizen(
 	 citizen_id int generated by default as identity primary key,
 	 name varchar(100) not null,
 	 age int check(age>0)
 )
 
 create table passport(
 	citizen_id int primary key references citizen(citizen_id),
 	passport_number int
 )
 
 insert into citizen(name, age) values ('Bob', 12);
 insert into citizen(name, age) values ('Tom', 24);
 insert into citizen(name, age) values ('Katy', 39);
 insert into citizen(name, age) values ('Alice', 45);
 
 insert into passport(citizen_id, passport_number) values(1, 12345);
 insert into passport(citizen_id, passport_number) values(2, 98769);
 insert into passport(citizen_id, passport_number) values(3, 56390);
 insert into passport(citizen_id, passport_number) values(4, 67576);
 
 select citizen.name, passport.passport_number from citizen join passport on citizen.citizen_id = passport.citizen_id;
 
 insert into citizen(name, age) values('silvia', 1);
 select citizen.name, passport.passport_number from citizen left join passport on citizen.citizen_id = passport.citizen_id;
 
 create table actor(
 	actor_id int generated by default as identity primary key,
 	name varchar(100) not null unique,
 	age int check(age>0)
 )
 
 insert into actor(name, age) values('Harvey Keitel', 81);
 insert into actor(name, age) values('Robert Deniro', 77);
 insert into actor(name, age) values('Leonardo Dicaprio', 46);
 insert into actor(name, age) values('Jason Stathem', 53);
 insert into actor(name, age) values('Joe Pesci', 77);
 insert into actor(name, age) values('Samuel L. Jackson', 72);
 
 create table actor_movie(
 	actor_id int references actor(actor_id),
 	movie_id int references movie(movie_id),
 	primary key(actor_id, movie_id)
 )
 
 insert into actor_movie values(1, 1);
 insert into actor_movie values(1, 2);
 insert into actor_movie values(2, 5);
 insert into actor_movie values(2, 6);
 insert into actor_movie values(3, 4);
 insert into actor_movie values(3, 7);
 insert into actor_movie values(3, 11);
 insert into actor_movie values(4, 8);
 insert into actor_movie values(4, 9);
 insert into actor_movie values(5, 6);
 insert into actor_movie values(6, 2);
 insert into actor_movie values(6, 3);
 
 select actor.name, movie.name from actor join actor_movie on actor.actor_id = actor_movie.actor_id 
 	join movie on actor_movie.movie_id = movie.movie_id;
                            INDEX
create index on movie(year_of_production) using hash index;   //b-tree
                        CASCADE    SET NULL
create table clientik(
	clientik_id int generated by default as identity primary key,
	name varchar(100)
); 
 
create table orderok(
	order_id int generated by default as identity primary key,
	clientik_id int references clientik(clientik_id) on delete cascade,  //set null
	ordername varchar(100)
)

truncate table person;
alter table person add column address varchar not null;

---------------------------------------------------------------------------------------------------------------

create table carForRent(
	car_number varchar(8) not null unique primary key,
	person_id int references Person(person_id) on delete set null,
	car_label varchar(20) not null,
	car_model varchar(30) not null,
	car_color varchar(20) not null,
	year_of_producton int check(year_of_producton > 1900)
)

create table Car(
	id int generated by default as identity primary key,
	car_number varchar(8) not null unique,
	person_id int references Person(person_id) on delete set null,
	car_label varchar(20) not null,
	car_model varchar(30) not null,
	car_color varchar(20) not null,
	year_of_producton int check(year_of_producton > 1900)
)

create table Person(
	person_id int generated by default as identity primary key,
	passport_number varchar(8) not null unique,
	name varchar(40) not null,
	surname varchar(40) not null,
	email varchar(30) not null unique,
	telephone varchar(13) not null unique
)

insert into Person(passport_number, name, surname, email, telephone) values('AB658905', 'Bogdan', 'Shevchenko', 'bsh@mail.ua', '380979873465');
insert into Person(passport_number, name, surname, email, telephone) values('TK008654', 'Taras', 'Melnik', 'tm@mail.ua', '380979873123');
insert into Person(passport_number, name, surname, email, telephone) values('KC996306', 'Andriy', 'Karpenko', 'ak@mail.ua', '380979873234');
insert into Person(passport_number, name, surname, email, telephone) values('DT544565', 'Ostap', 'Shuhevich', 'osh@mail.ua', '380979873345');
insert into Person(passport_number, name, surname, email, telephone) values('TA763767', 'Svytoslav', 'Bendera', 'sbh@mail.ua', '380979873456');
insert into Person(passport_number, name, surname, email, telephone) values('KH043460', 'Viktor', 'Koval', 'vk@mail.ua', '380979873567');
insert into Person(passport_number, name, surname, email, telephone) values('AA655565', 'Yuriy', 'Vertenko', 'yv@mail.ua', '380979873678');

select * from person

drop table person

truncate table person   //ochistit

drop table carForRent 

insert into Car(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('AP3456CP', 4, 'Skoda', 'Rapid', 'Blue', 2014);
insert into Car(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('AH0089KP', 1, 'Mersedes', '200e', 'Black', 2013);
insert into Car(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('KP4545BH', 2, 'Renault', 'Logan', 'White', 2000);
insert into Car(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('BP7777AH', 3, 'Audi', 'Q3', 'Grey', 2001);
insert into Car(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('KA6549MK', 2, 'Skoda', 'Karoq', 'Red', 2022);
insert into Car(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('AP6789CP', null, 'Skoda', 'Fabia', 'White', 2023);
insert into Car(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('AI9876PA', null, 'BMW', '7', 'Black', 1990);
insert into Car(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('AI8943PK', 7, 'Kia', 'Rio', 'Blue', 2012);
insert into Car(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('CI3456CK', 5, 'Honda', 'Civik', 'Red', 2018);



insert into carForRent(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('AP3456CP', 4, 'Skoda', 'Rapid', 'Blue', 2014);
insert into carForRent(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('AH0089KP', 1, 'Mersedes', '200e', 'Black', 2013);
insert into carForRent(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('KP4545BH', 2, 'Renault', 'Logan', 'White', 2000);
insert into carForRent(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('BP7777AH', 3, 'Audi', 'Q3', 'Grey', 2001);
insert into carForRent(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('KA6549MK', 2, 'Skoda', 'Karoq', 'Red', 2022);
insert into carForRent(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('AP6789CP', null, 'Skoda', 'Fabia', 'White', 2023);
insert into carForRent(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('AI9876PA', null, 'BMW', '7', 'Black', 1990);
insert into carForRent(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('AI8943PK', 7, 'Kia', 'Rio', 'Blue', 2012);
insert into carForRent(car_number, person_id, car_label, car_model, car_color, year_of_producton) values('CI3456CK', 5, 'Honda', 'Civik', 'Red', 2018);
select * from carforrent

select person.person_id, person.name, car.car_label, car.car_model from person join car on person.person_id = car.person_id;


th:href="@{/cars/{id}(id=${car.getId()})}"

<a th:href="@{/cars/{id}(id=${car.getId()})}"
		   th:text="${car.getModel()}">car</a> 

# Конфигурация источника данных (Data source)
hibernate.driver_class=org.postgresql.Driver
hibernate.connection.url=jdbc:postgresql://localhost:5432/hibernate
hibernate.connection.username=postgres
hibernate.connection.password=1234

# Конфигурация самого Hibernate
hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
hibernate.show_sql=true
hibernate.current_session_context_class=thread














                                      LEARN


collection framework
spring core
spring boot   // jdbc api
spring data jpa
validation api
spring security
spring mvc         kniga spring in action
sun live
ava Stream API, Java Time API
rest jwt
restapi


chernie i krasnie derevya
hash tablici, spiski, derevya , grafi
algoritmi  abhod derevyev
DI , IoC
mvc

WEB osi tsp/ip    rest api, web socket

microservise
linux
}
