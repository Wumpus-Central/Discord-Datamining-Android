package com.facebook.react.viewmanagers;

import android.view.View;

/* loaded from: classes7.dex */
public interface RNSScreenStackHeaderConfigManagerInterface<T extends View> {
    void setBackButtonInCustomView(T t, boolean z);

    void setBackTitle(T t, String str);

    void setBackTitleFontFamily(T t, String str);

    void setBackTitleFontSize(T t, int i);

    void setBackgroundColor(T t, Integer num);

    void setColor(T t, Integer num);

    void setDirection(T t, String str);

    void setDisableBackButtonMenu(T t, boolean z);

    void setHidden(T t, boolean z);

    void setHideBackButton(T t, boolean z);

    void setHideShadow(T t, boolean z);

    void setLargeTitle(T t, boolean z);

    void setLargeTitleBackgroundColor(T t, Integer num);

    void setLargeTitleColor(T t, Integer num);

    void setLargeTitleFontFamily(T t, String str);

    void setLargeTitleFontSize(T t, int i);

    void setLargeTitleFontWeight(T t, String str);

    void setLargeTitleHideShadow(T t, boolean z);

    void setTitle(T t, String str);

    void setTitleColor(T t, Integer num);

    void setTitleFontFamily(T t, String str);

    void setTitleFontSize(T t, int i);

    void setTitleFontWeight(T t, String str);

    void setTopInsetEnabled(T t, boolean z);

    void setTranslucent(T t, boolean z);
}
