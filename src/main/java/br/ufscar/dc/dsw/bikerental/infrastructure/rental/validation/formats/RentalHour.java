package br.ufscar.dc.dsw.bikerental.infrastructure.rental.validation.formats;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.format.DateTimeFormatter;

@Constraint(validatedBy = RentalHourValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RentalHour {
  String message() default "Input a valid date.";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

  String timeColonPattern = "HH:00";
  static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(timeColonPattern);

}
