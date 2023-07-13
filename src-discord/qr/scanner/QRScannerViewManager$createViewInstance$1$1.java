package com.discord.qr.scanner;

import com.discord.qr.scanner.events.OnQRCodeFoundEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "code", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class QRScannerViewManager$createViewInstance$1$1 extends s implements Function1<String, Unit> {
    final  QRScanner $scanner;
    final  QRScannerViewManager this$0;

    
    
    public QRScannerViewManager$createViewInstance$1$1(QRScannerViewManager qRScannerViewManager, QRScanner qRScanner) {
        super(1);
        this.this$0 = qRScannerViewManager;
        this.$scanner = qRScanner;
    }

    @Override 
    public   Unit invoke(String str) {
        invoke2(str);
        return Unit.f20663a;
    }

    
    public final void invoke2(String code) {
        ReactEvents reactEvents;
        q.g(code, "code");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitEvent(this.$scanner, new OnQRCodeFoundEvent("SUCCEEDED", code));
    }
}
