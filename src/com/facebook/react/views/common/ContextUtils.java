package com.facebook.react.views.common;

/* loaded from: classes7.dex */
public class ContextUtils {
    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T findContextOfType(android.content.Context r2, java.lang.Class<? extends T> r3) {
        /*
        L_0x0000:
            boolean r0 = r3.isInstance(r2)
            if (r0 != 0) goto L_0x0018
            boolean r0 = r2 instanceof android.content.ContextWrapper
            r1 = 0
            if (r0 == 0) goto L_0x0017
            r0 = r2
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            if (r2 != r0) goto L_0x0015
            return r1
        L_0x0015:
            r2 = r0
            goto L_0x0000
        L_0x0017:
            return r1
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.common.ContextUtils.findContextOfType(android.content.Context, java.lang.Class):java.lang.Object");
    }
}
