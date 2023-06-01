package com.example.NgQuocTuong.validator;

import com.example.NgQuocTuong.entity.User;
import com.example.NgQuocTuong.validator.annotation.ValidUserId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {

    @Override
    public boolean isValid(User user, ConstraintValidatorContext context){
        if(user ==null)
            return true;
        return user.getId() !=null;}
}
