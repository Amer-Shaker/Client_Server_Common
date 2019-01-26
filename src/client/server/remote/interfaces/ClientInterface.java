package client.server.remote.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientInterface extends Remote {

    public int requestGame(UserModel model1, UserModel player2) throws RemoteException;

    public void startGame(UserModel player1, UserModel player2) throws RemoteException;

    public void refreshOnlineUsersList(UserModel user, boolean isLoggedIn) throws RemoteException;

    public void drawMove(Step s) throws RemoteException;

    public abstract void receiverMessage(UserModel player1, String message) throws RemoteException;

    public abstract void closeGame() throws RemoteException;

    public void serverLogOut() throws RemoteException;
}
