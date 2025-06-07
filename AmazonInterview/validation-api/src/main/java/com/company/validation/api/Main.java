package com.company.validation.api;

import com.company.validation.api.model.AttributeInput;
import com.company.validation.api.model.ValidationError;
import com.company.validation.api.rule.NumberRangeRule;
import com.company.validation.api.rule.PositiveIntegerRule;
import com.company.validation.api.rule.TimeFormatRule;

import java.util.List;

/**
 * Example usage of the validation system.
 */
public class Main {
    public static void main(String[] args) {
        // 1. Create validator and configure rules
        AttributeValidator validator = new AttributeValidator();
       
        // 2. Add rules for attributes
        validator.addValidationRule("foo", new NumberRangeRule(0, 1000));
        validator.addValidationRule("sort_start_time", new TimeFormatRule());
        validator.addValidationRule("dock_doors", new PositiveIntegerRule());

        // 3. Test inputs
        List<AttributeInput> inputs = List.of(
            new AttributeInput("dock_doors", "5"),
            new AttributeInput("foo", "7"),
            new AttributeInput("sort_start_time", "12:00"),
            new AttributeInput("sort_start_time", "12:X00"),
            new AttributeInput("foo", "-7")
        );

        // 4. Validate them
        List<ValidationError> errors = validator.validate(inputs);
       
        // 5. Print errors to the user
        errors.forEach(System.out::println);
    }
} 