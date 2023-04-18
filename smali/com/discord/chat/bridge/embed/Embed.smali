.class public final Lcom/discord/chat/bridge/embed/Embed;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/chat/bridge/spoiler/SpoilerableData;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/embed/Embed$$serializer;,
        Lcom/discord/chat/bridge/embed/Embed$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008H\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 \u007f2\u00020\u0001:\u0002~\u007fB\u00a7\u0002\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u0008\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010#\u001a\u0004\u0018\u00010$\u0012\u0008\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\'\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0008\u0010)\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010*\u001a\u0004\u0018\u00010+\u00a2\u0006\u0002\u0010,B\u00b7\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0010\u0008\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0010\u0008\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\u0008\u0003\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\'\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0001\u0010(\u001a\u00020\u0003\u00a2\u0006\u0002\u0010-J\t\u0010W\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u0011\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u000b\u0010`\u001a\u0004\u0018\u00010 H\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010$H\u00c6\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010g\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\t\u0010h\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0011\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u00c2\u0002\u0010p\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0010\u0008\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0010\u0008\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\u0008\u0003\u0010%\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010&\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\'\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0003\u0010(\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010qJ\u0013\u0010r\u001a\u00020\u001e2\u0008\u0010s\u001a\u0004\u0018\u00010tH\u00d6\u0003J\t\u0010u\u001a\u00020\u0003H\u00d6\u0001J\t\u0010v\u001a\u00020\u000bH\u00d6\u0001J!\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020\u00002\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020}H\u00c7\u0001R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010/R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101R\u0011\u0010(\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00103R\u0015\u0010&\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u00084\u00105R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u00108R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\u00089\u0010:R\u0013\u0010#\u001a\u0004\u0018\u00010$\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010=R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010?R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 \u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010AR\u0015\u0010\'\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u0008B\u00105R\u0013\u0010\"\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010/R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u0010ER\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010?R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010/R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008H\u0010/R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u0010JR\u0015\u0010%\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u0008K\u00105R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008L\u0010/R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u0010/R\u0013\u0010!\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010/R\u0016\u0010)\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008O\u0010/R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008P\u0010QR\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008R\u00108R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008S\u0010TR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008U\u0010/R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008V\u0010E\u00a8\u0006\u0080\u0001"
    }
    d2 = {
        "Lcom/discord/chat/bridge/embed/Embed;",
        "Lcom/discord/chat/bridge/spoiler/SpoilerableData;",
        "seen1",
        "",
        "type",
        "Lcom/discord/chat/bridge/embed/EmbedType;",
        "author",
        "Lcom/discord/chat/bridge/embed/EmbedAuthor;",
        "provider",
        "Lcom/discord/chat/bridge/embed/EmbedProvider;",
        "rawTitle",
        "",
        "title",
        "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
        "fields",
        "",
        "Lcom/discord/chat/bridge/embed/EmbedField;",
        "url",
        "rawDescription",
        "description",
        "image",
        "Lcom/discord/chat/bridge/embed/EmbedMedia;",
        "images",
        "video",
        "thumbnail",
        "Lcom/discord/chat/bridge/embed/EmbedThumbnail;",
        "numAttachments",
        "attachmentsSize",
        "messageSendError",
        "disableBackgroundColor",
        "",
        "footer",
        "Lcom/discord/chat/bridge/embed/EmbedFooter;",
        "spoiler",
        "iconURL",
        "failureState",
        "Lcom/discord/chat/bridge/embed/EmbedFailureState;",
        "providerColor",
        "borderLeftColor",
        "headerTextColor",
        "bodyTextColor",
        "spoilerOrNull",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(Lcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;I)V",
        "getAttachmentsSize",
        "()Ljava/lang/String;",
        "getAuthor",
        "()Lcom/discord/chat/bridge/embed/EmbedAuthor;",
        "getBodyTextColor",
        "()I",
        "getBorderLeftColor",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getDescription",
        "()Lcom/discord/chat/bridge/structurabletext/StructurableText;",
        "getDisableBackgroundColor",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getFailureState",
        "()Lcom/discord/chat/bridge/embed/EmbedFailureState;",
        "getFields",
        "()Ljava/util/List;",
        "getFooter",
        "()Lcom/discord/chat/bridge/embed/EmbedFooter;",
        "getHeaderTextColor",
        "getIconURL",
        "getImage",
        "()Lcom/discord/chat/bridge/embed/EmbedMedia;",
        "getImages",
        "getMessageSendError",
        "getNumAttachments",
        "getProvider",
        "()Lcom/discord/chat/bridge/embed/EmbedProvider;",
        "getProviderColor",
        "getRawDescription",
        "getRawTitle",
        "getSpoiler",
        "getSpoilerOrNull",
        "getThumbnail",
        "()Lcom/discord/chat/bridge/embed/EmbedThumbnail;",
        "getTitle",
        "getType",
        "()Lcom/discord/chat/bridge/embed/EmbedType;",
        "getUrl",
        "getVideo",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component2",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Lcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;I)Lcom/discord/chat/bridge/embed/Embed;",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "write$Self",
        "",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "$serializer",
        "Companion",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwi/f;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/bridge/embed/Embed$Companion;


# instance fields
.field private final attachmentsSize:Ljava/lang/String;

.field private final author:Lcom/discord/chat/bridge/embed/EmbedAuthor;

.field private final bodyTextColor:I

.field private final borderLeftColor:Ljava/lang/Integer;

.field private final description:Lcom/discord/chat/bridge/structurabletext/StructurableText;

.field private final disableBackgroundColor:Ljava/lang/Boolean;

.field private final failureState:Lcom/discord/chat/bridge/embed/EmbedFailureState;

.field private final fields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/embed/EmbedField;",
            ">;"
        }
    .end annotation
.end field

.field private final footer:Lcom/discord/chat/bridge/embed/EmbedFooter;

.field private final headerTextColor:Ljava/lang/Integer;

.field private final iconURL:Ljava/lang/String;

.field private final image:Lcom/discord/chat/bridge/embed/EmbedMedia;

.field private final images:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/embed/EmbedMedia;",
            ">;"
        }
    .end annotation
.end field

.field private final messageSendError:Ljava/lang/String;

.field private final numAttachments:Ljava/lang/String;

