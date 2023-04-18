.class public final Ljg/e;
.super Ljg/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljg/e$a;
    }
.end annotation


# static fields
.field public static final h:Ljg/e$a;

.field private static final i:Ljg/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljg/e$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljg/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ljg/e;->h:Ljg/e$a;

    .line 8
    .line 9
    new-instance v0, Ljg/e;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v0, v2, v3, v1}, Ljg/e;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Ljg/e;->i:Ljg/e;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public constructor <init>(Z)V
    .locals 2

    .line 1
    new-instance v0, Lci/f;

    const-string v1, "DefaultBuiltIns"

    invoke-direct {v0, v1}, Lci/f;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ljg/h;-><init>(Lci/n;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Ljg/h;->f(Z)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Ljg/e;-><init>(Z)V

    return-void
.end method

.method public static final synthetic E0()Ljg/e;
    .locals 1

    sget-object v0, Ljg/e;->i:Ljg/e;

    return-object v0
.end method
