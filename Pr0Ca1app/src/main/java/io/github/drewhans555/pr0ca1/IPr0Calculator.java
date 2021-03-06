package io.github.drewhans555.pr0ca1;

public interface IPr0Calculator {
    IPr0Number getCurrentNumber();
    IPr0Number getPreviousNumber();
    void press0Button();
    void press1Button();
    void press2Button();
    void press3Button();
    void press4Button();
    void press5Button();
    void press6Button();
    void press7Button();
    void press8Button();
    void press9Button();
    void pressAButton();
    void pressBButton();
    void pressCButton();
    void pressDButton();
    void pressEButton();
    void pressFButton();
    void pressNotButton() throws NumberOutOfModeBoundsException, IllegalArgumentException;
    void pressAndButton() throws Exception;
    void pressOrButton() throws Exception;
    void pressXorButton() throws Exception;
    void pressNandButton() throws Exception;
    void pressNorButton() throws Exception;
    void pressXnorButton() throws Exception;
    void pressAddButton() throws Exception;
    void pressSubtractButton() throws Exception;
    void pressMultiplyButton() throws Exception;
    void pressDivideButton() throws Exception;
    void pressModButton() throws Exception;
    void pressEqualButton() throws Exception;
    void pressAcButton();
    void pressDeleteButton() throws Exception;
    void reset();
    void setInputMode(Pr0Mode newInputMode);
    void updateState(int newBitState, boolean newSignState);
}
