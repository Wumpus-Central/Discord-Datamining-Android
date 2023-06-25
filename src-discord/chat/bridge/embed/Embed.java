package com.discord.chat.bridge.embed;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.spoiler.SpoilerableData;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import ki.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.webrtc.MediaStreamTrack;
import qi.f;
import ti.n1;

@f
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u007f2\u00020\u0001:\u0002~\u007fB§\u0002\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010*\u001a\u0004\u0018\u00010+¢\u0006\u0002\u0010,B·\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010(\u001a\u00020\u0003¢\u0006\u0002\u0010-J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0011\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000fHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010`\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010$HÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00105J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\rHÆ\u0003JÂ\u0002\u0010p\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010(\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010qJ\u0013\u0010r\u001a\u00020\u001e2\b\u0010s\u001a\u0004\u0018\u00010tHÖ\u0003J\t\u0010u\u001a\u00020\u0003HÖ\u0001J\t\u0010v\u001a\u00020\u000bHÖ\u0001J!\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020\u00002\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020}HÇ\u0001R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0015\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0015\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00106\u001a\u0004\bB\u00105R\u0013\u0010\"\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010/R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bF\u0010?R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bG\u0010/R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bH\u0010/R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0015\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00106\u001a\u0004\bK\u00105R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bL\u0010/R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bM\u0010/R\u0013\u0010!\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bN\u0010/R\u0016\u0010)\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010/R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bR\u00108R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bU\u0010/R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bV\u0010E¨\u0006\u0080\u0001"}, d2 = {"Lcom/discord/chat/bridge/embed/Embed;", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "seen1", "", "type", "Lcom/discord/chat/bridge/embed/EmbedType;", "author", "Lcom/discord/chat/bridge/embed/EmbedAuthor;", "provider", "Lcom/discord/chat/bridge/embed/EmbedProvider;", "rawTitle", "", "title", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "fields", "", "Lcom/discord/chat/bridge/embed/EmbedField;", "url", "rawDescription", "description", "image", "Lcom/discord/chat/bridge/embed/EmbedMedia;", "images", MediaStreamTrack.VIDEO_TRACK_KIND, "thumbnail", "Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "numAttachments", "attachmentsSize", "messageSendError", "disableBackgroundColor", "", "footer", "Lcom/discord/chat/bridge/embed/EmbedFooter;", "spoiler", "iconURL", "failureState", "Lcom/discord/chat/bridge/embed/EmbedFailureState;", "providerColor", ViewProps.BORDER_LEFT_COLOR, "headerTextColor", "bodyTextColor", "spoilerOrNull", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "getAttachmentsSize", "()Ljava/lang/String;", "getAuthor", "()Lcom/discord/chat/bridge/embed/EmbedAuthor;", "getBodyTextColor", "()I", "getBorderLeftColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescription", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getDisableBackgroundColor", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFailureState", "()Lcom/discord/chat/bridge/embed/EmbedFailureState;", "getFields", "()Ljava/util/List;", "getFooter", "()Lcom/discord/chat/bridge/embed/EmbedFooter;", "getHeaderTextColor", "getIconURL", "getImage", "()Lcom/discord/chat/bridge/embed/EmbedMedia;", "getImages", "getMessageSendError", "getNumAttachments", "getProvider", "()Lcom/discord/chat/bridge/embed/EmbedProvider;", "getProviderColor", "getRawDescription", "getRawTitle", "getSpoiler", "getSpoilerOrNull", "getThumbnail", "()Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "getTitle", "getType", "()Lcom/discord/chat/bridge/embed/EmbedType;", "getUrl", "getVideo", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;I)Lcom/discord/chat/bridge/embed/Embed;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Embed implements SpoilerableData {
    public static final Companion Companion = new Companion(null);
    private final String attachmentsSize;
    private final EmbedAuthor author;
    private final int bodyTextColor;
    private final Integer borderLeftColor;
    private final StructurableText description;
    private final Boolean disableBackgroundColor;
    private final EmbedFailureState failureState;
    private final List<EmbedField> fields;
    private final EmbedFooter footer;
    private final Integer headerTextColor;
    private final String iconURL;
    private final EmbedMedia image;
    private final List<EmbedMedia> images;
    private final String messageSendError;
    private final String numAttachments;
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
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Embed> serializer() {
            return Embed$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Embed(int i10, EmbedType embedType, EmbedAuthor embedAuthor, EmbedProvider embedProvider, String str, StructurableText structurableText, List list, String str2, String str3, StructurableText structurableText2, EmbedMedia embedMedia, List list2, EmbedMedia embedMedia2, EmbedThumbnail embedThumbnail, String str4, String str5, String str6, Boolean bool, EmbedFooter embedFooter, String str7, String str8, EmbedFailureState embedFailureState, Integer num, Integer num2, Integer num3, int i11, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        boolean w10;
        if (16777217 != (i10 & 16777217)) {
            n1.b(i10, 16777217, Embed$$serializer.INSTANCE.getDescriptor());
        }
        this.type = embedType;
        String str10 = null;
        if ((i10 & 2) == 0) {
            this.author = null;
        } else {
            this.author = embedAuthor;
        }
        if ((i10 & 4) == 0) {
            this.provider = null;
        } else {
            this.provider = embedProvider;
        }
        if ((i10 & 8) == 0) {
            this.rawTitle = null;
        } else {
            this.rawTitle = str;
        }
        if ((i10 & 16) == 0) {
            this.title = null;
        } else {
            this.title = structurableText;
        }
        if ((i10 & 32) == 0) {
            this.fields = null;
        } else {
            this.fields = list;
        }
        if ((i10 & 64) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
        if ((i10 & 128) == 0) {
            this.rawDescription = null;
        } else {
            this.rawDescription = str3;
        }
        if ((i10 & 256) == 0) {
            this.description = null;
        } else {
            this.description = structurableText2;
        }
        if ((i10 & 512) == 0) {
            this.image = null;
        } else {
            this.image = embedMedia;
        }
        if ((i10 & 1024) == 0) {
            this.images = null;
        } else {
            this.images = list2;
        }
        if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.video = null;
        } else {
            this.video = embedMedia2;
        }
        if ((i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.thumbnail = null;
        } else {
            this.thumbnail = embedThumbnail;
        }
        if ((i10 & 8192) == 0) {
            this.numAttachments = null;
        } else {
            this.numAttachments = str4;
        }
        if ((i10 & 16384) == 0) {
            this.attachmentsSize = null;
        } else {
            this.attachmentsSize = str5;
        }
        if ((32768 & i10) == 0) {
            this.messageSendError = null;
        } else {
            this.messageSendError = str6;
        }
        if ((65536 & i10) == 0) {
            this.disableBackgroundColor = null;
        } else {
            this.disableBackgroundColor = bool;
        }
        if ((131072 & i10) == 0) {
            this.footer = null;
        } else {
            this.footer = embedFooter;
        }
        if ((262144 & i10) == 0) {
            this.spoiler = null;
        } else {
            this.spoiler = str7;
        }
        if ((524288 & i10) == 0) {
            this.iconURL = null;
        } else {
            this.iconURL = str8;
        }
        if ((1048576 & i10) == 0) {
            this.failureState = null;
        } else {
            this.failureState = embedFailureState;
        }
        if ((2097152 & i10) == 0) {
            this.providerColor = null;
        } else {
            this.providerColor = num;
        }
        if ((4194304 & i10) == 0) {
            this.borderLeftColor = null;
        } else {
            this.borderLeftColor = num2;
        }
        if ((8388608 & i10) == 0) {
            this.headerTextColor = null;
        } else {
            this.headerTextColor = num3;
        }
        this.bodyTextColor = i11;
        if ((i10 & 33554432) == 0) {
            String str11 = this.spoiler;
            if (str11 != null) {
                w10 = u.w(str11);
                if (!w10) {
                    str10 = str11;
                }
            }
            this.spoilerOrNull = str10;
            return;
        }
        this.spoilerOrNull = str9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x027f, code lost:
        if ((!r4) != false) goto L_0x0283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0287, code lost:
        if (kotlin.jvm.internal.q.b(r1, r3) == false) goto L_0x0270;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.discord.chat.bridge.embed.Embed r5, kotlinx.serialization.encoding.CompositeEncoder r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.embed.Embed.write$Self(com.discord.chat.bridge.embed.Embed, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final EmbedType component1() {
        return this.type;
    }

    public final EmbedMedia component10() {
        return this.image;
    }

    public final List<EmbedMedia> component11() {
        return this.images;
    }

    public final EmbedMedia component12() {
        return this.video;
    }

    public final EmbedThumbnail component13() {
        return this.thumbnail;
    }

    public final String component14() {
        return this.numAttachments;
    }

    public final String component15() {
        return this.attachmentsSize;
    }

    public final String component16() {
        return this.messageSendError;
    }

    public final Boolean component17() {
        return this.disableBackgroundColor;
    }

    public final EmbedFooter component18() {
        return this.footer;
    }

    public final String component19() {
        return this.spoiler;
    }

    public final EmbedAuthor component2() {
        return this.author;
    }

    public final String component20() {
        return this.iconURL;
    }

    public final EmbedFailureState component21() {
        return this.failureState;
    }

    public final Integer component22() {
        return this.providerColor;
    }

    public final Integer component23() {
        return this.borderLeftColor;
    }

    public final Integer component24() {
        return this.headerTextColor;
    }

    public final int component25() {
        return this.bodyTextColor;
    }

    public final EmbedProvider component3() {
        return this.provider;
    }

    public final String component4() {
        return this.rawTitle;
    }

    public final StructurableText component5() {
        return this.title;
    }

    public final List<EmbedField> component6() {
        return this.fields;
    }

    public final String component7() {
        return this.url;
    }

    public final String component8() {
        return this.rawDescription;
    }

    public final StructurableText component9() {
        return this.description;
    }

    public final Embed copy(EmbedType type, EmbedAuthor embedAuthor, EmbedProvider embedProvider, String str, StructurableText structurableText, List<EmbedField> list, String str2, String str3, StructurableText structurableText2, EmbedMedia embedMedia, List<EmbedMedia> list2, EmbedMedia embedMedia2, EmbedThumbnail embedThumbnail, String str4, String str5, String str6, Boolean bool, EmbedFooter embedFooter, String str7, String str8, EmbedFailureState embedFailureState, Integer num, Integer num2, Integer num3, int i10) {
        q.g(type, "type");
        return new Embed(type, embedAuthor, embedProvider, str, structurableText, list, str2, str3, structurableText2, embedMedia, list2, embedMedia2, embedThumbnail, str4, str5, str6, bool, embedFooter, str7, str8, embedFailureState, num, num2, num3, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Embed)) {
            return false;
        }
        Embed embed = (Embed) obj;
        return this.type == embed.type && q.b(this.author, embed.author) && q.b(this.provider, embed.provider) && q.b(this.rawTitle, embed.rawTitle) && q.b(this.title, embed.title) && q.b(this.fields, embed.fields) && q.b(this.url, embed.url) && q.b(this.rawDescription, embed.rawDescription) && q.b(this.description, embed.description) && q.b(this.image, embed.image) && q.b(this.images, embed.images) && q.b(this.video, embed.video) && q.b(this.thumbnail, embed.thumbnail) && q.b(this.numAttachments, embed.numAttachments) && q.b(this.attachmentsSize, embed.attachmentsSize) && q.b(this.messageSendError, embed.messageSendError) && q.b(this.disableBackgroundColor, embed.disableBackgroundColor) && q.b(this.footer, embed.footer) && q.b(this.spoiler, embed.spoiler) && q.b(this.iconURL, embed.iconURL) && this.failureState == embed.failureState && q.b(this.providerColor, embed.providerColor) && q.b(this.borderLeftColor, embed.borderLeftColor) && q.b(this.headerTextColor, embed.headerTextColor) && this.bodyTextColor == embed.bodyTextColor;
    }

    public final String getAttachmentsSize() {
        return this.attachmentsSize;
    }

    public final EmbedAuthor getAuthor() {
        return this.author;
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

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
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
        int hashCode = this.type.hashCode() * 31;
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
        String str8 = this.iconURL;
        int hashCode20 = (hashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        EmbedFailureState embedFailureState = this.failureState;
        int hashCode21 = (hashCode20 + (embedFailureState == null ? 0 : embedFailureState.hashCode())) * 31;
        Integer num = this.providerColor;
        int hashCode22 = (hashCode21 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.borderLeftColor;
        int hashCode23 = (hashCode22 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.headerTextColor;
        if (num3 != null) {
            i10 = num3.hashCode();
        }
        return ((hashCode23 + i10) * 31) + this.bodyTextColor;
    }

    public String toString() {
        EmbedType embedType = this.type;
        EmbedAuthor embedAuthor = this.author;
        EmbedProvider embedProvider = this.provider;
        String str = this.rawTitle;
        StructurableText structurableText = this.title;
        List<EmbedField> list = this.fields;
        String str2 = this.url;
        String str3 = this.rawDescription;
        StructurableText structurableText2 = this.description;
        EmbedMedia embedMedia = this.image;
        List<EmbedMedia> list2 = this.images;
        EmbedMedia embedMedia2 = this.video;
        EmbedThumbnail embedThumbnail = this.thumbnail;
        String str4 = this.numAttachments;
        String str5 = this.attachmentsSize;
        String str6 = this.messageSendError;
        Boolean bool = this.disableBackgroundColor;
        EmbedFooter embedFooter = this.footer;
        String str7 = this.spoiler;
        String str8 = this.iconURL;
        EmbedFailureState embedFailureState = this.failureState;
        Integer num = this.providerColor;
        Integer num2 = this.borderLeftColor;
        Integer num3 = this.headerTextColor;
        int i10 = this.bodyTextColor;
        return "Embed(type=" + embedType + ", author=" + embedAuthor + ", provider=" + embedProvider + ", rawTitle=" + str + ", title=" + structurableText + ", fields=" + list + ", url=" + str2 + ", rawDescription=" + str3 + ", description=" + structurableText2 + ", image=" + embedMedia + ", images=" + list2 + ", video=" + embedMedia2 + ", thumbnail=" + embedThumbnail + ", numAttachments=" + str4 + ", attachmentsSize=" + str5 + ", messageSendError=" + str6 + ", disableBackgroundColor=" + bool + ", footer=" + embedFooter + ", spoiler=" + str7 + ", iconURL=" + str8 + ", failureState=" + embedFailureState + ", providerColor=" + num + ", borderLeftColor=" + num2 + ", headerTextColor=" + num3 + ", bodyTextColor=" + i10 + ")";
    }

    public Embed(EmbedType type, EmbedAuthor embedAuthor, EmbedProvider embedProvider, String str, StructurableText structurableText, List<EmbedField> list, String str2, String str3, StructurableText structurableText2, EmbedMedia embedMedia, List<EmbedMedia> list2, EmbedMedia embedMedia2, EmbedThumbnail embedThumbnail, String str4, String str5, String str6, Boolean bool, EmbedFooter embedFooter, String str7, String str8, EmbedFailureState embedFailureState, Integer num, Integer num2, Integer num3, int i10) {
        boolean w10;
        q.g(type, "type");
        this.type = type;
        this.author = embedAuthor;
        this.provider = embedProvider;
        this.rawTitle = str;
        this.title = structurableText;
        this.fields = list;
        this.url = str2;
        this.rawDescription = str3;
        this.description = structurableText2;
        this.image = embedMedia;
        this.images = list2;
        this.video = embedMedia2;
        this.thumbnail = embedThumbnail;
        this.numAttachments = str4;
        this.attachmentsSize = str5;
        this.messageSendError = str6;
        this.disableBackgroundColor = bool;
        this.footer = embedFooter;
        this.spoiler = str7;
        this.iconURL = str8;
        this.failureState = embedFailureState;
        this.providerColor = num;
        this.borderLeftColor = num2;
        this.headerTextColor = num3;
        this.bodyTextColor = i10;
        String str9 = null;
        if (str7 != null) {
            w10 = u.w(str7);
            if (!w10) {
                str9 = str7;
            }
        }
        this.spoilerOrNull = str9;
    }

    public /* synthetic */ Embed(EmbedType embedType, EmbedAuthor embedAuthor, EmbedProvider embedProvider, String str, StructurableText structurableText, List list, String str2, String str3, StructurableText structurableText2, EmbedMedia embedMedia, List list2, EmbedMedia embedMedia2, EmbedThumbnail embedThumbnail, String str4, String str5, String str6, Boolean bool, EmbedFooter embedFooter, String str7, String str8, EmbedFailureState embedFailureState, Integer num, Integer num2, Integer num3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(embedType, (i11 & 2) != 0 ? null : embedAuthor, (i11 & 4) != 0 ? null : embedProvider, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : structurableText, (i11 & 32) != 0 ? null : list, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? null : str3, (i11 & 256) != 0 ? null : structurableText2, (i11 & 512) != 0 ? null : embedMedia, (i11 & 1024) != 0 ? null : list2, (i11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : embedMedia2, (i11 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : embedThumbnail, (i11 & 8192) != 0 ? null : str4, (i11 & 16384) != 0 ? null : str5, (32768 & i11) != 0 ? null : str6, (65536 & i11) != 0 ? null : bool, (131072 & i11) != 0 ? null : embedFooter, (262144 & i11) != 0 ? null : str7, (524288 & i11) != 0 ? null : str8, (1048576 & i11) != 0 ? null : embedFailureState, (2097152 & i11) != 0 ? null : num, (4194304 & i11) != 0 ? null : num2, (i11 & 8388608) != 0 ? null : num3, i10);
    }
}
