package com.discord.p048qr.scanner;

import com.discord.p048qr.scanner.events.OnQRCodeFoundEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m15073d2 = {"Lcom/discord/qr/scanner/QRScannerViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/qr/scanner/QRScanner;", "()V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "qr_scanner_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* renamed from: com.discord.qr.scanner.QRScannerViewManager */
/* loaded from: classes3.dex */
public final class QRScannerViewManager extends ViewGroupManager<QRScanner> {
    private final ReactEvents reactEvents = new ReactEvents(C11098x.m10921a("onQRCodeFound", C9951f0.m14684b(OnQRCodeFoundEvent.class)));

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDQRScanner";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public QRScanner createViewInstance(ThemedReactContext reactContext) {
        C9971q.m14633g(reactContext, "reactContext");
        QRScanner qRScanner = new QRScanner(reactContext, null, 0, 6, null);
        qRScanner.setOnCodeFound(new QRScannerViewManager$createViewInstance$1$1(this, qRScanner));
        qRScanner.setOnCodeNotFound(new QRScannerViewManager$createViewInstance$1$2(this, qRScanner));
        return qRScanner;
    }
}
