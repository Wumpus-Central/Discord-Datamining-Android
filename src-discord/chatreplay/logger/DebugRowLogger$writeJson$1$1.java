package com.discord.chatreplay.logger;

import java.io.OutputStreamWriter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "line", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class DebugRowLogger$writeJson$1$1 extends s implements Function1<String, Unit> {
    final  Ref$BooleanRef $existingLine;
    final  OutputStreamWriter $writer;

    
    
    public DebugRowLogger$writeJson$1$1(Ref$BooleanRef ref$BooleanRef, OutputStreamWriter outputStreamWriter) {
        super(1);
        this.$existingLine = ref$BooleanRef;
        this.$writer = outputStreamWriter;
    }

    @Override 
    public   Unit invoke(String str) {
        invoke2(str);
        return Unit.f21436a;
    }

    
    public final void invoke2(String line) {
        q.h(line, "line");
        if (this.$existingLine.f21461j) {
            this.$writer.write(",\n");
        }
        this.$writer.write(line);
        this.$existingLine.f21461j = true;
    }
}