.field private final provider:Lcom/discord/chat/bridge/embed/EmbedProvider;

.field private final providerColor:Ljava/lang/Integer;

.field private final rawDescription:Ljava/lang/String;

.field private final rawTitle:Ljava/lang/String;

.field private final spoiler:Ljava/lang/String;

.field private final spoilerOrNull:Ljava/lang/String;

.field private final thumbnail:Lcom/discord/chat/bridge/embed/EmbedThumbnail;

.field private final title:Lcom/discord/chat/bridge/structurabletext/StructurableText;

.field private final type:Lcom/discord/chat/bridge/embed/EmbedType;

.field private final url:Ljava/lang/String;

.field private final video:Lcom/discord/chat/bridge/embed/EmbedMedia;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/embed/Embed$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/embed/Embed$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/embed/Embed;->Companion:Lcom/discord/chat/bridge/embed/Embed$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 4

    move-object v0, p0

    move v1, p1

    const v2, 0x1000001

    and-int v3, v1, v2

    if-eq v2, v3, :cond_0

    .line 1
    sget-object v3, Lcom/discord/chat/bridge/embed/Embed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/embed/Embed$$serializer;

    invoke-virtual {v3}, Lcom/discord/chat/bridge/embed/Embed$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v3

    invoke-static {p1, v2, v3}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v2, p2

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->type:Lcom/discord/chat/bridge/embed/EmbedType;

    and-int/lit8 v2, v1, 0x2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->author:Lcom/discord/chat/bridge/embed/EmbedAuthor;

    goto :goto_0

    :cond_1
    move-object v2, p3

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->author:Lcom/discord/chat/bridge/embed/EmbedAuthor;

    :goto_0
    and-int/lit8 v2, v1, 0x4

    if-nez v2, :cond_2

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->provider:Lcom/discord/chat/bridge/embed/EmbedProvider;

    goto :goto_1

    :cond_2
    move-object v2, p4

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->provider:Lcom/discord/chat/bridge/embed/EmbedProvider;

    :goto_1
    and-int/lit8 v2, v1, 0x8

    if-nez v2, :cond_3

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->rawTitle:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object v2, p5

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->rawTitle:Ljava/lang/String;

    :goto_2
    and-int/lit8 v2, v1, 0x10

    if-nez v2, :cond_4

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->title:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    goto :goto_3

    :cond_4
    move-object v2, p6

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->title:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    :goto_3
    and-int/lit8 v2, v1, 0x20

    if-nez v2, :cond_5

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->fields:Ljava/util/List;

    goto :goto_4

    :cond_5
    move-object v2, p7

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->fields:Ljava/util/List;

    :goto_4
    and-int/lit8 v2, v1, 0x40

    if-nez v2, :cond_6

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->url:Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object v2, p8

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->url:Ljava/lang/String;

    :goto_5
    and-int/lit16 v2, v1, 0x80

    if-nez v2, :cond_7

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->rawDescription:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object v2, p9

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->rawDescription:Ljava/lang/String;

    :goto_6
    and-int/lit16 v2, v1, 0x100

    if-nez v2, :cond_8

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->description:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    goto :goto_7

    :cond_8
    move-object v2, p10

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->description:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    :goto_7
    and-int/lit16 v2, v1, 0x200

    if-nez v2, :cond_9

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->image:Lcom/discord/chat/bridge/embed/EmbedMedia;

    goto :goto_8

    :cond_9
    move-object v2, p11

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->image:Lcom/discord/chat/bridge/embed/EmbedMedia;

    :goto_8
    and-int/lit16 v2, v1, 0x400

    if-nez v2, :cond_a

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->images:Ljava/util/List;

    goto :goto_9

    :cond_a
    move-object/from16 v2, p12

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->images:Ljava/util/List;

    :goto_9
    and-int/lit16 v2, v1, 0x800

    if-nez v2, :cond_b

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->video:Lcom/discord/chat/bridge/embed/EmbedMedia;

    goto :goto_a

    :cond_b
    move-object/from16 v2, p13

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->video:Lcom/discord/chat/bridge/embed/EmbedMedia;

    :goto_a
    and-int/lit16 v2, v1, 0x1000

    if-nez v2, :cond_c

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->thumbnail:Lcom/discord/chat/bridge/embed/EmbedThumbnail;

    goto :goto_b

    :cond_c
    move-object/from16 v2, p14

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->thumbnail:Lcom/discord/chat/bridge/embed/EmbedThumbnail;

    :goto_b
    and-int/lit16 v2, v1, 0x2000

    if-nez v2, :cond_d

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->numAttachments:Ljava/lang/String;

    goto :goto_c

    :cond_d
    move-object/from16 v2, p15

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->numAttachments:Ljava/lang/String;

    :goto_c
    and-int/lit16 v2, v1, 0x4000

    if-nez v2, :cond_e

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->attachmentsSize:Ljava/lang/String;

    goto :goto_d

    :cond_e
    move-object/from16 v2, p16

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->attachmentsSize:Ljava/lang/String;

    :goto_d
    const v2, 0x8000

    and-int/2addr v2, v1

    if-nez v2, :cond_f

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->messageSendError:Ljava/lang/String;

    goto :goto_e

    :cond_f
    move-object/from16 v2, p17

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->messageSendError:Ljava/lang/String;

    :goto_e
    const/high16 v2, 0x10000

    and-int/2addr v2, v1

    if-nez v2, :cond_10

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->disableBackgroundColor:Ljava/lang/Boolean;

    goto :goto_f

    :cond_10
    move-object/from16 v2, p18

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->disableBackgroundColor:Ljava/lang/Boolean;

    :goto_f
    const/high16 v2, 0x20000

    and-int/2addr v2, v1

    if-nez v2, :cond_11

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->footer:Lcom/discord/chat/bridge/embed/EmbedFooter;

    goto :goto_10

    :cond_11
    move-object/from16 v2, p19

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->footer:Lcom/discord/chat/bridge/embed/EmbedFooter;

    :goto_10
    const/high16 v2, 0x40000

    and-int/2addr v2, v1

    if-nez v2, :cond_12

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->spoiler:Ljava/lang/String;

    goto :goto_11

    :cond_12
    move-object/from16 v2, p20

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->spoiler:Ljava/lang/String;

    :goto_11
    const/high16 v2, 0x80000

    and-int/2addr v2, v1

    if-nez v2, :cond_13

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->iconURL:Ljava/lang/String;

    goto :goto_12

    :cond_13
    move-object/from16 v2, p21

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->iconURL:Ljava/lang/String;

    :goto_12
    const/high16 v2, 0x100000

    and-int/2addr v2, v1

    if-nez v2, :cond_14

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->failureState:Lcom/discord/chat/bridge/embed/EmbedFailureState;

    goto :goto_13

    :cond_14
    move-object/from16 v2, p22

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->failureState:Lcom/discord/chat/bridge/embed/EmbedFailureState;

    :goto_13
    const/high16 v2, 0x200000

    and-int/2addr v2, v1

    if-nez v2, :cond_15

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->providerColor:Ljava/lang/Integer;

    goto :goto_14

    :cond_15
    move-object/from16 v2, p23

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->providerColor:Ljava/lang/Integer;

    :goto_14
    const/high16 v2, 0x400000

    and-int/2addr v2, v1

    if-nez v2, :cond_16

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->borderLeftColor:Ljava/lang/Integer;

    goto :goto_15

    :cond_16
    move-object/from16 v2, p24

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->borderLeftColor:Ljava/lang/Integer;

    :goto_15
    const/high16 v2, 0x800000

    and-int/2addr v2, v1

    if-nez v2, :cond_17

    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->headerTextColor:Ljava/lang/Integer;

    goto :goto_16

    :cond_17
    move-object/from16 v2, p25

    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->headerTextColor:Ljava/lang/Integer;

    :goto_16
    move/from16 v2, p26

    iput v2, v0, Lcom/discord/chat/bridge/embed/Embed;->bodyTextColor:I

    const/high16 v2, 0x2000000

    and-int/2addr v1, v2

    if-nez v1, :cond_19

    .line 2
    iget-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->spoiler:Ljava/lang/String;

    if-eqz v1, :cond_18

    invoke-static {v1}, Lpi/l;->w(Ljava/lang/CharSequence;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_18

    move-object v3, v1

    .line 3
    :cond_18
    iput-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->spoilerOrNull:Ljava/lang/String;

    goto :goto_17

    :cond_19
    move-object/from16 v1, p27

    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->spoilerOrNull:Ljava/lang/String;

    :goto_17
    return-void
.end method

.method public constructor <init>(Lcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/bridge/embed/EmbedType;",
            "Lcom/discord/chat/bridge/embed/EmbedAuthor;",
            "Lcom/discord/chat/bridge/embed/EmbedProvider;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/embed/EmbedField;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
            "Lcom/discord/chat/bridge/embed/EmbedMedia;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/embed/EmbedMedia;",
            ">;",
            "Lcom/discord/chat/bridge/embed/EmbedMedia;",
            "Lcom/discord/chat/bridge/embed/EmbedThumbnail;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/discord/chat/bridge/embed/EmbedFooter;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/embed/EmbedFailureState;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "I)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p19

    const-string v3, "type"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->type:Lcom/discord/chat/bridge/embed/EmbedType;

    move-object v1, p2

    .line 6
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->author:Lcom/discord/chat/bridge/embed/EmbedAuthor;

    move-object v1, p3

    .line 7
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->provider:Lcom/discord/chat/bridge/embed/EmbedProvider;

    move-object v1, p4

    .line 8
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->rawTitle:Ljava/lang/String;

    move-object v1, p5

    .line 9
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->title:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    move-object v1, p6

    .line 10
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->fields:Ljava/util/List;

    move-object v1, p7

    .line 11
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->url:Ljava/lang/String;

    move-object v1, p8

    .line 12
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->rawDescription:Ljava/lang/String;

    move-object v1, p9

    .line 13
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->description:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    move-object v1, p10

    .line 14
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->image:Lcom/discord/chat/bridge/embed/EmbedMedia;

    move-object v1, p11

    .line 15
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->images:Ljava/util/List;

    move-object/from16 v1, p12

    .line 16
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->video:Lcom/discord/chat/bridge/embed/EmbedMedia;

    move-object/from16 v1, p13

    .line 17
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->thumbnail:Lcom/discord/chat/bridge/embed/EmbedThumbnail;

    move-object/from16 v1, p14

    .line 18
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->numAttachments:Ljava/lang/String;

    move-object/from16 v1, p15

    .line 19
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->attachmentsSize:Ljava/lang/String;

    move-object/from16 v1, p16

    .line 20
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->messageSendError:Ljava/lang/String;

    move-object/from16 v1, p17

    .line 21
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->disableBackgroundColor:Ljava/lang/Boolean;

    move-object/from16 v1, p18

    .line 22
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->footer:Lcom/discord/chat/bridge/embed/EmbedFooter;

    .line 23
    iput-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->spoiler:Ljava/lang/String;

    move-object/from16 v1, p20

    .line 24
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->iconURL:Ljava/lang/String;

    move-object/from16 v1, p21

    .line 25
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->failureState:Lcom/discord/chat/bridge/embed/EmbedFailureState;

    move-object/from16 v1, p22

    .line 26
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->providerColor:Ljava/lang/Integer;

    move-object/from16 v1, p23

    .line 27
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->borderLeftColor:Ljava/lang/Integer;

    move-object/from16 v1, p24

    .line 28
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->headerTextColor:Ljava/lang/Integer;

    move/from16 v1, p25

    .line 29
    iput v1, v0, Lcom/discord/chat/bridge/embed/Embed;->bodyTextColor:I

    const/4 v1, 0x0

    if-eqz v2, :cond_0

    .line 30
    invoke-static/range {p19 .. p19}, Lpi/l;->w(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_0

    move-object v1, v2

    :cond_0
    iput-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->spoilerOrNull:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 29

    move/from16 v0, p26

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p4

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p5

    :goto_3
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_4

    move-object v9, v2

    goto :goto_4

    :cond_4
    move-object/from16 v9, p6

    :goto_4
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_5

    move-object v10, v2

    goto :goto_5

    :cond_5
    move-object/from16 v10, p7

    :goto_5
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_6

    move-object v11, v2

    goto :goto_6

    :cond_6
    move-object/from16 v11, p8

    :goto_6
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_7

    move-object v12, v2

    goto :goto_7

    :cond_7
    move-object/from16 v12, p9

    :goto_7
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_8

    move-object v13, v2

    goto :goto_8

    :cond_8
    move-object/from16 v13, p10

    :goto_8
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_9

    move-object v14, v2

    goto :goto_9

    :cond_9
    move-object/from16 v14, p11

    :goto_9
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_a

    move-object v15, v2

    goto :goto_a

    :cond_a
    move-object/from16 v15, p12

    :goto_a
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_b

    move-object/from16 v16, v2

    goto :goto_b

    :cond_b
    move-object/from16 v16, p13

    :goto_b
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_c

    move-object/from16 v17, v2

    goto :goto_c

    :cond_c
    move-object/from16 v17, p14

    :goto_c
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_d

    move-object/from16 v18, v2

    goto :goto_d

    :cond_d
    move-object/from16 v18, p15

    :goto_d
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v19, v2

    goto :goto_e

    :cond_e
    move-object/from16 v19, p16

    :goto_e
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    move-object/from16 v20, v2

    goto :goto_f

    :cond_f
    move-object/from16 v20, p17

    :goto_f
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move-object/from16 v21, v2

    goto :goto_10

    :cond_10
    move-object/from16 v21, p18

    :goto_10
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_11

    move-object/from16 v22, v2

    goto :goto_11

    :cond_11
    move-object/from16 v22, p19

    :goto_11
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_12

    move-object/from16 v23, v2

    goto :goto_12

    :cond_12
    move-object/from16 v23, p20

    :goto_12
    const/high16 v1, 0x100000

    and-int/2addr v1, v0

    if-eqz v1, :cond_13

    move-object/from16 v24, v2

    goto :goto_13

    :cond_13
    move-object/from16 v24, p21

    :goto_13
    const/high16 v1, 0x200000

    and-int/2addr v1, v0

    if-eqz v1, :cond_14

    move-object/from16 v25, v2

    goto :goto_14

    :cond_14
    move-object/from16 v25, p22

    :goto_14
    const/high16 v1, 0x400000

    and-int/2addr v1, v0

    if-eqz v1, :cond_15

    move-object/from16 v26, v2

    goto :goto_15

    :cond_15
    move-object/from16 v26, p23

    :goto_15
    const/high16 v1, 0x800000

    and-int/2addr v0, v1

    if-eqz v0, :cond_16

    move-object/from16 v27, v2

    goto :goto_16

    :cond_16
    move-object/from16 v27, p24

    :goto_16
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v28, p25

    .line 31
    invoke-direct/range {v3 .. v28}, Lcom/discord/chat/bridge/embed/Embed;-><init>(Lcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/bridge/embed/Embed;Lcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IILjava/lang/Object;)Lcom/discord/chat/bridge/embed/Embed;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p26

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->type:Lcom/discord/chat/bridge/embed/EmbedType;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->author:Lcom/discord/chat/bridge/embed/EmbedAuthor;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/discord/chat/bridge/embed/Embed;->provider:Lcom/discord/chat/bridge/embed/EmbedProvider;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/discord/chat/bridge/embed/Embed;->rawTitle:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/discord/chat/bridge/embed/Embed;->title:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/discord/chat/bridge/embed/Embed;->fields:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/discord/chat/bridge/embed/Embed;->url:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/discord/chat/bridge/embed/Embed;->rawDescription:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/discord/chat/bridge/embed/Embed;->description:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/discord/chat/bridge/embed/Embed;->image:Lcom/discord/chat/bridge/embed/EmbedMedia;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/discord/chat/bridge/embed/Embed;->images:Ljava/util/List;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/discord/chat/bridge/embed/Embed;->video:Lcom/discord/chat/bridge/embed/EmbedMedia;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/discord/chat/bridge/embed/Embed;->thumbnail:Lcom/discord/chat/bridge/embed/EmbedThumbnail;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->numAttachments:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->attachmentsSize:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->messageSendError:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move-object/from16 p16, v15

    if-eqz v16, :cond_10

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->disableBackgroundColor:Ljava/lang/Boolean;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move-object/from16 p17, v15

    if-eqz v16, :cond_11

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->footer:Lcom/discord/chat/bridge/embed/EmbedFooter;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-object/from16 p18, v15

    if-eqz v16, :cond_12

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->spoiler:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v15, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move-object/from16 p19, v15

    if-eqz v16, :cond_13

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->iconURL:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v15, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, v1, v16

    move-object/from16 p20, v15

    if-eqz v16, :cond_14

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->failureState:Lcom/discord/chat/bridge/embed/EmbedFailureState;

    goto :goto_14

    :cond_14
    move-object/from16 v15, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, v1, v16

    move-object/from16 p21, v15

    if-eqz v16, :cond_15

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->providerColor:Ljava/lang/Integer;

    goto :goto_15

    :cond_15
    move-object/from16 v15, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, v1, v16

    move-object/from16 p22, v15

    if-eqz v16, :cond_16

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->borderLeftColor:Ljava/lang/Integer;

    goto :goto_16

    :cond_16
    move-object/from16 v15, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, v1, v16

    move-object/from16 p23, v15

    if-eqz v16, :cond_17

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->headerTextColor:Ljava/lang/Integer;

    goto :goto_17

    :cond_17
    move-object/from16 v15, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v1, v1, v16

    if-eqz v1, :cond_18

    iget v1, v0, Lcom/discord/chat/bridge/embed/Embed;->bodyTextColor:I

    goto :goto_18

    :cond_18
    move/from16 v1, p25

    :goto_18
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p24, v15

    move/from16 p25, v1

    invoke-virtual/range {p0 .. p25}, Lcom/discord/chat/bridge/embed/Embed;->copy(Lcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;I)Lcom/discord/chat/bridge/embed/Embed;

    move-result-object v0

    return-object v0
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/embed/Embed;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 5

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/discord/chat/bridge/embed/EmbedType;->Companion:Lcom/discord/chat/bridge/embed/EmbedType$Companion;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/embed/EmbedType$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->type:Lcom/discord/chat/bridge/embed/EmbedType;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    move v1, v0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->author:Lcom/discord/chat/bridge/embed/EmbedAuthor;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_1
    if-eqz v1, :cond_2

    sget-object v1, Lcom/discord/chat/bridge/embed/EmbedAuthor$$serializer;->INSTANCE:Lcom/discord/chat/bridge/embed/EmbedAuthor$$serializer;

    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->author:Lcom/discord/chat/bridge/embed/EmbedAuthor;

    invoke-interface {p1, p2, v0, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_2
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_2
    move v3, v0

    goto :goto_3

    :cond_3
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->provider:Lcom/discord/chat/bridge/embed/EmbedProvider;

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    move v3, v2

    :goto_3
    if-eqz v3, :cond_5

    sget-object v3, Lcom/discord/chat/bridge/embed/EmbedProvider$$serializer;->INSTANCE:Lcom/discord/chat/bridge/embed/EmbedProvider$$serializer;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->provider:Lcom/discord/chat/bridge/embed/EmbedProvider;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_6

    :goto_4
    move v3, v0

    goto :goto_5

    :cond_6
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->rawTitle:Ljava/lang/String;

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    move v3, v2

    :goto_5
    if-eqz v3, :cond_8

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->rawTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_8
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_9

    :goto_6
    move v3, v0

    goto :goto_7

    :cond_9
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->title:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    if-eqz v3, :cond_a

    goto :goto_6

    :cond_a
    move v3, v2

    :goto_7
    if-eqz v3, :cond_b

    sget-object v3, Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;->INSTANCE:Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->title:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_c

    :goto_8
    move v3, v0

    goto :goto_9

    :cond_c
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->fields:Ljava/util/List;

    if-eqz v3, :cond_d

    goto :goto_8

    :cond_d
    move v3, v2

    :goto_9
    if-eqz v3, :cond_e

    new-instance v3, Lzi/f;

    sget-object v4, Lcom/discord/chat/bridge/embed/EmbedField$$serializer;->INSTANCE:Lcom/discord/chat/bridge/embed/EmbedField$$serializer;

    invoke-direct {v3, v4}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->fields:Ljava/util/List;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_e
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_f

    :goto_a
    move v3, v0

    goto :goto_b

    :cond_f
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->url:Ljava/lang/String;

    if-eqz v3, :cond_10

    goto :goto_a

    :cond_10
    move v3, v2

    :goto_b
    if-eqz v3, :cond_11

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->url:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_11
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_12

    :goto_c
    move v3, v0

    goto :goto_d

    :cond_12
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->rawDescription:Ljava/lang/String;

    if-eqz v3, :cond_13

    goto :goto_c

    :cond_13
    move v3, v2

    :goto_d
    if-eqz v3, :cond_14

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->rawDescription:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_14
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_15

    :goto_e
    move v3, v0

    goto :goto_f

    :cond_15
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->description:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    if-eqz v3, :cond_16

    goto :goto_e

    :cond_16
    move v3, v2

    :goto_f
    if-eqz v3, :cond_17

    sget-object v3, Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;->INSTANCE:Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->description:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_17
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_18

    :goto_10
    move v3, v0

    goto :goto_11

    :cond_18
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->image:Lcom/discord/chat/bridge/embed/EmbedMedia;

    if-eqz v3, :cond_19

    goto :goto_10

    :cond_19
    move v3, v2

    :goto_11
    if-eqz v3, :cond_1a

    sget-object v3, Lcom/discord/chat/bridge/embed/EmbedMedia$$serializer;->INSTANCE:Lcom/discord/chat/bridge/embed/EmbedMedia$$serializer;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->image:Lcom/discord/chat/bridge/embed/EmbedMedia;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_1a
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_1b

    :goto_12
    move v3, v0

    goto :goto_13

    :cond_1b
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->images:Ljava/util/List;

    if-eqz v3, :cond_1c

    goto :goto_12

    :cond_1c
    move v3, v2

    :goto_13
    if-eqz v3, :cond_1d

    new-instance v3, Lzi/f;

    sget-object v4, Lcom/discord/chat/bridge/embed/EmbedMedia$$serializer;->INSTANCE:Lcom/discord/chat/bridge/embed/EmbedMedia$$serializer;

    invoke-direct {v3, v4}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->images:Ljava/util/List;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_1d
    const/16 v1, 0xb

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_1e

    :goto_14
    move v3, v0

    goto :goto_15

    :cond_1e
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->video:Lcom/discord/chat/bridge/embed/EmbedMedia;

    if-eqz v3, :cond_1f

    goto :goto_14

    :cond_1f
    move v3, v2

    :goto_15
    if-eqz v3, :cond_20

    sget-object v3, Lcom/discord/chat/bridge/embed/EmbedMedia$$serializer;->INSTANCE:Lcom/discord/chat/bridge/embed/EmbedMedia$$serializer;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->video:Lcom/discord/chat/bridge/embed/EmbedMedia;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_20
    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_21

    :goto_16
    move v3, v0

    goto :goto_17

    :cond_21
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->thumbnail:Lcom/discord/chat/bridge/embed/EmbedThumbnail;

    if-eqz v3, :cond_22

    goto :goto_16

    :cond_22
    move v3, v2

    :goto_17
    if-eqz v3, :cond_23

    sget-object v3, Lcom/discord/chat/bridge/embed/EmbedThumbnail$$serializer;->INSTANCE:Lcom/discord/chat/bridge/embed/EmbedThumbnail$$serializer;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->thumbnail:Lcom/discord/chat/bridge/embed/EmbedThumbnail;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_23
    const/16 v1, 0xd

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_24

    :goto_18
    move v3, v0

    goto :goto_19

    :cond_24
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->numAttachments:Ljava/lang/String;

    if-eqz v3, :cond_25

    goto :goto_18

    :cond_25
    move v3, v2

    :goto_19
    if-eqz v3, :cond_26

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->numAttachments:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_26
    const/16 v1, 0xe

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_27

    :goto_1a
    move v3, v0

    goto :goto_1b

    :cond_27
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->attachmentsSize:Ljava/lang/String;

    if-eqz v3, :cond_28

    goto :goto_1a

    :cond_28
    move v3, v2

    :goto_1b
    if-eqz v3, :cond_29

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->attachmentsSize:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_29
    const/16 v1, 0xf

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_2a

    :goto_1c
    move v3, v0

    goto :goto_1d

    :cond_2a
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->messageSendError:Ljava/lang/String;

    if-eqz v3, :cond_2b

    goto :goto_1c

    :cond_2b
    move v3, v2

    :goto_1d
    if-eqz v3, :cond_2c

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->messageSendError:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_2c
    const/16 v1, 0x10

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_2d

    :goto_1e
    move v3, v0

    goto :goto_1f

    :cond_2d
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->disableBackgroundColor:Ljava/lang/Boolean;

    if-eqz v3, :cond_2e

    goto :goto_1e

    :cond_2e
    move v3, v2

    :goto_1f
    if-eqz v3, :cond_2f

    sget-object v3, Lzi/h;->a:Lzi/h;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->disableBackgroundColor:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_2f
    const/16 v1, 0x11

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_30

    :goto_20
    move v3, v0

    goto :goto_21

    :cond_30
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->footer:Lcom/discord/chat/bridge/embed/EmbedFooter;

    if-eqz v3, :cond_31

    goto :goto_20

    :cond_31
    move v3, v2

    :goto_21
    if-eqz v3, :cond_32

    sget-object v3, Lcom/discord/chat/bridge/embed/EmbedFooter$$serializer;->INSTANCE:Lcom/discord/chat/bridge/embed/EmbedFooter$$serializer;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->footer:Lcom/discord/chat/bridge/embed/EmbedFooter;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_32
    const/16 v1, 0x12

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_33

    :goto_22
    move v3, v0

    goto :goto_23

    :cond_33
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->spoiler:Ljava/lang/String;

    if-eqz v3, :cond_34

    goto :goto_22

    :cond_34
    move v3, v2

    :goto_23
    if-eqz v3, :cond_35

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->spoiler:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_35
    const/16 v1, 0x13

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_36

    :goto_24
    move v3, v0

    goto :goto_25

    :cond_36
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->iconURL:Ljava/lang/String;

    if-eqz v3, :cond_37

    goto :goto_24

    :cond_37
    move v3, v2

    :goto_25
    if-eqz v3, :cond_38

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->iconURL:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_38
    const/16 v1, 0x14

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_39

    :goto_26
    move v3, v0

    goto :goto_27

    :cond_39
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->failureState:Lcom/discord/chat/bridge/embed/EmbedFailureState;

    if-eqz v3, :cond_3a

    goto :goto_26

    :cond_3a
    move v3, v2

    :goto_27
    if-eqz v3, :cond_3b

    sget-object v3, Lcom/discord/chat/bridge/embed/EmbedFailureState$Serializer;->INSTANCE:Lcom/discord/chat/bridge/embed/EmbedFailureState$Serializer;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->failureState:Lcom/discord/chat/bridge/embed/EmbedFailureState;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_3b
    const/16 v1, 0x15

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_3c

    :goto_28
    move v3, v0

    goto :goto_29

    :cond_3c
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->providerColor:Ljava/lang/Integer;

    if-eqz v3, :cond_3d

    goto :goto_28

    :cond_3d
    move v3, v2

    :goto_29
    if-eqz v3, :cond_3e

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    iget-object v4, p0, Lcom/discord/chat/bridge/embed/Embed;->providerColor:Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_3e
    const/16 v1, 0x16

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_3f

    :goto_2a
    move v1, v0

    goto :goto_2b

    :cond_3f
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->borderLeftColor:Ljava/lang/Integer;

    if-eqz v1, :cond_40

    goto :goto_2a

    :cond_40
    move v1, v2

    :goto_2b
    if-eqz v1, :cond_41

    sget-object v1, Lzi/m0;->a:Lzi/m0;

    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->borderLeftColor:Ljava/lang/Integer;

    const/16 v4, 0x16

    invoke-interface {p1, p2, v4, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_41
    const/16 v1, 0x17

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_42

    :goto_2c
    move v1, v0

    goto :goto_2d

    :cond_42
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->headerTextColor:Ljava/lang/Integer;

    if-eqz v1, :cond_43

    goto :goto_2c

    :cond_43
    move v1, v2

    :goto_2d
    if-eqz v1, :cond_44

    sget-object v1, Lzi/m0;->a:Lzi/m0;

    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->headerTextColor:Ljava/lang/Integer;

    const/16 v4, 0x17

    invoke-interface {p1, p2, v4, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_44
    const/16 v1, 0x18

    iget v3, p0, Lcom/discord/chat/bridge/embed/Embed;->bodyTextColor:I

    invoke-interface {p1, p2, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    const/16 v1, 0x19

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_45

    :goto_2e
    move v2, v0

    goto :goto_30

    :cond_45
    invoke-virtual {p0}, Lcom/discord/chat/bridge/embed/Embed;->getSpoilerOrNull()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/discord/chat/bridge/embed/Embed;->spoiler:Ljava/lang/String;

    if-eqz v3, :cond_46

    .line 2
    invoke-static {v3}, Lpi/l;->w(Ljava/lang/CharSequence;)Z

    move-result v4

    xor-int/2addr v4, v0

    if-eqz v4, :cond_46

    goto :goto_2f

    :cond_46
    const/4 v3, 0x0

    :goto_2f
    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_47

    goto :goto_2e

    :cond_47
    :goto_30
    if-eqz v2, :cond_48

    .line 3
    sget-object v0, Lzi/a2;->a:Lzi/a2;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/embed/Embed;->getSpoilerOrNull()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x19

    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_48
    return-void
.end method


# virtual methods
.method public final component1()Lcom/discord/chat/bridge/embed/EmbedType;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->type:Lcom/discord/chat/bridge/embed/EmbedType;

    return-object v0
.end method

.method public final component10()Lcom/discord/chat/bridge/embed/EmbedMedia;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->image:Lcom/discord/chat/bridge/embed/EmbedMedia;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/embed/EmbedMedia;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->images:Ljava/util/List;

    return-object v0
.end method

.method public final component12()Lcom/discord/chat/bridge/embed/EmbedMedia;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->video:Lcom/discord/chat/bridge/embed/EmbedMedia;

    return-object v0
.end method

.method public final component13()Lcom/discord/chat/bridge/embed/EmbedThumbnail;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->thumbnail:Lcom/discord/chat/bridge/embed/EmbedThumbnail;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->numAttachments:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->attachmentsSize:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->messageSendError:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->disableBackgroundColor:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component18()Lcom/discord/chat/bridge/embed/EmbedFooter;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->footer:Lcom/discord/chat/bridge/embed/EmbedFooter;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->spoiler:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/discord/chat/bridge/embed/EmbedAuthor;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->author:Lcom/discord/chat/bridge/embed/EmbedAuthor;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->iconURL:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Lcom/discord/chat/bridge/embed/EmbedFailureState;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->failureState:Lcom/discord/chat/bridge/embed/EmbedFailureState;

    return-object v0
.end method

.method public final component22()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->providerColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component23()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->borderLeftColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component24()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->headerTextColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component25()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/embed/Embed;->bodyTextColor:I

    return v0
.end method

.method public final component3()Lcom/discord/chat/bridge/embed/EmbedProvider;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->provider:Lcom/discord/chat/bridge/embed/EmbedProvider;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->rawTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/discord/chat/bridge/structurabletext/StructurableText;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->title:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/embed/EmbedField;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->fields:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->rawDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/discord/chat/bridge/structurabletext/StructurableText;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->description:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    return-object v0
.end method

.method public final copy(Lcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;I)Lcom/discord/chat/bridge/embed/Embed;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/bridge/embed/EmbedType;",
            "Lcom/discord/chat/bridge/embed/EmbedAuthor;",
            "Lcom/discord/chat/bridge/embed/EmbedProvider;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/embed/EmbedField;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
            "Lcom/discord/chat/bridge/embed/EmbedMedia;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/embed/EmbedMedia;",
            ">;",
            "Lcom/discord/chat/bridge/embed/EmbedMedia;",
            "Lcom/discord/chat/bridge/embed/EmbedThumbnail;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/discord/chat/bridge/embed/EmbedFooter;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/embed/EmbedFailureState;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "I)",
            "Lcom/discord/chat/bridge/embed/Embed;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    move-object/from16 v23, p23

    move-object/from16 v24, p24

    move/from16 v25, p25

    const-string v0, "type"

    move-object/from16 v26, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v27, Lcom/discord/chat/bridge/embed/Embed;

    move-object/from16 v0, v27

    invoke-direct/range {v0 .. v25}, Lcom/discord/chat/bridge/embed/Embed;-><init>(Lcom/discord/chat/bridge/embed/EmbedType;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    return-object v27
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/embed/Embed;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/embed/Embed;

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->type:Lcom/discord/chat/bridge/embed/EmbedType;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->type:Lcom/discord/chat/bridge/embed/EmbedType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->author:Lcom/discord/chat/bridge/embed/EmbedAuthor;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->author:Lcom/discord/chat/bridge/embed/EmbedAuthor;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->provider:Lcom/discord/chat/bridge/embed/EmbedProvider;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->provider:Lcom/discord/chat/bridge/embed/EmbedProvider;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->rawTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->rawTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->title:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->title:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->fields:Ljava/util/List;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->fields:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->url:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->url:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->rawDescription:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->rawDescription:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->description:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->description:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->image:Lcom/discord/chat/bridge/embed/EmbedMedia;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->image:Lcom/discord/chat/bridge/embed/EmbedMedia;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->images:Ljava/util/List;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->images:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->video:Lcom/discord/chat/bridge/embed/EmbedMedia;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->video:Lcom/discord/chat/bridge/embed/EmbedMedia;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->thumbnail:Lcom/discord/chat/bridge/embed/EmbedThumbnail;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->thumbnail:Lcom/discord/chat/bridge/embed/EmbedThumbnail;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->numAttachments:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->numAttachments:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->attachmentsSize:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->attachmentsSize:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->messageSendError:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->messageSendError:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->disableBackgroundColor:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->disableBackgroundColor:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->footer:Lcom/discord/chat/bridge/embed/EmbedFooter;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->footer:Lcom/discord/chat/bridge/embed/EmbedFooter;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->spoiler:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->spoiler:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->iconURL:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->iconURL:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->failureState:Lcom/discord/chat/bridge/embed/EmbedFailureState;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->failureState:Lcom/discord/chat/bridge/embed/EmbedFailureState;

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->providerColor:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->providerColor:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->borderLeftColor:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->borderLeftColor:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->headerTextColor:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/Embed;->headerTextColor:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget v1, p0, Lcom/discord/chat/bridge/embed/Embed;->bodyTextColor:I

    iget p1, p1, Lcom/discord/chat/bridge/embed/Embed;->bodyTextColor:I

    if-eq v1, p1, :cond_1a

    return v2

    :cond_1a
    return v0
.end method

.method public final getAttachmentsSize()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->attachmentsSize:Ljava/lang/String;

    return-object v0
.end method

.method public final getAuthor()Lcom/discord/chat/bridge/embed/EmbedAuthor;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->author:Lcom/discord/chat/bridge/embed/EmbedAuthor;

    return-object v0
.end method

.method public final getBodyTextColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/embed/Embed;->bodyTextColor:I

    return v0
.end method

.method public final getBorderLeftColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->borderLeftColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getDescription()Lcom/discord/chat/bridge/structurabletext/StructurableText;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->description:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    return-object v0
.end method

.method public final getDisableBackgroundColor()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->disableBackgroundColor:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getFailureState()Lcom/discord/chat/bridge/embed/EmbedFailureState;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->failureState:Lcom/discord/chat/bridge/embed/EmbedFailureState;

    return-object v0
.end method

.method public final getFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/embed/EmbedField;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->fields:Ljava/util/List;

    return-object v0
.end method

.method public final getFooter()Lcom/discord/chat/bridge/embed/EmbedFooter;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->footer:Lcom/discord/chat/bridge/embed/EmbedFooter;

    return-object v0
.end method

.method public final getHeaderTextColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->headerTextColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getIconURL()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->iconURL:Ljava/lang/String;

    return-object v0
.end method

.method public final getImage()Lcom/discord/chat/bridge/embed/EmbedMedia;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->image:Lcom/discord/chat/bridge/embed/EmbedMedia;

    return-object v0
.end method

.method public final getImages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/embed/EmbedMedia;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->images:Ljava/util/List;

    return-object v0
.end method

.method public final getMessageSendError()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->messageSendError:Ljava/lang/String;

    return-object v0
.end method

.method public final getNumAttachments()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->numAttachments:Ljava/lang/String;

    return-object v0
.end method

.method public final getProvider()Lcom/discord/chat/bridge/embed/EmbedProvider;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->provider:Lcom/discord/chat/bridge/embed/EmbedProvider;

    return-object v0
.end method

.method public final getProviderColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->providerColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getRawDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->rawDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final getRawTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->rawTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSpoiler()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->spoiler:Ljava/lang/String;

    return-object v0
.end method

.method public getSpoilerOrNull()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->spoilerOrNull:Ljava/lang/String;

    return-object v0
.end method

.method public final getThumbnail()Lcom/discord/chat/bridge/embed/EmbedThumbnail;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->thumbnail:Lcom/discord/chat/bridge/embed/EmbedThumbnail;

    return-object v0
.end method

.method public final getTitle()Lcom/discord/chat/bridge/structurabletext/StructurableText;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->title:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    return-object v0
.end method

.method public final getType()Lcom/discord/chat/bridge/embed/EmbedType;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->type:Lcom/discord/chat/bridge/embed/EmbedType;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final getVideo()Lcom/discord/chat/bridge/embed/EmbedMedia;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->video:Lcom/discord/chat/bridge/embed/EmbedMedia;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/Embed;->type:Lcom/discord/chat/bridge/embed/EmbedType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->author:Lcom/discord/chat/bridge/embed/EmbedAuthor;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/discord/chat/bridge/embed/EmbedAuthor;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->provider:Lcom/discord/chat/bridge/embed/EmbedProvider;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/discord/chat/bridge/embed/EmbedProvider;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->rawTitle:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->title:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->fields:Ljava/util/List;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->url:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->rawDescription:Ljava/lang/String;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->description:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->image:Lcom/discord/chat/bridge/embed/EmbedMedia;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Lcom/discord/chat/bridge/embed/EmbedMedia;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->images:Ljava/util/List;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->video:Lcom/discord/chat/bridge/embed/EmbedMedia;

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Lcom/discord/chat/bridge/embed/EmbedMedia;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->thumbnail:Lcom/discord/chat/bridge/embed/EmbedThumbnail;

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->numAttachments:Ljava/lang/String;

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_c

    :cond_c
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->attachmentsSize:Ljava/lang/String;

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_d

    :cond_d
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->messageSendError:Ljava/lang/String;

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_e

    :cond_e
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->disableBackgroundColor:Ljava/lang/Boolean;

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_f

    :cond_f
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->footer:Lcom/discord/chat/bridge/embed/EmbedFooter;

    if-nez v1, :cond_10

    move v1, v2

    goto :goto_10

    :cond_10
    invoke-virtual {v1}, Lcom/discord/chat/bridge/embed/EmbedFooter;->hashCode()I

    move-result v1

    :goto_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->spoiler:Ljava/lang/String;

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_11

    :cond_11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_11
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->iconURL:Ljava/lang/String;

    if-nez v1, :cond_12

    move v1, v2

    goto :goto_12

    :cond_12
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_12
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->failureState:Lcom/discord/chat/bridge/embed/EmbedFailureState;

    if-nez v1, :cond_13

    move v1, v2

    goto :goto_13

    :cond_13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->providerColor:Ljava/lang/Integer;

    if-nez v1, :cond_14

    move v1, v2

    goto :goto_14

    :cond_14
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_14
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->borderLeftColor:Ljava/lang/Integer;

    if-nez v1, :cond_15

    move v1, v2

    goto :goto_15

    :cond_15
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/Embed;->headerTextColor:Ljava/lang/Integer;

    if-nez v1, :cond_16

    goto :goto_16

    :cond_16
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_16
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/bridge/embed/Embed;->bodyTextColor:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/discord/chat/bridge/embed/Embed;->type:Lcom/discord/chat/bridge/embed/EmbedType;

    iget-object v2, v0, Lcom/discord/chat/bridge/embed/Embed;->author:Lcom/discord/chat/bridge/embed/EmbedAuthor;

    iget-object v3, v0, Lcom/discord/chat/bridge/embed/Embed;->provider:Lcom/discord/chat/bridge/embed/EmbedProvider;

    iget-object v4, v0, Lcom/discord/chat/bridge/embed/Embed;->rawTitle:Ljava/lang/String;

    iget-object v5, v0, Lcom/discord/chat/bridge/embed/Embed;->title:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    iget-object v6, v0, Lcom/discord/chat/bridge/embed/Embed;->fields:Ljava/util/List;

    iget-object v7, v0, Lcom/discord/chat/bridge/embed/Embed;->url:Ljava/lang/String;

    iget-object v8, v0, Lcom/discord/chat/bridge/embed/Embed;->rawDescription:Ljava/lang/String;

    iget-object v9, v0, Lcom/discord/chat/bridge/embed/Embed;->description:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    iget-object v10, v0, Lcom/discord/chat/bridge/embed/Embed;->image:Lcom/discord/chat/bridge/embed/EmbedMedia;

    iget-object v11, v0, Lcom/discord/chat/bridge/embed/Embed;->images:Ljava/util/List;

    iget-object v12, v0, Lcom/discord/chat/bridge/embed/Embed;->video:Lcom/discord/chat/bridge/embed/EmbedMedia;

    iget-object v13, v0, Lcom/discord/chat/bridge/embed/Embed;->thumbnail:Lcom/discord/chat/bridge/embed/EmbedThumbnail;

    iget-object v14, v0, Lcom/discord/chat/bridge/embed/Embed;->numAttachments:Ljava/lang/String;

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->attachmentsSize:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->messageSendError:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->disableBackgroundColor:Ljava/lang/Boolean;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->footer:Lcom/discord/chat/bridge/embed/EmbedFooter;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->spoiler:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->iconURL:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->failureState:Lcom/discord/chat/bridge/embed/EmbedFailureState;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->providerColor:Ljava/lang/Integer;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->borderLeftColor:Ljava/lang/Integer;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/embed/Embed;->headerTextColor:Ljava/lang/Integer;

    move-object/from16 v25, v15

    iget v15, v0, Lcom/discord/chat/bridge/embed/Embed;->bodyTextColor:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v26, v15

    const-string v15, "Embed(type="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", author="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", provider="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rawTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fields="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", rawDescription="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", image="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", images="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", video="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", thumbnail="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", numAttachments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", attachmentsSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", messageSendError="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", disableBackgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", footer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", spoiler="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", iconURL="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", failureState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", providerColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", borderLeftColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", headerTextColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bodyTextColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
