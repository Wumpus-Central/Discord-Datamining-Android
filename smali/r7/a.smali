.class final Lr7/a;
.super Ll7/e;
.source "SourceFile"

# interfaces
.implements Lr7/g;


# direct methods
.method public constructor <init>(JJLf7/l0$a;)V
    .locals 7

    iget v5, p5, Lf7/l0$a;->f:I

    iget v6, p5, Lf7/l0$a;->c:I

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    invoke-direct/range {v0 .. v6}, Ll7/e;-><init>(JJII)V

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 0

    invoke-virtual {p0, p1, p2}, Ll7/e;->c(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public d()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method
