.class public final Lcom/discord/notifications/api/NotificationData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/notifications/api/NotificationData$$serializer;,
        Lcom/discord/notifications/api/NotificationData$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000}\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0003\u0008\u009d\u0001\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 \u00df\u00012\u00020\u0001:\u0004\u00de\u0001\u00df\u0001B\u009e\u0004\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0001\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0008\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0018\u0012\n\u0008\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\u0008\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0001\u0010 \u001a\u0004\u0018\u00010!\u0012\n\u0008\u0001\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0001\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010&\u001a\u0004\u0018\u00010\'\u0012\n\u0008\u0001\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010*\u001a\u0004\u0018\u00010+\u0012\n\u0008\u0001\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0001\u0010.\u001a\u00020/\u0012\u0008\u0008\u0001\u00100\u001a\u00020/\u0012\n\u0008\u0001\u00101\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u00102\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u00103\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u00104\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u00105\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u00106\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u00107\u001a\u0004\u0018\u00010/\u0012\n\u0008\u0001\u00108\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u00109\u001a\u0004\u0018\u00010:\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;B\u00fc\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0008\u0002\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0018\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\'\u0012\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010.\u001a\u00020/\u0012\u0008\u0008\u0002\u00100\u001a\u00020/\u0012\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u00105\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u00106\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u00107\u001a\u0004\u0018\u00010/\u0012\n\u0008\u0002\u00108\u001a\u0004\u0018\u00010\u0006\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<J\n\u0010\u00a0\u0001\u001a\u00020\u0006H\u00c6\u0003J\u001b\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0003\u0008\u00a2\u0001J\u000c\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000c\u0010\u00a4\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u001b\u0010\u00a5\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0003\u0008\u00a6\u0001J\u000c\u0010\u00a7\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0013\u0010\u00a8\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0018H\u00c6\u0003\u00f8\u0001\u0000J\u001b\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0003\u0008\u00aa\u0001J\u000c\u0010\u00ab\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u00ac\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010FJ\u000c\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u001d\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0005\u0008\u00af\u0001\u0010CJ\u000c\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u00b1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010FJ\u001b\u0010\u00b2\u0001\u001a\u0004\u0018\u00010!H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0003\u0008\u00b3\u0001J\u000c\u0010\u00b4\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000c\u0010\u00b5\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010FJ\u000c\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u001b\u0010\u00b8\u0001\u001a\u0004\u0018\u00010\'H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0003\u0008\u00b9\u0001J\u000c\u0010\u00ba\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000c\u0010\u00bb\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u00bc\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010FJ\u000c\u0010\u00bd\u0001\u001a\u0004\u0018\u00010+H\u00c6\u0003J\u000c\u0010\u00be\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010FJ\n\u0010\u00c0\u0001\u001a\u00020/H\u00c6\u0003J\n\u0010\u00c1\u0001\u001a\u00020/H\u00c6\u0003J\u000c\u0010\u00c2\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000c\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000c\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000c\u0010\u00c5\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000c\u0010\u00c6\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000c\u0010\u00c7\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000c\u0010\u00c8\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u00c9\u0001\u001a\u0004\u0018\u00010/H\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\u000c\u0010\u00ca\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010FJ\u000c\u0010\u00cc\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u00cd\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010|J\u0011\u0010\u00ce\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010FJ\u000c\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u008f\u0004\u0010\u00d0\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u000e\u0008\u0002\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00182\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\'2\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010.\u001a\u00020/2\u0008\u0008\u0002\u00100\u001a\u00020/2\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u00105\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u00106\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u00107\u001a\u0004\u0018\u00010/2\n\u0008\u0002\u00108\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00d1\u0001\u0010\u00d2\u0001J\u0015\u0010\u00d3\u0001\u001a\u00020/2\t\u0010\u00d4\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00d5\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u00d6\u0001\u001a\u00020\u0006H\u00d6\u0001J(\u0010\u00d7\u0001\u001a\u00030\u00d8\u00012\u0007\u0010\u00d9\u0001\u001a\u00020\u00002\u0008\u0010\u00da\u0001\u001a\u00030\u00db\u00012\u0008\u0010\u00dc\u0001\u001a\u00030\u00dd\u0001H\u00c7\u0001R%\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00188\u0006X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010@R\u001e\u0010%\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008A\u0010>\u001a\u0004\u0008B\u0010CR \u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010G\u0012\u0004\u0008D\u0010>\u001a\u0004\u0008E\u0010FR\u001e\u0010)\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008H\u0010>\u001a\u0004\u0008I\u0010CR\'\u0010&\u001a\u0004\u0018\u00010\'8\u0006X\u0087\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008J\u0010>\u001a\u0004\u0008K\u0010LR\u001e\u0010(\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008M\u0010>\u001a\u0004\u0008N\u0010CR\u001c\u0010.\u001a\u00020/8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008O\u0010>\u001a\u0004\u0008P\u0010QR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008R\u0010>\u001a\u0004\u0008S\u0010CR\'\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008T\u0010>\u001a\u0004\u0008U\u0010VR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008W\u0010>\u001a\u0004\u0008X\u0010CR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008Y\u0010>\u001a\u0004\u0008Z\u0010CR \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010G\u0012\u0004\u0008[\u0010>\u001a\u0004\u0008\\\u0010FR\u001e\u00106\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008]\u0010>\u001a\u0004\u0008^\u0010CR \u00107\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010b\u0012\u0004\u0008_\u0010>\u001a\u0004\u0008`\u0010aR\u001e\u0010#\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008c\u0010>\u001a\u0004\u0008d\u0010CR\'\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008e\u0010>\u001a\u0004\u0008f\u0010gR\u001e\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008h\u0010>\u001a\u0004\u0008i\u0010CR \u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010G\u0012\u0004\u0008j\u0010>\u001a\u0004\u0008k\u0010FR\u001e\u00103\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008l\u0010>\u001a\u0004\u0008m\u0010CR\u001e\u00108\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008n\u0010>\u001a\u0004\u0008o\u0010CR\u001c\u00100\u001a\u00020/8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008p\u0010>\u001a\u0004\u00080\u0010QR\u001e\u0010*\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008q\u0010>\u001a\u0004\u0008r\u0010sR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010G\u0012\u0004\u0008t\u0010>\u001a\u0004\u0008u\u0010FR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008v\u0010>\u001a\u0004\u0008w\u0010CR\u001e\u0010\u000c\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008x\u0010>\u001a\u0004\u0008y\u0010CR \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010}\u0012\u0004\u0008z\u0010>\u001a\u0004\u0008{\u0010|R*\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0011\n\u0003\u0010\u0080\u0001\u0012\u0004\u0008~\u0010>\u001a\u0004\u0008\u007f\u0010CR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0002\u0010G\u0012\u0005\u0008\u0081\u0001\u0010>\u001a\u0005\u0008\u0082\u0001\u0010FR \u00104\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u0083\u0001\u0010>\u001a\u0005\u0008\u0084\u0001\u0010CR)\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u0085\u0001\u0010>\u001a\u0005\u0008\u0086\u0001\u0010VR \u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u0087\u0001\u0010>\u001a\u0005\u0008\u0088\u0001\u0010CR\"\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0002\u0010G\u0012\u0005\u0008\u0089\u0001\u0010>\u001a\u0005\u0008\u008a\u0001\u0010FR \u0010,\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u008b\u0001\u0010>\u001a\u0005\u0008\u008c\u0001\u0010CR \u00102\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u008d\u0001\u0010>\u001a\u0005\u0008\u008e\u0001\u0010CR \u00101\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u008f\u0001\u0010>\u001a\u0005\u0008\u0090\u0001\u0010CR \u00105\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u0091\u0001\u0010>\u001a\u0005\u0008\u0092\u0001\u0010CR\u001e\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u0093\u0001\u0010>\u001a\u0005\u0008\u0094\u0001\u0010CR \u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u0095\u0001\u0010>\u001a\u0005\u0008\u0096\u0001\u0010CR\"\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0002\u0010G\u0012\u0005\u0008\u0097\u0001\u0010>\u001a\u0005\u0008\u0098\u0001\u0010FR \u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u0099\u0001\u0010>\u001a\u0005\u0008\u009a\u0001\u0010CR*\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0011\n\u0000\u0012\u0005\u0008\u009b\u0001\u0010>\u001a\u0006\u0008\u009c\u0001\u0010\u009d\u0001R \u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u009e\u0001\u0010>\u001a\u0005\u0008\u009f\u0001\u0010C\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u00e0\u0001"
    }
    d2 = {
        "Lcom/discord/notifications/api/NotificationData;",
        "",
        "seen1",
        "",
        "seen2",
        "type",
        "",
        "messageId",
        "Lcom/discord/primitives/MessageId;",
        "messageActivityType",
        "messageApplicationName",
        "messageType",
        "messageContent",
        "messageFlags",
        "",
        "channelType",
        "channelName",
        "channelId",
        "Lcom/discord/primitives/ChannelId;",
        "channelIcon",
        "parentName",
        "parentId",
        "channelRtcRegion",
        "ackChannelIds",
        "",
        "userId",
        "Lcom/discord/primitives/UserId;",
        "userUsername",
        "userDiscriminator",
        "userAvatar",
        "userGuildAvatar",
        "relationshipType",
        "guildId",
        "Lcom/discord/primitives/GuildId;",
        "guildName",
        "guildIcon",
        "activityType",
        "activityName",
        "applicationId",
        "Lcom/discord/primitives/ApplicationId;",
        "applicationName",
        "applicationIcon",
        "message",
        "Lcom/discord/notifications/api/NotificationMessage;",
        "stageInstanceTopic",
        "guildScheduledEventEntityType",
        "canReply",
        "",
        "isFromCurrentUser",
        "title",
        "subtitle",
        "iconUrl",
        "notificationChannel",
        "trackingType",
        "deeplink",
        "expandSubtitle",
        "imageAttachmentUrl",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getAckChannelIds$annotations",
        "()V",
        "getAckChannelIds",
        "()Ljava/util/List;",
        "getActivityName$annotations",
        "getActivityName",
        "()Ljava/lang/String;",
        "getActivityType$annotations",
        "getActivityType",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getApplicationIcon$annotations",
        "getApplicationIcon",
        "getApplicationId-UtIrSio$annotations",
        "getApplicationId-UtIrSio",
        "()Lcom/discord/primitives/ApplicationId;",
        "getApplicationName$annotations",
        "getApplicationName",
        "getCanReply$annotations",
        "getCanReply",
        "()Z",
        "getChannelIcon$annotations",
        "getChannelIcon",
        "getChannelId-qMVnFVQ$annotations",
        "getChannelId-qMVnFVQ",
        "()Lcom/discord/primitives/ChannelId;",
        "getChannelName$annotations",
        "getChannelName",
        "getChannelRtcRegion$annotations",
        "getChannelRtcRegion",
        "getChannelType$annotations",
        "getChannelType",
        "getDeeplink$annotations",
        "getDeeplink",
        "getExpandSubtitle$annotations",
        "getExpandSubtitle",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getGuildIcon$annotations",
        "getGuildIcon",
        "getGuildId-qOKuAAo$annotations",
        "getGuildId-qOKuAAo",
        "()Lcom/discord/primitives/GuildId;",
        "getGuildName$annotations",
        "getGuildName",
        "getGuildScheduledEventEntityType$annotations",
        "getGuildScheduledEventEntityType",
        "getIconUrl$annotations",
        "getIconUrl",
        "getImageAttachmentUrl$annotations",
        "getImageAttachmentUrl",
        "isFromCurrentUser$annotations",
        "getMessage$annotations",
        "getMessage",
        "()Lcom/discord/notifications/api/NotificationMessage;",
        "getMessageActivityType$annotations",
        "getMessageActivityType",
        "getMessageApplicationName$annotations",
        "getMessageApplicationName",
        "getMessageContent$annotations",
        "getMessageContent",
        "getMessageFlags$annotations",
        "getMessageFlags",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getMessageId-N_6c4I0$annotations",
        "getMessageId-N_6c4I0",
        "Ljava/lang/String;",
        "getMessageType$annotations",
        "getMessageType",
        "getNotificationChannel$annotations",
        "getNotificationChannel",
        "getParentId-qMVnFVQ$annotations",
        "getParentId-qMVnFVQ",
        "getParentName$annotations",
        "getParentName",
        "getRelationshipType$annotations",
        "getRelationshipType",
        "getStageInstanceTopic$annotations",
        "getStageInstanceTopic",
        "getSubtitle$annotations",
        "getSubtitle",
        "getTitle$annotations",
        "getTitle",
        "getTrackingType$annotations",
        "getTrackingType",
        "getType$annotations",
        "getType",
        "getUserAvatar$annotations",
        "getUserAvatar",
        "getUserDiscriminator$annotations",
        "getUserDiscriminator",
        "getUserGuildAvatar$annotations",
        "getUserGuildAvatar",
        "getUserId-wUX8bhU$annotations",
        "getUserId-wUX8bhU",
        "()Lcom/discord/primitives/UserId;",
        "getUserUsername$annotations",
        "getUserUsername",
        "component1",
        "component10",
        "component10-qMVnFVQ",
        "component11",
        "component12",
        "component13",
        "component13-qMVnFVQ",
        "component14",
        "component15",
        "component16",
        "component16-wUX8bhU",
        "component17",
        "component18",
        "component19",
        "component2",
        "component2-N_6c4I0",
        "component20",
        "component21",
        "component22",
        "component22-qOKuAAo",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "component27-UtIrSio",
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
        "component38",
        "component39",
        "component4",
        "component40",
        "component41",
        "component42",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "copy-tc0JBzY",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/discord/notifications/api/NotificationData;",
        "equals",
        "other",
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
        "notification_api_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lyi/f;
.end annotation


# static fields
.field public static final ACTIVITY_TYPE_PLAYING:I = 0x0

.field public static final ACTIVITY_TYPE_STREAMING:I = 0x1

.field public static final CHANNEL_TYPE_ANNOUNCEMENT_THREAD:I = 0xa

.field public static final CHANNEL_TYPE_CATEGORY:I = 0x4

.field public static final CHANNEL_TYPE_DIRECTORY:I = 0xe

.field public static final CHANNEL_TYPE_DM:I = 0x1

.field public static final CHANNEL_TYPE_GROUP_DM:I = 0x3

.field public static final CHANNEL_TYPE_GUILD_ANNOUNCEMENT:I = 0x5

.field public static final CHANNEL_TYPE_GUILD_STAGE_VOICE:I = 0xd

.field public static final CHANNEL_TYPE_GUILD_STORE:I = 0x6

.field public static final CHANNEL_TYPE_GUILD_TEXT:I = 0x0

.field public static final CHANNEL_TYPE_GUILD_VOICE:I = 0x2

.field public static final CHANNEL_TYPE_PRIVATE_THREAD:I = 0xc

.field public static final CHANNEL_TYPE_PUBLIC_THREAD:I = 0xb

.field public static final Companion:Lcom/discord/notifications/api/NotificationData$Companion;

.field public static final GUILD_SCHEDULED_EVENT_TYPE_EXTERNAL:I = 0x3

.field public static final GUILD_SCHEDULED_EVENT_TYPE_NONE:I = 0x0

.field public static final GUILD_SCHEDULED_EVENT_TYPE_STAGE_INSTANCE:I = 0x1

.field public static final GUILD_SCHEDULED_EVENT_TYPE_VOICE:I = 0x2

.field public static final MESSAGE_ACTIVITY_TYPE_JOIN:I = 0x1

.field public static final MESSAGE_ACTIVITY_TYPE_LISTEN:I = 0x3

.field public static final MESSAGE_ACTIVITY_TYPE_REQUEST:I = 0x5

.field public static final MESSAGE_ACTIVITY_TYPE_SPECTATE:I = 0x2

.field public static final MESSAGE_ACTIVITY_TYPE_WATCH:I = 0x4

.field public static final MESSAGE_TYPE_USER_JOIN:I = 0x7

.field public static final MSG_MUTE_MIN_COUNT:I = 0x2

.field public static final RELATIONSHIP_TYPE_FRIEND:I = 0x1

.field public static final RELATIONSHIP_TYPE_INVITE_INCOMING:I = 0x3

.field public static final TRACKING_TYPE_FRIEND_REQUEST_REMINDER:Ljava/lang/String; = "generic_friend_request_reminder"

.field public static final TRACKING_TYPE_GUILD_STREAM_START:Ljava/lang/String; = "GUILD_STREAM_START"

.field public static final TRACKING_TYPE_HOME_LIFECYCLE_PUSH:Ljava/lang/String; = "home_lifecycle_push"

.field public static final TRACKING_TYPE_MISSED_MESSAGE:Ljava/lang/String; = "generic_missed_message"

.field public static final TRACKING_TYPE_MODERATOR_FEATURED_MESSAGE:Ljava/lang/String; = "generic_home_featured_message"

.field public static final TRACKING_TYPE_NUDGE_NEW_FRIEND_DM_PUSH:Ljava/lang/String; = "nudge_new_friend_dm_push"

.field public static final TRACKING_TYPE_SUSPICIOUS_SESSION:Ljava/lang/String; = "suspicious_session"

.field public static final TRACKING_TYPE_TOP_MESSAGES_PUSH:Ljava/lang/String; = "top_messages_push"

.field public static final TYPE_ACTIVITY_START:Ljava/lang/String; = "ACTIVITY_START"

.field public static final TYPE_APPLICATION_LIBRARY_INSTALL_COMPLETE:Ljava/lang/String; = "APPLICATION_LIBRARY_INSTALL_COMPLETE"

.field public static final TYPE_CALL_CONNECT:Ljava/lang/String; = "CALL_CONNECT"

.field public static final TYPE_CALL_RING:Ljava/lang/String; = "CALL_RING"

.field public static final TYPE_CHANNEL_ACK:Ljava/lang/String; = "CHANNEL_ACK"

.field public static final TYPE_FORUM_THREAD_CREATED:Ljava/lang/String; = "FORUM_THREAD_CREATED"

.field public static final TYPE_FRIEND_SUGGESTION_CREATE:Ljava/lang/String; = "FRIEND_SUGGESTION_CREATE"

.field public static final TYPE_GENERIC_PUSH_NOTIFICATION_SENT:Ljava/lang/String; = "GENERIC_PUSH_NOTIFICATION_SENT"

.field public static final TYPE_GUILD_SCHEDULED_EVENT_UPDATE:Ljava/lang/String; = "GUILD_SCHEDULED_EVENT_UPDATE"

.field public static final TYPE_MESSAGE_CREATE:Ljava/lang/String; = "MESSAGE_CREATE"

.field public static final TYPE_RELATIONSHIP_ADD:Ljava/lang/String; = "RELATIONSHIP_ADD"

.field public static final TYPE_STAGE_INSTANCE_CREATE:Ljava/lang/String; = "STAGE_INSTANCE_CREATE"


# instance fields
.field private final ackChannelIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/primitives/ChannelId;",
            ">;"
        }
    .end annotation
