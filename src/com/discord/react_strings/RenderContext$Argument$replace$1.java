package com.discord.react_strings;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.text.MatchResult;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "match", "Lkotlin/text/MatchResult;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
public final class RenderContext$Argument$replace$1 extends AbstractC9679s implements Function1<MatchResult, CharSequence> {
    final /* synthetic */ Function3<String, String, Boolean, CharSequence> $onMatch;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RenderContext$Argument$replace$1(Function3<? super String, ? super String, ? super Boolean, ? extends CharSequence> function3) {
        super(1);
        this.$onMatch = function3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence invoke(kotlin.text.MatchResult r7) {
        /*
            r6 = this;
            java.lang.String r0 = "match"
            kotlin.jvm.internal.C9677q.m14633g(r7, r0)
            com.discord.react_strings.RenderContext$Argument r0 = com.discord.react_strings.RenderContext.Argument.INSTANCE
            r1 = 3
            java.lang.String r1 = com.discord.react_strings.RenderContext.Argument.access$get(r0, r7, r1)
            r2 = 2
            boolean r2 = com.discord.react_strings.RenderContext.Argument.access$contains(r0, r7, r2)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001e
            r2 = 4
            boolean r2 = com.discord.react_strings.RenderContext.Argument.access$contains(r0, r7, r2)
            if (r2 == 0) goto L_0x001e
            r2 = r4
            goto L_0x001f
        L_0x001e:
            r2 = r3
        L_0x001f:
            boolean r5 = com.discord.react_strings.RenderContext.Argument.access$contains(r0, r7, r4)
            if (r5 == 0) goto L_0x002d
            r5 = 5
            boolean r0 = com.discord.react_strings.RenderContext.Argument.access$contains(r0, r7, r5)
            if (r0 == 0) goto L_0x002d
            r3 = r4
        L_0x002d:
            if (r3 == 0) goto L_0x003b
            java.util.List r7 = r7.mo5841b()
            r0 = 7
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x003c
        L_0x003b:
            r7 = 0
        L_0x003c:
            kotlin.jvm.functions.Function3<java.lang.String, java.lang.String, java.lang.Boolean, java.lang.CharSequence> r0 = r6.$onMatch
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r7 = r0.invoke(r1, r7, r2)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.react_strings.RenderContext$Argument$replace$1.invoke(kotlin.text.MatchResult):java.lang.CharSequence");
    }
}
