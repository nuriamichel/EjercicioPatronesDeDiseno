package ejercicio;

public class Client {


    public static void main (String [] arg) {
        Chat salaChat = new Chat();

        Dev dev1 = new Dev(salaChat);
        dev1.setName("dev1");
        Dev dev2 = new Dev(salaChat);
        dev2.setName("dev2");
        Dev dev3 = new Dev(salaChat);
        dev3.setName("dev3");
        Dev dev4 = new Dev(salaChat);
        dev4.setName("dev4");
        Dev dev5 = new Dev(salaChat);
        dev5.setName("dev5");

        salaChat.addColleague(dev1);
        salaChat.addColleague(dev2);
        salaChat.addColleague(dev3);
        salaChat.addColleague(dev4);
        salaChat.addColleague(dev5);

        dev1.send("Cambios en codigo");
        dev5.send("Otros cambios");
        dev3.send("Más cambios");

    }

}
