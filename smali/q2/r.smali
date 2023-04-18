.class public Lq2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq2/n0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq2/n0<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lq2/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq2/r;

    invoke-direct {v0}, Lq2/r;-><init>()V

    sput-object v0, Lq2/r;->a:Lq2/r;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lr2/c;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lq2/r;->b(Lr2/c;F)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public b(Lr2/c;F)Ljava/lang/Integer;
    .locals 0

    invoke-static {p1}, Lq2/s;->g(Lr2/c;)F

    move-result p1

    mul-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
