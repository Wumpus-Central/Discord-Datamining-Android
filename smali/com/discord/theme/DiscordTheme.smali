.class public abstract Lcom/discord/theme/DiscordTheme;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0003\u0008\u00de\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u00dd\u0002\u001a\u00020\u00042\t\u0008\u0001\u0010\u00de\u0002\u001a\u00020\u00042\t\u0008\u0001\u0010\u00df\u0002\u001a\u00020\u0004H\'J\u001f\u0010\u00e0\u0002\u001a\u00020\u00042\t\u0008\u0001\u0010\u00e1\u0002\u001a\u00020\u00042\t\u0008\u0001\u0010\u00e2\u0002\u001a\u00020\u0004H\'R\u0014\u0010\u0003\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\u0006R\u0014\u0010\'\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00080\u0010\u0006R\u0014\u00101\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00082\u0010\u0006R\u0014\u00103\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00084\u0010\u0006R\u0014\u00105\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u0010\u0006R\u0014\u00107\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00088\u0010\u0006R\u0014\u00109\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008:\u0010\u0006R\u0014\u0010;\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008<\u0010\u0006R\u0014\u0010=\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008>\u0010\u0006R\u0014\u0010?\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010\u0006R\u0014\u0010A\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010\u0006R\u0014\u0010C\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010\u0006R\u0014\u0010E\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010\u0006R\u0014\u0010G\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008H\u0010\u0006R\u0014\u0010I\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008J\u0010\u0006R\u0014\u0010K\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010\u0006R\u0014\u0010M\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008N\u0010\u0006R\u0014\u0010O\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008P\u0010\u0006R\u0014\u0010Q\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008R\u0010\u0006R\u0014\u0010S\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008T\u0010\u0006R\u0014\u0010U\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008V\u0010\u0006R\u0014\u0010W\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008X\u0010\u0006R\u0014\u0010Y\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008Z\u0010\u0006R\u0014\u0010[\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\\\u0010\u0006R\u0014\u0010]\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008^\u0010\u0006R\u0014\u0010_\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008`\u0010\u0006R\u0014\u0010a\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008b\u0010\u0006R\u0014\u0010c\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008d\u0010\u0006R\u0014\u0010e\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008f\u0010\u0006R\u0014\u0010g\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008h\u0010\u0006R\u0014\u0010i\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008j\u0010\u0006R\u0014\u0010k\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008l\u0010\u0006R\u0014\u0010m\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008n\u0010\u0006R\u0014\u0010o\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008p\u0010\u0006R\u0014\u0010q\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008r\u0010\u0006R\u0014\u0010s\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008t\u0010\u0006R\u0014\u0010u\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008v\u0010\u0006R\u0014\u0010w\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008x\u0010\u0006R\u0014\u0010y\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008z\u0010\u0006R\u0014\u0010{\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008|\u0010\u0006R\u0014\u0010}\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008~\u0010\u0006R\u0015\u0010\u007f\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0080\u0001\u0010\u0006R\u0016\u0010\u0081\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0082\u0001\u0010\u0006R\u0016\u0010\u0083\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0084\u0001\u0010\u0006R\u0016\u0010\u0085\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0086\u0001\u0010\u0006R\u0016\u0010\u0087\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0088\u0001\u0010\u0006R\u0016\u0010\u0089\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u008a\u0001\u0010\u0006R\u0016\u0010\u008b\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u008c\u0001\u0010\u0006R\u0016\u0010\u008d\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u008e\u0001\u0010\u0006R\u0016\u0010\u008f\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0090\u0001\u0010\u0006R\u0016\u0010\u0091\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0092\u0001\u0010\u0006R\u0016\u0010\u0093\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0094\u0001\u0010\u0006R\u0016\u0010\u0095\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0096\u0001\u0010\u0006R\u0016\u0010\u0097\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0098\u0001\u0010\u0006R\u0016\u0010\u0099\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u009a\u0001\u0010\u0006R\u0016\u0010\u009b\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u009c\u0001\u0010\u0006R\u0016\u0010\u009d\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u009e\u0001\u0010\u0006R\u0016\u0010\u009f\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00a0\u0001\u0010\u0006R\u0016\u0010\u00a1\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00a2\u0001\u0010\u0006R\u0016\u0010\u00a3\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00a4\u0001\u0010\u0006R\u0016\u0010\u00a5\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00a6\u0001\u0010\u0006R\u0016\u0010\u00a7\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00a8\u0001\u0010\u0006R\u0016\u0010\u00a9\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00aa\u0001\u0010\u0006R\u0016\u0010\u00ab\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00ac\u0001\u0010\u0006R\u0016\u0010\u00ad\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00ae\u0001\u0010\u0006R\u0016\u0010\u00af\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00b0\u0001\u0010\u0006R\u0016\u0010\u00b1\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00b2\u0001\u0010\u0006R\u0016\u0010\u00b3\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00b4\u0001\u0010\u0006R\u0016\u0010\u00b5\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00b6\u0001\u0010\u0006R\u0016\u0010\u00b7\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00b8\u0001\u0010\u0006R\u0016\u0010\u00b9\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00ba\u0001\u0010\u0006R\u0016\u0010\u00bb\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00bc\u0001\u0010\u0006R\u0016\u0010\u00bd\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00be\u0001\u0010\u0006R\u0016\u0010\u00bf\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00c0\u0001\u0010\u0006R\u0016\u0010\u00c1\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00c2\u0001\u0010\u0006R\u0016\u0010\u00c3\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00c4\u0001\u0010\u0006R\u0016\u0010\u00c5\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00c6\u0001\u0010\u0006R\u0016\u0010\u00c7\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00c8\u0001\u0010\u0006R\u0016\u0010\u00c9\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00ca\u0001\u0010\u0006R\u0016\u0010\u00cb\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00cc\u0001\u0010\u0006R\u0016\u0010\u00cd\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00ce\u0001\u0010\u0006R\u0016\u0010\u00cf\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00d0\u0001\u0010\u0006R\u0016\u0010\u00d1\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00d2\u0001\u0010\u0006R\u0016\u0010\u00d3\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00d4\u0001\u0010\u0006R\u0016\u0010\u00d5\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00d6\u0001\u0010\u0006R\u0016\u0010\u00d7\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00d8\u0001\u0010\u0006R\u0016\u0010\u00d9\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00da\u0001\u0010\u0006R\u0016\u0010\u00db\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00dc\u0001\u0010\u0006R\u0016\u0010\u00dd\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00de\u0001\u0010\u0006R\u0016\u0010\u00df\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00e0\u0001\u0010\u0006R\u0016\u0010\u00e1\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00e2\u0001\u0010\u0006R\u0016\u0010\u00e3\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00e4\u0001\u0010\u0006R\u0016\u0010\u00e5\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00e6\u0001\u0010\u0006R\u0016\u0010\u00e7\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00e8\u0001\u0010\u0006R\u0016\u0010\u00e9\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00ea\u0001\u0010\u0006R\u0016\u0010\u00eb\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00ec\u0001\u0010\u0006R\u0016\u0010\u00ed\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00ee\u0001\u0010\u0006R\u0016\u0010\u00ef\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00f0\u0001\u0010\u0006R\u0016\u0010\u00f1\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00f2\u0001\u0010\u0006R\u0016\u0010\u00f3\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00f4\u0001\u0010\u0006R\u0016\u0010\u00f5\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00f6\u0001\u0010\u0006R\u0016\u0010\u00f7\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00f8\u0001\u0010\u0006R\u0016\u0010\u00f9\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00fa\u0001\u0010\u0006R\u0016\u0010\u00fb\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00fc\u0001\u0010\u0006R\u0016\u0010\u00fd\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00fe\u0001\u0010\u0006R\u0016\u0010\u00ff\u0001\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0080\u0002\u0010\u0006R\u0016\u0010\u0081\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0082\u0002\u0010\u0006R\u0016\u0010\u0083\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0084\u0002\u0010\u0006R\u0016\u0010\u0085\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0086\u0002\u0010\u0006R\u0016\u0010\u0087\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0088\u0002\u0010\u0006R\u0016\u0010\u0089\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u008a\u0002\u0010\u0006R\u0016\u0010\u008b\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u008c\u0002\u0010\u0006R\u0016\u0010\u008d\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u008e\u0002\u0010\u0006R\u0016\u0010\u008f\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0090\u0002\u0010\u0006R\u0016\u0010\u0091\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0092\u0002\u0010\u0006R\u0016\u0010\u0093\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0094\u0002\u0010\u0006R\u0016\u0010\u0095\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0096\u0002\u0010\u0006R\u0016\u0010\u0097\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0098\u0002\u0010\u0006R\u0016\u0010\u0099\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u009a\u0002\u0010\u0006R\u0016\u0010\u009b\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u009c\u0002\u0010\u0006R\u0016\u0010\u009d\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u009e\u0002\u0010\u0006R\u0016\u0010\u009f\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00a0\u0002\u0010\u0006R\u0016\u0010\u00a1\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00a2\u0002\u0010\u0006R\u0016\u0010\u00a3\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00a4\u0002\u0010\u0006R\u0016\u0010\u00a5\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00a6\u0002\u0010\u0006R\u0016\u0010\u00a7\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00a8\u0002\u0010\u0006R\u0016\u0010\u00a9\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00aa\u0002\u0010\u0006R\u0016\u0010\u00ab\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00ac\u0002\u0010\u0006R\u0016\u0010\u00ad\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00ae\u0002\u0010\u0006R\u0016\u0010\u00af\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00b0\u0002\u0010\u0006R\u0016\u0010\u00b1\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00b2\u0002\u0010\u0006R\u0016\u0010\u00b3\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00b4\u0002\u0010\u0006R\u0016\u0010\u00b5\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00b6\u0002\u0010\u0006R\u0016\u0010\u00b7\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00b8\u0002\u0010\u0006R\u0016\u0010\u00b9\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00ba\u0002\u0010\u0006R\u0016\u0010\u00bb\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00bc\u0002\u0010\u0006R\u0016\u0010\u00bd\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00be\u0002\u0010\u0006R\u0016\u0010\u00bf\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00c0\u0002\u0010\u0006R\u0016\u0010\u00c1\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00c2\u0002\u0010\u0006R\u0016\u0010\u00c3\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00c4\u0002\u0010\u0006R\u0016\u0010\u00c5\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00c6\u0002\u0010\u0006R\u0016\u0010\u00c7\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00c8\u0002\u0010\u0006R\u0016\u0010\u00c9\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00ca\u0002\u0010\u0006R\u0016\u0010\u00cb\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00cc\u0002\u0010\u0006R\u0016\u0010\u00cd\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00ce\u0002\u0010\u0006R\u0016\u0010\u00cf\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00d0\u0002\u0010\u0006R\u0016\u0010\u00d1\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00d2\u0002\u0010\u0006R\u0016\u0010\u00d3\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00d4\u0002\u0010\u0006R\u0016\u0010\u00d5\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00d6\u0002\u0010\u0006R\u0016\u0010\u00d7\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00d8\u0002\u0010\u0006R\u0016\u0010\u00d9\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00da\u0002\u0010\u0006R\u0016\u0010\u00db\u0002\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00dc\u0002\u0010\u0006\u0082\u0001\u0004\u00e3\u0002\u00e4\u0002\u00a8\u0006\u00e5\u0002"
    }
    d2 = {
        "Lcom/discord/theme/DiscordTheme;",
        "",
        "()V",
        "activityCardBackground",
        "",
        "getActivityCardBackground",
        "()I",
        "androidNavigationBarBackground",
        "getAndroidNavigationBarBackground",
        "androidNavigationScrimBackground",
        "getAndroidNavigationScrimBackground",
        "androidRipple",
        "getAndroidRipple",
        "backgroundAccent",
        "getBackgroundAccent",
        "backgroundFloating",
        "getBackgroundFloating",
        "backgroundMentioned",
        "getBackgroundMentioned",
        "backgroundMentionedHover",
        "getBackgroundMentionedHover",
        "backgroundMessageAutomod",
        "getBackgroundMessageAutomod",
        "backgroundMessageAutomodHover",
        "getBackgroundMessageAutomodHover",
        "backgroundMessageHighlight",
        "getBackgroundMessageHighlight",
        "backgroundMessageHighlightHover",
        "getBackgroundMessageHighlightHover",
        "backgroundMessageHover",
        "getBackgroundMessageHover",
        "backgroundMobilePrimary",
        "getBackgroundMobilePrimary",
        "backgroundMobileSecondary",
        "getBackgroundMobileSecondary",
        "backgroundModifierAccent",
        "getBackgroundModifierAccent",
        "backgroundModifierActive",
        "getBackgroundModifierActive",
        "backgroundModifierHover",
        "getBackgroundModifierHover",
        "backgroundModifierSelected",
        "getBackgroundModifierSelected",
        "backgroundNestedFloating",
        "getBackgroundNestedFloating",
        "backgroundPrimary",
        "getBackgroundPrimary",
        "backgroundSecondary",
        "getBackgroundSecondary",
        "backgroundSecondaryAlt",
        "getBackgroundSecondaryAlt",
        "backgroundTertiary",
        "getBackgroundTertiary",
        "black",
        "getBlack",
        "bugReporterModalSubmittingBackground",
        "getBugReporterModalSubmittingBackground",
        "buttonDangerBackground",
        "getButtonDangerBackground",
        "buttonDangerBackgroundActive",
        "getButtonDangerBackgroundActive",
        "buttonDangerBackgroundDisabled",
        "getButtonDangerBackgroundDisabled",
        "buttonDangerBackgroundHover",
        "getButtonDangerBackgroundHover",
        "buttonOutlineBrandBackground",
        "getButtonOutlineBrandBackground",
        "buttonOutlineBrandBackgroundActive",
        "getButtonOutlineBrandBackgroundActive",
        "buttonOutlineBrandBackgroundHover",
        "getButtonOutlineBrandBackgroundHover",
        "buttonOutlineBrandBorder",
        "getButtonOutlineBrandBorder",
        "buttonOutlineBrandBorderActive",
        "getButtonOutlineBrandBorderActive",
        "buttonOutlineBrandBorderHover",
        "getButtonOutlineBrandBorderHover",
        "buttonOutlineBrandText",
        "getButtonOutlineBrandText",
        "buttonOutlineBrandTextActive",
        "getButtonOutlineBrandTextActive",
        "buttonOutlineBrandTextHover",
        "getButtonOutlineBrandTextHover",
        "buttonOutlineDangerBackground",
        "getButtonOutlineDangerBackground",
        "buttonOutlineDangerBackgroundActive",
        "getButtonOutlineDangerBackgroundActive",
        "buttonOutlineDangerBackgroundHover",
        "getButtonOutlineDangerBackgroundHover",
        "buttonOutlineDangerBorder",
        "getButtonOutlineDangerBorder",
        "buttonOutlineDangerBorderActive",
        "getButtonOutlineDangerBorderActive",
        "buttonOutlineDangerBorderHover",
        "getButtonOutlineDangerBorderHover",
        "buttonOutlineDangerText",
        "getButtonOutlineDangerText",
        "buttonOutlineDangerTextActive",
        "getButtonOutlineDangerTextActive",
        "buttonOutlineDangerTextHover",
        "getButtonOutlineDangerTextHover",
        "buttonOutlinePositiveBackground",
        "getButtonOutlinePositiveBackground",
        "buttonOutlinePositiveBackgroundActive",
        "getButtonOutlinePositiveBackgroundActive",
        "buttonOutlinePositiveBackgroundHover",
        "getButtonOutlinePositiveBackgroundHover",
        "buttonOutlinePositiveBorder",
        "getButtonOutlinePositiveBorder",
        "buttonOutlinePositiveBorderActive",
        "getButtonOutlinePositiveBorderActive",
        "buttonOutlinePositiveBorderHover",
        "getButtonOutlinePositiveBorderHover",
        "buttonOutlinePositiveText",
        "getButtonOutlinePositiveText",
        "buttonOutlinePositiveTextActive",
        "getButtonOutlinePositiveTextActive",
        "buttonOutlinePositiveTextHover",
        "getButtonOutlinePositiveTextHover",
        "buttonOutlinePrimaryBackground",
        "getButtonOutlinePrimaryBackground",
        "buttonOutlinePrimaryBackgroundActive",
        "getButtonOutlinePrimaryBackgroundActive",
        "buttonOutlinePrimaryBackgroundHover",
        "getButtonOutlinePrimaryBackgroundHover",
        "buttonOutlinePrimaryBorder",
        "getButtonOutlinePrimaryBorder",
        "buttonOutlinePrimaryBorderActive",
        "getButtonOutlinePrimaryBorderActive",
        "buttonOutlinePrimaryBorderHover",
        "getButtonOutlinePrimaryBorderHover",
        "buttonOutlinePrimaryText",
        "getButtonOutlinePrimaryText",
        "buttonOutlinePrimaryTextActive",
        "getButtonOutlinePrimaryTextActive",
        "buttonOutlinePrimaryTextHover",
        "getButtonOutlinePrimaryTextHover",
        "buttonPositiveBackground",
        "getButtonPositiveBackground",
        "buttonPositiveBackgroundActive",
        "getButtonPositiveBackgroundActive",
        "buttonPositiveBackgroundDisabled",
        "getButtonPositiveBackgroundDisabled",
        "buttonPositiveBackgroundHover",
        "getButtonPositiveBackgroundHover",
        "buttonSecondaryBackground",
        "getButtonSecondaryBackground",
        "buttonSecondaryBackgroundActive",
        "getButtonSecondaryBackgroundActive",
        "buttonSecondaryBackgroundDisabled",
        "getButtonSecondaryBackgroundDisabled",
        "buttonSecondaryBackgroundHover",
        "getButtonSecondaryBackgroundHover",
        "channelIcon",
        "getChannelIcon",
        "channelTextAreaPlaceholder",
        "getChannelTextAreaPlaceholder",
        "channelsDefault",
        "getChannelsDefault",
        "channeltextareaBackground",
        "getChanneltextareaBackground",
        "chatBackground",
        "getChatBackground",
        "chatBorder",
        "getChatBorder",
        "chatInputContainerBackground",
        "getChatInputContainerBackground",
        "controlBrandForeground",
        "getControlBrandForeground",
        "controlBrandForegroundNew",
        "getControlBrandForegroundNew",
        "deprecatedCardBg",
        "getDeprecatedCardBg",
        "deprecatedCardEditableBg",
        "getDeprecatedCardEditableBg",
        "deprecatedQuickswitcherInputBackground",
        "getDeprecatedQuickswitcherInputBackground",
        "deprecatedQuickswitcherInputPlaceholder",
        "getDeprecatedQuickswitcherInputPlaceholder",
        "deprecatedStoreBg",
        "getDeprecatedStoreBg",
        "deprecatedTextInputBg",
        "getDeprecatedTextInputBg",
        "deprecatedTextInputBorder",
        "getDeprecatedTextInputBorder",
        "deprecatedTextInputBorderDisabled",
        "getDeprecatedTextInputBorderDisabled",
        "deprecatedTextInputBorderHover",
        "getDeprecatedTextInputBorderHover",
        "deprecatedTextInputPrefix",
        "getDeprecatedTextInputPrefix",
        "displayBannerOverflowBackground",
        "getDisplayBannerOverflowBackground",
        "focusPrimary",
        "getFocusPrimary",
        "forumPostExtraMediaCountContainerBackground",
        "getForumPostExtraMediaCountContainerBackground",
        "forumPostTagBackground",
        "getForumPostTagBackground",
        "headerPrimary",
        "getHeaderPrimary",
        "headerSecondary",
        "getHeaderSecondary",
        "homeBackground",
        "getHomeBackground",
        "homeCardRestingBorder",
        "getHomeCardRestingBorder",
        "infoBoxBackground",
        "getInfoBoxBackground",
        "infoDangerBackground",
        "getInfoDangerBackground",
        "infoDangerForeground",
        "getInfoDangerForeground",
        "infoDangerText",
        "getInfoDangerText",
        "infoHelpBackground",
        "getInfoHelpBackground",
        "infoHelpForeground",
        "getInfoHelpForeground",
        "infoHelpText",
        "getInfoHelpText",
        "infoPositiveBackground",
        "getInfoPositiveBackground",
        "infoPositiveForeground",
        "getInfoPositiveForeground",
        "infoPositiveText",
        "getInfoPositiveText",
        "infoWarningBackground",
        "getInfoWarningBackground",
        "infoWarningForeground",
        "getInfoWarningForeground",
        "infoWarningText",
        "getInfoWarningText",
        "inputBackground",
        "getInputBackground",
        "inputPlaceholderText",
        "getInputPlaceholderText",
        "interactiveActive",
        "getInteractiveActive",
        "interactiveHover",
        "getInteractiveHover",
        "interactiveMuted",
        "getInteractiveMuted",
        "interactiveNormal",
        "getInteractiveNormal",
        "liveStageTileBorder",
        "getLiveStageTileBorder",
        "logoPrimary",
        "getLogoPrimary",
        "mentionBackground",
        "getMentionBackground",
        "mentionForeground",
        "getMentionForeground",
        "modalBackground",
        "getModalBackground",
        "modalFooterBackground",
        "getModalFooterBackground",
        "profileGradientMessageInputBorder",
        "getProfileGradientMessageInputBorder",
        "profileGradientNoteBackground",
        "getProfileGradientNoteBackground",
        "profileGradientOverlay",
        "getProfileGradientOverlay",
        "profileGradientOverlaySyncedWithUserTheme",
        "getProfileGradientOverlaySyncedWithUserTheme",
        "profileGradientProfileBodyBackgroundHover",
        "getProfileGradientProfileBodyBackgroundHover",
        "profileGradientRolePillBackground",
        "getProfileGradientRolePillBackground",
        "profileGradientRolePillBorder",
        "getProfileGradientRolePillBorder",
        "profileGradientSectionBox",
        "getProfileGradientSectionBox",
        "redesignButtonDangerBackground",
        "getRedesignButtonDangerBackground",
        "redesignButtonDangerPressedBackground",
        "getRedesignButtonDangerPressedBackground",
        "redesignButtonFloatingBackground",
        "getRedesignButtonFloatingBackground",
        "redesignButtonFloatingPressedBackground",
        "getRedesignButtonFloatingPressedBackground",
        "redesignButtonPositiveBackground",
        "getRedesignButtonPositiveBackground",
        "redesignButtonPositivePressedBackground",
        "getRedesignButtonPositivePressedBackground",
        "redesignButtonPrimaryBackground",
        "getRedesignButtonPrimaryBackground",
        "redesignButtonPrimaryPressedBackground",
        "getRedesignButtonPrimaryPressedBackground",
        "redesignButtonSecondaryBorder",
        "getRedesignButtonSecondaryBorder",
        "redesignButtonSecondaryPressedBackground",
        "getRedesignButtonSecondaryPressedBackground",
        "scrollbarAutoScrollbarColorThumb",
        "getScrollbarAutoScrollbarColorThumb",
        "scrollbarAutoScrollbarColorTrack",
        "getScrollbarAutoScrollbarColorTrack",
        "scrollbarAutoThumb",
        "getScrollbarAutoThumb",
        "scrollbarAutoTrack",
        "getScrollbarAutoTrack",
        "scrollbarThinThumb",
        "getScrollbarThinThumb",
        "scrollbarThinTrack",
        "getScrollbarThinTrack",
        "spoilerHiddenBackground",
        "getSpoilerHiddenBackground",
        "spoilerRevealedBackground",
        "getSpoilerRevealedBackground",
        "statusDanger",
        "getStatusDanger",
        "statusDangerBackground",
        "getStatusDangerBackground",
        "statusDangerText",
        "getStatusDangerText",
        "statusPositive",
        "getStatusPositive",
        "statusPositiveBackground",
        "getStatusPositiveBackground",
        "statusPositiveText",
        "getStatusPositiveText",
        "statusWarning",
        "getStatusWarning",
        "statusWarningBackground",
        "getStatusWarningBackground",
        "statusWarningText",
        "getStatusWarningText",
        "textBrand",
        "getTextBrand",
        "textDanger",
        "getTextDanger",
        "textLink",
        "getTextLink",
        "textLinkLowSaturation",
        "getTextLinkLowSaturation",
        "textMuted",
        "getTextMuted",
        "textNormal",
        "getTextNormal",
        "textPositive",
        "getTextPositive",
        "textWarning",
        "getTextWarning",
        "textboxMarkdownSyntax",
        "getTextboxMarkdownSyntax",
        "userProfileHeaderOverflowBackground",
        "getUserProfileHeaderOverflowBackground",
        "white",
        "getWhite",
        "getColor",
        "lightColor",
        "darkColor",
        "getColorRes",
        "lightColorRes",
        "darkColorRes",
        "Lcom/discord/theme/DarkTheme;",
        "Lcom/discord/theme/LightTheme;",
        "theme_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/theme/DiscordTheme;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getActivityCardBackground()I
.end method

.method public abstract getAndroidNavigationBarBackground()I
.end method

.method public abstract getAndroidNavigationScrimBackground()I
.end method

.method public abstract getAndroidRipple()I
.end method

.method public abstract getBackgroundAccent()I
.end method

.method public abstract getBackgroundFloating()I
.end method

.method public abstract getBackgroundMentioned()I
.end method

.method public abstract getBackgroundMentionedHover()I
.end method

.method public abstract getBackgroundMessageAutomod()I
.end method

.method public abstract getBackgroundMessageAutomodHover()I
.end method

.method public abstract getBackgroundMessageHighlight()I
.end method

.method public abstract getBackgroundMessageHighlightHover()I
.end method

.method public abstract getBackgroundMessageHover()I
.end method

.method public abstract getBackgroundMobilePrimary()I
.end method

.method public abstract getBackgroundMobileSecondary()I
.end method

.method public abstract getBackgroundModifierAccent()I
.end method

.method public abstract getBackgroundModifierActive()I
.end method

.method public abstract getBackgroundModifierHover()I
.end method

.method public abstract getBackgroundModifierSelected()I
.end method

.method public abstract getBackgroundNestedFloating()I
.end method

.method public abstract getBackgroundPrimary()I
.end method

.method public abstract getBackgroundSecondary()I
.end method

.method public abstract getBackgroundSecondaryAlt()I
.end method

.method public abstract getBackgroundTertiary()I
.end method

.method public abstract getBlack()I
.end method

.method public abstract getBugReporterModalSubmittingBackground()I
.end method

.method public abstract getButtonDangerBackground()I
.end method

.method public abstract getButtonDangerBackgroundActive()I
.end method

.method public abstract getButtonDangerBackgroundDisabled()I
.end method

.method public abstract getButtonDangerBackgroundHover()I
.end method

.method public abstract getButtonOutlineBrandBackground()I
.end method

.method public abstract getButtonOutlineBrandBackgroundActive()I
.end method

.method public abstract getButtonOutlineBrandBackgroundHover()I
.end method

.method public abstract getButtonOutlineBrandBorder()I
.end method

.method public abstract getButtonOutlineBrandBorderActive()I
.end method

.method public abstract getButtonOutlineBrandBorderHover()I
.end method

.method public abstract getButtonOutlineBrandText()I
.end method

.method public abstract getButtonOutlineBrandTextActive()I
.end method

.method public abstract getButtonOutlineBrandTextHover()I
.end method

.method public abstract getButtonOutlineDangerBackground()I
.end method

.method public abstract getButtonOutlineDangerBackgroundActive()I
.end method

.method public abstract getButtonOutlineDangerBackgroundHover()I
.end method

.method public abstract getButtonOutlineDangerBorder()I
.end method

.method public abstract getButtonOutlineDangerBorderActive()I
.end method

.method public abstract getButtonOutlineDangerBorderHover()I
.end method

.method public abstract getButtonOutlineDangerText()I
.end method

.method public abstract getButtonOutlineDangerTextActive()I
.end method

.method public abstract getButtonOutlineDangerTextHover()I
.end method

.method public abstract getButtonOutlinePositiveBackground()I
.end method

.method public abstract getButtonOutlinePositiveBackgroundActive()I
.end method

.method public abstract getButtonOutlinePositiveBackgroundHover()I
.end method

.method public abstract getButtonOutlinePositiveBorder()I
.end method

.method public abstract getButtonOutlinePositiveBorderActive()I
.end method

.method public abstract getButtonOutlinePositiveBorderHover()I
.end method

.method public abstract getButtonOutlinePositiveText()I
.end method

.method public abstract getButtonOutlinePositiveTextActive()I
.end method

.method public abstract getButtonOutlinePositiveTextHover()I
.end method

.method public abstract getButtonOutlinePrimaryBackground()I
.end method

.method public abstract getButtonOutlinePrimaryBackgroundActive()I
.end method

.method public abstract getButtonOutlinePrimaryBackgroundHover()I
.end method

.method public abstract getButtonOutlinePrimaryBorder()I
.end method

.method public abstract getButtonOutlinePrimaryBorderActive()I
.end method

.method public abstract getButtonOutlinePrimaryBorderHover()I
.end method

.method public abstract getButtonOutlinePrimaryText()I
.end method

.method public abstract getButtonOutlinePrimaryTextActive()I
.end method

.method public abstract getButtonOutlinePrimaryTextHover()I
.end method

.method public abstract getButtonPositiveBackground()I
.end method

.method public abstract getButtonPositiveBackgroundActive()I
.end method

.method public abstract getButtonPositiveBackgroundDisabled()I
.end method

.method public abstract getButtonPositiveBackgroundHover()I
.end method

.method public abstract getButtonSecondaryBackground()I
.end method

.method public abstract getButtonSecondaryBackgroundActive()I
.end method

.method public abstract getButtonSecondaryBackgroundDisabled()I
.end method

.method public abstract getButtonSecondaryBackgroundHover()I
.end method

.method public abstract getChannelIcon()I
.end method

.method public abstract getChannelTextAreaPlaceholder()I
.end method

.method public abstract getChannelsDefault()I
.end method

.method public abstract getChanneltextareaBackground()I
.end method

.method public abstract getChatBackground()I
.end method

.method public abstract getChatBorder()I
.end method

.method public abstract getChatInputContainerBackground()I
.end method

.method public abstract getColor(II)I
.end method

.method public abstract getColorRes(II)I
.end method

.method public abstract getControlBrandForeground()I
.end method

.method public abstract getControlBrandForegroundNew()I
.end method

.method public abstract getDeprecatedCardBg()I
.end method

.method public abstract getDeprecatedCardEditableBg()I
.end method

.method public abstract getDeprecatedQuickswitcherInputBackground()I
.end method

.method public abstract getDeprecatedQuickswitcherInputPlaceholder()I
.end method

.method public abstract getDeprecatedStoreBg()I
.end method

.method public abstract getDeprecatedTextInputBg()I
.end method

.method public abstract getDeprecatedTextInputBorder()I
.end method

.method public abstract getDeprecatedTextInputBorderDisabled()I
.end method

.method public abstract getDeprecatedTextInputBorderHover()I
.end method

.method public abstract getDeprecatedTextInputPrefix()I
.end method

.method public abstract getDisplayBannerOverflowBackground()I
.end method

.method public abstract getFocusPrimary()I
.end method

.method public abstract getForumPostExtraMediaCountContainerBackground()I
.end method

.method public abstract getForumPostTagBackground()I
.end method

.method public abstract getHeaderPrimary()I
.end method

.method public abstract getHeaderSecondary()I
.end method

.method public abstract getHomeBackground()I
.end method

.method public abstract getHomeCardRestingBorder()I
.end method

.method public abstract getInfoBoxBackground()I
.end method

.method public abstract getInfoDangerBackground()I
.end method

.method public abstract getInfoDangerForeground()I
.end method

.method public abstract getInfoDangerText()I
.end method

.method public abstract getInfoHelpBackground()I
.end method

.method public abstract getInfoHelpForeground()I
.end method

.method public abstract getInfoHelpText()I
.end method

.method public abstract getInfoPositiveBackground()I
.end method

.method public abstract getInfoPositiveForeground()I
.end method

.method public abstract getInfoPositiveText()I
.end method

.method public abstract getInfoWarningBackground()I
.end method

.method public abstract getInfoWarningForeground()I
.end method

.method public abstract getInfoWarningText()I
.end method

.method public abstract getInputBackground()I
.end method

.method public abstract getInputPlaceholderText()I
.end method

.method public abstract getInteractiveActive()I
.end method

.method public abstract getInteractiveHover()I
.end method

.method public abstract getInteractiveMuted()I
.end method

.method public abstract getInteractiveNormal()I
.end method

.method public abstract getLiveStageTileBorder()I
.end method

.method public abstract getLogoPrimary()I
.end method

.method public abstract getMentionBackground()I
.end method

.method public abstract getMentionForeground()I
.end method

.method public abstract getModalBackground()I
.end method

.method public abstract getModalFooterBackground()I
.end method

.method public abstract getProfileGradientMessageInputBorder()I
.end method

.method public abstract getProfileGradientNoteBackground()I
.end method

.method public abstract getProfileGradientOverlay()I
.end method

.method public abstract getProfileGradientOverlaySyncedWithUserTheme()I
.end method

.method public abstract getProfileGradientProfileBodyBackgroundHover()I
.end method

.method public abstract getProfileGradientRolePillBackground()I
.end method

.method public abstract getProfileGradientRolePillBorder()I
.end method

.method public abstract getProfileGradientSectionBox()I
.end method

.method public abstract getRedesignButtonDangerBackground()I
.end method

.method public abstract getRedesignButtonDangerPressedBackground()I
.end method

.method public abstract getRedesignButtonFloatingBackground()I
.end method

.method public abstract getRedesignButtonFloatingPressedBackground()I
.end method

.method public abstract getRedesignButtonPositiveBackground()I
.end method

.method public abstract getRedesignButtonPositivePressedBackground()I
.end method

.method public abstract getRedesignButtonPrimaryBackground()I
.end method

.method public abstract getRedesignButtonPrimaryPressedBackground()I
.end method

.method public abstract getRedesignButtonSecondaryBorder()I
.end method

.method public abstract getRedesignButtonSecondaryPressedBackground()I
.end method

.method public abstract getScrollbarAutoScrollbarColorThumb()I
.end method

.method public abstract getScrollbarAutoScrollbarColorTrack()I
.end method

.method public abstract getScrollbarAutoThumb()I
.end method

.method public abstract getScrollbarAutoTrack()I
.end method

.method public abstract getScrollbarThinThumb()I
.end method

.method public abstract getScrollbarThinTrack()I
.end method

.method public abstract getSpoilerHiddenBackground()I
.end method

.method public abstract getSpoilerRevealedBackground()I
.end method

.method public abstract getStatusDanger()I
.end method

.method public abstract getStatusDangerBackground()I
.end method

.method public abstract getStatusDangerText()I
.end method

.method public abstract getStatusPositive()I
.end method

.method public abstract getStatusPositiveBackground()I
.end method

.method public abstract getStatusPositiveText()I
.end method

.method public abstract getStatusWarning()I
.end method

.method public abstract getStatusWarningBackground()I
.end method

.method public abstract getStatusWarningText()I
.end method

.method public abstract getTextBrand()I
.end method

.method public abstract getTextDanger()I
.end method

.method public abstract getTextLink()I
.end method

.method public abstract getTextLinkLowSaturation()I
.end method

.method public abstract getTextMuted()I
.end method

.method public abstract getTextNormal()I
.end method

.method public abstract getTextPositive()I
.end method

.method public abstract getTextWarning()I
.end method

.method public abstract getTextboxMarkdownSyntax()I
.end method

.method public abstract getUserProfileHeaderOverflowBackground()I
.end method

.method public abstract getWhite()I
.end method
