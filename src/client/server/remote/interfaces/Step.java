package client.server.remote.interfaces;

import java.io.Serializable;

public class Step  implements Serializable{

    public String player;
    public int position;
    public String draw;

    public void setPlayer(String player) {
        this.player = player;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setDraw(String draw) {
        this.draw = draw;
    }

    public Step(String player, int position, String draw) {
        this.player = player;
        this.position = position;
        this.draw = draw;
    }

    public String getPlayer() {
        return player;
    }

    public int getPosition() {
        return position;
    }

    public String getDraw() {
        return draw;
    }

}
