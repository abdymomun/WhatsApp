package WhatsApp;

import WhatsApp.Classes.Profilie;
import WhatsApp.Interface.Impl.ProfileServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        try {
            while (true) {
                ProfileServiceImpl Service = new ProfileServiceImpl();
                List<Profilie> profilies = new ArrayList<>();
                System.out.println("1-> Install whatsapp" +
                        "\n2 -> Go to profile" +
                        "\n3 -> Get all whatsapp status " +
                        "\n4 -> Change profile photo" +
                        "\n5 -> Change Status" +
                        "\n6 -> Add contact" +
                        "\n7 -> Send Message");
                int a = new Scanner(System.in).nextInt();
                switch (a) {
                    case 1 -> Service.InstallWhatsapp(profilies);
                    case 2 -> Service.GoToProfile(profilies);
                    case 3 -> Service.GetAllWhatsAppStatus(profilies);
                    case 4 -> Service.ChangeProfilePhoto(profilies);
                    case 5 -> Service.ChangeWhatsAppStatus(profilies);
                    case 6 -> Service.AddContact(profilies);
                    case 7 -> Service.SendMessage(profilies);
                    default -> System.out.println("ererrrr");
                }



        }
        }catch(Exception e){
            System.out.println("erorr qq");
        }
    }
}