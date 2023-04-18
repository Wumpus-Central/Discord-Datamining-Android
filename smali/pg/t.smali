.class public abstract Lpg/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmg/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/t$a;
    }
.end annotation


# static fields
.field public static final k:Lpg/t$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpg/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpg/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpg/t;->k:Lpg/t$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract G(Ldi/n1;Lei/g;)Lwh/h;
.end method

.method public bridge synthetic a()Lmg/h;
    .locals 1

    .line 1
    invoke-interface {p0}, Lmg/e;->a()Lmg/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lmg/m;
    .locals 1

    .line 2
    invoke-interface {p0}, Lmg/e;->a()Lmg/e;

    move-result-object v0

    return-object v0
.end method

.method protected abstract c0(Lei/g;)Lwh/h;
.end method
