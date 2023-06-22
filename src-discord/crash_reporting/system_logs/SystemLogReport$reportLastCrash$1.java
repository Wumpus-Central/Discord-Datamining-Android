package com.discord.crash_reporting.system_logs;

import android.content.Context;
import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason;
import com.discord.crash_reporting.system_logs.SystemLogUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import oj.v;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "crash", "Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SystemLogReport$reportLastCrash$1 extends s implements Function1<SystemLogUtils.Tombstone, Unit> {
    final /* synthetic */ Function2<HistoricalProcessExitReason.Reason, SystemLogUtils.Tombstone, Unit> $cb;
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SystemLogReport$reportLastCrash$1(Function2<? super HistoricalProcessExitReason.Reason, ? super SystemLogUtils.Tombstone, Unit> function2, Context context) {
        super(1);
        this.$cb = function2;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SystemLogUtils.Tombstone tombstone) {
        invoke2(tombstone);
        return Unit.f22114a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SystemLogUtils.Tombstone tombstone) {
        boolean z10;
        List<String> z02;
        if (tombstone != null) {
            Context context = this.$context;
            z02 = v.z0(tombstone.getText(), new String[]{ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE}, false, 0, 6, null);
            for (String str : z02) {
                SystemLogReport.INSTANCE.recordBreadcrumb(str, "Tombstone");
            }
            SystemLogReport systemLogReport = SystemLogReport.INSTANCE;
            systemLogReport.recordBreadcrumb(tombstone.getGroupHash(), "Tombstone-Hash");
            z10 = systemLogReport.checkHashChanged(context, tombstone.getTextHash());
        } else {
            z10 = false;
        }
        Function2<HistoricalProcessExitReason.Reason, SystemLogUtils.Tombstone, Unit> function2 = this.$cb;
        HistoricalProcessExitReason.Reason lastReason = HistoricalProcessExitReason.INSTANCE.lastReason(this.$context);
        if (!z10) {
            tombstone = null;
        }
        function2.invoke(lastReason, tombstone);
    }
}
