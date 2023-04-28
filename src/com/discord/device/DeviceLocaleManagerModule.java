package com.discord.device;

import android.os.Build;
import android.os.LocaleList;
import com.discord.codegen.NativeDeviceLocaleManagerSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import eg.C6884j;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11098x;
import p267of.C11289v;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0014¨\u0006\u000b"}, m15073d2 = {"Lcom/discord/device/DeviceLocaleManagerModule;", "Lcom/discord/codegen/NativeDeviceLocaleManagerSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getTypedExportedConstants", "", "", "Companion", "device_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class DeviceLocaleManagerModule extends NativeDeviceLocaleManagerSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNDeviceLocaleManager";

    @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m15073d2 = {"Lcom/discord/device/DeviceLocaleManagerModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "device_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            C9971q.m14633g(reactContext, "reactContext");
            return new DeviceLocaleManagerModule(reactContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLocaleManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9971q.m14633g(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.discord.codegen.NativeDeviceLocaleManagerSpec
    protected Map<String, Object> getTypedExportedConstants() {
        Object U;
        Map<String, Object> l;
        LocaleList adjustedDefault;
        int size;
        Locale locale;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            adjustedDefault = LocaleList.getAdjustedDefault();
            C9971q.m14634f(adjustedDefault, "getAdjustedDefault()");
            size = adjustedDefault.size();
            int i = 10;
            for (int i2 = 0; i2 < size; i2++) {
                locale = adjustedDefault.get(i2);
                String lang = locale.toLanguageTag();
                if (i2 == 0) {
                    C9971q.m14634f(lang, "lang");
                    arrayList.add(lang);
                } else {
                    arrayList.add(lang + ";q=0." + i);
                }
                i = C6884j.m23961c(1, i - 1);
            }
        } else {
            String languageTag = Locale.getDefault().toLanguageTag();
            C9971q.m14634f(languageTag, "getDefault().toLanguageTag()");
            arrayList.add(languageTag);
        }
        C9914r.m14760e0(arrayList, ",", null, null, 0, null, null, 62, null);
        U = C9914r.m14770U(arrayList);
        l = C11289v.m10247l(C11098x.m10921a("Language", U), C11098x.m10921a("Languages", arrayList));
        return l;
    }
}
