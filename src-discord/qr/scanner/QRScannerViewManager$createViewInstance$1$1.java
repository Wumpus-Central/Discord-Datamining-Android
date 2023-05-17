package com.discord.qr.scanner;

import com.discord.qr.scanner.events.OnQRCodeFoundEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "code", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QRScannerViewManager$createViewInstance$1$1 extends s implements Function1<String, Unit> {
    final /* synthetic */ QRScanner $scanner;
    final /* synthetic */ QRScannerViewManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRScannerViewManager$createViewInstance$1$1(QRScannerViewManager qRScannerViewManager, QRScanner qRScanner) {
        super(1);
        this.this$0 = qRScannerViewManager;
        this.$scanner = qRScanner;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f22036a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String code) {
        ReactEvents reactEvents;
        q.g(code, "code");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitEvent(this.$scanner, new OnQRCodeFoundEvent("SUCCEEDED", code));
    }
}
