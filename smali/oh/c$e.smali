.class final Loh/c$e;
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
.field public static final k:Loh/c$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Loh/c$e;

    invoke-direct {v0}, Loh/c$e;-><init>()V

    sput-object v0, Loh/c$e;->k:Loh/c$e;

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
    const/4 v0, 0x1

    .line 7
    invoke-interface {p1, v0}, Loh/f;->i(Z)V

    .line 8
    .line 9
    .line 10
    sget-object v0, Loh/b$a;->a:Loh/b$a;

    .line 11
    .line 12
    invoke-interface {p1, v0}, Loh/f;->l(Loh/b;)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Loh/e;->n:Ljava/util/Set;

    .line 16
    .line 17
    invoke-interface {p1, v0}, Loh/f;->d(Ljava/util/Set;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Loh/f;

    invoke-virtual {p0, p1}, Loh/c$e;->a(Loh/f;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
