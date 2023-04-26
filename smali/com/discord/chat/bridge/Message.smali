.class public final Lcom/discord/chat/bridge/Message;
.super Lcom/discord/chat/bridge/MessageBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/Message$$serializer;,
        Lcom/discord/chat/bridge/Message$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\u0008\u00bb\u0001\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 \u00b3\u00022\u00020\u0001:\u0004\u00b2\u0002\u00b3\u0002B\u0096\u0006\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0001\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010$\u0012\u0008\u0010(\u001a\u0004\u0018\u00010\u0018\u0012\u0008\u0010)\u001a\u0004\u0018\u00010*\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$\u0012\u0008\u0010/\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u00100\u001a\u0004\u0018\u00010\u001e\u0012\u0010\u00101\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010$\u0012\u000e\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$\u0012\u0008\u00105\u001a\u0004\u0018\u000106\u0012\u0008\u00107\u001a\u0004\u0018\u000108\u0012\u0008\u00109\u001a\u0004\u0018\u00010:\u0012\u0006\u0010;\u001a\u00020\u001e\u0012\u0008\u0010<\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010=\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010>\u001a\u0004\u0018\u00010?\u0012\u0008\u0010@\u001a\u0004\u0018\u00010A\u0012\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010$\u0012\u0008\u0010D\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010E\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010F\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010G\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010I\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010J\u001a\u0004\u0018\u00010K\u0012\u0008\u0010L\u001a\u0004\u0018\u00010M\u0012\u0008\u0010N\u001a\u0004\u0018\u00010O\u0012\u0008\u0010P\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010Q\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010R\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010S\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010T\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$\u0012\u0008\u0010V\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010W\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010X\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010Y\u001a\u0004\u0018\u000104\u0012\u0008\u0010Z\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010[\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010\\\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010]\u001a\u0004\u0018\u00010^\u0012\u0006\u0010_\u001a\u00020\u001e\u0012\u0008\u0010`\u001a\u0004\u0018\u00010a\u0012\u0008\u0010b\u001a\u0004\u0018\u00010c\u0012\u000e\u0010d\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010$\u0012\u0008\u0010f\u001a\u0004\u0018\u00010e\u0012\u0008\u0010g\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010h\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010$\u0012\u0008\u0010k\u001a\u0004\u0018\u00010l\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010mB\u00ea\u0006\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001e\u0012\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\u0010\u0008\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\u0010\u0008\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010$\u0012\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u0018\u0012\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\u0010\u0008\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$\u0012\u0010\u0008\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$\u0012\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u001e\u0012\u0012\u0008\u0002\u00101\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010$\u0012\u0010\u0008\u0002\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$\u0012\n\u0008\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\u0008\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\u0008\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\u0006\u0010;\u001a\u00020\u001e\u0012\n\u0008\u0002\u0010<\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0002\u0010=\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0002\u0010>\u001a\u0004\u0018\u00010?\u0012\n\u0008\u0002\u0010@\u001a\u0004\u0018\u00010A\u0012\u0010\u0008\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010$\u0012\n\u0008\u0002\u0010D\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010E\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0002\u0010F\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010G\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0002\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010I\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010J\u001a\u0004\u0018\u00010K\u0012\n\u0008\u0002\u0010L\u001a\u0004\u0018\u00010M\u0012\n\u0008\u0002\u0010N\u001a\u0004\u0018\u00010O\u0012\n\u0008\u0002\u0010P\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0002\u0010Q\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0002\u0010R\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0002\u0010S\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010T\u001a\u0004\u0018\u00010\u0016\u0012\u0010\u0008\u0002\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$\u0012\n\u0008\u0002\u0010V\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0002\u0010W\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0002\u0010X\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0002\u0010Y\u001a\u0004\u0018\u000104\u0012\n\u0008\u0002\u0010Z\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010[\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010\\\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0002\u0010]\u001a\u0004\u0018\u00010^\u0012\u0008\u0008\u0002\u0010_\u001a\u00020\u001e\u0012\n\u0008\u0002\u0010`\u001a\u0004\u0018\u00010a\u0012\n\u0008\u0002\u0010b\u001a\u0004\u0018\u00010c\u0012\u0010\u0008\u0002\u0010d\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010$\u0012\n\u0008\u0002\u0010f\u001a\u0004\u0018\u00010e\u0012\n\u0008\u0002\u0010g\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010h\u001a\u0004\u0018\u00010\u0016\u0012\u0010\u0008\u0002\u0010i\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010$\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010nJ\n\u0010\u00d8\u0001\u001a\u00020\u0007H\u00c6\u0003J\u0011\u0010\u00d9\u0001\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010rJ\u000c\u0010\u00da\u0001\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000c\u0010\u00db\u0001\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0012\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008b\u0001J\u0012\u0010\u00dd\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008b\u0001J\n\u0010\u00de\u0001\u001a\u00020\u001eH\u00c6\u0003J\n\u0010\u00df\u0001\u001a\u00020\u001eH\u00c6\u0003J\u0012\u0010\u00e0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008b\u0001J\u0012\u0010\u00e1\u0001\u001a\u0004\u0018\u00010\u0016H\u00c0\u0003\u00a2\u0006\u0003\u0008\u00e2\u0001J\u000c\u0010\u00e3\u0001\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u001c\u0010\u00e4\u0001\u001a\u00020\tH\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00e5\u0001\u0010\u0081\u0001J\u0012\u0010\u00e6\u0001\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$H\u00c6\u0003J\u0012\u0010\u00e7\u0001\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010$H\u00c6\u0003J\u0011\u0010\u00e8\u0001\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010rJ\u000c\u0010\u00e9\u0001\u001a\u0004\u0018\u00010*H\u00c6\u0003J\u0012\u0010\u00ea\u0001\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$H\u00c6\u0003J\u0012\u0010\u00eb\u0001\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$H\u00c6\u0003J\u0011\u0010\u00ec\u0001\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0002\u0010wJ\u0011\u0010\u00ed\u0001\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0002\u0010wJ\u0014\u0010\u00ee\u0001\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010$H\u00c6\u0003J\u0012\u0010\u00ef\u0001\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$H\u00c6\u0003J\u001e\u0010\u00f0\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00f1\u0001\u0010\u0081\u0001J\u000c\u0010\u00f2\u0001\u001a\u0004\u0018\u000106H\u00c6\u0003J\u000c\u0010\u00f3\u0001\u001a\u0004\u0018\u000108H\u00c6\u0003J\u000c\u0010\u00f4\u0001\u001a\u0004\u0018\u00010:H\u00c6\u0003J\n\u0010\u00f5\u0001\u001a\u00020\u001eH\u00c6\u0003J\u0011\u0010\u00f6\u0001\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0002\u0010wJ\u0011\u0010\u00f7\u0001\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0002\u0010wJ\u000c\u0010\u00f8\u0001\u001a\u0004\u0018\u00010?H\u00c6\u0003J\u000c\u0010\u00f9\u0001\u001a\u0004\u0018\u00010AH\u00c6\u0003J\u0012\u0010\u00fa\u0001\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010$H\u00c6\u0003J\u000c\u0010\u00fb\u0001\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u001c\u0010\u00fc\u0001\u001a\u00020\u000cH\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00fd\u0001\u0010\u0087\u0001J\u0011\u0010\u00fe\u0001\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0002\u0010wJ\u000c\u0010\u00ff\u0001\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0011\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0002\u0010wJ\u0012\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008b\u0001J\u000c\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000c\u0010\u0083\u0002\u001a\u0004\u0018\u00010KH\u00c6\u0003J\u000c\u0010\u0084\u0002\u001a\u0004\u0018\u00010MH\u00c6\u0003J\u000c\u0010\u0085\u0002\u001a\u0004\u0018\u00010OH\u00c6\u0003J\u0011\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0002\u0010wJ\u0011\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0002\u0010wJ\u001b\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0003\u0008\u0089\u0002J\u0011\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0002\u0010wJ\u000c\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000c\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0012\u0010\u008d\u0002\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$H\u00c6\u0003J\u0011\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0002\u0010wJ\u0011\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0002\u0010wJ\u0012\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0003\u0010\u00b1\u0001J\u000c\u0010\u0091\u0002\u001a\u0004\u0018\u000104H\u00c6\u0003J\u000c\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000c\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000c\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0011\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0002\u0010wJ\u000c\u0010\u0096\u0002\u001a\u0004\u0018\u00010^H\u00c6\u0003J\n\u0010\u0097\u0002\u001a\u00020\u001eH\u00c6\u0003J\u000c\u0010\u0098\u0002\u001a\u0004\u0018\u00010aH\u00c6\u0003J\u000c\u0010\u0099\u0002\u001a\u0004\u0018\u00010cH\u00c6\u0003J\u0012\u0010\u009a\u0002\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010$H\u00c6\u0003J\u000c\u0010\u009b\u0002\u001a\u0004\u0018\u00010eH\u00c6\u0003J\u0012\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008b\u0001J\u000c\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0012\u0010\u009e\u0002\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010$H\u00c6\u0003J\u001b\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0003\u0008\u00a0\u0002J\n\u0010\u00a1\u0002\u001a\u00020\u0014H\u00c6\u0003J\u000c\u0010\u00a2\u0002\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0083\u0007\u0010\u00a3\u0002\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001e2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001e2\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u00162\u0010\u0008\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0010\u0008\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010$2\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010*2\u0010\u0008\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$2\u0010\u0008\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$2\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u001e2\u0012\u0008\u0002\u00101\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010$2\u0010\u0008\u0002\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$2\n\u0008\u0002\u00105\u001a\u0004\u0018\u0001062\n\u0008\u0002\u00107\u001a\u0004\u0018\u0001082\n\u0008\u0002\u00109\u001a\u0004\u0018\u00010:2\u0008\u0008\u0002\u0010;\u001a\u00020\u001e2\n\u0008\u0002\u0010<\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010=\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010>\u001a\u0004\u0018\u00010?2\n\u0008\u0002\u0010@\u001a\u0004\u0018\u00010A2\u0010\u0008\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010$2\n\u0008\u0002\u0010D\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010E\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010F\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010G\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010H\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010I\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010J\u001a\u0004\u0018\u00010K2\n\u0008\u0002\u0010L\u001a\u0004\u0018\u00010M2\n\u0008\u0002\u0010N\u001a\u0004\u0018\u00010O2\n\u0008\u0002\u0010P\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010Q\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010R\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010S\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010T\u001a\u0004\u0018\u00010\u00162\u0010\u0008\u0002\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$2\n\u0008\u0002\u0010V\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010W\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010X\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010Y\u001a\u0004\u0018\u0001042\n\u0008\u0002\u0010Z\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010[\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010\\\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010]\u001a\u0004\u0018\u00010^2\u0008\u0008\u0002\u0010_\u001a\u00020\u001e2\n\u0008\u0002\u0010`\u001a\u0004\u0018\u00010a2\n\u0008\u0002\u0010b\u001a\u0004\u0018\u00010c2\u0010\u0008\u0002\u0010d\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010$2\n\u0008\u0002\u0010f\u001a\u0004\u0018\u00010e2\n\u0008\u0002\u0010g\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010h\u001a\u0004\u0018\u00010\u00162\u0010\u0008\u0002\u0010i\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010$H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00a4\u0002\u0010\u00a5\u0002J\u0016\u0010\u00a6\u0002\u001a\u00020\u001e2\n\u0010\u00a7\u0002\u001a\u0005\u0018\u00010\u00a8\u0002H\u00d6\u0003J\n\u0010\u00a9\u0002\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u00aa\u0002\u001a\u00020\u0016H\u00d6\u0001J(\u0010\u00ab\u0002\u001a\u00030\u00ac\u00022\u0007\u0010\u00ad\u0002\u001a\u00020\u00002\u0008\u0010\u00ae\u0002\u001a\u00030\u00af\u00022\u0008\u0010\u00b0\u0002\u001a\u00030\u00b1\u0002H\u00c7\u0001R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010s\u0012\u0004\u0008o\u0010p\u001a\u0004\u0008q\u0010rR\u0013\u0010]\u001a\u0004\u0018\u00010^\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008t\u0010uR\u0015\u0010=\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\n\n\u0002\u0010x\u001a\u0004\u0008v\u0010wR\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010$\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008y\u0010zR\u0015\u0010(\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\n\n\u0002\u0010s\u001a\u0004\u0008{\u0010rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008|\u0010}R\u0013\u0010b\u001a\u0004\u0018\u00010c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008~\u0010\u007fR\u0015\u0010\"\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u0080\u0001\u0010\u0081\u0001R!\u0010!\u001a\u0004\u0018\u00010\u00168\u0000X\u0081\u0004\u00a2\u0006\u0011\n\u0000\u0012\u0005\u0008\u0082\u0001\u0010p\u001a\u0006\u0008\u0083\u0001\u0010\u0081\u0001R\u001a\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0084\u0001\u0010zR\u0015\u0010[\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u0085\u0001\u0010\u0081\u0001R\u001f\u0010\u000b\u001a\u00020\u000c\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\r\n\u0003\u0010\u0088\u0001\u001a\u0006\u0008\u0086\u0001\u0010\u0087\u0001R\u001c\u00101\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010$\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0089\u0001\u0010zR\u0018\u0010 \u001a\u0004\u0018\u00010\u0003\u00a2\u0006\r\n\u0003\u0010\u008c\u0001\u001a\u0006\u0008\u008a\u0001\u0010\u008b\u0001R\u0016\u0010E\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u000b\n\u0002\u0010x\u001a\u0005\u0008\u008d\u0001\u0010wR\u001a\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010$\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u008e\u0001\u0010zR\u0015\u00107\u001a\u0004\u0018\u000108\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u008f\u0001\u0010\u0090\u0001R\"\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00038FX\u0086\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001\u001a\u0006\u0008\u0092\u0001\u0010\u008b\u0001R\u0015\u0010)\u001a\u0004\u0018\u00010*\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u0095\u0001\u0010\u0096\u0001R\u0015\u0010T\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u0097\u0001\u0010\u0081\u0001R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u0098\u0001\u0010\u0081\u0001R\u001a\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0099\u0001\u0010zR\u0015\u0010J\u001a\u0004\u0018\u00010K\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u009a\u0001\u0010\u009b\u0001R\u0015\u0010@\u001a\u0004\u0018\u00010A\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u009c\u0001\u0010\u009d\u0001R\u0013\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u009e\u0001\u0010\u0087\u0001R\u0016\u0010<\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u000b\n\u0002\u0010x\u001a\u0005\u0008\u009f\u0001\u0010wR\u001a\u0010d\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010$\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a0\u0001\u0010zR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001R\u001f\u0010\u0008\u001a\u00020\t\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\r\n\u0003\u0010\u00a4\u0001\u001a\u0006\u0008\u00a3\u0001\u0010\u0081\u0001R\u0015\u0010N\u001a\u0004\u0018\u00010O\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00a5\u0001\u0010\u00a6\u0001R\u0015\u0010V\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\n\n\u0002\u0010x\u001a\u0004\u0008V\u0010wR\u0015\u0010R\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\n\n\u0002\u0010x\u001a\u0004\u0008R\u0010wR\u0012\u0010_\u001a\u00020\u001e\u00a2\u0006\t\n\u0000\u001a\u0005\u0008_\u0010\u00a7\u0001R\u0013\u0010;\u001a\u00020\u001e\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00a8\u0001\u0010\u00a7\u0001R\u0016\u0010W\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u000b\n\u0002\u0010x\u001a\u0005\u0008\u00a9\u0001\u0010wR!\u0010\n\u001a\u0004\u0018\u00010\t\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\r\n\u0003\u0010\u00a4\u0001\u001a\u0006\u0008\u00aa\u0001\u0010\u0081\u0001R\u0015\u0010I\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00ab\u0001\u0010\u0081\u0001R\u0015\u0010`\u001a\u0004\u0018\u00010a\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001R\u001a\u0010i\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010$\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00ae\u0001\u0010zR\u001a\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00af\u0001\u0010zR\u0018\u0010X\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\r\n\u0003\u0010\u00b2\u0001\u001a\u0006\u0008\u00b0\u0001\u0010\u00b1\u0001R\u001a\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b3\u0001\u0010zR\u0015\u0010>\u001a\u0004\u0018\u00010?\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001R\u0015\u0010f\u001a\u0004\u0018\u00010e\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\r\n\u0003\u0010\u008c\u0001\u001a\u0006\u0008\u00b8\u0001\u0010\u008b\u0001R\u0015\u00105\u001a\u0004\u0018\u000106\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00b9\u0001\u0010\u00ba\u0001R\u0013\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00bb\u0001\u0010\u00a7\u0001R\u0013\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00bc\u0001\u0010\u00a7\u0001R\u0016\u0010\\\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u000b\n\u0002\u0010x\u001a\u0005\u0008\u00bd\u0001\u0010wR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00be\u0001\u0010\u00bf\u0001R\u0015\u0010Y\u001a\u0004\u0018\u000104\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00c0\u0001\u0010\u00c1\u0001R\u0015\u0010Z\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00c2\u0001\u0010\u0081\u0001R\u001a\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00c3\u0001\u0010zR\u0015\u0010L\u001a\u0004\u0018\u00010M\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00c4\u0001\u0010\u00c5\u0001R\u0015\u0010h\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00c6\u0001\u0010\u0081\u0001R\u0018\u0010H\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\r\n\u0003\u0010\u008c\u0001\u001a\u0006\u0008\u00c7\u0001\u0010\u008b\u0001R\u0015\u0010F\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00c8\u0001\u0010\u0081\u0001R\u0016\u0010G\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u000b\n\u0002\u0010x\u001a\u0005\u0008\u00c9\u0001\u0010wR\u0015\u00109\u001a\u0004\u0018\u00010:\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00ca\u0001\u0010\u00cb\u0001R\u0015\u0010D\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00cc\u0001\u0010\u0081\u0001R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00cd\u0001\u0010\u0081\u0001R\u0015\u0010S\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00ce\u0001\u0010\u0081\u0001R\u0018\u0010g\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\r\n\u0003\u0010\u008c\u0001\u001a\u0006\u0008\u00cf\u0001\u0010\u008b\u0001R\u0013\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00d0\u0001\u0010\u00d1\u0001R\u0016\u00100\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u000b\n\u0002\u0010x\u001a\u0005\u0008\u00d2\u0001\u0010wR\u0016\u0010P\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u000b\n\u0002\u0010x\u001a\u0005\u0008\u00d3\u0001\u0010wR\u0016\u0010Q\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u000b\n\u0002\u0010x\u001a\u0005\u0008\u00d4\u0001\u0010wR\u0016\u0010/\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u000b\n\u0002\u0010x\u001a\u0005\u0008\u00d5\u0001\u0010wR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00d6\u0001\u0010\u0081\u0001R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\r\n\u0003\u0010\u008c\u0001\u001a\u0006\u0008\u00d7\u0001\u0010\u008b\u0001\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u00b4\u0002"
    }
    d2 = {
        "Lcom/discord/chat/bridge/Message;",
        "Lcom/discord/chat/bridge/MessageBase;",
        "seen1",
        "",
        "seen2",
        "seen3",
        "type",
        "Lcom/discord/chat/bridge/MessageType;",
        "id",
        "Lcom/discord/primitives/MessageId;",
        "nonce",
        "channelId",
        "Lcom/discord/primitives/ChannelId;",
        "guildId",
        "Lcom/discord/primitives/GuildId;",
        "state",
        "Lcom/discord/chat/bridge/MessageState;",
        "authorId",
        "Lcom/discord/primitives/UserId;",
        "flags",
        "",
        "edited",
        "",
        "_constrainedWidth",
        "",
        "timestamp",
        "username",
        "usernameColor",
        "roleColor",
        "shouldShowRoleDot",
        "",
        "shouldShowRoleOnName",
        "colorString",
        "avatarURL",
        "avatarDecorationURL",
        "embeds",
        "",
        "Lcom/discord/chat/bridge/embed/Embed;",
        "attachments",
        "Lcom/discord/chat/bridge/attachment/Attachment;",
        "attachmentsOpacity",
        "content",
        "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
        "progress",
        "Lcom/discord/chat/bridge/UploadProgress;",
        "reactions",
        "Lcom/discord/chat/bridge/reaction/MessageReaction;",
        "useSortedReactions",
        "useAddBurstReaction",
        "codedLinks",
        "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;",
        "stickers",
        "Lcom/discord/chat/bridge/sticker/Sticker;",
        "roleIcon",
        "Lcom/discord/chat/bridge/roleicons/RoleIcon;",
        "connectionsRoleTag",
        "Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;",
        "threadEmbed",
        "Lcom/discord/chat/bridge/threads/ThreadEmbed;",
        "mentioned",
        "gifAutoPlay",
        "animateEmoji",
        "referencedMessage",
        "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;",
        "executedCommand",
        "Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;",
        "components",
        "Lcom/discord/chat/bridge/botuikit/Component;",
        "threadStarterMessageHeader",
        "communicationDisabled",
        "tagText",
        "tagVerified",
        "tagBackgroundColor",
        "opTagText",
        "ephemeralIndication",
        "Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;",
        "surveyIndication",
        "Lcom/discord/chat/bridge/feedback/SurveyIndication;",
        "interactionStatus",
        "Lcom/discord/chat/bridge/interaction/InteractionStatus;",
        "useAttachmentGridLayout",
        "useAttachmentUploadPreview",
        "isCurrentUserMessageAuthor",
        "title",
        "description",
        "avatarURLs",
        "isCallActive",
        "missed",
        "rawMilliseconds",
        "sticker",
        "stickerLabel",
        "buttonLabel",
        "showInviteToSpeakButton",
        "activityInviteEmbed",
        "Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;",
        "isFirstForumPostMessage",
        "postActions",
        "Lcom/discord/chat/bridge/forums/ForumPostActions;",
        "autoModerationContext",
        "Lcom/discord/chat/bridge/automod/AutoModerationContext;",
        "giftCodes",
        "Lcom/discord/chat/bridge/gift/GiftEmbed;",
        "referralTrialOffer",
        "totalMonthsSubscribed",
        "swipeToReplyIconUrl",
        "postPreviewEmbeds",
        "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(IIILcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "get_constrainedWidth$annotations",
        "()V",
        "get_constrainedWidth",
        "()Ljava/lang/Float;",
        "Ljava/lang/Float;",
        "getActivityInviteEmbed",
        "()Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;",
        "getAnimateEmoji",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getAttachments",
        "()Ljava/util/List;",
        "getAttachmentsOpacity",
        "getAuthorId-wUX8bhU",
        "()Lcom/discord/primitives/UserId;",
        "getAutoModerationContext",
        "()Lcom/discord/chat/bridge/automod/AutoModerationContext;",
        "getAvatarDecorationURL",
        "()Ljava/lang/String;",
        "getAvatarURL$chat_release$annotations",
        "getAvatarURL$chat_release",
        "getAvatarURLs",
        "getButtonLabel",
        "getChannelId-o4g7jtM",
        "()J",
        "J",
        "getCodedLinks",
        "getColorString",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getCommunicationDisabled",
        "getComponents",
        "getConnectionsRoleTag",
        "()Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;",
        "constrainedWidth",
        "getConstrainedWidth",
        "constrainedWidth$delegate",
        "Lkotlin/Lazy;",
        "getContent",
        "()Lcom/discord/chat/bridge/structurabletext/StructurableText;",
        "getDescription",
        "getEdited",
        "getEmbeds",
        "getEphemeralIndication",
        "()Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;",
        "getExecutedCommand",
        "()Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;",
        "getFlags",
        "getGifAutoPlay",
        "getGiftCodes",
        "getGuildId-qOKuAAo",
        "()Lcom/discord/primitives/GuildId;",
        "getId-3Eiw7ao",
        "Ljava/lang/String;",
        "getInteractionStatus",
        "()Lcom/discord/chat/bridge/interaction/InteractionStatus;",
        "()Z",
        "getMentioned",
        "getMissed",
        "getNonce-N_6c4I0",
        "getOpTagText",
        "getPostActions",
        "()Lcom/discord/chat/bridge/forums/ForumPostActions;",
        "getPostPreviewEmbeds",
        "getProgress",
        "getRawMilliseconds",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getReactions",
        "getReferencedMessage",
        "()Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;",
        "getReferralTrialOffer",
        "()Lcom/discord/chat/bridge/gift/GiftEmbed;",
        "getRoleColor",
        "getRoleIcon",
        "()Lcom/discord/chat/bridge/roleicons/RoleIcon;",
        "getShouldShowRoleDot",
        "getShouldShowRoleOnName",
        "getShowInviteToSpeakButton",
        "getState",
        "()Lcom/discord/chat/bridge/MessageState;",
        "getSticker",
        "()Lcom/discord/chat/bridge/sticker/Sticker;",
        "getStickerLabel",
        "getStickers",
        "getSurveyIndication",
        "()Lcom/discord/chat/bridge/feedback/SurveyIndication;",
        "getSwipeToReplyIconUrl",
        "getTagBackgroundColor",
        "getTagText",
        "getTagVerified",
        "getThreadEmbed",
        "()Lcom/discord/chat/bridge/threads/ThreadEmbed;",
        "getThreadStarterMessageHeader",
        "getTimestamp",
        "getTitle",
        "getTotalMonthsSubscribed",
        "getType",
        "()Lcom/discord/chat/bridge/MessageType;",
        "getUseAddBurstReaction",
        "getUseAttachmentGridLayout",
        "getUseAttachmentUploadPreview",
        "getUseSortedReactions",
        "getUsername",
        "getUsernameColor",
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
        "component18$chat_release",
        "component19",
        "component2",
        "component2-3Eiw7ao",
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
        "component3-N_6c4I0",
        "component30",
        "component31",
        "component32",
        "component33",
        "component34",
        "component35",
        "component36",
        "component37",
        "component38",
        "component39",
        "component4",
        "component4-o4g7jtM",
        "component40",
        "component41",
        "component42",
        "component43",
        "component44",
        "component45",
        "component46",
        "component47",
        "component48",
        "component49",
        "component5",
        "component5-qOKuAAo",
        "component50",
        "component51",
        "component52",
        "component53",
        "component54",
        "component55",
        "component56",
        "component57",
        "component58",
        "component59",
        "component6",
        "component60",
        "component61",
        "component62",
        "component63",
        "component64",
        "component65",
        "component66",
        "component67",
        "component68",
        "component69",
        "component7",
        "component7-wUX8bhU",
        "component8",
        "component9",
        "copy",
        "copy-HxUhIIA",
        "(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/discord/chat/bridge/Message;",
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
.field public static final Companion:Lcom/discord/chat/bridge/Message$Companion;


# instance fields
.field private final _constrainedWidth:Ljava/lang/Float;

.field private final activityInviteEmbed:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

.field private final animateEmoji:Ljava/lang/Boolean;

.field private final attachments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/attachment/Attachment;",
            ">;"
        }
    .end annotation
