package com.facebook.react.devsupport;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.react.C5072R;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public class DevLoadingViewController {
    private static boolean sEnabled = true;
    private PopupWindow mDevLoadingPopup;
    private TextView mDevLoadingView;
    private final ReactInstanceDevHelper mReactInstanceManagerHelper;

    public DevLoadingViewController(ReactInstanceDevHelper reactInstanceDevHelper) {
        this.mReactInstanceManagerHelper = reactInstanceDevHelper;
    }

    private Context getContext() {
        return this.mReactInstanceManagerHelper.getCurrentActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideInternal() {
        PopupWindow popupWindow = this.mDevLoadingPopup;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.mDevLoadingPopup.dismiss();
            this.mDevLoadingPopup = null;
            this.mDevLoadingView = null;
        }
    }

    public static void setDevLoadingEnabled(boolean z) {
        sEnabled = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showInternal(String str) {
        PopupWindow popupWindow = this.mDevLoadingPopup;
        if (popupWindow == null || !popupWindow.isShowing()) {
            Activity currentActivity = this.mReactInstanceManagerHelper.getCurrentActivity();
            if (currentActivity == null) {
                C13925a.m2288j(ReactConstants.TAG, "Unable to display loading message because react activity isn't available");
                return;
            }
            Rect rect = new Rect();
            currentActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int i = rect.top;
            TextView textView = (TextView) ((LayoutInflater) currentActivity.getSystemService("layout_inflater")).inflate(C5072R.layout.dev_loading_view, (ViewGroup) null);
            this.mDevLoadingView = textView;
            textView.setText(str);
            PopupWindow popupWindow2 = new PopupWindow(this.mDevLoadingView, -1, -2);
            this.mDevLoadingPopup = popupWindow2;
            popupWindow2.setTouchable(false);
            this.mDevLoadingPopup.showAtLocation(currentActivity.getWindow().getDecorView(), 0, 0, i);
        }
    }

    public void hide() {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevLoadingViewController.3
                @Override // java.lang.Runnable
                public void run() {
                    DevLoadingViewController.this.hideInternal();
                }
            });
        }
    }

    public void showForRemoteJSEnabled() {
        Context context = getContext();
        if (context != null) {
            showMessage(context.getString(C5072R.string.catalyst_debug_connecting));
        }
    }

    public void showForUrl(String str) {
        int i;
        Context context = getContext();
        if (context != null) {
            try {
                URL url = new URL(str);
                if (url.getPort() != -1) {
                    i = url.getPort();
                } else {
                    i = url.getDefaultPort();
                }
                int i2 = C5072R.string.catalyst_loading_from_url;
                showMessage(context.getString(i2, url.getHost() + ":" + i));
            } catch (MalformedURLException e) {
                C13925a.m2288j(ReactConstants.TAG, "Bundle url format is invalid. \n\n" + e.toString());
            }
        }
    }

    public void showMessage(final String str) {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevLoadingViewController.1
                @Override // java.lang.Runnable
                public void run() {
                    DevLoadingViewController.this.showInternal(str);
                }
            });
        }
    }

    public void updateProgress(final String str, final Integer num, final Integer num2) {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevLoadingViewController.2
                @Override // java.lang.Runnable
                public void run() {
                    Integer num3;
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = str;
                    if (str2 == null) {
                        str2 = "Loading";
                    }
                    sb2.append(str2);
                    if (!(num == null || (num3 = num2) == null || num3.intValue() <= 0)) {
                        sb2.append(String.format(Locale.getDefault(), " %.1f%%", Float.valueOf((num.intValue() / num2.intValue()) * 100.0f)));
                    }
                    sb2.append("…");
                    if (DevLoadingViewController.this.mDevLoadingView != null) {
                        DevLoadingViewController.this.mDevLoadingView.setText(sb2);
                    }
                }
            });
        }
    }
}
