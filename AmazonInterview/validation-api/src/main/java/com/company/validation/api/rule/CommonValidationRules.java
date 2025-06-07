package com.company.validation.api.rule;

import java.util.regex.Pattern;

/**
 * A collection of commonly used validation rules.
 */
public class CommonValidationRules {
    
    /**
     * Validates that a string is not null or empty.
     */
    public static class NotEmptyRule implements ValidationRule {
        @Override
        public boolean isValid(String value) {
            return value != null && !value.trim().isEmpty();
        }

        @Override
        public String getErrorMessage() {
            return "Value cannot be empty";
        }
    }

    /**
     * Validates that a string matches a regular expression pattern.
     */
    public static class PatternRule implements ValidationRule {
        private final Pattern pattern;
        private final String errorMessage;

        public PatternRule(String regex, String errorMessage) {
            this.pattern = Pattern.compile(regex);
            this.errorMessage = errorMessage;
        }

        @Override
        public boolean isValid(String value) {
            return value != null && pattern.matcher(value).matches();
        }

        @Override
        public String getErrorMessage() {
            return errorMessage;
        }
    }

    /**
     * Validates that a string has a minimum length.
     */
    public static class MinLengthRule implements ValidationRule {
        private final int minLength;

        public MinLengthRule(int minLength) {
            this.minLength = minLength;
        }

        @Override
        public boolean isValid(String value) {
            return value != null && value.length() >= minLength;
        }

        @Override
        public String getErrorMessage() {
            return "Value must be at least " + minLength + " characters long";
        }
    }

    /**
     * Validates that a string has a maximum length.
     */
    public static class MaxLengthRule implements ValidationRule {
        private final int maxLength;

        public MaxLengthRule(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public boolean isValid(String value) {
            return value == null || value.length() <= maxLength;
        }

        @Override
        public String getErrorMessage() {
            return "Value must not exceed " + maxLength + " characters";
        }
    }

    /**
     * Validates that a string contains only alphanumeric characters.
     */
    public static class AlphanumericRule implements ValidationRule {
        private static final Pattern ALPHANUMERIC_PATTERN = Pattern.compile("^[a-zA-Z0-9]+$");

        @Override
        public boolean isValid(String value) {
            return value != null && ALPHANUMERIC_PATTERN.matcher(value).matches();
        }

        @Override
        public String getErrorMessage() {
            return "Value must contain only letters and numbers";
        }
    }

    /**
     * Validates that a string is a valid email address.
     */
    public static class EmailRule implements ValidationRule {
        private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@(.+)$"
        );

        @Override
        public boolean isValid(String value) {
            return value != null && EMAIL_PATTERN.matcher(value).matches();
        }

        @Override
        public String getErrorMessage() {
            return "Value must be a valid email address";
        }
    }
} 