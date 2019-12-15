package project.linelogin.models;

public class UserModel {
    private String username;
    private String password;
    private int lineId;

    public UserModel(String username,String password,int lineId){
        this.lineId = lineId;
        this.username = username;
        this.password = password;
    }

    public int getLineId() {
        return lineId;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
