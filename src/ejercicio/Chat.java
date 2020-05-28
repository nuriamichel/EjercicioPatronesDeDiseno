package ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Chat implements Mediator {


    private List<Dev> DevList= new ArrayList<>();


    @Override
    public void send(String msg, Colleague colleague) {
        switch (colleague.role.toUpperCase()){

            case "DEV":
                System.out.println(" <Chat Msg> ");
                for (int i = 0; i < DevList.size(); i++) {
                    if (DevList.get(i).getName() != colleague.getName())
                        DevList.get(i).messageReceived(msg);
                }
                break;

        }
    }


    public void addColleague(Colleague colleague) {
        switch (colleague.role.toUpperCase()){

            case "DEV":
                DevList.add((Dev) colleague);
                break;

        }
    }
}
