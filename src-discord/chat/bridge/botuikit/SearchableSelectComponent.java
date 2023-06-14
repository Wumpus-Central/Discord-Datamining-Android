package com.discord.chat.bridge.botuikit;

import java.util.List;
import kg.n;
import kg.p;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import vj.f;

@f
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0005¢\u0006\u0002\u0010\nJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014HÇ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016\u0080å\b\u0004"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SearchableSelectComponent;", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "seen1", "", "selectedOptions", "", "Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getSelectedOptions", "()Ljava/util/List;", "getSelectedItems", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class SearchableSelectComponent extends SelectComponent {
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion = new Companion(null);
    private final List<SearchableSelectItem> selectedOptions;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SearchableSelectComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/SearchableSelectComponent;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return SearchableSelectComponent.$cachedSerializer$delegate;
        }

        public final KSerializer<SearchableSelectComponent> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getValue();
        }
    }

    static {
        Lazy<KSerializer<Object>> a10;
        a10 = n.a(p.PUBLICATION, SearchableSelectComponent$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = a10;
    }

    public /* synthetic */ SearchableSelectComponent(int i10, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(i10, serializationConstructorMarker);
        if ((i10 & 1) == 0) {
            this.selectedOptions = null;
        } else {
            this.selectedOptions = list;
        }
    }

    public static final void write$Self(SearchableSelectComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        SelectComponent.write$Self(self, output, serialDesc);
        boolean z10 = true;
        if (!output.A(serialDesc, 0) && self.selectedOptions == null) {
            z10 = false;
        }
        if (z10) {
            output.u(serialDesc, 0, new yj.f(SearchableSelectItem$$serializer.INSTANCE), self.selectedOptions);
        }
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public List<SearchableSelectItem> getSelectedItems() {
        List<SearchableSelectItem> i10;
        List<SearchableSelectItem> list = this.selectedOptions;
        if (list != null) {
            return list;
        }
        i10 = j.i();
        return i10;
    }

    public final List<SearchableSelectItem> getSelectedOptions() {
        return this.selectedOptions;
    }

    public SearchableSelectComponent() {
    }
}
