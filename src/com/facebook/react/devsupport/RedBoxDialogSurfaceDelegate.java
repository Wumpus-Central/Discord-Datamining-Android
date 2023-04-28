package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.view.KeyEvent;
import com.facebook.react.C5072R;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public class RedBoxDialogSurfaceDelegate implements SurfaceDelegate {
    private final DevSupportManager mDevSupportManager;
    private Dialog mDialog;
    private final DoubleTapReloadRecognizer mDoubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
    private RedBoxContentView mRedBoxContentView;

    public RedBoxDialogSurfaceDelegate(DevSupportManager devSupportManager) {
        this.mDevSupportManager = devSupportManager;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void createContentView(String str) {
        RedBoxHandler redBoxHandler = this.mDevSupportManager.getRedBoxHandler();
        Activity currentActivity = this.mDevSupportManager.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            String lastErrorTitle = this.mDevSupportManager.getLastErrorTitle();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: ");
            if (lastErrorTitle == null) {
                lastErrorTitle = "N/A";
            }
            sb2.append(lastErrorTitle);
            C13925a.m2288j(ReactConstants.TAG, sb2.toString());
            return;
        }
        RedBoxContentView redBoxContentView = new RedBoxContentView(currentActivity);
        this.mRedBoxContentView = redBoxContentView;
        redBoxContentView.setDevSupportManager(this.mDevSupportManager).setRedBoxHandler(redBoxHandler).init();
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void destroyContentView() {
        this.mRedBoxContentView = null;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void hide() {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.dismiss();
            destroyContentView();
            this.mDialog = null;
        }
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public boolean isContentViewReady() {
        return this.mRedBoxContentView != null;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public boolean isShowing() {
        Dialog dialog = this.mDialog;
        return dialog != null && dialog.isShowing();
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void show() {
        String lastErrorTitle = this.mDevSupportManager.getLastErrorTitle();
        Activity currentActivity = this.mDevSupportManager.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: ");
            if (lastErrorTitle == null) {
                lastErrorTitle = "N/A";
            }
            sb2.append(lastErrorTitle);
            C13925a.m2288j(ReactConstants.TAG, sb2.toString());
            return;
        }
        RedBoxContentView redBoxContentView = this.mRedBoxContentView;
        if (redBoxContentView == null || redBoxContentView.getContext() != currentActivity) {
            createContentView("RedBox");
        }
        this.mRedBoxContentView.refreshContentView();
        if (this.mDialog == null) {
            Dialog dialog = new Dialog(currentActivity, C5072R.style.Theme_Catalyst_RedBox) { // from class: com.facebook.react.devsupport.RedBoxDialogSurfaceDelegate.1
                @Override // android.app.Dialog, android.view.KeyEvent.Callback
                public boolean onKeyUp(int i, KeyEvent keyEvent) {
                    if (i == 82) {
                        RedBoxDialogSurfaceDelegate.this.mDevSupportManager.showDevOptionsDialog();
                        return true;
                    }
                    if (RedBoxDialogSurfaceDelegate.this.mDoubleTapReloadRecognizer.didDoubleTapR(i, getCurrentFocus())) {
                        RedBoxDialogSurfaceDelegate.this.mDevSupportManager.handleReloadJS();
                    }
                    return super.onKeyUp(i, keyEvent);
                }
            };
            this.mDialog = dialog;
            dialog.requestWindowFeature(1);
            this.mDialog.setContentView(this.mRedBoxContentView);
        }
        this.mDialog.show();
    }
}
