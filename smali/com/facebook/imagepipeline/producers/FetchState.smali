.class public Lcom/facebook/imagepipeline/producers/FetchState;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/facebook/imagepipeline/producers/Consumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/producers/Consumer<",
            "Lu5/e;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/imagepipeline/producers/ProducerContext;

.field private c:J

.field private d:I

.field private e:Lcom/facebook/imagepipeline/common/BytesRange;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/Consumer<",
            "Lu5/e;",
            ">;",
            "Lcom/facebook/imagepipeline/producers/ProducerContext;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/FetchState;->a:Lcom/facebook/imagepipeline/producers/Consumer;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/FetchState;->b:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 7
    .line 8
    const-wide/16 p1, 0x0

    .line 9
    .line 10
    iput-wide p1, p0, Lcom/facebook/imagepipeline/producers/FetchState;->c:J

    .line 11
    .line 12
    return-void
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
.end method


# virtual methods
.method public a()Lcom/facebook/imagepipeline/producers/Consumer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/Consumer<",
            "Lu5/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/FetchState;->a:Lcom/facebook/imagepipeline/producers/Consumer;

    return-object v0
.end method

.method public b()Lcom/facebook/imagepipeline/producers/ProducerContext;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/FetchState;->b:Lcom/facebook/imagepipeline/producers/ProducerContext;

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/imagepipeline/producers/FetchState;->c:J

    return-wide v0
.end method

.method public d()Lcom/facebook/imagepipeline/producers/n0;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/FetchState;->b:Lcom/facebook/imagepipeline/producers/ProducerContext;

    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/ProducerContext;->n()Lcom/facebook/imagepipeline/producers/n0;

    move-result-object v0

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/facebook/imagepipeline/producers/FetchState;->d:I

    return v0
.end method

.method public f()Lcom/facebook/imagepipeline/common/BytesRange;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/FetchState;->e:Lcom/facebook/imagepipeline/common/BytesRange;

    return-object v0
.end method

.method public g()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/FetchState;->b:Lcom/facebook/imagepipeline/producers/ProducerContext;

    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/ProducerContext;->d()Lcom/facebook/imagepipeline/request/ImageRequest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/imagepipeline/request/ImageRequest;->getSourceUri()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public h(J)V
    .locals 0

    iput-wide p1, p0, Lcom/facebook/imagepipeline/producers/FetchState;->c:J

    return-void
.end method

.method public i(I)V
    .locals 0

    iput p1, p0, Lcom/facebook/imagepipeline/producers/FetchState;->d:I

    return-void
.end method

.method public j(Lcom/facebook/imagepipeline/common/BytesRange;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/FetchState;->e:Lcom/facebook/imagepipeline/common/BytesRange;

    return-void
.end method
