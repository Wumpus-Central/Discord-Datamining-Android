package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.SliderManagerInterface;

/* loaded from: classes7.dex */
public class SliderManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & SliderManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public SliderManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        String str2;
        double d;
        str.hashCode();
        boolean z = true;
        boolean z2 = false;
        char c = 65535;
        switch (str.hashCode()) {
            case -1900655011:
                if (str.equals("maximumTrackTintColor")) {
                    c = 0;
                    break;
                }
                break;
            case -1736983259:
                if (str.equals("thumbImage")) {
                    c = 1;
                    break;
                }
                break;
            case -1609594047:
                if (str.equals(ViewProps.ENABLED)) {
                    c = 2;
                    break;
                }
                break;
            case -1021497397:
                if (str.equals("minimumTrackTintColor")) {
                    c = 3;
                    break;
                }
                break;
            case -981448432:
                if (str.equals("maximumTrackImage")) {
                    c = 4;
                    break;
                }
                break;
            case -877170387:
                if (str.equals(ViewProps.TEST_ID)) {
                    c = 5;
                    break;
                }
                break;
            case 3540684:
                if (str.equals("step")) {
                    c = 6;
                    break;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    c = 7;
                    break;
                }
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    c = '\b';
                    break;
                }
                break;
            case 718061361:
                if (str.equals("maximumValue")) {
                    c = '\t';
                    break;
                }
                break;
            case 1139400400:
                if (str.equals("trackImage")) {
                    c = '\n';
                    break;
                }
                break;
            case 1192487427:
                if (str.equals("minimumValue")) {
                    c = 11;
                    break;
                }
                break;
            case 1333596542:
                if (str.equals("minimumTrackImage")) {
                    c = '\f';
                    break;
                }
                break;
            case 1912319986:
                if (str.equals("thumbTintColor")) {
                    c = '\r';
                    break;
                }
                break;
        }
        double d2 = 0.0d;
        switch (c) {
            case 0:
                ((SliderManagerInterface) this.mViewManager).setMaximumTrackTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 1:
                ((SliderManagerInterface) this.mViewManager).setThumbImage(t, (ReadableMap) obj);
                return;
            case 2:
                SliderManagerInterface sliderManagerInterface = (SliderManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                sliderManagerInterface.setEnabled(t, z);
                return;
            case 3:
                ((SliderManagerInterface) this.mViewManager).setMinimumTrackTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 4:
                ((SliderManagerInterface) this.mViewManager).setMaximumTrackImage(t, (ReadableMap) obj);
                return;
            case 5:
                SliderManagerInterface sliderManagerInterface2 = (SliderManagerInterface) this.mViewManager;
                if (obj == null) {
                    str2 = "";
                } else {
                    str2 = (String) obj;
                }
                sliderManagerInterface2.setTestID(t, str2);
                return;
            case 6:
                SliderManagerInterface sliderManagerInterface3 = (SliderManagerInterface) this.mViewManager;
                if (obj != null) {
                    d2 = ((Double) obj).doubleValue();
                }
                sliderManagerInterface3.setStep(t, d2);
                return;
            case 7:
                SliderManagerInterface sliderManagerInterface4 = (SliderManagerInterface) this.mViewManager;
                if (obj != null) {
                    d2 = ((Double) obj).doubleValue();
                }
                sliderManagerInterface4.setValue(t, d2);
                return;
            case '\b':
                SliderManagerInterface sliderManagerInterface5 = (SliderManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                sliderManagerInterface5.setDisabled(t, z2);
                return;
            case '\t':
                SliderManagerInterface sliderManagerInterface6 = (SliderManagerInterface) this.mViewManager;
                if (obj == null) {
                    d = 1.0d;
                } else {
                    d = ((Double) obj).doubleValue();
                }
                sliderManagerInterface6.setMaximumValue(t, d);
                return;
            case '\n':
                ((SliderManagerInterface) this.mViewManager).setTrackImage(t, (ReadableMap) obj);
                return;
            case 11:
                SliderManagerInterface sliderManagerInterface7 = (SliderManagerInterface) this.mViewManager;
                if (obj != null) {
                    d2 = ((Double) obj).doubleValue();
                }
                sliderManagerInterface7.setMinimumValue(t, d2);
                return;
            case '\f':
                ((SliderManagerInterface) this.mViewManager).setMinimumTrackImage(t, (ReadableMap) obj);
                return;
            case '\r':
                ((SliderManagerInterface) this.mViewManager).setThumbTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
