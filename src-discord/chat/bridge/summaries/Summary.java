package com.discord.chat.bridge.summaries;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import vj.f;
import yj.n1;

@f
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002=>Bp\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000¢\u0006\u0002\u0010\u0013BN\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u0012\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003ø\u0001\u0000J\u0019\u0010'\u001a\u00020\fHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\u001bJ\u0019\u0010)\u001a\u00020\fHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010\u001bJ\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0019\u0010,\u001a\u00020\u0010HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010\u0016Jl\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001J!\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<HÇ\u0001R\u001c\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\r\u001a\u00020\fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u00020\fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b \u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Lcom/discord/chat/bridge/summaries/Summary;", "", "seen1", "", "id", "", "topic", "summShort", "people", "", "Lcom/discord/primitives/UserId;", "startId", "Lcom/discord/primitives/MessageId;", "endId", "count", "channelId", "Lcom/discord/primitives/ChannelId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM", "()J", "J", "getCount", "()I", "getEndId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getId", "getPeople", "()Ljava/util/List;", "getStartId-3Eiw7ao", "getSummShort", "getTopic", "component1", "component2", "component3", "component4", "component5", "component5-3Eiw7ao", "component6", "component6-3Eiw7ao", "component7", "component8", "component8-o4g7jtM", "copy", "copy-H5KhIT0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IJ)Lcom/discord/chat/bridge/summaries/Summary;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Summary {
    public static final Companion Companion = new Companion(null);
    private final long channelId;
    private final int count;
    private final String endId;

    /* renamed from: id  reason: collision with root package name */
    private final String f7628id;
    private final List<UserId> people;
    private final String startId;
    private final String summShort;
    private final String topic;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/summaries/Summary$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/summaries/Summary;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Summary> serializer() {
            return Summary$$serializer.INSTANCE;
        }
    }

    private Summary(int i10, String str, String str2, String str3, List<UserId> list, String str4, String str5, int i11, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i10 & 255)) {
            n1.b(i10, 255, Summary$$serializer.INSTANCE.getDescriptor());
        }
        this.f7628id = str;
        this.topic = str2;
        this.summShort = str3;
        this.people = list;
        this.startId = str4;
        this.endId = str5;
        this.count = i11;
        this.channelId = channelId.m572unboximpl();
    }

    public /* synthetic */ Summary(int i10, String str, String str2, String str3, List list, String str4, String str5, int i11, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, str3, list, str4, str5, i11, channelId, serializationConstructorMarker);
    }

    public /* synthetic */ Summary(String str, String str2, String str3, List list, String str4, String str5, int i10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, str4, str5, i10, j10);
    }

    public static final void write$Self(Summary self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.z(serialDesc, 0, self.f7628id);
        output.z(serialDesc, 1, self.topic);
        output.z(serialDesc, 2, self.summShort);
        output.q(serialDesc, 3, new yj.f(UserId$$serializer.INSTANCE), self.people);
        MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
        output.q(serialDesc, 4, messageId$$serializer, MessageId.m589boximpl(self.startId));
        output.q(serialDesc, 5, messageId$$serializer, MessageId.m589boximpl(self.endId));
        output.x(serialDesc, 6, self.count);
        output.q(serialDesc, 7, ChannelId$$serializer.INSTANCE, ChannelId.m563boximpl(self.channelId));
    }

    public final String component1() {
        return this.f7628id;
    }

    public final String component2() {
        return this.topic;
    }

    public final String component3() {
        return this.summShort;
    }

    public final List<UserId> component4() {
        return this.people;
    }

    /* renamed from: component5-3Eiw7ao  reason: not valid java name */
    public final String m135component53Eiw7ao() {
        return this.startId;
    }

    /* renamed from: component6-3Eiw7ao  reason: not valid java name */
    public final String m136component63Eiw7ao() {
        return this.endId;
    }

    public final int component7() {
        return this.count;
    }

    /* renamed from: component8-o4g7jtM  reason: not valid java name */
    public final long m137component8o4g7jtM() {
        return this.channelId;
    }

    /* renamed from: copy-H5KhIT0  reason: not valid java name */
    public final Summary m138copyH5KhIT0(String id2, String topic, String summShort, List<UserId> people, String startId, String endId, int i10, long j10) {
        q.g(id2, "id");
        q.g(topic, "topic");
        q.g(summShort, "summShort");
        q.g(people, "people");
        q.g(startId, "startId");
        q.g(endId, "endId");
        return new Summary(id2, topic, summShort, people, startId, endId, i10, j10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Summary)) {
            return false;
        }
        Summary summary = (Summary) obj;
        return q.b(this.f7628id, summary.f7628id) && q.b(this.topic, summary.topic) && q.b(this.summShort, summary.summShort) && q.b(this.people, summary.people) && MessageId.m593equalsimpl0(this.startId, summary.startId) && MessageId.m593equalsimpl0(this.endId, summary.endId) && this.count == summary.count && ChannelId.m567equalsimpl0(this.channelId, summary.channelId);
    }

    /* renamed from: getChannelId-o4g7jtM  reason: not valid java name */
    public final long m139getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final int getCount() {
        return this.count;
    }

    /* renamed from: getEndId-3Eiw7ao  reason: not valid java name */
    public final String m140getEndId3Eiw7ao() {
        return this.endId;
    }

    public final String getId() {
        return this.f7628id;
    }

    public final List<UserId> getPeople() {
        return this.people;
    }

    /* renamed from: getStartId-3Eiw7ao  reason: not valid java name */
    public final String m141getStartId3Eiw7ao() {
        return this.startId;
    }

    public final String getSummShort() {
        return this.summShort;
    }

    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return (((((((((((((this.f7628id.hashCode() * 31) + this.topic.hashCode()) * 31) + this.summShort.hashCode()) * 31) + this.people.hashCode()) * 31) + MessageId.m594hashCodeimpl(this.startId)) * 31) + MessageId.m594hashCodeimpl(this.endId)) * 31) + this.count) * 31) + ChannelId.m568hashCodeimpl(this.channelId);
    }

    public String toString() {
        String str = this.f7628id;
        String str2 = this.topic;
        String str3 = this.summShort;
        List<UserId> list = this.people;
        String str4 = MessageId.m595toStringimpl(this.startId);
        String str5 = MessageId.m595toStringimpl(this.endId);
        int i10 = this.count;
        String str6 = ChannelId.m570toStringimpl(this.channelId);
        return "Summary(id=" + str + ", topic=" + str2 + ", summShort=" + str3 + ", people=" + list + ", startId=" + str4 + ", endId=" + str5 + ", count=" + i10 + ", channelId=" + str6 + ")";
    }

    private Summary(String str, String str2, String str3, List<UserId> list, String str4, String str5, int i10, long j10) {
        this.f7628id = str;
        this.topic = str2;
        this.summShort = str3;
        this.people = list;
        this.startId = str4;
        this.endId = str5;
        this.count = i10;
        this.channelId = j10;
    }
}
