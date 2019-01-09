package client.server.remote.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientInterface extends Remote {

    public boolean requestGame(UserModel model1, UserModel player2) throws RemoteException;
    public void startGame(UserModel player1, UserModel player2)throws RemoteException;


}
