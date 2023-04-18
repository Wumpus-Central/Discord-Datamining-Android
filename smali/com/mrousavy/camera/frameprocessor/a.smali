.class public final Lcom/mrousavy/camera/frameprocessor/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R&\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\u0008\u0012\u0004\u0012\u00020\u000b`\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/mrousavy/camera/frameprocessor/a;",
        "",
        "Lcom/mrousavy/camera/frameprocessor/c;",
        "d",
        "",
        "e",
        "",
        "a",
        "I",
        "counter",
        "Ljava/util/ArrayList;",
        "",
        "Lkotlin/collections/ArrayList;",
        "b",
        "Ljava/util/ArrayList;",
        "performanceSamples",
        "f",
        "()D",
        "averageExecutionTimeSeconds",
        "<init>",
        "()V",
        "react-native-vision-camera_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/mrousavy/camera/frameprocessor/a;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
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

.method public static final synthetic a(Lcom/mrousavy/camera/frameprocessor/a;)I
    .locals 0

    iget p0, p0, Lcom/mrousavy/camera/frameprocessor/a;->a:I

    return p0
.end method

.method public static final synthetic b(Lcom/mrousavy/camera/frameprocessor/a;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/mrousavy/camera/frameprocessor/a;->b:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic c(Lcom/mrousavy/camera/frameprocessor/a;I)V
    .locals 0

    iput p1, p0, Lcom/mrousavy/camera/frameprocessor/a;->a:I

    return-void
.end method


# virtual methods
.method public final d()Lcom/mrousavy/camera/frameprocessor/c;
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    new-instance v2, Lcom/mrousavy/camera/frameprocessor/c;

    .line 6
    .line 7
    new-instance v3, Lcom/mrousavy/camera/frameprocessor/a$a;

    .line 8
    .line 9
    invoke-direct {v3, v0, v1, p0}, Lcom/mrousavy/camera/frameprocessor/a$a;-><init>(JLcom/mrousavy/camera/frameprocessor/a;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v2, v3}, Lcom/mrousavy/camera/frameprocessor/c;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 13
    .line 14
    .line 15
    return-object v2
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

.method public final e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/mrousavy/camera/frameprocessor/a;->a:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/mrousavy/camera/frameprocessor/a;->b:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
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
.end method

.method public final f()D
    .locals 2

    iget-object v0, p0, Lcom/mrousavy/camera/frameprocessor/a;->b:Ljava/util/ArrayList;

    invoke-static {v0}, Lkotlin/collections/h;->L(Ljava/lang/Iterable;)D

    move-result-wide v0

    return-wide v0
.end method
