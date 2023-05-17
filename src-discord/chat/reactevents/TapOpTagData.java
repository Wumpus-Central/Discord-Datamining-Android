package com.discord.chat.reactevents;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import nf.n;
import nf.p;
import yi.f;

@f
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/discord/chat/reactevents/TapOpTagData;", "Lcom/discord/reactevents/ReactEvent;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TapOpTagData implements ReactEvent {
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final TapOpTagData INSTANCE = new TapOpTagData();

    static {
        Lazy<KSerializer<Object>> b10;
        b10 = n.b(p.PUBLICATION, TapOpTagData$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = b10;
    }

    private TapOpTagData() {
    }

    private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
        return $cachedSerializer$delegate;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public final KSerializer<TapOpTagData> serializer() {
        return (KSerializer) get$cachedSerializer$delegate().getValue();
    }
}
