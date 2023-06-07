package com.discord.theme;

import android.app.Activity;
import com.discord.codegen.NativeThemeManagerSpec;
import com.discord.theme.utils.ActivityThemeUtils;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/discord/theme/ThemeModule;", "Lcom/discord/codegen/NativeThemeManagerSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "updateTheme", "", "theme", "Companion", "theme_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ThemeModule extends NativeThemeManagerSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNThemeManager";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/theme/ThemeModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "theme_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            q.g(reactContext, "reactContext");
            return new ThemeModule(reactContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        ThemeManager.INSTANCE.init(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTheme$lambda$0(ThemeModule this$0) {
        q.g(this$0, "this$0");
        Activity currentActivity = this$0.getCurrentActivity();
        if (currentActivity != null) {
            ActivityThemeUtils.INSTANCE.updateActivityTheming$theme_release(currentActivity);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r4.equals("dark") != false) goto L_0x0034;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r4.equals("amoled") != false) goto L_0x0034;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        com.discord.theme.ThemeManager.INSTANCE.setDarkTheme();
     */
    @Override // com.discord.codegen.NativeThemeManagerSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateTheme(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0048
            int r0 = r4.hashCode()
            r1 = -1413862040(0xffffffffabba2d68, float:-1.3228698E-12)
            if (r0 == r1) goto L_0x002c
            r1 = 3075958(0x2eef76, float:4.310335E-39)
            if (r0 == r1) goto L_0x0023
            r1 = 102970646(0x6233516, float:3.0695894E-35)
            if (r0 != r1) goto L_0x0048
            java.lang.String r0 = "light"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0048
            com.discord.theme.ThemeManager r4 = com.discord.theme.ThemeManager.INSTANCE
            r4.setLightTheme()
            goto L_0x0039
        L_0x0023:
            java.lang.String r0 = "dark"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0048
            goto L_0x0034
        L_0x002c:
            java.lang.String r0 = "amoled"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0048
        L_0x0034:
            com.discord.theme.ThemeManager r4 = com.discord.theme.ThemeManager.INSTANCE
            r4.setDarkTheme()
        L_0x0039:
            android.app.Activity r4 = r3.getCurrentActivity()
            if (r4 == 0) goto L_0x0047
            q3.a r0 = new q3.a
            r0.<init>()
            r4.runOnUiThread(r0)
        L_0x0047:
            return
        L_0x0048:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid theme: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.theme.ThemeModule.updateTheme(java.lang.String):void");
    }
}
