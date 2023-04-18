.class Lcom/facebook/imagepipeline/producers/h0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/NetworkFetcher$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/h0;->b(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/imagepipeline/producers/FetchState;

.field final synthetic b:Lcom/facebook/imagepipeline/producers/h0;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/h0;Lcom/facebook/imagepipeline/producers/FetchState;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/h0$a;->b:Lcom/facebook/imagepipeline/producers/h0;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/h0$a;->a:Lcom/facebook/imagepipeline/producers/FetchState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/h0$a;->b:Lcom/facebook/imagepipeline/producers/h0;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/h0$a;->a:Lcom/facebook/imagepipeline/producers/FetchState;

    invoke-static {v0, v1}, Lcom/facebook/imagepipeline/producers/h0;->d(Lcom/facebook/imagepipeline/producers/h0;Lcom/facebook/imagepipeline/producers/FetchState;)V

    return-void
.end method

.method public b(Ljava/io/InputStream;I)V
    .locals 2

    .line 1
    invoke-static {}, Lz5/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "NetworkFetcher->onResponse"

    .line 8
    .line 9
    invoke-static {v0}, Lz5/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/h0$a;->b:Lcom/facebook/imagepipeline/producers/h0;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/h0$a;->a:Lcom/facebook/imagepipeline/producers/FetchState;

    .line 15
    .line 16
    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/imagepipeline/producers/h0;->m(Lcom/facebook/imagepipeline/producers/FetchState;Ljava/io/InputStream;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lz5/b;->d()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-static {}, Lz5/b;->b()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
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

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/h0$a;->b:Lcom/facebook/imagepipeline/producers/h0;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/h0$a;->a:Lcom/facebook/imagepipeline/producers/FetchState;

    invoke-static {v0, v1, p1}, Lcom/facebook/imagepipeline/producers/h0;->c(Lcom/facebook/imagepipeline/producers/h0;Lcom/facebook/imagepipeline/producers/FetchState;Ljava/lang/Throwable;)V

    return-void
.end method
