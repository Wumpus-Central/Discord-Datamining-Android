package com.discord.crash_reporting.system_logs;

import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001J\u0012\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, m15073d2 = {"Lcom/discord/crash_reporting/system_logs/DebugPrintBuilder;", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "(Ljava/lang/StringBuilder;)V", "indentation", "", "getSb", "()Ljava/lang/StringBuilder;", "appendKeyValue", "", "key", "", "value", "appendLine", "s", "crash_reporting_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class DebugPrintBuilder {
    private int indentation;

    /* renamed from: sb */
    private final StringBuilder f8724sb;

    public DebugPrintBuilder(StringBuilder sb2) {
        C9677q.m14633g(sb2, "sb");
        this.f8724sb = sb2;
    }

    public static /* synthetic */ void appendLine$default(DebugPrintBuilder debugPrintBuilder, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        debugPrintBuilder.appendLine(str);
    }

    public final void appendKeyValue(String key, Object obj) {
        String str;
        C9677q.m14633g(key, "key");
        int i = this.indentation;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8724sb.append("  ");
        }
        this.f8724sb.append(" - ");
        this.f8724sb.append(key);
        this.f8724sb.append(": ");
        StringBuilder sb2 = this.f8724sb;
        if (obj == null || (str = obj.toString()) == null) {
            str = "{null}";
        }
        sb2.append(str);
        StringBuilder sb3 = this.f8724sb;
        sb3.append('\n');
        C9677q.m14634f(sb3, "append('\\n')");
    }

    public final void appendLine(String str) {
        StringBuilder sb2 = this.f8724sb;
        sb2.append(str);
        C9677q.m14634f(sb2, "append(value)");
        sb2.append('\n');
        C9677q.m14634f(sb2, "append('\\n')");
    }

    public final StringBuilder getSb() {
        return this.f8724sb;
    }
}
