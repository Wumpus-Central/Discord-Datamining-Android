.class public final Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;
.super Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;
.source "SourceFile"

# interfaces
.implements Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbed;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl$$serializer;,
        Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008V\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 \u0091\u00012\u00020\u00012\u00020\u0002:\u0004\u0090\u0001\u0091\u0001B\u00ee\u0002\u0008\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\n\u0012\u0008\u0010!\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010#\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010$\u001a\u0004\u0018\u00010%\u0012\u0008\u0010&\u001a\u0004\u0018\u00010\'\u0012\u0008\u0010(\u001a\u0004\u0018\u00010)\u0012\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010+\u0012\u0008\u0010,\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010-\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010.\u001a\u0004\u0018\u00010/\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100B\u0080\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0003\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020\'\u0012\u0008\u0008\u0002\u0010(\u001a\u00020)\u0012\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\n0+\u0012\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010-\u001a\u00020\n\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J\t\u0010^\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u00103J\u0010\u0010a\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0010\u0010b\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0010\u0010c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u00103J\u0010\u0010d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u00103J\u0010\u0010e\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0010\u0010f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u00103J\u000b\u0010g\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010i\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u00103J\u0010\u0010l\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u00103J\u0010\u0010m\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u00103J\u000b\u0010n\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u00103J\u000b\u0010q\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0019\u0010r\u001a\u00020%H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008s\u0010:J\u0019\u0010t\u001a\u00020\'H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008u\u0010:J\t\u0010v\u001a\u00020\u0004H\u00c6\u0003J\t\u0010w\u001a\u00020)H\u00c6\u0003J\u000f\u0010x\u001a\u0008\u0012\u0004\u0012\u00020\n0+H\u00c6\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010z\u001a\u00020\nH\u00c6\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u00103J\u0010\u0010~\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u00103J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u00103J\u000c\u0010\u0080\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u009b\u0003\u0010\u0081\u0001\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\u0008\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\n2\n\u0008\u0003\u0010\"\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010$\u001a\u00020%2\u0008\u0008\u0002\u0010&\u001a\u00020\'2\u0008\u0008\u0002\u0010(\u001a\u00020)2\u000e\u0008\u0002\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\n0+2\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010-\u001a\u00020\nH\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u0082\u0001\u0010\u0083\u0001J\u0016\u0010\u0084\u0001\u001a\u00020\u00142\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u00d6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0004H\u00d6\u0001J\n\u0010\u0088\u0001\u001a\u00020\nH\u00d6\u0001J(\u0010\u0089\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u008b\u0001\u001a\u00020\u00002\u0008\u0010\u008c\u0001\u001a\u00030\u008d\u00012\u0008\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u00c7\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\u00082\u00103R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\u00085\u00103R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\u00086\u00103R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u00108R\u001f\u0010$\u001a\u00020%X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\u00089\u0010:R\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010=R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u00108R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\u0008?\u00103R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010=R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\u0008A\u0010BR\u001f\u0010&\u001a\u00020\'X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\u0008D\u0010:R\u0016\u0010,\u001a\u0004\u0018\u00010\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u00108R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\u0008F\u0010BR\u0014\u0010(\u001a\u00020)X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010HR\u0014\u0010\u0008\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u0010=R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u00108R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008K\u00108R\u001a\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\n0+X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008L\u0010MR\u0014\u0010-\u001a\u00020\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u00108R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\u0008O\u00103R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\u0008P\u00103R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0014X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\u0008Q\u0010BR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\u0008R\u00103R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008S\u00108R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008T\u00108R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\u0008U\u00103R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\u0008V\u00103R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\u0008W\u00103R\u0016\u0010 \u001a\u0004\u0018\u00010\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008X\u00108R\u0016\u0010!\u001a\u0004\u0018\u00010\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Y\u00108R\u0018\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\u0008Z\u00103R\u0016\u0010#\u001a\u0004\u0018\u00010\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008[\u00108R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\\\u0010]\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0092\u0001"
    }
    d2 = {
        "Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;",
        "Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbed;",
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
        "acceptLabelBackgroundColor",
        "acceptLabelBorderColor",
        "acceptLabelColor",
        "acceptLabelText",
        "bodyText",
        "bodyTextColor",
        "canBeAccepted",
        "",
        "embedCanBeTapped",
        "resolvingGradientEnd",
        "resolvingGradientStart",
        "splashHasRadialGradient",
        "splashOpacity",
        "splashUrl",
        "inviteSplash",
        "subtitle",
        "subtitleColor",
        "thumbnailBackgroundColor",
        "thumbnailCornerRadius",
        "thumbnailText",
        "thumbnailUrl",
        "titleColor",
        "titleText",
        "applicationId",
        "Lcom/discord/primitives/ApplicationId;",
        "channelId",
        "Lcom/discord/primitives/ChannelId;",
        "extendedType",
        "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;",
        "participantAvatarUris",
        "",
        "description",
        "participantsText",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(IIIIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Lcom/discord/primitives/ChannelId;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JJLcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getAcceptLabelBackgroundColor",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getAcceptLabelBorderColor",
        "getAcceptLabelColor",
        "getAcceptLabelText",
        "()Ljava/lang/String;",
        "getApplicationId-VavddsQ",
        "()J",
        "J",
        "getBackgroundColor",
        "()I",
        "getBodyText",
        "getBodyTextColor",
        "getBorderColor",
        "getCanBeAccepted",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getChannelId-o4g7jtM",
        "getDescription",
        "getEmbedCanBeTapped",
        "getExtendedType",
        "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;",
        "getHeaderColor",
        "getHeaderText",
        "getInviteSplash",
        "getParticipantAvatarUris",
        "()Ljava/util/List;",
        "getParticipantsText",
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
        "component28-VavddsQ",
        "component29",
        "component29-o4g7jtM",
        "component3",
        "component30",
        "component31",
        "component32",
        "component33",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "copy-3qwsJ70",
        "(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JJLcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;",
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
.field public static final Companion:Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl$Companion;


# instance fields
.field private final acceptLabelBackgroundColor:Ljava/lang/Integer;

.field private final acceptLabelBorderColor:Ljava/lang/Integer;

.field private final acceptLabelColor:Ljava/lang/Integer;

.field private final acceptLabelText:Ljava/lang/String;

.field private final applicationId:J

.field private final backgroundColor:I

.field private final bodyText:Ljava/lang/String;

.field private final bodyTextColor:Ljava/lang/Integer;

.field private final borderColor:I

.field private final canBeAccepted:Ljava/lang/Boolean;

.field private final channelId:J

.field private final description:Ljava/lang/String;

.field private final embedCanBeTapped:Ljava/lang/Boolean;

.field private final extendedType:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

.field private final headerColor:I

.field private final headerText:Ljava/lang/String;

.field private final inviteSplash:Ljava/lang/String;

.field private final participantAvatarUris:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final participantsText:Ljava/lang/String;

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

    new-instance v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->Companion:Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl$Companion;

    return-void
.end method

.method private constructor <init>(IIIIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Lcom/discord/primitives/ChannelId;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIII",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/codedlinks/InviteType;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lcom/discord/primitives/ApplicationId;",
            "Lcom/discord/primitives/ChannelId;",
            "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move v1, p1

    const v2, 0x5800000f

    and-int v3, v1, v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v3, :cond_0

    move v2, v5

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    and-int/lit8 v3, p2, 0x1

    if-eq v5, v3, :cond_1

    move v3, v5

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    or-int/2addr v2, v3

    if-eqz v2, :cond_2

    const/4 v2, 0x2

    new-array v3, v2, [I

    aput v1, v3, v4

    aput p2, v3, v5

    new-array v2, v2, [I

    .line 1
    fill-array-data v2, :array_0

    sget-object v4, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl$$serializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl$$serializer;

    invoke-virtual {v4}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v4

    invoke-static {v3, v2, v4}, Lzi/n1;->a([I[ILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_2
    const/4 v2, 0x0

    invoke-direct {p0, v2}, Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v3, p3

    iput v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->backgroundColor:I

    move v3, p4

    iput v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->borderColor:I

    move v3, p5

    iput v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->headerColor:I

    move-object v3, p6

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->headerText:Ljava/lang/String;

    and-int/lit8 v3, v1, 0x10

    if-nez v3, :cond_3

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->type:Lcom/discord/chat/bridge/codedlinks/InviteType;

    goto :goto_2

    :cond_3
    move-object v3, p7

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->type:Lcom/discord/chat/bridge/codedlinks/InviteType;

    :goto_2
    and-int/lit8 v3, v1, 0x20

    if-nez v3, :cond_4

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->acceptLabelBackgroundColor:Ljava/lang/Integer;

    goto :goto_3

    :cond_4
    move-object v3, p8

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->acceptLabelBackgroundColor:Ljava/lang/Integer;

    :goto_3
    and-int/lit8 v3, v1, 0x40

    if-nez v3, :cond_5

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->acceptLabelBorderColor:Ljava/lang/Integer;

    goto :goto_4

    :cond_5
    move-object v3, p9

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->acceptLabelBorderColor:Ljava/lang/Integer;

    :goto_4
    and-int/lit16 v3, v1, 0x80

    if-nez v3, :cond_6

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->acceptLabelColor:Ljava/lang/Integer;

    goto :goto_5

    :cond_6
    move-object/from16 v3, p10

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->acceptLabelColor:Ljava/lang/Integer;

    :goto_5
    and-int/lit16 v3, v1, 0x100

    if-nez v3, :cond_7

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->acceptLabelText:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v3, p11

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->acceptLabelText:Ljava/lang/String;

    :goto_6
    and-int/lit16 v3, v1, 0x200

    if-nez v3, :cond_8

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->bodyText:Ljava/lang/String;

    goto :goto_7

    :cond_8
    move-object/from16 v3, p12

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->bodyText:Ljava/lang/String;

    :goto_7
    and-int/lit16 v3, v1, 0x400

    if-nez v3, :cond_9

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->bodyTextColor:Ljava/lang/Integer;

    goto :goto_8

    :cond_9
    move-object/from16 v3, p13

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->bodyTextColor:Ljava/lang/Integer;

    :goto_8
    and-int/lit16 v3, v1, 0x800

    if-nez v3, :cond_a

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->canBeAccepted:Ljava/lang/Boolean;

    goto :goto_9

    :cond_a
    move-object/from16 v3, p14

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->canBeAccepted:Ljava/lang/Boolean;

    :goto_9
    and-int/lit16 v3, v1, 0x1000

    if-nez v3, :cond_b

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->embedCanBeTapped:Ljava/lang/Boolean;

    goto :goto_a

    :cond_b
    move-object/from16 v3, p15

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->embedCanBeTapped:Ljava/lang/Boolean;

    :goto_a
    and-int/lit16 v3, v1, 0x2000

    if-nez v3, :cond_c

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->resolvingGradientEnd:Ljava/lang/Integer;

    goto :goto_b

    :cond_c
    move-object/from16 v3, p16

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->resolvingGradientEnd:Ljava/lang/Integer;

    :goto_b
    and-int/lit16 v3, v1, 0x4000

    if-nez v3, :cond_d

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->resolvingGradientStart:Ljava/lang/Integer;

    goto :goto_c

    :cond_d
    move-object/from16 v3, p17

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->resolvingGradientStart:Ljava/lang/Integer;

    :goto_c
    const v3, 0x8000

    and-int/2addr v3, v1

    if-nez v3, :cond_e

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->splashHasRadialGradient:Ljava/lang/Boolean;

    goto :goto_d

    :cond_e
    move-object/from16 v3, p18

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->splashHasRadialGradient:Ljava/lang/Boolean;

    :goto_d
    const/high16 v3, 0x10000

    and-int/2addr v3, v1

    if-nez v3, :cond_f

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->splashOpacity:Ljava/lang/Integer;

    goto :goto_e

    :cond_f
    move-object/from16 v3, p19

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->splashOpacity:Ljava/lang/Integer;

    :goto_e
    const/high16 v3, 0x20000

    and-int/2addr v3, v1

    if-nez v3, :cond_10

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->splashUrl:Ljava/lang/String;

    goto :goto_f

    :cond_10
    move-object/from16 v3, p20

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->splashUrl:Ljava/lang/String;

    :goto_f
    const/high16 v3, 0x40000

    and-int/2addr v3, v1

    if-nez v3, :cond_11

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->inviteSplash:Ljava/lang/String;

    goto :goto_10

    :cond_11
    move-object/from16 v3, p21

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->inviteSplash:Ljava/lang/String;

    :goto_10
    const/high16 v3, 0x80000

    and-int/2addr v3, v1

    if-nez v3, :cond_12

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->subtitle:Ljava/lang/String;

    goto :goto_11

    :cond_12
    move-object/from16 v3, p22

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->subtitle:Ljava/lang/String;

    :goto_11
    const/high16 v3, 0x100000

    and-int/2addr v3, v1

    if-nez v3, :cond_13

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->subtitleColor:Ljava/lang/Integer;

    goto :goto_12

    :cond_13
    move-object/from16 v3, p23

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->subtitleColor:Ljava/lang/Integer;

    :goto_12
    const/high16 v3, 0x200000

    and-int/2addr v3, v1

    if-nez v3, :cond_14

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->thumbnailBackgroundColor:Ljava/lang/Integer;

    goto :goto_13

    :cond_14
    move-object/from16 v3, p24

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->thumbnailBackgroundColor:Ljava/lang/Integer;

    :goto_13
    const/high16 v3, 0x400000

    and-int/2addr v3, v1

    if-nez v3, :cond_15

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->thumbnailCornerRadius:Ljava/lang/Integer;

    goto :goto_14

    :cond_15
    move-object/from16 v3, p25

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->thumbnailCornerRadius:Ljava/lang/Integer;

    :goto_14
    const/high16 v3, 0x800000

    and-int/2addr v3, v1

    if-nez v3, :cond_16

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->thumbnailText:Ljava/lang/String;

    goto :goto_15

    :cond_16
    move-object/from16 v3, p26

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->thumbnailText:Ljava/lang/String;

    :goto_15
    const/high16 v3, 0x1000000

    and-int/2addr v3, v1

    if-nez v3, :cond_17

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->thumbnailUrl:Ljava/lang/String;

    goto :goto_16

    :cond_17
    move-object/from16 v3, p27

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->thumbnailUrl:Ljava/lang/String;

    :goto_16
    const/high16 v3, 0x2000000

    and-int/2addr v3, v1

    if-nez v3, :cond_18

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->titleColor:Ljava/lang/Integer;

    goto :goto_17

    :cond_18
    move-object/from16 v3, p28

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->titleColor:Ljava/lang/Integer;

    :goto_17
    const/high16 v3, 0x4000000

    and-int/2addr v3, v1

    if-nez v3, :cond_19

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->titleText:Ljava/lang/String;

    goto :goto_18

    :cond_19
    move-object/from16 v3, p29

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->titleText:Ljava/lang/String;

    :goto_18
    invoke-virtual/range {p30 .. p30}, Lcom/discord/primitives/ApplicationId;->unbox-impl()J

    move-result-wide v3

    iput-wide v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->applicationId:J

    invoke-virtual/range {p31 .. p31}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    move-result-wide v3

    iput-wide v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->channelId:J

    const/high16 v3, 0x20000000

    and-int/2addr v3, v1

    if-nez v3, :cond_1a

    .line 2
    sget-object v3, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;->ACTIVITY_LAUNCHER:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    goto :goto_19

    :cond_1a
    move-object/from16 v3, p32

    .line 3
    :goto_19
    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->extendedType:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-object/from16 v3, p33

    iput-object v3, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->participantAvatarUris:Ljava/util/List;

    const/high16 v3, -0x80000000

    and-int/2addr v1, v3

    if-nez v1, :cond_1b

    iput-object v2, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->description:Ljava/lang/String;

    goto :goto_1a

    :cond_1b
    move-object/from16 v1, p34

    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->description:Ljava/lang/String;

    :goto_1a
    move-object/from16 v1, p35

    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->participantsText:Ljava/lang/String;

    return-void

    nop

    :array_0
    .array-data 4
        0x5800000f
        0x1
    .end array-data
.end method

.method public synthetic constructor <init>(IIIIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Lcom/discord/primitives/ChannelId;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p36}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;-><init>(IIIIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Lcom/discord/primitives/ChannelId;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JJLcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/codedlinks/InviteType;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "JJ",
            "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, v1}, Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v1, p1

    .line 7
    iput v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->backgroundColor:I

    move v1, p2

    .line 8
    iput v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->borderColor:I

    move v1, p3

    .line 9
    iput v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->headerColor:I

    move-object v1, p4

    .line 10
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->headerText:Ljava/lang/String;

    move-object v1, p5

    .line 11
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->type:Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-object v1, p6

    .line 12
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->acceptLabelBackgroundColor:Ljava/lang/Integer;

    move-object v1, p7

    .line 13
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->acceptLabelBorderColor:Ljava/lang/Integer;

    move-object v1, p8

    .line 14
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->acceptLabelColor:Ljava/lang/Integer;

    move-object v1, p9

    .line 15
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->acceptLabelText:Ljava/lang/String;

    move-object v1, p10

    .line 16
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->bodyText:Ljava/lang/String;

    move-object v1, p11

    .line 17
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->bodyTextColor:Ljava/lang/Integer;

    move-object v1, p12

    .line 18
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->canBeAccepted:Ljava/lang/Boolean;

    move-object/from16 v1, p13

    .line 19
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->embedCanBeTapped:Ljava/lang/Boolean;

    move-object/from16 v1, p14

    .line 20
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->resolvingGradientEnd:Ljava/lang/Integer;

    move-object/from16 v1, p15

    .line 21
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->resolvingGradientStart:Ljava/lang/Integer;

    move-object/from16 v1, p16

    .line 22
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->splashHasRadialGradient:Ljava/lang/Boolean;

    move-object/from16 v1, p17

    .line 23
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->splashOpacity:Ljava/lang/Integer;

    move-object/from16 v1, p18

    .line 24
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->splashUrl:Ljava/lang/String;

    move-object/from16 v1, p19

    .line 25
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->inviteSplash:Ljava/lang/String;

    move-object/from16 v1, p20

    .line 26
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->subtitle:Ljava/lang/String;

    move-object/from16 v1, p21

    .line 27
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->subtitleColor:Ljava/lang/Integer;

    move-object/from16 v1, p22

    .line 28
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->thumbnailBackgroundColor:Ljava/lang/Integer;

    move-object/from16 v1, p23

    .line 29
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->thumbnailCornerRadius:Ljava/lang/Integer;

    move-object/from16 v1, p24

    .line 30
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->thumbnailText:Ljava/lang/String;

    move-object/from16 v1, p25

    .line 31
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->thumbnailUrl:Ljava/lang/String;

    move-object/from16 v1, p26

    .line 32
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->titleColor:Ljava/lang/Integer;

    move-object/from16 v1, p27

    .line 33
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->titleText:Ljava/lang/String;

    move-wide/from16 v1, p28

    .line 34
    iput-wide v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->applicationId:J

    move-wide/from16 v1, p30

    .line 35
    iput-wide v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->channelId:J

    move-object/from16 v1, p32

    .line 36
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->extendedType:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-object/from16 v1, p33

    .line 37
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->participantAvatarUris:Ljava/util/List;

    move-object/from16 v1, p34

    .line 38
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->description:Ljava/lang/String;

    move-object/from16 v1, p35

    .line 39
    iput-object v1, v0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->participantsText:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JJLcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 40

    move/from16 v0, p36

    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object/from16 v8, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    move-object v9, v2

    goto :goto_1

    :cond_1
    move-object/from16 v9, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    move-object v10, v2

    goto :goto_2

    :cond_2
    move-object/from16 v10, p7

    :goto_2
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_3

    move-object v11, v2

    goto :goto_3

    :cond_3
    move-object/from16 v11, p8

    :goto_3
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_4

    move-object v12, v2

    goto :goto_4

    :cond_4
    move-object/from16 v12, p9

    :goto_4
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_5

    move-object v13, v2

    goto :goto_5

    :cond_5
    move-object/from16 v13, p10

    :goto_5
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_6

    move-object v14, v2

    goto :goto_6

    :cond_6
    move-object/from16 v14, p11

    :goto_6
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_7

    move-object v15, v2

    goto :goto_7

    :cond_7
    move-object/from16 v15, p12

    :goto_7
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_8

    move-object/from16 v16, v2

    goto :goto_8

    :cond_8
    move-object/from16 v16, p13

    :goto_8
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_9

    move-object/from16 v17, v2

    goto :goto_9

    :cond_9
    move-object/from16 v17, p14

    :goto_9
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_a

    move-object/from16 v18, v2

    goto :goto_a

    :cond_a
    move-object/from16 v18, p15

    :goto_a
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_b

    move-object/from16 v19, v2

    goto :goto_b

    :cond_b
    move-object/from16 v19, p16

    :goto_b
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    move-object/from16 v20, v2

    goto :goto_c

    :cond_c
    move-object/from16 v20, p17

    :goto_c
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v21, v2

    goto :goto_d

    :cond_d
    move-object/from16 v21, p18

    :goto_d
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v22, v2

    goto :goto_e

    :cond_e
    move-object/from16 v22, p19

    :goto_e
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    move-object/from16 v23, v2

    goto :goto_f

    :cond_f
    move-object/from16 v23, p20

    :goto_f
    const/high16 v1, 0x100000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move-object/from16 v24, v2

    goto :goto_10

    :cond_10
    move-object/from16 v24, p21

    :goto_10
    const/high16 v1, 0x200000

    and-int/2addr v1, v0

    if-eqz v1, :cond_11

    move-object/from16 v25, v2

    goto :goto_11

    :cond_11
    move-object/from16 v25, p22

    :goto_11
    const/high16 v1, 0x400000

    and-int/2addr v1, v0

    if-eqz v1, :cond_12

    move-object/from16 v26, v2

    goto :goto_12

    :cond_12
    move-object/from16 v26, p23

    :goto_12
    const/high16 v1, 0x800000

    and-int/2addr v1, v0

    if-eqz v1, :cond_13

    move-object/from16 v27, v2

    goto :goto_13

    :cond_13
    move-object/from16 v27, p24

    :goto_13
    const/high16 v1, 0x1000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_14

    move-object/from16 v28, v2

    goto :goto_14

    :cond_14
    move-object/from16 v28, p25

    :goto_14
    const/high16 v1, 0x2000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_15

    move-object/from16 v29, v2

    goto :goto_15

    :cond_15
    move-object/from16 v29, p26

    :goto_15
    const/high16 v1, 0x4000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_16

    move-object/from16 v30, v2

    goto :goto_16

    :cond_16
    move-object/from16 v30, p27

    :goto_16
    const/high16 v1, 0x20000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_17

    .line 4
    sget-object v1, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;->ACTIVITY_LAUNCHER:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-object/from16 v35, v1

    goto :goto_17

    :cond_17
    move-object/from16 v35, p32

    :goto_17
    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_18

    move-object/from16 v37, v2

    goto :goto_18

    :cond_18
    move-object/from16 v37, p34

    :goto_18
    const/16 v39, 0x0

    move-object/from16 v3, p0

    move/from16 v4, p1

    move/from16 v5, p2

    move/from16 v6, p3

    move-object/from16 v7, p4

    move-wide/from16 v31, p28

    move-wide/from16 v33, p30

    move-object/from16 v36, p33

    move-object/from16 v38, p35

    .line 5
    invoke-direct/range {v3 .. v39}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;-><init>(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JJLcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JJLcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p35}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;-><init>(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JJLcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy-3qwsJ70$default(Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JJLcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;
    .locals 35

    move/from16 v0, p36

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBackgroundColor()I

    move-result v1

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBorderColor()I

    move-result v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getHeaderColor()I

    move-result v3

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getHeaderText()Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getType()Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-result-object v5

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v6

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v7

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v8

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v9

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v10

    goto :goto_9

    :cond_9
    move-object/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v11

    goto :goto_a

    :cond_a
    move-object/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v12

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v13

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v14, v0, 0x2000

    if-eqz v14, :cond_d

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v14

    goto :goto_d

    :cond_d
    move-object/from16 v14, p14

    :goto_d
    and-int/lit16 v15, v0, 0x4000

    if-eqz v15, :cond_e

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v15

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v16

    goto :goto_f

    :cond_f
    move-object/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v17

    goto :goto_10

    :cond_10
    move-object/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v18

    goto :goto_11

    :cond_11
    move-object/from16 v18, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    if-eqz v19, :cond_12

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v19

    goto :goto_12

    :cond_12
    move-object/from16 v19, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v20, v0, v20

    if-eqz v20, :cond_13

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitle()Ljava/lang/String;

    move-result-object v20

    goto :goto_13

    :cond_13
    move-object/from16 v20, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v21, v0, v21

    if-eqz v21, :cond_14

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v21

    goto :goto_14

    :cond_14
    move-object/from16 v21, p21

    :goto_14
    const/high16 v22, 0x200000

    and-int v22, v0, v22

    if-eqz v22, :cond_15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v22

    goto :goto_15

    :cond_15
    move-object/from16 v22, p22

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, v0, v23

    if-eqz v23, :cond_16

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v23

    goto :goto_16

    :cond_16
    move-object/from16 v23, p23

    :goto_16
    const/high16 v24, 0x800000

    and-int v24, v0, v24

    if-eqz v24, :cond_17

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v24

    goto :goto_17

    :cond_17
    move-object/from16 v24, p24

    :goto_17
    const/high16 v25, 0x1000000

    and-int v25, v0, v25

    if-eqz v25, :cond_18

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v25

    goto :goto_18

    :cond_18
    move-object/from16 v25, p25

    :goto_18
    const/high16 v26, 0x2000000

    and-int v26, v0, v26

    if-eqz v26, :cond_19

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v26

    goto :goto_19

    :cond_19
    move-object/from16 v26, p26

    :goto_19
    const/high16 v27, 0x4000000

    and-int v27, v0, v27

    if-eqz v27, :cond_1a

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleText()Ljava/lang/String;

    move-result-object v27

    goto :goto_1a

    :cond_1a
    move-object/from16 v27, p27

    :goto_1a
    const/high16 v28, 0x8000000

    and-int v28, v0, v28

    if-eqz v28, :cond_1b

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getApplicationId-VavddsQ()J

    move-result-wide v28

    goto :goto_1b

    :cond_1b
    move-wide/from16 v28, p28

    :goto_1b
    const/high16 v30, 0x10000000

    and-int v30, v0, v30

    if-eqz v30, :cond_1c

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getChannelId-o4g7jtM()J

    move-result-wide v30

    goto :goto_1c

    :cond_1c
    move-wide/from16 v30, p30

    :goto_1c
    const/high16 v32, 0x20000000

    and-int v32, v0, v32

    if-eqz v32, :cond_1d

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-result-object v32

    goto :goto_1d

    :cond_1d
    move-object/from16 v32, p32

    :goto_1d
    const/high16 v33, 0x40000000    # 2.0f

    and-int v33, v0, v33

    if-eqz v33, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getParticipantAvatarUris()Ljava/util/List;

    move-result-object v33

    goto :goto_1e

    :cond_1e
    move-object/from16 v33, p33

    :goto_1e
    const/high16 v34, -0x80000000

    and-int v0, v0, v34

    if-eqz v0, :cond_1f

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getDescription()Ljava/lang/String;

    move-result-object v0

    goto :goto_1f

    :cond_1f
    move-object/from16 v0, p34

    :goto_1f
    and-int/lit8 v34, p37, 0x1

    if-eqz v34, :cond_20

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getParticipantsText()Ljava/lang/String;

    move-result-object v34

    goto :goto_20

    :cond_20
    move-object/from16 v34, p35

    :goto_20
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

    move-wide/from16 p28, v28

    move-wide/from16 p30, v30

    move-object/from16 p32, v32

    move-object/from16 p33, v33

    move-object/from16 p34, v0

    move-object/from16 p35, v34

    invoke-virtual/range {p0 .. p35}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->copy-3qwsJ70(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JJLcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;

    move-result-object v0

    return-object v0
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 6

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBackgroundColor()I

    move-result v0

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBorderColor()I

    move-result v0

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    const/4 v0, 0x2

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getHeaderColor()I

    move-result v3

    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    sget-object v0, Lzi/a2;->a:Lzi/a2;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getHeaderText()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    invoke-interface {p1, p2, v4, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_0

    :goto_0
    move v4, v2

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getType()Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-result-object v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    move v4, v1

    :goto_1
    if-eqz v4, :cond_2

    sget-object v4, Lcom/discord/chat/bridge/codedlinks/InviteType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/InviteType$Serializer;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getType()Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-result-object v5

    invoke-interface {p1, p2, v3, v4, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_2
    const/4 v3, 0x5

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_3

    :goto_2
    move v4, v2

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    move v4, v1

    :goto_3
    if-eqz v4, :cond_5

    sget-object v4, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {p1, p2, v3, v4, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_5
    const/4 v3, 0x6

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_6

    :goto_4
    move v4, v2

    goto :goto_5

    :cond_6
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_7

    goto :goto_4

    :cond_7
    move v4, v1

    :goto_5
    if-eqz v4, :cond_8

    sget-object v4, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {p1, p2, v3, v4, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_8
    const/4 v3, 0x7

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_9

    :goto_6
    move v4, v2

    goto :goto_7

    :cond_9
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_a

    goto :goto_6

    :cond_a
    move v4, v1

    :goto_7
    if-eqz v4, :cond_b

    sget-object v4, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {p1, p2, v3, v4, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_b
    const/16 v3, 0x8

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_c

    :goto_8
    move v4, v2

    goto :goto_9

    :cond_c
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_d

    goto :goto_8

    :cond_d
    move v4, v1

    :goto_9
    if-eqz v4, :cond_e

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v3, v0, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_e
    const/16 v3, 0x9

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_f

    :goto_a
    move v4, v2

    goto :goto_b

    :cond_f
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_10

    goto :goto_a

    :cond_10
    move v4, v1

    :goto_b
    if-eqz v4, :cond_11

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v3, v0, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_11
    const/16 v3, 0xa

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_12

    :goto_c
    move v4, v2

    goto :goto_d

    :cond_12
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_13

    goto :goto_c

    :cond_13
    move v4, v1

    :goto_d
    if-eqz v4, :cond_14

    sget-object v4, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {p1, p2, v3, v4, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_14
    const/16 v3, 0xb

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_15

    :goto_e
    move v4, v2

    goto :goto_f

    :cond_15
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_16

    goto :goto_e

    :cond_16
    move v4, v1

    :goto_f
    if-eqz v4, :cond_17

    sget-object v4, Lzi/h;->a:Lzi/h;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v5

    invoke-interface {p1, p2, v3, v4, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_17
    const/16 v3, 0xc

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_18

    :goto_10
    move v4, v2

    goto :goto_11

    :cond_18
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_19

    goto :goto_10

    :cond_19
    move v4, v1

    :goto_11
    if-eqz v4, :cond_1a

    sget-object v4, Lzi/h;->a:Lzi/h;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v5

    invoke-interface {p1, p2, v3, v4, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_1a
    const/16 v3, 0xd

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_1b

    :goto_12
    move v4, v2

    goto :goto_13

    :cond_1b
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_1c

    goto :goto_12

    :cond_1c
    move v4, v1

    :goto_13
    if-eqz v4, :cond_1d

    sget-object v4, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {p1, p2, v3, v4, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_1d
    const/16 v3, 0xe

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_1e

    :goto_14
    move v4, v2

    goto :goto_15

    :cond_1e
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_1f

    goto :goto_14

    :cond_1f
    move v4, v1

    :goto_15
    if-eqz v4, :cond_20

    sget-object v4, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {p1, p2, v3, v4, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_20
    const/16 v3, 0xf

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_21

    :goto_16
    move v4, v2

    goto :goto_17

    :cond_21
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_22

    goto :goto_16

    :cond_22
    move v4, v1

    :goto_17
    if-eqz v4, :cond_23

    sget-object v4, Lzi/h;->a:Lzi/h;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v5

    invoke-interface {p1, p2, v3, v4, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_23
    const/16 v3, 0x10

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_24

    :goto_18
    move v4, v2

    goto :goto_19

    :cond_24
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_25

    goto :goto_18

    :cond_25
    move v4, v1

    :goto_19
    if-eqz v4, :cond_26

    sget-object v4, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {p1, p2, v3, v4, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_26
    const/16 v3, 0x11

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_27

    :goto_1a
    move v4, v2

    goto :goto_1b

    :cond_27
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_28

    goto :goto_1a

    :cond_28
    move v4, v1

    :goto_1b
    if-eqz v4, :cond_29

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v3, v0, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_29
    const/16 v3, 0x12

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_2a

    :goto_1c
    move v4, v2

    goto :goto_1d

    :cond_2a
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2b

    goto :goto_1c

    :cond_2b
    move v4, v1

    :goto_1d
    if-eqz v4, :cond_2c

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v3, v0, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_2c
    const/16 v3, 0x13

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_2d

    :goto_1e
    move v4, v2

    goto :goto_1f

    :cond_2d
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2e

    goto :goto_1e

    :cond_2e
    move v4, v1

    :goto_1f
    if-eqz v4, :cond_2f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v3, v0, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_2f
    const/16 v3, 0x14

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_30

    :goto_20
    move v4, v2

    goto :goto_21

    :cond_30
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_31

    goto :goto_20

    :cond_31
    move v4, v1

    :goto_21
    if-eqz v4, :cond_32

    sget-object v4, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {p1, p2, v3, v4, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_32
    const/16 v3, 0x15

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_33

    :goto_22
    move v4, v2

    goto :goto_23

    :cond_33
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_34

    goto :goto_22

    :cond_34
    move v4, v1

    :goto_23
    if-eqz v4, :cond_35

    sget-object v4, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {p1, p2, v3, v4, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_35
    const/16 v3, 0x16

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_36

    :goto_24
    move v4, v2

    goto :goto_25

    :cond_36
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_37

    goto :goto_24

    :cond_37
    move v4, v1

    :goto_25
    if-eqz v4, :cond_38

    sget-object v4, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {p1, p2, v3, v4, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_38
    const/16 v3, 0x17

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_39

    :goto_26
    move v4, v2

    goto :goto_27

    :cond_39
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3a

    goto :goto_26

    :cond_3a
    move v4, v1

    :goto_27
    if-eqz v4, :cond_3b

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v3, v0, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_3b
    const/16 v3, 0x18

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_3c

    :goto_28
    move v3, v2

    goto :goto_29

    :cond_3c
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3d

    goto :goto_28

    :cond_3d
    move v3, v1

    :goto_29
    if-eqz v3, :cond_3e

    const/16 v3, 0x18

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v3, v0, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_3e
    const/16 v3, 0x19

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_3f

    :goto_2a
    move v3, v2

    goto :goto_2b

    :cond_3f
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_40

    goto :goto_2a

    :cond_40
    move v3, v1

    :goto_2b
    if-eqz v3, :cond_41

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v4

    const/16 v5, 0x19

    invoke-interface {p1, p2, v5, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_41
    const/16 v3, 0x1a

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_42

    :goto_2c
    move v3, v2

    goto :goto_2d

    :cond_42
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleText()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_43

    goto :goto_2c

    :cond_43
    move v3, v1

    :goto_2d
    if-eqz v3, :cond_44

    const/16 v3, 0x1a

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleText()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v3, v0, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_44
    sget-object v3, Lcom/discord/primitives/ApplicationId$$serializer;->INSTANCE:Lcom/discord/primitives/ApplicationId$$serializer;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getApplicationId-VavddsQ()J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/discord/primitives/ApplicationId;->box-impl(J)Lcom/discord/primitives/ApplicationId;

    move-result-object v4

    const/16 v5, 0x1b

    invoke-interface {p1, p2, v5, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    sget-object v3, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getChannelId-o4g7jtM()J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/discord/primitives/ChannelId;->box-impl(J)Lcom/discord/primitives/ChannelId;

    move-result-object v4

    const/16 v5, 0x1c

    invoke-interface {p1, p2, v5, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    const/16 v3, 0x1d

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_45

    :goto_2e
    move v3, v2

    goto :goto_2f

    :cond_45
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-result-object v3

    .line 2
    sget-object v4, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;->ACTIVITY_LAUNCHER:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    if-eq v3, v4, :cond_46

    goto :goto_2e

    :cond_46
    move v3, v1

    :goto_2f
    if-eqz v3, :cond_47

    .line 3
    sget-object v3, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-result-object v4

    const/16 v5, 0x1d

    invoke-interface {p1, p2, v5, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_47
    new-instance v3, Lzi/f;

    invoke-direct {v3, v0}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getParticipantAvatarUris()Ljava/util/List;

    move-result-object v4

    const/16 v5, 0x1e

    invoke-interface {p1, p2, v5, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    const/16 v3, 0x1f

    invoke-interface {p1, p2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_48

    :goto_30
    move v1, v2

    goto :goto_31

    :cond_48
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getDescription()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_49

    goto :goto_30

    :cond_49
    :goto_31
    if-eqz v1, :cond_4a

    const/16 v1, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_4a
    const/16 v0, 0x20

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getParticipantsText()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p2, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBackgroundColor()I

    move-result v0

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component11()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component12()Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final component13()Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final component14()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component15()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component16()Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final component17()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component2()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBorderColor()I

    move-result v0

    return v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component21()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component22()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component23()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component24()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component25()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component26()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component27()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component28-VavddsQ()J
    .locals 2

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getApplicationId-VavddsQ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final component29-o4g7jtM()J
    .locals 2

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getChannelId-o4g7jtM()J

    move-result-wide v0

    return-wide v0
.end method

.method public final component3()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getHeaderColor()I

    move-result v0

    return v0
.end method

.method public final component30()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-result-object v0

    return-object v0
.end method

.method public final component31()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getParticipantAvatarUris()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final component32()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getDescription()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component33()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getParticipantsText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getHeaderText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component5()Lcom/discord/chat/bridge/codedlinks/InviteType;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getType()Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-result-object v0

    return-object v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component8()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final copy-3qwsJ70(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JJLcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/codedlinks/InviteType;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "JJ",
            "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;"
        }
    .end annotation

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

    move-wide/from16 v28, p28

    move-wide/from16 v30, p30

    move-object/from16 v32, p32

    move-object/from16 v33, p33

    move-object/from16 v34, p34

    move-object/from16 v35, p35

    const-string v0, "extendedType"

    move-object/from16 v1, p32

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participantAvatarUris"

    move-object/from16 v1, p33

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participantsText"

    move-object/from16 v1, p35

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v37, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;

    move-object/from16 v0, v37

    const/16 v36, 0x0

    move/from16 v1, p1

    invoke-direct/range {v0 .. v36}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;-><init>(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JJLcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v37
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBackgroundColor()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBackgroundColor()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBorderColor()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBorderColor()I

    move-result v3

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getHeaderColor()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getHeaderColor()I

    move-result v3

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getHeaderText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getHeaderText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getType()Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getType()Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-result-object v3

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getApplicationId-VavddsQ()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getApplicationId-VavddsQ()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Lcom/discord/primitives/ApplicationId;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getChannelId-o4g7jtM()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getChannelId-o4g7jtM()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Lcom/discord/primitives/ChannelId;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-result-object v3

    if-eq v1, v3, :cond_1f

    return v2

    :cond_1f
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getParticipantAvatarUris()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getParticipantAvatarUris()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getParticipantsText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getParticipantsText()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_22

    return v2

    :cond_22
    return v0
.end method

.method public getAcceptLabelBackgroundColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->acceptLabelBackgroundColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public getAcceptLabelBorderColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->acceptLabelBorderColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public getAcceptLabelColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->acceptLabelColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public getAcceptLabelText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->acceptLabelText:Ljava/lang/String;

    return-object v0
.end method

.method public getApplicationId-VavddsQ()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->applicationId:J

    return-wide v0
.end method

.method public getBackgroundColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->backgroundColor:I

    return v0
.end method

.method public getBodyText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->bodyText:Ljava/lang/String;

    return-object v0
.end method

.method public getBodyTextColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->bodyTextColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public getBorderColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->borderColor:I

    return v0
.end method

.method public getCanBeAccepted()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->canBeAccepted:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getChannelId-o4g7jtM()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->channelId:J

    return-wide v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getEmbedCanBeTapped()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->embedCanBeTapped:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->extendedType:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    return-object v0
.end method

.method public getHeaderColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->headerColor:I

    return v0
.end method

.method public getHeaderText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->headerText:Ljava/lang/String;

    return-object v0
.end method

.method public getInviteSplash()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->inviteSplash:Ljava/lang/String;

    return-object v0
.end method

.method public getParticipantAvatarUris()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->participantAvatarUris:Ljava/util/List;

    return-object v0
.end method

.method public getParticipantsText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->participantsText:Ljava/lang/String;

    return-object v0
.end method

.method public getResolvingGradientEnd()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->resolvingGradientEnd:Ljava/lang/Integer;

    return-object v0
.end method

.method public getResolvingGradientStart()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->resolvingGradientStart:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSplashHasRadialGradient()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->splashHasRadialGradient:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getSplashOpacity()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->splashOpacity:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSplashUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->splashUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public getSubtitleColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->subtitleColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public getThumbnailBackgroundColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->thumbnailBackgroundColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public getThumbnailCornerRadius()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->thumbnailCornerRadius:Ljava/lang/Integer;

    return-object v0
.end method

.method public getThumbnailText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->thumbnailText:Ljava/lang/String;

    return-object v0
.end method

.method public getThumbnailUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->thumbnailUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTitleColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->titleColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public getTitleText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->titleText:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Lcom/discord/chat/bridge/codedlinks/InviteType;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->type:Lcom/discord/chat/bridge/codedlinks/InviteType;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBackgroundColor()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBorderColor()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getHeaderColor()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getHeaderText()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getHeaderText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getType()Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-result-object v1

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getType()Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_a

    :cond_a
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_b

    :cond_b
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_c

    :cond_c
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_d

    :cond_d
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_e

    :cond_e
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_f

    :cond_f
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_10

    move v1, v2

    goto :goto_10

    :cond_10
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_11

    :cond_11
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_11
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_12

    move v1, v2

    goto :goto_12

    :cond_12
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_12
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_13

    move v1, v2

    goto :goto_13

    :cond_13
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_14

    move v1, v2

    goto :goto_14

    :cond_14
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_14
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_15

    move v1, v2

    goto :goto_15

    :cond_15
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_16

    move v1, v2

    goto :goto_16

    :cond_16
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_16
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_17

    move v1, v2

    goto :goto_17

    :cond_17
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_17
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getApplicationId-VavddsQ()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/discord/primitives/ApplicationId;->hashCode-impl(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getChannelId-o4g7jtM()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/discord/primitives/ChannelId;->hashCode-impl(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getParticipantAvatarUris()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getDescription()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_18

    goto :goto_18

    :cond_18
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_18
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getParticipantsText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 35

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBackgroundColor()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBorderColor()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getHeaderColor()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getHeaderText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getType()Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBackgroundColor()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelBorderColor()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelColor()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getBodyTextColor()Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getCanBeAccepted()Ljava/lang/Boolean;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getEmbedCanBeTapped()Ljava/lang/Boolean;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientEnd()Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getResolvingGradientStart()Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashHasRadialGradient()Ljava/lang/Boolean;

    move-result-object v15

    move-object/from16 v16, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashOpacity()Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v17, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSplashUrl()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v18, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getInviteSplash()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v19, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitle()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v20, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getSubtitleColor()Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v21, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailBackgroundColor()Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v22, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailCornerRadius()Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v23, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailText()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v24, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v25, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleColor()Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v26, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getTitleText()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getApplicationId-VavddsQ()J

    move-result-wide v27

    move-object/from16 v29, v15

    invoke-static/range {v27 .. v28}, Lcom/discord/primitives/ApplicationId;->toString-impl(J)Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getChannelId-o4g7jtM()J

    move-result-wide v27

    move-object/from16 v30, v15

    invoke-static/range {v27 .. v28}, Lcom/discord/primitives/ChannelId;->toString-impl(J)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v27, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-result-object v15

    move-object/from16 v28, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getParticipantAvatarUris()Ljava/util/List;

    move-result-object v15

    move-object/from16 v31, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getDescription()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v32, v15

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->getParticipantsText()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v33, v15

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v34, v14

    const-string v14, "ActivityLauncherEmbedImpl(backgroundColor="

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

    const-string v0, ", acceptLabelBackgroundColor="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", acceptLabelBorderColor="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", acceptLabelColor="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", acceptLabelText="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", bodyText="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", bodyTextColor="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", canBeAccepted="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", embedCanBeTapped="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", resolvingGradientEnd="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", resolvingGradientStart="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v34

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", splashHasRadialGradient="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v16

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", splashOpacity="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", splashUrl="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v18

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", inviteSplash="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v19

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v20

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitleColor="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v21

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", thumbnailBackgroundColor="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v22

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", thumbnailCornerRadius="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v23

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", thumbnailText="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v24

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", thumbnailUrl="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v25

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", titleColor="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v26

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", titleText="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v29

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", applicationId="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v30

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", channelId="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v27

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", extendedType="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v28

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", participantAvatarUris="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v31

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", description="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v32

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", participantsText="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v33

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
