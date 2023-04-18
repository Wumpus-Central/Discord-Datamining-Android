.class public abstract Lrh/k;
.super Lrh/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrh/k$a;,
        Lrh/k$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lrh/g<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lrh/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrh/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrh/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrh/k;->b:Lrh/k$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-direct {p0, v0}, Lrh/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lrh/k;->c()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public c()Lkotlin/Unit;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
