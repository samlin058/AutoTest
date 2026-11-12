package Service.Pojo;

import Service.Util.variable.ChinneNameGenerate;
import Service.Util.variable.PhoneNumberGenerate;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class EmergencyContacts {

    private String relationship;  // 关系
    private String name;          // 姓名
    private String phoneNumber;   // 手机号

    public static List<EmergencyContacts> getEmergencyContactsList() {
        List<EmergencyContacts> emergencyContacts = new ArrayList<>();
        EmergencyContacts emergencyContact = new EmergencyContacts();
        emergencyContact.setName(ChinneNameGenerate.generateName());
        emergencyContact.setRelationship("亲戚");
        emergencyContact.setPhoneNumber(PhoneNumberGenerate.generatePhoneNumber());
        emergencyContacts.add(emergencyContact);
        return emergencyContacts;
    }


}

