.class public Lcom/facebook/imagepipeline/producers/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/l0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/m$b;,
        Lcom/facebook/imagepipeline/producers/m$a;,
        Lcom/facebook/imagepipeline/producers/m$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/imagepipeline/producers/l0<",
        "Lcom/facebook/common/references/CloseableReference<",
        "Lv5/c;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Lz3/a;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Lt5/c;

.field private final d:Lt5/e;

.field private final e:Lcom/facebook/imagepipeline/producers/l0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lv5/e;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Z

.field private final g:Z

.field private final h:Z

.field private final i:I

.field private final j:Lr5/a;

.field private final k:Ljava/lang/Runnable;

.field private final l:Lcom/facebook/common/internal/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/internal/Supplier<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lz3/a;Ljava/util/concurrent/Executor;Lt5/c;Lt5/e;ZZZLcom/facebook/imagepipeline/producers/l0;ILr5/a;Ljava/lang/Runnable;Lcom/facebook/common/internal/Supplier;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz3/a;",
            "Ljava/util/concurrent/Executor;",
            "Lt5/c;",
            "Lt5/e;",
            "ZZZ",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lv5/e;",
            ">;I",
            "Lr5/a;",
            "Ljava/lang/Runnable;",
            "Lcom/facebook/common/internal/Supplier<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lw3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lz3/a;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m;->a:Lz3/a;

    .line 11
    .line 12
    invoke-static {p2}, Lw3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m;->b:Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    invoke-static {p3}, Lw3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lt5/c;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m;->c:Lt5/c;

    .line 27
    .line 28
    invoke-static {p4}, Lw3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lt5/e;

    .line 33
    .line 34
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m;->d:Lt5/e;

    .line 35
    .line 36
    iput-boolean p5, p0, Lcom/facebook/imagepipeline/producers/m;->f:Z

    .line 37
    .line 38
    iput-boolean p6, p0, Lcom/facebook/imagepipeline/producers/m;->g:Z

    .line 39
    .line 40
    invoke-static {p8}, Lw3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lcom/facebook/imagepipeline/producers/l0;

    .line 45
    .line 46
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m;->e:Lcom/facebook/imagepipeline/producers/l0;

    .line 47
    .line 48
    iput-boolean p7, p0, Lcom/facebook/imagepipeline/producers/m;->h:Z

    .line 49
    .line 50
    iput p9, p0, Lcom/facebook/imagepipeline/producers/m;->i:I

    .line 51
    .line 52
    iput-object p10, p0, Lcom/facebook/imagepipeline/producers/m;->j:Lr5/a;

    .line 53
    .line 54
    iput-object p11, p0, Lcom/facebook/imagepipeline/producers/m;->k:Ljava/lang/Runnable;

    .line 55
    .line 56
    iput-object p12, p0, Lcom/facebook/imagepipeline/producers/m;->l:Lcom/facebook/common/internal/Supplier;

    .line 57
    .line 58
    return-void
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
.end method

.method static synthetic c(Lcom/facebook/imagepipeline/producers/m;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/imagepipeline/producers/m;->f:Z

    return p0
.end method

.method static synthetic d(Lcom/facebook/imagepipeline/producers/m;)Lt5/c;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/m;->c:Lt5/c;

    return-object p0
.end method

.method static synthetic e(Lcom/facebook/imagepipeline/producers/m;)Lr5/a;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/m;->j:Lr5/a;

    return-object p0
.end method

.method static synthetic f(Lcom/facebook/imagepipeline/producers/m;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/imagepipeline/producers/m;->g:Z

    return p0
.end method

.method static synthetic g(Lcom/facebook/imagepipeline/producers/m;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/m;->b:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static synthetic h(Lcom/facebook/imagepipeline/producers/m;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/m;->k:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic i(Lcom/facebook/imagepipeline/producers/m;)Lcom/facebook/common/internal/Supplier;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/m;->l:Lcom/facebook/common/internal/Supplier;

    return-object p0
.end method


# virtual methods
.method public b(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/Consumer<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lv5/c;",
            ">;>;",
            "Lcom/facebook/imagepipeline/producers/ProducerContext;",
            ")V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, La6/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DecodeProducer#produceResults"

    .line 8
    .line 9
    invoke-static {v0}, La6/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/ProducerContext;->l()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/request/ImageRequest;->getSourceUri()Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Le4/f;->m(Landroid/net/Uri;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    new-instance v0, Lcom/facebook/imagepipeline/producers/m$a;

    .line 27
    .line 28
    iget-boolean v5, p0, Lcom/facebook/imagepipeline/producers/m;->h:Z

    .line 29
    .line 30
    iget v6, p0, Lcom/facebook/imagepipeline/producers/m;->i:I

    .line 31
    .line 32
    move-object v1, v0

    .line 33
    move-object v2, p0

    .line 34
    move-object v3, p1

    .line 35
    move-object v4, p2

    .line 36
    invoke-direct/range {v1 .. v6}, Lcom/facebook/imagepipeline/producers/m$a;-><init>(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;ZI)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    new-instance v4, Lt5/f;

    .line 41
    .line 42
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m;->a:Lz3/a;

    .line 43
    .line 44
    invoke-direct {v4, v0}, Lt5/f;-><init>(Lz3/a;)V

    .line 45
    .line 46
    .line 47
    new-instance v8, Lcom/facebook/imagepipeline/producers/m$b;

    .line 48
    .line 49
    iget-object v5, p0, Lcom/facebook/imagepipeline/producers/m;->d:Lt5/e;

    .line 50
    .line 51
    iget-boolean v6, p0, Lcom/facebook/imagepipeline/producers/m;->h:Z

    .line 52
    .line 53
    iget v7, p0, Lcom/facebook/imagepipeline/producers/m;->i:I

    .line 54
    .line 55
    move-object v0, v8

    .line 56
    move-object v1, p0

    .line 57
    move-object v2, p1

    .line 58
    move-object v3, p2

    .line 59
    invoke-direct/range {v0 .. v7}, Lcom/facebook/imagepipeline/producers/m$b;-><init>(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;Lt5/f;Lt5/e;ZI)V

    .line 60
    .line 61
    .line 62
    move-object v0, v8

    .line 63
    :goto_0
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/m;->e:Lcom/facebook/imagepipeline/producers/l0;

    .line 64
    .line 65
    invoke-interface {p1, v0, p2}, Lcom/facebook/imagepipeline/producers/l0;->b(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    invoke-static {}, La6/b;->d()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    invoke-static {}, La6/b;->b()V

    .line 75
    .line 76
    .line 77
    :cond_2
    return-void

    .line 78
    :catchall_0
    move-exception p1

    .line 79
    invoke-static {}, La6/b;->d()Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-eqz p2, :cond_3

    .line 84
    .line 85
    invoke-static {}, La6/b;->b()V

    .line 86
    .line 87
    .line 88
    :cond_3
    throw p1
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
.end method
