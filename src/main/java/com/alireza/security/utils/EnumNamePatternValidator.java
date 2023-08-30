package com.alireza.security.utils;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


@Component
public class EnumNamePatternValidator implements ConstraintValidator<RoleValidation, Enum<?>> {

    private Pattern pattern;

    @Override
    public void initialize(RoleValidation annotation) {
        try {
            pattern = Pattern.compile(annotation.regexp());
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Given regex is invalid", e);
        }
    }

    @Override
    public boolean isValid(Enum<?> value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }

        Matcher m = pattern.matcher(value.name());
        return m.matches();
    }
}
