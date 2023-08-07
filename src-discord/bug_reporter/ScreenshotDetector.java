package com.discord.bug_reporter;

import android.content.ContentResolver;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u000fH\u0002R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/discord/bug_reporter/ScreenshotDetector;", "", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;)V", "value", "", AppStateModule.APP_STATE_ACTIVE, "getActive", "()Z", "setActive", "(Z)V", "screenshotContentObserver", "Lcom/discord/bug_reporter/ScreenshotContentObserver;", "Lkotlin/Function0;", "", "screenshotListener", "getScreenshotListener", "()Lkotlin/jvm/functions/Function0;", "setScreenshotListener", "(Lkotlin/jvm/functions/Function0;)V", "toggleScreenshotObserver", "Companion", "bug_reporter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ScreenshotDetector {
    public static final Companion Companion = new Companion(null);
    private static ScreenshotDetector INSTANCE;
    private boolean active;
    private final ScreenshotContentObserver screenshotContentObserver;
    private Function0<Unit> screenshotListener;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/bug_reporter/ScreenshotDetector$Companion;", "", "()V", "INSTANCE", "Lcom/discord/bug_reporter/ScreenshotDetector;", "get", "init", "", "contentResolver", "Landroid/content/ContentResolver;", "bug_reporter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ScreenshotDetector get() {
            ScreenshotDetector screenshotDetector = ScreenshotDetector.INSTANCE;
            if (screenshotDetector != null) {
                return screenshotDetector;
            }
            q.z("INSTANCE");
            return null;
        }

        public final void init(ContentResolver contentResolver) {
            q.h(contentResolver, "contentResolver");
            if (ScreenshotDetector.INSTANCE == null) {
                ScreenshotDetector.INSTANCE = new ScreenshotDetector(contentResolver);
            }
        }
    }

    public ScreenshotDetector(ContentResolver contentResolver) {
        q.h(contentResolver, "contentResolver");
        this.screenshotContentObserver = new ScreenshotContentObserver(contentResolver, new ScreenshotDetector$screenshotContentObserver$1(this));
    }

    private final void toggleScreenshotObserver() {
        if (!this.active || this.screenshotListener == null) {
            this.screenshotContentObserver.disconnect();
        } else {
            this.screenshotContentObserver.connect();
        }
    }

    public final boolean getActive() {
        return this.active;
    }

    public final Function0<Unit> getScreenshotListener() {
        return this.screenshotListener;
    }

    public final void setActive(boolean z10) {
        this.active = z10;
        toggleScreenshotObserver();
    }

    public final void setScreenshotListener(Function0<Unit> function0) {
        this.screenshotListener = function0;
        toggleScreenshotObserver();
    }
}
