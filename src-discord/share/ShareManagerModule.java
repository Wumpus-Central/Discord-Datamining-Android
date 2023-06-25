package com.discord.share;

import android.app.Activity;
import android.content.Intent;
import com.discord.share.ShareBroadcastReceiver;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0007J\u001a\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007J\u001c\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0007J0\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/discord/share/ShareManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "shareBroadcastReceiver", "Lcom/discord/share/ShareBroadcastReceiver;", "getName", "", "initialize", "", "invalidate", "launchApp", "setAuthenticationToken", "authenticationToken", "superProperties", "setSelectedChannel", "channelJSON", "guildJSON", "share", "text", "url", "chooserText", "location", "share_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShareManagerModule extends ReactContextBaseJavaModule {
    private final ShareBroadcastReceiver shareBroadcastReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        this.shareBroadcastReceiver = new ShareBroadcastReceiver(reactContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ShareManager";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        ShareBroadcastReceiver.Companion companion = ShareBroadcastReceiver.Companion;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        companion.register(reactApplicationContext, this.shareBroadcastReceiver);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        try {
            ShareBroadcastReceiver.Companion companion = ShareBroadcastReceiver.Companion;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            q.f(reactApplicationContext, "reactApplicationContext");
            companion.unregister(reactApplicationContext, this.shareBroadcastReceiver);
        } catch (Exception unused) {
        }
    }

    @ReactMethod
    public final void launchApp() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null) {
            Intent launchIntentForPackage = reactApplicationContext.getPackageManager().getLaunchIntentForPackage(reactApplicationContext.getPackageName());
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.finish();
            }
            Activity currentActivity2 = getCurrentActivity();
            if (currentActivity2 != null) {
                currentActivity2.startActivity(launchIntentForPackage);
            }
        }
    }

    @ReactMethod
    public final void setAuthenticationToken(String str, String superProperties) {
        q.g(superProperties, "superProperties");
    }

    @ReactMethod
    public final void setSelectedChannel(String str, String str2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void share(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            r15 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0011
            boolean r4 = ki.l.w(r16)
            if (r4 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r4 = r2
            goto L_0x0012
        L_0x0011:
            r4 = r3
        L_0x0012:
            if (r4 == 0) goto L_0x0025
            if (r1 == 0) goto L_0x001f
            boolean r4 = ki.l.w(r17)
            if (r4 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r4 = r2
            goto L_0x0020
        L_0x001f:
            r4 = r3
        L_0x0020:
            if (r4 != 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r4 = r2
            goto L_0x0026
        L_0x0025:
            r4 = r3
        L_0x0026:
            if (r4 == 0) goto L_0x007f
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.SEND"
            r4.<init>(r5)
            r4.setAction(r5)
            java.lang.String r5 = "text/plain"
            r4.setType(r5)
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]
            r5[r2] = r0
            r5[r3] = r1
            java.util.List r6 = kotlin.collections.h.m(r5)
            java.lang.String r7 = "\n"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 62
            r14 = 0
            java.lang.String r0 = kotlin.collections.h.c0(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r1 = "android.intent.extra.TEXT"
            r4.putExtra(r1, r0)
            com.facebook.react.bridge.ReactApplicationContext r0 = r15.getReactApplicationContext()
            android.app.Activity r0 = r0.getCurrentActivity()
            if (r0 == 0) goto L_0x007e
            if (r18 != 0) goto L_0x0064
            java.lang.String r1 = ""
            goto L_0x0066
        L_0x0064:
            r1 = r18
        L_0x0066:
            com.discord.share.ShareBroadcastReceiver$Companion r2 = com.discord.share.ShareBroadcastReceiver.Companion
            com.facebook.react.bridge.ReactApplicationContext r3 = r15.getReactApplicationContext()
            java.lang.String r5 = "reactApplicationContext"
            kotlin.jvm.internal.q.f(r3, r5)
            r5 = r19
            android.content.IntentSender r2 = r2.getPendingIntentSender(r3, r5)
            android.content.Intent r1 = android.content.Intent.createChooser(r4, r1, r2)
            r0.startActivity(r1)
        L_0x007e:
            return
        L_0x007f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Text or url must not be null - text: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " url "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.share.ShareManagerModule.share(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
