.class public final Lrg/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/k$a;
    }
.end annotation


# static fields
.field public static final c:Lrg/k$a;


# instance fields
.field private final a:Lzh/k;

.field private final b:Lrg/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrg/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrg/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrg/k;->c:Lrg/k$a;

    return-void
.end method

.method private constructor <init>(Lzh/k;Lrg/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lrg/k;->a:Lzh/k;

    .line 3
    iput-object p2, p0, Lrg/k;->b:Lrg/a;

    return-void
.end method

.method public synthetic constructor <init>(Lzh/k;Lrg/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lrg/k;-><init>(Lzh/k;Lrg/a;)V

    return-void
.end method


# virtual methods
.method public final a()Lzh/k;
    .locals 1

    iget-object v0, p0, Lrg/k;->a:Lzh/k;

    return-object v0
.end method

.method public final b()Lmg/h0;
    .locals 1

    iget-object v0, p0, Lrg/k;->a:Lzh/k;

    invoke-virtual {v0}, Lzh/k;->p()Lmg/h0;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lrg/a;
    .locals 1

    iget-object v0, p0, Lrg/k;->b:Lrg/a;

    return-object v0
.end method
