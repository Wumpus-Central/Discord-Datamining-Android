.class final Lzg/j$m;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg/j;->L(Ljava/util/Set;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lmg/z0;",
        "Lmg/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Lzg/j$m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzg/j$m;

    invoke-direct {v0}, Lzg/j$m;-><init>()V

    sput-object v0, Lzg/j$m;->k:Lzg/j$m;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lmg/z0;)Lmg/a;
    .locals 1

    const-string v0, "$this$selectMostSpecificInEachOverridableGroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmg/z0;

    invoke-virtual {p0, p1}, Lzg/j$m;->a(Lmg/z0;)Lmg/a;

    move-result-object p1

    return-object p1
.end method
