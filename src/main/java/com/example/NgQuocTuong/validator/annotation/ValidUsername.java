package com.example.NgQuocTuong.validator.annotation;

import com.example.NgQuocTuong.validator.ValidUsernameValidator;
import jakarta.validation.Constraint;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE,FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidUsernameValidator.class)
public @interface ValidUsername {
}