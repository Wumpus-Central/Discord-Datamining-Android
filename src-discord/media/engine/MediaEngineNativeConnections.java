package com.discord.media.engine;

import com.discord.media.engine.types.Debug;
import com.discord.p000native.engine.NativeConnection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0086\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\nR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/media/engine/MediaEngineNativeConnections;", "", "()V", "connections", "", "", "Lcom/discord/native/engine/NativeConnection;", "get", "connectionId", "register", "", "connection", "removeAndDispose", "removeAndDisposeAll", "Companion", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediaEngineNativeConnections {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "MediaEngineNativeConnections";
    private final Map<Integer, NativeConnection> connections = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/media/engine/MediaEngineNativeConnections$Companion;", "", "()V", "TAG", "", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final NativeConnection get(int i10) {
        return this.connections.get(Integer.valueOf(i10));
    }

    public final void register(int i10, NativeConnection connection) {
        q.g(connection, "connection");
        if (!(!this.connections.containsKey(Integer.valueOf(i10)))) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (!this.connections.containsValue(connection)) {
            this.connections.put(Integer.valueOf(i10), connection);
            Debug debug = Debug.INSTANCE;
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final void removeAndDispose(int i10) {
        Unit unit;
        NativeConnection remove = this.connections.remove(Integer.valueOf(i10));
        if (remove != null) {
            System.nanoTime();
            remove.dispose();
            Debug debug = Debug.INSTANCE;
            unit = Unit.f22035a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Debug debug2 = Debug.INSTANCE;
        }
    }

    public final void removeAndDisposeAll() {
        for (Number number : this.connections.keySet()) {
            removeAndDispose(number.intValue());
        }
        if (!this.connections.isEmpty()) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}