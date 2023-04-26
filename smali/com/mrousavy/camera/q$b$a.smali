.class final Lcom/mrousavy/camera/q$b$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrousavy/camera/q$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/CoroutineScope;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/e;
    c = "com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2$1"
    f = "CameraView+TakeSnapshot.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field k:I

.field final synthetic l:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic m:Lcom/mrousavy/camera/CameraView;

.field final synthetic n:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/exifinterface/media/a;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic o:Landroid/graphics/Bitmap;

.field final synthetic p:I


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/mrousavy/camera/CameraView;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;ILkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/io/File;",
            ">;",
            "Lcom/mrousavy/camera/CameraView;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/exifinterface/media/a;",
            ">;",
            "Landroid/graphics/Bitmap;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/mrousavy/camera/q$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/mrousavy/camera/q$b$a;->l:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lcom/mrousavy/camera/q$b$a;->m:Lcom/mrousavy/camera/CameraView;

    iput-object p3, p0, Lcom/mrousavy/camera/q$b$a;->n:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p4, p0, Lcom/mrousavy/camera/q$b$a;->o:Landroid/graphics/Bitmap;

    iput p5, p0, Lcom/mrousavy/camera/q$b$a;->p:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/mrousavy/camera/q$b$a;

    iget-object v1, p0, Lcom/mrousavy/camera/q$b$a;->l:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, p0, Lcom/mrousavy/camera/q$b$a;->m:Lcom/mrousavy/camera/CameraView;

    iget-object v3, p0, Lcom/mrousavy/camera/q$b$a;->n:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v4, p0, Lcom/mrousavy/camera/q$b$a;->o:Landroid/graphics/Bitmap;

    iget v5, p0, Lcom/mrousavy/camera/q$b$a;->p:I

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/mrousavy/camera/q$b$a;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/mrousavy/camera/CameraView;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;ILkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/mrousavy/camera/q$b$a;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/mrousavy/camera/q$b$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/mrousavy/camera/q$b$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/mrousavy/camera/q$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/mrousavy/camera/q$b$a;->k:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/mrousavy/camera/q$b$a;->l:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/mrousavy/camera/q$b$a;->m:Lcom/mrousavy/camera/CameraView;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "mrousavy"

    .line 24
    .line 25
    const-string v2, ".jpg"

    .line 26
    .line 27
    invoke-static {v1, v2, v0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/io/File;->deleteOnExit()V

    .line 32
    .line 33
    .line 34
    const-string v1, "createTempFile(\"mrousavy\u2026.apply { deleteOnExit() }"

    .line 35
    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 40
    .line 41
    new-instance p1, Ljava/io/FileOutputStream;

    .line 42
    .line 43
    iget-object v0, p0, Lcom/mrousavy/camera/q$b$a;->l:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 44
    .line 45
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/io/File;

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/mrousavy/camera/q$b$a;->o:Landroid/graphics/Bitmap;

    .line 53
    .line 54
    iget v1, p0, Lcom/mrousavy/camera/q$b$a;->p:I

    .line 55
    .line 56
    :try_start_0
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 57
    .line 58
    invoke-virtual {v0, v2, v1, p1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-static {p1, v0}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lcom/mrousavy/camera/q$b$a;->n:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 66
    .line 67
    new-instance v0, Landroidx/exifinterface/media/a;

    .line 68
    .line 69
    iget-object v1, p0, Lcom/mrousavy/camera/q$b$a;->l:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 70
    .line 71
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Ljava/io/File;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Landroidx/exifinterface/media/a;-><init>(Ljava/io/File;)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 79
    .line 80
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p1

    .line 83
    :catchall_0
    move-exception v0

    .line 84
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 85
    :catchall_1
    move-exception v1

    .line 86
    invoke-static {p1, v0}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    throw v1

    .line 90
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 93
    .line 94
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1
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
.end method
