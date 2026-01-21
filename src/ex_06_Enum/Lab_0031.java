package ex_06_Enum;

public enum Lab_0031 {
}

enum HEX_CODES{
    RED("#NMLOI"),
    YELLOW("#ABC");


    private String hexCode;
    HEX_CODES(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return this.hexCode;
    }
}
