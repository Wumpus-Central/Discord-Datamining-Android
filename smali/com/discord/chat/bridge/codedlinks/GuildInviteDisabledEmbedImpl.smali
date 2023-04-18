.class public final Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;
.super Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;
.source "SourceFile"

# interfaces
.implements Lcom/discord/chat/bridge/codedlinks/GuildDisabledInviteEmbed;
.implements Lcom/discord/chat/bridge/codedlinks/GuildInviteExtendedEmbed;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$$serializer;,
        Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008X\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 \u0095\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0094\u0001\u0095\u0001B\u008d\u0003\u0008\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0019\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010!\u001a\u0004\u0018\u00010\u0019\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\'\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010)\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010+\u001a\u0004\u0018\u00010,\u0012\u0008\u0010-\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010/\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u00100\u001a\u0004\u0018\u000101\u00a2\u0006\u0002\u00102B\u009d\u0003\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0003\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0003\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u00103J\t\u0010a\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u000b\u0010e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010h\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\u000b\u0010i\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\t\u0010l\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010p\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010q\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\u0010\u0010r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u000b\u0010s\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010v\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00105J\t\u0010w\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010x\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u000b\u0010y\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010{\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00105J\t\u0010|\u001a\u00020,H\u00c6\u0003J\t\u0010}\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\u000bH\u00c6\u0003J\u00b6\u0003\u0010\u0086\u0001\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0003\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000b2\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0003\u0010%\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010&\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0003\u0010*\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010+\u001a\u00020,2\u0008\u0008\u0002\u0010-\u001a\u00020\u000b2\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0003\u0010\u0087\u0001J\u0016\u0010\u0088\u0001\u001a\u00020\u00192\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001H\u00d6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0005H\u00d6\u0001J\n\u0010\u008c\u0001\u001a\u00020\u000bH\u00d6\u0001J(\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u008f\u0001\u001a\u00020\u00002\u0008\u0010\u0090\u0001\u001a\u00030\u0091\u00012\u0008\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u00c7\u0001R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u00084\u00105R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u00087\u00105R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u00088\u00105R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010<R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010:R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u0008>\u00105R\u0014\u0010\u0008\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010<R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010B\u001a\u0004\u0008@\u0010AR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010:R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u0010:R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u0019X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010B\u001a\u0004\u0008E\u0010AR\u0014\u0010+\u001a\u00020,X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010GR\u0016\u0010.\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008H\u0010:R\u0014\u0010-\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u0010:R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u0010<R\u0016\u0010/\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008K\u0010:R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008L\u0010:R\u0014\u0010\u0010\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u0010:R\u0014\u0010\u0011\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010:R\u0016\u0010$\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008O\u0010:R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008P\u0010:R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Q\u0010:R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u0008R\u00105R\u0018\u0010 \u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u0008S\u00105R\u0018\u0010!\u001a\u0004\u0018\u00010\u0019X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010B\u001a\u0004\u0008T\u0010AR\u0018\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u0008U\u00105R\u0016\u0010#\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008V\u0010:R\u0014\u0010\u000f\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008W\u0010:R\u0018\u0010%\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u0008X\u00105R\u0018\u0010&\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u0008Y\u00105R\u0018\u0010\'\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u0008Z\u00105R\u0016\u0010(\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008[\u0010:R\u0016\u0010)\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\\\u0010:R\u0018\u0010*\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u0008]\u00105R\u0014\u0010\u000e\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008^\u0010:R\u0014\u0010\u000c\u001a\u00020\rX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008_\u0010`\u00a8\u0006\u0096\u0001"
    }
    d2 = {
        "Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;",
        "Lcom/discord/chat/bridge/codedlinks/GuildDisabledInviteEmbed;",
        "Lcom/discord/chat/bridge/codedlinks/GuildInviteExtendedEmbed;",
        "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;",
        "seen1",
        "",
        "seen2",
        "backgroundColor",
        "borderColor",
        "headerColor",
        "headerText",
        "",
        "type",
        "Lcom/discord/chat/bridge/codedlinks/InviteType;",
        "titleText",
        "subtitle",
        "helpCenterArticleLabel",
        "helpCenterArticleURL",
        "acceptLabelBackgroundColor",
        "acceptLabelBorderColor",
        "acceptLabelColor",
        "acceptLabelText",
        "bodyText",
        "bodyTextColor",
        "canBeAccepted",
        "",
        "channelIcon",
        "channelName",
        "embedCanBeTapped",
        "memberText",
        "onlineText",
        "resolvingGradientEnd",
        "resolvingGradientStart",
        "splashHasRadialGradient",
        "splashOpacity",
        "splashUrl",
        "inviteSplash",
        "subtitleColor",
        "thumbnailBackgroundColor",
        "thumbnailCornerRadius",
        "thumbnailText",
        "thumbnailUrl",
        "titleColor",
        "extendedType",
        "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;",
        "guildName",
        "guildIcon",
        "headerIcon",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(IIIIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getAcceptLabelBackgroundColor",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getAcceptLabelBorderColor",
        "getAcceptLabelColor",
        "getAcceptLabelText",
        "()Ljava/lang/String;",
        "getBackgroundColor",
        "()I",
        "getBodyText",
        "getBodyTextColor",
        "getBorderColor",
        "getCanBeAccepted",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getChannelIcon",
        "getChannelName",
        "getEmbedCanBeTapped",
        "getExtendedType",
        "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;",
        "getGuildIcon",
        "getGuildName",
        "getHeaderColor",
        "getHeaderIcon",
        "getHeaderText",
        "getHelpCenterArticleLabel",
        "getHelpCenterArticleURL",
        "getInviteSplash",
        "getMemberText",
        "getOnlineText",
        "getResolvingGradientEnd",
        "getResolvingGradientStart",
        "getSplashHasRadialGradient",
        "getSplashOpacity",
        "getSplashUrl",
        "getSubtitle",
        "getSubtitleColor",
        "getThumbnailBackgroundColor",
        "getThumbnailCornerRadius",
        "getThumbnailText",
        "getThumbnailUrl",
        "getTitleColor",
        "getTitleText",
        "getType",
        "()Lcom/discord/chat/bridge/codedlinks/InviteType;",
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
        "component26",
        "component27",
        "component28",
        "component29",
        "component3",
        "component30",
        "component31",
        "component32",
        "component33",
        "component34",
        "component35",
        "component36",
        "component37",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;",
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
.field public static final Companion:Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$Companion;


# instance fields
.field private final acceptLabelBackgroundColor:Ljava/lang/Integer;

.field private final acceptLabelBorderColor:Ljava/lang/Integer;

.field private final acceptLabelColor:Ljava/lang/Integer;

.field private final acceptLabelText:Ljava/lang/String;

.field private final backgroundColor:I

.field private final bodyText:Ljava/lang/String;

.field private final bodyTextColor:Ljava/lang/Integer;

.field private final borderColor:I

.field private final canBeAccepted:Ljava/lang/Boolean;

.field private final channelIcon:Ljava/lang/String;

.field private final channelName:Ljava/lang/String;

.field private final embedCanBeTapped:Ljava/lang/Boolean;

.field private final extendedType:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

.field private final guildIcon:Ljava/lang/String;

.field private final guildName:Ljava/lang/String;

.field private final headerColor:I

.field private final headerIcon:Ljava/lang/String;

.field private final headerText:Ljava/lang/String;

.field private final helpCenterArticleLabel:Ljava/lang/String;

.field private final helpCenterArticleURL:Ljava/lang/String;

.field private final inviteSplash:Ljava/lang/String;

.field private final memberText:Ljava/lang/String;

.field private final onlineText:Ljava/lang/String;

.field private final resolvingGradientEnd:Ljava/lang/Integer;

.field private final resolvingGradientStart:Ljava/lang/Integer;

.field private final splashHasRadialGradient:Ljava/lang/Boolean;

.field private final splashOpacity:Ljava/lang/Integer;

.field private final splashUrl:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final subtitleColor:Ljava/lang/Integer;

.field private final thumbnailBackgroundColor:Ljava/lang/Integer;

.field private final thumbnailCornerRadius:Ljava/lang/Integer;

.field private final thumbnailText:Ljava/lang/String;

.field private final thumbnailUrl:Ljava/lang/String;

.field private final titleColor:Ljava/lang/Integer;

.field private final titleText:Ljava/lang/String;

.field private final type:Lcom/discord/chat/bridge/codedlinks/InviteType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->Companion:Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IIIIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 7

    move-object v0, p0

    move v1, p1

    and-int/lit16 v2, v1, 0x1ff

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/16 v5, 0x1ff

    if-eq v5, v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    and-int/lit8 v5, p2, 0x4

    const/4 v6, 0x4

    if-eq v6, v5, :cond_1

    move v5, v4

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    or-int/2addr v2, v5

    if-eqz v2, :cond_2

    const/4 v2, 0x2

    new-array v5, v2, [I

    aput v1, v5, v3

    aput p2, v5, v4

    new-array v2, v2, [I

    .line 1
    fill-array-data v2, :array_0

    sget-object v3, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$$serializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$$serializer;

    invoke-virtual {v3}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v3

    invoke-static {v5, v2, v3}, Lzi/n1;->a([I[ILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_2
    const/4 v2, 0x0

    invoke-direct {p0, v2}, Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v3, p3

    iput v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->backgroundColor:I

    move v3, p4

    iput v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->borderColor:I

    move v3, p5

    iput v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->headerColor:I

    move-object v3, p6

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->headerText:Ljava/lang/String;

    move-object v3, p7

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->type:Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-object v3, p8

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->titleText:Ljava/lang/String;

    move-object/from16 v3, p9

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->subtitle:Ljava/lang/String;

    move-object/from16 v3, p10

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->helpCenterArticleLabel:Ljava/lang/String;

    move-object/from16 v3, p11

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->helpCenterArticleURL:Ljava/lang/String;

    and-int/lit16 v3, v1, 0x200

    if-nez v3, :cond_3

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->acceptLabelBackgroundColor:Ljava/lang/Integer;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p12

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->acceptLabelBackgroundColor:Ljava/lang/Integer;

    :goto_2
    and-int/lit16 v3, v1, 0x400

    if-nez v3, :cond_4

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->acceptLabelBorderColor:Ljava/lang/Integer;

    goto :goto_3

    :cond_4
    move-object/from16 v3, p13

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->acceptLabelBorderColor:Ljava/lang/Integer;

    :goto_3
    and-int/lit16 v3, v1, 0x800

    if-nez v3, :cond_5

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->acceptLabelColor:Ljava/lang/Integer;

    goto :goto_4

    :cond_5
    move-object/from16 v3, p14

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->acceptLabelColor:Ljava/lang/Integer;

    :goto_4
    and-int/lit16 v3, v1, 0x1000

    if-nez v3, :cond_6

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->acceptLabelText:Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object/from16 v3, p15

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->acceptLabelText:Ljava/lang/String;

    :goto_5
    and-int/lit16 v3, v1, 0x2000

    if-nez v3, :cond_7

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->bodyText:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v3, p16

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->bodyText:Ljava/lang/String;

    :goto_6
    and-int/lit16 v3, v1, 0x4000

    if-nez v3, :cond_8

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->bodyTextColor:Ljava/lang/Integer;

    goto :goto_7

    :cond_8
    move-object/from16 v3, p17

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->bodyTextColor:Ljava/lang/Integer;

    :goto_7
    const v3, 0x8000

    and-int/2addr v3, v1

    if-nez v3, :cond_9

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->canBeAccepted:Ljava/lang/Boolean;

    goto :goto_8

    :cond_9
    move-object/from16 v3, p18

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->canBeAccepted:Ljava/lang/Boolean;

    :goto_8
    const/high16 v3, 0x10000

    and-int/2addr v3, v1

    if-nez v3, :cond_a

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->channelIcon:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v3, p19

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->channelIcon:Ljava/lang/String;

    :goto_9
    const/high16 v3, 0x20000

    and-int/2addr v3, v1

    if-nez v3, :cond_b

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->channelName:Ljava/lang/String;

    goto :goto_a

    :cond_b
    move-object/from16 v3, p20

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->channelName:Ljava/lang/String;

    :goto_a
    const/high16 v3, 0x40000

    and-int/2addr v3, v1

    if-nez v3, :cond_c

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->embedCanBeTapped:Ljava/lang/Boolean;

    goto :goto_b

    :cond_c
    move-object/from16 v3, p21

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->embedCanBeTapped:Ljava/lang/Boolean;

    :goto_b
    const/high16 v3, 0x80000

    and-int/2addr v3, v1

    if-nez v3, :cond_d

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->memberText:Ljava/lang/String;

    goto :goto_c

    :cond_d
    move-object/from16 v3, p22

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->memberText:Ljava/lang/String;

    :goto_c
    const/high16 v3, 0x100000

    and-int/2addr v3, v1

    if-nez v3, :cond_e

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->onlineText:Ljava/lang/String;

    goto :goto_d

    :cond_e
    move-object/from16 v3, p23

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->onlineText:Ljava/lang/String;

    :goto_d
    const/high16 v3, 0x200000

    and-int/2addr v3, v1

    if-nez v3, :cond_f

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->resolvingGradientEnd:Ljava/lang/Integer;

    goto :goto_e

    :cond_f
    move-object/from16 v3, p24

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->resolvingGradientEnd:Ljava/lang/Integer;

    :goto_e
    const/high16 v3, 0x400000

    and-int/2addr v3, v1

    if-nez v3, :cond_10

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->resolvingGradientStart:Ljava/lang/Integer;

    goto :goto_f

    :cond_10
    move-object/from16 v3, p25

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->resolvingGradientStart:Ljava/lang/Integer;

    :goto_f
    const/high16 v3, 0x800000

    and-int/2addr v3, v1

    if-nez v3, :cond_11

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->splashHasRadialGradient:Ljava/lang/Boolean;

    goto :goto_10

    :cond_11
    move-object/from16 v3, p26

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->splashHasRadialGradient:Ljava/lang/Boolean;

    :goto_10
    const/high16 v3, 0x1000000

    and-int/2addr v3, v1

    if-nez v3, :cond_12

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->splashOpacity:Ljava/lang/Integer;

    goto :goto_11

    :cond_12
    move-object/from16 v3, p27

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->splashOpacity:Ljava/lang/Integer;

    :goto_11
    const/high16 v3, 0x2000000

    and-int/2addr v3, v1

    if-nez v3, :cond_13

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->splashUrl:Ljava/lang/String;

    goto :goto_12

    :cond_13
    move-object/from16 v3, p28

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->splashUrl:Ljava/lang/String;

    :goto_12
    const/high16 v3, 0x4000000

    and-int/2addr v3, v1

    if-nez v3, :cond_14

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->inviteSplash:Ljava/lang/String;

    goto :goto_13

    :cond_14
    move-object/from16 v3, p29

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->inviteSplash:Ljava/lang/String;

    :goto_13
    const/high16 v3, 0x8000000

    and-int/2addr v3, v1

    if-nez v3, :cond_15

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->subtitleColor:Ljava/lang/Integer;

    goto :goto_14

    :cond_15
    move-object/from16 v3, p30

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->subtitleColor:Ljava/lang/Integer;

    :goto_14
    const/high16 v3, 0x10000000

    and-int/2addr v3, v1

    if-nez v3, :cond_16

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->thumbnailBackgroundColor:Ljava/lang/Integer;

    goto :goto_15

    :cond_16
    move-object/from16 v3, p31

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->thumbnailBackgroundColor:Ljava/lang/Integer;

    :goto_15
    const/high16 v3, 0x20000000

    and-int/2addr v3, v1

    if-nez v3, :cond_17

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->thumbnailCornerRadius:Ljava/lang/Integer;

    goto :goto_16

    :cond_17
    move-object/from16 v3, p32

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->thumbnailCornerRadius:Ljava/lang/Integer;

    :goto_16
    const/high16 v3, 0x40000000    # 2.0f

    and-int/2addr v3, v1

    if-nez v3, :cond_18

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->thumbnailText:Ljava/lang/String;

    goto :goto_17

    :cond_18
    move-object/from16 v3, p33

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->thumbnailText:Ljava/lang/String;

    :goto_17
    const/high16 v3, -0x80000000

    and-int/2addr v1, v3

    if-nez v1, :cond_19

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->thumbnailUrl:Ljava/lang/String;

    goto :goto_18

    :cond_19
    move-object/from16 v1, p34

    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->thumbnailUrl:Ljava/lang/String;

    :goto_18
    and-int/lit8 v1, p2, 0x1

    if-nez v1, :cond_1a

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->titleColor:Ljava/lang/Integer;

    goto :goto_19

    :cond_1a
    move-object/from16 v1, p35

    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->titleColor:Ljava/lang/Integer;

    :goto_19
    and-int/lit8 v1, p2, 0x2

    if-nez v1, :cond_1b

    .line 2
    sget-object v1, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;->GUILD_INVITE_DISABLED:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    goto :goto_1a

    :cond_1b
    move-object/from16 v1, p36

    .line 3
    :goto_1a
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->extendedType:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-object/from16 v1, p37

    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->guildName:Ljava/lang/String;

    and-int/lit8 v1, p2, 0x8

    if-nez v1, :cond_1c

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->guildIcon:Ljava/lang/String;

    goto :goto_1b

    :cond_1c
    move-object/from16 v1, p38

    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->guildIcon:Ljava/lang/String;

    :goto_1b
    and-int/lit8 v1, p2, 0x10

    if-nez v1, :cond_1d

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->headerIcon:Ljava/lang/String;

    goto :goto_1c

    :cond_1d
    move-object/from16 v1, p39

    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->headerIcon:Ljava/lang/String;

    :goto_1c
    return-void

    nop

    :array_0
    .array-data 4
        0x1ff
        0x4
    .end array-data
.end method

.method public constructor <init>(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    move-object v0, p0

    move-object v1, p4

    move-object v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-object/from16 v7, p34

    move-object/from16 v8, p35

    const-string v9, "headerText"

    invoke-static {p4, v9}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "type"

    invoke-static {p5, v9}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "titleText"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "subtitle"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "helpCenterArticleLabel"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "helpCenterArticleURL"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "extendedType"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "guildName"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x0

    .line 6
    invoke-direct {p0, v9}, Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v9, p1

    .line 7
    iput v9, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->backgroundColor:I

    move v9, p2

    .line 8
    iput v9, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->borderColor:I

    move v9, p3

    .line 9
    iput v9, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->headerColor:I

    .line 10
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->headerText:Ljava/lang/String;

    .line 11
    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->type:Lcom/discord/chat/bridge/codedlinks/InviteType;

    .line 12
    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->titleText:Ljava/lang/String;

    .line 13
    iput-object v4, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->subtitle:Ljava/lang/String;

    .line 14
    iput-object v5, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->helpCenterArticleLabel:Ljava/lang/String;

    .line 15
    iput-object v6, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->helpCenterArticleURL:Ljava/lang/String;

    move-object/from16 v1, p10

    .line 16
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->acceptLabelBackgroundColor:Ljava/lang/Integer;

    move-object/from16 v1, p11

    .line 17
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->acceptLabelBorderColor:Ljava/lang/Integer;

    move-object/from16 v1, p12

    .line 18
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->acceptLabelColor:Ljava/lang/Integer;

    move-object/from16 v1, p13

    .line 19
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->acceptLabelText:Ljava/lang/String;

    move-object/from16 v1, p14

    .line 20
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->bodyText:Ljava/lang/String;

    move-object/from16 v1, p15

    .line 21
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->bodyTextColor:Ljava/lang/Integer;

    move-object/from16 v1, p16

    .line 22
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->canBeAccepted:Ljava/lang/Boolean;

    move-object/from16 v1, p17

    .line 23
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->channelIcon:Ljava/lang/String;

    move-object/from16 v1, p18

    .line 24
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->channelName:Ljava/lang/String;

    move-object/from16 v1, p19

    .line 25
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->embedCanBeTapped:Ljava/lang/Boolean;

    move-object/from16 v1, p20

    .line 26
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->memberText:Ljava/lang/String;

    move-object/from16 v1, p21

    .line 27
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->onlineText:Ljava/lang/String;

    move-object/from16 v1, p22

    .line 28
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->resolvingGradientEnd:Ljava/lang/Integer;

    move-object/from16 v1, p23

    .line 29
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->resolvingGradientStart:Ljava/lang/Integer;

    move-object/from16 v1, p24

    .line 30
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->splashHasRadialGradient:Ljava/lang/Boolean;

    move-object/from16 v1, p25

    .line 31
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->splashOpacity:Ljava/lang/Integer;

    move-object/from16 v1, p26

    .line 32
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->splashUrl:Ljava/lang/String;

    move-object/from16 v1, p27

    .line 33
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->inviteSplash:Ljava/lang/String;

    move-object/from16 v1, p28

    .line 34
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->subtitleColor:Ljava/lang/Integer;

    move-object/from16 v1, p29

    .line 35
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->thumbnailBackgroundColor:Ljava/lang/Integer;

    move-object/from16 v1, p30

    .line 36
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->thumbnailCornerRadius:Ljava/lang/Integer;

    move-object/from16 v1, p31

    .line 37
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->thumbnailText:Ljava/lang/String;

    move-object/from16 v1, p32

    .line 38
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->thumbnailUrl:Ljava/lang/String;

    move-object/from16 v1, p33

    .line 39
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->titleColor:Ljava/lang/Integer;

    .line 40
    iput-object v7, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->extendedType:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    .line 41
    iput-object v8, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->guildName:Ljava/lang/String;

    move-object/from16 v1, p36

    .line 42
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->guildIcon:Ljava/lang/String;

    move-object/from16 v1, p37

    .line 43
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->headerIcon:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 41

    move/from16 v0, p38

    and-int/lit16 v1, v0, 0x200

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v13, v2

    goto :goto_0

    :cond_0
    move-object/from16 v13, p10

    :goto_0
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_1

    move-object v14, v2

    goto :goto_1

    :cond_1
    move-object/from16 v14, p11

    :goto_1
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_2

    move-object v15, v2

    goto :goto_2

    :cond_2
    move-object/from16 v15, p12

    :goto_2
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_3

    move-object/from16 v16, v2

    goto :goto_3

    :cond_3
    move-object/from16 v16, p13

    :goto_3
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_4

    move-object/from16 v17, v2

    goto :goto_4

    :cond_4
    move-object/from16 v17, p14

    :goto_4
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_5

    move-object/from16 v18, v2

    goto :goto_5

    :cond_5
    move-object/from16 v18, p15

    :goto_5
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_6

    move-object/from16 v19, v2

    goto :goto_6

    :cond_6
    move-object/from16 v19, p16

    :goto_6
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_7

    move-object/from16 v20, v2

    goto :goto_7

    :cond_7
    move-object/from16 v20, p17

    :goto_7
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_8

    move-object/from16 v21, v2

    goto :goto_8

    :cond_8
    move-object/from16 v21, p18

    :goto_8
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_9

    move-object/from16 v22, v2

    goto :goto_9

    :cond_9
    move-object/from16 v22, p19

    :goto_9
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_a

    move-object/from16 v23, v2

    goto :goto_a

    :cond_a
    move-object/from16 v23, p20

    :goto_a
    const/high16 v1, 0x100000

    and-int/2addr v1, v0

    if-eqz v1, :cond_b

    move-object/from16 v24, v2

    goto :goto_b

    :cond_b
    move-object/from16 v24, p21

    :goto_b
    const/high16 v1, 0x200000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    move-object/from16 v25, v2

    goto :goto_c

    :cond_c
    move-object/from16 v25, p22

    :goto_c
    const/high16 v1, 0x400000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v26, v2

    goto :goto_d

    :cond_d
    move-object/from16 v26, p23

    :goto_d
    const/high16 v1, 0x800000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v27, v2

    goto :goto_e

    :cond_e
    move-object/from16 v27, p24

    :goto_e
    const/high16 v1, 0x1000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    move-object/from16 v28, v2

    goto :goto_f

    :cond_f
    move-object/from16 v28, p25

    :goto_f
    const/high16 v1, 0x2000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move-object/from16 v29, v2

    goto :goto_10

    :cond_10
    move-object/from16 v29, p26

    :goto_10
    const/high16 v1, 0x4000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_11

    move-object/from16 v30, v2

    goto :goto_11

    :cond_11
    move-object/from16 v30, p27

    :goto_11
    const/high16 v1, 0x8000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_12

    move-object/from16 v31, v2

    goto :goto_12

    :cond_12
    move-object/from16 v31, p28

    :goto_12
    const/high16 v1, 0x10000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_13

    move-object/from16 v32, v2

    goto :goto_13

    :cond_13
    move-object/from16 v32, p29

    :goto_13
    const/high16 v1, 0x20000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_14

    move-object/from16 v33, v2

    goto :goto_14

    :cond_14
    move-object/from16 v33, p30

    :goto_14
    const/high16 v1, 0x40000000    # 2.0f

    and-int/2addr v1, v0

    if-eqz v1, :cond_15

    move-object/from16 v34, v2

    goto :goto_15

    :cond_15
    move-object/from16 v34, p31

    :goto_15
    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_16

    move-object/from16 v35, v2

    goto :goto_16

    :cond_16
    move-object/from16 v35, p32

    :goto_16
    and-int/lit8 v0, p39, 0x1

    if-eqz v0, :cond_17

    move-object/from16 v36, v2

    goto :goto_17

    :cond_17
    move-object/from16 v36, p33

    :goto_17
    and-int/lit8 v0, p39, 0x2

    if-eqz v0, :cond_18

    .line 4
    sget-object v0, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;->GUILD_INVITE_DISABLED:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-object/from16 v37, v0

    goto :goto_18

    :cond_18
    move-object/from16 v37, p34

    :goto_18
    and-int/lit8 v0, p39, 0x8

    if-eqz v0, :cond_19

    move-object/from16 v39, v2

    goto :goto_19

    :cond_19
    move-object/from16 v39, p36

    :goto_19
    and-int/lit8 v0, p39, 0x10

    if-eqz v0, :cond_1a

    move-object/from16 v40, v2

    goto :goto_1a

    :cond_1a
    move-object/from16 v40, p37

    :goto_1a
    move-object/from16 v3, p0

    move/from16 v4, p1

    move/from16 v5, p2

    move/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v38, p35

    .line 5
    invoke-direct/range {v3 .. v40}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;-><init>(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;
    .locals 37

    move/from16 v0, p38

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBackgroundColor()I

    move-result v1

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBorderColor()I

    move-result v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderColor()I

    move-result v3

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderText()Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getType()Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-result-object v5

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getTitleText()Ljava/lang/String;

    move-result-object v6

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSubtitle()Ljava/lang/String;

    move-result-object v7

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHelpCenterArticleLabel()Ljava/lang/String;

    move-result-object v8

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHelpCenterArticleURL()Ljava/lang/String;

    move-result-object v9

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v10

    goto :goto_9

    :cond_9
    move-object/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v11

    goto :goto_a

    :cond_a
    move-object/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v12

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v13

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v14, v0, 0x2000

    if-eqz v14, :cond_d

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v14

    goto :goto_d

    :cond_d
    move-object/from16 v14, p14

    :goto_d
    and-int/lit16 v15, v0, 0x4000

    if-eqz v15, :cond_e

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v15

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v16

    goto :goto_f

    :cond_f
    move-object/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelIcon()Ljava/lang/String;

    move-result-object v17

    goto :goto_10

    :cond_10
    move-object/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelName()Ljava/lang/String;

    move-result-object v18

    goto :goto_11

    :cond_11
    move-object/from16 v18, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    if-eqz v19, :cond_12

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v19

    goto :goto_12

    :cond_12
    move-object/from16 v19, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v20, v0, v20

    if-eqz v20, :cond_13

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getMemberText()Ljava/lang/String;

    move-result-object v20

    goto :goto_13

    :cond_13
    move-object/from16 v20, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v21, v0, v21

    if-eqz v21, :cond_14

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getOnlineText()Ljava/lang/String;

    move-result-object v21

    goto :goto_14

    :cond_14
    move-object/from16 v21, p21

    :goto_14
    const/high16 v22, 0x200000

    and-int v22, v0, v22

    if-eqz v22, :cond_15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v22

    goto :goto_15

    :cond_15
    move-object/from16 v22, p22

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, v0, v23

    if-eqz v23, :cond_16

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v23

    goto :goto_16

    :cond_16
    move-object/from16 v23, p23

    :goto_16
    const/high16 v24, 0x800000

    and-int v24, v0, v24

    if-eqz v24, :cond_17

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v24

    goto :goto_17

    :cond_17
    move-object/from16 v24, p24

    :goto_17
    const/high16 v25, 0x1000000

    and-int v25, v0, v25

    if-eqz v25, :cond_18

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v25

    goto :goto_18

    :cond_18
    move-object/from16 v25, p25

    :goto_18
    const/high16 v26, 0x2000000

    and-int v26, v0, v26

    if-eqz v26, :cond_19

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v26

    goto :goto_19

    :cond_19
    move-object/from16 v26, p26

    :goto_19
    const/high16 v27, 0x4000000

    and-int v27, v0, v27

    if-eqz v27, :cond_1a

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v27

    goto :goto_1a

    :cond_1a
    move-object/from16 v27, p27

    :goto_1a
    const/high16 v28, 0x8000000

    and-int v28, v0, v28

    if-eqz v28, :cond_1b

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v28

    goto :goto_1b

    :cond_1b
    move-object/from16 v28, p28

    :goto_1b
    const/high16 v29, 0x10000000

    and-int v29, v0, v29

    if-eqz v29, :cond_1c

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v29

    goto :goto_1c

    :cond_1c
    move-object/from16 v29, p29

    :goto_1c
    const/high16 v30, 0x20000000

    and-int v30, v0, v30

    if-eqz v30, :cond_1d

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v30

    goto :goto_1d

    :cond_1d
    move-object/from16 v30, p30

    :goto_1d
    const/high16 v31, 0x40000000    # 2.0f

    and-int v31, v0, v31

    if-eqz v31, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v31

    goto :goto_1e

    :cond_1e
    move-object/from16 v31, p31

    :goto_1e
    const/high16 v32, -0x80000000

    and-int v0, v0, v32

    if-eqz v0, :cond_1f

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_1f

    :cond_1f
    move-object/from16 v0, p32

    :goto_1f
    and-int/lit8 v32, p39, 0x1

    if-eqz v32, :cond_20

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v32

    goto :goto_20

    :cond_20
    move-object/from16 v32, p33

    :goto_20
    and-int/lit8 v33, p39, 0x2

    if-eqz v33, :cond_21

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-result-object v33

    goto :goto_21

    :cond_21
    move-object/from16 v33, p34

    :goto_21
    and-int/lit8 v34, p39, 0x4

    if-eqz v34, :cond_22

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getGuildName()Ljava/lang/String;

    move-result-object v34

    goto :goto_22

    :cond_22
    move-object/from16 v34, p35

    :goto_22
    and-int/lit8 v35, p39, 0x8

    if-eqz v35, :cond_23

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getGuildIcon()Ljava/lang/String;

    move-result-object v35

    goto :goto_23

    :cond_23
    move-object/from16 v35, p36

    :goto_23
    and-int/lit8 v36, p39, 0x10

    if-eqz v36, :cond_24

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderIcon()Ljava/lang/String;

    move-result-object v36

    goto :goto_24

    :cond_24
    move-object/from16 v36, p37

    :goto_24
    move/from16 p1, v1

    move/from16 p2, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p16, v16

    move-object/from16 p17, v17

    move-object/from16 p18, v18

    move-object/from16 p19, v19

    move-object/from16 p20, v20

    move-object/from16 p21, v21

    move-object/from16 p22, v22

    move-object/from16 p23, v23

    move-object/from16 p24, v24

    move-object/from16 p25, v25

    move-object/from16 p26, v26

    move-object/from16 p27, v27

    move-object/from16 p28, v28

    move-object/from16 p29, v29

    move-object/from16 p30, v30

    move-object/from16 p31, v31

    move-object/from16 p32, v0

    move-object/from16 p33, v32

    move-object/from16 p34, v33

    move-object/from16 p35, v34

    move-object/from16 p36, v35

    move-object/from16 p37, v36

    invoke-virtual/range {p0 .. p37}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->copy(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;

    move-result-object v0

    return-object v0
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 5

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBackgroundColor()I

    move-result v0

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBorderColor()I

    move-result v0

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    const/4 v0, 0x2

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderColor()I

    move-result v3

    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderText()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    sget-object v0, Lcom/discord/chat/bridge/codedlinks/InviteType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/InviteType$Serializer;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getType()Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-result-object v3

    const/4 v4, 0x4

    invoke-interface {p1, p2, v4, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    const/4 v0, 0x5

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getTitleText()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v0, 0x6

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v0, 0x7

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHelpCenterArticleLabel()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHelpCenterArticleURL()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_0

    :goto_0
    move v3, v2

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_1
    if-eqz v3, :cond_2

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_2
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_2
    move v3, v2

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    move v3, v1

    :goto_3
    if-eqz v3, :cond_5

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_5
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_6

    :goto_4
    move v3, v2

    goto :goto_5

    :cond_6
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    move v3, v1

    :goto_5
    if-eqz v3, :cond_8

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_8
    const/16 v0, 0xc

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_9

    :goto_6
    move v3, v2

    goto :goto_7

    :cond_9
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_a

    goto :goto_6

    :cond_a
    move v3, v1

    :goto_7
    if-eqz v3, :cond_b

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_b
    const/16 v0, 0xd

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_c

    :goto_8
    move v3, v2

    goto :goto_9

    :cond_c
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_d

    goto :goto_8

    :cond_d
    move v3, v1

    :goto_9
    if-eqz v3, :cond_e

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_e
    const/16 v0, 0xe

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_f

    :goto_a
    move v3, v2

    goto :goto_b

    :cond_f
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_10

    goto :goto_a

    :cond_10
    move v3, v1

    :goto_b
    if-eqz v3, :cond_11

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0xf

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_12

    :goto_c
    move v3, v2

    goto :goto_d

    :cond_12
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_13

    goto :goto_c

    :cond_13
    move v3, v1

    :goto_d
    if-eqz v3, :cond_14

    sget-object v3, Lzi/h;->a:Lzi/h;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_14
    const/16 v0, 0x10

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_15

    :goto_e
    move v3, v2

    goto :goto_f

    :cond_15
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelIcon()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_16

    goto :goto_e

    :cond_16
    move v3, v1

    :goto_f
    if-eqz v3, :cond_17

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelIcon()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_17
    const/16 v0, 0x11

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_18

    :goto_10
    move v3, v2

    goto :goto_11

    :cond_18
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_19

    goto :goto_10

    :cond_19
    move v3, v1

    :goto_11
    if-eqz v3, :cond_1a

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_1a
    const/16 v0, 0x12

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_1b

    :goto_12
    move v3, v2

    goto :goto_13

    :cond_1b
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_1c

    goto :goto_12

    :cond_1c
    move v3, v1

    :goto_13
    if-eqz v3, :cond_1d

    sget-object v3, Lzi/h;->a:Lzi/h;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_1d
    const/16 v0, 0x13

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_1e

    :goto_14
    move v3, v2

    goto :goto_15

    :cond_1e
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getMemberText()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1f

    goto :goto_14

    :cond_1f
    move v3, v1

    :goto_15
    if-eqz v3, :cond_20

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getMemberText()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_20
    const/16 v0, 0x14

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_21

    :goto_16
    move v3, v2

    goto :goto_17

    :cond_21
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getOnlineText()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_22

    goto :goto_16

    :cond_22
    move v3, v1

    :goto_17
    if-eqz v3, :cond_23

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getOnlineText()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_23
    const/16 v0, 0x15

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_24

    :goto_18
    move v3, v2

    goto :goto_19

    :cond_24
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_25

    goto :goto_18

    :cond_25
    move v3, v1

    :goto_19
    if-eqz v3, :cond_26

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_26
    const/16 v0, 0x16

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_27

    :goto_1a
    move v3, v2

    goto :goto_1b

    :cond_27
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_28

    goto :goto_1a

    :cond_28
    move v3, v1

    :goto_1b
    if-eqz v3, :cond_29

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_29
    const/16 v0, 0x17

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_2a

    :goto_1c
    move v3, v2

    goto :goto_1d

    :cond_2a
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_2b

    goto :goto_1c

    :cond_2b
    move v3, v1

    :goto_1d
    if-eqz v3, :cond_2c

    sget-object v3, Lzi/h;->a:Lzi/h;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_2c
    const/16 v0, 0x18

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_2d

    :goto_1e
    move v3, v2

    goto :goto_1f

    :cond_2d
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_2e

    goto :goto_1e

    :cond_2e
    move v3, v1

    :goto_1f
    if-eqz v3, :cond_2f

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_2f
    const/16 v0, 0x19

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_30

    :goto_20
    move v3, v2

    goto :goto_21

    :cond_30
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_31

    goto :goto_20

    :cond_31
    move v3, v1

    :goto_21
    if-eqz v3, :cond_32

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_32
    const/16 v0, 0x1a

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_33

    :goto_22
    move v3, v2

    goto :goto_23

    :cond_33
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_34

    goto :goto_22

    :cond_34
    move v3, v1

    :goto_23
    if-eqz v3, :cond_35

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_35
    const/16 v0, 0x1b

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_36

    :goto_24
    move v3, v2

    goto :goto_25

    :cond_36
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_37

    goto :goto_24

    :cond_37
    move v3, v1

    :goto_25
    if-eqz v3, :cond_38

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_38
    const/16 v0, 0x1c

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_39

    :goto_26
    move v3, v2

    goto :goto_27

    :cond_39
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_3a

    goto :goto_26

    :cond_3a
    move v3, v1

    :goto_27
    if-eqz v3, :cond_3b

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_3b
    const/16 v0, 0x1d

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_3c

    :goto_28
    move v0, v2

    goto :goto_29

    :cond_3c
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3d

    goto :goto_28

    :cond_3d
    move v0, v1

    :goto_29
    if-eqz v0, :cond_3e

    sget-object v0, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v3

    const/16 v4, 0x1d

    invoke-interface {p1, p2, v4, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_3e
    const/16 v0, 0x1e

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_3f

    :goto_2a
    move v0, v2

    goto :goto_2b

    :cond_3f
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_40

    goto :goto_2a

    :cond_40
    move v0, v1

    :goto_2b
    if-eqz v0, :cond_41

    sget-object v0, Lzi/a2;->a:Lzi/a2;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x1e

    invoke-interface {p1, p2, v4, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_41
    const/16 v0, 0x1f

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_42

    :goto_2c
    move v0, v2

    goto :goto_2d

    :cond_42
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_43

    goto :goto_2c

    :cond_43
    move v0, v1

    :goto_2d
    if-eqz v0, :cond_44

    sget-object v0, Lzi/a2;->a:Lzi/a2;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x1f

    invoke-interface {p1, p2, v4, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_44
    const/16 v0, 0x20

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_45

    :goto_2e
    move v0, v2

    goto :goto_2f

    :cond_45
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_46

    goto :goto_2e

    :cond_46
    move v0, v1

    :goto_2f
    if-eqz v0, :cond_47

    sget-object v0, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v3

    const/16 v4, 0x20

    invoke-interface {p1, p2, v4, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_47
    const/16 v0, 0x21

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_48

    :goto_30
    move v0, v2

    goto :goto_31

    :cond_48
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-result-object v0

    .line 2
    sget-object v3, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;->GUILD_INVITE_DISABLED:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    if-eq v0, v3, :cond_49

    goto :goto_30

    :cond_49
    move v0, v1

    :goto_31
    if-eqz v0, :cond_4a

    .line 3
    sget-object v0, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-result-object v3

    const/16 v4, 0x21

    invoke-interface {p1, p2, v4, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_4a
    const/16 v0, 0x22

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getGuildName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/16 v0, 0x23

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_4b

    :goto_32
    move v0, v2

    goto :goto_33

    :cond_4b
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getGuildIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4c

    goto :goto_32

    :cond_4c
    move v0, v1

    :goto_33
    if-eqz v0, :cond_4d

    sget-object v0, Lzi/a2;->a:Lzi/a2;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getGuildIcon()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x23

    invoke-interface {p1, p2, v4, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_4d
    const/16 v0, 0x24

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_4e

    :goto_34
    move v1, v2

    goto :goto_35

    :cond_4e
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4f

    goto :goto_34

    :cond_4f
    :goto_35
    if-eqz v1, :cond_50

    sget-object v0, Lzi/a2;->a:Lzi/a2;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderIcon()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x24

    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_50
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBackgroundColor()I

    move-result v0

    return v0
.end method

.method public final component10()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component11()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component12()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component15()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component16()Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelIcon()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component19()Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final component2()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBorderColor()I

    move-result v0

    return v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getMemberText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getOnlineText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component22()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component23()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component24()Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final component25()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component26()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component27()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component28()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component29()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component3()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderColor()I

    move-result v0

    return v0
.end method

.method public final component30()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component31()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component32()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component33()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component34()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-result-object v0

    return-object v0
.end method

.method public final component35()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getGuildName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component36()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getGuildIcon()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component37()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderIcon()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component5()Lcom/discord/chat/bridge/codedlinks/InviteType;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getType()Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-result-object v0

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getTitleText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHelpCenterArticleLabel()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHelpCenterArticleURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final copy(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;
    .locals 39

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

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

    move-object/from16 v25, p25

    move-object/from16 v26, p26

    move-object/from16 v27, p27

    move-object/from16 v28, p28

    move-object/from16 v29, p29

    move-object/from16 v30, p30

    move-object/from16 v31, p31

    move-object/from16 v32, p32

    move-object/from16 v33, p33

    move-object/from16 v34, p34

    move-object/from16 v35, p35

    move-object/from16 v36, p36

    move-object/from16 v37, p37

    const-string v0, "headerText"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleText"

    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "helpCenterArticleLabel"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "helpCenterArticleURL"

    move-object/from16 v1, p9

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extendedType"

    move-object/from16 v1, p34

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "guildName"

    move-object/from16 v1, p35

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v38, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;

    move-object/from16 v0, v38

    move/from16 v1, p1

    invoke-direct/range {v0 .. v37}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;-><init>(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v38
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBackgroundColor()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBackgroundColor()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBorderColor()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBorderColor()I

    move-result v3

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderColor()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderColor()I

    move-result v3

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getType()Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getType()Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-result-object v3

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getTitleText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getTitleText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHelpCenterArticleLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHelpCenterArticleLabel()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHelpCenterArticleURL()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHelpCenterArticleURL()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelIcon()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelIcon()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getMemberText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getMemberText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getOnlineText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getOnlineText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-result-object v3

    if-eq v1, v3, :cond_23

    return v2

    :cond_23
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getGuildName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getGuildName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getGuildIcon()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getGuildIcon()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderIcon()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderIcon()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_26

    return v2

    :cond_26
    return v0
.end method

.method public getAcceptLabelBackgroundColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->acceptLabelBackgroundColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public getAcceptLabelBorderColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->acceptLabelBorderColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public getAcceptLabelColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->acceptLabelColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public getAcceptLabelText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->acceptLabelText:Ljava/lang/String;

    return-object v0
.end method

.method public getBackgroundColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->backgroundColor:I

    return v0
.end method

.method public getBodyText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->bodyText:Ljava/lang/String;

    return-object v0
.end method

.method public getBodyTextColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->bodyTextColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public getBorderColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->borderColor:I

    return v0
.end method

.method public getCanBeAccepted()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->canBeAccepted:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getChannelIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->channelIcon:Ljava/lang/String;

    return-object v0
.end method

.method public getChannelName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->channelName:Ljava/lang/String;

    return-object v0
.end method

.method public getEmbedCanBeTapped()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->embedCanBeTapped:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->extendedType:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    return-object v0
.end method

.method public getGuildIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->guildIcon:Ljava/lang/String;

    return-object v0
.end method

.method public getGuildName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->guildName:Ljava/lang/String;

    return-object v0
.end method

.method public getHeaderColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->headerColor:I

    return v0
.end method

.method public getHeaderIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->headerIcon:Ljava/lang/String;

    return-object v0
.end method

.method public getHeaderText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->headerText:Ljava/lang/String;

    return-object v0
.end method

.method public getHelpCenterArticleLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->helpCenterArticleLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getHelpCenterArticleURL()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->helpCenterArticleURL:Ljava/lang/String;

    return-object v0
.end method

.method public getInviteSplash()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->inviteSplash:Ljava/lang/String;

    return-object v0
.end method

.method public getMemberText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->memberText:Ljava/lang/String;

    return-object v0
.end method

.method public getOnlineText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->onlineText:Ljava/lang/String;

    return-object v0
.end method

.method public getResolvingGradientEnd()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->resolvingGradientEnd:Ljava/lang/Integer;

    return-object v0
.end method

.method public getResolvingGradientStart()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->resolvingGradientStart:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSplashHasRadialGradient()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->splashHasRadialGradient:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getSplashOpacity()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->splashOpacity:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSplashUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->splashUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public getSubtitleColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->subtitleColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public getThumbnailBackgroundColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->thumbnailBackgroundColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public getThumbnailCornerRadius()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->thumbnailCornerRadius:Ljava/lang/Integer;

    return-object v0
.end method

.method public getThumbnailText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->thumbnailText:Ljava/lang/String;

    return-object v0
.end method

.method public getThumbnailUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->thumbnailUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTitleColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->titleColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public getTitleText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->titleText:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Lcom/discord/chat/bridge/codedlinks/InviteType;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->type:Lcom/discord/chat/bridge/codedlinks/InviteType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBackgroundColor()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBorderColor()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderColor()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getType()Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getTitleText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHelpCenterArticleLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHelpCenterArticleURL()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelIcon()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelIcon()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getMemberText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_a

    :cond_a
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getMemberText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getOnlineText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_b

    :cond_b
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getOnlineText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_c

    :cond_c
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_d

    :cond_d
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_e

    :cond_e
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_f

    :cond_f
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_10

    move v1, v2

    goto :goto_10

    :cond_10
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_11

    :cond_11
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_11
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_12

    move v1, v2

    goto :goto_12

    :cond_12
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_12
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_13

    move v1, v2

    goto :goto_13

    :cond_13
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_14

    move v1, v2

    goto :goto_14

    :cond_14
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_14
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_15

    move v1, v2

    goto :goto_15

    :cond_15
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_16

    move v1, v2

    goto :goto_16

    :cond_16
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_16
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_17

    move v1, v2

    goto :goto_17

    :cond_17
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_17
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getGuildName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getGuildIcon()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_18

    move v1, v2

    goto :goto_18

    :cond_18
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getGuildIcon()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_18
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderIcon()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_19

    goto :goto_19

    :cond_19
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderIcon()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_19
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 39

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBackgroundColor()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBorderColor()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderColor()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getType()Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getTitleText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSubtitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHelpCenterArticleLabel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHelpCenterArticleURL()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v15

    move-object/from16 v16, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelIcon()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v17, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getChannelName()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v18, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v15

    move-object/from16 v19, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getMemberText()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v20, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getOnlineText()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v21, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v22, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v23, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v15

    move-object/from16 v24, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v25, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v26, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v27, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v28, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v29, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v30, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v31, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v32, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v33, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-result-object v15

    move-object/from16 v34, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getGuildName()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v35, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getGuildIcon()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v36, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->getHeaderIcon()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v37, v15

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v38, v14

    const-string v14, "GuildInviteDisabledEmbedImpl(backgroundColor="

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", borderColor="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", headerColor="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", headerText="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", titleText="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", helpCenterArticleLabel="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", helpCenterArticleURL="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", acceptLabelBackgroundColor="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", acceptLabelBorderColor="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", acceptLabelColor="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", acceptLabelText="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", bodyText="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", bodyTextColor="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v38

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", canBeAccepted="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v16

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", channelIcon="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", channelName="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v18

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", embedCanBeTapped="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v19

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", memberText="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v20

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", onlineText="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v21

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", resolvingGradientEnd="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v22

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", resolvingGradientStart="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v23

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", splashHasRadialGradient="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v24

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", splashOpacity="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v25

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", splashUrl="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v26

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", inviteSplash="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v27

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitleColor="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v28

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", thumbnailBackgroundColor="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v29

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", thumbnailCornerRadius="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v30

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", thumbnailText="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v31

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", thumbnailUrl="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v32

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", titleColor="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v33

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", extendedType="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v34

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", guildName="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v35

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", guildIcon="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v36

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", headerIcon="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v37

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
