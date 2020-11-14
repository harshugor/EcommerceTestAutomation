package AskuitySolution.AskuitySolution.Common;

import  com.codeborne.selenide.Selenide;

public class BasePagePO {

    public BasePagePO() {
        Selenide.page(this);
    }
}
