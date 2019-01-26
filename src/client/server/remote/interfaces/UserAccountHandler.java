package client.server.remote.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * @author Amer Shaker
 */
public interface UserAccountHandler extends Remote {

    public abstract UserModel login(ClientInterface client, String emailAddress, String password) throws RemoteException;

    public abstract boolean signUp(UserModel user) throws RemoteException;

    public abstract boolean logOut(String emailAddress) throws RemoteException;

    public abstract List<UserModel> getOnlinePlayers() throws RemoteException;

    public abstract int requestGame(UserModel player1, UserModel player2) throws RemoteException;

    public abstract void transmitMove(Step step) throws RemoteException;

    public abstract boolean isServerUponRunning() throws RemoteException;

    public abstract void sendMessage(UserModel player1, UserModel player2, String message) throws RemoteException;

    public abstract int increaseWinnerScore(String emailAddress) throws RemoteException;

    public abstract void closeGame(UserModel player1, UserModel player2) throws RemoteException;
    
     public abstract int getUpdatedScore(String emailAddress) throws RemoteException;
}
