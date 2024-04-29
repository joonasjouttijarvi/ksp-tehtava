## Tehtävä 10. Refaktorointi

### Koodin toimintalogiikka

Pelin tarkoituksena oli yksinkertainen kivi,sakset, paperi peli jossa kaksi pelaajaa pelaa peliä
ja voittaja ratkaistaan pelaajien valintojen perusteella. Pelaajat valitsevat vuorotellen
kiven, sakset tai paperin ja voittaja ratkaistaan kun jompi kumpi pelaajista voittaa kolme kertaa.

### Koodin ongelmat

- Koodissa oli käytetty paljon if-else lauseita. Koodi oli sekavaa ja vaikeasti luettavaa.
- Koodissa oli paljon toistoa ja se ei kommenttien mukaan toiminut oikein.

### Refaktorointi

1. Muutin koodin kielen englanniksi, luettaavuuden parantamiseksi.
2. Poistin turhat kommentit ja muuttujat
3. Refaktoroin koodia siirtämällä koodia luokkiin ja metodeihin
4. Refaktoroin koodia siten, että se noudattaa mahdollisimman hyvin olio-ohjelmoinnin keskeisiä periaatteita.
5. Siirsin koodia metodeiksi ja tein JUnit 5 testit.
6. Kirjoitin Javadoc-kommentit pelin luokille ja metodeille.

### Linkit JavaDoc sivustoon ja testikattavuusraporttiin
