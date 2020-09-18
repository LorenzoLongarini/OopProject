# DROPBOX - List Revisions

La seguente documentazione è relativa al progetto di programmazione ad oggetti in data 18/09/2020.
- [Introduzione ](https://github.com/LorenzoLongarini/OopProject/blob/master/README.md#introduzione)
- [Specifiche del progetto](https://github.com/LorenzoLongarini/OopProject/blob/master/README.md#specifiche-del-progetto)
- [Struttura e Funzionamento](https://github.com/LorenzoLongarini/OopProject/blob/master/README.md#struttura-e-funzionamento)
-  [Softwares](https://github.com/LorenzoLongarini/OopProject#softwares)
- [Autore](https://github.com/LorenzoLongarini/OopProject#autore)

### Introduzione
- #### Cos'è un Web Service?
```Un Web Service è un sistema software in grado di mettersi al servizio di un applicazione comunicando su di una medesima rete tramite il protocollo HTTP: esso consente quindi alle applicazioni che vi si collegano di usufruire delle funzioni che mette a disposizione.```
- #### Perchè Spring Boot?
```Spring Boot è una soluzione "convention over configuration" per il framework Spring di Java, che è stato rilasciato nel 2012 e riduce la complessità di configurazione di nuovi progetti Spring. A questo scopo, Spring Boot definisce una configurazione di base che include le linee guida per l'uso del framework e tutte le librerie di terze parti rilevanti, rendendo quindi l'avvio di nuovi progetti il più semplice possibile.```

[<img src="https://github.com/LorenzoLongarini/OopProject/blob/master/UML/User.jpg" width="30" height="30">](https://github.com/LorenzoLongarini/OopProject#dropbox---list-revisions)

### Specifiche del progetto: 

- ```A partire dai file presenti in una cartella Dropbox si analizzino le revisioni dei singoli file effettuando statistiche su numerosità  e tempi medi.```
- ```Statistiche sulle revisioni per singolo file con numero di revisioni giornaliere e settimanali e tempo medio tra le revisioni.```

### Struttura e Funzionamento
Per il corretto funzionamento è opportuno scaricare la seguente [*repository*]-- (https://github.com/LorenzoLongarini/OopProject.git) così da poter visionare meglio il progetto.
Avviata l'applicazione come Spring Boot Application, il Web Service sarà in ascolto alla porta [http://localhost:8080](http://localhost:8080/). Per una più semplice visualizzazione dei dati che verranno restituiti si consiglia l'utilizzo di Postman (un'applicazione del browser Google Chrome che consente di costruire, testare e documentare API).
Le possibilità dell'utente sono mostrate nel seguente diagramma dei casi d'uso: 
 <img src="https://github.com/LorenzoLongarini/OopProject/blob/master/UML/User.jpg" width="400" height="256">

TIPO RICHIESTA | ROTTA | FUNZIONE |
-|-|-|
GET | /data | Restituisce tutte le revisioni sui file presenti nel Dropbox con path TxtDoc in formato json. |
GET | /metadata | Restituisce tutte le informazioni utili (formato json) alla comprensione del json delle revisioni.
POST | /stats | Restituisce statistiche relative a numerosità e tempi medi  delle revisioni relative ad una data specificata dall'utente all'interno del body della richiesta.



Il programma è strutturato in cinque package come segue :

 <img src="https://github.com/LorenzoLongarini/OopProject/blob/master/UML/Packages.jpg" width="400" height="256">
 
La classe contente il main è situato all'interno di  it.univpm.OopProject ed è la classe che consente l'avvio dell'applicazione.

Seguono in ordine:
- Controller

 <img src="https://github.com/LorenzoLongarini/OopProject/blob/master/UML/Controller.jpg" width="380" height="280">

La classe ```restController``` gestisce le chiamate come mostrato precedentemente.
Per ottenere i risultati descritti sarà opportuno far seguire alla porta localhost:8080 le varie rotte.
Le due richieste GET non richiedo altro se non l'inserimento della rotta, mentre la richiesta POST necessita di specificare, all'interno del body, la data cui si vuole fare riferimento in formato  aaaa-MM-ggT:hh:mm:ssZ con chiave ```server_modified``` e il nome del file come in Dropbox, con chiave ```name```.

- Exception 
<img src="https://github.com/LorenzoLongarini/OopProject/blob/master/UML/Exception.jpg" width="400" height="280">
Il seguente package è costituito da due classi: ```GenericInternalException``` e ```GenericExternalException```. Entambe le classi estendono la classe Exception e consentono rispettivamente di gestire le eccezioni interne ed esterne, inviando un messaggio di errore pronto a specificare il problema che ha causato l'eccezione.

- Model  
 <img src="https://github.com/LorenzoLongarini/OopProject/blob/master/UML/Model.jpg" width="700" height="450">
 Il package model è costituito da quattro classi:
	 - ```Entry```, le informazioni relative alla singola revisione di un file;
	 - ```Revision```, contiene l'informazione *is_deleted* (che ci informa sull'eventuale eliminazione del file), e tutti le entries relativa ad un file;
	 - ```Metadata```, è il singolo metadato con informazioni sul nome, descrizione e tipo di ogni elemento di revision;
	 - ```Stats```, contiene i campi delle statistiche che verranno mostrate con la chiamata POST.

- Services
 <img src="https://github.com/LorenzoLongarini/OopProject/blob/master/UML/Services.jpg" width="400" height="280">

Nel package services possiamo individuare le classi:
		- Database, classe che scarica il json e restituisce un lista di revisioni;
		- 

-  Util
 <img src="https://github.com/LorenzoLongarini/OopProject/blob/master/UML/Utility.jpg" width="400" height="280">

Diagramma delle sequenze


 <img src="https://github.com/LorenzoLongarini/OopProject/blob/master/UML/SequenceDiagram.jpg" width="750" height="500">


### Softwares

### Autore
[**Lorenzo Longarini**](https://github.com/LorenzoLongarini)


