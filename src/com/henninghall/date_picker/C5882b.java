package com.henninghall.date_picker;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.henninghall.date_picker.b */
/* loaded from: classes6.dex */
public class C5882b implements ReactPackage {

    /* renamed from: a */
    public static ReactApplicationContext f11696a;

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        f11696a = reactApplicationContext;
        return Arrays.asList(new DatePickerModule(reactApplicationContext));
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        f11696a = reactApplicationContext;
        return Arrays.asList(new DatePickerManager());
    }
}
