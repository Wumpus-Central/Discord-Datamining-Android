.class final Loh/c$d;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Loh/f;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Loh/c$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Loh/c$d;

    invoke-direct {v0}, Loh/c$d;-><init>()V

    sput-object v0, Loh/c$d;->k:Loh/c$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Loh/f;)V
    .locals 1

    .line 1
    const-string v0, "$this$withOptions"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lkotlin/collections/u;->d()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Loh/f;->d(Ljava/util/Set;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Loh/b$b;->a:Loh/b$b;

    .line 14
    .line 15
    invoke-interface {p1, v0}, Loh/f;->l(Loh/b;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Loh/k;->l:Loh/k;

    .line 19
    .line 20
    invoke-interface {p1, v0}, Loh/f;->g(Loh/k;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Loh/f;

    invoke-virtual {p0, p1}, Loh/c$d;->a(Loh/f;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
