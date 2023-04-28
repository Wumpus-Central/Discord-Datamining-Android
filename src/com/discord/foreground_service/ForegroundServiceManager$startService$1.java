package com.discord.foreground_service;

import com.discord.foreground_service.utils.Log;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, m15073d2 = {"<anonymous>", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ForegroundServiceManager$startService$1 extends AbstractC9973s implements Function1<Exception, Unit> {
    public static final ForegroundServiceManager$startService$1 INSTANCE = new ForegroundServiceManager$startService$1();

    ForegroundServiceManager$startService$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
        invoke2(exc);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Exception e) {
        String tag;
        C9971q.m14633g(e, "e");
        Log log = Log.INSTANCE;
        tag = ForegroundServiceManager.tag;
        C9971q.m14634f(tag, "tag");
        log.w$foreground_service_release(tag, "Unable to start service", e);
    }
}
