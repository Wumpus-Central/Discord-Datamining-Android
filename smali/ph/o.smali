.class public final Lph/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmg/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmg/g0<",
            "Lph/n;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmg/g0;

    const-string v1, "ResolutionAnchorProvider"

    invoke-direct {v0, v1}, Lmg/g0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lph/o;->a:Lmg/g0;

    return-void
.end method

.method public static final a(Lmg/h0;)Lmg/h0;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lph/o;->a:Lmg/g0;

    .line 7
    .line 8
    invoke-interface {p0, v0}, Lmg/h0;->w(Lmg/g0;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lph/n;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0, p0}, Lph/n;->a(Lmg/h0;)Lmg/h0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    :goto_0
    return-object p0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
