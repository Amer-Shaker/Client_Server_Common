package client.server.remote.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * @author Amer Shaker
 */
public interface UserAccountHandler extends Remote {

    public UserModel login(ClientInterface client, String emailAddress, String password) throws RemoteException;

    public boolean signUp(UserModel user) throws RemoteException;

    public boolean logOut(String emailAddress) throws RemoteException;

    public void tellOthers(UserModel user1, UserModel user2) throws RemoteException;

    public List<UserModel> getOnlinePlayer() throws RemoteException;

    public List<UserModel> getAllPlayer() throws RemoteException;

    public boolean requestGame(UserModel player1, UserModel player2) throws RemoteException;

    public void transmitMove(Step step) throws RemoteException;

    public boolean isServerUponRunning() throws RemoteException;

    public void sendMessage(UserModel player1, String Message, UserModel player2) throws RemoteException;

    public void acceptRequest() throws RemoteException;
}
