.class public final Lh8/u$a;
.super Lh8/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh8/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Lh8/s;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lh8/s;-><init>(Lh8/s;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh8/s;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;IIJ)V
    .locals 0

    .line 3
    invoke-direct/range {p0 .. p5}, Lh8/s;-><init>(Ljava/lang/Object;IIJ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lh8/s;-><init>(Ljava/lang/Object;JI)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)Lh8/u$a;
    .locals 1

    new-instance v0, Lh8/u$a;

    invoke-super {p0, p1}, Lh8/s;->a(Ljava/lang/Object;)Lh8/s;

    move-result-object p1

    invoke-direct {v0, p1}, Lh8/u$a;-><init>(Lh8/s;)V

    return-object v0
.end method
