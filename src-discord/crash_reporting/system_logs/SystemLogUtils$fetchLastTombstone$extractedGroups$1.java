package com.discord.crash_reporting.system_logs;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SystemLogUtils$fetchLastTombstone$extractedGroups$1 extends s implements Function1<MatchResult, String> {
    final /* synthetic */ Regex $removeDexNameExp;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemLogUtils$fetchLastTombstone$extractedGroups$1(Regex regex) {
        super(1);
        this.$removeDexNameExp = regex;
    }

    public final String invoke(MatchResult it) {
        q.g(it, "it");
        return this.$removeDexNameExp.h(it.b().get(1), "classesN.dex");
    }
}
