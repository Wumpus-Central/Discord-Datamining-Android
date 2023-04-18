.class public Lw/y1;
.super Lw/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lw/o2<",
        "TT;>;"
    }
.end annotation


# direct methods
.method private constructor <init>(Ljava/lang/Object;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lw/o2;-><init>(Ljava/lang/Object;Z)V

    return-void
.end method

.method public static i(Ljava/lang/Object;)Lw/y1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lw/y1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lw/y1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw/y1;-><init>(Ljava/lang/Object;Z)V

    return-object v0
.end method


# virtual methods
.method public h(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lw/o2;->f(Ljava/lang/Object;)V

    return-void
.end method