.end field

.field private final activityName:Ljava/lang/String;

.field private final activityType:Ljava/lang/Integer;

.field private final applicationIcon:Ljava/lang/String;

.field private final applicationId:Lcom/discord/primitives/ApplicationId;

.field private final applicationName:Ljava/lang/String;

.field private final canReply:Z

.field private final channelIcon:Ljava/lang/String;

.field private final channelId:Lcom/discord/primitives/ChannelId;

.field private final channelName:Ljava/lang/String;

.field private final channelRtcRegion:Ljava/lang/String;

.field private final channelType:Ljava/lang/Integer;

.field private final deeplink:Ljava/lang/String;

.field private final expandSubtitle:Ljava/lang/Boolean;

.field private final guildIcon:Ljava/lang/String;

.field private final guildId:Lcom/discord/primitives/GuildId;

.field private final guildName:Ljava/lang/String;

.field private final guildScheduledEventEntityType:Ljava/lang/Integer;

.field private final iconUrl:Ljava/lang/String;

.field private final imageAttachmentUrl:Ljava/lang/String;

.field private final isFromCurrentUser:Z

.field private final message:Lcom/discord/notifications/api/NotificationMessage;

.field private final messageActivityType:Ljava/lang/Integer;

.field private final messageApplicationName:Ljava/lang/String;

.field private final messageContent:Ljava/lang/String;

.field private final messageFlags:Ljava/lang/Long;

.field private final messageId:Ljava/lang/String;

.field private final messageType:Ljava/lang/Integer;

.field private final notificationChannel:Ljava/lang/String;

.field private final parentId:Lcom/discord/primitives/ChannelId;

.field private final parentName:Ljava/lang/String;

.field private final relationshipType:Ljava/lang/Integer;

.field private final stageInstanceTopic:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final trackingType:Ljava/lang/String;

.field private final type:Ljava/lang/String;

.field private final userAvatar:Ljava/lang/String;

.field private final userDiscriminator:Ljava/lang/Integer;

.field private final userGuildAvatar:Ljava/lang/String;

.field private final userId:Lcom/discord/primitives/UserId;

.field private final userUsername:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/notifications/api/NotificationData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/notifications/api/NotificationData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/notifications/api/NotificationData;->Companion:Lcom/discord/notifications/api/NotificationData$Companion;

    return-void
.end method

