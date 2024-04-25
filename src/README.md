## Tehtävä 10. Refaktorointi

### Tehtävänanto

1. Tutki koodi ja ota selkoa sen toimintalogiikasta. Lisää asialliset kommentit. Kirjaa ylös ja selitä tehtäväpalautuksessa mitkä asiat tökkäsivät ensimmäisenä silmiin, ja mitkä ovat siistimistä ja refaktorointia kaipaavat kohdat.

Korjaa koodia, jotta peli toimii ajatellusti, ja jotta tulostusten avulla voi helposti seurata pelin kulkua.

2. Refaktoroi koodia siten, että se noudattaa muokkaustesi jälkeen mahdollisimman hyvin olio-ohjelmoinnin keskeisiä periaatteita. Kirjaa ylös mitä refaktoroit.

3. Ota erityisesti huomioon testattavuus. Paranna koodia edelleen (siirrä mm. koodia metodeiksi), jotta voit laatia kattavat ja asialliset JUnit 5 -testit. Laadi sitten JUnit-testit.

4. Kirjoita asialliset Javadoc-kommentit, ja tuota Javadoc-sivusto. Vie sivusto versiohallintaan.

5. Tee lopuksi vielä testien kattavuusanalyysi (vain ohjelman koodille, älä sisällytä mukaan testien koodia). Mieti viaelä lopuksi, oletko testannut kaikki oleelliset asiat. Virittele tarvittaessa lisää.

### Koodin toimintalogiikka

Pelin tarkoituksena oli yksinkertainen kivi,sakset, paperi peli jossa kaksi pelaajaa pelaa peliä
ja voittaja ratkaistaan pelaajien valintojen perusteella. Pelaajat valitsevat vuorotellen
kiven, sakset tai paperin ja voittaja ratkaistaan kun jompi kumpi pelaajista voittaa kolme kertaa.

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
