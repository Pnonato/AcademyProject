public enum MenuOptions {
    ADD_USER(1, "Adicionar usuário"),
    ADD_TRAINING(2, "Adicionar Treino"),
    ADD_DIET(3, "Adicionar Dieta"),
    ADD_PHYSICAL_CHARACTERISTICS(4, "Adicionar Características Físicas"),
    SHOW_USERS(5, "Mostrar Usuários"),
    SHOW_TRAININGS(6, "Mostrar Treinos"),
    SHOW_DIETS(7, "Mostrar Dietas"),
    SHOW_PHYSICAL_CHARACTERISTICS(8, "Mostrar Características Físicas"),
    EXIT(9, "Sair do programa");

    private final int value;
    private final String description;

    MenuOptions(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public static MenuOptions valueOf(int value) {
        for (MenuOptions menuOption : MenuOptions.values()) {
            if (menuOption.getValue() == value) {
                return menuOption;
            }
        }
        return null;
    }
}
