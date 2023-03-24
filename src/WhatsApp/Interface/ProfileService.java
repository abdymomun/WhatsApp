package WhatsApp.Interface;

import WhatsApp.Classes.Profilie;

import java.util.List;

public interface ProfileService {
    Profilie InstallWhatsapp(List<Profilie>profilies);
void  GoToProfile(List<Profilie>profilies);
void GetAllWhatsAppStatus(List<Profilie>profilies);
void ChangeProfilePhoto(List<Profilie>profilies);
void ChangeWhatsAppStatus(List<Profilie>profilies);
void AddContact(List<Profilie>profilies);
void SendMessage(List<Profilie>profilies);
void DelleteWhatsApp(List<Profilie>profilies);


    }

