package com.company.validation.api;

import com.company.validation.api.model.AttributeInput;
import com.company.validation.api.model.ValidationError;
import com.company.validation.api.rule.ValidationRule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Main validator class that manages validation rules and performs validation.
 */
public class AttributeValidator {
    private final Map<String, List<ValidationRule>> validationRules = new HashMap<>();

    /**
     * Adds a validation rule for a specific attribute.
     *
     * @param attributeName the name of the attribute to validate
     * @param rule the validation rule to apply
     */
    public void addValidationRule(String attributeName, ValidationRule rule) {
        validationRules.computeIfAbsent(attributeName, k -> new ArrayList<>()).add(rule);
    }

    /**
     * Validates a list of attribute inputs against their configured rules.
     *
     * @param inputs the list of attribute inputs to validate
     * @return a list of validation errors, empty if all validations pass
     */
    public List<ValidationError> validate(List<AttributeInput> inputs) {
        List<ValidationError> errors = new ArrayList<>();

        for (AttributeInput input : inputs) {
            List<ValidationRule> rules = validationRules.get(input.getAttributeName());
            if (rules != null) {
                for (ValidationRule rule : rules) {
                    if (!rule.isValid(input.getAttributeValue())) {
                        errors.add(new ValidationError(
                            input.getAttributeName(),
                            input.getAttributeValue(),
                            rule.getErrorMessage()
                        ));
                    }
                }
            }
        }

        return errors;
    }
} 