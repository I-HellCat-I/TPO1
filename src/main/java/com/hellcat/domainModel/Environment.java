package com.hellcat.domainModel;

public enum Environment {
    OCEAN (true), // Естественная
    AIR (false);  // Неестественная

    private final boolean isNaturalForWhale;
    Environment(boolean isNaturalForWhale) { this.isNaturalForWhale = isNaturalForWhale; }
    public boolean isNaturalForWhale() { return isNaturalForWhale; }
}