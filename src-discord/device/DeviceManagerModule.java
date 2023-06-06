package com.discord.device;

import android.content.Context;
import android.os.Build;
import com.discord.codegen.NativeDeviceManagerSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import kg.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import lg.v;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001e\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u000e\b\u0001\u0012\n \n*\u0004\u0018\u00010\t0\t0\bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/device/DeviceManagerModule;", "Lcom/discord/codegen/NativeDeviceManagerSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getTypedExportedConstants", "", "", "kotlin.jvm.PlatformType", "Companion", "device_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceManagerModule extends NativeDeviceManagerSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNDeviceManager";
    private final ReactApplicationContext reactContext;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f*\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\u00020\u0006*\u00020\u00078Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/discord/device/DeviceManagerModule$Companion;", "", "()V", "NAME", "", "smallestScreenWidthDp", "", "Landroid/content/Context;", "getSmallestScreenWidthDp", "(Landroid/content/Context;)I", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "isTablet", "", "device_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int getSmallestScreenWidthDp(Context context) {
            return context.getResources().getConfiguration().smallestScreenWidthDp;
        }

        private final boolean isTablet(Context context, int i10) {
            return context.getResources().getConfiguration().smallestScreenWidthDp >= i10;
        }

        static /* synthetic */ boolean isTablet$default(Companion companion, Context context, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = 600;
            }
            return companion.isTablet(context, i10);
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            q.g(reactContext, "reactContext");
            return new DeviceManagerModule(reactContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.discord.codegen.NativeDeviceManagerSpec
    protected Map<String, ? extends Object> getTypedExportedConstants() {
        Map<String, ? extends Object> l10;
        l10 = v.l(x.a("systemVersion", String.valueOf(Build.VERSION.SDK_INT)), x.a("device", Build.DEVICE), x.a("deviceModel", Build.MODEL), x.a("deviceBrand", Build.BRAND), x.a("deviceProduct", Build.PRODUCT), x.a("deviceManufacturer", Build.MANUFACTURER), x.a("isTablet", Boolean.valueOf(Companion.isTablet$default(Companion, this.reactContext, 0, 1, null))), x.a("smallestScreenWidth", Integer.valueOf(this.reactContext.getResources().getConfiguration().smallestScreenWidthDp)));
        return l10;
    }
}
