package com.discord.qr.scanner;

import com.discord.qr.scanner.events.OnQRCodeFoundEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class QRScannerViewManager$createViewInstance$1$2 extends s implements Function0<Unit> {
    final  QRScanner $scanner;
    final  QRScannerViewManager this$0;

    
    
    public QRScannerViewManager$createViewInstance$1$2(QRScannerViewManager qRScannerViewManager, QRScanner qRScanner) {
        super(0);
        this.this$0 = qRScannerViewManager;
        this.$scanner = qRScanner;
    }

    @Override 
    
    public final void invoke2() {
        ReactEvents reactEvents;
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitEvent(this.$scanner, new OnQRCodeFoundEvent("FAILED", null));
    }
}
