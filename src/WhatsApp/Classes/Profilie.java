package WhatsApp.Classes;

import WhatsApp.enums.Photo;
import WhatsApp.enums.Status;

import java.util.List;

public class Profilie {
    private int id;
    private String userName;
    private int phoneNumber;
    private String password;
    private String image  ;
    private Status status;
    private String Messages;
//private List<Profilie>profilies;
//
//    public List<Profilie> getProfilies() {
//        return profilies;
//    }
//
//    public void setProfilies(List<Profilie> profilies) {
//        this.profilies = profilies;
//    }

    public Profilie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMessages() {
        return Messages;
    }

    public void setMessages(String messages) {
        Messages = messages;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Profilie " +
                "\nId" + id +
                "\nUserName " + userName +
                "\nPhoneNumber " + phoneNumber +
                "\nImage " + image +
                "\nStatus " + status +
                "\nMessages " + Messages +
                "";
    }
}
