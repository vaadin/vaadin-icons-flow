package com.vaadin.flow.component.icon;

public enum LumoIcon {
    ANGLE_DOWN,
    ANGLE_LEFT,
    ANGLE_RIGHT,
    ANGLE_UP,
    ARROW_DOWN,
    ARROW_LEFT,
    ARROW_RIGHT,
    ARROW_UP,
    BAR_CHART,
    BELL,
    CALENDAR,
    CHECK_MARK,
    CHEVRON_DOWN,
    CHEVRON_LEFT,
    CHEVRON_RIGHT,
    CHEVRON_UP,
    CLOCK,
    COG,
    CROSS,
    DOWNLOAD,
    DROPDOWN,
    EDIT,
    ERROR,
    EYE_DISABLED,
    EYE,
    MENU,
    MINUS,
    ORDERED_LIST,
    PHONE,
    PHOTo,
    PLAY,
    PLUS,
    REDO,
    RELOAD,
    SEARCH,
    UNDO,
    UNORDERED_LIST,
    UPLOAD,
    USER;

    @Override
    public String toString() {
        StringBuilder thisName = new StringBuilder(this.name().replace("_", "-"));
        for (int i = 0; i < thisName.length(); i++) {
            if (thisName.charAt(i) >= 'A' && thisName.charAt(i) <= 'Z') {
                thisName.setCharAt(i, (char)(thisName.charAt(i) + 32));
            }
        }
        return thisName.toString();
    }

    /**
     * Creates a new {@link IronIcon} instance with the icon determined by the name
     * of this instance.
     *
     * @return a new instance of {@link IronIcon} component
     */
    public IronIcon create() {
        return new IronIcon("lumo", this.toString());
    }}
