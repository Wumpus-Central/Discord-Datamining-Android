package com.discord.notifications.api;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.t;
import pi.f;
import si.n1;

@f
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u00029:Bd\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fB@\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u0019\u0010%\u001a\u00020\nHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0018J\u0019\u0010'\u001a\u00020\fHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0014JT\u0010)\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001J!\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208HÇ\u0001R'\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0015\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R'\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0019\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Lcom/discord/notifications/api/KvMessageEntry;", "", "seen1", "", "members", "", "Lkotlinx/serialization/json/JsonObject;", "users", "message", "id", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM$annotations", "()V", "getChannelId-o4g7jtM", "()J", "J", "getId-3Eiw7ao$annotations", "getId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getMembers$annotations", "getMembers", "()Ljava/util/List;", "getMessage$annotations", "getMessage", "()Lkotlinx/serialization/json/JsonObject;", "getUsers$annotations", "getUsers", "component1", "component2", "component3", "component4", "component4-3Eiw7ao", "component5", "component5-o4g7jtM", "copy", "copy-kA7ecXY", "(Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;J)Lcom/discord/notifications/api/KvMessageEntry;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class KvMessageEntry {
    public static final Companion Companion = new Companion(null);
    private final long channelId;

    
    private final String f7192id;
    private final List<JsonObject> members;
    private final JsonObject message;
    private final List<JsonObject> users;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/notifications/api/KvMessageEntry$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/api/KvMessageEntry;", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KvMessageEntry> serializer() {
            return KvMessageEntry$$serializer.INSTANCE;
        }
    }

    private KvMessageEntry(int i10, List<JsonObject> list, List<JsonObject> list2, JsonObject jsonObject, String str, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker) {
        List<JsonObject> h10;
        if (28 != (i10 & 28)) {
            n1.b(i10, 28, KvMessageEntry$$serializer.INSTANCE.getDescriptor());
        }
        this.members = (i10 & 1) == 0 ? j.h() : list;
        if ((i10 & 2) == 0) {
            h10 = j.h();
            this.users = h10;
        } else {
            this.users = list2;
        }
        this.message = jsonObject;
        this.f7192id = str;
        this.channelId = channelId.m575unboximpl();
    }

    public  KvMessageEntry(int i10, List list, List list2, JsonObject jsonObject, String str, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list, list2, jsonObject, str, channelId, serializationConstructorMarker);
    }

    public  KvMessageEntry(List list, List list2, JsonObject jsonObject, String str, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, jsonObject, str, j10);
    }

    
    
    public static  KvMessageEntry m510copykA7ecXY$default(KvMessageEntry kvMessageEntry, List list, List list2, JsonObject jsonObject, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = kvMessageEntry.members;
        }
        if ((i10 & 2) != 0) {
            list2 = kvMessageEntry.users;
        }
        if ((i10 & 4) != 0) {
            jsonObject = kvMessageEntry.message;
        }
        if ((i10 & 8) != 0) {
            str = kvMessageEntry.f7192id;
        }
        if ((i10 & 16) != 0) {
            j10 = kvMessageEntry.channelId;
        }
        return kvMessageEntry.m515copykA7ecXY(list, list2, jsonObject, str, j10);
    }

    
    public static  void m511getChannelIdo4g7jtM$annotations() {
    }

    
    public static  void m512getId3Eiw7ao$annotations() {
    }

    public static  void getMembers$annotations() {
    }

    public static  void getMessage$annotations() {
    }

    public static  void getUsers$annotations() {
    }

    public static final void write$Self(KvMessageEntry self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        t tVar = t.f21229a;
        output.n(serialDesc, 0, new si.f(tVar), self.members);
        output.n(serialDesc, 1, new si.f(tVar), self.users);
        output.n(serialDesc, 2, tVar, self.message);
        output.n(serialDesc, 3, MessageId$$serializer.INSTANCE, MessageId.m592boximpl(self.f7192id));
        output.n(serialDesc, 4, ChannelId$$serializer.INSTANCE, ChannelId.m566boximpl(self.channelId));
    }

    public final List<JsonObject> component1() {
        return this.members;
    }

    public final List<JsonObject> component2() {
        return this.users;
    }

    public final JsonObject component3() {
        return this.message;
    }

    
    public final String m513component43Eiw7ao() {
        return this.f7192id;
    }

    
    public final long m514component5o4g7jtM() {
        return this.channelId;
    }

    
    public final KvMessageEntry m515copykA7ecXY(List<JsonObject> members, List<JsonObject> users, JsonObject message, String id2, long j10) {
        q.g(members, "members");
        q.g(users, "users");
        q.g(message, "message");
        q.g(id2, "id");
        return new KvMessageEntry(members, users, message, id2, j10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KvMessageEntry)) {
            return false;
        }
        KvMessageEntry kvMessageEntry = (KvMessageEntry) obj;
        return q.b(this.members, kvMessageEntry.members) && q.b(this.users, kvMessageEntry.users) && q.b(this.message, kvMessageEntry.message) && MessageId.m596equalsimpl0(this.f7192id, kvMessageEntry.f7192id) && ChannelId.m570equalsimpl0(this.channelId, kvMessageEntry.channelId);
    }

    
    public final long m516getChannelIdo4g7jtM() {
        return this.channelId;
    }

    
    public final String m517getId3Eiw7ao() {
        return this.f7192id;
    }

    public final List<JsonObject> getMembers() {
        return this.members;
    }

    public final JsonObject getMessage() {
        return this.message;
    }

    public final List<JsonObject> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return (((((((this.members.hashCode() * 31) + this.users.hashCode()) * 31) + this.message.hashCode()) * 31) + MessageId.m597hashCodeimpl(this.f7192id)) * 31) + ChannelId.m571hashCodeimpl(this.channelId);
    }

    public String toString() {
        List<JsonObject> list = this.members;
        List<JsonObject> list2 = this.users;
        JsonObject jsonObject = this.message;
        String str = MessageId.m598toStringimpl(this.f7192id);
        String str2 = ChannelId.m573toStringimpl(this.channelId);
        return "KvMessageEntry(members=" + list + ", users=" + list2 + ", message=" + jsonObject + ", id=" + str + ", channelId=" + str2 + ")";
    }

    private KvMessageEntry(List<JsonObject> list, List<JsonObject> list2, JsonObject jsonObject, String str, long j10) {
        this.members = list;
        this.users = list2;
        this.message = jsonObject;
        this.f7192id = str;
        this.channelId = j10;
    }

    
    
    public  KvMessageEntry(java.util.List r10, java.util.List r11, kotlinx.serialization.json.JsonObject r12, java.lang.String r13, long r14, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.api.KvMessageEntry.<init>(java.util.List, java.util.List, kotlinx.serialization.json.JsonObject, java.lang.String, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
