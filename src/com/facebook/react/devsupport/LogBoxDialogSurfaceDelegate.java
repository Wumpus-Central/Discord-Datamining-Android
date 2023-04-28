package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.util.RNLog;
import p059d6.C6399a;

/* loaded from: classes7.dex */
public class LogBoxDialogSurfaceDelegate implements SurfaceDelegate {
    private final DevSupportManager mDevSupportManager;
    private LogBoxDialog mDialog;
    private View mReactRootView;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LogBoxDialogSurfaceDelegate(DevSupportManager devSupportManager) {
        this.mDevSupportManager = devSupportManager;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void createContentView(String str) {
        C6399a.m25623b(str.equals(LogBoxModule.NAME), "This surface manager can only create LogBox React application");
        View createRootView = this.mDevSupportManager.createRootView(LogBoxModule.NAME);
        this.mReactRootView = createRootView;
        if (createRootView == null) {
            RNLog.m30815e("Unable to launch logbox because react was unable to create the root view");
        }
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void destroyContentView() {
        View view = this.mReactRootView;
        if (view != null) {
            this.mDevSupportManager.destroyRootView(view);
            this.mReactRootView = null;
        }
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void hide() {
        if (isShowing()) {
            View view = this.mReactRootView;
            if (!(view == null || view.getParent() == null)) {
                ((ViewGroup) this.mReactRootView.getParent()).removeView(this.mReactRootView);
            }
            this.mDialog.dismiss();
            this.mDialog = null;
        }
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public boolean isContentViewReady() {
        return this.mReactRootView != null;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public boolean isShowing() {
        LogBoxDialog logBoxDialog = this.mDialog;
        return logBoxDialog != null && logBoxDialog.isShowing();
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void show() {
        if (!isShowing() && isContentViewReady()) {
            Activity currentActivity = this.mDevSupportManager.getCurrentActivity();
            if (currentActivity == null || currentActivity.isFinishing()) {
                RNLog.m30815e("Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
                return;
            }
            LogBoxDialog logBoxDialog = new LogBoxDialog(currentActivity, this.mReactRootView);
            this.mDialog = logBoxDialog;
            logBoxDialog.setCancelable(false);
            this.mDialog.show();
        }
    }
}
