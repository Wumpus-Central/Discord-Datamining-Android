package com.discord.chatreplay.logger;

import java.io.OutputStreamWriter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "line", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class DebugRowLogger$writeJson$1$1 extends AbstractC9679s implements Function1<String, Unit> {
    final /* synthetic */ Ref$BooleanRef $existingLine;
    final /* synthetic */ OutputStreamWriter $writer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugRowLogger$writeJson$1$1(Ref$BooleanRef ref$BooleanRef, OutputStreamWriter outputStreamWriter) {
        super(1);
        this.$existingLine = ref$BooleanRef;
        this.$writer = outputStreamWriter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String line) {
        C9677q.m14633g(line, "line");
        if (this.$existingLine.f25805k) {
            this.$writer.write(",\n");
        }
        this.$writer.write(line);
        this.$existingLine.f25805k = true;
    }
}
