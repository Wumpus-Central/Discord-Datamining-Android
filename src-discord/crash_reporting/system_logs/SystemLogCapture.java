package com.discord.crash_reporting.system_logs;

import com.facebook.react.uimanager.ViewProps;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.text.p;
import ti.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nJ\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/crash_reporting/system_logs/SystemLogCapture;", "", "()V", "buffer", "Lcom/discord/crash_reporting/system_logs/FixedSizeLineBuffer;", "tombstoneBuffer", "appendOutput", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", ViewProps.START, "startThread", "Ljava/lang/Thread;", "Companion", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SystemLogCapture {
    public static final Companion Companion = new Companion(null);
    private final FixedSizeLineBuffer buffer = new FixedSizeLineBuffer(524288);
    private final FixedSizeLineBuffer tombstoneBuffer = new FixedSizeLineBuffer(102400);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/discord/crash_reporting/system_logs/SystemLogCapture$Companion;", "", "()V", "shouldIncludeLogLine", "", "line", "", "shouldIncludeLogLine$crash_reporting_release", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean shouldIncludeLogLine$crash_reporting_release(String line) {
            boolean M;
            q.h(line, "line");
            M = p.M(line, "chatty  : uid=", false, 2, null);
            return !M;
        }
    }

    
    public final void start() {
        BufferedReader bufferedReader;
        if (!new File(SystemLogUtils.logcatPath).exists()) {
            this.buffer.addLine("Unable to locate '/system/bin/logcat'");
            return;
        }
        while (true) {
            Process process = null;
            try {
                try {
                    process = new ProcessBuilder(SystemLogUtils.logcatPath).redirectErrorStream(true).start();
                    InputStream inputStream = process.getInputStream();
                    q.g(inputStream, "logcatProcess.inputStream");
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream, a.f28776b);
                    if (inputStreamReader instanceof BufferedReader) {
                        bufferedReader = (BufferedReader) inputStreamReader;
                    } else {
                        bufferedReader = new BufferedReader(inputStreamReader, 8192);
                    }
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            if (Companion.shouldIncludeLogLine$crash_reporting_release(readLine)) {
                                this.buffer.addLine(readLine);
                            }
                            if (SystemLogUtils.INSTANCE.getRegexExtractTombstone$crash_reporting_release().g(readLine)) {
                                this.tombstoneBuffer.addLine(readLine);
                            }
                        } catch (IOException unused) {
                        }
                    }
                    bufferedReader.close();
                } catch (Exception e10) {
                    this.buffer.addLine("Exception getting system logs '" + e10 + "'");
                    StackTraceElement[] stackTrace = e10.getStackTrace();
                    q.g(stackTrace, "e.stackTrace");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        this.buffer.addLine("    " + stackTraceElement);
                    }
                    if (process == null) {
                    }
                }
                process.destroy();
                Thread.sleep(1000L);
            } catch (Throwable th2) {
                if (process != null) {
                    process.destroy();
                }
                throw th2;
            }
        }
    }

    public final void appendOutput(StringBuilder sb2) {
        q.h(sb2, "sb");
        this.tombstoneBuffer.appendString(sb2);
        this.buffer.appendString(sb2);
    }

    public final Thread startThread() {
        return tf.a.b(true, true, null, SystemLogCapture.class.getSimpleName(), 0, new SystemLogCapture$startThread$1(this), 20, null);
    }
}
