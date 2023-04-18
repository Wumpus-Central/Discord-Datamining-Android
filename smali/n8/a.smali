.class public final Ln8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln8/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ln8/f;Ln8/g;)Lcom/google/android/exoplayer2/upstream/i$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln8/f;",
            "Ln8/g;",
            ")",
            "Lcom/google/android/exoplayer2/upstream/i$a<",
            "Ln8/h;",
            ">;"
        }
    .end annotation

    new-instance v0, Ln8/i;

    invoke-direct {v0, p1, p2}, Ln8/i;-><init>(Ln8/f;Ln8/g;)V

    return-object v0
.end method

.method public b()Lcom/google/android/exoplayer2/upstream/i$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/exoplayer2/upstream/i$a<",
            "Ln8/h;",
            ">;"
        }
    .end annotation

    new-instance v0, Ln8/i;

    invoke-direct {v0}, Ln8/i;-><init>()V

    return-object v0
.end method
