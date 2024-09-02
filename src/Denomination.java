enum DenominationForm {
    BILL,
    COIN;
}

public record Denomination (String name, double amt, DenominationForm form, String img) {

}
