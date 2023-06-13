package com.discord.device;

import android.os.Build;
import android.os.LocaleList;
import bh.j;
import com.discord.codegen.NativeDeviceLocaleManagerSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kg.x;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import lg.v;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0014¨\u0006\u000b"}, d2 = {"Lcom/discord/device/DeviceLocaleManagerModule;", "Lcom/discord/codegen/NativeDeviceLocaleManagerSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getTypedExportedConstants", "", "", "Companion", "device_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DeviceLocaleManagerModule extends NativeDeviceLocaleManagerSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNDeviceLocaleManager";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/device/DeviceLocaleManagerModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "device_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            q.g(reactContext, "reactContext");
            return new DeviceLocaleManagerModule(reactContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLocaleManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.discord.codegen.NativeDeviceLocaleManagerSpec
    protected Map<String, Object> getTypedExportedConstants() {
        Object U;
        Map<String, Object> l10;
        LocaleList adjustedDefault;
        int size;
        Locale locale;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            adjustedDefault = LocaleList.getAdjustedDefault();
            q.f(adjustedDefault, "getAdjustedDefault()");
            size = adjustedDefault.size();
            int i10 = 10;
            for (int i11 = 0; i11 < size; i11++) {
                locale = adjustedDefault.get(i11);
                String lang = locale.toLanguageTag();
                if (i11 == 0) {
                    q.f(lang, "lang");
                    arrayList.add(lang);
                } else {
                    arrayList.add(lang + ";q=0." + i10);
                }
                i10 = j.c(1, i10 - 1);
            }
        } else {
            String languageTag = Locale.getDefault().toLanguageTag();
            q.f(languageTag, "getDefault().toLanguageTag()");
            arrayList.add(languageTag);
        }
        r.e0(arrayList, ",", null, null, 0, null, null, 62, null);
        U = r.U(arrayList);
        l10 = v.l(x.a("Language", U), x.a("Languages", arrayList));
        return l10;
    }
}
