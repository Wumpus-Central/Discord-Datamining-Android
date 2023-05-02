package com.discord.crash_reporting.system_logs;

import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import kotlin.text.Regex;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SystemLogUtils$fetch$1 extends s implements Function0<Unit> {
    final /* synthetic */ Function1<LinkedList<String>, Unit> $cb;
    final /* synthetic */ Regex $filter;
    final /* synthetic */ boolean $logErrors;
    final /* synthetic */ LinkedList<String> $output;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SystemLogUtils$fetch$1(LinkedList<String> linkedList, Regex regex, boolean z10, Function1<? super LinkedList<String>, Unit> function1) {
        super(0);
        this.$output = linkedList;
        this.$filter = regex;
        this.$logErrors = z10;
        this.$cb = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
        if (r0 != null) goto L_0x0045;
     */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2() {
        /*
            r8 = this;
            r0 = 0
            java.lang.ProcessBuilder r1 = new java.lang.ProcessBuilder     // Catch: all -> 0x0049, Exception -> 0x004b
            java.lang.String r2 = "/system/bin/logcat"
            java.lang.String r3 = "-d"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: all -> 0x0049, Exception -> 0x004b
            r1.<init>(r2)     // Catch: all -> 0x0049, Exception -> 0x004b
            r2 = 1
            java.lang.ProcessBuilder r1 = r1.redirectErrorStream(r2)     // Catch: all -> 0x0049, Exception -> 0x004b
            java.lang.Process r0 = r1.start()     // Catch: all -> 0x0049, Exception -> 0x004b
            com.discord.crash_reporting.system_logs.SystemLogUtils r1 = com.discord.crash_reporting.system_logs.SystemLogUtils.INSTANCE     // Catch: all -> 0x0049, Exception -> 0x004b
            com.discord.crash_reporting.system_logs.SystemLogUtils.access$waitFor(r1, r0)     // Catch: all -> 0x0049, Exception -> 0x004b
            java.io.InputStream r2 = r0.getInputStream()     // Catch: all -> 0x0049, Exception -> 0x004b
            java.lang.String r3 = "logcatProcess.inputStream"
            kotlin.jvm.internal.q.f(r2, r3)     // Catch: all -> 0x0049, Exception -> 0x004b
            java.nio.charset.Charset r3 = ri.d.f28529b     // Catch: all -> 0x0049, Exception -> 0x004b
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: all -> 0x0049, Exception -> 0x004b
            r4.<init>(r2, r3)     // Catch: all -> 0x0049, Exception -> 0x004b
            boolean r2 = r4 instanceof java.io.BufferedReader     // Catch: all -> 0x0049, Exception -> 0x004b
            if (r2 == 0) goto L_0x0033
            java.io.BufferedReader r4 = (java.io.BufferedReader) r4     // Catch: all -> 0x0049, Exception -> 0x004b
            goto L_0x003b
        L_0x0033:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: all -> 0x0049, Exception -> 0x004b
            r3 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r4, r3)     // Catch: all -> 0x0049, Exception -> 0x004b
            r4 = r2
        L_0x003b:
            java.util.LinkedList<java.lang.String> r2 = r8.$output     // Catch: all -> 0x0049, Exception -> 0x004b
            kotlin.text.Regex r3 = r8.$filter     // Catch: all -> 0x0049, Exception -> 0x004b
            r1.processLogs$crash_reporting_release(r4, r2, r3)     // Catch: all -> 0x0049, Exception -> 0x004b
            r4.close()     // Catch: all -> 0x0049, Exception -> 0x004b
        L_0x0045:
            r0.destroy()
            goto L_0x0099
        L_0x0049:
            r1 = move-exception
            goto L_0x00a1
        L_0x004b:
            r1 = move-exception
            r1.printStackTrace()     // Catch: all -> 0x0049
            boolean r2 = r8.$logErrors     // Catch: all -> 0x0049
            if (r2 == 0) goto L_0x0096
            java.util.LinkedList<java.lang.String> r2 = r8.$output     // Catch: all -> 0x0049
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x0049
            r3.<init>()     // Catch: all -> 0x0049
            java.lang.String r4 = "Exception getting system logs '"
            r3.append(r4)     // Catch: all -> 0x0049
            r3.append(r1)     // Catch: all -> 0x0049
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch: all -> 0x0049
            java.lang.String r3 = r3.toString()     // Catch: all -> 0x0049
            r2.add(r3)     // Catch: all -> 0x0049
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()     // Catch: all -> 0x0049
            java.lang.String r2 = "e.stackTrace"
            kotlin.jvm.internal.q.f(r1, r2)     // Catch: all -> 0x0049
            java.util.LinkedList<java.lang.String> r2 = r8.$output     // Catch: all -> 0x0049
            int r3 = r1.length     // Catch: all -> 0x0049
            r4 = 0
        L_0x007b:
            if (r4 >= r3) goto L_0x0096
            r5 = r1[r4]     // Catch: all -> 0x0049
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x0049
            r6.<init>()     // Catch: all -> 0x0049
            java.lang.String r7 = "    "
            r6.append(r7)     // Catch: all -> 0x0049
            r6.append(r5)     // Catch: all -> 0x0049
            java.lang.String r5 = r6.toString()     // Catch: all -> 0x0049
            r2.add(r5)     // Catch: all -> 0x0049
            int r4 = r4 + 1
            goto L_0x007b
        L_0x0096:
            if (r0 == 0) goto L_0x0099
            goto L_0x0045
        L_0x0099:
            kotlin.jvm.functions.Function1<java.util.LinkedList<java.lang.String>, kotlin.Unit> r0 = r8.$cb
            java.util.LinkedList<java.lang.String> r1 = r8.$output
            r0.invoke(r1)
            return
        L_0x00a1:
            if (r0 == 0) goto L_0x00a6
            r0.destroy()
        L_0x00a6:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.crash_reporting.system_logs.SystemLogUtils$fetch$1.invoke2():void");
    }
}
