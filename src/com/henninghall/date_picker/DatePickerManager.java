package com.henninghall.date_picker;

import android.widget.LinearLayout;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes6.dex */
public class DatePickerManager extends SimpleViewManager<C5893h> {
    private static final String REACT_CLASS = "DatePickerManager";
    private static final int SCROLL = 1;

    private ReactPropGroup getMethodAnnotation(String str) {
        Method[] methods;
        Method method = null;
        for (Method method2 : getClass().getMethods()) {
            if (method2.getName().equals(str)) {
                method = method2;
            }
        }
        return (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
    }

    private void updateProp(String str, C5893h hVar, int i, Dynamic dynamic) {
        hVar.m26958d(getMethodAnnotation(str).names()[i], dynamic);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.m30831of(ViewProps.SCROLL, 1);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        return MapBuilder.builder().put("dateChange", MapBuilder.m30831of("phasedRegistrationNames", MapBuilder.m30831of("bubbled", "onChange"))).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactPropGroup(names = {"date", "mode", "locale", "maximumDate", "minimumDate", "fadeToColor", "textColor", "utc", "minuteInterval", "androidVariant", "dividerHeight", "is24hourSource"})
    public void setProps(C5893h hVar, int i, Dynamic dynamic) {
        updateProp("setProps", hVar, i, dynamic);
    }

    @ReactPropGroup(customType = "Style", names = {"height"})
    public void setStyle(C5893h hVar, int i, Dynamic dynamic) {
        updateProp("setStyle", hVar, i, dynamic);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C5893h createViewInstance(ThemedReactContext themedReactContext) {
        return new C5893h(new LinearLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C5893h hVar) {
        super.onAfterUpdateTransaction((DatePickerManager) hVar);
        try {
            hVar.m26959c();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void receiveCommand(C5893h hVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            hVar.m26960b(readableArray.getInt(0), readableArray.getInt(1));
        }
    }
}
