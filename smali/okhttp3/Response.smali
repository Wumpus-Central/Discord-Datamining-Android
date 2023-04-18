.class public final Lokhttp3/Response;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/Response$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001:\u0001[B}\u0008\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\"\u0012\u0008\u0010,\u001a\u0004\u0018\u00010\'\u0012\u0006\u00102\u001a\u00020-\u0012\u0008\u00108\u001a\u0004\u0018\u000103\u0012\u0008\u0010<\u001a\u0004\u0018\u00010\u0000\u0012\u0008\u0010?\u001a\u0004\u0018\u00010\u0000\u0012\u0008\u0010B\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010H\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020C\u0012\u0008\u0010O\u001a\u0004\u0018\u00010K\u00a2\u0006\u0004\u0008Y\u0010ZJ\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0006\u0010\u0007\u001a\u00020\u0006J\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008J\u0008\u0010\u000c\u001a\u00020\u000bH\u0016J\u0008\u0010\r\u001a\u00020\u0002H\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0007\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0007\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010!\u001a\u00020\u00028\u0007\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010&\u001a\u00020\"8\u0007\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008\u0012\u0010%R\u0019\u0010,\u001a\u0004\u0018\u00010\'8\u0007\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u0017\u00102\u001a\u00020-8\u0007\u00a2\u0006\u000c\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101R\u0019\u00108\u001a\u0004\u0018\u0001038\u0007\u00a2\u0006\u000c\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107R\u0019\u0010<\u001a\u0004\u0018\u00010\u00008\u0007\u00a2\u0006\u000c\n\u0004\u0008*\u00109\u001a\u0004\u0008:\u0010;R\u0019\u0010?\u001a\u0004\u0018\u00010\u00008\u0007\u00a2\u0006\u000c\n\u0004\u0008=\u00109\u001a\u0004\u0008>\u0010;R\u0019\u0010B\u001a\u0004\u0018\u00010\u00008\u0007\u00a2\u0006\u000c\n\u0004\u0008@\u00109\u001a\u0004\u0008A\u0010;R\u0017\u0010H\u001a\u00020C8\u0007\u00a2\u0006\u000c\n\u0004\u0008D\u0010E\u001a\u0004\u0008F\u0010GR\u0017\u0010J\u001a\u00020C8\u0007\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010E\u001a\u0004\u0008I\u0010GR\u001c\u0010O\u001a\u0004\u0018\u00010K8\u0001X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008L\u0010M\u001a\u0004\u0008(\u0010NR\u0011\u0010S\u001a\u00020P8F\u00a2\u0006\u0006\u001a\u0004\u0008Q\u0010RR\u0011\u0010U\u001a\u00020P8F\u00a2\u0006\u0006\u001a\u0004\u0008T\u0010RR\u0011\u0010X\u001a\u00020\u000e8G\u00a2\u0006\u0006\u001a\u0004\u0008V\u0010W\u00a8\u0006\\"
    }
    d2 = {
        "Lokhttp3/Response;",
        "Ljava/io/Closeable;",
        "",
        "name",
        "defaultValue",
        "w",
        "Lokhttp3/Response$a;",
        "T",
        "",
        "Loj/f;",
        "k",
        "",
        "close",
        "toString",
        "Lokhttp3/CacheControl;",
        "Lokhttp3/CacheControl;",
        "lazyCacheControl",
        "Lokhttp3/Request;",
        "l",
        "Lokhttp3/Request;",
        "k0",
        "()Lokhttp3/Request;",
        "request",
        "Loj/q;",
        "m",
        "Loj/q;",
        "h0",
        "()Loj/q;",
        "protocol",
        "n",
        "Ljava/lang/String;",
        "K",
        "()Ljava/lang/String;",
        "message",
        "",
        "o",
        "I",
        "()I",
        "code",
        "Loj/o;",
        "p",
        "Loj/o;",
        "s",
        "()Loj/o;",
        "handshake",
        "Lokhttp3/Headers;",
        "q",
        "Lokhttp3/Headers;",
        "y",
        "()Lokhttp3/Headers;",
        "headers",
        "Lokhttp3/ResponseBody;",
        "r",
        "Lokhttp3/ResponseBody;",
        "b",
        "()Lokhttp3/ResponseBody;",
        "body",
        "Lokhttp3/Response;",
        "Q",
        "()Lokhttp3/Response;",
        "networkResponse",
        "t",
        "i",
        "cacheResponse",
        "u",
        "g0",
        "priorResponse",
        "",
        "v",
        "J",
        "t0",
        "()J",
        "sentRequestAtMillis",
        "i0",
        "receivedResponseAtMillis",
        "Ltj/c;",
        "x",
        "Ltj/c;",
        "()Ltj/c;",
        "exchange",
        "",
        "o0",
        "()Z",
        "isSuccessful",
        "F",
        "isRedirect",
        "f",
        "()Lokhttp3/CacheControl;",
        "cacheControl",
        "<init>",
        "(Lokhttp3/Request;Loj/q;Ljava/lang/String;ILoj/o;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLtj/c;)V",
        "a",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field private k:Lokhttp3/CacheControl;

.field private final l:Lokhttp3/Request;

.field private final m:Loj/q;

.field private final n:Ljava/lang/String;

.field private final o:I

.field private final p:Loj/o;

.field private final q:Lokhttp3/Headers;

.field private final r:Lokhttp3/ResponseBody;

.field private final s:Lokhttp3/Response;

.field private final t:Lokhttp3/Response;

.field private final u:Lokhttp3/Response;

.field private final v:J

.field private final w:J

.field private final x:Ltj/c;


# direct methods
.method public constructor <init>(Lokhttp3/Request;Loj/q;Ljava/lang/String;ILoj/o;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLtj/c;)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    const-string v5, "request"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "protocol"

    invoke-static {p2, v5}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "message"

    invoke-static {p3, v5}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "headers"

    invoke-static {p6, v5}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lokhttp3/Response;->l:Lokhttp3/Request;

    iput-object v2, v0, Lokhttp3/Response;->m:Loj/q;

    iput-object v3, v0, Lokhttp3/Response;->n:Ljava/lang/String;

    move v1, p4

    iput v1, v0, Lokhttp3/Response;->o:I

    move-object v1, p5

    iput-object v1, v0, Lokhttp3/Response;->p:Loj/o;

    iput-object v4, v0, Lokhttp3/Response;->q:Lokhttp3/Headers;

    move-object v1, p7

    iput-object v1, v0, Lokhttp3/Response;->r:Lokhttp3/ResponseBody;

    move-object v1, p8

    iput-object v1, v0, Lokhttp3/Response;->s:Lokhttp3/Response;

    move-object v1, p9

    iput-object v1, v0, Lokhttp3/Response;->t:Lokhttp3/Response;

    move-object/from16 v1, p10

    iput-object v1, v0, Lokhttp3/Response;->u:Lokhttp3/Response;

    move-wide/from16 v1, p11

    iput-wide v1, v0, Lokhttp3/Response;->v:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, Lokhttp3/Response;->w:J

    move-object/from16 v1, p15

    iput-object v1, v0, Lokhttp3/Response;->x:Ltj/c;

    return-void
.end method

.method public static synthetic x(Lokhttp3/Response;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lokhttp3/Response;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final F()Z
    .locals 2

    iget v0, p0, Lokhttp3/Response;->o:I

    const/16 v1, 0x133

    if-eq v0, v1, :cond_0

    const/16 v1, 0x134

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    :pswitch_0
    const/4 v0, 0x1

    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lokhttp3/Response;->n:Ljava/lang/String;

    return-object v0
.end method

.method public final Q()Lokhttp3/Response;
    .locals 1

    iget-object v0, p0, Lokhttp3/Response;->s:Lokhttp3/Response;

    return-object v0
.end method

.method public final T()Lokhttp3/Response$a;
    .locals 1

    new-instance v0, Lokhttp3/Response$a;

    invoke-direct {v0, p0}, Lokhttp3/Response$a;-><init>(Lokhttp3/Response;)V

    return-object v0
.end method

.method public final b()Lokhttp3/ResponseBody;
    .locals 1

    iget-object v0, p0, Lokhttp3/Response;->r:Lokhttp3/ResponseBody;

    return-object v0
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Lokhttp3/Response;->r:Lokhttp3/ResponseBody;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f()Lokhttp3/CacheControl;
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/Response;->k:Lokhttp3/CacheControl;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lokhttp3/CacheControl;->p:Lokhttp3/CacheControl$b;

    .line 6
    .line 7
    iget-object v1, p0, Lokhttp3/Response;->q:Lokhttp3/Headers;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lokhttp3/CacheControl$b;->b(Lokhttp3/Headers;)Lokhttp3/CacheControl;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lokhttp3/Response;->k:Lokhttp3/CacheControl;

    .line 14
    .line 15
    :cond_0
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final g0()Lokhttp3/Response;
    .locals 1

    iget-object v0, p0, Lokhttp3/Response;->u:Lokhttp3/Response;

    return-object v0
.end method

.method public final h0()Loj/q;
    .locals 1

    iget-object v0, p0, Lokhttp3/Response;->m:Loj/q;

    return-object v0
.end method

.method public final i()Lokhttp3/Response;
    .locals 1

    iget-object v0, p0, Lokhttp3/Response;->t:Lokhttp3/Response;

    return-object v0
.end method

.method public final i0()J
    .locals 2

    iget-wide v0, p0, Lokhttp3/Response;->w:J

    return-wide v0
.end method

.method public final k()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Loj/f;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lokhttp3/Response;->q:Lokhttp3/Headers;

    .line 2
    .line 3
    iget v1, p0, Lokhttp3/Response;->o:I

    .line 4
    .line 5
    const/16 v2, 0x191

    .line 6
    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    const/16 v2, 0x197

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    const-string v1, "Proxy-Authenticate"

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string v1, "WWW-Authenticate"

    .line 22
    .line 23
    :goto_0
    invoke-static {v0, v1}, Luj/e;->a(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public final k0()Lokhttp3/Request;
    .locals 1

    iget-object v0, p0, Lokhttp3/Response;->l:Lokhttp3/Request;

    return-object v0
.end method

.method public final l()I
    .locals 1

    iget v0, p0, Lokhttp3/Response;->o:I

    return v0
.end method

.method public final o0()Z
    .locals 2

    iget v0, p0, Lokhttp3/Response;->o:I

    const/16 v1, 0xc8

    if-le v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x12b

    if-lt v1, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final p()Ltj/c;
    .locals 1

    iget-object v0, p0, Lokhttp3/Response;->x:Ltj/c;

    return-object v0
.end method

.method public final s()Loj/o;
    .locals 1

    iget-object v0, p0, Lokhttp3/Response;->p:Loj/o;

    return-object v0
.end method

.method public final t0()J
    .locals 2

    iget-wide v0, p0, Lokhttp3/Response;->v:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response{protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lokhttp3/Response;->m:Loj/q;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lokhttp3/Response;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lokhttp3/Response;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lokhttp3/Response;->l:Lokhttp3/Request;

    invoke-virtual {v1}, Lokhttp3/Request;->l()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lokhttp3/Response;->x(Lokhttp3/Response;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/Response;->q:Lokhttp3/Headers;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    move-object p2, p1

    .line 15
    :cond_0
    return-object p2
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public final y()Lokhttp3/Headers;
    .locals 1

    iget-object v0, p0, Lokhttp3/Response;->q:Lokhttp3/Headers;

    return-object v0
.end method
