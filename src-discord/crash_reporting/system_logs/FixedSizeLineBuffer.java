package com.discord.crash_reporting.system_logs;

import com.facebook.react.bridge.BaseJavaModule;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007J\u0012\u0010\r\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/discord/crash_reporting/system_logs/FixedSizeLineBuffer;", "", "maxCharacterCount", "", "(I)V", "output", "Lkotlin/collections/ArrayDeque;", "", "outputLength", BaseJavaModule.METHOD_TYPE_SYNC, "addLine", "", "line", "appendString", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class FixedSizeLineBuffer {
    private final int maxCharacterCount;
    private int outputLength;
    private final ArrayDeque<String> output = new ArrayDeque<>();
    private final Object sync = new Object();

    public FixedSizeLineBuffer(int i10) {
        this.maxCharacterCount = i10;
    }

    public final void addLine(String line) {
        String r10;
        q.g(line, "line");
        synchronized (this.sync) {
            this.output.add(line);
            this.outputLength += line.length() + 1;
            while (this.outputLength > this.maxCharacterCount && (r10 = this.output.r()) != null) {
                this.outputLength -= r10.length() - 1;
            }
            Unit unit = Unit.f20670a;
        }
    }

    public final void appendString(StringBuilder sb2) {
        q.g(sb2, "sb");
        synchronized (this.sync) {
            Iterator<String> it = this.output.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                q.f(sb2, "append(value)");
                sb2.append('\n');
                q.f(sb2, "append('\\n')");
            }
            Unit unit = Unit.f20670a;
        }
    }
}
