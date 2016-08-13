package org.xdty.callerinfo.contract;

import org.xdty.callerinfo.model.db.Caller;
import org.xdty.callerinfo.model.db.InCall;

public interface MainBottomContact {
    interface View extends BaseView<MainContract.Presenter> {

        void init(InCall inCall, Caller caller);

        void updateMark(android.view.View view, Caller caller);
    }

    interface Presenter extends BasePresenter {
        void bindData(InCall inCall);

        boolean canMark();

        void markClicked(android.view.View view);
    }
}
