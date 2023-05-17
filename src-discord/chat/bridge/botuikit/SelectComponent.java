package com.discord.chat.bridge.botuikit;

import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import nf.n;
import nf.p;
import yi.f;

@f
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 )2\u00020\u0001:\u0001)B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H&J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000bR\u0012\u0010\u001b\u001a\u00020\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006*"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SelectComponent;", "Lcom/discord/chat/bridge/botuikit/Component;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", ViewProps.ACCESSIBILITY_LABEL, "", "getAccessibilityLabel", "()Ljava/lang/String;", "applicationId", "getApplicationId", "customId", "getCustomId", "disabled", "", "getDisabled", "()Z", "maxValues", "getMaxValues", "()I", "minValues", "getMinValues", ReactTextInputShadowNode.PROP_PLACEHOLDER, "getPlaceholder", "state", "Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "getState", "()Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "getSelectedItems", "", "Lcom/discord/chat/bridge/botuikit/SelectItem;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class SelectComponent extends Component {
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SelectComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return SelectComponent.$cachedSerializer$delegate;
        }

        public final KSerializer<SelectComponent> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getValue();
        }
    }

    static {
        Lazy<KSerializer<Object>> b10;
        b10 = n.b(p.PUBLICATION, SelectComponent$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = b10;
    }

    public /* synthetic */ SelectComponent(int i10, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
    }

    public static final void write$Self(SelectComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
    }

    public abstract String getAccessibilityLabel();

    public abstract String getApplicationId();

    public abstract String getCustomId();

    public abstract boolean getDisabled();

    public abstract int getMaxValues();

    public abstract int getMinValues();

    public abstract String getPlaceholder();

    public abstract List<SelectItem> getSelectedItems();

    public abstract ActionComponentState getState();

    public SelectComponent() {
        super(null);
    }
}
