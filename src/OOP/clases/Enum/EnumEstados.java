package OOP.clases.Enum;

public enum EnumEstados {
    ONLINE("ONLINE"),
    OFFLINE("OFFLINE"),
    DRAFT("DRAFT"),
    DELETED("DELETED"),
    NEAR_END("NEAR_END"),
    FINISHED("FINISHED"),
    WITHOUT_CREDIT("WITHOUT_CREDIT"),
    ON_HOLD("ON_HOLD");

    private String value;

    EnumEstados(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EnumEstados fromValue(String text) {
        for (EnumEstados b : EnumEstados.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
