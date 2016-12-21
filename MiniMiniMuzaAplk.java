import javax.sound.midi.*; 
public class MiniMiniMuzaAplk { // pierwsza aplikacja

 public static void main(String[] args) {
 MiniMiniMuzaAplk mini = new MiniMiniMuzaAplk();
 mini.graj();
 } // koniec main

 public void graj() {
 try {

 Sequencer sekwenser = MidiSystem.getSequencer(); 
 sekwenser.open();

 Sequence sekw = new Sequence(Sequence.PPQ, 4); 

 Track sciezka = sekw.createTrack();

 ShortMessage a = new ShortMessage();
a.setMessage(144, 1, 44, 100);
 MidiEvent nutaP = new MidiEvent(a, 1);
 sciezka.add(nutaP); 
 
  ShortMessage c = new ShortMessage();
c.setMessage(144, 1, 48, 100);
 MidiEvent nutaJ = new MidiEvent(c, 2);
 sciezka.add(nutaJ); 

 ShortMessage b = new ShortMessage();
b.setMessage(128, 1, 47, 100);
 MidiEvent nutaK = new MidiEvent(b, 3);
 sciezka.add(nutaK);
 
   ShortMessage d = new ShortMessage();
d.setMessage(128, 1, 48, 100);
 MidiEvent nutaL = new MidiEvent(d, 2);
 sciezka.add(nutaL); 

 sekwenser.setSequence(sekw); 

 sekwenser.start(); 

 } catch (Exception ex) {ex.printStackTrace();}
 } // koniec graj
} // koniec klasy