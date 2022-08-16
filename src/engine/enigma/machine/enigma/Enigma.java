package engine.enigma.machine.enigma;


import DTO.machine.enigma.DTOEnigmaSpecs;
import engine.enigma.machine.enigma.components.PlugBoard;
import engine.enigma.machine.enigma.components.Reflector;
import engine.enigma.machine.enigma.components.rotors.Rotor;
import engine.enigma.machine.enigma.components.rotors.Rotors;
import engine.enigma.machine.enigma_settings.EnigmaSettings;
import java.util.LinkedList;
import java.util.List;

public class Enigma {
    private final String ABC;
    private final Rotors rotors;
    private final Reflector reflector;
    private final PlugBoard plugboard;
    private final String startPosition;
    private final List<String> encodingHistory;

    public Enigma(EnigmaSettings settings, List<Rotor> rotors, List<Reflector> reflectors, String ABC){
        this.rotors = new Rotors(rotors,settings.getRotorsChosen());
        this.rotors.setPosition(settings.getStartingPositions());
        this.reflector = reflectors.get(settings.getReflectorID() - 1);
        this.plugboard = new PlugBoard(settings.getPlugBoardString(), ABC);
        this.ABC = ABC;
        this.encodingHistory = new LinkedList<>();
        this.startPosition = settings.getStartingPositions();
    }

    public String encodeDecode(String inputFromUser){
        int out;
        StringBuilder message = new StringBuilder();
        for (String curChar : inputFromUser.
                toUpperCase().split("(?!^)")){
            out = ABC.indexOf(curChar);
            out = plugboard.get(out);
            out = rotors.forward(out);
            out = reflector.forward(out);
            out = rotors.backward(out);
            out = plugboard.get(out);

            message.append(ABC.charAt(out));
        }
        return message.toString();
    }
}
