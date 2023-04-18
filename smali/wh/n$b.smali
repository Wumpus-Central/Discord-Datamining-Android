.class final Lwh/n$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwh/n;->f(Lwh/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lmg/a;",
        "Lmg/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Lwh/n$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwh/n$b;

    invoke-direct {v0}, Lwh/n$b;-><init>()V

    sput-object v0, Lwh/n$b;->k:Lwh/n$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lmg/a;)Lmg/a;
    .locals 1

    const-string v0, "$this$selectMostSpecificInEachOverridableGroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmg/a;

    invoke-virtual {p0, p1}, Lwh/n$b;->a(Lmg/a;)Lmg/a;

    move-result-object p1

    return-object p1
.end method
