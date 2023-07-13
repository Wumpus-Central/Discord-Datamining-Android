package com.discord.crash_reporting.system_logs;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class SystemLogUtils$hashString$1 extends s implements Function1<Byte, CharSequence> {
    public static final SystemLogUtils$hashString$1 INSTANCE = new SystemLogUtils$hashString$1();

    SystemLogUtils$hashString$1() {
        super(1);
    }

    public final CharSequence invoke(byte b10) {
        String format = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        q.f(format, "format(this, *args)");
        return format;
    }

    @Override 
    public   CharSequence invoke(Byte b10) {
        return invoke(b10.byteValue());
    }
}
