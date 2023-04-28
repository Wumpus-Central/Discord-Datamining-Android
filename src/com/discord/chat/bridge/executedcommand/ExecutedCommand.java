package com.discord.chat.bridge.executedcommand;

import bj.C3622a2;
import bj.C3681n1;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.AbstractC14435f;

@AbstractC14435f
@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BB\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\rB,\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u0018\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0014J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J@\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\bHÖ\u0001J!\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÇ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, m15073d2 = {"Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;", "", "seen1", "", "userId", "Lcom/discord/primitives/UserId;", "usernameColor", "avatarURL", "", "content", "Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/UserId;ILjava/lang/String;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JILjava/lang/String;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAvatarURL", "()Ljava/lang/String;", "getContent", "()Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;", "getUserId-re6GcUE", "()J", "J", "getUsernameColor", "()I", "component1", "component1-re6GcUE", "component2", "component3", "component4", "copy", "copy-ASSxI_0", "(JILjava/lang/String;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;)Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ExecutedCommand {
    public static final Companion Companion = new Companion(null);
    private final String avatarURL;
    private final AnnotatedStructurableText content;
    private final long userId;
    private final int usernameColor;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/executedcommand/ExecutedCommand$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExecutedCommand> serializer() {
            return ExecutedCommand$$serializer.INSTANCE;
        }
    }

    private ExecutedCommand(int i, UserId userId, int i2, String str, AnnotatedStructurableText annotatedStructurableText, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i & 11)) {
            C3681n1.m33818b(i, 11, ExecutedCommand$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = userId.m42162unboximpl();
        this.usernameColor = i2;
        if ((i & 4) == 0) {
            this.avatarURL = null;
        } else {
            this.avatarURL = str;
        }
        this.content = annotatedStructurableText;
    }

    public /* synthetic */ ExecutedCommand(int i, UserId userId, int i2, String str, AnnotatedStructurableText annotatedStructurableText, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, userId, i2, str, annotatedStructurableText, serializationConstructorMarker);
    }

    public /* synthetic */ ExecutedCommand(long j, int i, String str, AnnotatedStructurableText annotatedStructurableText, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, str, annotatedStructurableText);
    }

    /* renamed from: copy-ASSxI_0$default  reason: not valid java name */
    public static /* synthetic */ ExecutedCommand m41665copyASSxI_0$default(ExecutedCommand executedCommand, long j, int i, String str, AnnotatedStructurableText annotatedStructurableText, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = executedCommand.userId;
        }
        if ((i2 & 2) != 0) {
            i = executedCommand.usernameColor;
        }
        if ((i2 & 4) != 0) {
            str = executedCommand.avatarURL;
        }
        if ((i2 & 8) != 0) {
            annotatedStructurableText = executedCommand.content;
        }
        return executedCommand.m41667copyASSxI_0(j, i, str, annotatedStructurableText);
    }

    public static final void write$Self(ExecutedCommand self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        boolean z = false;
        output.mo13870t(serialDesc, 0, UserId$$serializer.INSTANCE, UserId.m42153boximpl(self.userId));
        output.mo13866x(serialDesc, 1, self.usernameColor);
        if (output.mo13893A(serialDesc, 2) || self.avatarURL != null) {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 2, C3622a2.f5917a, self.avatarURL);
        }
        output.mo13870t(serialDesc, 3, AnnotatedStructurableTextSerializer.INSTANCE, self.content);
    }

    /* renamed from: component1-re6GcUE  reason: not valid java name */
    public final long m41666component1re6GcUE() {
        return this.userId;
    }

    public final int component2() {
        return this.usernameColor;
    }

    public final String component3() {
        return this.avatarURL;
    }

    public final AnnotatedStructurableText component4() {
        return this.content;
    }

    /* renamed from: copy-ASSxI_0  reason: not valid java name */
    public final ExecutedCommand m41667copyASSxI_0(long j, int i, String str, AnnotatedStructurableText content) {
        C9971q.m14633g(content, "content");
        return new ExecutedCommand(j, i, str, content, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExecutedCommand)) {
            return false;
        }
        ExecutedCommand executedCommand = (ExecutedCommand) obj;
        return UserId.m42157equalsimpl0(this.userId, executedCommand.userId) && this.usernameColor == executedCommand.usernameColor && C9971q.m14638b(this.avatarURL, executedCommand.avatarURL) && C9971q.m14638b(this.content, executedCommand.content);
    }

    public final String getAvatarURL() {
        return this.avatarURL;
    }

    public final AnnotatedStructurableText getContent() {
        return this.content;
    }

    /* renamed from: getUserId-re6GcUE  reason: not valid java name */
    public final long m41668getUserIdre6GcUE() {
        return this.userId;
    }

    public final int getUsernameColor() {
        return this.usernameColor;
    }

    public int hashCode() {
        int i = ((UserId.m42158hashCodeimpl(this.userId) * 31) + this.usernameColor) * 31;
        String str = this.avatarURL;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.content.hashCode();
    }

    public String toString() {
        String str = UserId.m42160toStringimpl(this.userId);
        int i = this.usernameColor;
        String str2 = this.avatarURL;
        AnnotatedStructurableText annotatedStructurableText = this.content;
        return "ExecutedCommand(userId=" + str + ", usernameColor=" + i + ", avatarURL=" + str2 + ", content=" + annotatedStructurableText + ")";
    }

    private ExecutedCommand(long j, int i, String str, AnnotatedStructurableText annotatedStructurableText) {
        this.userId = j;
        this.usernameColor = i;
        this.avatarURL = str;
        this.content = annotatedStructurableText;
    }

    public /* synthetic */ ExecutedCommand(long j, int i, String str, AnnotatedStructurableText annotatedStructurableText, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, (i2 & 4) != 0 ? null : str, annotatedStructurableText, null);
    }
}
