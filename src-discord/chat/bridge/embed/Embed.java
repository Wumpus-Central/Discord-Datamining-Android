package com.discord.chat.bridge.embed;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.spoiler.SpoilerableData;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import org.webrtc.MediaStreamTrack;
import zi.f;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bO\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u008a\u00012\u00020\u0001:\u0004\u0089\u0001\u008a\u0001BÏ\u0002\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010.\u001a\u0004\u0018\u00010/¢\u0006\u0002\u00100B×\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010*\u001a\u00020\u0003\u0012\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u00101J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0011\u0010b\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010?J\u000b\u0010i\u001a\u0004\u0018\u00010!HÆ\u0003J\t\u0010j\u001a\u00020\u0007HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010&HÆ\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00107J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010t\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010x\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jä\u0002\u0010{\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010*\u001a\u00020\u00032\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010|J\u0013\u0010}\u001a\u00020\u001f2\b\u0010~\u001a\u0004\u0018\u00010\u007fHÖ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0081\u0001\u001a\u00020\u0005HÖ\u0001J(\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u00002\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001HÇ\u0001R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0015\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0011\u0010*\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0015\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\b;\u00107R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0015\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bG\u00107R\u0013\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u00103R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u00103R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bL\u0010DR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u00103R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bN\u00103R\u0013\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u00103R\u0016\u0010-\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00103R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0015\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bS\u00107R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bT\u00103R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u00103R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bV\u00103R\u0016\u0010,\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u00103R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010=R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b]\u00103R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b^\u0010K¨\u0006\u008b\u0001"}, d2 = {"Lcom/discord/chat/bridge/embed/Embed;", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "seen1", "", "id", "", "type", "Lcom/discord/chat/bridge/embed/EmbedType;", "author", "Lcom/discord/chat/bridge/embed/EmbedAuthor;", "provider", "Lcom/discord/chat/bridge/embed/EmbedProvider;", "rawTitle", "title", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "fields", "", "Lcom/discord/chat/bridge/embed/EmbedField;", "url", "rawDescription", "description", "image", "Lcom/discord/chat/bridge/embed/EmbedMedia;", "images", MediaStreamTrack.VIDEO_TRACK_KIND, "thumbnail", "Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "numAttachments", "attachmentsSize", "messageSendError", "disableBackgroundColor", "", "footer", "Lcom/discord/chat/bridge/embed/EmbedFooter;", "spoiler", "obscure", "iconURL", "failureState", "Lcom/discord/chat/bridge/embed/EmbedFailureState;", "providerColor", ViewProps.BORDER_LEFT_COLOR, "headerTextColor", "bodyTextColor", ViewProps.BACKGROUND_COLOR, "spoilerOrNull", "obscureOrNull", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;)V", "getAttachmentsSize", "()Ljava/lang/String;", "getAuthor", "()Lcom/discord/chat/bridge/embed/EmbedAuthor;", "getBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBodyTextColor", "()I", "getBorderLeftColor", "getDescription", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getDisableBackgroundColor", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFailureState", "()Lcom/discord/chat/bridge/embed/EmbedFailureState;", "getFields", "()Ljava/util/List;", "getFooter", "()Lcom/discord/chat/bridge/embed/EmbedFooter;", "getHeaderTextColor", "getIconURL", "getId", "getImage", "()Lcom/discord/chat/bridge/embed/EmbedMedia;", "getImages", "getMessageSendError", "getNumAttachments", "getObscure", "getObscureOrNull", "getProvider", "()Lcom/discord/chat/bridge/embed/EmbedProvider;", "getProviderColor", "getRawDescription", "getRawTitle", "getSpoiler", "getSpoilerOrNull", "getThumbnail", "()Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "getTitle", "getType", "()Lcom/discord/chat/bridge/embed/EmbedType;", "getUrl", "getVideo", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;)Lcom/discord/chat/bridge/embed/Embed;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f

