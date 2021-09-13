package org.example.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = InnValidationImpl.class)
public @interface InnValidation {

    String message() default "{org.example.validation.InnValidation.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