.method private constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lcom/discord/primitives/ChannelId;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/primitives/ChannelId;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/discord/primitives/ChannelId;",
            ">;",
            "Lcom/discord/primitives/UserId;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Lcom/discord/primitives/GuildId;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lcom/discord/primitives/ApplicationId;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/notifications/api/NotificationMessage;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move v1, p1

    move v2, p2

    and-int/lit8 v3, v1, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v5, v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    and-int/lit8 v6, v2, 0x0

    if-eqz v6, :cond_1

    move v6, v5

    goto :goto_1

    :cond_1
    move v6, v4

    :goto_1
    or-int/2addr v3, v6

    if-eqz v3, :cond_2

    const/4 v3, 0x2

    new-array v6, v3, [I

    aput v1, v6, v4

    aput v2, v6, v5

    new-array v3, v3, [I

    .line 1
    fill-array-data v3, :array_0

    sget-object v5, Lcom/discord/notifications/api/NotificationData$$serializer;->INSTANCE:Lcom/discord/notifications/api/NotificationData$$serializer;

    invoke-virtual {v5}, Lcom/discord/notifications/api/NotificationData$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v5

    invoke-static {v6, v3, v5}, Lbj/n1;->a([I[ILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v3, p3

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->type:Ljava/lang/String;

    and-int/lit8 v3, v1, 0x2

    const/4 v5, 0x0

    if-nez v3, :cond_3

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->messageId:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object v3, p4

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->messageId:Ljava/lang/String;

    :goto_2
    and-int/lit8 v3, v1, 0x4

    if-nez v3, :cond_4

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->messageActivityType:Ljava/lang/Integer;

    goto :goto_3

    :cond_4
    move-object v3, p5

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->messageActivityType:Ljava/lang/Integer;

    :goto_3
    and-int/lit8 v3, v1, 0x8

    if-nez v3, :cond_5

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->messageApplicationName:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object v3, p6

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->messageApplicationName:Ljava/lang/String;

    :goto_4
    and-int/lit8 v3, v1, 0x10

    if-nez v3, :cond_6

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->messageType:Ljava/lang/Integer;

    goto :goto_5

    :cond_6
    move-object v3, p7

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->messageType:Ljava/lang/Integer;

    :goto_5
    and-int/lit8 v3, v1, 0x20

    if-nez v3, :cond_7

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->messageContent:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object v3, p8

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->messageContent:Ljava/lang/String;

    :goto_6
    and-int/lit8 v3, v1, 0x40

    if-nez v3, :cond_8

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->messageFlags:Ljava/lang/Long;

    goto :goto_7

    :cond_8
    move-object/from16 v3, p9

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->messageFlags:Ljava/lang/Long;

    :goto_7
    and-int/lit16 v3, v1, 0x80

    if-nez v3, :cond_9

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->channelType:Ljava/lang/Integer;

    goto :goto_8

    :cond_9
    move-object/from16 v3, p10

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->channelType:Ljava/lang/Integer;

    :goto_8
    and-int/lit16 v3, v1, 0x100

    if-nez v3, :cond_a

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->channelName:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v3, p11

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->channelName:Ljava/lang/String;

    :goto_9
    and-int/lit16 v3, v1, 0x200

    if-nez v3, :cond_b

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->channelId:Lcom/discord/primitives/ChannelId;

    goto :goto_a

    :cond_b
    move-object/from16 v3, p12

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->channelId:Lcom/discord/primitives/ChannelId;

    :goto_a
    and-int/lit16 v3, v1, 0x400

    if-nez v3, :cond_c

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->channelIcon:Ljava/lang/String;

    goto :goto_b

    :cond_c
    move-object/from16 v3, p13

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->channelIcon:Ljava/lang/String;

    :goto_b
    and-int/lit16 v3, v1, 0x800

    if-nez v3, :cond_d

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->parentName:Ljava/lang/String;

    goto :goto_c

    :cond_d
    move-object/from16 v3, p14

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->parentName:Ljava/lang/String;

    :goto_c
    and-int/lit16 v3, v1, 0x1000

    if-nez v3, :cond_e

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->parentId:Lcom/discord/primitives/ChannelId;

    goto :goto_d

    :cond_e
    move-object/from16 v3, p15

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->parentId:Lcom/discord/primitives/ChannelId;

    :goto_d
    and-int/lit16 v3, v1, 0x2000

    if-nez v3, :cond_f

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->channelRtcRegion:Ljava/lang/String;

    goto :goto_e

    :cond_f
    move-object/from16 v3, p16

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->channelRtcRegion:Ljava/lang/String;

    :goto_e
    and-int/lit16 v3, v1, 0x4000

    if-nez v3, :cond_10

    .line 2
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v3

    goto :goto_f

    :cond_10
    move-object/from16 v3, p17

    .line 3
    :goto_f
    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->ackChannelIds:Ljava/util/List;

    const v3, 0x8000

    and-int/2addr v3, v1

    if-nez v3, :cond_11

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->userId:Lcom/discord/primitives/UserId;

    goto :goto_10

    :cond_11
    move-object/from16 v3, p18

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->userId:Lcom/discord/primitives/UserId;

    :goto_10
    const/high16 v3, 0x10000

    and-int/2addr v3, v1

    if-nez v3, :cond_12

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->userUsername:Ljava/lang/String;

    goto :goto_11

    :cond_12
    move-object/from16 v3, p19

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->userUsername:Ljava/lang/String;

    :goto_11
    const/high16 v3, 0x20000

    and-int/2addr v3, v1

    if-nez v3, :cond_13

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->userDiscriminator:Ljava/lang/Integer;

    goto :goto_12

    :cond_13
    move-object/from16 v3, p20

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->userDiscriminator:Ljava/lang/Integer;

    :goto_12
    const/high16 v3, 0x40000

    and-int/2addr v3, v1

    if-nez v3, :cond_14

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->userAvatar:Ljava/lang/String;

    goto :goto_13

    :cond_14
    move-object/from16 v3, p21

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->userAvatar:Ljava/lang/String;

    :goto_13
    const/high16 v3, 0x80000

    and-int/2addr v3, v1

    if-nez v3, :cond_15

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->userGuildAvatar:Ljava/lang/String;

    goto :goto_14

    :cond_15
    move-object/from16 v3, p22

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->userGuildAvatar:Ljava/lang/String;

    :goto_14
    const/high16 v3, 0x100000

    and-int/2addr v3, v1

    if-nez v3, :cond_16

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->relationshipType:Ljava/lang/Integer;

    goto :goto_15

    :cond_16
    move-object/from16 v3, p23

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->relationshipType:Ljava/lang/Integer;

    :goto_15
    const/high16 v3, 0x200000

    and-int/2addr v3, v1

    if-nez v3, :cond_17

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->guildId:Lcom/discord/primitives/GuildId;

    goto :goto_16

    :cond_17
    move-object/from16 v3, p24

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->guildId:Lcom/discord/primitives/GuildId;

    :goto_16
    const/high16 v3, 0x400000

    and-int/2addr v3, v1

    if-nez v3, :cond_18

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->guildName:Ljava/lang/String;

    goto :goto_17

    :cond_18
    move-object/from16 v3, p25

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->guildName:Ljava/lang/String;

    :goto_17
    const/high16 v3, 0x800000

    and-int/2addr v3, v1

    if-nez v3, :cond_19

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->guildIcon:Ljava/lang/String;

    goto :goto_18

    :cond_19
    move-object/from16 v3, p26

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->guildIcon:Ljava/lang/String;

    :goto_18
    const/high16 v3, 0x1000000

    and-int/2addr v3, v1

    if-nez v3, :cond_1a

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->activityType:Ljava/lang/Integer;

    goto :goto_19

    :cond_1a
    move-object/from16 v3, p27

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->activityType:Ljava/lang/Integer;

    :goto_19
    const/high16 v3, 0x2000000

    and-int/2addr v3, v1

    if-nez v3, :cond_1b

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->activityName:Ljava/lang/String;

    goto :goto_1a

    :cond_1b
    move-object/from16 v3, p28

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->activityName:Ljava/lang/String;

    :goto_1a
    const/high16 v3, 0x4000000

    and-int/2addr v3, v1

    if-nez v3, :cond_1c

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->applicationId:Lcom/discord/primitives/ApplicationId;

    goto :goto_1b

    :cond_1c
    move-object/from16 v3, p29

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->applicationId:Lcom/discord/primitives/ApplicationId;

    :goto_1b
    const/high16 v3, 0x8000000

    and-int/2addr v3, v1

    if-nez v3, :cond_1d

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->applicationName:Ljava/lang/String;

    goto :goto_1c

    :cond_1d
    move-object/from16 v3, p30

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->applicationName:Ljava/lang/String;

    :goto_1c
    const/high16 v3, 0x10000000

    and-int/2addr v3, v1

    if-nez v3, :cond_1e

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->applicationIcon:Ljava/lang/String;

    goto :goto_1d

    :cond_1e
    move-object/from16 v3, p31

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->applicationIcon:Ljava/lang/String;

    :goto_1d
    const/high16 v3, 0x20000000

    and-int/2addr v3, v1

    if-nez v3, :cond_1f

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->message:Lcom/discord/notifications/api/NotificationMessage;

    goto :goto_1e

    :cond_1f
    move-object/from16 v3, p32

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->message:Lcom/discord/notifications/api/NotificationMessage;

    :goto_1e
    const/high16 v3, 0x40000000    # 2.0f

    and-int/2addr v3, v1

    if-nez v3, :cond_20

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->stageInstanceTopic:Ljava/lang/String;

    goto :goto_1f

    :cond_20
    move-object/from16 v3, p33

    iput-object v3, v0, Lcom/discord/notifications/api/NotificationData;->stageInstanceTopic:Ljava/lang/String;

    :goto_1f
    const/high16 v3, -0x80000000

    and-int/2addr v1, v3

    if-nez v1, :cond_21

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->guildScheduledEventEntityType:Ljava/lang/Integer;

    goto :goto_20

    :cond_21
    move-object/from16 v1, p34

    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->guildScheduledEventEntityType:Ljava/lang/Integer;

    :goto_20
    and-int/lit8 v1, v2, 0x1

    if-nez v1, :cond_22

    iput-boolean v4, v0, Lcom/discord/notifications/api/NotificationData;->canReply:Z

    goto :goto_21

    :cond_22
    move/from16 v1, p35

    iput-boolean v1, v0, Lcom/discord/notifications/api/NotificationData;->canReply:Z

    :goto_21
    and-int/lit8 v1, v2, 0x2

    if-nez v1, :cond_23

    iput-boolean v4, v0, Lcom/discord/notifications/api/NotificationData;->isFromCurrentUser:Z

    goto :goto_22

    :cond_23
    move/from16 v1, p36

    iput-boolean v1, v0, Lcom/discord/notifications/api/NotificationData;->isFromCurrentUser:Z

    :goto_22
    and-int/lit8 v1, v2, 0x4

    if-nez v1, :cond_24

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->title:Ljava/lang/String;

    goto :goto_23

    :cond_24
    move-object/from16 v1, p37

    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->title:Ljava/lang/String;

    :goto_23
    and-int/lit8 v1, v2, 0x8

    if-nez v1, :cond_25

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->subtitle:Ljava/lang/String;

    goto :goto_24

    :cond_25
    move-object/from16 v1, p38

    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->subtitle:Ljava/lang/String;

    :goto_24
    and-int/lit8 v1, v2, 0x10

    if-nez v1, :cond_26

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->iconUrl:Ljava/lang/String;

    goto :goto_25

    :cond_26
    move-object/from16 v1, p39

    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->iconUrl:Ljava/lang/String;

    :goto_25
    and-int/lit8 v1, v2, 0x20

    if-nez v1, :cond_27

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->notificationChannel:Ljava/lang/String;

    goto :goto_26

    :cond_27
    move-object/from16 v1, p40

    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->notificationChannel:Ljava/lang/String;

    :goto_26
    and-int/lit8 v1, v2, 0x40

    if-nez v1, :cond_28

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->trackingType:Ljava/lang/String;

    goto :goto_27

    :cond_28
    move-object/from16 v1, p41

    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->trackingType:Ljava/lang/String;

    :goto_27
    and-int/lit16 v1, v2, 0x80

    if-nez v1, :cond_29

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->deeplink:Ljava/lang/String;

    goto :goto_28

    :cond_29
    move-object/from16 v1, p42

    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->deeplink:Ljava/lang/String;

    :goto_28
    and-int/lit16 v1, v2, 0x100

    if-nez v1, :cond_2a

    .line 4
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_29

    :cond_2a
    move-object/from16 v1, p43

    .line 5
    :goto_29
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->expandSubtitle:Ljava/lang/Boolean;

    and-int/lit16 v1, v2, 0x200

    if-nez v1, :cond_2b

    iput-object v5, v0, Lcom/discord/notifications/api/NotificationData;->imageAttachmentUrl:Ljava/lang/String;

    goto :goto_2a

    :cond_2b
    move-object/from16 v1, p44

    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->imageAttachmentUrl:Ljava/lang/String;

    :goto_2a
    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0x0
    .end array-data
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .param p17    # Ljava/util/List;
        .annotation runtime Lyi/f;
            with = Lcom/discord/notifications/api/ChannelListSerializer;
        .end annotation
    .end param
    .param p32    # Lcom/discord/notifications/api/NotificationMessage;
        .annotation runtime Lyi/f;
            with = Lcom/discord/notifications/api/NotificationMessageSerializer;
        .end annotation
    .end param
    .param p35    # Z
        .annotation runtime Lyi/f;
            with = Lcom/discord/notifications/api/CanReplySerializer;
        .end annotation
    .end param

    invoke-direct/range {p0 .. p45}, Lcom/discord/notifications/api/NotificationData;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lcom/discord/primitives/ChannelId;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/primitives/ChannelId;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/discord/primitives/ChannelId;",
            ">;",
            "Lcom/discord/primitives/UserId;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Lcom/discord/primitives/GuildId;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lcom/discord/primitives/ApplicationId;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/notifications/api/NotificationMessage;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 7
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->type:Ljava/lang/String;

    move-object v1, p2

    .line 8
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->messageId:Ljava/lang/String;

    move-object v1, p3

    .line 9
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->messageActivityType:Ljava/lang/Integer;

    move-object v1, p4

    .line 10
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->messageApplicationName:Ljava/lang/String;

    move-object v1, p5

    .line 11
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->messageType:Ljava/lang/Integer;

    move-object v1, p6

    .line 12
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->messageContent:Ljava/lang/String;

    move-object v1, p7

    .line 13
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->messageFlags:Ljava/lang/Long;

    move-object v1, p8

    .line 14
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->channelType:Ljava/lang/Integer;

    move-object v1, p9

    .line 15
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->channelName:Ljava/lang/String;

    move-object v1, p10

    .line 16
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->channelId:Lcom/discord/primitives/ChannelId;

    move-object v1, p11

    .line 17
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->channelIcon:Ljava/lang/String;

    move-object v1, p12

    .line 18
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->parentName:Ljava/lang/String;

    move-object v1, p13

    .line 19
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->parentId:Lcom/discord/primitives/ChannelId;

    move-object/from16 v1, p14

    .line 20
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->channelRtcRegion:Ljava/lang/String;

    move-object/from16 v1, p15

    .line 21
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->ackChannelIds:Ljava/util/List;

    move-object/from16 v1, p16

    .line 22
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->userId:Lcom/discord/primitives/UserId;

    move-object/from16 v1, p17

    .line 23
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->userUsername:Ljava/lang/String;

    move-object/from16 v1, p18

    .line 24
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->userDiscriminator:Ljava/lang/Integer;

    move-object/from16 v1, p19

    .line 25
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->userAvatar:Ljava/lang/String;

    move-object/from16 v1, p20

    .line 26
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->userGuildAvatar:Ljava/lang/String;

    move-object/from16 v1, p21

    .line 27
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->relationshipType:Ljava/lang/Integer;

    move-object/from16 v1, p22

    .line 28
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->guildId:Lcom/discord/primitives/GuildId;

    move-object/from16 v1, p23

    .line 29
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->guildName:Ljava/lang/String;

    move-object/from16 v1, p24

    .line 30
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->guildIcon:Ljava/lang/String;

    move-object/from16 v1, p25

    .line 31
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->activityType:Ljava/lang/Integer;

    move-object/from16 v1, p26

    .line 32
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->activityName:Ljava/lang/String;

    move-object/from16 v1, p27

    .line 33
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->applicationId:Lcom/discord/primitives/ApplicationId;

    move-object/from16 v1, p28

    .line 34
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->applicationName:Ljava/lang/String;

    move-object/from16 v1, p29

    .line 35
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->applicationIcon:Ljava/lang/String;

    move-object/from16 v1, p30

    .line 36
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->message:Lcom/discord/notifications/api/NotificationMessage;

    move-object/from16 v1, p31

    .line 37
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->stageInstanceTopic:Ljava/lang/String;

    move-object/from16 v1, p32

    .line 38
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->guildScheduledEventEntityType:Ljava/lang/Integer;

    move/from16 v1, p33

    .line 39
    iput-boolean v1, v0, Lcom/discord/notifications/api/NotificationData;->canReply:Z

    move/from16 v1, p34

    .line 40
    iput-boolean v1, v0, Lcom/discord/notifications/api/NotificationData;->isFromCurrentUser:Z

    move-object/from16 v1, p35

    .line 41
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->title:Ljava/lang/String;

    move-object/from16 v1, p36

    .line 42
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->subtitle:Ljava/lang/String;

    move-object/from16 v1, p37

    .line 43
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->iconUrl:Ljava/lang/String;

    move-object/from16 v1, p38

    .line 44
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->notificationChannel:Ljava/lang/String;

    move-object/from16 v1, p39

    .line 45
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->trackingType:Ljava/lang/String;

    move-object/from16 v1, p40

    .line 46
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->deeplink:Ljava/lang/String;

    move-object/from16 v1, p41

    .line 47
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->expandSubtitle:Ljava/lang/Boolean;

    move-object/from16 v1, p42

    .line 48
    iput-object v1, v0, Lcom/discord/notifications/api/NotificationData;->imageAttachmentUrl:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 41

    move/from16 v0, p43

    move/from16 v1, p44

    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v2, p2

    :goto_0
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v4, p3

    :goto_1
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_3

    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_4

    const/4 v7, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_5

    const/4 v8, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_6

    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_7

    const/4 v10, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_8

    const/4 v11, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_9

    const/4 v12, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_a

    const/4 v13, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_b

    const/4 v14, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_c

    const/4 v15, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v15, p14

    :goto_c
    and-int/lit16 v3, v0, 0x4000

    if-eqz v3, :cond_d

    .line 49
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v3

    goto :goto_d

    :cond_d
    move-object/from16 v3, p15

    :goto_d
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_e

    const/16 v16, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v16, p16

    :goto_e
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_f

    const/16 v17, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v17, p17

    :goto_f
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_10

    const/16 v18, 0x0

    goto :goto_10

    :cond_10
    move-object/from16 v18, p18

    :goto_10
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    if-eqz v19, :cond_11

    const/16 v19, 0x0

    goto :goto_11

    :cond_11
    move-object/from16 v19, p19

    :goto_11
    const/high16 v20, 0x80000

    and-int v20, v0, v20

    if-eqz v20, :cond_12

    const/16 v20, 0x0

    goto :goto_12

    :cond_12
    move-object/from16 v20, p20

    :goto_12
    const/high16 v21, 0x100000

    and-int v21, v0, v21

    if-eqz v21, :cond_13

    const/16 v21, 0x0

    goto :goto_13

    :cond_13
    move-object/from16 v21, p21

    :goto_13
    const/high16 v22, 0x200000

    and-int v22, v0, v22

    if-eqz v22, :cond_14

    const/16 v22, 0x0

    goto :goto_14

    :cond_14
    move-object/from16 v22, p22

    :goto_14
    const/high16 v23, 0x400000

    and-int v23, v0, v23

    if-eqz v23, :cond_15

    const/16 v23, 0x0

    goto :goto_15

    :cond_15
    move-object/from16 v23, p23

    :goto_15
    const/high16 v24, 0x800000

    and-int v24, v0, v24

    if-eqz v24, :cond_16

    const/16 v24, 0x0

    goto :goto_16

    :cond_16
    move-object/from16 v24, p24

    :goto_16
    const/high16 v25, 0x1000000

    and-int v25, v0, v25

    if-eqz v25, :cond_17

    const/16 v25, 0x0

    goto :goto_17

    :cond_17
    move-object/from16 v25, p25

    :goto_17
    const/high16 v26, 0x2000000

    and-int v26, v0, v26

    if-eqz v26, :cond_18

    const/16 v26, 0x0

    goto :goto_18

    :cond_18
    move-object/from16 v26, p26

    :goto_18
    const/high16 v27, 0x4000000

    and-int v27, v0, v27

    if-eqz v27, :cond_19

    const/16 v27, 0x0

    goto :goto_19

    :cond_19
    move-object/from16 v27, p27

    :goto_19
    const/high16 v28, 0x8000000

    and-int v28, v0, v28

    if-eqz v28, :cond_1a

    const/16 v28, 0x0

    goto :goto_1a

    :cond_1a
    move-object/from16 v28, p28

    :goto_1a
    const/high16 v29, 0x10000000

    and-int v29, v0, v29

    if-eqz v29, :cond_1b

    const/16 v29, 0x0

    goto :goto_1b

    :cond_1b
    move-object/from16 v29, p29

    :goto_1b
    const/high16 v30, 0x20000000

    and-int v30, v0, v30

    if-eqz v30, :cond_1c

    const/16 v30, 0x0

    goto :goto_1c

    :cond_1c
    move-object/from16 v30, p30

    :goto_1c
    const/high16 v31, 0x40000000    # 2.0f

    and-int v31, v0, v31

    if-eqz v31, :cond_1d

    const/16 v31, 0x0

    goto :goto_1d

    :cond_1d
    move-object/from16 v31, p31

    :goto_1d
    const/high16 v32, -0x80000000

    and-int v0, v0, v32

    if-eqz v0, :cond_1e

    const/4 v0, 0x0

    goto :goto_1e

    :cond_1e
    move-object/from16 v0, p32

    :goto_1e
    and-int/lit8 v32, v1, 0x1

    const/16 v33, 0x0

    if-eqz v32, :cond_1f

    move/from16 v32, v33

    goto :goto_1f

    :cond_1f
    move/from16 v32, p33

    :goto_1f
    and-int/lit8 v34, v1, 0x2

    if-eqz v34, :cond_20

    goto :goto_20

    :cond_20
    move/from16 v33, p34

    :goto_20
    and-int/lit8 v34, v1, 0x4

    if-eqz v34, :cond_21

    const/16 v34, 0x0

    goto :goto_21

    :cond_21
    move-object/from16 v34, p35

    :goto_21
    and-int/lit8 v35, v1, 0x8

    if-eqz v35, :cond_22

    const/16 v35, 0x0

    goto :goto_22

    :cond_22
    move-object/from16 v35, p36

    :goto_22
    and-int/lit8 v36, v1, 0x10

    if-eqz v36, :cond_23

    const/16 v36, 0x0

    goto :goto_23

    :cond_23
    move-object/from16 v36, p37

    :goto_23
    and-int/lit8 v37, v1, 0x20

    if-eqz v37, :cond_24

    const/16 v37, 0x0

    goto :goto_24

    :cond_24
    move-object/from16 v37, p38

    :goto_24
    and-int/lit8 v38, v1, 0x40

    if-eqz v38, :cond_25

    const/16 v38, 0x0

    goto :goto_25

    :cond_25
    move-object/from16 v38, p39

    :goto_25
    move-object/from16 p43, v0

    and-int/lit16 v0, v1, 0x80

    if-eqz v0, :cond_26

    const/4 v0, 0x0

    goto :goto_26

    :cond_26
    move-object/from16 v0, p40

    :goto_26
    move-object/from16 v39, v0

    and-int/lit16 v0, v1, 0x100

    if-eqz v0, :cond_27

    .line 50
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_27

    :cond_27
    move-object/from16 v0, p41

    :goto_27
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_28

    const/4 v1, 0x0

    goto :goto_28

    :cond_28
    move-object/from16 v1, p42

    :goto_28
    const/16 v40, 0x0

    move-object/from16 p45, v40

    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v2

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    move-object/from16 p13, v12

    move-object/from16 p14, v13

    move-object/from16 p15, v14

    move-object/from16 p16, v15

    move-object/from16 p17, v3

    move-object/from16 p18, v16

    move-object/from16 p19, v17

    move-object/from16 p20, v18

    move-object/from16 p21, v19

    move-object/from16 p22, v20

    move-object/from16 p23, v21

    move-object/from16 p24, v22

    move-object/from16 p25, v23

    move-object/from16 p26, v24

    move-object/from16 p27, v25

    move-object/from16 p28, v26

    move-object/from16 p29, v27

    move-object/from16 p30, v28

    move-object/from16 p31, v29

    move-object/from16 p32, v30

    move-object/from16 p33, v31

    move-object/from16 p34, p43

    move/from16 p35, v32

    move/from16 p36, v33

    move-object/from16 p37, v34

    move-object/from16 p38, v35

    move-object/from16 p39, v36

    move-object/from16 p40, v37

    move-object/from16 p41, v38

    move-object/from16 p42, v39

    move-object/from16 p43, v0

    move-object/from16 p44, v1

    .line 51
    invoke-direct/range {p2 .. p45}, Lcom/discord/notifications/api/NotificationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p42}, Lcom/discord/notifications/api/NotificationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy-tc0JBzY$default(Lcom/discord/notifications/api/NotificationData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;IILjava/lang/Object;)Lcom/discord/notifications/api/NotificationData;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p43

    move/from16 v2, p44

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget-object v3, v0, Lcom/discord/notifications/api/NotificationData;->type:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Lcom/discord/notifications/api/NotificationData;->messageId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/discord/notifications/api/NotificationData;->messageActivityType:Ljava/lang/Integer;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lcom/discord/notifications/api/NotificationData;->messageApplicationName:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/discord/notifications/api/NotificationData;->messageType:Ljava/lang/Integer;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/discord/notifications/api/NotificationData;->messageContent:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lcom/discord/notifications/api/NotificationData;->messageFlags:Ljava/lang/Long;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lcom/discord/notifications/api/NotificationData;->channelType:Ljava/lang/Integer;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-object v11, v0, Lcom/discord/notifications/api/NotificationData;->channelName:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-object v12, v0, Lcom/discord/notifications/api/NotificationData;->channelId:Lcom/discord/primitives/ChannelId;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lcom/discord/notifications/api/NotificationData;->channelIcon:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-object v14, v0, Lcom/discord/notifications/api/NotificationData;->parentName:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->parentId:Lcom/discord/primitives/ChannelId;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p13

    :goto_c
    move-object/from16 p13, v15

    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->channelRtcRegion:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->ackChannelIds:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->userId:Lcom/discord/primitives/UserId;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move-object/from16 p16, v15

    if-eqz v16, :cond_10

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->userUsername:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move-object/from16 p17, v15

    if-eqz v16, :cond_11

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->userDiscriminator:Ljava/lang/Integer;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-object/from16 p18, v15

    if-eqz v16, :cond_12

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->userAvatar:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v15, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move-object/from16 p19, v15

    if-eqz v16, :cond_13

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->userGuildAvatar:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v15, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, v1, v16

    move-object/from16 p20, v15

    if-eqz v16, :cond_14

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->relationshipType:Ljava/lang/Integer;

    goto :goto_14

    :cond_14
    move-object/from16 v15, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, v1, v16

    move-object/from16 p21, v15

    if-eqz v16, :cond_15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->guildId:Lcom/discord/primitives/GuildId;

    goto :goto_15

    :cond_15
    move-object/from16 v15, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, v1, v16

    move-object/from16 p22, v15

    if-eqz v16, :cond_16

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->guildName:Ljava/lang/String;

    goto :goto_16

    :cond_16
    move-object/from16 v15, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, v1, v16

    move-object/from16 p23, v15

    if-eqz v16, :cond_17

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->guildIcon:Ljava/lang/String;

    goto :goto_17

    :cond_17
    move-object/from16 v15, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, v1, v16

    move-object/from16 p24, v15

    if-eqz v16, :cond_18

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->activityType:Ljava/lang/Integer;

    goto :goto_18

    :cond_18
    move-object/from16 v15, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, v1, v16

    move-object/from16 p25, v15

    if-eqz v16, :cond_19

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->activityName:Ljava/lang/String;

    goto :goto_19

    :cond_19
    move-object/from16 v15, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, v1, v16

    move-object/from16 p26, v15

    if-eqz v16, :cond_1a

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->applicationId:Lcom/discord/primitives/ApplicationId;

    goto :goto_1a

    :cond_1a
    move-object/from16 v15, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, v1, v16

    move-object/from16 p27, v15

    if-eqz v16, :cond_1b

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->applicationName:Ljava/lang/String;

    goto :goto_1b

    :cond_1b
    move-object/from16 v15, p28

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, v1, v16

    move-object/from16 p28, v15

    if-eqz v16, :cond_1c

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->applicationIcon:Ljava/lang/String;

    goto :goto_1c

    :cond_1c
    move-object/from16 v15, p29

    :goto_1c
    const/high16 v16, 0x20000000

    and-int v16, v1, v16

    move-object/from16 p29, v15

    if-eqz v16, :cond_1d

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->message:Lcom/discord/notifications/api/NotificationMessage;

    goto :goto_1d

    :cond_1d
    move-object/from16 v15, p30

    :goto_1d
    const/high16 v16, 0x40000000    # 2.0f

    and-int v16, v1, v16

    move-object/from16 p30, v15

    if-eqz v16, :cond_1e

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->stageInstanceTopic:Ljava/lang/String;

    goto :goto_1e

    :cond_1e
    move-object/from16 v15, p31

    :goto_1e
    const/high16 v16, -0x80000000

    and-int v1, v1, v16

    if-eqz v1, :cond_1f

    iget-object v1, v0, Lcom/discord/notifications/api/NotificationData;->guildScheduledEventEntityType:Ljava/lang/Integer;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p32

    :goto_1f
    and-int/lit8 v16, v2, 0x1

    move-object/from16 p32, v1

    if-eqz v16, :cond_20

    iget-boolean v1, v0, Lcom/discord/notifications/api/NotificationData;->canReply:Z

    goto :goto_20

    :cond_20
    move/from16 v1, p33

    :goto_20
    and-int/lit8 v16, v2, 0x2

    move/from16 p33, v1

    if-eqz v16, :cond_21

    iget-boolean v1, v0, Lcom/discord/notifications/api/NotificationData;->isFromCurrentUser:Z

    goto :goto_21

    :cond_21
    move/from16 v1, p34

    :goto_21
    and-int/lit8 v16, v2, 0x4

    move/from16 p34, v1

    if-eqz v16, :cond_22

    iget-object v1, v0, Lcom/discord/notifications/api/NotificationData;->title:Ljava/lang/String;

    goto :goto_22

    :cond_22
    move-object/from16 v1, p35

    :goto_22
    and-int/lit8 v16, v2, 0x8

    move-object/from16 p35, v1

    if-eqz v16, :cond_23

    iget-object v1, v0, Lcom/discord/notifications/api/NotificationData;->subtitle:Ljava/lang/String;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p36

    :goto_23
    and-int/lit8 v16, v2, 0x10

    move-object/from16 p36, v1

    if-eqz v16, :cond_24

    iget-object v1, v0, Lcom/discord/notifications/api/NotificationData;->iconUrl:Ljava/lang/String;

    goto :goto_24

    :cond_24
    move-object/from16 v1, p37

    :goto_24
    and-int/lit8 v16, v2, 0x20

    move-object/from16 p37, v1

    if-eqz v16, :cond_25

    iget-object v1, v0, Lcom/discord/notifications/api/NotificationData;->notificationChannel:Ljava/lang/String;

    goto :goto_25

    :cond_25
    move-object/from16 v1, p38

    :goto_25
    and-int/lit8 v16, v2, 0x40

    move-object/from16 p38, v1

    if-eqz v16, :cond_26

    iget-object v1, v0, Lcom/discord/notifications/api/NotificationData;->trackingType:Ljava/lang/String;

    goto :goto_26

    :cond_26
    move-object/from16 v1, p39

    :goto_26
    move-object/from16 p39, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-object v1, v0, Lcom/discord/notifications/api/NotificationData;->deeplink:Ljava/lang/String;

    goto :goto_27

    :cond_27
    move-object/from16 v1, p40

    :goto_27
    move-object/from16 p40, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget-object v1, v0, Lcom/discord/notifications/api/NotificationData;->expandSubtitle:Ljava/lang/Boolean;

    goto :goto_28

    :cond_28
    move-object/from16 v1, p41

    :goto_28
    and-int/lit16 v2, v2, 0x200

    if-eqz v2, :cond_29

    iget-object v2, v0, Lcom/discord/notifications/api/NotificationData;->imageAttachmentUrl:Ljava/lang/String;

    goto :goto_29

    :cond_29
    move-object/from16 v2, p42

    :goto_29
    move-object/from16 p1, v3

    move-object/from16 p2, v4

    move-object/from16 p3, v5

    move-object/from16 p4, v6

    move-object/from16 p5, v7

    move-object/from16 p6, v8

    move-object/from16 p7, v9

    move-object/from16 p8, v10

    move-object/from16 p9, v11

    move-object/from16 p10, v12

    move-object/from16 p11, v13

    move-object/from16 p12, v14

    move-object/from16 p31, v15

    move-object/from16 p41, v1

    move-object/from16 p42, v2

    invoke-virtual/range {p0 .. p42}, Lcom/discord/notifications/api/NotificationData;->copy-tc0JBzY(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/discord/notifications/api/NotificationData;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getAckChannelIds$annotations()V
    .locals 0
    .annotation runtime Lyi/f;
        with = Lcom/discord/notifications/api/ChannelListSerializer;
    .end annotation

    return-void
.end method

.method public static synthetic getActivityName$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getActivityType$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getApplicationIcon$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getApplicationId-UtIrSio$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getApplicationName$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCanReply$annotations()V
    .locals 0
    .annotation runtime Lyi/f;
        with = Lcom/discord/notifications/api/CanReplySerializer;
    .end annotation

    return-void
.end method

.method public static synthetic getChannelIcon$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getChannelId-qMVnFVQ$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getChannelName$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getChannelRtcRegion$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getChannelType$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getDeeplink$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getExpandSubtitle$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getGuildIcon$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getGuildId-qOKuAAo$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getGuildName$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getGuildScheduledEventEntityType$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getIconUrl$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getImageAttachmentUrl$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getMessage$annotations()V
    .locals 0
    .annotation runtime Lyi/f;
        with = Lcom/discord/notifications/api/NotificationMessageSerializer;
    .end annotation

    return-void
.end method

.method public static synthetic getMessageActivityType$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getMessageApplicationName$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getMessageContent$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getMessageFlags$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getMessageId-N_6c4I0$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getMessageType$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getNotificationChannel$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getParentId-qMVnFVQ$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getParentName$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getRelationshipType$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getStageInstanceTopic$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getSubtitle$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getTrackingType$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getType$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getUserAvatar$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getUserDiscriminator$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getUserGuildAvatar$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getUserId-wUX8bhU$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getUserUsername$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isFromCurrentUser$annotations()V
    .locals 0

    return-void
.end method

.method public static final write$Self(Lcom/discord/notifications/api/NotificationData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 5

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->type:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    move v2, v0

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->messageId:Ljava/lang/String;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-eqz v2, :cond_3

    sget-object v2, Lcom/discord/primitives/MessageId$$serializer;->INSTANCE:Lcom/discord/primitives/MessageId$$serializer;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->messageId:Ljava/lang/String;

    if-eqz v3, :cond_2

    invoke-static {v3}, Lcom/discord/primitives/MessageId;->box-impl(Ljava/lang/String;)Lcom/discord/primitives/MessageId;

    move-result-object v3

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    invoke-interface {p1, p2, v0, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_3
    const/4 v2, 0x2

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_4

    :goto_3
    move v3, v0

    goto :goto_4

    :cond_4
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->messageActivityType:Ljava/lang/Integer;

    if-eqz v3, :cond_5

    goto :goto_3

    :cond_5
    move v3, v1

    :goto_4
    if-eqz v3, :cond_6

    sget-object v3, Lbj/m0;->a:Lbj/m0;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->messageActivityType:Ljava/lang/Integer;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_6
    const/4 v2, 0x3

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_7

    :goto_5
    move v3, v0

    goto :goto_6

    :cond_7
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->messageApplicationName:Ljava/lang/String;

    if-eqz v3, :cond_8

    goto :goto_5

    :cond_8
    move v3, v1

    :goto_6
    if-eqz v3, :cond_9

    sget-object v3, Lbj/a2;->a:Lbj/a2;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->messageApplicationName:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_9
    const/4 v2, 0x4

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_a

    :goto_7
    move v3, v0

    goto :goto_8

    :cond_a
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->messageType:Ljava/lang/Integer;

    if-eqz v3, :cond_b

    goto :goto_7

    :cond_b
    move v3, v1

    :goto_8
    if-eqz v3, :cond_c

    sget-object v3, Lbj/m0;->a:Lbj/m0;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->messageType:Ljava/lang/Integer;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_c
    const/4 v2, 0x5

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_d

    :goto_9
    move v3, v0

    goto :goto_a

    :cond_d
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->messageContent:Ljava/lang/String;

    if-eqz v3, :cond_e

    goto :goto_9

    :cond_e
    move v3, v1

    :goto_a
    if-eqz v3, :cond_f

    sget-object v3, Lbj/a2;->a:Lbj/a2;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->messageContent:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_f
    const/4 v2, 0x6

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_10

    :goto_b
    move v3, v0

    goto :goto_c

    :cond_10
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->messageFlags:Ljava/lang/Long;

    if-eqz v3, :cond_11

    goto :goto_b

    :cond_11
    move v3, v1

    :goto_c
    if-eqz v3, :cond_12

    sget-object v3, Lbj/w0;->a:Lbj/w0;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->messageFlags:Ljava/lang/Long;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_12
    const/4 v2, 0x7

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_13

    :goto_d
    move v3, v0

    goto :goto_e

    :cond_13
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->channelType:Ljava/lang/Integer;

    if-eqz v3, :cond_14

    goto :goto_d

    :cond_14
    move v3, v1

    :goto_e
    if-eqz v3, :cond_15

    sget-object v3, Lbj/m0;->a:Lbj/m0;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->channelType:Ljava/lang/Integer;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_15
    const/16 v2, 0x8

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_16

    :goto_f
    move v3, v0

    goto :goto_10

    :cond_16
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->channelName:Ljava/lang/String;

    if-eqz v3, :cond_17

    goto :goto_f

    :cond_17
    move v3, v1

    :goto_10
    if-eqz v3, :cond_18

    sget-object v3, Lbj/a2;->a:Lbj/a2;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->channelName:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_18
    const/16 v2, 0x9

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_19

    :goto_11
    move v3, v0

    goto :goto_12

    :cond_19
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->channelId:Lcom/discord/primitives/ChannelId;

    if-eqz v3, :cond_1a

    goto :goto_11

    :cond_1a
    move v3, v1

    :goto_12
    if-eqz v3, :cond_1b

    sget-object v3, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->channelId:Lcom/discord/primitives/ChannelId;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_1b
    const/16 v2, 0xa

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_1c

    :goto_13
    move v3, v0

    goto :goto_14

    :cond_1c
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->channelIcon:Ljava/lang/String;

    if-eqz v3, :cond_1d

    goto :goto_13

    :cond_1d
    move v3, v1

    :goto_14
    if-eqz v3, :cond_1e

    sget-object v3, Lbj/a2;->a:Lbj/a2;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->channelIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_1e
    const/16 v2, 0xb

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_1f

    :goto_15
    move v3, v0

    goto :goto_16

    :cond_1f
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->parentName:Ljava/lang/String;

    if-eqz v3, :cond_20

    goto :goto_15

    :cond_20
    move v3, v1

    :goto_16
    if-eqz v3, :cond_21

    sget-object v3, Lbj/a2;->a:Lbj/a2;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->parentName:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_21
    const/16 v2, 0xc

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_22

    :goto_17
    move v3, v0

    goto :goto_18

    :cond_22
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->parentId:Lcom/discord/primitives/ChannelId;

    if-eqz v3, :cond_23

    goto :goto_17

    :cond_23
    move v3, v1

    :goto_18
    if-eqz v3, :cond_24

    sget-object v3, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->parentId:Lcom/discord/primitives/ChannelId;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_24
    const/16 v2, 0xd

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_25

    :goto_19
    move v3, v0

    goto :goto_1a

    :cond_25
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->channelRtcRegion:Ljava/lang/String;

    if-eqz v3, :cond_26

    goto :goto_19

    :cond_26
    move v3, v1

    :goto_1a
    if-eqz v3, :cond_27

    sget-object v3, Lbj/a2;->a:Lbj/a2;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->channelRtcRegion:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_27
    const/16 v2, 0xe

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_28

    :goto_1b
    move v3, v0

    goto :goto_1c

    :cond_28
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->ackChannelIds:Ljava/util/List;

    .line 2
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_29

    goto :goto_1b

    :cond_29
    move v3, v1

    :goto_1c
    if-eqz v3, :cond_2a

    .line 3
    sget-object v3, Lcom/discord/notifications/api/ChannelListSerializer;->INSTANCE:Lcom/discord/notifications/api/ChannelListSerializer;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->ackChannelIds:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_2a
    const/16 v2, 0xf

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_2b

    :goto_1d
    move v3, v0

    goto :goto_1e

    :cond_2b
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->userId:Lcom/discord/primitives/UserId;

    if-eqz v3, :cond_2c

    goto :goto_1d

    :cond_2c
    move v3, v1

    :goto_1e
    if-eqz v3, :cond_2d

    sget-object v3, Lcom/discord/primitives/UserId$$serializer;->INSTANCE:Lcom/discord/primitives/UserId$$serializer;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->userId:Lcom/discord/primitives/UserId;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_2d
    const/16 v2, 0x10

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_2e

    :goto_1f
    move v3, v0

    goto :goto_20

    :cond_2e
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->userUsername:Ljava/lang/String;

    if-eqz v3, :cond_2f

    goto :goto_1f

    :cond_2f
    move v3, v1

    :goto_20
    if-eqz v3, :cond_30

    sget-object v3, Lbj/a2;->a:Lbj/a2;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->userUsername:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_30
    const/16 v2, 0x11

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_31

    :goto_21
    move v3, v0

    goto :goto_22

    :cond_31
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->userDiscriminator:Ljava/lang/Integer;

    if-eqz v3, :cond_32

    goto :goto_21

    :cond_32
    move v3, v1

    :goto_22
    if-eqz v3, :cond_33

    sget-object v3, Lbj/m0;->a:Lbj/m0;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->userDiscriminator:Ljava/lang/Integer;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_33
    const/16 v2, 0x12

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_34

    :goto_23
    move v3, v0

    goto :goto_24

    :cond_34
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->userAvatar:Ljava/lang/String;

    if-eqz v3, :cond_35

    goto :goto_23

    :cond_35
    move v3, v1

    :goto_24
    if-eqz v3, :cond_36

    sget-object v3, Lbj/a2;->a:Lbj/a2;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->userAvatar:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_36
    const/16 v2, 0x13

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_37

    :goto_25
    move v3, v0

    goto :goto_26

    :cond_37
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->userGuildAvatar:Ljava/lang/String;

    if-eqz v3, :cond_38

    goto :goto_25

    :cond_38
    move v3, v1

    :goto_26
    if-eqz v3, :cond_39

    sget-object v3, Lbj/a2;->a:Lbj/a2;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->userGuildAvatar:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_39
    const/16 v2, 0x14

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_3a

    :goto_27
    move v3, v0

    goto :goto_28

    :cond_3a
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->relationshipType:Ljava/lang/Integer;

    if-eqz v3, :cond_3b

    goto :goto_27

    :cond_3b
    move v3, v1

    :goto_28
    if-eqz v3, :cond_3c

    sget-object v3, Lbj/m0;->a:Lbj/m0;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->relationshipType:Ljava/lang/Integer;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_3c
    const/16 v2, 0x15

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_3d

    :goto_29
    move v3, v0

    goto :goto_2a

    :cond_3d
    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->guildId:Lcom/discord/primitives/GuildId;

    if-eqz v3, :cond_3e

    goto :goto_29

    :cond_3e
    move v3, v1

    :goto_2a
    if-eqz v3, :cond_3f

    sget-object v3, Lcom/discord/primitives/GuildId$$serializer;->INSTANCE:Lcom/discord/primitives/GuildId$$serializer;

    iget-object v4, p0, Lcom/discord/notifications/api/NotificationData;->guildId:Lcom/discord/primitives/GuildId;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_3f
    const/16 v2, 0x16

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_40

    :goto_2b
    move v2, v0

    goto :goto_2c

    :cond_40
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->guildName:Ljava/lang/String;

    if-eqz v2, :cond_41

    goto :goto_2b

    :cond_41
    move v2, v1

    :goto_2c
    if-eqz v2, :cond_42

    sget-object v2, Lbj/a2;->a:Lbj/a2;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->guildName:Ljava/lang/String;

    const/16 v4, 0x16

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_42
    const/16 v2, 0x17

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_43

    :goto_2d
    move v2, v0

    goto :goto_2e

    :cond_43
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->guildIcon:Ljava/lang/String;

    if-eqz v2, :cond_44

    goto :goto_2d

    :cond_44
    move v2, v1

    :goto_2e
    if-eqz v2, :cond_45

    sget-object v2, Lbj/a2;->a:Lbj/a2;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->guildIcon:Ljava/lang/String;

    const/16 v4, 0x17

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_45
    const/16 v2, 0x18

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_46

    :goto_2f
    move v2, v0

    goto :goto_30

    :cond_46
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->activityType:Ljava/lang/Integer;

    if-eqz v2, :cond_47

    goto :goto_2f

    :cond_47
    move v2, v1

    :goto_30
    if-eqz v2, :cond_48

    sget-object v2, Lbj/m0;->a:Lbj/m0;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->activityType:Ljava/lang/Integer;

    const/16 v4, 0x18

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_48
    const/16 v2, 0x19

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_49

    :goto_31
    move v2, v0

    goto :goto_32

    :cond_49
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->activityName:Ljava/lang/String;

    if-eqz v2, :cond_4a

    goto :goto_31

    :cond_4a
    move v2, v1

    :goto_32
    if-eqz v2, :cond_4b

    sget-object v2, Lbj/a2;->a:Lbj/a2;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->activityName:Ljava/lang/String;

    const/16 v4, 0x19

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_4b
    const/16 v2, 0x1a

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_4c

    :goto_33
    move v2, v0

    goto :goto_34

    :cond_4c
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->applicationId:Lcom/discord/primitives/ApplicationId;

    if-eqz v2, :cond_4d

    goto :goto_33

    :cond_4d
    move v2, v1

    :goto_34
    if-eqz v2, :cond_4e

    sget-object v2, Lcom/discord/primitives/ApplicationId$$serializer;->INSTANCE:Lcom/discord/primitives/ApplicationId$$serializer;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->applicationId:Lcom/discord/primitives/ApplicationId;

    const/16 v4, 0x1a

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_4e
    const/16 v2, 0x1b

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_4f

    :goto_35
    move v2, v0

    goto :goto_36

    :cond_4f
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->applicationName:Ljava/lang/String;

    if-eqz v2, :cond_50

    goto :goto_35

    :cond_50
    move v2, v1

    :goto_36
    if-eqz v2, :cond_51

    sget-object v2, Lbj/a2;->a:Lbj/a2;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->applicationName:Ljava/lang/String;

    const/16 v4, 0x1b

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_51
    const/16 v2, 0x1c

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_52

    :goto_37
    move v2, v0

    goto :goto_38

    :cond_52
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->applicationIcon:Ljava/lang/String;

    if-eqz v2, :cond_53

    goto :goto_37

    :cond_53
    move v2, v1

    :goto_38
    if-eqz v2, :cond_54

    sget-object v2, Lbj/a2;->a:Lbj/a2;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->applicationIcon:Ljava/lang/String;

    const/16 v4, 0x1c

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_54
    const/16 v2, 0x1d

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_55

    :goto_39
    move v2, v0

    goto :goto_3a

    :cond_55
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->message:Lcom/discord/notifications/api/NotificationMessage;

    if-eqz v2, :cond_56

    goto :goto_39

    :cond_56
    move v2, v1

    :goto_3a
    if-eqz v2, :cond_57

    sget-object v2, Lcom/discord/notifications/api/NotificationMessageSerializer;->INSTANCE:Lcom/discord/notifications/api/NotificationMessageSerializer;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->message:Lcom/discord/notifications/api/NotificationMessage;

    const/16 v4, 0x1d

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_57
    const/16 v2, 0x1e

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_58

    :goto_3b
    move v2, v0

    goto :goto_3c

    :cond_58
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->stageInstanceTopic:Ljava/lang/String;

    if-eqz v2, :cond_59

    goto :goto_3b

    :cond_59
    move v2, v1

    :goto_3c
    if-eqz v2, :cond_5a

    sget-object v2, Lbj/a2;->a:Lbj/a2;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->stageInstanceTopic:Ljava/lang/String;

    const/16 v4, 0x1e

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_5a
    const/16 v2, 0x1f

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_5b

    :goto_3d
    move v2, v0

    goto :goto_3e

    :cond_5b
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->guildScheduledEventEntityType:Ljava/lang/Integer;

    if-eqz v2, :cond_5c

    goto :goto_3d

    :cond_5c
    move v2, v1

    :goto_3e
    if-eqz v2, :cond_5d

    sget-object v2, Lbj/m0;->a:Lbj/m0;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->guildScheduledEventEntityType:Ljava/lang/Integer;

    const/16 v4, 0x1f

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_5d
    const/16 v2, 0x20

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_5e

    :goto_3f
    move v2, v0

    goto :goto_40

    :cond_5e
    iget-boolean v2, p0, Lcom/discord/notifications/api/NotificationData;->canReply:Z

    if-eqz v2, :cond_5f

    goto :goto_3f

    :cond_5f
    move v2, v1

    :goto_40
    if-eqz v2, :cond_60

    sget-object v2, Lcom/discord/notifications/api/CanReplySerializer;->INSTANCE:Lcom/discord/notifications/api/CanReplySerializer;

    iget-boolean v3, p0, Lcom/discord/notifications/api/NotificationData;->canReply:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/16 v4, 0x20

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_60
    const/16 v2, 0x21

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_61

    :goto_41
    move v2, v0

    goto :goto_42

    :cond_61
    iget-boolean v2, p0, Lcom/discord/notifications/api/NotificationData;->isFromCurrentUser:Z

    if-eqz v2, :cond_62

    goto :goto_41

    :cond_62
    move v2, v1

    :goto_42
    if-eqz v2, :cond_63

    const/16 v2, 0x21

    iget-boolean v3, p0, Lcom/discord/notifications/api/NotificationData;->isFromCurrentUser:Z

    invoke-interface {p1, p2, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    :cond_63
    const/16 v2, 0x22

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_64

    :goto_43
    move v2, v0

    goto :goto_44

    :cond_64
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->title:Ljava/lang/String;

    if-eqz v2, :cond_65

    goto :goto_43

    :cond_65
    move v2, v1

    :goto_44
    if-eqz v2, :cond_66

    sget-object v2, Lbj/a2;->a:Lbj/a2;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->title:Ljava/lang/String;

    const/16 v4, 0x22

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_66
    const/16 v2, 0x23

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_67

    :goto_45
    move v2, v0

    goto :goto_46

    :cond_67
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->subtitle:Ljava/lang/String;

    if-eqz v2, :cond_68

    goto :goto_45

    :cond_68
    move v2, v1

    :goto_46
    if-eqz v2, :cond_69

    sget-object v2, Lbj/a2;->a:Lbj/a2;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->subtitle:Ljava/lang/String;

    const/16 v4, 0x23

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_69
    const/16 v2, 0x24

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_6a

    :goto_47
    move v2, v0

    goto :goto_48

    :cond_6a
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->iconUrl:Ljava/lang/String;

    if-eqz v2, :cond_6b

    goto :goto_47

    :cond_6b
    move v2, v1

    :goto_48
    if-eqz v2, :cond_6c

    sget-object v2, Lbj/a2;->a:Lbj/a2;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->iconUrl:Ljava/lang/String;

    const/16 v4, 0x24

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_6c
    const/16 v2, 0x25

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_6d

    :goto_49
    move v2, v0

    goto :goto_4a

    :cond_6d
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->notificationChannel:Ljava/lang/String;

    if-eqz v2, :cond_6e

    goto :goto_49

    :cond_6e
    move v2, v1

    :goto_4a
    if-eqz v2, :cond_6f

    sget-object v2, Lbj/a2;->a:Lbj/a2;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->notificationChannel:Ljava/lang/String;

    const/16 v4, 0x25

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_6f
    const/16 v2, 0x26

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_70

    :goto_4b
    move v2, v0

    goto :goto_4c

    :cond_70
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->trackingType:Ljava/lang/String;

    if-eqz v2, :cond_71

    goto :goto_4b

    :cond_71
    move v2, v1

    :goto_4c
    if-eqz v2, :cond_72

    sget-object v2, Lbj/a2;->a:Lbj/a2;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->trackingType:Ljava/lang/String;

    const/16 v4, 0x26

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_72
    const/16 v2, 0x27

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_73

    :goto_4d
    move v2, v0

    goto :goto_4e

    :cond_73
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->deeplink:Ljava/lang/String;

    if-eqz v2, :cond_74

    goto :goto_4d

    :cond_74
    move v2, v1

    :goto_4e
    if-eqz v2, :cond_75

    sget-object v2, Lbj/a2;->a:Lbj/a2;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->deeplink:Ljava/lang/String;

    const/16 v4, 0x27

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_75
    const/16 v2, 0x28

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_76

    :goto_4f
    move v2, v0

    goto :goto_50

    :cond_76
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->expandSubtitle:Ljava/lang/Boolean;

    .line 4
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_77

    goto :goto_4f

    :cond_77
    move v2, v1

    :goto_50
    if-eqz v2, :cond_78

    .line 5
    sget-object v2, Lbj/h;->a:Lbj/h;

    iget-object v3, p0, Lcom/discord/notifications/api/NotificationData;->expandSubtitle:Ljava/lang/Boolean;

    const/16 v4, 0x28

    invoke-interface {p1, p2, v4, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_78
    const/16 v2, 0x29

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_79

    :goto_51
    move v1, v0

    goto :goto_52

    :cond_79
    iget-object v2, p0, Lcom/discord/notifications/api/NotificationData;->imageAttachmentUrl:Ljava/lang/String;

    if-eqz v2, :cond_7a

    goto :goto_51

    :cond_7a
    :goto_52
    if-eqz v1, :cond_7b

    sget-object v0, Lbj/a2;->a:Lbj/a2;

    iget-object p0, p0, Lcom/discord/notifications/api/NotificationData;->imageAttachmentUrl:Ljava/lang/String;

    const/16 v1, 0x29

    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    :cond_7b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component10-qMVnFVQ()Lcom/discord/primitives/ChannelId;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->channelId:Lcom/discord/primitives/ChannelId;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->channelIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->parentName:Ljava/lang/String;

    return-object v0
.end method

.method public final component13-qMVnFVQ()Lcom/discord/primitives/ChannelId;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->parentId:Lcom/discord/primitives/ChannelId;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->channelRtcRegion:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/primitives/ChannelId;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->ackChannelIds:Ljava/util/List;

    return-object v0
.end method

.method public final component16-wUX8bhU()Lcom/discord/primitives/UserId;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->userId:Lcom/discord/primitives/UserId;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->userUsername:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->userDiscriminator:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->userAvatar:Ljava/lang/String;

    return-object v0
.end method

.method public final component2-N_6c4I0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->userGuildAvatar:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->relationshipType:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component22-qOKuAAo()Lcom/discord/primitives/GuildId;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->guildId:Lcom/discord/primitives/GuildId;

    return-object v0
.end method

.method public final component23()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->guildName:Ljava/lang/String;

    return-object v0
.end method

.method public final component24()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->guildIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component25()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->activityType:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component26()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->activityName:Ljava/lang/String;

    return-object v0
.end method

.method public final component27-UtIrSio()Lcom/discord/primitives/ApplicationId;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->applicationId:Lcom/discord/primitives/ApplicationId;

    return-object v0
.end method

.method public final component28()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->applicationName:Ljava/lang/String;

    return-object v0
.end method

.method public final component29()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->applicationIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->messageActivityType:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component30()Lcom/discord/notifications/api/NotificationMessage;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->message:Lcom/discord/notifications/api/NotificationMessage;

    return-object v0
.end method

.method public final component31()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->stageInstanceTopic:Ljava/lang/String;

    return-object v0
.end method

.method public final component32()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->guildScheduledEventEntityType:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component33()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/notifications/api/NotificationData;->canReply:Z

    return v0
.end method

.method public final component34()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/notifications/api/NotificationData;->isFromCurrentUser:Z

    return v0
.end method

.method public final component35()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component36()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component37()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component38()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->notificationChannel:Ljava/lang/String;

    return-object v0
.end method

.method public final component39()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->trackingType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->messageApplicationName:Ljava/lang/String;

    return-object v0
.end method

.method public final component40()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->deeplink:Ljava/lang/String;

    return-object v0
.end method

.method public final component41()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->expandSubtitle:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component42()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->imageAttachmentUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->messageType:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->messageContent:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->messageFlags:Ljava/lang/Long;

    return-object v0
.end method

.method public final component8()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->channelType:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->channelName:Ljava/lang/String;

    return-object v0
.end method

.method public final copy-tc0JBzY(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/discord/notifications/api/NotificationData;
    .locals 46
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lcom/discord/primitives/ChannelId;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/primitives/ChannelId;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/discord/primitives/ChannelId;",
            ">;",
            "Lcom/discord/primitives/UserId;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Lcom/discord/primitives/GuildId;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lcom/discord/primitives/ApplicationId;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/notifications/api/NotificationMessage;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            ")",
            "Lcom/discord/notifications/api/NotificationData;"
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

    move-object/from16 v25, p25

    move-object/from16 v26, p26

    move-object/from16 v27, p27

    move-object/from16 v28, p28

    move-object/from16 v29, p29

    move-object/from16 v30, p30

    move-object/from16 v31, p31

    move-object/from16 v32, p32

    move/from16 v33, p33

    move/from16 v34, p34

    move-object/from16 v35, p35

    move-object/from16 v36, p36

    move-object/from16 v37, p37

    move-object/from16 v38, p38

    move-object/from16 v39, p39

    move-object/from16 v40, p40

    move-object/from16 v41, p41

    move-object/from16 v42, p42

    const-string v0, "type"

    move-object/from16 v44, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ackChannelIds"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v45, Lcom/discord/notifications/api/NotificationData;

    move-object/from16 v0, v45

    const/16 v43, 0x0

    move-object/from16 v1, v44

    invoke-direct/range {v0 .. v43}, Lcom/discord/notifications/api/NotificationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v45
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/notifications/api/NotificationData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/notifications/api/NotificationData;

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->messageId:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->messageId:Ljava/lang/String;

    if-nez v1, :cond_3

    if-nez v3, :cond_4

    move v1, v0

    goto :goto_0

    :cond_3
    if-nez v3, :cond_5

    :cond_4
    move v1, v2

    goto :goto_0

    :cond_5
    invoke-static {v1, v3}, Lcom/discord/primitives/MessageId;->equals-impl0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    :goto_0
    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->messageActivityType:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->messageActivityType:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->messageApplicationName:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->messageApplicationName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->messageType:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->messageType:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->messageContent:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->messageContent:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->messageFlags:Ljava/lang/Long;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->messageFlags:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->channelType:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->channelType:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->channelName:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->channelName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->channelId:Lcom/discord/primitives/ChannelId;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->channelId:Lcom/discord/primitives/ChannelId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->channelIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->channelIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->parentName:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->parentName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->parentId:Lcom/discord/primitives/ChannelId;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->parentId:Lcom/discord/primitives/ChannelId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->channelRtcRegion:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->channelRtcRegion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->ackChannelIds:Ljava/util/List;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->ackChannelIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->userId:Lcom/discord/primitives/UserId;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->userId:Lcom/discord/primitives/UserId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->userUsername:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->userUsername:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->userDiscriminator:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->userDiscriminator:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->userAvatar:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->userAvatar:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->userGuildAvatar:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->userGuildAvatar:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->relationshipType:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->relationshipType:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->guildId:Lcom/discord/primitives/GuildId;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->guildId:Lcom/discord/primitives/GuildId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->guildName:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->guildName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->guildIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->guildIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->activityType:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->activityType:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->activityName:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->activityName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->applicationId:Lcom/discord/primitives/ApplicationId;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->applicationId:Lcom/discord/primitives/ApplicationId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->applicationName:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->applicationName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->applicationIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->applicationIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->message:Lcom/discord/notifications/api/NotificationMessage;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->message:Lcom/discord/notifications/api/NotificationMessage;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->stageInstanceTopic:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->stageInstanceTopic:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->guildScheduledEventEntityType:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->guildScheduledEventEntityType:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-boolean v1, p0, Lcom/discord/notifications/api/NotificationData;->canReply:Z

    iget-boolean v3, p1, Lcom/discord/notifications/api/NotificationData;->canReply:Z

    if-eq v1, v3, :cond_25

    return v2

    :cond_25
    iget-boolean v1, p0, Lcom/discord/notifications/api/NotificationData;->isFromCurrentUser:Z

    iget-boolean v3, p1, Lcom/discord/notifications/api/NotificationData;->isFromCurrentUser:Z

    if-eq v1, v3, :cond_26

    return v2

    :cond_26
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    return v2

    :cond_28
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->notificationChannel:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->notificationChannel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    return v2

    :cond_2a
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->trackingType:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->trackingType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    return v2

    :cond_2b
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->deeplink:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->deeplink:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    return v2

    :cond_2c
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->expandSubtitle:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/notifications/api/NotificationData;->expandSubtitle:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    return v2

    :cond_2d
    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->imageAttachmentUrl:Ljava/lang/String;

    iget-object p1, p1, Lcom/discord/notifications/api/NotificationData;->imageAttachmentUrl:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2e

    return v2

    :cond_2e
    return v0
.end method

.method public final getAckChannelIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/primitives/ChannelId;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->ackChannelIds:Ljava/util/List;

    return-object v0
.end method

.method public final getActivityName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->activityName:Ljava/lang/String;

    return-object v0
.end method

.method public final getActivityType()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->activityType:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getApplicationIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->applicationIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getApplicationId-UtIrSio()Lcom/discord/primitives/ApplicationId;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->applicationId:Lcom/discord/primitives/ApplicationId;

    return-object v0
.end method

.method public final getApplicationName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->applicationName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCanReply()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/notifications/api/NotificationData;->canReply:Z

    return v0
.end method

.method public final getChannelIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->channelIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelId-qMVnFVQ()Lcom/discord/primitives/ChannelId;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->channelId:Lcom/discord/primitives/ChannelId;

    return-object v0
.end method

.method public final getChannelName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->channelName:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelRtcRegion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->channelRtcRegion:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelType()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->channelType:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getDeeplink()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->deeplink:Ljava/lang/String;

    return-object v0
.end method

.method public final getExpandSubtitle()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->expandSubtitle:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getGuildIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->guildIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->guildId:Lcom/discord/primitives/GuildId;

    return-object v0
.end method

.method public final getGuildName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->guildName:Ljava/lang/String;

    return-object v0
.end method

.method public final getGuildScheduledEventEntityType()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->guildScheduledEventEntityType:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageAttachmentUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->imageAttachmentUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getMessage()Lcom/discord/notifications/api/NotificationMessage;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->message:Lcom/discord/notifications/api/NotificationMessage;

    return-object v0
.end method

.method public final getMessageActivityType()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->messageActivityType:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMessageApplicationName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->messageApplicationName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMessageContent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->messageContent:Ljava/lang/String;

    return-object v0
.end method

.method public final getMessageFlags()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->messageFlags:Ljava/lang/Long;

    return-object v0
.end method

.method public final getMessageId-N_6c4I0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMessageType()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->messageType:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNotificationChannel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->notificationChannel:Ljava/lang/String;

    return-object v0
.end method

.method public final getParentId-qMVnFVQ()Lcom/discord/primitives/ChannelId;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->parentId:Lcom/discord/primitives/ChannelId;

    return-object v0
.end method

.method public final getParentName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->parentName:Ljava/lang/String;

    return-object v0
.end method

.method public final getRelationshipType()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->relationshipType:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getStageInstanceTopic()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->stageInstanceTopic:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackingType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->trackingType:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserAvatar()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->userAvatar:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserDiscriminator()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->userDiscriminator:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getUserGuildAvatar()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->userGuildAvatar:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserId-wUX8bhU()Lcom/discord/primitives/UserId;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->userId:Lcom/discord/primitives/UserId;

    return-object v0
.end method

.method public final getUserUsername()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->userUsername:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/discord/notifications/api/NotificationData;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->messageId:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->messageActivityType:Ljava/lang/Integer;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->messageApplicationName:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->messageType:Ljava/lang/Integer;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->messageContent:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->messageFlags:Ljava/lang/Long;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->channelType:Ljava/lang/Integer;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->channelName:Ljava/lang/String;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->channelId:Lcom/discord/primitives/ChannelId;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/discord/primitives/ChannelId;->hashCode-impl(J)I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->channelIcon:Ljava/lang/String;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->parentName:Ljava/lang/String;

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->parentId:Lcom/discord/primitives/ChannelId;

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/discord/primitives/ChannelId;->hashCode-impl(J)I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->channelRtcRegion:Ljava/lang/String;

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_c

    :cond_c
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->ackChannelIds:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->userId:Lcom/discord/primitives/UserId;

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_d

    :cond_d
    invoke-virtual {v1}, Lcom/discord/primitives/UserId;->unbox-impl()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/discord/primitives/UserId;->hashCode-impl(J)I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->userUsername:Ljava/lang/String;

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_e

    :cond_e
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->userDiscriminator:Ljava/lang/Integer;

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_f

    :cond_f
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->userAvatar:Ljava/lang/String;

    if-nez v1, :cond_10

    move v1, v2

    goto :goto_10

    :cond_10
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->userGuildAvatar:Ljava/lang/String;

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_11

    :cond_11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_11
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->relationshipType:Ljava/lang/Integer;

    if-nez v1, :cond_12

    move v1, v2

    goto :goto_12

    :cond_12
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_12
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->guildId:Lcom/discord/primitives/GuildId;

    if-nez v1, :cond_13

    move v1, v2

    goto :goto_13

    :cond_13
    invoke-virtual {v1}, Lcom/discord/primitives/GuildId;->unbox-impl()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/discord/primitives/GuildId;->hashCode-impl(J)I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->guildName:Ljava/lang/String;

    if-nez v1, :cond_14

    move v1, v2

    goto :goto_14

    :cond_14
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_14
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->guildIcon:Ljava/lang/String;

    if-nez v1, :cond_15

    move v1, v2

    goto :goto_15

    :cond_15
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->activityType:Ljava/lang/Integer;

    if-nez v1, :cond_16

    move v1, v2

    goto :goto_16

    :cond_16
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_16
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->activityName:Ljava/lang/String;

    if-nez v1, :cond_17

    move v1, v2

    goto :goto_17

    :cond_17
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_17
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->applicationId:Lcom/discord/primitives/ApplicationId;

    if-nez v1, :cond_18

    move v1, v2

    goto :goto_18

    :cond_18
    invoke-virtual {v1}, Lcom/discord/primitives/ApplicationId;->unbox-impl()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/discord/primitives/ApplicationId;->hashCode-impl(J)I

    move-result v1

    :goto_18
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->applicationName:Ljava/lang/String;

    if-nez v1, :cond_19

    move v1, v2

    goto :goto_19

    :cond_19
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_19
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->applicationIcon:Ljava/lang/String;

    if-nez v1, :cond_1a

    move v1, v2

    goto :goto_1a

    :cond_1a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->message:Lcom/discord/notifications/api/NotificationMessage;

    if-nez v1, :cond_1b

    move v1, v2

    goto :goto_1b

    :cond_1b
    invoke-virtual {v1}, Lcom/discord/notifications/api/NotificationMessage;->hashCode()I

    move-result v1

    :goto_1b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->stageInstanceTopic:Ljava/lang/String;

    if-nez v1, :cond_1c

    move v1, v2

    goto :goto_1c

    :cond_1c
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->guildScheduledEventEntityType:Ljava/lang/Integer;

    if-nez v1, :cond_1d

    move v1, v2

    goto :goto_1d

    :cond_1d
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/notifications/api/NotificationData;->canReply:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_1e

    move v1, v3

    :cond_1e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/notifications/api/NotificationData;->isFromCurrentUser:Z

    if-eqz v1, :cond_1f

    goto :goto_1e

    :cond_1f
    move v3, v1

    :goto_1e
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->title:Ljava/lang/String;

    if-nez v1, :cond_20

    move v1, v2

    goto :goto_1f

    :cond_20
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->subtitle:Ljava/lang/String;

    if-nez v1, :cond_21

    move v1, v2

    goto :goto_20

    :cond_21
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_20
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->iconUrl:Ljava/lang/String;

    if-nez v1, :cond_22

    move v1, v2

    goto :goto_21

    :cond_22
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_21
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->notificationChannel:Ljava/lang/String;

    if-nez v1, :cond_23

    move v1, v2

    goto :goto_22

    :cond_23
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_22
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->trackingType:Ljava/lang/String;

    if-nez v1, :cond_24

    move v1, v2

    goto :goto_23

    :cond_24
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_23
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->deeplink:Ljava/lang/String;

    if-nez v1, :cond_25

    move v1, v2

    goto :goto_24

    :cond_25
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_24
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->expandSubtitle:Ljava/lang/Boolean;

    if-nez v1, :cond_26

    move v1, v2

    goto :goto_25

    :cond_26
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_25
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/NotificationData;->imageAttachmentUrl:Ljava/lang/String;

    if-nez v1, :cond_27

    goto :goto_26

    :cond_27
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_26
    add-int/2addr v0, v2

    return v0
.end method

.method public final isFromCurrentUser()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/notifications/api/NotificationData;->isFromCurrentUser:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 44

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/discord/notifications/api/NotificationData;->type:Ljava/lang/String;

    iget-object v2, v0, Lcom/discord/notifications/api/NotificationData;->messageId:Ljava/lang/String;

    if-nez v2, :cond_0

    const-string v2, "null"

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_0
    iget-object v3, v0, Lcom/discord/notifications/api/NotificationData;->messageActivityType:Ljava/lang/Integer;

    iget-object v4, v0, Lcom/discord/notifications/api/NotificationData;->messageApplicationName:Ljava/lang/String;

    iget-object v5, v0, Lcom/discord/notifications/api/NotificationData;->messageType:Ljava/lang/Integer;

    iget-object v6, v0, Lcom/discord/notifications/api/NotificationData;->messageContent:Ljava/lang/String;

    iget-object v7, v0, Lcom/discord/notifications/api/NotificationData;->messageFlags:Ljava/lang/Long;

    iget-object v8, v0, Lcom/discord/notifications/api/NotificationData;->channelType:Ljava/lang/Integer;

    iget-object v9, v0, Lcom/discord/notifications/api/NotificationData;->channelName:Ljava/lang/String;

    iget-object v10, v0, Lcom/discord/notifications/api/NotificationData;->channelId:Lcom/discord/primitives/ChannelId;

    iget-object v11, v0, Lcom/discord/notifications/api/NotificationData;->channelIcon:Ljava/lang/String;

    iget-object v12, v0, Lcom/discord/notifications/api/NotificationData;->parentName:Ljava/lang/String;

    iget-object v13, v0, Lcom/discord/notifications/api/NotificationData;->parentId:Lcom/discord/primitives/ChannelId;

    iget-object v14, v0, Lcom/discord/notifications/api/NotificationData;->channelRtcRegion:Ljava/lang/String;

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->ackChannelIds:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->userId:Lcom/discord/primitives/UserId;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->userUsername:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->userDiscriminator:Ljava/lang/Integer;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->userAvatar:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->userGuildAvatar:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->relationshipType:Ljava/lang/Integer;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->guildId:Lcom/discord/primitives/GuildId;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->guildName:Ljava/lang/String;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->guildIcon:Ljava/lang/String;

    move-object/from16 v25, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->activityType:Ljava/lang/Integer;

    move-object/from16 v26, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->activityName:Ljava/lang/String;

    move-object/from16 v27, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->applicationId:Lcom/discord/primitives/ApplicationId;

    move-object/from16 v28, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->applicationName:Ljava/lang/String;

    move-object/from16 v29, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->applicationIcon:Ljava/lang/String;

    move-object/from16 v30, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->message:Lcom/discord/notifications/api/NotificationMessage;

    move-object/from16 v31, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->stageInstanceTopic:Ljava/lang/String;

    move-object/from16 v32, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->guildScheduledEventEntityType:Ljava/lang/Integer;

    move-object/from16 v33, v15

    iget-boolean v15, v0, Lcom/discord/notifications/api/NotificationData;->canReply:Z

    move/from16 v34, v15

    iget-boolean v15, v0, Lcom/discord/notifications/api/NotificationData;->isFromCurrentUser:Z

    move/from16 v35, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->title:Ljava/lang/String;

    move-object/from16 v36, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->subtitle:Ljava/lang/String;

    move-object/from16 v37, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->iconUrl:Ljava/lang/String;

    move-object/from16 v38, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->notificationChannel:Ljava/lang/String;

    move-object/from16 v39, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->trackingType:Ljava/lang/String;

    move-object/from16 v40, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->deeplink:Ljava/lang/String;

    move-object/from16 v41, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->expandSubtitle:Ljava/lang/Boolean;

    move-object/from16 v42, v15

    iget-object v15, v0, Lcom/discord/notifications/api/NotificationData;->imageAttachmentUrl:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v43, v15

    const-string v15, "NotificationData(type="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", messageId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", messageActivityType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", messageApplicationName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", messageType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", messageContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", messageFlags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channelType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channelName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", channelId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channelIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", parentName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", parentId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channelRtcRegion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ackChannelIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", userUsername="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", userDiscriminator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", userAvatar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", userGuildAvatar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", relationshipType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", guildId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", guildName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", guildIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", activityType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activityName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", applicationId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", applicationName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", applicationIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stageInstanceTopic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", guildScheduledEventEntityType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", canReply="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isFromCurrentUser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", subtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", iconUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v38

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", notificationChannel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", trackingType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deeplink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v41

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expandSubtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v42

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", imageAttachmentUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v43

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
