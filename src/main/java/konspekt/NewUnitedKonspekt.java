package konspekt;

/**
 * @author Anton Muzhytskyi
 */

public class NewUnitedKonspekt {

===============================================================================
================================NEMCHINSKIY  WEB====================================
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

========================================================
========================================================
                        ---SPRING CORE---
========================================================
========================================================
spring framework  sostoit iz             core
 aplication context                      mvc
 dependency injection                    jdbc
 jdbc                                    boot
 mvc                                     data jpa
 spring.io                               security
 boot 
 security

   spring core IoC, DI, Beans, Xml, Anotations

IoC   inversion of  control - izbavlyaemsys ot zavisimostey   interface   ili  abstractniy class
DI   dependency injection - vnedrenie zavisimostey - constructor, setter, @Autowired
	+
	+
	+
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

=========================================================

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




==========================================================
bean - java obyect sozdanniy Springom (naprimer class)
scope - zona vidimosti
scope singletone - bean sozdaetsya odin raz
scope prototype - kazhdiy raz noviy bean

konfiguracii Spring
    1.   xml
    2.   xml+annotation
    3.   annotation , all in java code(no xml)        vmesto web.xml @Configuration SpringConfig i MySpringDispatcherServletInitializer extends Abstract...DispatcherServlet  +pom.xml Maven
                            @Configuration
                            @ComponentScan
                            public class SpringConfig{
                                  @Bean
                                  public classicalMusic musicBean(){
                                     return new ClassicalMusic
                                     }
                             }

@Component  - sozday bean classa
@Autowired -DI vnedrenie zavisimosti v class
@Qualifier("rockMusic") - pishetsya vnutri konstruktora pered argumentom
@Value(${musicPlayer.name}) - import znacheniya iz properties
@Scope("singletone")    ili "prototype"
    @PostConstruct      doMyInit         redko
    @PreDestroy         doMyDestroy      redko




--SPRING MVC
 model-view-controller      - arhitectura prilozheniya - pattern proectirovaniya prilozheniya

vhod v mvc - dispatcher servlet

controller
@GetMapping  = ustarevshemu @RequestMapping(method = RequestMethod.GET)    takzhe est post delete put patch


zaprosi  
  get
  post
  put
  patch
  delete

parametri v zaprosecherez url localhost:8080/first/hello?name=Tom&surname=Kon

@GetMapping("/hello")
 public String helloPage(HttpServletRequest request) - dostup ko vsemu http zaprosu  

@GetMapping("/hello")
 public String helloPage(@RequestParam("name") String name) - dostup po klyucham

Thymelive- shablonizator dlya frontenda

CRUD create read update delete
REST -pattern proektirovaniya web prilozheniy, opisivaet to kak client cherez http vzaimodeystvuet s serverom,
      vsyo vzaimodeystvie cherez crud
      create post
      read   get
      update patch
      delete delete     (eto tolko osnovi), rest - bolshoy

      GET / people/:id     Controller - mnozhestvennoe chislo - PeopleController
                           Model - edinstvennoe chislo - Person

