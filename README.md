Preisauskunftsystem für einen Supermarkt
========================================

Zu entwicklen ist ein Preisauskunftsystem für einen Supermarkt.
Kunden haben die Möglichkeit einen Artikel zu scannen und die
Preisauskunft auf einem Anzeigegerät zu lesen.

Neben Name und Preis (Brutto, inkl. MwSt.) des Artikels sollen
zusätzlich aktuelle Angebote um diesen Artikel angezeigt werden,
z.B.
* Aktion! Kaufen Sie 2 und zahlen Sie nur 1!
* Angebot! Aktuell um 5% reduziert!


Das Anzeigegerät hat eine fixe Aufteilung:
```
+-----------------------------------------------+
|                                =              |
| NAME DES ARTIKELS              = EUR 99999,99 |               
|                                =              |
+-----------------------------------------------+
|                                               |
| ZEILE 1 (ART DER INFORMATION)                 |
| ZEILE 2 (FREITEXT)                            |
|                                               |
+-----------------------------------------------+
```

Der Name des Artikels kann beliebig lang sein.
Das Anzeigegerät stellt sicher, dass langer Text
als Laufschrift erscheint.
 
Der Preis muss dem Anzeigegerät formatiert als Zeichenkette
übergeben werden. Der Preis kann max. 99999,99 EUR anzeigen.
Es ist sichergestellt, dass der Supermarkt keine Artikel über
99999,99 EUR im Sortiment hat.
Das Anzeigegerät stellt die Währung "EUR" selbst bereit, sie
darf nicht in der Zeichenkette enthalten sein.


Das Anzeigegerät stellt 2 Zeilen für weitere Informationen
zur Verfügung.
In der ersten Zeile wird die Art der Information angezeigt, z.B. "Angebot!"
Die zweite Zeile zeigt die eigentliche Information.

Auch bei diesen 2 Zeilen gilt: das Anzeigegerät stellt sicher, dass zu
langer Text als Laufschrift erscheint.


## Rahmenbedingungen

### Barcode
Der zu scannende Artikel hat einen Barcode.
Zum Zeitpunkt des Scannens ist dies die einzige Information, die das
Preisauskunftsystem hat.

### Artikelinformationen abfragen
Mit dem Barcode kann beim unternehmensweiten Directory angefragt werden.
Dies liefert u.a. folgende Informationen zum Artikel:

* Name des Artikels (String)
* Preis in Netto (double)
* MwSt-Klasse (enum {0, 1, 2})
  * 0: MwSt-befreit
  * 1: 7%
  * 2: 19%


### Angebote und Aktionen abfragen
Mit Hilfe des Barcodes kann beim unternehmensweiten Campaign-Service
angefragt werden. Dieser liefert eine, oder keine Campaign für einen
Artikel. Ein Artikel hat nur eine/keine Campaign.


## Aufgabe
Entwickle das Preisabfragesystem test-driven!
Directory, Campaign-Service und Anzeigegerät stehen als Interfaces bereit und können verwendet werden. Es ist nicht notwendig, diese Interface in konkrete Klassen zu implementieren.
Es ist keine GUI erforderlich - Feedback über Korrektheit der Funktion sollen
automatisierte Test geben.