.end field

.field private final attachmentsOpacity:Ljava/lang/Float;

.field private final authorId:Lcom/discord/primitives/UserId;

.field private final autoModerationContext:Lcom/discord/chat/bridge/automod/AutoModerationContext;

.field private final avatarDecorationURL:Ljava/lang/String;

.field private final avatarURL:Ljava/lang/String;

.field private final avatarURLs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final buttonLabel:Ljava/lang/String;

.field private final channelId:J

.field private final codedLinks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;",
            ">;"
        }
    .end annotation
.end field

.field private final colorString:Ljava/lang/Integer;

.field private final communicationDisabled:Ljava/lang/Boolean;

.field private final components:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/botuikit/Component;",
            ">;"
        }
    .end annotation
.end field

.field private final connectionsRoleTag:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

.field private final constrainedWidth$delegate:Lkotlin/Lazy;

.field private final content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

.field private final description:Ljava/lang/String;

.field private final edited:Ljava/lang/String;

.field private final embeds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/embed/Embed;",
            ">;"
        }
    .end annotation
.end field

.field private final ephemeralIndication:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;

.field private final executedCommand:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

.field private final flags:J

.field private final gifAutoPlay:Ljava/lang/Boolean;

.field private final giftCodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/gift/GiftEmbed;",
            ">;"
        }
    .end annotation
.end field

.field private final guildId:Lcom/discord/primitives/GuildId;

.field private final id:Ljava/lang/String;

.field private final interactionStatus:Lcom/discord/chat/bridge/interaction/InteractionStatus;

.field private final isCallActive:Ljava/lang/Boolean;

.field private final isCurrentUserMessageAuthor:Ljava/lang/Boolean;

.field private final isFirstForumPostMessage:Z

.field private final mentioned:Z

.field private final missed:Ljava/lang/Boolean;

.field private final nonce:Ljava/lang/String;

.field private final opTagText:Ljava/lang/String;

.field private final postActions:Lcom/discord/chat/bridge/forums/ForumPostActions;

.field private final postPreviewEmbeds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;",
            ">;"
        }
    .end annotation
.end field

.field private final progress:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/UploadProgress;",
            ">;"
        }
    .end annotation
.end field

.field private final rawMilliseconds:Ljava/lang/Long;

.field private final reactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/reaction/MessageReaction;",
            ">;"
        }
    .end annotation
.end field

.field private final referencedMessage:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

.field private final referralTrialOffer:Lcom/discord/chat/bridge/gift/GiftEmbed;

.field private final roleColor:Ljava/lang/Integer;

.field private final roleIcon:Lcom/discord/chat/bridge/roleicons/RoleIcon;

.field private final shouldShowRoleDot:Z

.field private final shouldShowRoleOnName:Z

.field private final showInviteToSpeakButton:Ljava/lang/Boolean;

.field private final state:Lcom/discord/chat/bridge/MessageState;

.field private final sticker:Lcom/discord/chat/bridge/sticker/Sticker;

.field private final stickerLabel:Ljava/lang/String;

.field private final stickers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/sticker/Sticker;",
            ">;"
        }
    .end annotation
.end field

.field private final surveyIndication:Lcom/discord/chat/bridge/feedback/SurveyIndication;

.field private final swipeToReplyIconUrl:Ljava/lang/String;

.field private final tagBackgroundColor:Ljava/lang/Integer;

.field private final tagText:Ljava/lang/String;

.field private final tagVerified:Ljava/lang/Boolean;

.field private final threadEmbed:Lcom/discord/chat/bridge/threads/ThreadEmbed;

.field private final threadStarterMessageHeader:Ljava/lang/String;

.field private final timestamp:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final totalMonthsSubscribed:Ljava/lang/Integer;

.field private final type:Lcom/discord/chat/bridge/MessageType;

.field private final useAddBurstReaction:Ljava/lang/Boolean;

.field private final useAttachmentGridLayout:Ljava/lang/Boolean;

.field private final useAttachmentUploadPreview:Ljava/lang/Boolean;

.field private final useSortedReactions:Ljava/lang/Boolean;

.field private final username:Ljava/lang/String;

.field private final usernameColor:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/Message$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/Message$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/Message;->Companion:Lcom/discord/chat/bridge/Message$Companion;

    return-void
.end method

