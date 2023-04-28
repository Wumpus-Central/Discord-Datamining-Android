package p353te;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m15073d2 = {"Landroid/content/Context;", "", "a", "(Landroid/content/Context;)I", "displayRotation", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: te.g */
/* loaded from: classes6.dex */
public final class C13063g {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        r0 = r0.getDisplay();
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m4669a(android.content.Context r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9971q.m14633g(r2, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L_0x002e
            android.view.Display r0 = com.discord.rlottie.C4698a.m32097a(r2)
            if (r0 == 0) goto L_0x0016
            int r2 = r0.getRotation()
            return r2
        L_0x0016:
            boolean r0 = r2 instanceof com.facebook.react.bridge.ReactContext
            if (r0 == 0) goto L_0x002e
            r0 = r2
            com.facebook.react.bridge.ReactContext r0 = (com.facebook.react.bridge.ReactContext) r0
            android.app.Activity r0 = r0.getCurrentActivity()
            if (r0 == 0) goto L_0x002e
            android.view.Display r0 = p353te.C13062f.m4670a(r0)
            if (r0 == 0) goto L_0x002e
            int r2 = r0.getRotation()
            return r2
        L_0x002e:
            java.lang.String r0 = "window"
            java.lang.Object r2 = r2.getSystemService(r0)
            boolean r0 = r2 instanceof android.view.WindowManager
            if (r0 == 0) goto L_0x003b
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            if (r2 == 0) goto L_0x0049
            android.view.Display r2 = r2.getDefaultDisplay()
            if (r2 == 0) goto L_0x0049
            int r2 = r2.getRotation()
            return r2
        L_0x0049:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p353te.C13063g.m4669a(android.content.Context):int");
    }
}
