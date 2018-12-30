
package model;


public class Taikhoan {
    private long userID;
    private String userEmail;
    private String userPass;
    private boolean Role;

    public Taikhoan() {
    }

    public Taikhoan(long userID, String userEmail, String userPass, boolean Role) {
        this.userID = userID;
        this.userEmail = userEmail;
        this.userPass = userPass;
        this.Role = Role;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public boolean isRole() {
        return Role;
    }

    public void setRole(boolean Role) {
        this.Role = Role;
    }
    
    
}