.method private constructor <init>(IIILcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Lcom/discord/chat/bridge/MessageType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/primitives/ChannelId;",
            "Lcom/discord/primitives/GuildId;",
            "Lcom/discord/chat/bridge/MessageState;",
            "Lcom/discord/primitives/UserId;",
            "J",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "ZZ",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/embed/Embed;",
            ">;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/attachment/Attachment;",
            ">;",
            "Ljava/lang/Float;",
            "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/UploadProgress;",
            ">;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/reaction/MessageReaction;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;",
            ">;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/sticker/Sticker;",
            ">;",
            "Lcom/discord/chat/bridge/roleicons/RoleIcon;",
            "Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;",
            "Lcom/discord/chat/bridge/threads/ThreadEmbed;",
            "Z",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;",
            "Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/botuikit/Component;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;",
            "Lcom/discord/chat/bridge/feedback/SurveyIndication;",
            "Lcom/discord/chat/bridge/interaction/InteractionStatus;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Long;",
            "Lcom/discord/chat/bridge/sticker/Sticker;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;",
            "Z",
            "Lcom/discord/chat/bridge/forums/ForumPostActions;",
            "Lcom/discord/chat/bridge/automod/AutoModerationContext;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/gift/GiftEmbed;",
            ">;",
            "Lcom/discord/chat/bridge/gift/GiftEmbed;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;",
            ">;",
            "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move v1, p1

    move v2, p2

    and-int/lit8 v3, v1, 0xb

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v6, 0xb

    if-eq v6, v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    and-int/lit8 v6, v2, 0x1

    if-eq v4, v6, :cond_1

    move v6, v4

    goto :goto_1

    :cond_1
    move v6, v5

    :goto_1
    or-int/2addr v3, v6

    and-int/lit8 v6, p3, 0x0

    if-eqz v6, :cond_2

    move v6, v4

    goto :goto_2

    :cond_2
    move v6, v5

    :goto_2
    or-int/2addr v3, v6

    if-eqz v3, :cond_3

    const/4 v3, 0x3

    new-array v6, v3, [I

    aput v1, v6, v5

    aput v2, v6, v4

    const/4 v4, 0x2

    aput p3, v6, v4

    new-array v3, v3, [I

    .line 1
    fill-array-data v3, :array_0

    sget-object v4, Lcom/discord/chat/bridge/Message$$serializer;->INSTANCE:Lcom/discord/chat/bridge/Message$$serializer;

    invoke-virtual {v4}, Lcom/discord/chat/bridge/Message$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v4

    invoke-static {v6, v3, v4}, Lzi/n1;->a([I[ILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_3
    move-object/from16 v3, p74

    invoke-direct {p0, p1, v3}, Lcom/discord/chat/bridge/MessageBase;-><init>(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V

    move-object v3, p4

    iput-object v3, v0, Lcom/discord/chat/bridge/Message;->type:Lcom/discord/chat/bridge/MessageType;

    move-object v3, p5

    iput-object v3, v0, Lcom/discord/chat/bridge/Message;->id:Ljava/lang/String;

    and-int/lit8 v3, v1, 0x4

    const/4 v4, 0x0

    if-nez v3, :cond_4

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->nonce:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object/from16 v3, p6

    iput-object v3, v0, Lcom/discord/chat/bridge/Message;->nonce:Ljava/lang/String;

    :goto_3
    invoke-virtual/range {p7 .. p7}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    move-result-wide v6

    iput-wide v6, v0, Lcom/discord/chat/bridge/Message;->channelId:J

    and-int/lit8 v3, v1, 0x10

    if-nez v3, :cond_5

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->guildId:Lcom/discord/primitives/GuildId;

    goto :goto_4

    :cond_5
    move-object/from16 v3, p8

    iput-object v3, v0, Lcom/discord/chat/bridge/Message;->guildId:Lcom/discord/primitives/GuildId;

    :goto_4
    and-int/lit8 v3, v1, 0x20

    if-nez v3, :cond_6

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->state:Lcom/discord/chat/bridge/MessageState;

    goto :goto_5

    :cond_6
    move-object/from16 v3, p9

    iput-object v3, v0, Lcom/discord/chat/bridge/Message;->state:Lcom/discord/chat/bridge/MessageState;

    :goto_5
    and-int/lit8 v3, v1, 0x40

    if-nez v3, :cond_7

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->authorId:Lcom/discord/primitives/UserId;

    goto :goto_6

    :cond_7
    move-object/from16 v3, p10

    iput-object v3, v0, Lcom/discord/chat/bridge/Message;->authorId:Lcom/discord/primitives/UserId;

    :goto_6
    and-int/lit16 v3, v1, 0x80

    if-nez v3, :cond_8

    const-wide/16 v6, 0x0

    goto :goto_7

    :cond_8
    move-wide/from16 v6, p11

    :goto_7
    iput-wide v6, v0, Lcom/discord/chat/bridge/Message;->flags:J

    and-int/lit16 v3, v1, 0x100

    if-nez v3, :cond_9

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->edited:Ljava/lang/String;

    goto :goto_8

    :cond_9
    move-object/from16 v3, p13

    iput-object v3, v0, Lcom/discord/chat/bridge/Message;->edited:Ljava/lang/String;

    :goto_8
    and-int/lit16 v3, v1, 0x200

    if-nez v3, :cond_a

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->_constrainedWidth:Ljava/lang/Float;

    goto :goto_9

    :cond_a
    move-object/from16 v3, p14

    iput-object v3, v0, Lcom/discord/chat/bridge/Message;->_constrainedWidth:Ljava/lang/Float;

    :goto_9
    and-int/lit16 v3, v1, 0x400

    if-nez v3, :cond_b

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->timestamp:Ljava/lang/String;

    goto :goto_a

    :cond_b
    move-object/from16 v3, p15

    iput-object v3, v0, Lcom/discord/chat/bridge/Message;->timestamp:Ljava/lang/String;

    :goto_a
    and-int/lit16 v3, v1, 0x800

    if-nez v3, :cond_c

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->username:Ljava/lang/String;

    goto :goto_b

    :cond_c
    move-object/from16 v3, p16

    iput-object v3, v0, Lcom/discord/chat/bridge/Message;->username:Ljava/lang/String;

    :goto_b
    and-int/lit16 v3, v1, 0x1000

    if-nez v3, :cond_d

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->usernameColor:Ljava/lang/Integer;

    goto :goto_c

    :cond_d
    move-object/from16 v3, p17

    iput-object v3, v0, Lcom/discord/chat/bridge/Message;->usernameColor:Ljava/lang/Integer;

    :goto_c
    and-int/lit16 v3, v1, 0x2000

    if-nez v3, :cond_e

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->roleColor:Ljava/lang/Integer;

    goto :goto_d

    :cond_e
    move-object/from16 v3, p18

    iput-object v3, v0, Lcom/discord/chat/bridge/Message;->roleColor:Ljava/lang/Integer;

    :goto_d
    and-int/lit16 v3, v1, 0x4000

    if-nez v3, :cond_f

    iput-boolean v5, v0, Lcom/discord/chat/bridge/Message;->shouldShowRoleDot:Z

    goto :goto_e

    :cond_f
    move/from16 v3, p19

    iput-boolean v3, v0, Lcom/discord/chat/bridge/Message;->shouldShowRoleDot:Z

    :goto_e
    const v3, 0x8000

    and-int v6, v1, v3

    if-nez v6, :cond_10

    iput-boolean v5, v0, Lcom/discord/chat/bridge/Message;->shouldShowRoleOnName:Z

    goto :goto_f

    :cond_10
    move/from16 v6, p20

    iput-boolean v6, v0, Lcom/discord/chat/bridge/Message;->shouldShowRoleOnName:Z

    :goto_f
    const/high16 v6, 0x10000

    and-int v7, v1, v6

    if-nez v7, :cond_11

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->colorString:Ljava/lang/Integer;

    goto :goto_10

    :cond_11
    move-object/from16 v7, p21

    iput-object v7, v0, Lcom/discord/chat/bridge/Message;->colorString:Ljava/lang/Integer;

    :goto_10
    const/high16 v7, 0x20000

    and-int v8, v1, v7

    if-nez v8, :cond_12

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->avatarURL:Ljava/lang/String;

    goto :goto_11

    :cond_12
    move-object/from16 v8, p22

    iput-object v8, v0, Lcom/discord/chat/bridge/Message;->avatarURL:Ljava/lang/String;

    :goto_11
    const/high16 v8, 0x40000

    and-int v9, v1, v8

    if-nez v9, :cond_13

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->avatarDecorationURL:Ljava/lang/String;

    goto :goto_12

    :cond_13
    move-object/from16 v9, p23

    iput-object v9, v0, Lcom/discord/chat/bridge/Message;->avatarDecorationURL:Ljava/lang/String;

    :goto_12
    const/high16 v9, 0x80000

    and-int/2addr v9, v1

    if-nez v9, :cond_14

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->embeds:Ljava/util/List;

    goto :goto_13

    :cond_14
    move-object/from16 v9, p24

    iput-object v9, v0, Lcom/discord/chat/bridge/Message;->embeds:Ljava/util/List;

    :goto_13
    const/high16 v9, 0x100000

    and-int/2addr v9, v1

    if-nez v9, :cond_15

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->attachments:Ljava/util/List;

    goto :goto_14

    :cond_15
    move-object/from16 v9, p25

    iput-object v9, v0, Lcom/discord/chat/bridge/Message;->attachments:Ljava/util/List;

    :goto_14
    const/high16 v9, 0x200000

    and-int/2addr v9, v1

    if-nez v9, :cond_16

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->attachmentsOpacity:Ljava/lang/Float;

    goto :goto_15

    :cond_16
    move-object/from16 v9, p26

    iput-object v9, v0, Lcom/discord/chat/bridge/Message;->attachmentsOpacity:Ljava/lang/Float;

    :goto_15
    const/high16 v9, 0x400000

    and-int/2addr v9, v1

    if-nez v9, :cond_17

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    goto :goto_16

    :cond_17
    move-object/from16 v9, p27

    iput-object v9, v0, Lcom/discord/chat/bridge/Message;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    :goto_16
    const/high16 v9, 0x800000

    and-int/2addr v9, v1

    if-nez v9, :cond_18

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->progress:Ljava/util/List;

    goto :goto_17

    :cond_18
    move-object/from16 v9, p28

    iput-object v9, v0, Lcom/discord/chat/bridge/Message;->progress:Ljava/util/List;

    :goto_17
    const/high16 v9, 0x1000000

    and-int/2addr v9, v1

    if-nez v9, :cond_19

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->reactions:Ljava/util/List;

    goto :goto_18

    :cond_19
    move-object/from16 v9, p29

    iput-object v9, v0, Lcom/discord/chat/bridge/Message;->reactions:Ljava/util/List;

    :goto_18
    const/high16 v9, 0x2000000

    and-int/2addr v9, v1

    if-nez v9, :cond_1a

    .line 2
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_19

    :cond_1a
    move-object/from16 v9, p30

    .line 3
    :goto_19
    iput-object v9, v0, Lcom/discord/chat/bridge/Message;->useSortedReactions:Ljava/lang/Boolean;

    const/high16 v9, 0x4000000

    and-int/2addr v9, v1

    if-nez v9, :cond_1b

    .line 4
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1a

    :cond_1b
    move-object/from16 v9, p31

    .line 5
    :goto_1a
    iput-object v9, v0, Lcom/discord/chat/bridge/Message;->useAddBurstReaction:Ljava/lang/Boolean;

    const/high16 v9, 0x8000000

    and-int/2addr v9, v1

    if-nez v9, :cond_1c

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->codedLinks:Ljava/util/List;

    goto :goto_1b

    :cond_1c
    move-object/from16 v9, p32

    iput-object v9, v0, Lcom/discord/chat/bridge/Message;->codedLinks:Ljava/util/List;

    :goto_1b
    const/high16 v9, 0x10000000

    and-int/2addr v9, v1

    if-nez v9, :cond_1d

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->stickers:Ljava/util/List;

    goto :goto_1c

    :cond_1d
    move-object/from16 v9, p33

    iput-object v9, v0, Lcom/discord/chat/bridge/Message;->stickers:Ljava/util/List;

    :goto_1c
    const/high16 v9, 0x20000000

    and-int/2addr v9, v1

    if-nez v9, :cond_1e

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->roleIcon:Lcom/discord/chat/bridge/roleicons/RoleIcon;

    goto :goto_1d

    :cond_1e
    move-object/from16 v9, p34

    iput-object v9, v0, Lcom/discord/chat/bridge/Message;->roleIcon:Lcom/discord/chat/bridge/roleicons/RoleIcon;

    :goto_1d
    const/high16 v9, 0x40000000    # 2.0f

    and-int/2addr v9, v1

    if-nez v9, :cond_1f

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->connectionsRoleTag:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    goto :goto_1e

    :cond_1f
    move-object/from16 v9, p35

    iput-object v9, v0, Lcom/discord/chat/bridge/Message;->connectionsRoleTag:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    :goto_1e
    const/high16 v9, -0x80000000

    and-int/2addr v1, v9

    if-nez v1, :cond_20

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->threadEmbed:Lcom/discord/chat/bridge/threads/ThreadEmbed;

    goto :goto_1f

    :cond_20
    move-object/from16 v1, p36

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->threadEmbed:Lcom/discord/chat/bridge/threads/ThreadEmbed;

    :goto_1f
    move/from16 v1, p37

    iput-boolean v1, v0, Lcom/discord/chat/bridge/Message;->mentioned:Z

    and-int/lit8 v1, v2, 0x2

    if-nez v1, :cond_21

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->gifAutoPlay:Ljava/lang/Boolean;

    goto :goto_20

    :cond_21
    move-object/from16 v1, p38

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->gifAutoPlay:Ljava/lang/Boolean;

    :goto_20
    and-int/lit8 v1, v2, 0x4

    if-nez v1, :cond_22

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->animateEmoji:Ljava/lang/Boolean;

    goto :goto_21

    :cond_22
    move-object/from16 v1, p39

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->animateEmoji:Ljava/lang/Boolean;

    :goto_21
    and-int/lit8 v1, v2, 0x8

    if-nez v1, :cond_23

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->referencedMessage:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    goto :goto_22

    :cond_23
    move-object/from16 v1, p40

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->referencedMessage:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    :goto_22
    and-int/lit8 v1, v2, 0x10

    if-nez v1, :cond_24

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->executedCommand:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    goto :goto_23

    :cond_24
    move-object/from16 v1, p41

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->executedCommand:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    :goto_23
    and-int/lit8 v1, v2, 0x20

    if-nez v1, :cond_25

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->components:Ljava/util/List;

    goto :goto_24

    :cond_25
    move-object/from16 v1, p42

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->components:Ljava/util/List;

    :goto_24
    and-int/lit8 v1, v2, 0x40

    if-nez v1, :cond_26

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->threadStarterMessageHeader:Ljava/lang/String;

    goto :goto_25

    :cond_26
    move-object/from16 v1, p43

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->threadStarterMessageHeader:Ljava/lang/String;

    :goto_25
    and-int/lit16 v1, v2, 0x80

    if-nez v1, :cond_27

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->communicationDisabled:Ljava/lang/Boolean;

    goto :goto_26

    :cond_27
    move-object/from16 v1, p44

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->communicationDisabled:Ljava/lang/Boolean;

    :goto_26
    and-int/lit16 v1, v2, 0x100

    if-nez v1, :cond_28

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->tagText:Ljava/lang/String;

    goto :goto_27

    :cond_28
    move-object/from16 v1, p45

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->tagText:Ljava/lang/String;

    :goto_27
    and-int/lit16 v1, v2, 0x200

    if-nez v1, :cond_29

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->tagVerified:Ljava/lang/Boolean;

    goto :goto_28

    :cond_29
    move-object/from16 v1, p46

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->tagVerified:Ljava/lang/Boolean;

    :goto_28
    and-int/lit16 v1, v2, 0x400

    if-nez v1, :cond_2a

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->tagBackgroundColor:Ljava/lang/Integer;

    goto :goto_29

    :cond_2a
    move-object/from16 v1, p47

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->tagBackgroundColor:Ljava/lang/Integer;

    :goto_29
    and-int/lit16 v1, v2, 0x800

    if-nez v1, :cond_2b

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->opTagText:Ljava/lang/String;

    goto :goto_2a

    :cond_2b
    move-object/from16 v1, p48

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->opTagText:Ljava/lang/String;

    :goto_2a
    and-int/lit16 v1, v2, 0x1000

    if-nez v1, :cond_2c

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->ephemeralIndication:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;

    goto :goto_2b

    :cond_2c
    move-object/from16 v1, p49

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->ephemeralIndication:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;

    :goto_2b
    and-int/lit16 v1, v2, 0x2000

    if-nez v1, :cond_2d

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->surveyIndication:Lcom/discord/chat/bridge/feedback/SurveyIndication;

    goto :goto_2c

    :cond_2d
    move-object/from16 v1, p50

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->surveyIndication:Lcom/discord/chat/bridge/feedback/SurveyIndication;

    :goto_2c
    and-int/lit16 v1, v2, 0x4000

    if-nez v1, :cond_2e

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->interactionStatus:Lcom/discord/chat/bridge/interaction/InteractionStatus;

    goto :goto_2d

    :cond_2e
    move-object/from16 v1, p51

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->interactionStatus:Lcom/discord/chat/bridge/interaction/InteractionStatus;

    :goto_2d
    and-int v1, v2, v3

    if-nez v1, :cond_2f

    .line 6
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_2e

    :cond_2f
    move-object/from16 v1, p52

    .line 7
    :goto_2e
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->useAttachmentGridLayout:Ljava/lang/Boolean;

    and-int v1, v2, v6

    if-nez v1, :cond_30

    .line 8
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_2f

    :cond_30
    move-object/from16 v1, p53

    .line 9
    :goto_2f
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->useAttachmentUploadPreview:Ljava/lang/Boolean;

    and-int v1, v2, v7

    if-nez v1, :cond_31

    .line 10
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_30

    :cond_31
    move-object/from16 v1, p54

    .line 11
    :goto_30
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->isCurrentUserMessageAuthor:Ljava/lang/Boolean;

    and-int v1, v2, v8

    if-nez v1, :cond_32

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->title:Ljava/lang/String;

    goto :goto_31

    :cond_32
    move-object/from16 v1, p55

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->title:Ljava/lang/String;

    :goto_31
    const/high16 v1, 0x80000

    and-int/2addr v1, v2

    if-nez v1, :cond_33

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->description:Ljava/lang/String;

    goto :goto_32

    :cond_33
    move-object/from16 v1, p56

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->description:Ljava/lang/String;

    :goto_32
    const/high16 v1, 0x100000

    and-int/2addr v1, v2

    if-nez v1, :cond_34

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->avatarURLs:Ljava/util/List;

    goto :goto_33

    :cond_34
    move-object/from16 v1, p57

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->avatarURLs:Ljava/util/List;

    :goto_33
    const/high16 v1, 0x200000

    and-int/2addr v1, v2

    if-nez v1, :cond_35

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->isCallActive:Ljava/lang/Boolean;

    goto :goto_34

    :cond_35
    move-object/from16 v1, p58

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->isCallActive:Ljava/lang/Boolean;

    :goto_34
    const/high16 v1, 0x400000

    and-int/2addr v1, v2

    if-nez v1, :cond_36

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->missed:Ljava/lang/Boolean;

    goto :goto_35

    :cond_36
    move-object/from16 v1, p59

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->missed:Ljava/lang/Boolean;

    :goto_35
    const/high16 v1, 0x800000

    and-int/2addr v1, v2

    if-nez v1, :cond_37

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->rawMilliseconds:Ljava/lang/Long;

    goto :goto_36

    :cond_37
    move-object/from16 v1, p60

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->rawMilliseconds:Ljava/lang/Long;

    :goto_36
    const/high16 v1, 0x1000000

    and-int/2addr v1, v2

    if-nez v1, :cond_38

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    goto :goto_37

    :cond_38
    move-object/from16 v1, p61

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    :goto_37
    const/high16 v1, 0x2000000

    and-int/2addr v1, v2

    if-nez v1, :cond_39

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->stickerLabel:Ljava/lang/String;

    goto :goto_38

    :cond_39
    move-object/from16 v1, p62

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->stickerLabel:Ljava/lang/String;

    :goto_38
    const/high16 v1, 0x4000000

    and-int/2addr v1, v2

    if-nez v1, :cond_3a

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->buttonLabel:Ljava/lang/String;

    goto :goto_39

    :cond_3a
    move-object/from16 v1, p63

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->buttonLabel:Ljava/lang/String;

    :goto_39
    const/high16 v1, 0x8000000

    and-int/2addr v1, v2

    if-nez v1, :cond_3b

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->showInviteToSpeakButton:Ljava/lang/Boolean;

    goto :goto_3a

    :cond_3b
    move-object/from16 v1, p64

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->showInviteToSpeakButton:Ljava/lang/Boolean;

    :goto_3a
    const/high16 v1, 0x10000000

    and-int/2addr v1, v2

    if-nez v1, :cond_3c

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->activityInviteEmbed:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    goto :goto_3b

    :cond_3c
    move-object/from16 v1, p65

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->activityInviteEmbed:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    :goto_3b
    const/high16 v1, 0x20000000

    and-int/2addr v1, v2

    if-nez v1, :cond_3d

    iput-boolean v5, v0, Lcom/discord/chat/bridge/Message;->isFirstForumPostMessage:Z

    goto :goto_3c

    :cond_3d
    move/from16 v1, p66

    iput-boolean v1, v0, Lcom/discord/chat/bridge/Message;->isFirstForumPostMessage:Z

    :goto_3c
    const/high16 v1, 0x40000000    # 2.0f

    and-int/2addr v1, v2

    if-nez v1, :cond_3e

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->postActions:Lcom/discord/chat/bridge/forums/ForumPostActions;

    goto :goto_3d

    :cond_3e
    move-object/from16 v1, p67

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->postActions:Lcom/discord/chat/bridge/forums/ForumPostActions;

    :goto_3d
    const/high16 v1, -0x80000000

    and-int/2addr v1, v2

    if-nez v1, :cond_3f

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->autoModerationContext:Lcom/discord/chat/bridge/automod/AutoModerationContext;

    goto :goto_3e

    :cond_3f
    move-object/from16 v1, p68

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->autoModerationContext:Lcom/discord/chat/bridge/automod/AutoModerationContext;

    :goto_3e
    and-int/lit8 v1, p3, 0x1

    if-nez v1, :cond_40

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->giftCodes:Ljava/util/List;

    goto :goto_3f

    :cond_40
    move-object/from16 v1, p69

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->giftCodes:Ljava/util/List;

    :goto_3f
    and-int/lit8 v1, p3, 0x2

    if-nez v1, :cond_41

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->referralTrialOffer:Lcom/discord/chat/bridge/gift/GiftEmbed;

    goto :goto_40

    :cond_41
    move-object/from16 v1, p70

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->referralTrialOffer:Lcom/discord/chat/bridge/gift/GiftEmbed;

    :goto_40
    and-int/lit8 v1, p3, 0x4

    if-nez v1, :cond_42

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->totalMonthsSubscribed:Ljava/lang/Integer;

    goto :goto_41

    :cond_42
    move-object/from16 v1, p71

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->totalMonthsSubscribed:Ljava/lang/Integer;

    :goto_41
    and-int/lit8 v1, p3, 0x8

    if-nez v1, :cond_43

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->swipeToReplyIconUrl:Ljava/lang/String;

    goto :goto_42

    :cond_43
    move-object/from16 v1, p72

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->swipeToReplyIconUrl:Ljava/lang/String;

    :goto_42
    and-int/lit8 v1, p3, 0x10

    if-nez v1, :cond_44

    iput-object v4, v0, Lcom/discord/chat/bridge/Message;->postPreviewEmbeds:Ljava/util/List;

    goto :goto_43

    :cond_44
    move-object/from16 v1, p73

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->postPreviewEmbeds:Ljava/util/List;

    .line 12
    :goto_43
    new-instance v1, Lcom/discord/chat/bridge/Message$1;

    invoke-direct {v1, p0}, Lcom/discord/chat/bridge/Message$1;-><init>(Lcom/discord/chat/bridge/Message;)V

    invoke-static {v1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    .line 13
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->constrainedWidth$delegate:Lkotlin/Lazy;

    return-void

    :array_0
    .array-data 4
        0xb
        0x1
        0x0
    .end array-data
.end method

.method public synthetic constructor <init>(IIILcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p74}, Lcom/discord/chat/bridge/Message;-><init>(IIILcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/bridge/MessageType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Lcom/discord/primitives/GuildId;",
            "Lcom/discord/chat/bridge/MessageState;",
            "Lcom/discord/primitives/UserId;",
            "J",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "ZZ",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/embed/Embed;",
            ">;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/attachment/Attachment;",
            ">;",
            "Ljava/lang/Float;",
            "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/UploadProgress;",
            ">;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/reaction/MessageReaction;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;",
            ">;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/sticker/Sticker;",
            ">;",
            "Lcom/discord/chat/bridge/roleicons/RoleIcon;",
            "Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;",
            "Lcom/discord/chat/bridge/threads/ThreadEmbed;",
            "Z",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;",
            "Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/botuikit/Component;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;",
            "Lcom/discord/chat/bridge/feedback/SurveyIndication;",
            "Lcom/discord/chat/bridge/interaction/InteractionStatus;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Long;",
            "Lcom/discord/chat/bridge/sticker/Sticker;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;",
            "Z",
            "Lcom/discord/chat/bridge/forums/ForumPostActions;",
            "Lcom/discord/chat/bridge/automod/AutoModerationContext;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/gift/GiftEmbed;",
            ">;",
            "Lcom/discord/chat/bridge/gift/GiftEmbed;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    const/4 v1, 0x0

    .line 20
    invoke-direct {p0, v1}, Lcom/discord/chat/bridge/MessageBase;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, p1

    .line 21
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->type:Lcom/discord/chat/bridge/MessageType;

    move-object v1, p2

    .line 22
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->id:Ljava/lang/String;

    move-object v1, p3

    .line 23
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->nonce:Ljava/lang/String;

    move-wide v1, p4

    .line 24
    iput-wide v1, v0, Lcom/discord/chat/bridge/Message;->channelId:J

    move-object v1, p6

    .line 25
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->guildId:Lcom/discord/primitives/GuildId;

    move-object v1, p7

    .line 26
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->state:Lcom/discord/chat/bridge/MessageState;

    move-object v1, p8

    .line 27
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->authorId:Lcom/discord/primitives/UserId;

    move-wide v1, p9

    .line 28
    iput-wide v1, v0, Lcom/discord/chat/bridge/Message;->flags:J

    move-object v1, p11

    .line 29
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->edited:Ljava/lang/String;

    move-object v1, p12

    .line 30
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->_constrainedWidth:Ljava/lang/Float;

    move-object/from16 v1, p13

    .line 31
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->timestamp:Ljava/lang/String;

    move-object/from16 v1, p14

    .line 32
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->username:Ljava/lang/String;

    move-object/from16 v1, p15

    .line 33
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->usernameColor:Ljava/lang/Integer;

    move-object/from16 v1, p16

    .line 34
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->roleColor:Ljava/lang/Integer;

    move/from16 v1, p17

    .line 35
    iput-boolean v1, v0, Lcom/discord/chat/bridge/Message;->shouldShowRoleDot:Z

    move/from16 v1, p18

    .line 36
    iput-boolean v1, v0, Lcom/discord/chat/bridge/Message;->shouldShowRoleOnName:Z

    move-object/from16 v1, p19

    .line 37
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->colorString:Ljava/lang/Integer;

    move-object/from16 v1, p20

    .line 38
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->avatarURL:Ljava/lang/String;

    move-object/from16 v1, p21

    .line 39
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->avatarDecorationURL:Ljava/lang/String;

    move-object/from16 v1, p22

    .line 40
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->embeds:Ljava/util/List;

    move-object/from16 v1, p23

    .line 41
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->attachments:Ljava/util/List;

    move-object/from16 v1, p24

    .line 42
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->attachmentsOpacity:Ljava/lang/Float;

    move-object/from16 v1, p25

    .line 43
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    move-object/from16 v1, p26

    .line 44
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->progress:Ljava/util/List;

    move-object/from16 v1, p27

    .line 45
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->reactions:Ljava/util/List;

    move-object/from16 v1, p28

    .line 46
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->useSortedReactions:Ljava/lang/Boolean;

    move-object/from16 v1, p29

    .line 47
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->useAddBurstReaction:Ljava/lang/Boolean;

    move-object/from16 v1, p30

    .line 48
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->codedLinks:Ljava/util/List;

    move-object/from16 v1, p31

    .line 49
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->stickers:Ljava/util/List;

    move-object/from16 v1, p32

    .line 50
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->roleIcon:Lcom/discord/chat/bridge/roleicons/RoleIcon;

    move-object/from16 v1, p33

    .line 51
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->connectionsRoleTag:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    move-object/from16 v1, p34

    .line 52
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->threadEmbed:Lcom/discord/chat/bridge/threads/ThreadEmbed;

    move/from16 v1, p35

    .line 53
    iput-boolean v1, v0, Lcom/discord/chat/bridge/Message;->mentioned:Z

    move-object/from16 v1, p36

    .line 54
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->gifAutoPlay:Ljava/lang/Boolean;

    move-object/from16 v1, p37

    .line 55
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->animateEmoji:Ljava/lang/Boolean;

    move-object/from16 v1, p38

    .line 56
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->referencedMessage:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    move-object/from16 v1, p39

    .line 57
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->executedCommand:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    move-object/from16 v1, p40

    .line 58
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->components:Ljava/util/List;

    move-object/from16 v1, p41

    .line 59
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->threadStarterMessageHeader:Ljava/lang/String;

    move-object/from16 v1, p42

    .line 60
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->communicationDisabled:Ljava/lang/Boolean;

    move-object/from16 v1, p43

    .line 61
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->tagText:Ljava/lang/String;

    move-object/from16 v1, p44

    .line 62
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->tagVerified:Ljava/lang/Boolean;

    move-object/from16 v1, p45

    .line 63
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->tagBackgroundColor:Ljava/lang/Integer;

    move-object/from16 v1, p46

    .line 64
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->opTagText:Ljava/lang/String;

    move-object/from16 v1, p47

    .line 65
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->ephemeralIndication:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;

    move-object/from16 v1, p48

    .line 66
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->surveyIndication:Lcom/discord/chat/bridge/feedback/SurveyIndication;

    move-object/from16 v1, p49

    .line 67
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->interactionStatus:Lcom/discord/chat/bridge/interaction/InteractionStatus;

    move-object/from16 v1, p50

    .line 68
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->useAttachmentGridLayout:Ljava/lang/Boolean;

    move-object/from16 v1, p51

    .line 69
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->useAttachmentUploadPreview:Ljava/lang/Boolean;

    move-object/from16 v1, p52

    .line 70
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->isCurrentUserMessageAuthor:Ljava/lang/Boolean;

    move-object/from16 v1, p53

    .line 71
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->title:Ljava/lang/String;

    move-object/from16 v1, p54

    .line 72
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->description:Ljava/lang/String;

    move-object/from16 v1, p55

    .line 73
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->avatarURLs:Ljava/util/List;

    move-object/from16 v1, p56

    .line 74
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->isCallActive:Ljava/lang/Boolean;

    move-object/from16 v1, p57

    .line 75
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->missed:Ljava/lang/Boolean;

    move-object/from16 v1, p58

    .line 76
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->rawMilliseconds:Ljava/lang/Long;

    move-object/from16 v1, p59

    .line 77
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    move-object/from16 v1, p60

    .line 78
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->stickerLabel:Ljava/lang/String;

    move-object/from16 v1, p61

    .line 79
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->buttonLabel:Ljava/lang/String;

    move-object/from16 v1, p62

    .line 80
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->showInviteToSpeakButton:Ljava/lang/Boolean;

    move-object/from16 v1, p63

    .line 81
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->activityInviteEmbed:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    move/from16 v1, p64

    .line 82
    iput-boolean v1, v0, Lcom/discord/chat/bridge/Message;->isFirstForumPostMessage:Z

    move-object/from16 v1, p65

    .line 83
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->postActions:Lcom/discord/chat/bridge/forums/ForumPostActions;

    move-object/from16 v1, p66

    .line 84
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->autoModerationContext:Lcom/discord/chat/bridge/automod/AutoModerationContext;

    move-object/from16 v1, p67

    .line 85
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->giftCodes:Ljava/util/List;

    move-object/from16 v1, p68

    .line 86
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->referralTrialOffer:Lcom/discord/chat/bridge/gift/GiftEmbed;

    move-object/from16 v1, p69

    .line 87
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->totalMonthsSubscribed:Ljava/lang/Integer;

    move-object/from16 v1, p70

    .line 88
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->swipeToReplyIconUrl:Ljava/lang/String;

    move-object/from16 v1, p71

    .line 89
    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->postPreviewEmbeds:Ljava/util/List;

    .line 90
    new-instance v1, Lcom/discord/chat/bridge/Message$constrainedWidth$2;

    invoke-direct {v1, p0}, Lcom/discord/chat/bridge/Message$constrainedWidth$2;-><init>(Lcom/discord/chat/bridge/Message;)V

    invoke-static {v1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/discord/chat/bridge/Message;->constrainedWidth$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 77

    move/from16 v0, p72

    move/from16 v1, p73

    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_0

    const/4 v7, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v7, p3

    :goto_0
    and-int/lit8 v2, v0, 0x10

    if-eqz v2, :cond_1

    const/4 v10, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v10, p6

    :goto_1
    and-int/lit8 v2, v0, 0x20

    if-eqz v2, :cond_2

    const/4 v11, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v11, p7

    :goto_2
    and-int/lit8 v2, v0, 0x40

    if-eqz v2, :cond_3

    const/4 v12, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v12, p8

    :goto_3
    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_4

    const-wide/16 v4, 0x0

    move-wide v13, v4

    goto :goto_4

    :cond_4
    move-wide/from16 v13, p9

    :goto_4
    and-int/lit16 v2, v0, 0x100

    if-eqz v2, :cond_5

    const/4 v15, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v15, p11

    :goto_5
    and-int/lit16 v2, v0, 0x200

    if-eqz v2, :cond_6

    const/16 v16, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v16, p12

    :goto_6
    and-int/lit16 v2, v0, 0x400

    if-eqz v2, :cond_7

    const/16 v17, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v17, p13

    :goto_7
    and-int/lit16 v2, v0, 0x800

    if-eqz v2, :cond_8

    const/16 v18, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v18, p14

    :goto_8
    and-int/lit16 v2, v0, 0x1000

    if-eqz v2, :cond_9

    const/16 v19, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v19, p15

    :goto_9
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_a

    const/16 v20, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v20, p16

    :goto_a
    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_b

    const/16 v21, 0x0

    goto :goto_b

    :cond_b
    move/from16 v21, p17

    :goto_b
    const v2, 0x8000

    and-int v5, v0, v2

    if-eqz v5, :cond_c

    const/16 v22, 0x0

    goto :goto_c

    :cond_c
    move/from16 v22, p18

    :goto_c
    const/high16 v5, 0x10000

    and-int v6, v0, v5

    if-eqz v6, :cond_d

    const/16 v23, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v23, p19

    :goto_d
    const/high16 v6, 0x20000

    and-int v8, v0, v6

    if-eqz v8, :cond_e

    const/16 v24, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v24, p20

    :goto_e
    const/high16 v8, 0x40000

    and-int v9, v0, v8

    if-eqz v9, :cond_f

    const/16 v25, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v25, p21

    :goto_f
    const/high16 v9, 0x80000

    and-int v26, v0, v9

    if-eqz v26, :cond_10

    const/16 v26, 0x0

    goto :goto_10

    :cond_10
    move-object/from16 v26, p22

    :goto_10
    const/high16 v27, 0x100000

    and-int v28, v0, v27

    if-eqz v28, :cond_11

    const/16 v28, 0x0

    goto :goto_11

    :cond_11
    move-object/from16 v28, p23

    :goto_11
    const/high16 v29, 0x200000

    and-int v30, v0, v29

    if-eqz v30, :cond_12

    const/16 v30, 0x0

    goto :goto_12

    :cond_12
    move-object/from16 v30, p24

    :goto_12
    const/high16 v31, 0x400000

    and-int v32, v0, v31

    if-eqz v32, :cond_13

    const/16 v32, 0x0

    goto :goto_13

    :cond_13
    move-object/from16 v32, p25

    :goto_13
    const/high16 v33, 0x800000

    and-int v33, v0, v33

    if-eqz v33, :cond_14

    const/16 v33, 0x0

    goto :goto_14

    :cond_14
    move-object/from16 v33, p26

    :goto_14
    const/high16 v34, 0x1000000

    and-int v34, v0, v34

    if-eqz v34, :cond_15

    const/16 v34, 0x0

    goto :goto_15

    :cond_15
    move-object/from16 v34, p27

    :goto_15
    const/high16 v35, 0x2000000

    and-int v35, v0, v35

    if-eqz v35, :cond_16

    .line 14
    sget-object v35, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_16

    :cond_16
    move-object/from16 v35, p28

    :goto_16
    const/high16 v36, 0x4000000

    and-int v36, v0, v36

    if-eqz v36, :cond_17

    .line 15
    sget-object v36, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_17

    :cond_17
    move-object/from16 v36, p29

    :goto_17
    const/high16 v37, 0x8000000

    and-int v37, v0, v37

    if-eqz v37, :cond_18

    const/16 v37, 0x0

    goto :goto_18

    :cond_18
    move-object/from16 v37, p30

    :goto_18
    const/high16 v38, 0x10000000

    and-int v38, v0, v38

    if-eqz v38, :cond_19

    const/16 v38, 0x0

    goto :goto_19

    :cond_19
    move-object/from16 v38, p31

    :goto_19
    const/high16 v39, 0x20000000

    and-int v39, v0, v39

    if-eqz v39, :cond_1a

    const/16 v39, 0x0

    goto :goto_1a

    :cond_1a
    move-object/from16 v39, p32

    :goto_1a
    const/high16 v40, 0x40000000    # 2.0f

    and-int v40, v0, v40

    if-eqz v40, :cond_1b

    const/16 v40, 0x0

    goto :goto_1b

    :cond_1b
    move-object/from16 v40, p33

    :goto_1b
    const/high16 v41, -0x80000000

    and-int v0, v0, v41

    if-eqz v0, :cond_1c

    const/4 v0, 0x0

    goto :goto_1c

    :cond_1c
    move-object/from16 v0, p34

    :goto_1c
    and-int/lit8 v41, v1, 0x2

    if-eqz v41, :cond_1d

    const/16 v41, 0x0

    goto :goto_1d

    :cond_1d
    move-object/from16 v41, p36

    :goto_1d
    and-int/lit8 v42, v1, 0x4

    if-eqz v42, :cond_1e

    const/16 v42, 0x0

    goto :goto_1e

    :cond_1e
    move-object/from16 v42, p37

    :goto_1e
    and-int/lit8 v43, v1, 0x8

    if-eqz v43, :cond_1f

    const/16 v43, 0x0

    goto :goto_1f

    :cond_1f
    move-object/from16 v43, p38

    :goto_1f
    and-int/lit8 v44, v1, 0x10

    if-eqz v44, :cond_20

    const/16 v44, 0x0

    goto :goto_20

    :cond_20
    move-object/from16 v44, p39

    :goto_20
    and-int/lit8 v45, v1, 0x20

    if-eqz v45, :cond_21

    const/16 v45, 0x0

    goto :goto_21

    :cond_21
    move-object/from16 v45, p40

    :goto_21
    and-int/lit8 v46, v1, 0x40

    if-eqz v46, :cond_22

    const/16 v46, 0x0

    goto :goto_22

    :cond_22
    move-object/from16 v46, p41

    :goto_22
    and-int/lit16 v3, v1, 0x80

    if-eqz v3, :cond_23

    const/4 v3, 0x0

    goto :goto_23

    :cond_23
    move-object/from16 v3, p42

    :goto_23
    and-int/lit16 v4, v1, 0x100

    if-eqz v4, :cond_24

    const/16 v47, 0x0

    goto :goto_24

    :cond_24
    move-object/from16 v47, p43

    :goto_24
    and-int/lit16 v4, v1, 0x200

    if-eqz v4, :cond_25

    const/16 v48, 0x0

    goto :goto_25

    :cond_25
    move-object/from16 v48, p44

    :goto_25
    and-int/lit16 v4, v1, 0x400

    if-eqz v4, :cond_26

    const/16 v49, 0x0

    goto :goto_26

    :cond_26
    move-object/from16 v49, p45

    :goto_26
    and-int/lit16 v4, v1, 0x800

    if-eqz v4, :cond_27

    const/16 v50, 0x0

    goto :goto_27

    :cond_27
    move-object/from16 v50, p46

    :goto_27
    and-int/lit16 v4, v1, 0x1000

    if-eqz v4, :cond_28

    const/16 v51, 0x0

    goto :goto_28

    :cond_28
    move-object/from16 v51, p47

    :goto_28
    and-int/lit16 v4, v1, 0x2000

    if-eqz v4, :cond_29

    const/16 v52, 0x0

    goto :goto_29

    :cond_29
    move-object/from16 v52, p48

    :goto_29
    and-int/lit16 v4, v1, 0x4000

    if-eqz v4, :cond_2a

    const/16 v53, 0x0

    goto :goto_2a

    :cond_2a
    move-object/from16 v53, p49

    :goto_2a
    and-int/2addr v2, v1

    if-eqz v2, :cond_2b

    .line 16
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object/from16 v54, v2

    goto :goto_2b

    :cond_2b
    move-object/from16 v54, p50

    :goto_2b
    and-int v2, v1, v5

    if-eqz v2, :cond_2c

    .line 17
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object/from16 v55, v2

    goto :goto_2c

    :cond_2c
    move-object/from16 v55, p51

    :goto_2c
    and-int v2, v1, v6

    if-eqz v2, :cond_2d

    .line 18
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object/from16 v56, v2

    goto :goto_2d

    :cond_2d
    move-object/from16 v56, p52

    :goto_2d
    and-int v2, v1, v8

    if-eqz v2, :cond_2e

    const/16 v57, 0x0

    goto :goto_2e

    :cond_2e
    move-object/from16 v57, p53

    :goto_2e
    and-int v2, v1, v9

    if-eqz v2, :cond_2f

    const/16 v58, 0x0

    goto :goto_2f

    :cond_2f
    move-object/from16 v58, p54

    :goto_2f
    and-int v2, v1, v27

    if-eqz v2, :cond_30

    const/16 v59, 0x0

    goto :goto_30

    :cond_30
    move-object/from16 v59, p55

    :goto_30
    and-int v2, v1, v29

    if-eqz v2, :cond_31

    const/16 v60, 0x0

    goto :goto_31

    :cond_31
    move-object/from16 v60, p56

    :goto_31
    and-int v2, v1, v31

    if-eqz v2, :cond_32

    const/16 v61, 0x0

    goto :goto_32

    :cond_32
    move-object/from16 v61, p57

    :goto_32
    const/high16 v2, 0x800000

    and-int/2addr v2, v1

    if-eqz v2, :cond_33

    const/16 v62, 0x0

    goto :goto_33

    :cond_33
    move-object/from16 v62, p58

    :goto_33
    const/high16 v2, 0x1000000

    and-int/2addr v2, v1

    if-eqz v2, :cond_34

    const/16 v63, 0x0

    goto :goto_34

    :cond_34
    move-object/from16 v63, p59

    :goto_34
    const/high16 v2, 0x2000000

    and-int/2addr v2, v1

    if-eqz v2, :cond_35

    const/16 v64, 0x0

    goto :goto_35

    :cond_35
    move-object/from16 v64, p60

    :goto_35
    const/high16 v2, 0x4000000

    and-int/2addr v2, v1

    if-eqz v2, :cond_36

    const/16 v65, 0x0

    goto :goto_36

    :cond_36
    move-object/from16 v65, p61

    :goto_36
    const/high16 v2, 0x8000000

    and-int/2addr v2, v1

    if-eqz v2, :cond_37

    const/16 v66, 0x0

    goto :goto_37

    :cond_37
    move-object/from16 v66, p62

    :goto_37
    const/high16 v2, 0x10000000

    and-int/2addr v2, v1

    if-eqz v2, :cond_38

    const/16 v67, 0x0

    goto :goto_38

    :cond_38
    move-object/from16 v67, p63

    :goto_38
    const/high16 v2, 0x20000000

    and-int/2addr v2, v1

    if-eqz v2, :cond_39

    const/16 v68, 0x0

    goto :goto_39

    :cond_39
    move/from16 v68, p64

    :goto_39
    const/high16 v2, 0x40000000    # 2.0f

    and-int/2addr v2, v1

    if-eqz v2, :cond_3a

    const/16 v69, 0x0

    goto :goto_3a

    :cond_3a
    move-object/from16 v69, p65

    :goto_3a
    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_3b

    const/16 v70, 0x0

    goto :goto_3b

    :cond_3b
    move-object/from16 v70, p66

    :goto_3b
    and-int/lit8 v1, p74, 0x1

    if-eqz v1, :cond_3c

    const/16 v71, 0x0

    goto :goto_3c

    :cond_3c
    move-object/from16 v71, p67

    :goto_3c
    and-int/lit8 v1, p74, 0x2

    if-eqz v1, :cond_3d

    const/16 v72, 0x0

    goto :goto_3d

    :cond_3d
    move-object/from16 v72, p68

    :goto_3d
    and-int/lit8 v1, p74, 0x4

    if-eqz v1, :cond_3e

    const/16 v73, 0x0

    goto :goto_3e

    :cond_3e
    move-object/from16 v73, p69

    :goto_3e
    and-int/lit8 v1, p74, 0x8

    if-eqz v1, :cond_3f

    const/16 v74, 0x0

    goto :goto_3f

    :cond_3f
    move-object/from16 v74, p70

    :goto_3f
    and-int/lit8 v1, p74, 0x10

    if-eqz v1, :cond_40

    const/16 v75, 0x0

    goto :goto_40

    :cond_40
    move-object/from16 v75, p71

    :goto_40
    const/16 v76, 0x0

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-wide/from16 v8, p4

    move-object/from16 v27, v28

    move-object/from16 v28, v30

    move-object/from16 v29, v32

    move-object/from16 v30, v33

    move-object/from16 v31, v34

    move-object/from16 v32, v35

    move-object/from16 v33, v36

    move-object/from16 v34, v37

    move-object/from16 v35, v38

    move-object/from16 v36, v39

    move-object/from16 v37, v40

    move-object/from16 v38, v0

    move/from16 v39, p35

    move-object/from16 v40, v41

    move-object/from16 v41, v42

    move-object/from16 v42, v43

    move-object/from16 v43, v44

    move-object/from16 v44, v45

    move-object/from16 v45, v46

    move-object/from16 v46, v3

    .line 19
    invoke-direct/range {v4 .. v76}, Lcom/discord/chat/bridge/Message;-><init>(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p71}, Lcom/discord/chat/bridge/Message;-><init>(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy-HxUhIIA$default(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;IIILjava/lang/Object;)Lcom/discord/chat/bridge/Message;
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p72

    move/from16 v2, p73

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget-object v3, v0, Lcom/discord/chat/bridge/Message;->type:Lcom/discord/chat/bridge/MessageType;

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Lcom/discord/chat/bridge/Message;->id:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/discord/chat/bridge/Message;->nonce:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-wide v6, v0, Lcom/discord/chat/bridge/Message;->channelId:J

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p4

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget-object v8, v0, Lcom/discord/chat/bridge/Message;->guildId:Lcom/discord/primitives/GuildId;

    goto :goto_4

    :cond_4
    move-object/from16 v8, p6

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget-object v9, v0, Lcom/discord/chat/bridge/Message;->state:Lcom/discord/chat/bridge/MessageState;

    goto :goto_5

    :cond_5
    move-object/from16 v9, p7

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget-object v10, v0, Lcom/discord/chat/bridge/Message;->authorId:Lcom/discord/primitives/UserId;

    goto :goto_6

    :cond_6
    move-object/from16 v10, p8

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget-wide v11, v0, Lcom/discord/chat/bridge/Message;->flags:J

    goto :goto_7

    :cond_7
    move-wide/from16 v11, p9

    :goto_7
    and-int/lit16 v13, v1, 0x100

    if-eqz v13, :cond_8

    iget-object v13, v0, Lcom/discord/chat/bridge/Message;->edited:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v13, p11

    :goto_8
    and-int/lit16 v14, v1, 0x200

    if-eqz v14, :cond_9

    iget-object v14, v0, Lcom/discord/chat/bridge/Message;->_constrainedWidth:Ljava/lang/Float;

    goto :goto_9

    :cond_9
    move-object/from16 v14, p12

    :goto_9
    and-int/lit16 v15, v1, 0x400

    if-eqz v15, :cond_a

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->timestamp:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v15, p13

    :goto_a
    move-object/from16 p13, v15

    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->username:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v15, p14

    :goto_b
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->usernameColor:Ljava/lang/Integer;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p15

    :goto_c
    move-object/from16 p15, v15

    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->roleColor:Ljava/lang/Integer;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p16

    :goto_d
    move-object/from16 p16, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-boolean v15, v0, Lcom/discord/chat/bridge/Message;->shouldShowRoleDot:Z

    goto :goto_e

    :cond_e
    move/from16 v15, p17

    :goto_e
    const v16, 0x8000

    and-int v17, v1, v16

    move/from16 p17, v15

    if-eqz v17, :cond_f

    iget-boolean v15, v0, Lcom/discord/chat/bridge/Message;->shouldShowRoleOnName:Z

    goto :goto_f

    :cond_f
    move/from16 v15, p18

    :goto_f
    const/high16 v17, 0x10000

    and-int v18, v1, v17

    move/from16 p18, v15

    if-eqz v18, :cond_10

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->colorString:Ljava/lang/Integer;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p19

    :goto_10
    const/high16 v18, 0x20000

    and-int v19, v1, v18

    move-object/from16 p19, v15

    if-eqz v19, :cond_11

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->avatarURL:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p20

    :goto_11
    const/high16 v19, 0x40000

    and-int v20, v1, v19

    move-object/from16 p20, v15

    if-eqz v20, :cond_12

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->avatarDecorationURL:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v15, p21

    :goto_12
    const/high16 v20, 0x80000

    and-int v21, v1, v20

    move-object/from16 p21, v15

    if-eqz v21, :cond_13

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->embeds:Ljava/util/List;

    goto :goto_13

    :cond_13
    move-object/from16 v15, p22

    :goto_13
    const/high16 v21, 0x100000

    and-int v22, v1, v21

    move-object/from16 p22, v15

    if-eqz v22, :cond_14

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->attachments:Ljava/util/List;

    goto :goto_14

    :cond_14
    move-object/from16 v15, p23

    :goto_14
    const/high16 v22, 0x200000

    and-int v23, v1, v22

    move-object/from16 p23, v15

    if-eqz v23, :cond_15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->attachmentsOpacity:Ljava/lang/Float;

    goto :goto_15

    :cond_15
    move-object/from16 v15, p24

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, v1, v23

    move-object/from16 p24, v15

    if-eqz v23, :cond_16

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    goto :goto_16

    :cond_16
    move-object/from16 v15, p25

    :goto_16
    const/high16 v23, 0x800000

    and-int v23, v1, v23

    move-object/from16 p25, v15

    if-eqz v23, :cond_17

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->progress:Ljava/util/List;

    goto :goto_17

    :cond_17
    move-object/from16 v15, p26

    :goto_17
    const/high16 v23, 0x1000000

    and-int v23, v1, v23

    move-object/from16 p26, v15

    if-eqz v23, :cond_18

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->reactions:Ljava/util/List;

    goto :goto_18

    :cond_18
    move-object/from16 v15, p27

    :goto_18
    const/high16 v23, 0x2000000

    and-int v23, v1, v23

    move-object/from16 p27, v15

    if-eqz v23, :cond_19

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->useSortedReactions:Ljava/lang/Boolean;

    goto :goto_19

    :cond_19
    move-object/from16 v15, p28

    :goto_19
    const/high16 v23, 0x4000000

    and-int v23, v1, v23

    move-object/from16 p28, v15

    if-eqz v23, :cond_1a

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->useAddBurstReaction:Ljava/lang/Boolean;

    goto :goto_1a

    :cond_1a
    move-object/from16 v15, p29

    :goto_1a
    const/high16 v23, 0x8000000

    and-int v23, v1, v23

    move-object/from16 p29, v15

    if-eqz v23, :cond_1b

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->codedLinks:Ljava/util/List;

    goto :goto_1b

    :cond_1b
    move-object/from16 v15, p30

    :goto_1b
    const/high16 v23, 0x10000000

    and-int v23, v1, v23

    move-object/from16 p30, v15

    if-eqz v23, :cond_1c

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->stickers:Ljava/util/List;

    goto :goto_1c

    :cond_1c
    move-object/from16 v15, p31

    :goto_1c
    const/high16 v23, 0x20000000

    and-int v23, v1, v23

    move-object/from16 p31, v15

    if-eqz v23, :cond_1d

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->roleIcon:Lcom/discord/chat/bridge/roleicons/RoleIcon;

    goto :goto_1d

    :cond_1d
    move-object/from16 v15, p32

    :goto_1d
    const/high16 v23, 0x40000000    # 2.0f

    and-int v23, v1, v23

    move-object/from16 p32, v15

    if-eqz v23, :cond_1e

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->connectionsRoleTag:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    goto :goto_1e

    :cond_1e
    move-object/from16 v15, p33

    :goto_1e
    const/high16 v23, -0x80000000

    and-int v1, v1, v23

    if-eqz v1, :cond_1f

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->threadEmbed:Lcom/discord/chat/bridge/threads/ThreadEmbed;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p34

    :goto_1f
    and-int/lit8 v23, v2, 0x1

    move-object/from16 p34, v1

    if-eqz v23, :cond_20

    iget-boolean v1, v0, Lcom/discord/chat/bridge/Message;->mentioned:Z

    goto :goto_20

    :cond_20
    move/from16 v1, p35

    :goto_20
    and-int/lit8 v23, v2, 0x2

    move/from16 p35, v1

    if-eqz v23, :cond_21

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->gifAutoPlay:Ljava/lang/Boolean;

    goto :goto_21

    :cond_21
    move-object/from16 v1, p36

    :goto_21
    and-int/lit8 v23, v2, 0x4

    move-object/from16 p36, v1

    if-eqz v23, :cond_22

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->animateEmoji:Ljava/lang/Boolean;

    goto :goto_22

    :cond_22
    move-object/from16 v1, p37

    :goto_22
    and-int/lit8 v23, v2, 0x8

    move-object/from16 p37, v1

    if-eqz v23, :cond_23

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->referencedMessage:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p38

    :goto_23
    and-int/lit8 v23, v2, 0x10

    move-object/from16 p38, v1

    if-eqz v23, :cond_24

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->executedCommand:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    goto :goto_24

    :cond_24
    move-object/from16 v1, p39

    :goto_24
    and-int/lit8 v23, v2, 0x20

    move-object/from16 p39, v1

    if-eqz v23, :cond_25

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->components:Ljava/util/List;

    goto :goto_25

    :cond_25
    move-object/from16 v1, p40

    :goto_25
    and-int/lit8 v23, v2, 0x40

    move-object/from16 p40, v1

    if-eqz v23, :cond_26

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->threadStarterMessageHeader:Ljava/lang/String;

    goto :goto_26

    :cond_26
    move-object/from16 v1, p41

    :goto_26
    move-object/from16 p41, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->communicationDisabled:Ljava/lang/Boolean;

    goto :goto_27

    :cond_27
    move-object/from16 v1, p42

    :goto_27
    move-object/from16 p42, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->tagText:Ljava/lang/String;

    goto :goto_28

    :cond_28
    move-object/from16 v1, p43

    :goto_28
    move-object/from16 p43, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->tagVerified:Ljava/lang/Boolean;

    goto :goto_29

    :cond_29
    move-object/from16 v1, p44

    :goto_29
    move-object/from16 p44, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->tagBackgroundColor:Ljava/lang/Integer;

    goto :goto_2a

    :cond_2a
    move-object/from16 v1, p45

    :goto_2a
    move-object/from16 p45, v1

    and-int/lit16 v1, v2, 0x800

    if-eqz v1, :cond_2b

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->opTagText:Ljava/lang/String;

    goto :goto_2b

    :cond_2b
    move-object/from16 v1, p46

    :goto_2b
    move-object/from16 p46, v1

    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_2c

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->ephemeralIndication:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;

    goto :goto_2c

    :cond_2c
    move-object/from16 v1, p47

    :goto_2c
    move-object/from16 p47, v1

    and-int/lit16 v1, v2, 0x2000

    if-eqz v1, :cond_2d

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->surveyIndication:Lcom/discord/chat/bridge/feedback/SurveyIndication;

    goto :goto_2d

    :cond_2d
    move-object/from16 v1, p48

    :goto_2d
    move-object/from16 p48, v1

    and-int/lit16 v1, v2, 0x4000

    if-eqz v1, :cond_2e

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->interactionStatus:Lcom/discord/chat/bridge/interaction/InteractionStatus;

    goto :goto_2e

    :cond_2e
    move-object/from16 v1, p49

    :goto_2e
    and-int v16, v2, v16

    move-object/from16 p49, v1

    if-eqz v16, :cond_2f

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->useAttachmentGridLayout:Ljava/lang/Boolean;

    goto :goto_2f

    :cond_2f
    move-object/from16 v1, p50

    :goto_2f
    and-int v16, v2, v17

    move-object/from16 p50, v1

    if-eqz v16, :cond_30

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->useAttachmentUploadPreview:Ljava/lang/Boolean;

    goto :goto_30

    :cond_30
    move-object/from16 v1, p51

    :goto_30
    and-int v16, v2, v18

    move-object/from16 p51, v1

    if-eqz v16, :cond_31

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->isCurrentUserMessageAuthor:Ljava/lang/Boolean;

    goto :goto_31

    :cond_31
    move-object/from16 v1, p52

    :goto_31
    and-int v16, v2, v19

    move-object/from16 p52, v1

    if-eqz v16, :cond_32

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->title:Ljava/lang/String;

    goto :goto_32

    :cond_32
    move-object/from16 v1, p53

    :goto_32
    and-int v16, v2, v20

    move-object/from16 p53, v1

    if-eqz v16, :cond_33

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->description:Ljava/lang/String;

    goto :goto_33

    :cond_33
    move-object/from16 v1, p54

    :goto_33
    and-int v16, v2, v21

    move-object/from16 p54, v1

    if-eqz v16, :cond_34

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->avatarURLs:Ljava/util/List;

    goto :goto_34

    :cond_34
    move-object/from16 v1, p55

    :goto_34
    and-int v16, v2, v22

    move-object/from16 p55, v1

    if-eqz v16, :cond_35

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->isCallActive:Ljava/lang/Boolean;

    goto :goto_35

    :cond_35
    move-object/from16 v1, p56

    :goto_35
    const/high16 v16, 0x400000

    and-int v16, v2, v16

    move-object/from16 p56, v1

    if-eqz v16, :cond_36

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->missed:Ljava/lang/Boolean;

    goto :goto_36

    :cond_36
    move-object/from16 v1, p57

    :goto_36
    const/high16 v16, 0x800000

    and-int v16, v2, v16

    move-object/from16 p57, v1

    if-eqz v16, :cond_37

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->rawMilliseconds:Ljava/lang/Long;

    goto :goto_37

    :cond_37
    move-object/from16 v1, p58

    :goto_37
    const/high16 v16, 0x1000000

    and-int v16, v2, v16

    move-object/from16 p58, v1

    if-eqz v16, :cond_38

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    goto :goto_38

    :cond_38
    move-object/from16 v1, p59

    :goto_38
    const/high16 v16, 0x2000000

    and-int v16, v2, v16

    move-object/from16 p59, v1

    if-eqz v16, :cond_39

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->stickerLabel:Ljava/lang/String;

    goto :goto_39

    :cond_39
    move-object/from16 v1, p60

    :goto_39
    const/high16 v16, 0x4000000

    and-int v16, v2, v16

    move-object/from16 p60, v1

    if-eqz v16, :cond_3a

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->buttonLabel:Ljava/lang/String;

    goto :goto_3a

    :cond_3a
    move-object/from16 v1, p61

    :goto_3a
    const/high16 v16, 0x8000000

    and-int v16, v2, v16

    move-object/from16 p61, v1

    if-eqz v16, :cond_3b

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->showInviteToSpeakButton:Ljava/lang/Boolean;

    goto :goto_3b

    :cond_3b
    move-object/from16 v1, p62

    :goto_3b
    const/high16 v16, 0x10000000

    and-int v16, v2, v16

    move-object/from16 p62, v1

    if-eqz v16, :cond_3c

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->activityInviteEmbed:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    goto :goto_3c

    :cond_3c
    move-object/from16 v1, p63

    :goto_3c
    const/high16 v16, 0x20000000

    and-int v16, v2, v16

    move-object/from16 p63, v1

    if-eqz v16, :cond_3d

    iget-boolean v1, v0, Lcom/discord/chat/bridge/Message;->isFirstForumPostMessage:Z

    goto :goto_3d

    :cond_3d
    move/from16 v1, p64

    :goto_3d
    const/high16 v16, 0x40000000    # 2.0f

    and-int v16, v2, v16

    move/from16 p64, v1

    if-eqz v16, :cond_3e

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->postActions:Lcom/discord/chat/bridge/forums/ForumPostActions;

    goto :goto_3e

    :cond_3e
    move-object/from16 v1, p65

    :goto_3e
    const/high16 v16, -0x80000000

    and-int v2, v2, v16

    if-eqz v2, :cond_3f

    iget-object v2, v0, Lcom/discord/chat/bridge/Message;->autoModerationContext:Lcom/discord/chat/bridge/automod/AutoModerationContext;

    goto :goto_3f

    :cond_3f
    move-object/from16 v2, p66

    :goto_3f
    and-int/lit8 v16, p74, 0x1

    move-object/from16 p66, v2

    if-eqz v16, :cond_40

    iget-object v2, v0, Lcom/discord/chat/bridge/Message;->giftCodes:Ljava/util/List;

    goto :goto_40

    :cond_40
    move-object/from16 v2, p67

    :goto_40
    and-int/lit8 v16, p74, 0x2

    move-object/from16 p67, v2

    if-eqz v16, :cond_41

    iget-object v2, v0, Lcom/discord/chat/bridge/Message;->referralTrialOffer:Lcom/discord/chat/bridge/gift/GiftEmbed;

    goto :goto_41

    :cond_41
    move-object/from16 v2, p68

    :goto_41
    and-int/lit8 v16, p74, 0x4

    move-object/from16 p68, v2

    if-eqz v16, :cond_42

    iget-object v2, v0, Lcom/discord/chat/bridge/Message;->totalMonthsSubscribed:Ljava/lang/Integer;

    goto :goto_42

    :cond_42
    move-object/from16 v2, p69

    :goto_42
    and-int/lit8 v16, p74, 0x8

    move-object/from16 p69, v2

    if-eqz v16, :cond_43

    iget-object v2, v0, Lcom/discord/chat/bridge/Message;->swipeToReplyIconUrl:Ljava/lang/String;

    goto :goto_43

    :cond_43
    move-object/from16 v2, p70

    :goto_43
    and-int/lit8 v16, p74, 0x10

    move-object/from16 p70, v2

    if-eqz v16, :cond_44

    iget-object v2, v0, Lcom/discord/chat/bridge/Message;->postPreviewEmbeds:Ljava/util/List;

    goto :goto_44

    :cond_44
    move-object/from16 v2, p71

    :goto_44
    move-object/from16 p1, v3

    move-object/from16 p2, v4

    move-object/from16 p3, v5

    move-wide/from16 p4, v6

    move-object/from16 p6, v8

    move-object/from16 p7, v9

    move-object/from16 p8, v10

    move-wide/from16 p9, v11

    move-object/from16 p11, v13

    move-object/from16 p12, v14

    move-object/from16 p33, v15

    move-object/from16 p65, v1

    move-object/from16 p71, v2

    invoke-virtual/range {p0 .. p71}, Lcom/discord/chat/bridge/Message;->copy-HxUhIIA(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/discord/chat/bridge/Message;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getAvatarURL$chat_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic get_constrainedWidth$annotations()V
    .locals 0

    return-void
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/Message;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 8

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p0, p1, p2}, Lcom/discord/chat/bridge/MessageBase;->write$Self(Lcom/discord/chat/bridge/MessageBase;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    sget-object v0, Lcom/discord/chat/bridge/MessageType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/MessageType$Serializer;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->type:Lcom/discord/chat/bridge/MessageType;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    sget-object v0, Lcom/discord/primitives/MessageId$$serializer;->INSTANCE:Lcom/discord/primitives/MessageId$$serializer;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->id:Ljava/lang/String;

    invoke-static {v1}, Lcom/discord/primitives/MessageId;->box-impl(Ljava/lang/String;)Lcom/discord/primitives/MessageId;

    move-result-object v1

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    if-eqz v4, :cond_0

    :goto_0
    move v4, v3

    goto :goto_1

    :cond_0
    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->nonce:Ljava/lang/String;

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    move v4, v2

    :goto_1
    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->nonce:Ljava/lang/String;

    if-eqz v4, :cond_2

    invoke-static {v4}, Lcom/discord/primitives/MessageId;->box-impl(Ljava/lang/String;)Lcom/discord/primitives/MessageId;

    move-result-object v4

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    invoke-interface {p1, p2, v1, v0, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_3
    sget-object v0, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    iget-wide v4, p0, Lcom/discord/chat/bridge/Message;->channelId:J

    invoke-static {v4, v5}, Lcom/discord/primitives/ChannelId;->box-impl(J)Lcom/discord/primitives/ChannelId;

    move-result-object v1

    const/4 v4, 0x3

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_3
    move v1, v3

    goto :goto_4

    :cond_4
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->guildId:Lcom/discord/primitives/GuildId;

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    move v1, v2

    :goto_4
    if-eqz v1, :cond_6

    sget-object v1, Lcom/discord/primitives/GuildId$$serializer;->INSTANCE:Lcom/discord/primitives/GuildId$$serializer;

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->guildId:Lcom/discord/primitives/GuildId;

    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_6
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_5
    move v1, v3

    goto :goto_6

    :cond_7
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->state:Lcom/discord/chat/bridge/MessageState;

    if-eqz v1, :cond_8

    goto :goto_5

    :cond_8
    move v1, v2

    :goto_6
    if-eqz v1, :cond_9

    sget-object v1, Lcom/discord/chat/bridge/MessageState$Serializer;->INSTANCE:Lcom/discord/chat/bridge/MessageState$Serializer;

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->state:Lcom/discord/chat/bridge/MessageState;

    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_7
    move v1, v3

    goto :goto_8

    :cond_a
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->authorId:Lcom/discord/primitives/UserId;

    if-eqz v1, :cond_b

    goto :goto_7

    :cond_b
    move v1, v2

    :goto_8
    if-eqz v1, :cond_c

    sget-object v1, Lcom/discord/primitives/UserId$$serializer;->INSTANCE:Lcom/discord/primitives/UserId$$serializer;

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->authorId:Lcom/discord/primitives/UserId;

    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_c
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_d

    :goto_9
    move v1, v3

    goto :goto_a

    :cond_d
    iget-wide v4, p0, Lcom/discord/chat/bridge/Message;->flags:J

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-eqz v1, :cond_e

    goto :goto_9

    :cond_e
    move v1, v2

    :goto_a
    if-eqz v1, :cond_f

    iget-wide v4, p0, Lcom/discord/chat/bridge/Message;->flags:J

    invoke-interface {p1, p2, v0, v4, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V

    :cond_f
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_10

    :goto_b
    move v1, v3

    goto :goto_c

    :cond_10
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->edited:Ljava/lang/String;

    if-eqz v1, :cond_11

    goto :goto_b

    :cond_11
    move v1, v2

    :goto_c
    if-eqz v1, :cond_12

    sget-object v1, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->edited:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_12
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_13

    :goto_d
    move v1, v3

    goto :goto_e

    :cond_13
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->_constrainedWidth:Ljava/lang/Float;

    if-eqz v1, :cond_14

    goto :goto_d

    :cond_14
    move v1, v2

    :goto_e
    if-eqz v1, :cond_15

    sget-object v1, Lzi/e0;->a:Lzi/e0;

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->_constrainedWidth:Ljava/lang/Float;

    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_15
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_16

    :goto_f
    move v1, v3

    goto :goto_10

    :cond_16
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->timestamp:Ljava/lang/String;

    if-eqz v1, :cond_17

    goto :goto_f

    :cond_17
    move v1, v2

    :goto_10
    if-eqz v1, :cond_18

    sget-object v1, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->timestamp:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_18
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_19

    :goto_11
    move v1, v3

    goto :goto_12

    :cond_19
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->username:Ljava/lang/String;

    if-eqz v1, :cond_1a

    goto :goto_11

    :cond_1a
    move v1, v2

    :goto_12
    if-eqz v1, :cond_1b

    sget-object v1, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->username:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_1b
    const/16 v0, 0xc

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_1c

    :goto_13
    move v1, v3

    goto :goto_14

    :cond_1c
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->usernameColor:Ljava/lang/Integer;

    if-eqz v1, :cond_1d

    goto :goto_13

    :cond_1d
    move v1, v2

    :goto_14
    if-eqz v1, :cond_1e

    sget-object v1, Lzi/m0;->a:Lzi/m0;

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->usernameColor:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_1e
    const/16 v0, 0xd

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_1f

    :goto_15
    move v1, v3

    goto :goto_16

    :cond_1f
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->roleColor:Ljava/lang/Integer;

    if-eqz v1, :cond_20

    goto :goto_15

    :cond_20
    move v1, v2

    :goto_16
    if-eqz v1, :cond_21

    sget-object v1, Lzi/m0;->a:Lzi/m0;

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->roleColor:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_21
    const/16 v0, 0xe

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_22

    :goto_17
    move v1, v3

    goto :goto_18

    :cond_22
    iget-boolean v1, p0, Lcom/discord/chat/bridge/Message;->shouldShowRoleDot:Z

    if-eqz v1, :cond_23

    goto :goto_17

    :cond_23
    move v1, v2

    :goto_18
    if-eqz v1, :cond_24

    iget-boolean v1, p0, Lcom/discord/chat/bridge/Message;->shouldShowRoleDot:Z

    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    :cond_24
    const/16 v0, 0xf

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_25

    :goto_19
    move v1, v3

    goto :goto_1a

    :cond_25
    iget-boolean v1, p0, Lcom/discord/chat/bridge/Message;->shouldShowRoleOnName:Z

    if-eqz v1, :cond_26

    goto :goto_19

    :cond_26
    move v1, v2

    :goto_1a
    if-eqz v1, :cond_27

    iget-boolean v1, p0, Lcom/discord/chat/bridge/Message;->shouldShowRoleOnName:Z

    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    :cond_27
    const/16 v0, 0x10

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_28

    :goto_1b
    move v1, v3

    goto :goto_1c

    :cond_28
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->colorString:Ljava/lang/Integer;

    if-eqz v1, :cond_29

    goto :goto_1b

    :cond_29
    move v1, v2

    :goto_1c
    if-eqz v1, :cond_2a

    sget-object v1, Lzi/m0;->a:Lzi/m0;

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->colorString:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_2a
    const/16 v0, 0x11

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_2b

    :goto_1d
    move v1, v3

    goto :goto_1e

    :cond_2b
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->avatarURL:Ljava/lang/String;

    if-eqz v1, :cond_2c

    goto :goto_1d

    :cond_2c
    move v1, v2

    :goto_1e
    if-eqz v1, :cond_2d

    sget-object v1, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->avatarURL:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_2d
    const/16 v0, 0x12

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_2e

    :goto_1f
    move v1, v3

    goto :goto_20

    :cond_2e
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->avatarDecorationURL:Ljava/lang/String;

    if-eqz v1, :cond_2f

    goto :goto_1f

    :cond_2f
    move v1, v2

    :goto_20
    if-eqz v1, :cond_30

    sget-object v1, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->avatarDecorationURL:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_30
    const/16 v0, 0x13

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_21
    move v1, v3

    goto :goto_22

    :cond_31
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->embeds:Ljava/util/List;

    if-eqz v1, :cond_32

    goto :goto_21

    :cond_32
    move v1, v2

    :goto_22
    if-eqz v1, :cond_33

    new-instance v1, Lzi/f;

    sget-object v4, Lcom/discord/chat/bridge/embed/Embed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/embed/Embed$$serializer;

    invoke-direct {v1, v4}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->embeds:Ljava/util/List;

    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_33
    const/16 v0, 0x14

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_34

    :goto_23
    move v1, v3

    goto :goto_24

    :cond_34
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->attachments:Ljava/util/List;

    if-eqz v1, :cond_35

    goto :goto_23

    :cond_35
    move v1, v2

    :goto_24
    if-eqz v1, :cond_36

    new-instance v1, Lzi/f;

    sget-object v4, Lcom/discord/chat/bridge/attachment/Attachment$$serializer;->INSTANCE:Lcom/discord/chat/bridge/attachment/Attachment$$serializer;

    invoke-direct {v1, v4}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->attachments:Ljava/util/List;

    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_36
    const/16 v0, 0x15

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_37

    :goto_25
    move v1, v3

    goto :goto_26

    :cond_37
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->attachmentsOpacity:Ljava/lang/Float;

    if-eqz v1, :cond_38

    goto :goto_25

    :cond_38
    move v1, v2

    :goto_26
    if-eqz v1, :cond_39

    sget-object v1, Lzi/e0;->a:Lzi/e0;

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->attachmentsOpacity:Ljava/lang/Float;

    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_39
    const/16 v0, 0x16

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_3a

    :goto_27
    move v1, v3

    goto :goto_28

    :cond_3a
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    if-eqz v1, :cond_3b

    goto :goto_27

    :cond_3b
    move v1, v2

    :goto_28
    if-eqz v1, :cond_3c

    sget-object v1, Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;->INSTANCE:Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;

    iget-object v4, p0, Lcom/discord/chat/bridge/Message;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_3c
    const/16 v0, 0x17

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_3d

    :goto_29
    move v0, v3

    goto :goto_2a

    :cond_3d
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->progress:Ljava/util/List;

    if-eqz v0, :cond_3e

    goto :goto_29

    :cond_3e
    move v0, v2

    :goto_2a
    if-eqz v0, :cond_3f

    new-instance v0, Lzi/f;

    sget-object v1, Lcom/discord/chat/bridge/UploadProgress$$serializer;->INSTANCE:Lcom/discord/chat/bridge/UploadProgress$$serializer;

    invoke-direct {v0, v1}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->progress:Ljava/util/List;

    const/16 v4, 0x17

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_3f
    const/16 v0, 0x18

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_40

    :goto_2b
    move v0, v3

    goto :goto_2c

    :cond_40
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->reactions:Ljava/util/List;

    if-eqz v0, :cond_41

    goto :goto_2b

    :cond_41
    move v0, v2

    :goto_2c
    if-eqz v0, :cond_42

    new-instance v0, Lzi/f;

    sget-object v1, Lcom/discord/chat/bridge/reaction/MessageReaction$$serializer;->INSTANCE:Lcom/discord/chat/bridge/reaction/MessageReaction$$serializer;

    invoke-direct {v0, v1}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->reactions:Ljava/util/List;

    const/16 v4, 0x18

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_42
    const/16 v0, 0x19

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_43

    :goto_2d
    move v0, v3

    goto :goto_2e

    :cond_43
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->useSortedReactions:Ljava/lang/Boolean;

    .line 2
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_44

    goto :goto_2d

    :cond_44
    move v0, v2

    :goto_2e
    if-eqz v0, :cond_45

    .line 3
    sget-object v0, Lzi/h;->a:Lzi/h;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->useSortedReactions:Ljava/lang/Boolean;

    const/16 v4, 0x19

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_45
    const/16 v0, 0x1a

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_46

    :goto_2f
    move v0, v3

    goto :goto_30

    :cond_46
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->useAddBurstReaction:Ljava/lang/Boolean;

    .line 4
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_47

    goto :goto_2f

    :cond_47
    move v0, v2

    :goto_30
    if-eqz v0, :cond_48

    .line 5
    sget-object v0, Lzi/h;->a:Lzi/h;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->useAddBurstReaction:Ljava/lang/Boolean;

    const/16 v4, 0x1a

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_48
    const/16 v0, 0x1b

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_49

    :goto_31
    move v0, v3

    goto :goto_32

    :cond_49
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->codedLinks:Ljava/util/List;

    if-eqz v0, :cond_4a

    goto :goto_31

    :cond_4a
    move v0, v2

    :goto_32
    if-eqz v0, :cond_4b

    new-instance v0, Lzi/f;

    sget-object v1, Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;

    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    move-result-object v1

    invoke-direct {v0, v1}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->codedLinks:Ljava/util/List;

    const/16 v4, 0x1b

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_4b
    const/16 v0, 0x1c

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_4c

    :goto_33
    move v0, v3

    goto :goto_34

    :cond_4c
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->stickers:Ljava/util/List;

    if-eqz v0, :cond_4d

    goto :goto_33

    :cond_4d
    move v0, v2

    :goto_34
    if-eqz v0, :cond_4e

    new-instance v0, Lzi/f;

    sget-object v1, Lcom/discord/chat/bridge/sticker/Sticker$$serializer;->INSTANCE:Lcom/discord/chat/bridge/sticker/Sticker$$serializer;

    invoke-direct {v0, v1}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->stickers:Ljava/util/List;

    const/16 v4, 0x1c

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_4e
    const/16 v0, 0x1d

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_4f

    :goto_35
    move v0, v3

    goto :goto_36

    :cond_4f
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->roleIcon:Lcom/discord/chat/bridge/roleicons/RoleIcon;

    if-eqz v0, :cond_50

    goto :goto_35

    :cond_50
    move v0, v2

    :goto_36
    if-eqz v0, :cond_51

    sget-object v0, Lcom/discord/chat/bridge/roleicons/RoleIcon$$serializer;->INSTANCE:Lcom/discord/chat/bridge/roleicons/RoleIcon$$serializer;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->roleIcon:Lcom/discord/chat/bridge/roleicons/RoleIcon;

    const/16 v4, 0x1d

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_51
    const/16 v0, 0x1e

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_52

    :goto_37
    move v0, v3

    goto :goto_38

    :cond_52
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->connectionsRoleTag:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    if-eqz v0, :cond_53

    goto :goto_37

    :cond_53
    move v0, v2

    :goto_38
    if-eqz v0, :cond_54

    sget-object v0, Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag$$serializer;->INSTANCE:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag$$serializer;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->connectionsRoleTag:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    const/16 v4, 0x1e

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_54
    const/16 v0, 0x1f

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_55

    :goto_39
    move v0, v3

    goto :goto_3a

    :cond_55
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->threadEmbed:Lcom/discord/chat/bridge/threads/ThreadEmbed;

    if-eqz v0, :cond_56

    goto :goto_39

    :cond_56
    move v0, v2

    :goto_3a
    if-eqz v0, :cond_57

    sget-object v0, Lcom/discord/chat/bridge/threads/ThreadEmbed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/threads/ThreadEmbed$$serializer;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->threadEmbed:Lcom/discord/chat/bridge/threads/ThreadEmbed;

    const/16 v4, 0x1f

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_57
    const/16 v0, 0x20

    iget-boolean v1, p0, Lcom/discord/chat/bridge/Message;->mentioned:Z

    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    const/16 v0, 0x21

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_58

    :goto_3b
    move v0, v3

    goto :goto_3c

    :cond_58
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->gifAutoPlay:Ljava/lang/Boolean;

    if-eqz v0, :cond_59

    goto :goto_3b

    :cond_59
    move v0, v2

    :goto_3c
    if-eqz v0, :cond_5a

    sget-object v0, Lzi/h;->a:Lzi/h;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->gifAutoPlay:Ljava/lang/Boolean;

    const/16 v4, 0x21

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_5a
    const/16 v0, 0x22

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_5b

    :goto_3d
    move v0, v3

    goto :goto_3e

    :cond_5b
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->animateEmoji:Ljava/lang/Boolean;

    if-eqz v0, :cond_5c

    goto :goto_3d

    :cond_5c
    move v0, v2

    :goto_3e
    if-eqz v0, :cond_5d

    sget-object v0, Lzi/h;->a:Lzi/h;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->animateEmoji:Ljava/lang/Boolean;

    const/16 v4, 0x22

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_5d
    const/16 v0, 0x23

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_5e

    :goto_3f
    move v0, v3

    goto :goto_40

    :cond_5e
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->referencedMessage:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    if-eqz v0, :cond_5f

    goto :goto_3f

    :cond_5f
    move v0, v2

    :goto_40
    if-eqz v0, :cond_60

    sget-object v0, Lcom/discord/chat/bridge/referencedmessage/ReferencedMessageSerializer;->INSTANCE:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessageSerializer;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->referencedMessage:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    const/16 v4, 0x23

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_60
    const/16 v0, 0x24

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_61

    :goto_41
    move v0, v3

    goto :goto_42

    :cond_61
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->executedCommand:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    if-eqz v0, :cond_62

    goto :goto_41

    :cond_62
    move v0, v2

    :goto_42
    if-eqz v0, :cond_63

    sget-object v0, Lcom/discord/chat/bridge/executedcommand/ExecutedCommand$$serializer;->INSTANCE:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand$$serializer;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->executedCommand:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    const/16 v4, 0x24

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_63
    const/16 v0, 0x25

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_64

    :goto_43
    move v0, v3

    goto :goto_44

    :cond_64
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->components:Ljava/util/List;

    if-eqz v0, :cond_65

    goto :goto_43

    :cond_65
    move v0, v2

    :goto_44
    if-eqz v0, :cond_66

    new-instance v0, Lzi/f;

    sget-object v1, Lcom/discord/chat/bridge/botuikit/ComponentSerializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ComponentSerializer;

    invoke-direct {v0, v1}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->components:Ljava/util/List;

    const/16 v4, 0x25

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_66
    const/16 v0, 0x26

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_67

    :goto_45
    move v0, v3

    goto :goto_46

    :cond_67
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->threadStarterMessageHeader:Ljava/lang/String;

    if-eqz v0, :cond_68

    goto :goto_45

    :cond_68
    move v0, v2

    :goto_46
    if-eqz v0, :cond_69

    sget-object v0, Lzi/a2;->a:Lzi/a2;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->threadStarterMessageHeader:Ljava/lang/String;

    const/16 v4, 0x26

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_69
    const/16 v0, 0x27

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_6a

    :goto_47
    move v0, v3

    goto :goto_48

    :cond_6a
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->communicationDisabled:Ljava/lang/Boolean;

    if-eqz v0, :cond_6b

    goto :goto_47

    :cond_6b
    move v0, v2

    :goto_48
    if-eqz v0, :cond_6c

    sget-object v0, Lzi/h;->a:Lzi/h;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->communicationDisabled:Ljava/lang/Boolean;

    const/16 v4, 0x27

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_6c
    const/16 v0, 0x28

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_6d

    :goto_49
    move v0, v3

    goto :goto_4a

    :cond_6d
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->tagText:Ljava/lang/String;

    if-eqz v0, :cond_6e

    goto :goto_49

    :cond_6e
    move v0, v2

    :goto_4a
    if-eqz v0, :cond_6f

    sget-object v0, Lzi/a2;->a:Lzi/a2;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->tagText:Ljava/lang/String;

    const/16 v4, 0x28

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_6f
    const/16 v0, 0x29

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_70

    :goto_4b
    move v0, v3

    goto :goto_4c

    :cond_70
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->tagVerified:Ljava/lang/Boolean;

    if-eqz v0, :cond_71

    goto :goto_4b

    :cond_71
    move v0, v2

    :goto_4c
    if-eqz v0, :cond_72

    sget-object v0, Lzi/h;->a:Lzi/h;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->tagVerified:Ljava/lang/Boolean;

    const/16 v4, 0x29

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_72
    const/16 v0, 0x2a

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_73

    :goto_4d
    move v0, v3

    goto :goto_4e

    :cond_73
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->tagBackgroundColor:Ljava/lang/Integer;

    if-eqz v0, :cond_74

    goto :goto_4d

    :cond_74
    move v0, v2

    :goto_4e
    if-eqz v0, :cond_75

    sget-object v0, Lzi/m0;->a:Lzi/m0;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->tagBackgroundColor:Ljava/lang/Integer;

    const/16 v4, 0x2a

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_75
    const/16 v0, 0x2b

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_76

    :goto_4f
    move v0, v3

    goto :goto_50

    :cond_76
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->opTagText:Ljava/lang/String;

    if-eqz v0, :cond_77

    goto :goto_4f

    :cond_77
    move v0, v2

    :goto_50
    if-eqz v0, :cond_78

    sget-object v0, Lzi/a2;->a:Lzi/a2;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->opTagText:Ljava/lang/String;

    const/16 v4, 0x2b

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_78
    const/16 v0, 0x2c

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_79

    :goto_51
    move v0, v3

    goto :goto_52

    :cond_79
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->ephemeralIndication:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;

    if-eqz v0, :cond_7a

    goto :goto_51

    :cond_7a
    move v0, v2

    :goto_52
    if-eqz v0, :cond_7b

    sget-object v0, Lcom/discord/chat/bridge/ephemeral/EphemeralIndication$$serializer;->INSTANCE:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication$$serializer;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->ephemeralIndication:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;

    const/16 v4, 0x2c

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_7b
    const/16 v0, 0x2d

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_7c

    :goto_53
    move v0, v3

    goto :goto_54

    :cond_7c
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->surveyIndication:Lcom/discord/chat/bridge/feedback/SurveyIndication;

    if-eqz v0, :cond_7d

    goto :goto_53

    :cond_7d
    move v0, v2

    :goto_54
    if-eqz v0, :cond_7e

    sget-object v0, Lcom/discord/chat/bridge/feedback/SurveyIndication$$serializer;->INSTANCE:Lcom/discord/chat/bridge/feedback/SurveyIndication$$serializer;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->surveyIndication:Lcom/discord/chat/bridge/feedback/SurveyIndication;

    const/16 v4, 0x2d

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_7e
    const/16 v0, 0x2e

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_7f

    :goto_55
    move v0, v3

    goto :goto_56

    :cond_7f
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->interactionStatus:Lcom/discord/chat/bridge/interaction/InteractionStatus;

    if-eqz v0, :cond_80

    goto :goto_55

    :cond_80
    move v0, v2

    :goto_56
    if-eqz v0, :cond_81

    sget-object v0, Lcom/discord/chat/bridge/interaction/InteractionStatus$$serializer;->INSTANCE:Lcom/discord/chat/bridge/interaction/InteractionStatus$$serializer;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->interactionStatus:Lcom/discord/chat/bridge/interaction/InteractionStatus;

    const/16 v4, 0x2e

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_81
    const/16 v0, 0x2f

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_82

    :goto_57
    move v0, v3

    goto :goto_58

    :cond_82
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->useAttachmentGridLayout:Ljava/lang/Boolean;

    .line 6
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_83

    goto :goto_57

    :cond_83
    move v0, v2

    :goto_58
    if-eqz v0, :cond_84

    .line 7
    sget-object v0, Lzi/h;->a:Lzi/h;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->useAttachmentGridLayout:Ljava/lang/Boolean;

    const/16 v4, 0x2f

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_84
    const/16 v0, 0x30

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_85

    :goto_59
    move v0, v3

    goto :goto_5a

    :cond_85
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->useAttachmentUploadPreview:Ljava/lang/Boolean;

    .line 8
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_86

    goto :goto_59

    :cond_86
    move v0, v2

    :goto_5a
    if-eqz v0, :cond_87

    .line 9
    sget-object v0, Lzi/h;->a:Lzi/h;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->useAttachmentUploadPreview:Ljava/lang/Boolean;

    const/16 v4, 0x30

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_87
    const/16 v0, 0x31

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_88

    :goto_5b
    move v0, v3

    goto :goto_5c

    :cond_88
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->isCurrentUserMessageAuthor:Ljava/lang/Boolean;

    .line 10
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_89

    goto :goto_5b

    :cond_89
    move v0, v2

    :goto_5c
    if-eqz v0, :cond_8a

    .line 11
    sget-object v0, Lzi/h;->a:Lzi/h;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->isCurrentUserMessageAuthor:Ljava/lang/Boolean;

    const/16 v4, 0x31

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_8a
    const/16 v0, 0x32

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_8b

    :goto_5d
    move v0, v3

    goto :goto_5e

    :cond_8b
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->title:Ljava/lang/String;

    if-eqz v0, :cond_8c

    goto :goto_5d

    :cond_8c
    move v0, v2

    :goto_5e
    if-eqz v0, :cond_8d

    sget-object v0, Lzi/a2;->a:Lzi/a2;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->title:Ljava/lang/String;

    const/16 v4, 0x32

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_8d
    const/16 v0, 0x33

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_8e

    :goto_5f
    move v0, v3

    goto :goto_60

    :cond_8e
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->description:Ljava/lang/String;

    if-eqz v0, :cond_8f

    goto :goto_5f

    :cond_8f
    move v0, v2

    :goto_60
    if-eqz v0, :cond_90

    sget-object v0, Lzi/a2;->a:Lzi/a2;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->description:Ljava/lang/String;

    const/16 v4, 0x33

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_90
    const/16 v0, 0x34

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_91

    :goto_61
    move v0, v3

    goto :goto_62

    :cond_91
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->avatarURLs:Ljava/util/List;

    if-eqz v0, :cond_92

    goto :goto_61

    :cond_92
    move v0, v2

    :goto_62
    if-eqz v0, :cond_93

    new-instance v0, Lzi/f;

    sget-object v1, Lzi/a2;->a:Lzi/a2;

    invoke-direct {v0, v1}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->avatarURLs:Ljava/util/List;

    const/16 v4, 0x34

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_93
    const/16 v0, 0x35

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_94

    :goto_63
    move v0, v3

    goto :goto_64

    :cond_94
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->isCallActive:Ljava/lang/Boolean;

    if-eqz v0, :cond_95

    goto :goto_63

    :cond_95
    move v0, v2

    :goto_64
    if-eqz v0, :cond_96

    sget-object v0, Lzi/h;->a:Lzi/h;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->isCallActive:Ljava/lang/Boolean;

    const/16 v4, 0x35

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_96
    const/16 v0, 0x36

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_97

    :goto_65
    move v0, v3

    goto :goto_66

    :cond_97
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->missed:Ljava/lang/Boolean;

    if-eqz v0, :cond_98

    goto :goto_65

    :cond_98
    move v0, v2

    :goto_66
    if-eqz v0, :cond_99

    sget-object v0, Lzi/h;->a:Lzi/h;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->missed:Ljava/lang/Boolean;

    const/16 v4, 0x36

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_99
    const/16 v0, 0x37

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_9a

    :goto_67
    move v0, v3

    goto :goto_68

    :cond_9a
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->rawMilliseconds:Ljava/lang/Long;

    if-eqz v0, :cond_9b

    goto :goto_67

    :cond_9b
    move v0, v2

    :goto_68
    if-eqz v0, :cond_9c

    sget-object v0, Lzi/w0;->a:Lzi/w0;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->rawMilliseconds:Ljava/lang/Long;

    const/16 v4, 0x37

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_9c
    const/16 v0, 0x38

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_9d

    :goto_69
    move v0, v3

    goto :goto_6a

    :cond_9d
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    if-eqz v0, :cond_9e

    goto :goto_69

    :cond_9e
    move v0, v2

    :goto_6a
    if-eqz v0, :cond_9f

    sget-object v0, Lcom/discord/chat/bridge/sticker/Sticker$$serializer;->INSTANCE:Lcom/discord/chat/bridge/sticker/Sticker$$serializer;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    const/16 v4, 0x38

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_9f
    const/16 v0, 0x39

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_a0

    :goto_6b
    move v0, v3

    goto :goto_6c

    :cond_a0
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->stickerLabel:Ljava/lang/String;

    if-eqz v0, :cond_a1

    goto :goto_6b

    :cond_a1
    move v0, v2

    :goto_6c
    if-eqz v0, :cond_a2

    sget-object v0, Lzi/a2;->a:Lzi/a2;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->stickerLabel:Ljava/lang/String;

    const/16 v4, 0x39

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_a2
    const/16 v0, 0x3a

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_a3

    :goto_6d
    move v0, v3

    goto :goto_6e

    :cond_a3
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->buttonLabel:Ljava/lang/String;

    if-eqz v0, :cond_a4

    goto :goto_6d

    :cond_a4
    move v0, v2

    :goto_6e
    if-eqz v0, :cond_a5

    sget-object v0, Lzi/a2;->a:Lzi/a2;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->buttonLabel:Ljava/lang/String;

    const/16 v4, 0x3a

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_a5
    const/16 v0, 0x3b

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_a6

    :goto_6f
    move v0, v3

    goto :goto_70

    :cond_a6
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->showInviteToSpeakButton:Ljava/lang/Boolean;

    if-eqz v0, :cond_a7

    goto :goto_6f

    :cond_a7
    move v0, v2

    :goto_70
    if-eqz v0, :cond_a8

    sget-object v0, Lzi/h;->a:Lzi/h;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->showInviteToSpeakButton:Ljava/lang/Boolean;

    const/16 v4, 0x3b

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_a8
    const/16 v0, 0x3c

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_a9

    :goto_71
    move v0, v3

    goto :goto_72

    :cond_a9
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->activityInviteEmbed:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    if-eqz v0, :cond_aa

    goto :goto_71

    :cond_aa
    move v0, v2

    :goto_72
    if-eqz v0, :cond_ab

    sget-object v0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$$serializer;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->activityInviteEmbed:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    const/16 v4, 0x3c

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_ab
    const/16 v0, 0x3d

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_ac

    :goto_73
    move v0, v3

    goto :goto_74

    :cond_ac
    iget-boolean v0, p0, Lcom/discord/chat/bridge/Message;->isFirstForumPostMessage:Z

    if-eqz v0, :cond_ad

    goto :goto_73

    :cond_ad
    move v0, v2

    :goto_74
    if-eqz v0, :cond_ae

    const/16 v0, 0x3d

    iget-boolean v1, p0, Lcom/discord/chat/bridge/Message;->isFirstForumPostMessage:Z

    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    :cond_ae
    const/16 v0, 0x3e

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_af

    :goto_75
    move v0, v3

    goto :goto_76

    :cond_af
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->postActions:Lcom/discord/chat/bridge/forums/ForumPostActions;

    if-eqz v0, :cond_b0

    goto :goto_75

    :cond_b0
    move v0, v2

    :goto_76
    if-eqz v0, :cond_b1

    sget-object v0, Lcom/discord/chat/bridge/forums/ForumPostActions$$serializer;->INSTANCE:Lcom/discord/chat/bridge/forums/ForumPostActions$$serializer;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->postActions:Lcom/discord/chat/bridge/forums/ForumPostActions;

    const/16 v4, 0x3e

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_b1
    const/16 v0, 0x3f

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_b2

    :goto_77
    move v0, v3

    goto :goto_78

    :cond_b2
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->autoModerationContext:Lcom/discord/chat/bridge/automod/AutoModerationContext;

    if-eqz v0, :cond_b3

    goto :goto_77

    :cond_b3
    move v0, v2

    :goto_78
    if-eqz v0, :cond_b4

    sget-object v0, Lcom/discord/chat/bridge/automod/AutoModerationContext$$serializer;->INSTANCE:Lcom/discord/chat/bridge/automod/AutoModerationContext$$serializer;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->autoModerationContext:Lcom/discord/chat/bridge/automod/AutoModerationContext;

    const/16 v4, 0x3f

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_b4
    const/16 v0, 0x40

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_b5

    :goto_79
    move v0, v3

    goto :goto_7a

    :cond_b5
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->giftCodes:Ljava/util/List;

    if-eqz v0, :cond_b6

    goto :goto_79

    :cond_b6
    move v0, v2

    :goto_7a
    if-eqz v0, :cond_b7

    new-instance v0, Lzi/f;

    sget-object v1, Lcom/discord/chat/bridge/gift/GiftEmbedSerializer;->INSTANCE:Lcom/discord/chat/bridge/gift/GiftEmbedSerializer;

    invoke-direct {v0, v1}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->giftCodes:Ljava/util/List;

    const/16 v4, 0x40

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_b7
    const/16 v0, 0x41

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_b8

    :goto_7b
    move v0, v3

    goto :goto_7c

    :cond_b8
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->referralTrialOffer:Lcom/discord/chat/bridge/gift/GiftEmbed;

    if-eqz v0, :cond_b9

    goto :goto_7b

    :cond_b9
    move v0, v2

    :goto_7c
    if-eqz v0, :cond_ba

    sget-object v0, Lcom/discord/chat/bridge/gift/GiftEmbedSerializer;->INSTANCE:Lcom/discord/chat/bridge/gift/GiftEmbedSerializer;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->referralTrialOffer:Lcom/discord/chat/bridge/gift/GiftEmbed;

    const/16 v4, 0x41

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_ba
    const/16 v0, 0x42

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_bb

    :goto_7d
    move v0, v3

    goto :goto_7e

    :cond_bb
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->totalMonthsSubscribed:Ljava/lang/Integer;

    if-eqz v0, :cond_bc

    goto :goto_7d

    :cond_bc
    move v0, v2

    :goto_7e
    if-eqz v0, :cond_bd

    sget-object v0, Lzi/m0;->a:Lzi/m0;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->totalMonthsSubscribed:Ljava/lang/Integer;

    const/16 v4, 0x42

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_bd
    const/16 v0, 0x43

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_be

    :goto_7f
    move v0, v3

    goto :goto_80

    :cond_be
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->swipeToReplyIconUrl:Ljava/lang/String;

    if-eqz v0, :cond_bf

    goto :goto_7f

    :cond_bf
    move v0, v2

    :goto_80
    if-eqz v0, :cond_c0

    sget-object v0, Lzi/a2;->a:Lzi/a2;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->swipeToReplyIconUrl:Ljava/lang/String;

    const/16 v4, 0x43

    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_c0
    const/16 v0, 0x44

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_c1

    :goto_81
    move v2, v3

    goto :goto_82

    :cond_c1
    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->postPreviewEmbeds:Ljava/util/List;

    if-eqz v0, :cond_c2

    goto :goto_81

    :cond_c2
    :goto_82
    if-eqz v2, :cond_c3

    new-instance v0, Lzi/f;

    sget-object v1, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed$$serializer;

    invoke-direct {v0, v1}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    iget-object p0, p0, Lcom/discord/chat/bridge/Message;->postPreviewEmbeds:Ljava/util/List;

    const/16 v1, 0x44

    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_c3
    return-void
.end method


# virtual methods
.method public final component1()Lcom/discord/chat/bridge/MessageType;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->type:Lcom/discord/chat/bridge/MessageType;

    return-object v0
.end method

.method public final component10()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->_constrainedWidth:Ljava/lang/Float;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->timestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->username:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->usernameColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component14()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->roleColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/Message;->shouldShowRoleDot:Z

    return v0
.end method

.method public final component16()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/Message;->shouldShowRoleOnName:Z

    return v0
.end method

.method public final component17()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->colorString:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component18$chat_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->avatarURL:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->avatarDecorationURL:Ljava/lang/String;

    return-object v0
.end method

.method public final component2-3Eiw7ao()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/embed/Embed;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->embeds:Ljava/util/List;

    return-object v0
.end method

.method public final component21()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/attachment/Attachment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->attachments:Ljava/util/List;

    return-object v0
.end method

.method public final component22()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->attachmentsOpacity:Ljava/lang/Float;

    return-object v0
.end method

.method public final component23()Lcom/discord/chat/bridge/structurabletext/StructurableText;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    return-object v0
.end method

.method public final component24()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/UploadProgress;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->progress:Ljava/util/List;

    return-object v0
.end method

.method public final component25()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/reaction/MessageReaction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->reactions:Ljava/util/List;

    return-object v0
.end method

.method public final component26()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->useSortedReactions:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component27()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->useAddBurstReaction:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component28()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->codedLinks:Ljava/util/List;

    return-object v0
.end method

.method public final component29()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/sticker/Sticker;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->stickers:Ljava/util/List;

    return-object v0
.end method

.method public final component3-N_6c4I0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->nonce:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()Lcom/discord/chat/bridge/roleicons/RoleIcon;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->roleIcon:Lcom/discord/chat/bridge/roleicons/RoleIcon;

    return-object v0
.end method

.method public final component31()Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->connectionsRoleTag:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    return-object v0
.end method

.method public final component32()Lcom/discord/chat/bridge/threads/ThreadEmbed;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->threadEmbed:Lcom/discord/chat/bridge/threads/ThreadEmbed;

    return-object v0
.end method

.method public final component33()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/Message;->mentioned:Z

    return v0
.end method

.method public final component34()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->gifAutoPlay:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component35()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->animateEmoji:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component36()Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->referencedMessage:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    return-object v0
.end method

.method public final component37()Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->executedCommand:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    return-object v0
.end method

.method public final component38()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/botuikit/Component;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->components:Ljava/util/List;

    return-object v0
.end method

.method public final component39()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->threadStarterMessageHeader:Ljava/lang/String;

    return-object v0
.end method

.method public final component4-o4g7jtM()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/bridge/Message;->channelId:J

    return-wide v0
.end method

.method public final component40()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->communicationDisabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component41()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->tagText:Ljava/lang/String;

    return-object v0
.end method

.method public final component42()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->tagVerified:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component43()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->tagBackgroundColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component44()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->opTagText:Ljava/lang/String;

    return-object v0
.end method

.method public final component45()Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->ephemeralIndication:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;

    return-object v0
.end method

.method public final component46()Lcom/discord/chat/bridge/feedback/SurveyIndication;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->surveyIndication:Lcom/discord/chat/bridge/feedback/SurveyIndication;

    return-object v0
.end method

.method public final component47()Lcom/discord/chat/bridge/interaction/InteractionStatus;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->interactionStatus:Lcom/discord/chat/bridge/interaction/InteractionStatus;

    return-object v0
.end method

.method public final component48()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->useAttachmentGridLayout:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component49()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->useAttachmentUploadPreview:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component5-qOKuAAo()Lcom/discord/primitives/GuildId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->guildId:Lcom/discord/primitives/GuildId;

    return-object v0
.end method

.method public final component50()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->isCurrentUserMessageAuthor:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component51()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component52()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component53()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->avatarURLs:Ljava/util/List;

    return-object v0
.end method

.method public final component54()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->isCallActive:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component55()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->missed:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component56()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->rawMilliseconds:Ljava/lang/Long;

    return-object v0
.end method

.method public final component57()Lcom/discord/chat/bridge/sticker/Sticker;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    return-object v0
.end method

.method public final component58()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->stickerLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component59()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->buttonLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/discord/chat/bridge/MessageState;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->state:Lcom/discord/chat/bridge/MessageState;

    return-object v0
.end method

.method public final component60()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->showInviteToSpeakButton:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component61()Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->activityInviteEmbed:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    return-object v0
.end method

.method public final component62()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/Message;->isFirstForumPostMessage:Z

    return v0
.end method

.method public final component63()Lcom/discord/chat/bridge/forums/ForumPostActions;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->postActions:Lcom/discord/chat/bridge/forums/ForumPostActions;

    return-object v0
.end method

.method public final component64()Lcom/discord/chat/bridge/automod/AutoModerationContext;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->autoModerationContext:Lcom/discord/chat/bridge/automod/AutoModerationContext;

    return-object v0
.end method

.method public final component65()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/gift/GiftEmbed;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->giftCodes:Ljava/util/List;

    return-object v0
.end method

.method public final component66()Lcom/discord/chat/bridge/gift/GiftEmbed;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->referralTrialOffer:Lcom/discord/chat/bridge/gift/GiftEmbed;

    return-object v0
.end method

.method public final component67()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->totalMonthsSubscribed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component68()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->swipeToReplyIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component69()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->postPreviewEmbeds:Ljava/util/List;

    return-object v0
.end method

.method public final component7-wUX8bhU()Lcom/discord/primitives/UserId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->authorId:Lcom/discord/primitives/UserId;

    return-object v0
.end method

.method public final component8()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/bridge/Message;->flags:J

    return-wide v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->edited:Ljava/lang/String;

    return-object v0
.end method

.method public final copy-HxUhIIA(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/discord/chat/bridge/Message;
    .locals 75
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/bridge/MessageType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Lcom/discord/primitives/GuildId;",
            "Lcom/discord/chat/bridge/MessageState;",
            "Lcom/discord/primitives/UserId;",
            "J",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "ZZ",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/embed/Embed;",
            ">;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/attachment/Attachment;",
            ">;",
            "Ljava/lang/Float;",
            "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/UploadProgress;",
            ">;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/reaction/MessageReaction;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;",
            ">;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/sticker/Sticker;",
            ">;",
            "Lcom/discord/chat/bridge/roleicons/RoleIcon;",
            "Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;",
            "Lcom/discord/chat/bridge/threads/ThreadEmbed;",
            "Z",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;",
            "Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/botuikit/Component;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;",
            "Lcom/discord/chat/bridge/feedback/SurveyIndication;",
            "Lcom/discord/chat/bridge/interaction/InteractionStatus;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Long;",
            "Lcom/discord/chat/bridge/sticker/Sticker;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;",
            "Z",
            "Lcom/discord/chat/bridge/forums/ForumPostActions;",
            "Lcom/discord/chat/bridge/automod/AutoModerationContext;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/gift/GiftEmbed;",
            ">;",
            "Lcom/discord/chat/bridge/gift/GiftEmbed;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;",
            ">;)",
            "Lcom/discord/chat/bridge/Message;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-wide/from16 v4, p4

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-wide/from16 v9, p9

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

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

    move/from16 v35, p35

    move-object/from16 v36, p36

    move-object/from16 v37, p37

    move-object/from16 v38, p38

    move-object/from16 v39, p39

    move-object/from16 v40, p40

    move-object/from16 v41, p41

    move-object/from16 v42, p42

    move-object/from16 v43, p43

    move-object/from16 v44, p44

    move-object/from16 v45, p45

    move-object/from16 v46, p46

    move-object/from16 v47, p47

    move-object/from16 v48, p48

    move-object/from16 v49, p49

    move-object/from16 v50, p50

    move-object/from16 v51, p51

    move-object/from16 v52, p52

    move-object/from16 v53, p53

    move-object/from16 v54, p54

    move-object/from16 v55, p55

    move-object/from16 v56, p56

    move-object/from16 v57, p57

    move-object/from16 v58, p58

    move-object/from16 v59, p59

    move-object/from16 v60, p60

    move-object/from16 v61, p61

    move-object/from16 v62, p62

    move-object/from16 v63, p63

    move/from16 v64, p64

    move-object/from16 v65, p65

    move-object/from16 v66, p66

    move-object/from16 v67, p67

    move-object/from16 v68, p68

    move-object/from16 v69, p69

    move-object/from16 v70, p70

    move-object/from16 v71, p71

    const-string v0, "type"

    move-object/from16 v73, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v74, Lcom/discord/chat/bridge/Message;

    move-object/from16 v0, v74

    const/16 v72, 0x0

    move-object/from16 v1, v73

    invoke-direct/range {v0 .. v72}, Lcom/discord/chat/bridge/Message;-><init>(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v74
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/Message;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/Message;

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->type:Lcom/discord/chat/bridge/MessageType;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->type:Lcom/discord/chat/bridge/MessageType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/discord/primitives/MessageId;->equals-impl0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->nonce:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->nonce:Ljava/lang/String;

    if-nez v1, :cond_4

    if-nez v3, :cond_5

    move v1, v0

    goto :goto_0

    :cond_4
    if-nez v3, :cond_6

    :cond_5
    move v1, v2

    goto :goto_0

    :cond_6
    invoke-static {v1, v3}, Lcom/discord/primitives/MessageId;->equals-impl0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    :goto_0
    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/discord/chat/bridge/Message;->channelId:J

    iget-wide v5, p1, Lcom/discord/chat/bridge/Message;->channelId:J

    invoke-static {v3, v4, v5, v6}, Lcom/discord/primitives/ChannelId;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->guildId:Lcom/discord/primitives/GuildId;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->guildId:Lcom/discord/primitives/GuildId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->state:Lcom/discord/chat/bridge/MessageState;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->state:Lcom/discord/chat/bridge/MessageState;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->authorId:Lcom/discord/primitives/UserId;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->authorId:Lcom/discord/primitives/UserId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, Lcom/discord/chat/bridge/Message;->flags:J

    iget-wide v5, p1, Lcom/discord/chat/bridge/Message;->flags:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->edited:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->edited:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->_constrainedWidth:Ljava/lang/Float;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->_constrainedWidth:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->timestamp:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->timestamp:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->username:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->username:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->usernameColor:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->usernameColor:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->roleColor:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->roleColor:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-boolean v1, p0, Lcom/discord/chat/bridge/Message;->shouldShowRoleDot:Z

    iget-boolean v3, p1, Lcom/discord/chat/bridge/Message;->shouldShowRoleDot:Z

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-boolean v1, p0, Lcom/discord/chat/bridge/Message;->shouldShowRoleOnName:Z

    iget-boolean v3, p1, Lcom/discord/chat/bridge/Message;->shouldShowRoleOnName:Z

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->colorString:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->colorString:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->avatarURL:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->avatarURL:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->avatarDecorationURL:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->avatarDecorationURL:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->embeds:Ljava/util/List;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->embeds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->attachments:Ljava/util/List;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->attachments:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->attachmentsOpacity:Ljava/lang/Float;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->attachmentsOpacity:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->progress:Ljava/util/List;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->progress:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->reactions:Ljava/util/List;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->reactions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->useSortedReactions:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->useSortedReactions:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->useAddBurstReaction:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->useAddBurstReaction:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->codedLinks:Ljava/util/List;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->codedLinks:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->stickers:Ljava/util/List;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->stickers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->roleIcon:Lcom/discord/chat/bridge/roleicons/RoleIcon;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->roleIcon:Lcom/discord/chat/bridge/roleicons/RoleIcon;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->connectionsRoleTag:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->connectionsRoleTag:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->threadEmbed:Lcom/discord/chat/bridge/threads/ThreadEmbed;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->threadEmbed:Lcom/discord/chat/bridge/threads/ThreadEmbed;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-boolean v1, p0, Lcom/discord/chat/bridge/Message;->mentioned:Z

    iget-boolean v3, p1, Lcom/discord/chat/bridge/Message;->mentioned:Z

    if-eq v1, v3, :cond_25

    return v2

    :cond_25
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->gifAutoPlay:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->gifAutoPlay:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    return v2

    :cond_26
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->animateEmoji:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->animateEmoji:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->referencedMessage:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->referencedMessage:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    return v2

    :cond_28
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->executedCommand:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->executedCommand:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->components:Ljava/util/List;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->components:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    return v2

    :cond_2a
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->threadStarterMessageHeader:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->threadStarterMessageHeader:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    return v2

    :cond_2b
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->communicationDisabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->communicationDisabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    return v2

    :cond_2c
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->tagText:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->tagText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    return v2

    :cond_2d
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->tagVerified:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->tagVerified:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    return v2

    :cond_2e
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->tagBackgroundColor:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->tagBackgroundColor:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    return v2

    :cond_2f
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->opTagText:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->opTagText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    return v2

    :cond_30
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->ephemeralIndication:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->ephemeralIndication:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_31

    return v2

    :cond_31
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->surveyIndication:Lcom/discord/chat/bridge/feedback/SurveyIndication;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->surveyIndication:Lcom/discord/chat/bridge/feedback/SurveyIndication;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    return v2

    :cond_32
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->interactionStatus:Lcom/discord/chat/bridge/interaction/InteractionStatus;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->interactionStatus:Lcom/discord/chat/bridge/interaction/InteractionStatus;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    return v2

    :cond_33
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->useAttachmentGridLayout:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->useAttachmentGridLayout:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_34

    return v2

    :cond_34
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->useAttachmentUploadPreview:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->useAttachmentUploadPreview:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_35

    return v2

    :cond_35
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->isCurrentUserMessageAuthor:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->isCurrentUserMessageAuthor:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_36

    return v2

    :cond_36
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_37

    return v2

    :cond_37
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_38

    return v2

    :cond_38
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->avatarURLs:Ljava/util/List;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->avatarURLs:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_39

    return v2

    :cond_39
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->isCallActive:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->isCallActive:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3a

    return v2

    :cond_3a
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->missed:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->missed:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3b

    return v2

    :cond_3b
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->rawMilliseconds:Ljava/lang/Long;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->rawMilliseconds:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3c

    return v2

    :cond_3c
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3d

    return v2

    :cond_3d
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->stickerLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->stickerLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3e

    return v2

    :cond_3e
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->buttonLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->buttonLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3f

    return v2

    :cond_3f
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->showInviteToSpeakButton:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->showInviteToSpeakButton:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_40

    return v2

    :cond_40
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->activityInviteEmbed:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->activityInviteEmbed:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_41

    return v2

    :cond_41
    iget-boolean v1, p0, Lcom/discord/chat/bridge/Message;->isFirstForumPostMessage:Z

    iget-boolean v3, p1, Lcom/discord/chat/bridge/Message;->isFirstForumPostMessage:Z

    if-eq v1, v3, :cond_42

    return v2

    :cond_42
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->postActions:Lcom/discord/chat/bridge/forums/ForumPostActions;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->postActions:Lcom/discord/chat/bridge/forums/ForumPostActions;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_43

    return v2

    :cond_43
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->autoModerationContext:Lcom/discord/chat/bridge/automod/AutoModerationContext;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->autoModerationContext:Lcom/discord/chat/bridge/automod/AutoModerationContext;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_44

    return v2

    :cond_44
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->giftCodes:Ljava/util/List;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->giftCodes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_45

    return v2

    :cond_45
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->referralTrialOffer:Lcom/discord/chat/bridge/gift/GiftEmbed;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->referralTrialOffer:Lcom/discord/chat/bridge/gift/GiftEmbed;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_46

    return v2

    :cond_46
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->totalMonthsSubscribed:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->totalMonthsSubscribed:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_47

    return v2

    :cond_47
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->swipeToReplyIconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/Message;->swipeToReplyIconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_48

    return v2

    :cond_48
    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->postPreviewEmbeds:Ljava/util/List;

    iget-object p1, p1, Lcom/discord/chat/bridge/Message;->postPreviewEmbeds:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_49

    return v2

    :cond_49
    return v0
.end method

.method public final getActivityInviteEmbed()Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->activityInviteEmbed:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    return-object v0
.end method

.method public final getAnimateEmoji()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->animateEmoji:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getAttachments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/attachment/Attachment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->attachments:Ljava/util/List;

    return-object v0
.end method

.method public final getAttachmentsOpacity()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->attachmentsOpacity:Ljava/lang/Float;

    return-object v0
.end method

.method public final getAuthorId-wUX8bhU()Lcom/discord/primitives/UserId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->authorId:Lcom/discord/primitives/UserId;

    return-object v0
.end method

.method public final getAutoModerationContext()Lcom/discord/chat/bridge/automod/AutoModerationContext;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->autoModerationContext:Lcom/discord/chat/bridge/automod/AutoModerationContext;

    return-object v0
.end method

.method public final getAvatarDecorationURL()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->avatarDecorationURL:Ljava/lang/String;

    return-object v0
.end method

.method public final getAvatarURL$chat_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->avatarURL:Ljava/lang/String;

    return-object v0
.end method

.method public final getAvatarURLs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->avatarURLs:Ljava/util/List;

    return-object v0
.end method

.method public final getButtonLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->buttonLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelId-o4g7jtM()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/bridge/Message;->channelId:J

    return-wide v0
.end method

.method public final getCodedLinks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->codedLinks:Ljava/util/List;

    return-object v0
.end method

.method public final getColorString()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->colorString:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCommunicationDisabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->communicationDisabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getComponents()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/botuikit/Component;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->components:Ljava/util/List;

    return-object v0
.end method

.method public final getConnectionsRoleTag()Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->connectionsRoleTag:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    return-object v0
.end method

.method public final getConstrainedWidth()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->constrainedWidth$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final getContent()Lcom/discord/chat/bridge/structurabletext/StructurableText;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getEdited()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->edited:Ljava/lang/String;

    return-object v0
.end method

.method public final getEmbeds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/embed/Embed;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->embeds:Ljava/util/List;

    return-object v0
.end method

.method public final getEphemeralIndication()Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->ephemeralIndication:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;

    return-object v0
.end method

.method public final getExecutedCommand()Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->executedCommand:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    return-object v0
.end method

.method public final getFlags()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/bridge/Message;->flags:J

    return-wide v0
.end method

.method public final getGifAutoPlay()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->gifAutoPlay:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getGiftCodes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/gift/GiftEmbed;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->giftCodes:Ljava/util/List;

    return-object v0
.end method

.method public final getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->guildId:Lcom/discord/primitives/GuildId;

    return-object v0
.end method

.method public final getId-3Eiw7ao()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInteractionStatus()Lcom/discord/chat/bridge/interaction/InteractionStatus;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->interactionStatus:Lcom/discord/chat/bridge/interaction/InteractionStatus;

    return-object v0
.end method

.method public final getMentioned()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/Message;->mentioned:Z

    return v0
.end method

.method public final getMissed()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->missed:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getNonce-N_6c4I0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->nonce:Ljava/lang/String;

    return-object v0
.end method

.method public final getOpTagText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->opTagText:Ljava/lang/String;

    return-object v0
.end method

.method public final getPostActions()Lcom/discord/chat/bridge/forums/ForumPostActions;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->postActions:Lcom/discord/chat/bridge/forums/ForumPostActions;

    return-object v0
.end method

.method public final getPostPreviewEmbeds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->postPreviewEmbeds:Ljava/util/List;

    return-object v0
.end method

.method public final getProgress()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/UploadProgress;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->progress:Ljava/util/List;

    return-object v0
.end method

.method public final getRawMilliseconds()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->rawMilliseconds:Ljava/lang/Long;

    return-object v0
.end method

.method public final getReactions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/reaction/MessageReaction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->reactions:Ljava/util/List;

    return-object v0
.end method

.method public final getReferencedMessage()Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->referencedMessage:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    return-object v0
.end method

.method public final getReferralTrialOffer()Lcom/discord/chat/bridge/gift/GiftEmbed;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->referralTrialOffer:Lcom/discord/chat/bridge/gift/GiftEmbed;

    return-object v0
.end method

.method public final getRoleColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->roleColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getRoleIcon()Lcom/discord/chat/bridge/roleicons/RoleIcon;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->roleIcon:Lcom/discord/chat/bridge/roleicons/RoleIcon;

    return-object v0
.end method

.method public final getShouldShowRoleDot()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/Message;->shouldShowRoleDot:Z

    return v0
.end method

.method public final getShouldShowRoleOnName()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/Message;->shouldShowRoleOnName:Z

    return v0
.end method

.method public final getShowInviteToSpeakButton()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->showInviteToSpeakButton:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getState()Lcom/discord/chat/bridge/MessageState;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->state:Lcom/discord/chat/bridge/MessageState;

    return-object v0
.end method

.method public final getSticker()Lcom/discord/chat/bridge/sticker/Sticker;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    return-object v0
.end method

.method public final getStickerLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->stickerLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getStickers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/sticker/Sticker;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->stickers:Ljava/util/List;

    return-object v0
.end method

.method public final getSurveyIndication()Lcom/discord/chat/bridge/feedback/SurveyIndication;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->surveyIndication:Lcom/discord/chat/bridge/feedback/SurveyIndication;

    return-object v0
.end method

.method public final getSwipeToReplyIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->swipeToReplyIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getTagBackgroundColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->tagBackgroundColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTagText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->tagText:Ljava/lang/String;

    return-object v0
.end method

.method public final getTagVerified()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->tagVerified:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getThreadEmbed()Lcom/discord/chat/bridge/threads/ThreadEmbed;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->threadEmbed:Lcom/discord/chat/bridge/threads/ThreadEmbed;

    return-object v0
.end method

.method public final getThreadStarterMessageHeader()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->threadStarterMessageHeader:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimestamp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->timestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTotalMonthsSubscribed()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->totalMonthsSubscribed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getType()Lcom/discord/chat/bridge/MessageType;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->type:Lcom/discord/chat/bridge/MessageType;

    return-object v0
.end method

.method public final getUseAddBurstReaction()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->useAddBurstReaction:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getUseAttachmentGridLayout()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->useAttachmentGridLayout:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getUseAttachmentUploadPreview()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->useAttachmentUploadPreview:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getUseSortedReactions()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->useSortedReactions:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->username:Ljava/lang/String;

    return-object v0
.end method

.method public final getUsernameColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->usernameColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final get_constrainedWidth()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->_constrainedWidth:Ljava/lang/Float;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->type:Lcom/discord/chat/bridge/MessageType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->id:Ljava/lang/String;

    invoke-static {v1}, Lcom/discord/primitives/MessageId;->hashCode-impl(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->nonce:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lcom/discord/primitives/MessageId;->hashCode-impl(Ljava/lang/String;)I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lcom/discord/chat/bridge/Message;->channelId:J

    invoke-static {v3, v4}, Lcom/discord/primitives/ChannelId;->hashCode-impl(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->guildId:Lcom/discord/primitives/GuildId;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/discord/primitives/GuildId;->unbox-impl()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/discord/primitives/GuildId;->hashCode-impl(J)I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->state:Lcom/discord/chat/bridge/MessageState;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->authorId:Lcom/discord/primitives/UserId;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/discord/primitives/UserId;->unbox-impl()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/discord/primitives/UserId;->hashCode-impl(J)I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lcom/discord/chat/bridge/Message;->flags:J

    invoke-static {v3, v4}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->edited:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->_constrainedWidth:Ljava/lang/Float;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->timestamp:Ljava/lang/String;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->username:Ljava/lang/String;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->usernameColor:Ljava/lang/Integer;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->roleColor:Ljava/lang/Integer;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/bridge/Message;->shouldShowRoleDot:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_a

    move v1, v3

    :cond_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/bridge/Message;->shouldShowRoleOnName:Z

    if-eqz v1, :cond_b

    move v1, v3

    :cond_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->colorString:Ljava/lang/Integer;

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_a

    :cond_c
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->avatarURL:Ljava/lang/String;

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_b

    :cond_d
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->avatarDecorationURL:Ljava/lang/String;

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_c

    :cond_e
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->embeds:Ljava/util/List;

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_d

    :cond_f
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->attachments:Ljava/util/List;

    if-nez v1, :cond_10

    move v1, v2

    goto :goto_e

    :cond_10
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->attachmentsOpacity:Ljava/lang/Float;

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_f

    :cond_11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    if-nez v1, :cond_12

    move v1, v2

    goto :goto_10

    :cond_12
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->progress:Ljava/util/List;

    if-nez v1, :cond_13

    move v1, v2

    goto :goto_11

    :cond_13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_11
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->reactions:Ljava/util/List;

    if-nez v1, :cond_14

    move v1, v2

    goto :goto_12

    :cond_14
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_12
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->useSortedReactions:Ljava/lang/Boolean;

    if-nez v1, :cond_15

    move v1, v2

    goto :goto_13

    :cond_15
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->useAddBurstReaction:Ljava/lang/Boolean;

    if-nez v1, :cond_16

    move v1, v2

    goto :goto_14

    :cond_16
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_14
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->codedLinks:Ljava/util/List;

    if-nez v1, :cond_17

    move v1, v2

    goto :goto_15

    :cond_17
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->stickers:Ljava/util/List;

    if-nez v1, :cond_18

    move v1, v2

    goto :goto_16

    :cond_18
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_16
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->roleIcon:Lcom/discord/chat/bridge/roleicons/RoleIcon;

    if-nez v1, :cond_19

    move v1, v2

    goto :goto_17

    :cond_19
    invoke-virtual {v1}, Lcom/discord/chat/bridge/roleicons/RoleIcon;->hashCode()I

    move-result v1

    :goto_17
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->connectionsRoleTag:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    if-nez v1, :cond_1a

    move v1, v2

    goto :goto_18

    :cond_1a
    invoke-virtual {v1}, Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;->hashCode()I

    move-result v1

    :goto_18
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->threadEmbed:Lcom/discord/chat/bridge/threads/ThreadEmbed;

    if-nez v1, :cond_1b

    move v1, v2

    goto :goto_19

    :cond_1b
    invoke-virtual {v1}, Lcom/discord/chat/bridge/threads/ThreadEmbed;->hashCode()I

    move-result v1

    :goto_19
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/bridge/Message;->mentioned:Z

    if-eqz v1, :cond_1c

    move v1, v3

    :cond_1c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->gifAutoPlay:Ljava/lang/Boolean;

    if-nez v1, :cond_1d

    move v1, v2

    goto :goto_1a

    :cond_1d
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->animateEmoji:Ljava/lang/Boolean;

    if-nez v1, :cond_1e

    move v1, v2

    goto :goto_1b

    :cond_1e
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->referencedMessage:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    if-nez v1, :cond_1f

    move v1, v2

    goto :goto_1c

    :cond_1f
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->executedCommand:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    if-nez v1, :cond_20

    move v1, v2

    goto :goto_1d

    :cond_20
    invoke-virtual {v1}, Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;->hashCode()I

    move-result v1

    :goto_1d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->components:Ljava/util/List;

    if-nez v1, :cond_21

    move v1, v2

    goto :goto_1e

    :cond_21
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->threadStarterMessageHeader:Ljava/lang/String;

    if-nez v1, :cond_22

    move v1, v2

    goto :goto_1f

    :cond_22
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->communicationDisabled:Ljava/lang/Boolean;

    if-nez v1, :cond_23

    move v1, v2

    goto :goto_20

    :cond_23
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_20
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->tagText:Ljava/lang/String;

    if-nez v1, :cond_24

    move v1, v2

    goto :goto_21

    :cond_24
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_21
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->tagVerified:Ljava/lang/Boolean;

    if-nez v1, :cond_25

    move v1, v2

    goto :goto_22

    :cond_25
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_22
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->tagBackgroundColor:Ljava/lang/Integer;

    if-nez v1, :cond_26

    move v1, v2

    goto :goto_23

    :cond_26
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_23
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->opTagText:Ljava/lang/String;

    if-nez v1, :cond_27

    move v1, v2

    goto :goto_24

    :cond_27
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_24
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->ephemeralIndication:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;

    if-nez v1, :cond_28

    move v1, v2

    goto :goto_25

    :cond_28
    invoke-virtual {v1}, Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;->hashCode()I

    move-result v1

    :goto_25
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->surveyIndication:Lcom/discord/chat/bridge/feedback/SurveyIndication;

    if-nez v1, :cond_29

    move v1, v2

    goto :goto_26

    :cond_29
    invoke-virtual {v1}, Lcom/discord/chat/bridge/feedback/SurveyIndication;->hashCode()I

    move-result v1

    :goto_26
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->interactionStatus:Lcom/discord/chat/bridge/interaction/InteractionStatus;

    if-nez v1, :cond_2a

    move v1, v2

    goto :goto_27

    :cond_2a
    invoke-virtual {v1}, Lcom/discord/chat/bridge/interaction/InteractionStatus;->hashCode()I

    move-result v1

    :goto_27
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->useAttachmentGridLayout:Ljava/lang/Boolean;

    if-nez v1, :cond_2b

    move v1, v2

    goto :goto_28

    :cond_2b
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_28
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->useAttachmentUploadPreview:Ljava/lang/Boolean;

    if-nez v1, :cond_2c

    move v1, v2

    goto :goto_29

    :cond_2c
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_29
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->isCurrentUserMessageAuthor:Ljava/lang/Boolean;

    if-nez v1, :cond_2d

    move v1, v2

    goto :goto_2a

    :cond_2d
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->title:Ljava/lang/String;

    if-nez v1, :cond_2e

    move v1, v2

    goto :goto_2b

    :cond_2e
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->description:Ljava/lang/String;

    if-nez v1, :cond_2f

    move v1, v2

    goto :goto_2c

    :cond_2f
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->avatarURLs:Ljava/util/List;

    if-nez v1, :cond_30

    move v1, v2

    goto :goto_2d

    :cond_30
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->isCallActive:Ljava/lang/Boolean;

    if-nez v1, :cond_31

    move v1, v2

    goto :goto_2e

    :cond_31
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->missed:Ljava/lang/Boolean;

    if-nez v1, :cond_32

    move v1, v2

    goto :goto_2f

    :cond_32
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->rawMilliseconds:Ljava/lang/Long;

    if-nez v1, :cond_33

    move v1, v2

    goto :goto_30

    :cond_33
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_30
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    if-nez v1, :cond_34

    move v1, v2

    goto :goto_31

    :cond_34
    invoke-virtual {v1}, Lcom/discord/chat/bridge/sticker/Sticker;->hashCode()I

    move-result v1

    :goto_31
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->stickerLabel:Ljava/lang/String;

    if-nez v1, :cond_35

    move v1, v2

    goto :goto_32

    :cond_35
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_32
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->buttonLabel:Ljava/lang/String;

    if-nez v1, :cond_36

    move v1, v2

    goto :goto_33

    :cond_36
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_33
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->showInviteToSpeakButton:Ljava/lang/Boolean;

    if-nez v1, :cond_37

    move v1, v2

    goto :goto_34

    :cond_37
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_34
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->activityInviteEmbed:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    if-nez v1, :cond_38

    move v1, v2

    goto :goto_35

    :cond_38
    invoke-virtual {v1}, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->hashCode()I

    move-result v1

    :goto_35
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/bridge/Message;->isFirstForumPostMessage:Z

    if-eqz v1, :cond_39

    goto :goto_36

    :cond_39
    move v3, v1

    :goto_36
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->postActions:Lcom/discord/chat/bridge/forums/ForumPostActions;

    if-nez v1, :cond_3a

    move v1, v2

    goto :goto_37

    :cond_3a
    invoke-virtual {v1}, Lcom/discord/chat/bridge/forums/ForumPostActions;->hashCode()I

    move-result v1

    :goto_37
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->autoModerationContext:Lcom/discord/chat/bridge/automod/AutoModerationContext;

    if-nez v1, :cond_3b

    move v1, v2

    goto :goto_38

    :cond_3b
    invoke-virtual {v1}, Lcom/discord/chat/bridge/automod/AutoModerationContext;->hashCode()I

    move-result v1

    :goto_38
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->giftCodes:Ljava/util/List;

    if-nez v1, :cond_3c

    move v1, v2

    goto :goto_39

    :cond_3c
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_39
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->referralTrialOffer:Lcom/discord/chat/bridge/gift/GiftEmbed;

    if-nez v1, :cond_3d

    move v1, v2

    goto :goto_3a

    :cond_3d
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->totalMonthsSubscribed:Ljava/lang/Integer;

    if-nez v1, :cond_3e

    move v1, v2

    goto :goto_3b

    :cond_3e
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->swipeToReplyIconUrl:Ljava/lang/String;

    if-nez v1, :cond_3f

    move v1, v2

    goto :goto_3c

    :cond_3f
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/Message;->postPreviewEmbeds:Ljava/util/List;

    if-nez v1, :cond_40

    goto :goto_3d

    :cond_40
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3d
    add-int/2addr v0, v2

    return v0
.end method

.method public final isCallActive()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->isCallActive:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final isCurrentUserMessageAuthor()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/Message;->isCurrentUserMessageAuthor:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final isFirstForumPostMessage()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/Message;->isFirstForumPostMessage:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 72

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/discord/chat/bridge/Message;->type:Lcom/discord/chat/bridge/MessageType;

    iget-object v2, v0, Lcom/discord/chat/bridge/Message;->id:Ljava/lang/String;

    invoke-static {v2}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lcom/discord/chat/bridge/Message;->nonce:Ljava/lang/String;

    if-nez v3, :cond_0

    const-string v3, "null"

    goto :goto_0

    :cond_0
    invoke-static {v3}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_0
    iget-wide v4, v0, Lcom/discord/chat/bridge/Message;->channelId:J

    invoke-static {v4, v5}, Lcom/discord/primitives/ChannelId;->toString-impl(J)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/discord/chat/bridge/Message;->guildId:Lcom/discord/primitives/GuildId;

    iget-object v6, v0, Lcom/discord/chat/bridge/Message;->state:Lcom/discord/chat/bridge/MessageState;

    iget-object v7, v0, Lcom/discord/chat/bridge/Message;->authorId:Lcom/discord/primitives/UserId;

    iget-wide v8, v0, Lcom/discord/chat/bridge/Message;->flags:J

    iget-object v10, v0, Lcom/discord/chat/bridge/Message;->edited:Ljava/lang/String;

    iget-object v11, v0, Lcom/discord/chat/bridge/Message;->_constrainedWidth:Ljava/lang/Float;

    iget-object v12, v0, Lcom/discord/chat/bridge/Message;->timestamp:Ljava/lang/String;

    iget-object v13, v0, Lcom/discord/chat/bridge/Message;->username:Ljava/lang/String;

    iget-object v14, v0, Lcom/discord/chat/bridge/Message;->usernameColor:Ljava/lang/Integer;

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->roleColor:Ljava/lang/Integer;

    move-object/from16 v16, v15

    iget-boolean v15, v0, Lcom/discord/chat/bridge/Message;->shouldShowRoleDot:Z

    move/from16 v17, v15

    iget-boolean v15, v0, Lcom/discord/chat/bridge/Message;->shouldShowRoleOnName:Z

    move/from16 v18, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->colorString:Ljava/lang/Integer;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->avatarURL:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->avatarDecorationURL:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->embeds:Ljava/util/List;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->attachments:Ljava/util/List;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->attachmentsOpacity:Ljava/lang/Float;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    move-object/from16 v25, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->progress:Ljava/util/List;

    move-object/from16 v26, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->reactions:Ljava/util/List;

    move-object/from16 v27, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->useSortedReactions:Ljava/lang/Boolean;

    move-object/from16 v28, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->useAddBurstReaction:Ljava/lang/Boolean;

    move-object/from16 v29, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->codedLinks:Ljava/util/List;

    move-object/from16 v30, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->stickers:Ljava/util/List;

    move-object/from16 v31, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->roleIcon:Lcom/discord/chat/bridge/roleicons/RoleIcon;

    move-object/from16 v32, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->connectionsRoleTag:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    move-object/from16 v33, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->threadEmbed:Lcom/discord/chat/bridge/threads/ThreadEmbed;

    move-object/from16 v34, v15

    iget-boolean v15, v0, Lcom/discord/chat/bridge/Message;->mentioned:Z

    move/from16 v35, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->gifAutoPlay:Ljava/lang/Boolean;

    move-object/from16 v36, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->animateEmoji:Ljava/lang/Boolean;

    move-object/from16 v37, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->referencedMessage:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    move-object/from16 v38, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->executedCommand:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    move-object/from16 v39, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->components:Ljava/util/List;

    move-object/from16 v40, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->threadStarterMessageHeader:Ljava/lang/String;

    move-object/from16 v41, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->communicationDisabled:Ljava/lang/Boolean;

    move-object/from16 v42, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->tagText:Ljava/lang/String;

    move-object/from16 v43, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->tagVerified:Ljava/lang/Boolean;

    move-object/from16 v44, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->tagBackgroundColor:Ljava/lang/Integer;

    move-object/from16 v45, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->opTagText:Ljava/lang/String;

    move-object/from16 v46, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->ephemeralIndication:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;

    move-object/from16 v47, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->surveyIndication:Lcom/discord/chat/bridge/feedback/SurveyIndication;

    move-object/from16 v48, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->interactionStatus:Lcom/discord/chat/bridge/interaction/InteractionStatus;

    move-object/from16 v49, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->useAttachmentGridLayout:Ljava/lang/Boolean;

    move-object/from16 v50, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->useAttachmentUploadPreview:Ljava/lang/Boolean;

    move-object/from16 v51, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->isCurrentUserMessageAuthor:Ljava/lang/Boolean;

    move-object/from16 v52, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->title:Ljava/lang/String;

    move-object/from16 v53, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->description:Ljava/lang/String;

    move-object/from16 v54, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->avatarURLs:Ljava/util/List;

    move-object/from16 v55, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->isCallActive:Ljava/lang/Boolean;

    move-object/from16 v56, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->missed:Ljava/lang/Boolean;

    move-object/from16 v57, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->rawMilliseconds:Ljava/lang/Long;

    move-object/from16 v58, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    move-object/from16 v59, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->stickerLabel:Ljava/lang/String;

    move-object/from16 v60, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->buttonLabel:Ljava/lang/String;

    move-object/from16 v61, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->showInviteToSpeakButton:Ljava/lang/Boolean;

    move-object/from16 v62, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->activityInviteEmbed:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    move-object/from16 v63, v15

    iget-boolean v15, v0, Lcom/discord/chat/bridge/Message;->isFirstForumPostMessage:Z

    move/from16 v64, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->postActions:Lcom/discord/chat/bridge/forums/ForumPostActions;

    move-object/from16 v65, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->autoModerationContext:Lcom/discord/chat/bridge/automod/AutoModerationContext;

    move-object/from16 v66, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->giftCodes:Ljava/util/List;

    move-object/from16 v67, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->referralTrialOffer:Lcom/discord/chat/bridge/gift/GiftEmbed;

    move-object/from16 v68, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->totalMonthsSubscribed:Ljava/lang/Integer;

    move-object/from16 v69, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->swipeToReplyIconUrl:Ljava/lang/String;

    move-object/from16 v70, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/Message;->postPreviewEmbeds:Ljava/util/List;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v71, v15

    const-string v15, "Message(type="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", nonce="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", channelId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", guildId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", authorId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", flags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", edited="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", _constrainedWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", username="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", usernameColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", roleColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldShowRoleDot="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", shouldShowRoleOnName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", colorString="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", avatarURL="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", avatarDecorationURL="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", embeds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", attachments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", attachmentsOpacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", content="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", progress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", reactions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", useSortedReactions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", useAddBurstReaction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", codedLinks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stickers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", roleIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", connectionsRoleTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", threadEmbed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mentioned="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", gifAutoPlay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", animateEmoji="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", referencedMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v38

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", executedCommand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", components="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", threadStarterMessageHeader="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v41

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", communicationDisabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v42

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tagText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v43

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tagVerified="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v44

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tagBackgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", opTagText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ephemeralIndication="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v47

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", surveyIndication="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v48

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", interactionStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v49

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", useAttachmentGridLayout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v50

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", useAttachmentUploadPreview="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v51

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isCurrentUserMessageAuthor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v52

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v53

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v54

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", avatarURLs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v55

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isCallActive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v56

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", missed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v57

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rawMilliseconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v58

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sticker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v59

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stickerLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v60

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", buttonLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v61

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", showInviteToSpeakButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v62

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activityInviteEmbed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v63

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isFirstForumPostMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v64

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", postActions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v65

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", autoModerationContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v66

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", giftCodes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v67

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", referralTrialOffer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v68

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", totalMonthsSubscribed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v69

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", swipeToReplyIconUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v70

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", postPreviewEmbeds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v71

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
