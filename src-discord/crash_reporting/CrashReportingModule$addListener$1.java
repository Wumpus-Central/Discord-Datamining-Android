package com.discord.crash_reporting;

import com.discord.crash_reporting.react_events.CrashReportEvent;
import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason;
import com.discord.crash_reporting.system_logs.SystemLogUtils;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "reason", "Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;", "tombstone", "Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class CrashReportingModule$addListener$1 extends s implements Function2<HistoricalProcessExitReason.Reason, SystemLogUtils.Tombstone, Unit> {
    final  CrashReportingModule this$0;

    
    
    public CrashReportingModule$addListener$1(CrashReportingModule crashReportingModule) {
        super(2);
        this.this$0 = crashReportingModule;
    }

    @Override 
    public   Unit invoke(HistoricalProcessExitReason.Reason reason, SystemLogUtils.Tombstone tombstone) {
        invoke2(reason, tombstone);
        return Unit.f21025a;
    }

    
    public final void invoke2(HistoricalProcessExitReason.Reason reason, SystemLogUtils.Tombstone tombstone) {
        ReactEvents reactEvents;
        ReactApplicationContext reactApplicationContext;
        reactEvents = this.this$0.reactEvents;
        reactApplicationContext = this.this$0.getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        reactEvents.emitModuleEvent(reactApplicationContext, new CrashReportEvent(Boolean.TRUE, reason, tombstone));
    }
}
