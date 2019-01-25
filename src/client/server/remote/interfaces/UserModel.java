package client.server.remote.interfaces;

import java.io.Serializable;

/**
 * @author Amer Shaker
 */
public class UserModel implements Serializable {

    private String ipAddress;
    private String userName;
    private String password;
    private String emailAddress;
    private String status;
    private int numberOfWinedMatches;
    private int numberOfLostMatches;
    private int numberOfMatches;
    private long score;
    private boolean isOnline;

    public UserModel() {
    }

    public UserModel(String ipAddress, String userName, String password, String emailAddress) {
        this(ipAddress, userName, password, emailAddress, "available", 0, 0, 0, false);
    }

    public UserModel(String ipAddress, String userName, String password, String emailAddress, int numberOfWinedMatches, int numberOfLostMatches, long score, boolean isOnline) {
        this(ipAddress, userName, password, emailAddress, "available", numberOfWinedMatches, numberOfLostMatches, score, isOnline);
    }

    public UserModel(String ipAddress, String userName, String password, String emailAddress, String status, int numberOfWinedMatches, int numberOfLostMatches, long score, boolean isOnline) {
        this.ipAddress = ipAddress;
        this.userName = userName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.status = status;
        this.numberOfWinedMatches = numberOfWinedMatches;
        this.numberOfLostMatches = numberOfLostMatches;
        this.numberOfMatches = numberOfWinedMatches + numberOfLostMatches;
        this.score = score;
        this.isOnline = isOnline;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumberOfMatches() {
        return numberOfMatches;
    }

    public void setNumberOfMatches(int numberOfMatches) {
        this.numberOfMatches = numberOfMatches;
    }

    public int getNumberOfWinedMatches() {
        return numberOfWinedMatches;
    }

    public void setNumberOfWinedMatches(int numberOfWinedMatches) {
        this.numberOfWinedMatches = numberOfWinedMatches;
    }

    public int getNumberOfLostMatches() {
        return numberOfLostMatches;
    }

    public void setNumberOfLostMatches(int numberOfLostMatches) {
        this.numberOfLostMatches = numberOfLostMatches;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }
}
