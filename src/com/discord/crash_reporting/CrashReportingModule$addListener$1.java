package com.discord.crash_reporting;

import com.discord.crash_reporting.react_events.CrashReportEvent;
import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason;
import com.discord.crash_reporting.system_logs.SystemLogUtils;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m15073d2 = {"<anonymous>", "", "reason", "Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;", "tombstone", "Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class CrashReportingModule$addListener$1 extends AbstractC9679s implements Function2<HistoricalProcessExitReason.Reason, SystemLogUtils.Tombstone, Unit> {
    final /* synthetic */ CrashReportingModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashReportingModule$addListener$1(CrashReportingModule crashReportingModule) {
        super(2);
        this.this$0 = crashReportingModule;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(HistoricalProcessExitReason.Reason reason, SystemLogUtils.Tombstone tombstone) {
        invoke2(reason, tombstone);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(HistoricalProcessExitReason.Reason reason, SystemLogUtils.Tombstone tombstone) {
        ReactEvents reactEvents;
        ReactApplicationContext reactApplicationContext;
        reactEvents = this.this$0.reactEvents;
        reactApplicationContext = this.this$0.getReactApplicationContext();
        C9677q.m14634f(reactApplicationContext, "reactApplicationContext");
        reactEvents.emitModuleEvent(reactApplicationContext, new CrashReportEvent(Boolean.TRUE, reason, tombstone));
    }
}
