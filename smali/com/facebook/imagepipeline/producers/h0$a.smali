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
    invoke-static {}, La6/b;->d()Z

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
    invoke-static {v0}, La6/b;->a(Ljava/lang/String;)V

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
    invoke-static {}, La6/b;->d()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-static {}, La6/b;->b()V

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
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/h0$a;->b:Lcom/facebook/imagepipeline/producers/h0;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/h0$a;->a:Lcom/facebook/imagepipeline/producers/FetchState;

    invoke-static {v0, v1, p1}, Lcom/facebook/imagepipeline/producers/h0;->c(Lcom/facebook/imagepipeline/producers/h0;Lcom/facebook/imagepipeline/producers/FetchState;Ljava/lang/Throwable;)V

    return-void
.end method
