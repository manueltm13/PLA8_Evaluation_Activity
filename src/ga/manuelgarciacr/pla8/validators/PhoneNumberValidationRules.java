package ga.manuelgarciacr.pla8.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidationRules implements ConstraintValidator<PhoneNumberValidation, String> {
	@Override
	public void initialize(PhoneNumberValidation telefono) {
	}

	@Override
	public boolean isValid(String telefono, ConstraintValidatorContext cxt) {
		final Pattern PAT = Pattern.compile(
			"[0-9-]{9,}");
		Matcher mat = PAT.matcher(telefono);
		if (mat.matches())
			return true;
		return false;
	}

}