package com.google.android.gms.internal.gtm;

import android.annotation.TargetApi;
import java.lang.reflect.Method;

@TargetApi(24)
/* loaded from: classes3.dex */
public final class zzfv {
    private static final Method zza;
    private static final Method zzb;

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 6
            r3 = 0
            java.lang.String r4 = "JobSchedulerCompat"
            r5 = 0
            r6 = 24
            if (r1 < r6) goto L_0x0033
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: NoSuchMethodException -> 0x0028
            java.lang.Class<android.app.job.JobInfo> r7 = android.app.job.JobInfo.class
            r1[r3] = r7     // Catch: NoSuchMethodException -> 0x0028
            r7 = 1
            r1[r7] = r0     // Catch: NoSuchMethodException -> 0x0028
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: NoSuchMethodException -> 0x0028
            r8 = 2
            r1[r8] = r7     // Catch: NoSuchMethodException -> 0x0028
            r7 = 3
            r1[r7] = r0     // Catch: NoSuchMethodException -> 0x0028
            java.lang.Class<android.app.job.JobScheduler> r0 = android.app.job.JobScheduler.class
            java.lang.String r7 = "scheduleAsPackage"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r7, r1)     // Catch: NoSuchMethodException -> 0x0028
            goto L_0x0034
        L_0x0028:
            boolean r0 = android.util.Log.isLoggable(r4, r2)
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "No scheduleAsPackage method available, falling back to schedule"
            android.util.Log.e(r4, r0)
        L_0x0033:
            r0 = r5
        L_0x0034:
            com.google.android.gms.internal.gtm.zzfv.zza = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r6) goto L_0x0050
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.String r1 = "myUserId"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: NoSuchMethodException -> 0x0045
            java.lang.reflect.Method r5 = r0.getDeclaredMethod(r1, r3)     // Catch: NoSuchMethodException -> 0x0045
            goto L_0x0050
        L_0x0045:
            boolean r0 = android.util.Log.isLoggable(r4, r2)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = "No myUserId method available"
            android.util.Log.e(r4, r0)
        L_0x0050:
            com.google.android.gms.internal.gtm.zzfv.zzb = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfv.<clinit>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r7 = "jobscheduler"
            java.lang.Object r7 = r5.getSystemService(r7)
            android.app.job.JobScheduler r7 = (android.app.job.JobScheduler) r7
            r7.getClass()
            java.lang.reflect.Method r8 = com.google.android.gms.internal.gtm.zzfv.zza
            if (r8 == 0) goto L_0x0074
            java.lang.String r8 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = r5.checkSelfPermission(r8)
            if (r5 == 0) goto L_0x0018
            goto L_0x0074
        L_0x0018:
            java.lang.reflect.Method r5 = com.google.android.gms.internal.gtm.zzfv.zzb
            r8 = 0
            if (r5 == 0) goto L_0x003f
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: InvocationTargetException -> 0x002e, IllegalAccessException -> 0x0030
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch: InvocationTargetException -> 0x002e, IllegalAccessException -> 0x0030
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: InvocationTargetException -> 0x002e, IllegalAccessException -> 0x0030
            if (r5 == 0) goto L_0x003f
            int r5 = r5.intValue()     // Catch: InvocationTargetException -> 0x002e, IllegalAccessException -> 0x0030
            goto L_0x0040
        L_0x002e:
            r5 = move-exception
            goto L_0x0031
        L_0x0030:
            r5 = move-exception
        L_0x0031:
            r0 = 6
            java.lang.String r1 = "JobSchedulerCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "myUserId invocation illegal"
            android.util.Log.e(r1, r0, r5)
        L_0x003f:
            r5 = r8
        L_0x0040:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r1 = "DispatchAlarm"
            java.lang.reflect.Method r2 = com.google.android.gms.internal.gtm.zzfv.zza
            if (r2 == 0) goto L_0x006f
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: InvocationTargetException -> 0x0067, IllegalAccessException -> 0x0069
            r3[r8] = r6     // Catch: InvocationTargetException -> 0x0067, IllegalAccessException -> 0x0069
            r4 = 1
            r3[r4] = r0     // Catch: InvocationTargetException -> 0x0067, IllegalAccessException -> 0x0069
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: InvocationTargetException -> 0x0067, IllegalAccessException -> 0x0069
            r0 = 2
            r3[r0] = r5     // Catch: InvocationTargetException -> 0x0067, IllegalAccessException -> 0x0069
            r5 = 3
            r3[r5] = r1     // Catch: InvocationTargetException -> 0x0067, IllegalAccessException -> 0x0069
            java.lang.Object r5 = r2.invoke(r7, r3)     // Catch: InvocationTargetException -> 0x0067, IllegalAccessException -> 0x0069
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: InvocationTargetException -> 0x0067, IllegalAccessException -> 0x0069
            if (r5 == 0) goto L_0x0073
            int r8 = r5.intValue()     // Catch: InvocationTargetException -> 0x0067, IllegalAccessException -> 0x0069
            goto L_0x0073
        L_0x0067:
            r5 = move-exception
            goto L_0x006a
        L_0x0069:
            r5 = move-exception
        L_0x006a:
            java.lang.String r8 = "error calling scheduleAsPackage"
            android.util.Log.e(r1, r8, r5)
        L_0x006f:
            int r8 = r7.schedule(r6)
        L_0x0073:
            return r8
        L_0x0074:
            int r5 = r7.schedule(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfv.zza(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
