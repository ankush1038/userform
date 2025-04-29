package com.cg.userform.service;
import com.cg.userform.model.UserForm;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope  // This is important!
public class FormDataService {

    private UserForm userForm = new UserForm();

    public UserForm getUserForm() {
        return userForm;
    }

    public void updateUserForm(UserForm newData) {
        if (newData.getFirstName() != null) userForm.setFirstName(newData.getFirstName());
        if (newData.getLastName() != null) userForm.setLastName(newData.getLastName());
        if (newData.getEmail() != null) userForm.setEmail(newData.getEmail());
        if (newData.getPhone() != null) userForm.setPhone(newData.getPhone());
        if (newData.getCity() != null) userForm.setCity(newData.getCity());
        if (newData.getCountry() != null) userForm.setCountry(newData.getCountry());
    }
}