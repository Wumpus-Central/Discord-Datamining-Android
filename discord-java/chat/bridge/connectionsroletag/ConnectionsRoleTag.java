package com.discord.chat.bridge.connectionsroletag;

import bj.n1;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yi.f;

@f
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B=\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÇ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006&"}, d2 = {"Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;", "", "seen1", "", "id", "", "name", ViewProps.BACKGROUND_COLOR, "iconColor", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;II)V", "getBackgroundColor", "()I", "getIconColor", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ConnectionsRoleTag {
    public static final Companion Companion = new Companion(null);
    private final int backgroundColor;
    private final int iconColor;

    /* renamed from: id  reason: collision with root package name */
    private final String f7197id;
    private final String name;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConnectionsRoleTag> serializer() {
            return ConnectionsRoleTag$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConnectionsRoleTag(int i10, String str, String str2, int i11, int i12, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i10 & 15)) {
            n1.b(i10, 15, ConnectionsRoleTag$$serializer.INSTANCE.getDescriptor());
        }
        this.f7197id = str;
        this.name = str2;
        this.backgroundColor = i11;
        this.iconColor = i12;
    }

    public static /* synthetic */ ConnectionsRoleTag copy$default(ConnectionsRoleTag connectionsRoleTag, String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = connectionsRoleTag.f7197id;
        }
        if ((i12 & 2) != 0) {
            str2 = connectionsRoleTag.name;
        }
        if ((i12 & 4) != 0) {
            i10 = connectionsRoleTag.backgroundColor;
        }
        if ((i12 & 8) != 0) {
            i11 = connectionsRoleTag.iconColor;
        }
        return connectionsRoleTag.copy(str, str2, i10, i11);
    }

    public static final void write$Self(ConnectionsRoleTag self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.z(serialDesc, 0, self.f7197id);
        output.z(serialDesc, 1, self.name);
        output.x(serialDesc, 2, self.backgroundColor);
        output.x(serialDesc, 3, self.iconColor);
    }

    public final String component1() {
        return this.f7197id;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.backgroundColor;
    }

    public final int component4() {
        return this.iconColor;
    }

    public final ConnectionsRoleTag copy(String id2, String name, int i10, int i11) {
        q.g(id2, "id");
        q.g(name, "name");
        return new ConnectionsRoleTag(id2, name, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectionsRoleTag)) {
            return false;
        }
        ConnectionsRoleTag connectionsRoleTag = (ConnectionsRoleTag) obj;
        return q.b(this.f7197id, connectionsRoleTag.f7197id) && q.b(this.name, connectionsRoleTag.name) && this.backgroundColor == connectionsRoleTag.backgroundColor && this.iconColor == connectionsRoleTag.iconColor;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getIconColor() {
        return this.iconColor;
    }

    public final String getId() {
        return this.f7197id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((this.f7197id.hashCode() * 31) + this.name.hashCode()) * 31) + this.backgroundColor) * 31) + this.iconColor;
    }

    public String toString() {
        String str = this.f7197id;
        String str2 = this.name;
        int i10 = this.backgroundColor;
        int i11 = this.iconColor;
        return "ConnectionsRoleTag(id=" + str + ", name=" + str2 + ", backgroundColor=" + i10 + ", iconColor=" + i11 + ")";
    }

    public ConnectionsRoleTag(String id2, String name, int i10, int i11) {
        q.g(id2, "id");
        q.g(name, "name");
        this.f7197id = id2;
        this.name = name;
        this.backgroundColor = i10;
        this.iconColor = i11;
    }
}
