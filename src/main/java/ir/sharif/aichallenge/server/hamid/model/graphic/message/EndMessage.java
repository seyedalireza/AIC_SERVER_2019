package ir.sharif.aichallenge.server.hamid.model.graphic.message;

import lombok.Setter;

@Setter
public class EndMessage {   //todo set this
    int[] scores;
    int winner;     // -1 if draw
}
