package com.company.validation.api.rule;

import java.util.regex.Pattern;

/**
 * Validates that a string matches the 24-hour time format (HH:MM).
 */
public class TimeFormatRule implements ValidationRule {
    private static final Pattern TIME_PATTERN = Pattern.compile("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");

    @Override
    public boolean isValid(String value) {
        return TIME_PATTERN.matcher(value).matches();
    }

    @Override
    public String getErrorMessage() {
        return "Value must be in 24-hour time format (HH:MM)";
    }
} 