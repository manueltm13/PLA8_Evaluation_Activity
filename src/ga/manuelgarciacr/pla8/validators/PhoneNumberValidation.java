package ga.manuelgarciacr.pla8.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = PhoneNumberValidationRules.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneNumberValidation {
	String message() default "Teléfono no válido. Mínimo 9 dígitos y guiones.";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
