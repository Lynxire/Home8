package One;

public class Terapevt extends Pacient  {
    public void healing() {
        System.out.println("Лечит терапевт");
    }

    public void proverca(){
      if(getPlan() == 1){
          doktor = "хирург";
          System.out.println("назначен " + doktor);
          Xirurg xirurg = new Xirurg();
          xirurg.healing();
      }
      else if(getPlan() == 2){
          doktor = "Дантист";

          System.out.println("назначен " + doktor);
          Dantist dantist = new Dantist();
          dantist.healing();
      }
      else {
          doktor = "терапевт";

          System.out.println("назначен " + doktor);
          healing();
      }

    }

}
