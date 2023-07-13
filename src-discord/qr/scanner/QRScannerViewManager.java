package com.discord.qr.scanner;

import com.discord.qr.scanner.events.OnQRCodeFoundEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.DCDQRScannerManagerDelegate;
import com.facebook.react.viewmanagers.DCDQRScannerManagerInterface;
import ff.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@ReactModule(name = QRScannerViewManager.NAME)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0014J$\u0010\r\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/qr/scanner/QRScannerViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/qr/scanner/QRScanner;", "Lcom/facebook/react/viewmanagers/DCDQRScannerManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDQRScannerManagerDelegate;", "kotlin.jvm.PlatformType", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "Companion", "qr_scanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class QRScannerViewManager extends ViewGroupManager<QRScanner> implements DCDQRScannerManagerInterface<QRScanner> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDQRScanner";
    private final ReactEvents reactEvents = new ReactEvents(x.a("onQRCodeFound", f0.b(OnQRCodeFoundEvent.class)));
    private final DCDQRScannerManagerDelegate<QRScanner, QRScannerViewManager> delegate = new DCDQRScannerManagerDelegate<>(this);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/qr/scanner/QRScannerViewManager$Companion;", "", "()V", "NAME", "", "qr_scanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override 
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override 
    public String getName() {
        return NAME;
    }

    
    @Override 
    public QRScanner createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        QRScanner qRScanner = new QRScanner(reactContext, null, 0, 6, null);
        qRScanner.setOnCodeFound(new QRScannerViewManager$createViewInstance$1$1(this, qRScanner));
        qRScanner.setOnCodeNotFound(new QRScannerViewManager$createViewInstance$1$2(this, qRScanner));
        return qRScanner;
    }

    
    @Override 
    public DCDQRScannerManagerDelegate<QRScanner, QRScannerViewManager> getDelegate() {
        return this.delegate;
    }
}