public final class Embed implements SpoilerableData {
    public static final Companion Companion = new Companion(null);
    private final String attachmentsSize;
    private final EmbedAuthor author;
    private final Integer backgroundColor;
    private final int bodyTextColor;
    private final Integer borderLeftColor;
    private final StructurableText description;
    private final Boolean disableBackgroundColor;
    private final EmbedFailureState failureState;
    private final List<EmbedField> fields;
    private final EmbedFooter footer;
    private final Integer headerTextColor;
    private final String iconURL;

    
    private final String f6929id;
    private final EmbedMedia image;
    private final List<EmbedMedia> images;
    private final String messageSendError;
    private final String numAttachments;
    private final String obscure;
    private final String obscureOrNull;
    private final EmbedProvider provider;
    private final Integer providerColor;
    private final String rawDescription;
    private final String rawTitle;
    private final String spoiler;
    private final String spoilerOrNull;
    private final EmbedThumbnail thumbnail;
    private final StructurableText title;
    private final EmbedType type;
    private final String url;
    private final EmbedMedia video;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/embed/Embed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/embed/Embed;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Embed> serializer() {
            return Embed$$serializer.INSTANCE;
        }
    }

    
    
    public  Embed(int r6, java.lang.String r7, com.discord.chat.bridge.embed.EmbedType r8, com.discord.chat.bridge.embed.EmbedAuthor r9, com.discord.chat.bridge.embed.EmbedProvider r10, java.lang.String r11, com.discord.chat.bridge.structurabletext.StructurableText r12, java.util.List r13, java.lang.String r14, java.lang.String r15, com.discord.chat.bridge.structurabletext.StructurableText r16, com.discord.chat.bridge.embed.EmbedMedia r17, java.util.List r18, com.discord.chat.bridge.embed.EmbedMedia r19, com.discord.chat.bridge.embed.EmbedThumbnail r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.Boolean r24, com.discord.chat.bridge.embed.EmbedFooter r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, com.discord.chat.bridge.embed.EmbedFailureState r29, java.lang.Integer r30, java.lang.Integer r31, java.lang.Integer r32, int r33, java.lang.Integer r34, java.lang.String r35, java.lang.String r36, kotlinx.serialization.internal.SerializationConstructorMarker r37) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.embed.Embed.<init>(int, java.lang.String, com.discord.chat.bridge.embed.EmbedType, com.discord.chat.bridge.embed.EmbedAuthor, com.discord.chat.bridge.embed.EmbedProvider, java.lang.String, com.discord.chat.bridge.structurabletext.StructurableText, java.util.List, java.lang.String, java.lang.String, com.discord.chat.bridge.structurabletext.StructurableText, com.discord.chat.bridge.embed.EmbedMedia, java.util.List, com.discord.chat.bridge.embed.EmbedMedia, com.discord.chat.bridge.embed.EmbedThumbnail, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.discord.chat.bridge.embed.EmbedFooter, java.lang.String, java.lang.String, java.lang.String, com.discord.chat.bridge.embed.EmbedFailureState, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, java.lang.Integer, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void");
    }

    
    
    
    
    
    
    
    public static final void write$Self(com.discord.chat.bridge.embed.Embed r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.embed.Embed.write$Self(com.discord.chat.bridge.embed.Embed, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String component1() {
        return this.f6929id;
    }

    public final StructurableText component10() {
        return this.description;
    }

    public final EmbedMedia component11() {
        return this.image;
    }

    public final List<EmbedMedia> component12() {
        return this.images;
    }

    public final EmbedMedia component13() {
        return this.video;
    }

    public final EmbedThumbnail component14() {
        return this.thumbnail;
    }

    public final String component15() {
        return this.numAttachments;
    }

    public final String component16() {
        return this.attachmentsSize;
    }

    public final String component17() {
        return this.messageSendError;
    }

    public final Boolean component18() {
        return this.disableBackgroundColor;
    }

    public final EmbedFooter component19() {
        return this.footer;
    }

    public final EmbedType component2() {
        return this.type;
    }

    public final String component20() {
        return this.spoiler;
    }

    public final String component21() {
        return this.obscure;
    }

    public final String component22() {
        return this.iconURL;
    }

    public final EmbedFailureState component23() {
        return this.failureState;
    }

    public final Integer component24() {
        return this.providerColor;
    }

    public final Integer component25() {
        return this.borderLeftColor;
    }

    public final Integer component26() {
        return this.headerTextColor;
    }

    public final int component27() {
        return this.bodyTextColor;
    }

    public final Integer component28() {
        return this.backgroundColor;
    }

    public final EmbedAuthor component3() {
        return this.author;
    }

    public final EmbedProvider component4() {
        return this.provider;
    }

    public final String component5() {
        return this.rawTitle;
    }

    public final StructurableText component6() {
        return this.title;
    }

    public final List<EmbedField> component7() {
        return this.fields;
    }

    public final String component8() {
        return this.url;
    }

    public final String component9() {
        return this.rawDescription;
    }

    public final Embed copy(String id2, EmbedType type, EmbedAuthor embedAuthor, EmbedProvider embedProvider, String str, StructurableText structurableText, List<EmbedField> list, String str2, String str3, StructurableText structurableText2, EmbedMedia embedMedia, List<EmbedMedia> list2, EmbedMedia embedMedia2, EmbedThumbnail embedThumbnail, String str4, String str5, String str6, Boolean bool, EmbedFooter embedFooter, String str7, String str8, String str9, EmbedFailureState embedFailureState, Integer num, Integer num2, Integer num3, int i10, Integer num4) {
        q.h(id2, "id");
        q.h(type, "type");
        return new Embed(id2, type, embedAuthor, embedProvider, str, structurableText, list, str2, str3, structurableText2, embedMedia, list2, embedMedia2, embedThumbnail, str4, str5, str6, bool, embedFooter, str7, str8, str9, embedFailureState, num, num2, num3, i10, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Embed)) {
            return false;
        }
        Embed embed = (Embed) obj;
        return q.c(this.f6929id, embed.f6929id) && this.type == embed.type && q.c(this.author, embed.author) && q.c(this.provider, embed.provider) && q.c(this.rawTitle, embed.rawTitle) && q.c(this.title, embed.title) && q.c(this.fields, embed.fields) && q.c(this.url, embed.url) && q.c(this.rawDescription, embed.rawDescription) && q.c(this.description, embed.description) && q.c(this.image, embed.image) && q.c(this.images, embed.images) && q.c(this.video, embed.video) && q.c(this.thumbnail, embed.thumbnail) && q.c(this.numAttachments, embed.numAttachments) && q.c(this.attachmentsSize, embed.attachmentsSize) && q.c(this.messageSendError, embed.messageSendError) && q.c(this.disableBackgroundColor, embed.disableBackgroundColor) && q.c(this.footer, embed.footer) && q.c(this.spoiler, embed.spoiler) && q.c(this.obscure, embed.obscure) && q.c(this.iconURL, embed.iconURL) && this.failureState == embed.failureState && q.c(this.providerColor, embed.providerColor) && q.c(this.borderLeftColor, embed.borderLeftColor) && q.c(this.headerTextColor, embed.headerTextColor) && this.bodyTextColor == embed.bodyTextColor && q.c(this.backgroundColor, embed.backgroundColor);
    }

    public final String getAttachmentsSize() {
        return this.attachmentsSize;
    }

    public final EmbedAuthor getAuthor() {
        return this.author;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBodyTextColor() {
        return this.bodyTextColor;
    }

    public final Integer getBorderLeftColor() {
        return this.borderLeftColor;
    }

    public final StructurableText getDescription() {
        return this.description;
    }

    public final Boolean getDisableBackgroundColor() {
        return this.disableBackgroundColor;
    }

    public final EmbedFailureState getFailureState() {
        return this.failureState;
    }

    public final List<EmbedField> getFields() {
        return this.fields;
    }

    public final EmbedFooter getFooter() {
        return this.footer;
    }

    public final Integer getHeaderTextColor() {
        return this.headerTextColor;
    }

    public final String getIconURL() {
        return this.iconURL;
    }

    public final String getId() {
        return this.f6929id;
    }

    public final EmbedMedia getImage() {
        return this.image;
    }

    public final List<EmbedMedia> getImages() {
        return this.images;
    }

    public final String getMessageSendError() {
        return this.messageSendError;
    }

    public final String getNumAttachments() {
        return this.numAttachments;
    }

    public final String getObscure() {
        return this.obscure;
    }

    @Override 
    public String getObscureOrNull() {
        return this.obscureOrNull;
    }

    public final EmbedProvider getProvider() {
        return this.provider;
    }

    public final Integer getProviderColor() {
        return this.providerColor;
    }

    public final String getRawDescription() {
        return this.rawDescription;
    }

    public final String getRawTitle() {
        return this.rawTitle;
    }

    public final String getSpoiler() {
        return this.spoiler;
    }

    @Override 
    public String getSpoilerOrNull() {
        return this.spoilerOrNull;
    }

    public final EmbedThumbnail getThumbnail() {
        return this.thumbnail;
    }

    public final StructurableText getTitle() {
        return this.title;
    }

    public final EmbedType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final EmbedMedia getVideo() {
        return this.video;
    }

    public int hashCode() {
        int hashCode = ((this.f6929id.hashCode() * 31) + this.type.hashCode()) * 31;
        EmbedAuthor embedAuthor = this.author;
        int i10 = 0;
        int hashCode2 = (hashCode + (embedAuthor == null ? 0 : embedAuthor.hashCode())) * 31;
        EmbedProvider embedProvider = this.provider;
        int hashCode3 = (hashCode2 + (embedProvider == null ? 0 : embedProvider.hashCode())) * 31;
        String str = this.rawTitle;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        StructurableText structurableText = this.title;
        int hashCode5 = (hashCode4 + (structurableText == null ? 0 : structurableText.hashCode())) * 31;
        List<EmbedField> list = this.fields;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.url;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rawDescription;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        StructurableText structurableText2 = this.description;
        int hashCode9 = (hashCode8 + (structurableText2 == null ? 0 : structurableText2.hashCode())) * 31;
        EmbedMedia embedMedia = this.image;
        int hashCode10 = (hashCode9 + (embedMedia == null ? 0 : embedMedia.hashCode())) * 31;
        List<EmbedMedia> list2 = this.images;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        EmbedMedia embedMedia2 = this.video;
        int hashCode12 = (hashCode11 + (embedMedia2 == null ? 0 : embedMedia2.hashCode())) * 31;
        EmbedThumbnail embedThumbnail = this.thumbnail;
        int hashCode13 = (hashCode12 + (embedThumbnail == null ? 0 : embedThumbnail.hashCode())) * 31;
        String str4 = this.numAttachments;
        int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.attachmentsSize;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.messageSendError;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.disableBackgroundColor;
        int hashCode17 = (hashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        EmbedFooter embedFooter = this.footer;
        int hashCode18 = (hashCode17 + (embedFooter == null ? 0 : embedFooter.hashCode())) * 31;
        String str7 = this.spoiler;
        int hashCode19 = (hashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.obscure;
        int hashCode20 = (hashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.iconURL;
        int hashCode21 = (hashCode20 + (str9 == null ? 0 : str9.hashCode())) * 31;
        EmbedFailureState embedFailureState = this.failureState;
        int hashCode22 = (hashCode21 + (embedFailureState == null ? 0 : embedFailureState.hashCode())) * 31;
        Integer num = this.providerColor;
        int hashCode23 = (hashCode22 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.borderLeftColor;
        int hashCode24 = (hashCode23 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.headerTextColor;
        int hashCode25 = (((hashCode24 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.bodyTextColor) * 31;
        Integer num4 = this.backgroundColor;
        if (num4 != null) {
            i10 = num4.hashCode();
        }
        return hashCode25 + i10;
    }

    public String toString() {
        String str = this.f6929id;
        EmbedType embedType = this.type;
        EmbedAuthor embedAuthor = this.author;
        EmbedProvider embedProvider = this.provider;
        String str2 = this.rawTitle;
        StructurableText structurableText = this.title;
        List<EmbedField> list = this.fields;
        String str3 = this.url;
        String str4 = this.rawDescription;
        StructurableText structurableText2 = this.description;
        EmbedMedia embedMedia = this.image;
        List<EmbedMedia> list2 = this.images;
        EmbedMedia embedMedia2 = this.video;
        EmbedThumbnail embedThumbnail = this.thumbnail;
        String str5 = this.numAttachments;
        String str6 = this.attachmentsSize;
        String str7 = this.messageSendError;
        Boolean bool = this.disableBackgroundColor;
        EmbedFooter embedFooter = this.footer;
        String str8 = this.spoiler;
        String str9 = this.obscure;
        String str10 = this.iconURL;
        EmbedFailureState embedFailureState = this.failureState;
        Integer num = this.providerColor;
        Integer num2 = this.borderLeftColor;
        Integer num3 = this.headerTextColor;
        int i10 = this.bodyTextColor;
        Integer num4 = this.backgroundColor;
        return "Embed(id=" + str + ", type=" + embedType + ", author=" + embedAuthor + ", provider=" + embedProvider + ", rawTitle=" + str2 + ", title=" + structurableText + ", fields=" + list + ", url=" + str3 + ", rawDescription=" + str4 + ", description=" + structurableText2 + ", image=" + embedMedia + ", images=" + list2 + ", video=" + embedMedia2 + ", thumbnail=" + embedThumbnail + ", numAttachments=" + str5 + ", attachmentsSize=" + str6 + ", messageSendError=" + str7 + ", disableBackgroundColor=" + bool + ", footer=" + embedFooter + ", spoiler=" + str8 + ", obscure=" + str9 + ", iconURL=" + str10 + ", failureState=" + embedFailureState + ", providerColor=" + num + ", borderLeftColor=" + num2 + ", headerTextColor=" + num3 + ", bodyTextColor=" + i10 + ", backgroundColor=" + num4 + ")";
    }

    
    
    public Embed(java.lang.String r7, com.discord.chat.bridge.embed.EmbedType r8, com.discord.chat.bridge.embed.EmbedAuthor r9, com.discord.chat.bridge.embed.EmbedProvider r10, java.lang.String r11, com.discord.chat.bridge.structurabletext.StructurableText r12, java.util.List<com.discord.chat.bridge.embed.EmbedField> r13, java.lang.String r14, java.lang.String r15, com.discord.chat.bridge.structurabletext.StructurableText r16, com.discord.chat.bridge.embed.EmbedMedia r17, java.util.List<com.discord.chat.bridge.embed.EmbedMedia> r18, com.discord.chat.bridge.embed.EmbedMedia r19, com.discord.chat.bridge.embed.EmbedThumbnail r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.Boolean r24, com.discord.chat.bridge.embed.EmbedFooter r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, com.discord.chat.bridge.embed.EmbedFailureState r29, java.lang.Integer r30, java.lang.Integer r31, java.lang.Integer r32, int r33, java.lang.Integer r34) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.embed.Embed.<init>(java.lang.String, com.discord.chat.bridge.embed.EmbedType, com.discord.chat.bridge.embed.EmbedAuthor, com.discord.chat.bridge.embed.EmbedProvider, java.lang.String, com.discord.chat.bridge.structurabletext.StructurableText, java.util.List, java.lang.String, java.lang.String, com.discord.chat.bridge.structurabletext.StructurableText, com.discord.chat.bridge.embed.EmbedMedia, java.util.List, com.discord.chat.bridge.embed.EmbedMedia, com.discord.chat.bridge.embed.EmbedThumbnail, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.discord.chat.bridge.embed.EmbedFooter, java.lang.String, java.lang.String, java.lang.String, com.discord.chat.bridge.embed.EmbedFailureState, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, java.lang.Integer):void");
    }

    public  Embed(String str, EmbedType embedType, EmbedAuthor embedAuthor, EmbedProvider embedProvider, String str2, StructurableText structurableText, List list, String str3, String str4, StructurableText structurableText2, EmbedMedia embedMedia, List list2, EmbedMedia embedMedia2, EmbedThumbnail embedThumbnail, String str5, String str6, String str7, Boolean bool, EmbedFooter embedFooter, String str8, String str9, String str10, EmbedFailureState embedFailureState, Integer num, Integer num2, Integer num3, int i10, Integer num4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, embedType, (i11 & 4) != 0 ? null : embedAuthor, (i11 & 8) != 0 ? null : embedProvider, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : structurableText, (i11 & 64) != 0 ? null : list, (i11 & 128) != 0 ? null : str3, (i11 & 256) != 0 ? null : str4, (i11 & 512) != 0 ? null : structurableText2, (i11 & 1024) != 0 ? null : embedMedia, (i11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : list2, (i11 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : embedMedia2, (i11 & 8192) != 0 ? null : embedThumbnail, (i11 & 16384) != 0 ? null : str5, (32768 & i11) != 0 ? null : str6, (65536 & i11) != 0 ? null : str7, (131072 & i11) != 0 ? null : bool, (262144 & i11) != 0 ? null : embedFooter, (524288 & i11) != 0 ? null : str8, (1048576 & i11) != 0 ? null : str9, (2097152 & i11) != 0 ? null : str10, (4194304 & i11) != 0 ? null : embedFailureState, (8388608 & i11) != 0 ? null : num, (16777216 & i11) != 0 ? null : num2, (33554432 & i11) != 0 ? null : num3, i10, (i11 & 134217728) != 0 ? null : num4);
    }
}