      DAO Data Access Object  Model <-> DAO <-> Data Base   vsya logika vzaimodeystviya v dao


-------------
controller
@GetMapping("/id")
...
@GetMapping("/new")
...
@ModelAttribute("headerMessage") ->lubaya (predidush) model iz etogo kontrollera budet imet 
                                   znachenie s klyuchom - headerMessage, dobovlyaet Model v odnu strochku
                                   po sravneniyu s @RequestParam(kazhdoe pole dobovlyaetsya otdelno)
...


============================================================================
                         STRUKTURI DANNIH
============================================================================
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
-------------------------------------------------------

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

----------------
html 5  tolko  get i post
dlya patch update delete nuzhno dobavit kod v settings  + _method hidden

@Valid v dao  +hibernate validation dependency + @NotNull na modele

------------------
Svyaz java s data base : JDBC API                  sql zaprosi cherez statement  otvet cherez resultSet
                         Jdbc Temlate              class .. implements RowMpapper,  settings @Bean jdbs templare + @Bean dataSource + v DAO vsegda prepareStatement
                         Hibernate             ->            orm -object relation mapping, sql ne pishetsya, otdelnaya ot Spring biblioteka, pod kapotom jdbc api

-----------------
SQL commands: DDL Data Defenition Lenguage       DML Data Manipulation Lenguage
              CREATE DATABASE or TABLE              SELECT, INSERT, UPDATE, DELETE
              DROPE DATABASE or TABLE   

SQL injection  - sposob vzloma saytov putem vvoda v pole odinar kovichki+ drope table naprimer
chtobi zashititsya ot sql injection vmesto statement ispolzuyut preparedStatement    ...values(?,?,?)
----------------------------------
poisk po 2 tablicam   :  inner join, left join
///
indeksirovanie  -  wsozdanie OTSORTIROVANNOY tablici dlya bistrogo poiska (dvoichniy)
                   table    stroka
CREATE INDEX ON Transaction(amount) USING PRIMARY KEY;   (B-Tree Index, Hash index, Brin index)
///
kaskadirovanie  -pokazivaet shto delat so svyazannoy tablicey pri udalenii dannih iz tablici s foreign key
  user_id int REFERENCES Person(user_id) ON DELETE CASCADE; - tozhe udolit ili -  SET NULL;
alter table  - izmenit tablicu
	+
	+
	+

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


INSERT INTO employee (id,first_name, last_name, gender, country_of_birth, email, date_of_birth)
               VALUES(3, 'John', 'Doe',        ' Male', 'Ukraine', 'jd@gmail.com', '2019-12-10')
               ON CONFLICT (id) DO UPDATE;

SELECT * FROM employee WHERE email LIKE '%.com'; 
SELECT * FROM employee LEFT JOIN bicicle ON bicicle.id = employee.bicicle_id;   -vivesti vseh rabotnikov i tolko te velosipedi kotorie u nih est


mockaroo.com  -generate table


=====================================================
=====================================================

-------------
Optonal<Person>    to zhe samoe chto   != null proveryaet est li takoy obyect metodom isPresent()
-----------
    validaciya texta naprimer adressa  -  Strana, Gorod, Ulica
@Pattern(regexp= "[A-Z]\\w+, [A-Z]\\w+, ..."                 regexp.com
private String adress;
------------------------
  vipadayushiy spisok  tegi <select> <option>  video v papke project1
-------------------------
hybeernate orm
SessionFactory
Session
session.beginTransaction()
 hibernate.properties     - nastroyki DB

List<Person> people = session.createQuery("FROM Person  where age>30").getResultList();  - zapros na yazike HQL pokazat vsev iz tablici person
person.setName("Tomas");  -update name v tablice cherez hibernate

@Entity
@Table(name="Item")                            many (owning side) -sushnost kotoraya vladeet vneshnim klyuchom
public class Item{
  @ManyToOne
  @JoinColumn(name=""person_id", referencedColumnName="id")
  private Person owner
}

@Entity 
@Table(name="Person")                            one
public class Person{
  @OneToMany(mappedBy = "owner"
  private List<item> items;
}

@Id
@Column 
@GeneratedValue
-------------------------
sostoyaniya hipernate -  hibernate entity life cicle
 1 persisstent state (managed)   - persistance context  - otslezhivaetsya hibernatom
 2 aleniyadetached state - prosto java obyect , poslezakr sessii, neotslezhivaetsya hibernatom
 3 removed state - pomecheniy dlya udaleniya
------------------------------------------
@Entity
@Table(name="Actor")
public class Actor{
  @ManyToMany
  @JoinTable(name="Actor_Movie", joinColumns = @JoinColumn(name= "actor_id"), inverseJoinColumns = @JoinColumn(name = "movie_id"))
  private List<Movie> movies;
}

@Entity
@Table(name="Movie")
public class Movie{
  @ManyToMany(mappedBy = "movies")
  private List<Actor> actors;
}
-------------------
Lazy loading and Eager loading
@OneToMany(mappesdBy = "owner", fetch= FetchType.LAZY)   // or EAGER
private List<item> items;
--------------------------
spring+hibernate

maven dependency

SpringConfig
private final Enironment env;

hibernate.properties     -> db nastroyki

change dataSource()

DAO +sessionFactory  vnedryaem
  @Transactional                         //(readOnly = true)
             index(){
     session sozdaem
}

-----------------------------
Data JPA -esho kruche chem hibernate
dao v 3 strochki  +  Repository +  service

kontroller <-> Service <-> DAO
SpringConfig
@EnableJpaRepositories("")
entityManagerFactory        vmesto session factory v springConfig

@Repository 
          interface extends JpaRepository
+

@Service
@Transactional
public class PeopleService{

   public final PeopleRepository peopleRepository;

}


v controllere vmesto dao peopleService
+++++++++++
+++++++++++
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
-------------------------------------
Spring boot   - vmesto spring config   - skachivaetsya startovoe prilozhenie iz Spring initializr jar 
  versiya bez snapshot
+add dependencies
Spring boot application scaniruet @Component , dolzhen bit v kornevoy papke
 aplication.properties - nastroyki db

spring boot imeet vstroenniy server(tomcat)
deploy na udalenniy server
  podklyuchaemsya cherez ssh
  zagruzhaem papku
  zapuskaem skript dlya maven  ./mvn
  zapuskaem sformirovanniy jar fayl

---------------------------------------
sequrity
authority - rol polzovatelya
sessiya - obyect na servere hranyashiy informaciyu o kliente
cookies - informaciya na brauzere kotoraya otpravlyaetsya na server pri kazhdom zaprose (klyuch: znachenie)
           domain i path (same origin policy) visilaet cookies tomu zhe saytu ot kotorogo zapros
           JSESSIONID 
         ---------------

package security
  public class PersonDetails implements UserDetails{}
 
  public class AuthProviderImpl implements AuthenticationProvider{}

package config
  @EnableWebSecurity
  public class SecurityConfig extends WebSecurityConfigurerAdapter{
	protected void configure(AuthenticationManagerBuilder auth) {
		auth.authenticationProvider();
	}
  }

package repositories
  public interface PeopleRepository extends JpaRepository<Person, Integer>{
     findByUserName()}

package services
  @Service
  public class PersonDetailsService implements UserDetailsService()



SecurityConfig -> pokazivaet springu na  AuthProvider gde proishodit ves dvizh
AuthProvider -> metodom authentication prinimaet login i parol ot 
               polzovatelya(credentials) sravnivaet ih s dannimi iz PersonDetailsService
                i vozvrashaet auth.token s personDetails
PersonDetailsService -> vizivaet Repository JPA iz kotorogo vityagivaet Person by name
                        i vozvrtashaet  Person  cherez PersonDetails
PersonDetails -> obertka vokrug Person.



Esli pishesh svoyu authenticaciyu

CLASSES  SecurityConfig -> AuthProviderImpl -> PersonDetailsService -> PersonDetails -> Person -> hibernate -> DB
                                  :                     :                      :
                                  *                     *                      *
INTERFACES                  AuthProvider       UserDetailsService        UserDetails


Esli authenticaciya standartnaya, to bez AuthProvider

CLASSES  SecurityConfig -> PersonDetailsService -> PersonDetails -> Person -> hibernate -> DB
                                  :                     :                      
                                  *                     *                      
INTERFACES                UserDetailsService        UserDetails



shifrovanie.
 odnostoronnyaya funkciya  123*456 =98765443(hash) ,dolzhna bit determenirovana   h(x) = y    -vsegda

  registraciya  bcrypt("password") -> hash   in db <-----
                                                         |
  login        bcrypt("password") -> hash  sravnivaem s --


CSRF (cross site request forgery) -mezhsaytovaya potdelka zaprosov
zashita ot csrf ataki ispolzovanie odnorazovogo csrf-tokena    pishetsya v view( tempates) pri login i log
       -----------
Avtorizaciya
Config
   1 authoriz
   2 vseostalnie      (bolee speceficheskie pravila(matcheri) idut ranshe chem bolee obshie
 
kazhdoy ROLE_  svoi AUTHORITIES

@PreAuthorize  - ispolzuetsya v Service  (ne v Controller)

.........................................................................
JWT token -json web token   stateless / sostoit iz 3h chastey  8876gb.ujyghu8.8yhnbbvj -v posledney sekret / medlenniy/ ispolzuetsya v microservisnoy arhitecture/
sessii+coockies             stateful / bistree/ bezopasnee/ ne sovetuyetsya dlya mikroservisnoy arhitecturi

----------------------------------------------------------------
REST API    json 
raznie backend na raznih yazikah  obshayutsya cherez json dannimi  
microservisnaya arhitectura
legko mashtabiruetsya i izmenyaetsya
pofig na frontend
mnogo raznih serverov

json  - format klyuch-znacheniye(+massivi)
jackson  - biblioteka dlya perevoda JAVA obj v json    geteri i seteri - obyazatelno

@RequestBody     - prinimaet json ot klienta
@ResponseBody    - otdaet klientu json(java obj)

dlya proverki Get metodov  @GetMapping  - mozhem ispolzovat brauzer (http)  localhost:8080/hello
dlya proverki Post metodov @PostMapping - ispolzuem programmu postman

@ExceptionHandler - otlavlivaet oshibki , i isklyucheniya
DTO -data transfer object, vnedryaetsya na urovne controllera, nuzhen kak prosloyka mezhdu model i json ,
    ispolzuetsya : model ijson otlichayutsya(id,podtvirzhdeniye parolya i t.d.)
    udoben esli ponadobitsya vnosit izmeneniya v konstrukciyu json ili modeli 

ModelMapper - perevoit iz DTO v model (mapit)
----------------------------------------------------------------
GIT HUB
access token   - password - generated in git -> in settings -> developer settings -> Tokens(classic) use like a password
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
login aamred
----------------------------------------------------------------
@Component nado shob vnedryat s pomoshyu @Autowired

mvnrepository  dependencies
spring.io     boot


	+	
	+
	+
	+
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


------------------------------------------------------------
------------------------------------------------------------

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

---------------------------------------------------------
learn


chernie i krasnie derevya
hash tablici, spiski, derevya , grafi
algoritmi  abhod derevyev
DI , IoC
mvc

WEB osi tsp/ip    rest api, web socket

microservise
linux


}
