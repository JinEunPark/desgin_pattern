package lastTest.statuspro;

public class State500 extends State {
    State500(MainWindow window) {
        super(window);
    }

    @Override
    public void addHundred() {
        addBalance(100);
        setStateLess1000();
        showBalanceAndEmptyMsg();
    }

    @Override
    public void addFiveHundred() {
        addBalance(500);
        setStateEqualOrMore1000();
        showBalanceAndEmptyMsg();
    }

    @Override
    public void addThousand() {
        addBalance(1000);
        setStateEqualOrMore1000();
        showBalanceAndEmptyMsg();
    }

    @Override
    public void selectBeverage() {
        setMsgText("1000원 이상을 넣은 후에 눌러주세요");
    }
}
