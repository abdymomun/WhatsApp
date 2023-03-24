package WhatsApp.Interface.Impl;
import WhatsApp.Classes.Profilie;
import WhatsApp.Interface.ProfileService;
import WhatsApp.MyExceptions.MyException;
import WhatsApp.enums.Photo;
import WhatsApp.enums.Status;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class ProfileServiceImpl implements ProfileService {
    @Override
    public Profilie InstallWhatsapp(List<Profilie>profilies) {
        try {
           Profilie profilie = new Profilie();
            System.out.println("Write phone number ");
            int number = new Scanner(System.in).nextInt();
            profilie.setPhoneNumber(number);
            System.out.println("Write name");
            String name = new Scanner(System.in).nextLine();
            profilie.setUserName(name);
            System.out.println("Write password");
            String password = new Scanner(System.in).nextLine();
            if (password.length() <= 7){
                System.out.println("Must be less than 7 words in length");
            }else {
                profilie.setPassword(password);
            }
            profilie.setId(profilies.size()+1);
            profilie.setStatus(Status.Hello_WhatsApp);
            profilie.setMessages("null");
           // profilies.add(profilie);
            System.out.println(profilie + "\nSuccessful ");
return profilie;
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage() + " Write  Only number ");
        }

        return null;
    }

    @Override
    public void GoToProfile(List<Profilie>profilies) {
        System.out.println("Write name");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Write password");
        String password = new Scanner(System.in).nextLine();
        for (Profilie profilie : profilies) {
            if (profilie.getUserName().equals(name) && profilie.getPassword().equals(password)){
                System.out.println(profilie.toString());
            }
        }
    }
    @Override
    public void GetAllWhatsAppStatus(List<Profilie> profilies) {
        for (Status p : Status.values()) {
            System.out.println(p);
        }
    }
    @Override
    public void ChangeProfilePhoto(List<Profilie> profilies) {
        try {


            System.out.println("Write name");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Write password");
            String password = new Scanner(System.in).nextLine();

            for (Profilie p : profilies) {
                if (p.getUserName().equals(name) && p.getPassword().equals(password)) {
                    System.out.println("Put new photo link " +
                            "\n1-> " +Photo.Defaut_Photo+
                    "\n2-> "+Photo.FriendPhoto+
                    "\n3_> "+Photo.youPhoto+
                            "\n4-> "+Photo.link);
                    String photo = new Scanner(System.in).nextLine();
                    int d = new Scanner(System.in).nextInt();
                    switch (d){
                        case 1:
                            p.setImage(String.valueOf(Photo.Defaut_Photo));
                            break;
                        case 2:
                            p.setImage(String.valueOf(Photo.FriendPhoto));
                            break;
                        case 3:
                            p.setImage(String.valueOf(Photo.youPhoto));
                            break;
                        case 4:
                            p.setImage(String.valueOf(Photo.link));
                            break;
                        default:
                            System.out.println("select from the list");
                    }
                    System.out.println(p.toString());

                } else {
                    throw new MyException("wrong password or username");
                }
            }


        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void ChangeWhatsAppStatus(List<Profilie> profilies) {
        try {
            System.out.println("Write name");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Write password");
            String password = new Scanner(System.in).nextLine();
            for (Profilie p : profilies) {
                if (p.getUserName().equals(name) && p.getPassword().equals(password)) {
                    System.out.println("You Status " + Status.Hello_WhatsApp +
                            "\nChoose on of the statuses" +
                            "\n1 -> " + Status.At_work +
                            "\n2 -> " + Status.I_m_busy +
                            "\n3 -> " + Status.At_school +
                            "\n4 -> " + Status.Hello_WhatsApp);
                    int d = new Scanner(System.in).nextInt();
                    switch (d) {
                        case 1:
                            p.setStatus(Status.At_work);
                            break;
                        case 2:
                            p.setStatus(Status.I_m_busy);
                            break;
                        case 3:
                            p.setStatus(Status.At_school);
                            break;
                        case 4:
                            p.setStatus(Status.Hello_WhatsApp);
                            break;
                        default:
                            System.out.println("select from the list");
                    }
                    System.out.println(p.toString());
                } else {
                    throw new MyException("wrong password or username");
                }




            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void AddContact(List<Profilie> profilies) {
        try {

            System.out.println("Write your name ");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Write your password");
            String password = new Scanner(System.in).nextLine();
            for (Profilie p : profilies) {
                if (p.getUserName().equals(name) && p.getPassword().equals(password)) {
                     System.out.println("Enter contact WhatsApp number ");
                     int number = new Scanner(System.in).nextInt();
                    for (Profilie add:profilies) {
                             if (add.getPhoneNumber() == number)  {
                              System.out.println("Contact successfully ");
                             }  else {
                                 System.out.println("This number is not install WhatsApp add");
                             }
                    }

                } else {
                    throw new MyException("This number is not install WhatsApp ");
                }

            }


        } catch (MyException w) {
            System.out.println(w.getMessage());
        }

    }

    @Override
    public void SendMessage(List<Profilie> profilies) {
//        System.out.println("Write your name ");
//        String name = new Scanner(System.in).nextLine();
//        System.out.println("Write your password");
//        String password = new Scanner(System.in).nextLine();
//        for (Profilie p : profilies) {
//            if (p.getUserName().equals(name) && p.getPassword().equals(password)) {
//                System.out.println(" your contacts ");
//                for (Profilie a : p.getList()) {
//                    System.out.println(a.getUserName());
//                }
//                System.out.println("Choose on of them");
//                String message = new Scanner(System.in).nextLine();
//                for (Profilie d : p.getList()) {
//                    if (d.getUserName().equals(message)) {
//                        System.out.println(d.getMessages());
//                    }
//                }
//                System.out.println("Enter message");
//                String bb = new Scanner(System.in).nextLine();
//                System.out.println("Do you want send (yes/no )?");
//                String aa = new Scanner(System.in).nextLine();
//                for (Profilie pro : p.getList()) {
//                    Map<String, String> map = new HashMap<>();
//                    if (pro.getUserName().equals(message)) {
//                        if (bb.contains("yes")) {
//                            map.put(p.getUserName(), bb);
//                            map.put(pro.getUserName(), bb);
//                            p.setMessages(map.toString());
//                            p.setMessages(map.toString());
//
//                        } else if (aa.contains("no")) {
//                            System.out.println("Your message was not sent !");
//                        }
//                        }
//                    }
//
//                }
//            }
//
    }

    @Override
    public void DelleteWhatsApp(List<Profilie> profilies) {

    }
}
