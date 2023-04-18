.class public Lkotlinx/coroutines/flow/l;
.super Lti/a;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/MutableSharedFlow;
.implements Lkotlinx/coroutines/flow/Flow;
.implements Lti/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/flow/l$a;,
        Lkotlinx/coroutines/flow/l$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lti/a<",
        "Lkotlinx/coroutines/flow/n;",
        ">;",
        "Lkotlinx/coroutines/flow/MutableSharedFlow<",
        "TT;>;",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lti/k<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\u0008\u0010\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u0008\u0012\u0004\u0012\u00028\u00000\u00052\u0008\u0012\u0004\u0012\u00028\u00000\u0006:\u0001EB\u001f\u0012\u0006\u0010H\u001a\u00020\u0015\u0012\u0006\u0010J\u001a\u00020\u0015\u0012\u0006\u0010C\u001a\u00020B\u00a2\u0006\u0004\u0008`\u0010aJ\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0008\u0010\r\u001a\u00020\u000cH\u0002J\u0010\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\u000c2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002J9\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00132\u0010\u0010\u0014\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00028\u0000H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J(\u0010#\u001a\u00020\u000c2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0002J\u0008\u0010$\u001a\u00020\u000cH\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020\u0003H\u0002J\u0010\u0010\'\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0003H\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010\u00052\u0006\u0010(\u001a\u00020\u000eH\u0002J\u001b\u0010*\u001a\u00020\u000c2\u0006\u0010%\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008*\u0010+J3\u0010.\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010,0\u00132\u0014\u0010-\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010,0\u0013H\u0002\u00a2\u0006\u0004\u0008.\u0010/J!\u00103\u001a\u0002022\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00028\u000000H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u00083\u00104J\u0017\u00105\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u00085\u0010\nJ\u001b\u00106\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u00086\u0010\u001bJ\u000f\u0010\u0001\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0001\u00107J%\u00109\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010,0\u00132\u0006\u00108\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u00089\u0010:J\u0008\u0010;\u001a\u00020\u0003H\u0014J\u001f\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00132\u0006\u0010<\u001a\u00020\u0015H\u0014\u00a2\u0006\u0004\u0008=\u0010>J&\u0010E\u001a\u0008\u0012\u0004\u0012\u00028\u00000D2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u00152\u0006\u0010C\u001a\u00020BH\u0016R\u0014\u0010H\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0014\u0010J\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010GR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR \u0010O\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0016\u0010R\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u0016\u0010T\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008S\u0010QR\u0016\u0010U\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010GR\u0016\u0010V\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010GR\u0014\u0010X\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008W\u00107R\u0014\u0010Z\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008Q\u0010YR\u0014\u0010\\\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008[\u0010YR\u0014\u0010^\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008]\u00107R\u0014\u0010_\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008G\u00107\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006b"
    }
    d2 = {
        "Lkotlinx/coroutines/flow/l;",
        "T",
        "Lti/a;",
        "Lkotlinx/coroutines/flow/n;",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "",
        "Lti/k;",
        "value",
        "",
        "N",
        "(Ljava/lang/Object;)Z",
        "O",
        "",
        "A",
        "",
        "newHead",
        "x",
        "item",
        "D",
        "",
        "curBuffer",
        "",
        "curSize",
        "newSize",
        "L",
        "([Ljava/lang/Object;II)[Ljava/lang/Object;",
        "C",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/l$a;",
        "emitter",
        "u",
        "newReplayIndex",
        "newMinCollectorIndex",
        "newBufferEndIndex",
        "newQueueEndIndex",
        "R",
        "v",
        "slot",
        "Q",
        "P",
        "index",
        "H",
        "t",
        "(Lkotlinx/coroutines/flow/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lkotlin/coroutines/Continuation;",
        "resumesIn",
        "E",
        "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;",
        "Lkotlinx/coroutines/flow/FlowCollector;",
        "collector",
        "",
        "collect",
        "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "M",
        "emit",
        "()J",
        "oldIndex",
        "S",
        "(J)[Lkotlin/coroutines/Continuation;",
        "y",
        "size",
        "z",
        "(I)[Lkotlinx/coroutines/flow/n;",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "capacity",
        "Lsi/e;",
        "onBufferOverflow",
        "Lkotlinx/coroutines/flow/Flow;",
        "a",
        "n",
        "I",
        "replay",
        "o",
        "bufferCapacity",
        "p",
        "Lsi/e;",
        "q",
        "[Ljava/lang/Object;",
        "buffer",
        "r",
        "J",
        "replayIndex",
        "s",
        "minCollectorIndex",
        "bufferSize",
        "queueSize",
        "G",
        "head",
        "()I",
        "replaySize",
        "K",
        "totalSize",
        "F",
        "bufferEndIndex",
        "queueEndIndex",
        "<init>",
        "(IILsi/e;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field private final n:I

.field private final o:I

.field private final p:Lsi/e;

.field private q:[Ljava/lang/Object;

.field private r:J

.field private s:J

.field private t:I

.field private u:I


# direct methods
.method public constructor <init>(IILsi/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lti/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lkotlinx/coroutines/flow/l;->n:I

    .line 5
    .line 6
    iput p2, p0, Lkotlinx/coroutines/flow/l;->o:I

    .line 7
    .line 8
    iput-object p3, p0, Lkotlinx/coroutines/flow/l;->p:Lsi/e;

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method private final A()V
    .locals 4

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/flow/l;->q:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->G()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v0, v1, v2, v3}, Lkotlinx/coroutines/flow/m;->c([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget v0, p0, Lkotlinx/coroutines/flow/l;->t:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    iput v0, p0, Lkotlinx/coroutines/flow/l;->t:I

    .line 19
    .line 20
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->G()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    const-wide/16 v2, 0x1

    .line 25
    .line 26
    add-long/2addr v0, v2

    .line 27
    iget-wide v2, p0, Lkotlinx/coroutines/flow/l;->r:J

    .line 28
    .line 29
    cmp-long v2, v2, v0

    .line 30
    .line 31
    if-gez v2, :cond_0

    .line 32
    .line 33
    iput-wide v0, p0, Lkotlinx/coroutines/flow/l;->r:J

    .line 34
    .line 35
    :cond_0
    iget-wide v2, p0, Lkotlinx/coroutines/flow/l;->s:J

    .line 36
    .line 37
    cmp-long v2, v2, v0

    .line 38
    .line 39
    if-gez v2, :cond_1

    .line 40
    .line 41
    invoke-direct {p0, v0, v1}, Lkotlinx/coroutines/flow/l;->x(J)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
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

.method static synthetic B(Lkotlinx/coroutines/flow/l;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/flow/l;->M(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2}, Lkotlinx/coroutines/flow/l;->C(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-ne p0, p1, :cond_1

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0
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
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method private final C(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v6, Lkotlinx/coroutines/p;

    .line 2
    .line 3
    invoke-static {p2}, Lrf/b;->c(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v7, 0x1

    .line 8
    invoke-direct {v6, v0, v7}, Lkotlinx/coroutines/p;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v6}, Lkotlinx/coroutines/p;->C()V

    .line 12
    .line 13
    .line 14
    sget-object v8, Lti/b;->a:[Lkotlin/coroutines/Continuation;

    .line 15
    .line 16
    monitor-enter p0

    .line 17
    :try_start_0
    invoke-static {p0, p1}, Lkotlinx/coroutines/flow/l;->r(Lkotlinx/coroutines/flow/l;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    sget-object p1, Llf/s;->l:Llf/s$a;

    .line 24
    .line 25
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    invoke-static {p1}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {v6, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0, v8}, Lkotlinx/coroutines/flow/l;->l(Lkotlinx/coroutines/flow/l;[Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 v0, 0x0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v9, Lkotlinx/coroutines/flow/l$a;

    .line 41
    .line 42
    invoke-static {p0}, Lkotlinx/coroutines/flow/l;->n(Lkotlinx/coroutines/flow/l;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    invoke-static {p0}, Lkotlinx/coroutines/flow/l;->p(Lkotlinx/coroutines/flow/l;)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    int-to-long v2, v2

    .line 51
    add-long/2addr v2, v0

    .line 52
    move-object v0, v9

    .line 53
    move-object v1, p0

    .line 54
    move-object v4, p1

    .line 55
    move-object v5, v6

    .line 56
    invoke-direct/range {v0 .. v5}, Lkotlinx/coroutines/flow/l$a;-><init>(Lkotlinx/coroutines/flow/l;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v9}, Lkotlinx/coroutines/flow/l;->k(Lkotlinx/coroutines/flow/l;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0}, Lkotlinx/coroutines/flow/l;->o(Lkotlinx/coroutines/flow/l;)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    add-int/2addr p1, v7

    .line 67
    invoke-static {p0, p1}, Lkotlinx/coroutines/flow/l;->q(Lkotlinx/coroutines/flow/l;I)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0}, Lkotlinx/coroutines/flow/l;->m(Lkotlinx/coroutines/flow/l;)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_1

    .line 75
    .line 76
    invoke-static {p0, v8}, Lkotlinx/coroutines/flow/l;->l(Lkotlinx/coroutines/flow/l;[Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;

    .line 77
    .line 78
    .line 79
    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    :cond_1
    move-object p1, v8

    .line 81
    move-object v0, v9

    .line 82
    :goto_0
    monitor-exit p0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    invoke-static {v6, v0}, Lkotlinx/coroutines/r;->a(Lkotlinx/coroutines/CancellableContinuation;Lkotlinx/coroutines/a1;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    array-length v0, p1

    .line 89
    const/4 v1, 0x0

    .line 90
    :goto_1
    if-ge v1, v0, :cond_4

    .line 91
    .line 92
    aget-object v2, p1, v1

    .line 93
    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    sget-object v3, Llf/s;->l:Llf/s$a;

    .line 97
    .line 98
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    invoke-static {v3}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-interface {v2, v3}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    invoke-virtual {v6}, Lkotlinx/coroutines/p;->x()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-ne p1, v0, :cond_5

    .line 119
    .line 120
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/g;->c(Lkotlin/coroutines/Continuation;)V

    .line 121
    .line 122
    .line 123
    :cond_5
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    if-ne p1, p2, :cond_6

    .line 128
    .line 129
    return-object p1

    .line 130
    :cond_6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p1

    .line 133
    :catchall_0
    move-exception p1

    .line 134
    monitor-exit p0

    .line 135
    throw p1
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method private final D(Ljava/lang/Object;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->K()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lkotlinx/coroutines/flow/l;->q:[Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {p0, v1, v3, v2}, Lkotlinx/coroutines/flow/l;->L([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    array-length v3, v1

    .line 18
    if-lt v0, v3, :cond_1

    .line 19
    .line 20
    array-length v3, v1

    .line 21
    mul-int/2addr v3, v2

    .line 22
    invoke-direct {p0, v1, v0, v3}, Lkotlinx/coroutines/flow/l;->L([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :cond_1
    :goto_0
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->G()J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    int-to-long v4, v0

    .line 31
    add-long/2addr v2, v4

    .line 32
    invoke-static {v1, v2, v3, p1}, Lkotlinx/coroutines/flow/m;->c([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
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
.end method

.method private final E([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;)[",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    array-length v0, p1

    .line 2
    invoke-static {p0}, Lti/a;->b(Lti/a;)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_3

    .line 7
    .line 8
    invoke-static {p0}, Lti/a;->c(Lti/a;)[Lti/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    array-length v2, v1

    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v2, :cond_3

    .line 17
    .line 18
    aget-object v4, v1, v3

    .line 19
    .line 20
    if-eqz v4, :cond_2

    .line 21
    .line 22
    check-cast v4, Lkotlinx/coroutines/flow/n;

    .line 23
    .line 24
    iget-object v5, v4, Lkotlinx/coroutines/flow/n;->b:Lkotlin/coroutines/Continuation;

    .line 25
    .line 26
    if-nez v5, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-direct {p0, v4}, Lkotlinx/coroutines/flow/l;->P(Lkotlinx/coroutines/flow/n;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    const-wide/16 v8, 0x0

    .line 34
    .line 35
    cmp-long v6, v6, v8

    .line 36
    .line 37
    if-ltz v6, :cond_2

    .line 38
    .line 39
    array-length v6, p1

    .line 40
    if-lt v0, v6, :cond_1

    .line 41
    .line 42
    array-length v6, p1

    .line 43
    const/4 v7, 0x2

    .line 44
    mul-int/2addr v6, v7

    .line 45
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v6, "copyOf(this, newSize)"

    .line 54
    .line 55
    invoke-static {p1, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    move-object v6, p1

    .line 59
    check-cast v6, [Lkotlin/coroutines/Continuation;

    .line 60
    .line 61
    add-int/lit8 v7, v0, 0x1

    .line 62
    .line 63
    aput-object v5, v6, v0

    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    iput-object v0, v4, Lkotlinx/coroutines/flow/n;->b:Lkotlin/coroutines/Continuation;

    .line 67
    .line 68
    move v0, v7

    .line 69
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    check-cast p1, [Lkotlin/coroutines/Continuation;

    .line 73
    .line 74
    return-object p1
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
.end method

.method private final F()J
    .locals 4

    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->G()J

    move-result-wide v0

    iget v2, p0, Lkotlinx/coroutines/flow/l;->t:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private final G()J
    .locals 4

    iget-wide v0, p0, Lkotlinx/coroutines/flow/l;->s:J

    iget-wide v2, p0, Lkotlinx/coroutines/flow/l;->r:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method private final H(J)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/flow/l;->q:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p1, p2}, Lkotlinx/coroutines/flow/m;->b([Ljava/lang/Object;J)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    instance-of p2, p1, Lkotlinx/coroutines/flow/l$a;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    check-cast p1, Lkotlinx/coroutines/flow/l$a;

    .line 15
    .line 16
    iget-object p1, p1, Lkotlinx/coroutines/flow/l$a;->m:Ljava/lang/Object;

    .line 17
    .line 18
    :cond_0
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private final I()J
    .locals 4

    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->G()J

    move-result-wide v0

    iget v2, p0, Lkotlinx/coroutines/flow/l;->t:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget v2, p0, Lkotlinx/coroutines/flow/l;->u:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private final J()I
    .locals 4

    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->G()J

    move-result-wide v0

    iget v2, p0, Lkotlinx/coroutines/flow/l;->t:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-wide v2, p0, Lkotlinx/coroutines/flow/l;->r:J

    sub-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private final K()I
    .locals 2

    iget v0, p0, Lkotlinx/coroutines/flow/l;->t:I

    iget v1, p0, Lkotlinx/coroutines/flow/l;->u:I

    add-int/2addr v0, v1

    return v0
.end method

.method private final L([Ljava/lang/Object;II)[Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p3, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    if-eqz v1, :cond_3

    .line 8
    .line 9
    new-array p3, p3, [Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lkotlinx/coroutines/flow/l;->q:[Ljava/lang/Object;

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    return-object p3

    .line 16
    :cond_1
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->G()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    :goto_1
    if-ge v0, p2, :cond_2

    .line 21
    .line 22
    int-to-long v3, v0

    .line 23
    add-long/2addr v3, v1

    .line 24
    invoke-static {p1, v3, v4}, Lkotlinx/coroutines/flow/m;->b([Ljava/lang/Object;J)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-static {p3, v3, v4, v5}, Lkotlinx/coroutines/flow/m;->c([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    return-object p3

    .line 35
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string p2, "Buffer size overflow"

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1
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
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method private final N(Ljava/lang/Object;)Z
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lti/a;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lkotlinx/coroutines/flow/l;->O(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    iget v0, p0, Lkotlinx/coroutines/flow/l;->t:I

    .line 13
    .line 14
    iget v1, p0, Lkotlinx/coroutines/flow/l;->o:I

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-lt v0, v1, :cond_3

    .line 18
    .line 19
    iget-wide v0, p0, Lkotlinx/coroutines/flow/l;->s:J

    .line 20
    .line 21
    iget-wide v3, p0, Lkotlinx/coroutines/flow/l;->r:J

    .line 22
    .line 23
    cmp-long v0, v0, v3

    .line 24
    .line 25
    if-gtz v0, :cond_3

    .line 26
    .line 27
    iget-object v0, p0, Lkotlinx/coroutines/flow/l;->p:Lsi/e;

    .line 28
    .line 29
    sget-object v1, Lkotlinx/coroutines/flow/l$b;->a:[I

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    aget v0, v1, v0

    .line 36
    .line 37
    if-eq v0, v2, :cond_2

    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    if-eq v0, v1, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return v2

    .line 44
    :cond_2
    const/4 p1, 0x0

    .line 45
    return p1

    .line 46
    :cond_3
    :goto_0
    invoke-direct {p0, p1}, Lkotlinx/coroutines/flow/l;->D(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget p1, p0, Lkotlinx/coroutines/flow/l;->t:I

    .line 50
    .line 51
    add-int/2addr p1, v2

    .line 52
    iput p1, p0, Lkotlinx/coroutines/flow/l;->t:I

    .line 53
    .line 54
    iget v0, p0, Lkotlinx/coroutines/flow/l;->o:I

    .line 55
    .line 56
    if-le p1, v0, :cond_4

    .line 57
    .line 58
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->A()V

    .line 59
    .line 60
    .line 61
    :cond_4
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->J()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    iget v0, p0, Lkotlinx/coroutines/flow/l;->n:I

    .line 66
    .line 67
    if-le p1, v0, :cond_5

    .line 68
    .line 69
    iget-wide v0, p0, Lkotlinx/coroutines/flow/l;->r:J

    .line 70
    .line 71
    const-wide/16 v3, 0x1

    .line 72
    .line 73
    add-long v6, v0, v3

    .line 74
    .line 75
    iget-wide v8, p0, Lkotlinx/coroutines/flow/l;->s:J

    .line 76
    .line 77
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->F()J

    .line 78
    .line 79
    .line 80
    move-result-wide v10

    .line 81
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->I()J

    .line 82
    .line 83
    .line 84
    move-result-wide v12

    .line 85
    move-object v5, p0

    .line 86
    invoke-direct/range {v5 .. v13}, Lkotlinx/coroutines/flow/l;->R(JJJJ)V

    .line 87
    .line 88
    .line 89
    :cond_5
    return v2
    .line 90
.end method

.method private final O(Ljava/lang/Object;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 1
    iget v0, p0, Lkotlinx/coroutines/flow/l;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-direct {p0, p1}, Lkotlinx/coroutines/flow/l;->D(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget p1, p0, Lkotlinx/coroutines/flow/l;->t:I

    .line 11
    .line 12
    add-int/2addr p1, v1

    .line 13
    iput p1, p0, Lkotlinx/coroutines/flow/l;->t:I

    .line 14
    .line 15
    iget v0, p0, Lkotlinx/coroutines/flow/l;->n:I

    .line 16
    .line 17
    if-le p1, v0, :cond_1

    .line 18
    .line 19
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->A()V

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->G()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    iget p1, p0, Lkotlinx/coroutines/flow/l;->t:I

    .line 27
    .line 28
    int-to-long v4, p1

    .line 29
    add-long/2addr v2, v4

    .line 30
    iput-wide v2, p0, Lkotlinx/coroutines/flow/l;->s:J

    .line 31
    .line 32
    return v1
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
.end method

.method private final P(Lkotlinx/coroutines/flow/n;)J
    .locals 6

    .line 1
    iget-wide v0, p1, Lkotlinx/coroutines/flow/n;->a:J

    .line 2
    .line 3
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->F()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    cmp-long p1, v0, v2

    .line 8
    .line 9
    if-gez p1, :cond_0

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    iget p1, p0, Lkotlinx/coroutines/flow/l;->o:I

    .line 13
    .line 14
    const-wide/16 v2, -0x1

    .line 15
    .line 16
    if-lez p1, :cond_1

    .line 17
    .line 18
    return-wide v2

    .line 19
    :cond_1
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->G()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    cmp-long p1, v0, v4

    .line 24
    .line 25
    if-lez p1, :cond_2

    .line 26
    .line 27
    return-wide v2

    .line 28
    :cond_2
    iget p1, p0, Lkotlinx/coroutines/flow/l;->u:I

    .line 29
    .line 30
    if-nez p1, :cond_3

    .line 31
    .line 32
    return-wide v2

    .line 33
    :cond_3
    return-wide v0
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
.end method

.method private final Q(Lkotlinx/coroutines/flow/n;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lti/b;->a:[Lkotlin/coroutines/Continuation;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-direct {p0, p1}, Lkotlinx/coroutines/flow/l;->P(Lkotlinx/coroutines/flow/n;)J

    .line 5
    .line 6
    .line 7
    move-result-wide v1

    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    cmp-long v3, v1, v3

    .line 11
    .line 12
    if-gez v3, :cond_0

    .line 13
    .line 14
    sget-object p1, Lkotlinx/coroutines/flow/m;->a:Lkotlinx/coroutines/internal/d0;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-wide v3, p1, Lkotlinx/coroutines/flow/n;->a:J

    .line 18
    .line 19
    invoke-direct {p0, v1, v2}, Lkotlinx/coroutines/flow/l;->H(J)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-wide/16 v5, 0x1

    .line 24
    .line 25
    add-long/2addr v1, v5

    .line 26
    iput-wide v1, p1, Lkotlinx/coroutines/flow/n;->a:J

    .line 27
    .line 28
    invoke-virtual {p0, v3, v4}, Lkotlinx/coroutines/flow/l;->S(J)[Lkotlin/coroutines/Continuation;

    .line 29
    .line 30
    .line 31
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    move-object v7, v0

    .line 33
    move-object v0, p1

    .line 34
    move-object p1, v7

    .line 35
    :goto_0
    monitor-exit p0

    .line 36
    array-length v1, v0

    .line 37
    const/4 v2, 0x0

    .line 38
    :goto_1
    if-ge v2, v1, :cond_2

    .line 39
    .line 40
    aget-object v3, v0, v2

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    sget-object v4, Llf/s;->l:Llf/s$a;

    .line 45
    .line 46
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    invoke-static {v4}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-interface {v3, v4}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    return-object p1

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    monitor-exit p0

    .line 61
    throw p1
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
.end method

.method private final R(JJJJ)V
    .locals 6

    .line 1
    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->G()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    :goto_0
    cmp-long v4, v2, v0

    .line 10
    .line 11
    if-gez v4, :cond_0

    .line 12
    .line 13
    iget-object v4, p0, Lkotlinx/coroutines/flow/l;->q:[Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v4}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-static {v4, v2, v3, v5}, Lkotlinx/coroutines/flow/m;->c([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const-wide/16 v4, 0x1

    .line 23
    .line 24
    add-long/2addr v2, v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iput-wide p1, p0, Lkotlinx/coroutines/flow/l;->r:J

    .line 27
    .line 28
    iput-wide p3, p0, Lkotlinx/coroutines/flow/l;->s:J

    .line 29
    .line 30
    sub-long p1, p5, v0

    .line 31
    .line 32
    long-to-int p1, p1

    .line 33
    iput p1, p0, Lkotlinx/coroutines/flow/l;->t:I

    .line 34
    .line 35
    sub-long/2addr p7, p5

    .line 36
    long-to-int p1, p7

    .line 37
    iput p1, p0, Lkotlinx/coroutines/flow/l;->u:I

    .line 38
    .line 39
    return-void
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
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public static final synthetic j(Lkotlinx/coroutines/flow/l;Lkotlinx/coroutines/flow/l$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lkotlinx/coroutines/flow/l;->u(Lkotlinx/coroutines/flow/l$a;)V

    return-void
.end method

.method public static final synthetic k(Lkotlinx/coroutines/flow/l;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lkotlinx/coroutines/flow/l;->D(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic l(Lkotlinx/coroutines/flow/l;[Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;
    .locals 0

    invoke-direct {p0, p1}, Lkotlinx/coroutines/flow/l;->E([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lkotlinx/coroutines/flow/l;)I
    .locals 0

    iget p0, p0, Lkotlinx/coroutines/flow/l;->o:I

    return p0
.end method

.method public static final synthetic n(Lkotlinx/coroutines/flow/l;)J
    .locals 2

    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->G()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic o(Lkotlinx/coroutines/flow/l;)I
    .locals 0

    iget p0, p0, Lkotlinx/coroutines/flow/l;->u:I

    return p0
.end method

.method public static final synthetic p(Lkotlinx/coroutines/flow/l;)I
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->K()I

    move-result p0

    return p0
.end method

.method public static final synthetic q(Lkotlinx/coroutines/flow/l;I)V
    .locals 0

    iput p1, p0, Lkotlinx/coroutines/flow/l;->u:I

    return-void
.end method

.method public static final synthetic r(Lkotlinx/coroutines/flow/l;Ljava/lang/Object;)Z
    .locals 0

    invoke-direct {p0, p1}, Lkotlinx/coroutines/flow/l;->N(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic s(Lkotlinx/coroutines/flow/l;Lkotlinx/coroutines/flow/n;)J
    .locals 0

    invoke-direct {p0, p1}, Lkotlinx/coroutines/flow/l;->P(Lkotlinx/coroutines/flow/n;)J

    move-result-wide p0

    return-wide p0
.end method

.method private final t(Lkotlinx/coroutines/flow/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/n;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlinx/coroutines/p;

    .line 2
    .line 3
    invoke-static {p2}, Lrf/b;->c(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/p;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lkotlinx/coroutines/p;->C()V

    .line 12
    .line 13
    .line 14
    monitor-enter p0

    .line 15
    :try_start_0
    invoke-static {p0, p1}, Lkotlinx/coroutines/flow/l;->s(Lkotlinx/coroutines/flow/l;Lkotlinx/coroutines/flow/n;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    cmp-long v1, v1, v3

    .line 22
    .line 23
    if-gez v1, :cond_0

    .line 24
    .line 25
    iput-object v0, p1, Lkotlinx/coroutines/flow/n;->b:Lkotlin/coroutines/Continuation;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p1, Llf/s;->l:Llf/s$a;

    .line 29
    .line 30
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    invoke-static {p1}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {v0, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    monitor-exit p0

    .line 42
    invoke-virtual {v0}, Lkotlinx/coroutines/p;->x()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-ne p1, v0, :cond_1

    .line 51
    .line 52
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/g;->c(Lkotlin/coroutines/Continuation;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    if-ne p1, p2, :cond_2

    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p1

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    monitor-exit p0

    .line 67
    throw p1
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
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method private final u(Lkotlinx/coroutines/flow/l$a;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p1, Lkotlinx/coroutines/flow/l$a;->l:J

    .line 3
    .line 4
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->G()J

    .line 5
    .line 6
    .line 7
    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-gez v0, :cond_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :cond_0
    :try_start_1
    iget-object v0, p0, Lkotlinx/coroutines/flow/l;->q:[Ljava/lang/Object;

    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-wide v1, p1, Lkotlinx/coroutines/flow/l$a;->l:J

    .line 20
    .line 21
    invoke-static {v0, v1, v2}, Lkotlinx/coroutines/flow/m;->b([Ljava/lang/Object;J)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    if-eq v1, p1, :cond_1

    .line 26
    .line 27
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :cond_1
    :try_start_2
    iget-wide v1, p1, Lkotlinx/coroutines/flow/l$a;->l:J

    .line 30
    .line 31
    sget-object p1, Lkotlinx/coroutines/flow/m;->a:Lkotlinx/coroutines/internal/d0;

    .line 32
    .line 33
    invoke-static {v0, v1, v2, p1}, Lkotlinx/coroutines/flow/m;->c([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->v()V

    .line 37
    .line 38
    .line 39
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    monitor-exit p0

    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    monitor-exit p0

    .line 45
    throw p1
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
.end method

.method private final v()V
    .locals 5

    .line 1
    iget v0, p0, Lkotlinx/coroutines/flow/l;->o:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lkotlinx/coroutines/flow/l;->u:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-gt v0, v1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/flow/l;->q:[Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget v1, p0, Lkotlinx/coroutines/flow/l;->u:I

    .line 17
    .line 18
    if-lez v1, :cond_1

    .line 19
    .line 20
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->G()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->K()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    int-to-long v3, v3

    .line 29
    add-long/2addr v1, v3

    .line 30
    const-wide/16 v3, 0x1

    .line 31
    .line 32
    sub-long/2addr v1, v3

    .line 33
    invoke-static {v0, v1, v2}, Lkotlinx/coroutines/flow/m;->b([Ljava/lang/Object;J)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sget-object v2, Lkotlinx/coroutines/flow/m;->a:Lkotlinx/coroutines/internal/d0;

    .line 38
    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    iget v1, p0, Lkotlinx/coroutines/flow/l;->u:I

    .line 42
    .line 43
    add-int/lit8 v1, v1, -0x1

    .line 44
    .line 45
    iput v1, p0, Lkotlinx/coroutines/flow/l;->u:I

    .line 46
    .line 47
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->G()J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    invoke-direct {p0}, Lkotlinx/coroutines/flow/l;->K()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    int-to-long v3, v3

    .line 56
    add-long/2addr v1, v3

    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-static {v0, v1, v2, v3}, Lkotlinx/coroutines/flow/m;->c([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    return-void
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

.method static synthetic w(Lkotlinx/coroutines/flow/l;Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lkotlinx/coroutines/flow/l$c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkotlinx/coroutines/flow/l$c;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/flow/l$c;->q:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lkotlinx/coroutines/flow/l$c;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/flow/l$c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lkotlinx/coroutines/flow/l$c;-><init>(Lkotlinx/coroutines/flow/l;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lkotlinx/coroutines/flow/l$c;->o:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lkotlinx/coroutines/flow/l$c;->q:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v5, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    iget-object p0, v0, Lkotlinx/coroutines/flow/l$c;->n:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Lkotlinx/coroutines/Job;

    .line 47
    .line 48
    iget-object p1, v0, Lkotlinx/coroutines/flow/l$c;->m:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lkotlinx/coroutines/flow/n;

    .line 51
    .line 52
    iget-object v2, v0, Lkotlinx/coroutines/flow/l$c;->l:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Lkotlinx/coroutines/flow/FlowCollector;

    .line 55
    .line 56
    iget-object v5, v0, Lkotlinx/coroutines/flow/l$c;->k:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v5, Lkotlinx/coroutines/flow/l;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p0

    .line 69
    :cond_2
    iget-object p0, v0, Lkotlinx/coroutines/flow/l$c;->n:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, Lkotlinx/coroutines/Job;

    .line 72
    .line 73
    iget-object p1, v0, Lkotlinx/coroutines/flow/l$c;->m:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Lkotlinx/coroutines/flow/n;

    .line 76
    .line 77
    iget-object v2, v0, Lkotlinx/coroutines/flow/l$c;->l:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, Lkotlinx/coroutines/flow/FlowCollector;

    .line 80
    .line 81
    iget-object v5, v0, Lkotlinx/coroutines/flow/l$c;->k:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v5, Lkotlinx/coroutines/flow/l;

    .line 84
    .line 85
    :goto_1
    :try_start_0
    invoke-static {p2}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    move-object p2, v2

    .line 89
    move-object v2, p0

    .line 90
    move-object p0, v5

    .line 91
    goto :goto_3

    .line 92
    :catchall_0
    move-exception p0

    .line 93
    goto/16 :goto_4

    .line 94
    .line 95
    :cond_3
    iget-object p0, v0, Lkotlinx/coroutines/flow/l$c;->m:Ljava/lang/Object;

    .line 96
    .line 97
    move-object p1, p0

    .line 98
    check-cast p1, Lkotlinx/coroutines/flow/n;

    .line 99
    .line 100
    iget-object p0, v0, Lkotlinx/coroutines/flow/l$c;->l:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p0, Lkotlinx/coroutines/flow/FlowCollector;

    .line 103
    .line 104
    iget-object v2, v0, Lkotlinx/coroutines/flow/l$c;->k:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v2, Lkotlinx/coroutines/flow/l;

    .line 107
    .line 108
    :try_start_1
    invoke-static {p2}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 109
    .line 110
    .line 111
    move-object p2, p0

    .line 112
    move-object p0, v2

    .line 113
    goto :goto_2

    .line 114
    :catchall_1
    move-exception p0

    .line 115
    move-object v5, v2

    .line 116
    goto/16 :goto_4

    .line 117
    .line 118
    :cond_4
    invoke-static {p2}, Llf/t;->b(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lti/a;->d()Lti/c;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    check-cast p2, Lkotlinx/coroutines/flow/n;

    .line 126
    .line 127
    :try_start_2
    instance-of v2, p1, Lkotlinx/coroutines/flow/s;

    .line 128
    .line 129
    if-eqz v2, :cond_5

    .line 130
    .line 131
    move-object v2, p1

    .line 132
    check-cast v2, Lkotlinx/coroutines/flow/s;

    .line 133
    .line 134
    iput-object p0, v0, Lkotlinx/coroutines/flow/l$c;->k:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object p1, v0, Lkotlinx/coroutines/flow/l$c;->l:Ljava/lang/Object;

    .line 137
    .line 138
    iput-object p2, v0, Lkotlinx/coroutines/flow/l$c;->m:Ljava/lang/Object;

    .line 139
    .line 140
    iput v5, v0, Lkotlinx/coroutines/flow/l$c;->q:I

    .line 141
    .line 142
    invoke-virtual {v2, v0}, Lkotlinx/coroutines/flow/s;->a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 146
    if-ne v2, v1, :cond_5

    .line 147
    .line 148
    return-object v1

    .line 149
    :cond_5
    move-object v7, p2

    .line 150
    move-object p2, p1

    .line 151
    move-object p1, v7

    .line 152
    :goto_2
    :try_start_3
    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    sget-object v5, Lkotlinx/coroutines/Job;->d:Lkotlinx/coroutines/Job$b;

    .line 157
    .line 158
    invoke-interface {v2, v5}, Lkotlin/coroutines/CoroutineContext;->f(Lkotlin/coroutines/CoroutineContext$c;)Lkotlin/coroutines/CoroutineContext$b;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    check-cast v2, Lkotlinx/coroutines/Job;

    .line 163
    .line 164
    :cond_6
    :goto_3
    invoke-direct {p0, p1}, Lkotlinx/coroutines/flow/l;->Q(Lkotlinx/coroutines/flow/n;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    sget-object v6, Lkotlinx/coroutines/flow/m;->a:Lkotlinx/coroutines/internal/d0;

    .line 169
    .line 170
    if-ne v5, v6, :cond_7

    .line 171
    .line 172
    iput-object p0, v0, Lkotlinx/coroutines/flow/l$c;->k:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object p2, v0, Lkotlinx/coroutines/flow/l$c;->l:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object p1, v0, Lkotlinx/coroutines/flow/l$c;->m:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v2, v0, Lkotlinx/coroutines/flow/l$c;->n:Ljava/lang/Object;

    .line 179
    .line 180
    iput v4, v0, Lkotlinx/coroutines/flow/l$c;->q:I

    .line 181
    .line 182
    invoke-direct {p0, p1, v0}, Lkotlinx/coroutines/flow/l;->t(Lkotlinx/coroutines/flow/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    if-ne v5, v1, :cond_6

    .line 187
    .line 188
    return-object v1

    .line 189
    :cond_7
    if-eqz v2, :cond_8

    .line 190
    .line 191
    invoke-static {v2}, Lkotlinx/coroutines/x1;->i(Lkotlinx/coroutines/Job;)V

    .line 192
    .line 193
    .line 194
    :cond_8
    iput-object p0, v0, Lkotlinx/coroutines/flow/l$c;->k:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object p2, v0, Lkotlinx/coroutines/flow/l$c;->l:Ljava/lang/Object;

    .line 197
    .line 198
    iput-object p1, v0, Lkotlinx/coroutines/flow/l$c;->m:Ljava/lang/Object;

    .line 199
    .line 200
    iput-object v2, v0, Lkotlinx/coroutines/flow/l$c;->n:Ljava/lang/Object;

    .line 201
    .line 202
    iput v3, v0, Lkotlinx/coroutines/flow/l$c;->q:I

    .line 203
    .line 204
    invoke-interface {p2, v5, v0}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 208
    if-ne v5, v1, :cond_6

    .line 209
    .line 210
    return-object v1

    .line 211
    :catchall_2
    move-exception p2

    .line 212
    move-object v5, p0

    .line 213
    move-object p0, p2

    .line 214
    goto :goto_4

    .line 215
    :catchall_3
    move-exception p1

    .line 216
    move-object v5, p0

    .line 217
    move-object p0, p1

    .line 218
    move-object p1, p2

    .line 219
    :goto_4
    invoke-virtual {v5, p1}, Lti/a;->g(Lti/c;)V

    .line 220
    .line 221
    .line 222
    throw p0
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method

.method private final x(J)V
    .locals 8

    .line 1
    invoke-static {p0}, Lti/a;->b(Lti/a;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Lti/a;->c(Lti/a;)[Lti/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    array-length v1, v0

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_1

    .line 16
    .line 17
    aget-object v3, v0, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    check-cast v3, Lkotlinx/coroutines/flow/n;

    .line 22
    .line 23
    iget-wide v4, v3, Lkotlinx/coroutines/flow/n;->a:J

    .line 24
    .line 25
    const-wide/16 v6, 0x0

    .line 26
    .line 27
    cmp-long v6, v4, v6

    .line 28
    .line 29
    if-ltz v6, :cond_0

    .line 30
    .line 31
    cmp-long v4, v4, p1

    .line 32
    .line 33
    if-gez v4, :cond_0

    .line 34
    .line 35
    iput-wide p1, v3, Lkotlinx/coroutines/flow/n;->a:J

    .line 36
    .line 37
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iput-wide p1, p0, Lkotlinx/coroutines/flow/l;->s:J

    .line 41
    .line 42
    return-void
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
.end method


# virtual methods
.method public M(Ljava/lang/Object;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 1
    sget-object v0, Lti/b;->a:[Lkotlin/coroutines/Continuation;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-direct {p0, p1}, Lkotlinx/coroutines/flow/l;->N(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lkotlinx/coroutines/flow/l;->E([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 p1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move p1, v1

    .line 18
    :goto_0
    monitor-exit p0

    .line 19
    array-length v2, v0

    .line 20
    :goto_1
    if-ge v1, v2, :cond_2

    .line 21
    .line 22
    aget-object v3, v0, v1

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    sget-object v4, Llf/s;->l:Llf/s$a;

    .line 27
    .line 28
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    invoke-static {v4}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-interface {v3, v4}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    return p1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    monitor-exit p0

    .line 43
    throw p1
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
.end method

.method public final S(J)[Lkotlin/coroutines/Continuation;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)[",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    iget-wide v0, v9, Lkotlinx/coroutines/flow/l;->s:J

    .line 4
    .line 5
    cmp-long v0, p1, v0

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lti/b;->a:[Lkotlin/coroutines/Continuation;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-direct/range {p0 .. p0}, Lkotlinx/coroutines/flow/l;->G()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iget v2, v9, Lkotlinx/coroutines/flow/l;->t:I

    .line 17
    .line 18
    int-to-long v2, v2

    .line 19
    add-long/2addr v2, v0

    .line 20
    iget v4, v9, Lkotlinx/coroutines/flow/l;->o:I

    .line 21
    .line 22
    const-wide/16 v5, 0x1

    .line 23
    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    iget v4, v9, Lkotlinx/coroutines/flow/l;->u:I

    .line 27
    .line 28
    if-lez v4, :cond_1

    .line 29
    .line 30
    add-long/2addr v2, v5

    .line 31
    :cond_1
    invoke-static/range {p0 .. p0}, Lti/a;->b(Lti/a;)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_3

    .line 36
    .line 37
    invoke-static/range {p0 .. p0}, Lti/a;->c(Lti/a;)[Lti/c;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    array-length v7, v4

    .line 44
    const/4 v8, 0x0

    .line 45
    :goto_0
    if-ge v8, v7, :cond_3

    .line 46
    .line 47
    aget-object v11, v4, v8

    .line 48
    .line 49
    if-eqz v11, :cond_2

    .line 50
    .line 51
    check-cast v11, Lkotlinx/coroutines/flow/n;

    .line 52
    .line 53
    iget-wide v11, v11, Lkotlinx/coroutines/flow/n;->a:J

    .line 54
    .line 55
    const-wide/16 v13, 0x0

    .line 56
    .line 57
    cmp-long v13, v11, v13

    .line 58
    .line 59
    if-ltz v13, :cond_2

    .line 60
    .line 61
    cmp-long v13, v11, v2

    .line 62
    .line 63
    if-gez v13, :cond_2

    .line 64
    .line 65
    move-wide v2, v11

    .line 66
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    iget-wide v7, v9, Lkotlinx/coroutines/flow/l;->s:J

    .line 70
    .line 71
    cmp-long v4, v2, v7

    .line 72
    .line 73
    if-gtz v4, :cond_4

    .line 74
    .line 75
    sget-object v0, Lti/b;->a:[Lkotlin/coroutines/Continuation;

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_4
    invoke-direct/range {p0 .. p0}, Lkotlinx/coroutines/flow/l;->F()J

    .line 79
    .line 80
    .line 81
    move-result-wide v7

    .line 82
    invoke-virtual/range {p0 .. p0}, Lti/a;->h()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-lez v4, :cond_5

    .line 87
    .line 88
    sub-long v11, v7, v2

    .line 89
    .line 90
    long-to-int v4, v11

    .line 91
    iget v11, v9, Lkotlinx/coroutines/flow/l;->u:I

    .line 92
    .line 93
    iget v12, v9, Lkotlinx/coroutines/flow/l;->o:I

    .line 94
    .line 95
    sub-int/2addr v12, v4

    .line 96
    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    goto :goto_1

    .line 101
    :cond_5
    iget v4, v9, Lkotlinx/coroutines/flow/l;->u:I

    .line 102
    .line 103
    :goto_1
    sget-object v11, Lti/b;->a:[Lkotlin/coroutines/Continuation;

    .line 104
    .line 105
    iget v12, v9, Lkotlinx/coroutines/flow/l;->u:I

    .line 106
    .line 107
    int-to-long v12, v12

    .line 108
    add-long/2addr v12, v7

    .line 109
    if-lez v4, :cond_a

    .line 110
    .line 111
    new-array v11, v4, [Lkotlin/coroutines/Continuation;

    .line 112
    .line 113
    iget-object v14, v9, Lkotlinx/coroutines/flow/l;->q:[Ljava/lang/Object;

    .line 114
    .line 115
    invoke-static {v14}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    move-wide v5, v7

    .line 119
    const/4 v15, 0x0

    .line 120
    :goto_2
    cmp-long v16, v7, v12

    .line 121
    .line 122
    if-gez v16, :cond_8

    .line 123
    .line 124
    invoke-static {v14, v7, v8}, Lkotlinx/coroutines/flow/m;->b([Ljava/lang/Object;J)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    move-wide/from16 v17, v2

    .line 129
    .line 130
    sget-object v2, Lkotlinx/coroutines/flow/m;->a:Lkotlinx/coroutines/internal/d0;

    .line 131
    .line 132
    if-eq v10, v2, :cond_7

    .line 133
    .line 134
    if-eqz v10, :cond_6

    .line 135
    .line 136
    check-cast v10, Lkotlinx/coroutines/flow/l$a;

    .line 137
    .line 138
    add-int/lit8 v3, v15, 0x1

    .line 139
    .line 140
    move-wide/from16 v19, v12

    .line 141
    .line 142
    iget-object v12, v10, Lkotlinx/coroutines/flow/l$a;->n:Lkotlin/coroutines/Continuation;

    .line 143
    .line 144
    aput-object v12, v11, v15

    .line 145
    .line 146
    invoke-static {v14, v7, v8, v2}, Lkotlinx/coroutines/flow/m;->c([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    iget-object v2, v10, Lkotlinx/coroutines/flow/l$a;->m:Ljava/lang/Object;

    .line 150
    .line 151
    invoke-static {v14, v5, v6, v2}, Lkotlinx/coroutines/flow/m;->c([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    const-wide/16 v12, 0x1

    .line 155
    .line 156
    add-long/2addr v5, v12

    .line 157
    if-ge v3, v4, :cond_9

    .line 158
    .line 159
    move v15, v3

    .line 160
    goto :goto_3

    .line 161
    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    .line 162
    .line 163
    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter"

    .line 164
    .line 165
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw v0

    .line 169
    :cond_7
    move-wide/from16 v19, v12

    .line 170
    .line 171
    const-wide/16 v12, 0x1

    .line 172
    .line 173
    :goto_3
    add-long/2addr v7, v12

    .line 174
    move-wide/from16 v2, v17

    .line 175
    .line 176
    move-wide/from16 v12, v19

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_8
    move-wide/from16 v17, v2

    .line 180
    .line 181
    move-wide/from16 v19, v12

    .line 182
    .line 183
    :cond_9
    move-wide v7, v5

    .line 184
    goto :goto_4

    .line 185
    :cond_a
    move-wide/from16 v17, v2

    .line 186
    .line 187
    move-wide/from16 v19, v12

    .line 188
    .line 189
    :goto_4
    sub-long v0, v7, v0

    .line 190
    .line 191
    long-to-int v0, v0

    .line 192
    invoke-virtual/range {p0 .. p0}, Lti/a;->h()I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-nez v1, :cond_b

    .line 197
    .line 198
    move-wide v3, v7

    .line 199
    goto :goto_5

    .line 200
    :cond_b
    move-wide/from16 v3, v17

    .line 201
    .line 202
    :goto_5
    iget-wide v1, v9, Lkotlinx/coroutines/flow/l;->r:J

    .line 203
    .line 204
    iget v5, v9, Lkotlinx/coroutines/flow/l;->n:I

    .line 205
    .line 206
    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    int-to-long v5, v0

    .line 211
    sub-long v5, v7, v5

    .line 212
    .line 213
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 214
    .line 215
    .line 216
    move-result-wide v0

    .line 217
    iget v2, v9, Lkotlinx/coroutines/flow/l;->o:I

    .line 218
    .line 219
    if-nez v2, :cond_c

    .line 220
    .line 221
    cmp-long v2, v0, v19

    .line 222
    .line 223
    if-gez v2, :cond_c

    .line 224
    .line 225
    iget-object v2, v9, Lkotlinx/coroutines/flow/l;->q:[Ljava/lang/Object;

    .line 226
    .line 227
    invoke-static {v2}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v2, v0, v1}, Lkotlinx/coroutines/flow/m;->b([Ljava/lang/Object;J)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    sget-object v5, Lkotlinx/coroutines/flow/m;->a:Lkotlinx/coroutines/internal/d0;

    .line 235
    .line 236
    invoke-static {v2, v5}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_c

    .line 241
    .line 242
    const-wide/16 v5, 0x1

    .line 243
    .line 244
    add-long/2addr v7, v5

    .line 245
    add-long/2addr v0, v5

    .line 246
    :cond_c
    move-wide v1, v0

    .line 247
    move-wide v5, v7

    .line 248
    move-object/from16 v0, p0

    .line 249
    .line 250
    move-wide/from16 v7, v19

    .line 251
    .line 252
    invoke-direct/range {v0 .. v8}, Lkotlinx/coroutines/flow/l;->R(JJJJ)V

    .line 253
    .line 254
    .line 255
    invoke-direct/range {p0 .. p0}, Lkotlinx/coroutines/flow/l;->v()V

    .line 256
    .line 257
    .line 258
    array-length v0, v11

    .line 259
    const/4 v1, 0x1

    .line 260
    if-nez v0, :cond_d

    .line 261
    .line 262
    move v10, v1

    .line 263
    goto :goto_6

    .line 264
    :cond_d
    const/4 v10, 0x0

    .line 265
    :goto_6
    xor-int/lit8 v0, v10, 0x1

    .line 266
    .line 267
    if-eqz v0, :cond_e

    .line 268
    .line 269
    invoke-direct {v9, v11}, Lkotlinx/coroutines/flow/l;->E([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;

    .line 270
    .line 271
    .line 272
    move-result-object v11

    .line 273
    :cond_e
    return-object v11
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
.end method

.method public final T()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lkotlinx/coroutines/flow/l;->r:J

    .line 2
    .line 3
    iget-wide v2, p0, Lkotlinx/coroutines/flow/l;->s:J

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-gez v2, :cond_0

    .line 8
    .line 9
    iput-wide v0, p0, Lkotlinx/coroutines/flow/l;->s:J

    .line 10
    .line 11
    :cond_0
    return-wide v0
    .line 12
    .line 13
    .line 14
    .line 15
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

.method public a(Lkotlin/coroutines/CoroutineContext;ILsi/e;)Lkotlinx/coroutines/flow/Flow;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/CoroutineContext;",
            "I",
            "Lsi/e;",
            ")",
            "Lkotlinx/coroutines/flow/Flow<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lkotlinx/coroutines/flow/m;->d(Lkotlinx/coroutines/flow/k;Lkotlin/coroutines/CoroutineContext;ILsi/e;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    return-object p1
.end method

.method public collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/FlowCollector<",
            "-TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lkotlinx/coroutines/flow/l;->w(Lkotlinx/coroutines/flow/l;Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e()Lti/c;
    .locals 1

    invoke-virtual {p0}, Lkotlinx/coroutines/flow/l;->y()Lkotlinx/coroutines/flow/n;

    move-result-object v0

    return-object v0
.end method

.method public emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lkotlinx/coroutines/flow/l;->B(Lkotlinx/coroutines/flow/l;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(I)[Lti/c;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/flow/l;->z(I)[Lkotlinx/coroutines/flow/n;

    move-result-object p1

    return-object p1
.end method

.method protected y()Lkotlinx/coroutines/flow/n;
    .locals 1

    new-instance v0, Lkotlinx/coroutines/flow/n;

    invoke-direct {v0}, Lkotlinx/coroutines/flow/n;-><init>()V

    return-object v0
.end method

.method protected z(I)[Lkotlinx/coroutines/flow/n;
    .locals 0

    new-array p1, p1, [Lkotlinx/coroutines/flow/n;

    return-object p1
.end method
