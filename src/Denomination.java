enum DenominationForm {
    BILL,
    COIN;
}

public record Denomination(String name, double amt, DenominationForm form, String img) {

   // Denomination = ("One Hundred Note", 100, "bill", "img.png"  );



}
