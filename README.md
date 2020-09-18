# DROPBOX - List Revisions

La seguente documentazione è relativa al progetto di programmazione ad oggetti in data 18/09/2020.
- [Introduzione ](https://github.com/LorenzoLongarini/OopProject/blob/master/README.md#introduzione)
- [Specifiche del progetto](https://github.com/LorenzoLongarini/OopProject/blob/master/README.md#specifiche-del-progetto)
- Struttura e Funzionamento
-  Sitografia e Software
- Autore

### Introduzione
- #### Cos'è un Web Service?
```Un Web Service è un sistema software in grado di mettersi al servizio di un applicazione comunicando su di una medesima rete tramite il protocollo HTTP: esso consente quindi alle applicazioni che vi si collegano di usufruire delle funzioni che mette a disposizione.```
- #### Perchè Spring Boot?
```Spring Boot è una soluzione "convention over configuration" per il framework Spring di Java, che è stato rilasciato nel 2012 e riduce la complessità di configurazione di nuovi progetti Spring. A questo scopo, Spring Boot definisce una configurazione di base che include le linee guida per l'uso del framework e tutte le librerie di terze parti rilevanti, rendendo quindi l'avvio di nuovi progetti il più semplice possibile.```

### Specifiche del progetto: 

- ```A partire dai file presenti in una cartella Dropbox si analizzino le revisioni dei singoli file effettuando statistiche su numerosità  e tempi medi.```
- ```Statistiche sulle revisioni per singolo file con numero di revisioni giornaliere e settimanali e tempo medio tra le revisioni.```

### Struttura e Funzionamento
Per il corretto funzionamento è opportuno scaricare la seguente repository così da poter visionare meglio il progetto.

Il programma è strutturato in cinque package come segue :

 <img src="https://github.com/LorenzoLongarini/OopProject/blob/master/UML/Packages.jpg" width="400" height="256">
 
La classe contente il main è situato all'interno di  it.univpm.OopProject ed è la classe che consente l'avvio dell'applicazione.

Seguono in ordine:
- Controller

 <img src="https://github.com/LorenzoLongarini/OopProject/blob/master/UML/Controller.jpg" width="400" height="256">


 
 La classe che gestisce le chiamate. Dispone di tre tipologie di chiamata come in tabella:
|
 
